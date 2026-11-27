// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class un8 extends c79 {
    public final Context c;
    public final /* synthetic */ vn8 d;

    public un8(vn8 vn8Var, Context context) {
        this.d = vn8Var;
        this.c = context;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        return i == 0 || i == 2 || i == 4;
    }

    @Override // j79
    public final int b() {
        return this.d.e;
    }

    @Override // j79
    public final int d(int i) {
        vn8 vn8Var = this.d;
        if (i == vn8Var.x) {
            return 4;
        }
        if (i == vn8Var.n) {
            return 3;
        }
        if (i == vn8Var.f) {
            return 2;
        }
        return (i == vn8Var.h || i == vn8Var.w) ? 1 : 0;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        String M0;
        vn8 vn8Var = this.d;
        boolean z = vn8Var.E;
        int i2 = f89Var.f;
        View view = f89Var.a;
        if (i2 == 0) {
            lj6 lj6Var = (lj6) view;
            if (!z) {
                throw null;
            }
            long keyAt = vn8Var.getMessagesController().x0.keyAt(i - vn8Var.r);
            lj6Var.setTag(Long.valueOf(keyAt));
            if (keyAt <= 0) {
                TLRPC.Chat M02 = vn8Var.getMessagesController().M0(Long.valueOf(-keyAt));
                if (M02 != null) {
                    int i3 = M02.participants_count;
                    lj6Var.c(M02, null, i3 != 0 ? ob6.G(i3, "Members", new Object[0]) : M02.has_geo ? ob6.M0(2131748396, null) : !xc2.t0(M02) ? ob6.M0(2131748395, null) : ob6.M0(2131748392, null), i != vn8Var.s - 1);
                    return;
                }
                return;
            }
            TLRPC.User X1 = vn8Var.getMessagesController().X1(Long.valueOf(keyAt));
            if (X1 != null) {
                if (X1.bot) {
                    M0 = ob6.M0(2131753149, null).substring(0, 1).toUpperCase() + ob6.M0(2131753149, null).substring(1);
                } else {
                    String str = X1.phone;
                    M0 = (str == null || str.length() == 0) ? ob6.M0(2131747559, null) : xnb.k(new StringBuilder("+"), X1.phone, f78.f());
                }
                lj6Var.c(X1, null, M0, i != vn8Var.s - 1);
                return;
            }
            return;
        }
        if (i2 == 1) {
            ilb ilbVar = (ilb) view;
            if (i != vn8Var.h) {
                if (i == vn8Var.w) {
                    ilbVar.setFixedSize(12);
                    ilbVar.setText("");
                    return;
                }
                return;
            }
            if (z) {
                ilbVar.setFixedSize(0);
                ilbVar.setText(ob6.M0(2131753670, null));
                return;
            } else {
                ilbVar.setFixedSize(8);
                ilbVar.setText(null);
                return;
            }
        }
        if (i2 == 2) {
            ij6 ij6Var = (ij6) view;
            ij6Var.a(aob.v6, aob.u6);
            if (z) {
                ij6Var.b(R.drawable.msg_contact_add, 5, ob6.M0(2131753685, null), false);
                return;
            } else {
                ob6.M0(2131746597, null);
                throw null;
            }
        }
        if (i2 == 3) {
            mf5 mf5Var = (mf5) view;
            if (i == vn8Var.n) {
                if (z) {
                    mf5Var.setText(ob6.G(vn8Var.getMessagesController().y0, "BlockedUsersCount", new Object[0]));
                } else {
                    mf5Var.setText(ob6.M0(2131746569, null));
                }
            }
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        FrameLayout ilbVar;
        if (i != 0) {
            Context context = this.c;
            if (i == 1) {
                ilbVar = new ilb(context);
            } else if (i == 2) {
                ilbVar = new ij6(context);
            } else if (i != 4) {
                mf5 mf5Var = new mf5(this.c, aob.L6, 21, 11, false, null);
                mf5Var.setHeight(43);
                frameLayout = mf5Var;
            } else {
                skb skbVar = new skb(viewGroup.getContext());
                skbVar.k(ob6.M0(2131747642, null), false);
                skbVar.g(-1, aob.p7);
                frameLayout = skbVar;
            }
            frameLayout = ilbVar;
        } else {
            lj6 lj6Var = new lj6(this.c, 7, 6, true, null);
            lj6Var.setDelegate(new jz7(this, (byte) 16));
            frameLayout = lj6Var;
        }
        return new n69(frameLayout);
    }
}
