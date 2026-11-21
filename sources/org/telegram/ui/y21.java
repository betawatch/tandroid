package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z21 b;

    public /* synthetic */ y21(z21 z21Var, int i7) {
        this.a = i7;
        this.b = z21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String sb2;
        int i7 = this.a;
        z21 z21Var = this.b;
        switch (i7) {
            case 0:
                String str = z21Var.b.text;
                if (str == null || !str.equals("AUTH_TOKEN_EXCEPTION")) {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.ui.Cells.c0.u(null, 2131751093, sb3, "\n");
                    sb3.append(z21Var.b.text);
                    sb2 = sb3.toString();
                } else {
                    sb2 = org.telegram.messenger.gd.N0(2131754708, null);
                }
                org.telegram.ui.Components.c5.r0(z21Var.c, org.telegram.messenger.gd.N0(2131753891, null), sb2, null);
                break;
            default:
                org.telegram.ui.Components.c5.r0(z21Var.c, org.telegram.messenger.gd.N0(2131753891, null), org.telegram.messenger.gd.N0(2131751093, null), null);
                break;
        }
    }
}
