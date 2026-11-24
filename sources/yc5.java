// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class yc5 extends q59 {
    public final Context c;
    public final /* synthetic */ zc5 d;

    public yc5(zc5 zc5Var, Context context) {
        this.d = zc5Var;
        this.c = context;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int b = u69Var.b();
        zc5 zc5Var = this.d;
        return b == zc5Var.r || b == zc5Var.n || b == zc5Var.s || b == 0;
    }

    @Override // y59
    public final int b() {
        zc5 zc5Var = this.d;
        if (zc5Var.e) {
            return 0;
        }
        return zc5Var.x;
    }

    @Override // y59
    public final int d(int i) {
        zc5 zc5Var = this.d;
        if (i == zc5Var.n || i == zc5Var.s || i == zc5Var.r) {
            return 0;
        }
        if (i == zc5Var.w || i == zc5Var.h) {
            return 1;
        }
        return i == 0 ? 2 : 0;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        int i2 = u69Var.f;
        View view = u69Var.a;
        zc5 zc5Var = this.d;
        if (i2 == 0) {
            vkb vkbVar = (vkb) view;
            if (i == zc5Var.n) {
                vkbVar.b(jb6.M0(2131751699, null), true);
                return;
            } else if (i == zc5Var.s) {
                vkbVar.b(jb6.M0(2131745192, null), false);
                return;
            } else {
                if (i == zc5Var.r) {
                    vkbVar.b(jb6.M0(2131745756, null), true);
                    return;
                }
                return;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                wib wibVar = (wib) view;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = zc5Var.f;
                wibVar.a.setText(tL_chatInviteExported != null ? tL_chatInviteExported.link : "error");
                wibVar.setWillNotDraw(true);
                return;
            }
            return;
        }
        njb njbVar = (njb) view;
        if (i == zc5Var.w) {
            njbVar.setText("");
            return;
        }
        if (i == zc5Var.h) {
            TLRPC.Chat L0 = zc5Var.getMessagesController().L0(Long.valueOf(zc5Var.d));
            if (!sd2.T(L0) || L0.megagroup) {
                njbVar.setText(jb6.M0(2131748668, null));
            } else {
                njbVar.setText(jb6.M0(2131752330, null));
            }
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i == 0) {
            FrameLayout vkbVar = new vkb(context);
            anb.h(cmb.c6, null, vkbVar);
            frameLayout = vkbVar;
        } else if (i != 1) {
            wib wibVar = new wib(context);
            TextView textView = new TextView(context);
            wibVar.a = textView;
            anb.X(textView, cmb.F6, null);
            textView.setTextSize(1, 16.0f);
            textView.setGravity((jb6.a0 ? 5 : 3) | 16);
            wibVar.addView(textView, qoe.d(-1, -2.0f, (jb6.a0 ? 5 : 3) | 48, 23.0f, 10.0f, 23.0f, 10.0f));
            anb.h(cmb.c6, null, wibVar);
            frameLayout = wibVar;
        } else {
            frameLayout = new njb(context);
        }
        return new b59(frameLayout);
    }
}
