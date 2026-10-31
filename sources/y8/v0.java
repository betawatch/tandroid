package y8;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class v0 extends a {
    public b8.e b;

    @Override // y8.a, y8.d0
    public final void s0(r0 r0Var) {
        String str;
        int i10 = r0Var.a;
        switch (i10) {
            case 4000:
                str = "TARGET_NODE_NOT_CONNECTED";
                break;
            case 4001:
                str = "DUPLICATE_LISTENER";
                break;
            case 4002:
                str = "UNKNOWN_LISTENER";
                break;
            case 4003:
                str = "DATA_ITEM_TOO_LARGE";
                break;
            case 4004:
                str = "INVALID_TARGET_NODE";
                break;
            case 4005:
                str = "ASSET_UNAVAILABLE";
                break;
            case 4006:
                str = "DUPLICATE_CAPABILITY";
                break;
            case 4007:
                str = "UNKNOWN_CAPABILITY";
                break;
            case 4008:
                str = "WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED";
                break;
            case 4009:
                str = "UNSUPPORTED_BY_TARGET";
                break;
            case 4010:
                str = "ACCOUNT_KEY_CREATION_FAILED";
                break;
            default:
                str = x8.c.a(i10);
                break;
        }
        g0 g0Var = new g0(new Status(i10, str, null, null), r0Var.b);
        b8.e eVar = this.b;
        if (eVar != null) {
            eVar.a(g0Var);
            this.b = null;
        }
    }
}
