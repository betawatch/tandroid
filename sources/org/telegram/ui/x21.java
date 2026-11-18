package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class x21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y21 b;

    public /* synthetic */ x21(y21 y21Var, int i7) {
        this.a = i7;
        this.b = y21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String sb2;
        int i7 = this.a;
        y21 y21Var = this.b;
        switch (i7) {
            case 0:
                String str = y21Var.b.text;
                if (str == null || !str.equals("AUTH_TOKEN_EXCEPTION")) {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.ui.Cells.c0.u(null, 2131751094, sb3, "\n");
                    sb3.append(y21Var.b.text);
                    sb2 = sb3.toString();
                } else {
                    sb2 = org.telegram.messenger.gd.M0(2131754709, null);
                }
                org.telegram.ui.Components.b5.r0(y21Var.c, org.telegram.messenger.gd.M0(2131753892, null), sb2, null);
                break;
            default:
                org.telegram.ui.Components.b5.r0(y21Var.c, org.telegram.messenger.gd.M0(2131753892, null), org.telegram.messenger.gd.M0(2131751094, null), null);
                break;
        }
    }
}
