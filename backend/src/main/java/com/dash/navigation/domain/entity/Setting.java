package com.dash.navigation.domain.entity;

import java.io.Serial;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/**
 * Setting.
 *
 * @author Jason.liu
 * @date 2024-02-04
 */
@Entity
@Getter
@Setter
@Accessors(chain = true)
@Table(name = "T_SETTING")
@DynamicInsert
@DynamicUpdate
public class Setting implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "C_ID", length = 32)
    private String id;

    @Column(name = "C_NGINX_OPEN")
    private Boolean nginxOpen;

    @Column(name = "C_NGINX_URL", length = 200)
    private String nginxUrl;

    @Column(name = "C_NAV_NAME", length = 200)
    private String navName;

    @Column(name = "N_CUTOVER_SPEED")
    private Integer cutOverSpeed;

    @Column(name = "C_LOGO_PATH", length = 400)
    private String logoPath;

    @Column(name = "C_LOGO_TO_FAVICON")
    private Boolean logoToFavicon;

    @Column(name = "C_LAYOUTSIZE", length = 50)
    private String layoutSize;
}
