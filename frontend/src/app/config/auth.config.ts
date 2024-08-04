import { PassedInitialConfig } from 'angular-auth-oidc-client';

export const authConfig: PassedInitialConfig = {
  config: {
    authority: 'http://keycloak.default.svc.cluster.local:8080/realms/spring-microservices-security-realm',
    redirectUrl: window.location.origin,
    postLogoutRedirectUri: window.location.origin,
    clientId: 'angular-client',
    scope: 'openid profile offline_access',
    responseType: 'code',
    silentRenew: true,
    useRefreshToken: true,
    renewTimeBeforeTokenExpiresInSeconds: 30,
  }
}
