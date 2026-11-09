package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                    org.telegram.messenger.camera.q.q(null, 2131751105, sb3, "\n");
                    sb3.append(z21Var.b.text);
                    sb2 = sb3.toString();
                } else {
                    sb2 = org.telegram.messenger.id.M0(2131754709, null);
                }
                org.telegram.ui.Components.v4.r0(z21Var.c, org.telegram.messenger.id.M0(2131753894, null), sb2, null);
                break;
            default:
                org.telegram.ui.Components.v4.r0(z21Var.c, org.telegram.messenger.id.M0(2131753894, null), org.telegram.messenger.id.M0(2131751105, null), null);
                break;
        }
    }
}
