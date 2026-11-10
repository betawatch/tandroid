package wg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.ha;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v8;
import org.telegram.ui.Components.w70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.e61;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class j0 extends ug.f1 {
    public final ArrayList L2;

    public j0(f2 f2Var, int i7, ArrayList arrayList, h6 h6Var) {
        super(f2Var, i7, null, null, null, h6Var);
        ArrayList arrayList2 = new ArrayList();
        this.L2 = arrayList2;
        arrayList2.addAll(arrayList);
        k1();
        this.T0 = false;
        this.u0 = false;
        this.s0 = 0;
        yg.a aVar = new yg.a(getContext(), this.I0);
        aVar.setOnClickListener(new ii.g(this, 28));
        aVar.setCloseStyle(true);
        this.b.addView(aVar, ha.d(-1, 64.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        pj0 pj0Var = this.n1;
        int i10 = this.t0;
        pj0Var.setPadding(i10, 0, i10, org.telegram.messenger.g0.L(64.0f));
        Context context = getContext();
        int i11 = i0.f;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        if (arrayList2.size() == 1) {
            frameLayout.addView(frameLayout2, ha.d(-1, 94.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            i0 i0Var = new i0(context, 47.0f);
            i0Var.d = false;
            TLRPC.User user = (TLRPC.User) arrayList2.get(0);
            v8 v8Var = i0Var.e;
            v8Var.r(user);
            i0Var.a.e(user, v8Var);
            frameLayout2.addView(i0Var, 0, ha.e(94, 94, 17));
        } else {
            frameLayout.addView(frameLayout2, ha.d(-1, 83.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            int i12 = 0;
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                TLRPC.User user2 = (TLRPC.User) arrayList2.get(i13);
                i0 i0Var2 = new i0(context, 41.5f);
                v8 v8Var2 = i0Var2.e;
                v8Var2.r(user2);
                i0Var2.a.e(user2, v8Var2);
                frameLayout2.addView(i0Var2, 0, ha.e(83, 83, 17));
                i0Var2.setTranslationX(org.telegram.messenger.g0.L(29.0f) * (-i13));
                if (i13 == 0 && arrayList2.size() > 3) {
                    h0 h0Var = i0Var2.b;
                    h0Var.setAlpha(1.0f);
                    h0Var.b = arrayList2.size() - 3;
                }
                i12++;
                if (i13 == 2) {
                    break;
                }
            }
            frameLayout.setTranslationX((i12 - 1) * org.telegram.messenger.g0.L(14.5f));
        }
        this.w2 = frameLayout;
        N();
    }

    public static void l1(ArrayList arrayList) {
        f2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        j0 j0Var = new j0(Q, p10.s0, arrayList, Q.getResourceProvider());
        j0Var.E2 = true;
        j0Var.F2 = true;
        j0Var.show();
    }

    @Override // ug.f1
    public final void d1(int i7, View view) {
        if (i7 == 0) {
            view.setOutlineProvider(new bg.q0(22));
            view.setClipToOutline(true);
            t6.h(m6.a7, view, this.I0);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = -org.telegram.messenger.g0.L(6.0f);
        }
    }

    @Override // ug.f1
    public final void e1(e61 e61Var) {
        View view = this.w2;
        ArrayList arrayList = this.L2;
        e61Var.addView(view, ha.k(0.0f, arrayList.size() == 1 ? 28.0f : 34.0f, 0.0f, arrayList.size() == 1 ? 9.0f : 14.0f, -1, arrayList.size() == 1 ? 94 : 83));
    }

    @Override // ug.f1
    public final void j1(boolean z9) {
        String a02;
        this.J2[0].setTextSize(1, 20.0f);
        this.K2.setPadding(org.telegram.messenger.g0.L(30.0f), 0, org.telegram.messenger.g0.L(30.0f), 0);
        this.K2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        w70 w70Var = this.J2[0];
        ArrayList arrayList = this.L2;
        w70Var.setText(id.K0(arrayList.size(), "GiftPremiumGiftsSent"));
        ((ViewGroup.MarginLayoutParams) this.K2.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(16.0f);
        ((ViewGroup.MarginLayoutParams) this.K2.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(4.0f);
        int size = arrayList.size();
        if (size == 1) {
            a02 = id.a0(null, null, 2131749653, id.a0(null, null, 2131749655, t10.j((TLRPC.User) arrayList.get(0), true)));
        } else if (size == 2) {
            a02 = id.a0("GiftPremiumUsersPurchasedManyZero", null, 2131749653, id.a0("GiftPremiumUsersTwo", null, 2131749648, t10.j((TLRPC.User) arrayList.get(0), true), t10.j((TLRPC.User) arrayList.get(1), true)));
        } else if (size != 3) {
            a02 = id.G(arrayList.size() - 3, "GiftPremiumUsersPurchasedMany", id.a0("GiftPremiumUsersThree", null, 2131749649, t10.j((TLRPC.User) arrayList.get(0), true), t10.j((TLRPC.User) arrayList.get(1), true), t10.j((TLRPC.User) arrayList.get(2), true)));
        } else {
            a02 = id.a0("GiftPremiumUsersPurchasedManyZero", null, 2131749653, id.a0("GiftPremiumUsersThree", null, 2131749649, t10.j((TLRPC.User) arrayList.get(0), true), t10.j((TLRPC.User) arrayList.get(1), true), t10.j((TLRPC.User) arrayList.get(2), true)));
        }
        this.K2.setText(org.telegram.messenger.g0.X2(a02));
        this.K2.append("\n");
        this.K2.append("\n");
        if (arrayList.size() == 1) {
            this.K2.append(org.telegram.messenger.g0.X2(id.a0("GiftPremiumGiftsSentStatusForUser", null, 2131749668, t10.j((TLRPC.User) arrayList.get(0), true))));
        } else {
            this.K2.append(org.telegram.messenger.g0.X2(id.M0(2131749669, "GiftPremiumGiftsSentStatus")));
        }
    }

    @Override // ug.f1
    public final void k1() {
        this.a2 = 1;
        this.b2 = 0;
        this.e2 = 1;
        int size = this.S1.size();
        int i7 = 1 + size;
        this.f2 = i7;
        this.a2 = size + 2;
        this.i2 = i7;
    }
}
