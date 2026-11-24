// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.q;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class vs1 extends r29 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final ArrayList N;
    public boolean O;
    public boolean P;
    public final ArrayList Q;
    public final /* synthetic */ mu1 R;
    public final Context h;
    public final boolean n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public vs1(mu1 mu1Var, Context context) {
        this.R = mu1Var;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.s = -5;
        this.w = -5;
        this.x = -5;
        this.y = -5;
        this.E = -5;
        this.F = -5;
        this.G = -5;
        this.H = -5;
        this.I = -5;
        this.J = -5;
        this.N = new ArrayList();
        this.Q = new ArrayList();
        this.h = context;
        TLRPC.User user = mu1Var.f;
        this.n = user != null && user.bot;
        C(true);
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return false;
    }

    public final void F(boolean z) {
        mu1 mu1Var = this.R;
        if (l7c.w(mu1Var.f)) {
            if (z) {
                mu1Var.Vc = true;
            }
            if (this.J < 0 || I()) {
                return;
            }
            super.r(this.J);
            N();
        }
    }

    public final ArrayList G() {
        return this.M ? this.N : this.O ? this.Q : this.R.M6;
    }

    public final void H(k27 k27Var) {
        mu1 mu1Var = this.R;
        int childCount = mu1Var.A0.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = mu1Var.A0.getChildAt(i);
            if (childAt instanceof gb2) {
                gb2 gb2Var = (gb2) childAt;
                if (gb2Var.getMessageObject() == k27Var) {
                    gb2Var.invalidate();
                    return;
                }
            }
        }
    }

    public final boolean I() {
        mu1 mu1Var = this.R;
        return l7c.x(mu1Var.f) && mu1Var.d() == 0 && !mu1Var.Vc && mu1Var.g4 == 0;
    }

    public final void J(boolean z) {
        boolean z2;
        boolean z3;
        mu1 mu1Var = this.R;
        ArrayList arrayList = mu1Var.M6;
        if (w01.a) {
            fa4.b("notify data set changed fragmentOpened=" + mu1Var.g6);
        }
        if (z && mu1Var.g6) {
            b49 itemAnimator = mu1Var.A0.getItemAnimator();
            lq1 lq1Var = mu1Var.B0;
            if (itemAnimator != lq1Var) {
                mu1Var.A0.setItemAnimator(lq1Var);
            }
        } else {
            mu1Var.A0.setItemAnimator(null);
        }
        N();
        try {
            super.f();
        } catch (Exception e) {
            fa4.g(e, true);
        }
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            k27 k27Var = (k27) arrayList.get(size);
            if (k27Var.l0) {
                size--;
            } else {
                TLRPC.Message message = k27Var.k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionTopicCreate) || (messageAction instanceof TLRPC.TL_messageActionChannelCreate)) {
                        z2 = true;
                    }
                }
            }
        }
        z2 = false;
        boolean[] zArr = mu1Var.U6;
        if ((zArr[0] && (mu1Var.d7 == 0 || zArr[1])) || z2) {
            z3 = ((d) mu1Var).fragmentBeginToShow;
            mu1Var.R4(z3);
        }
    }

    public final void K(int i, boolean z) {
        boolean z2;
        k27 messageObject;
        if (w01.a) {
            StringBuilder sb = new StringBuilder("notify item removed ");
            sb.append(i);
            de9.s(z ? " with thanos effect" : "", sb);
        }
        mu1 mu1Var = this.R;
        z2 = ((d) mu1Var).fragmentBeginToShow;
        jq1 jq1Var = mu1Var.A0;
        if (z2) {
            b49 itemAnimator = jq1Var.getItemAnimator();
            lq1 lq1Var = mu1Var.B0;
            if (itemAnimator != lq1Var) {
                mu1Var.A0.setItemAnimator(lq1Var);
            }
        } else {
            jq1Var.setItemAnimator(null);
        }
        if (z && mu1Var.B0 != null) {
            b49 itemAnimator2 = mu1Var.A0.getItemAnimator();
            lq1 lq1Var2 = mu1Var.B0;
            if (itemAnimator2 == lq1Var2) {
                s49 K = mu1Var.A0.K(i);
                if (K == null) {
                    lq1Var2.getClass();
                } else {
                    lq1Var2.S.add(K);
                    View view = K.a;
                    if ((view instanceof gb2) && (messageObject = ((gb2) view).getMessageObject()) != null) {
                        messageObject.a0 = true;
                    }
                }
            }
        }
        N();
        try {
            super.r(i);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void L(int i) {
        int i2;
        mu1 mu1Var = this.R;
        ArrayList arrayList = mu1Var.M6;
        if (mu1Var.C0 == null || this.M || this.O) {
            return;
        }
        int i3 = 0;
        if (!mu1Var.R4 && mu1Var.b8 != null) {
            int childCount = mu1Var.A0.getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    break;
                }
                View childAt = mu1Var.A0.getChildAt(i4);
                if (childAt instanceof gb2) {
                    k27 messageObject = ((gb2) childAt).getMessageObject();
                    k27 k27Var = mu1Var.b8;
                    if (messageObject == k27Var) {
                        if (arrayList.indexOf(k27Var) >= 0) {
                            i2 = arrayList.indexOf(mu1Var.b8) + this.K;
                            i3 = mu1Var.a7(childAt);
                        }
                    }
                }
                i4++;
            }
        }
        i2 = -1;
        g(i);
        if (i2 != -1) {
            mu1Var.C0.g1(i2, i3);
        }
    }

    public final gb2 M(k27 k27Var, boolean z, boolean z2) {
        mu1 mu1Var = this.R;
        if (z) {
            int childCount = mu1Var.A0.getChildCount();
            int i = 0;
            while (i < childCount) {
                View childAt = mu1Var.A0.getChildAt(i);
                if (childAt instanceof gb2) {
                    gb2 gb2Var = (gb2) childAt;
                    if (gb2Var.getMessageObject() == k27Var && TextUtils.equals(gb2Var.z5, gb2Var.Q5.k.post_author)) {
                        gb2Var.z3(k27Var, gb2Var.getCurrentMessagesGroup(), gb2Var.K2(), gb2Var.L2(), gb2Var.C2(), gb2Var.G2());
                        return gb2Var;
                    }
                }
                i++;
                k27Var = k27Var;
            }
        }
        k27 k27Var2 = k27Var;
        int indexOf = (this.M ? this.N : this.O ? this.Q : mu1Var.M6).indexOf(k27Var2);
        if (indexOf == -1) {
            return null;
        }
        if (!z2) {
            L(this.K + indexOf);
            return null;
        }
        int i2 = mu1.pd;
        mu1.pd = i2 + 1;
        k27Var2.m1 = i2;
        J(true);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N() {
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.User user3;
        int i;
        TLRPC.PeerSettings z1;
        TLRPC.PeerSettings z12;
        int i2;
        mu1 mu1Var = this.R;
        boolean[] zArr = mu1Var.U6;
        this.r = 0;
        ArrayList arrayList = this.M ? this.N : this.O ? this.Q : mu1Var.M6;
        if (mu1Var.g4 == 3 && mu1Var.mb) {
            this.r = 1;
            this.s = 0;
        } else {
            this.s = -5;
        }
        this.w = -5;
        this.x = -5;
        this.E = -5;
        this.H = -5;
        this.I = -5;
        this.J = -5;
        if (I()) {
            int i3 = this.r;
            this.r = i3 + 1;
            this.J = i3;
        }
        if (arrayList.isEmpty()) {
            this.F = -5;
            this.G = -5;
            this.K = 0;
            this.L = 0;
            TLRPC.User user4 = mu1Var.f;
            if (user4 != null && !l7c.v(user4) && !l7c.B(mu1Var.f)) {
                TLRPC.PeerSettings z13 = mu1Var.getMessagesController().z1(mu1Var.f.id);
                int i4 = g7c.Q;
                if (z13 != null && ((z13.phone_country != null || z13.registration_month != null) && !na7.E2(mu1Var.f) && mu1Var.g4 == 0)) {
                    int i5 = this.r;
                    this.r = i5 + 1;
                    this.E = i5;
                    return;
                }
            }
            if (l7c.B(mu1Var.f) || ((user = mu1Var.f) != null && user.bot && !na7.E2(user) && mu1Var.g4 == 0)) {
                int i6 = this.r;
                this.r = i6 + 1;
                this.x = i6;
                return;
            }
            return;
        }
        if (!this.O) {
            boolean[] zArr2 = mu1Var.W6;
            if ((!zArr2[0] || (mu1Var.d7 != 0 && !zArr2[1])) && !mu1Var.X6) {
                int i7 = this.r;
                this.r = i7 + 1;
                this.G = i7;
                int i8 = this.r;
                this.K = i8;
                int size = arrayList.size() + i8;
                this.r = size;
                this.L = size;
                user2 = mu1Var.f;
                if (user2 != null && !l7c.v(user2) && !l7c.B(mu1Var.f)) {
                    z1 = mu1Var.getMessagesController().z1(mu1Var.f.id);
                    int i9 = g7c.Q;
                    if (z1 != null && ((z1.phone_country != null || z1.registration_month != null) && !na7.E2(mu1Var.f) && mu1Var.g4 == 0 && zArr[0])) {
                        z12 = mu1Var.getMessagesController().z1(mu1Var.f.id);
                        i2 = z12.name_change_date;
                        if (i2 != 0) {
                            int i10 = z12.photo_change_date;
                            int i11 = this.r;
                            if (i10 != 0) {
                                int i12 = i11 + 1;
                                if (i2 < i10) {
                                    this.I = i11;
                                    this.r = i11 + 2;
                                    this.H = i12;
                                } else {
                                    this.H = i11;
                                    this.r = i11 + 2;
                                    this.I = i12;
                                }
                                int i13 = this.r;
                                this.r = i13 + 1;
                                this.E = i13;
                                i = mu1Var.g4;
                                if (i == 9) {
                                    int i14 = this.r;
                                    this.s = i14;
                                    this.r = i14 + 2;
                                    this.w = i14 + 1;
                                }
                                if (i == 5 && !ox8.g(mu1Var.f4)) {
                                    int i15 = this.r;
                                    this.r = i15 + 1;
                                    this.s = i15;
                                }
                                if (!this.O ? !(zArr[0] && (mu1Var.d7 == 0 || zArr[1])) && (gl.O1() || mu1Var.v4 || mu1Var.f != null) : !this.P) {
                                    this.F = -5;
                                    return;
                                }
                                int i16 = this.r;
                                this.r = i16 + 1;
                                this.F = i16;
                                return;
                            }
                            this.r = i11 + 1;
                            this.I = i11;
                        }
                        if (z12.photo_change_date != 0) {
                            int i17 = this.r;
                            this.r = i17 + 1;
                            this.H = i17;
                        }
                        int i132 = this.r;
                        this.r = i132 + 1;
                        this.E = i132;
                        i = mu1Var.g4;
                        if (i == 9) {
                        }
                        if (i == 5) {
                            int i152 = this.r;
                            this.r = i152 + 1;
                            this.s = i152;
                        }
                        if (this.O) {
                            int i162 = this.r;
                            this.r = i162 + 1;
                            this.F = i162;
                            return;
                        } else {
                            int i1622 = this.r;
                            this.r = i1622 + 1;
                            this.F = i1622;
                            return;
                        }
                    }
                }
                if ((!l7c.B(mu1Var.f) || ((user3 = mu1Var.f) != null && user3.bot && !na7.E2(user3) && mu1Var.g4 == 0)) && zArr[0]) {
                    int i18 = this.r;
                    this.r = i18 + 1;
                    this.x = i18;
                }
                i = mu1Var.g4;
                if (i == 9) {
                }
                if (i == 5) {
                }
                if (this.O) {
                }
            }
        }
        this.G = -5;
        int i82 = this.r;
        this.K = i82;
        int size2 = arrayList.size() + i82;
        this.r = size2;
        this.L = size2;
        user2 = mu1Var.f;
        if (user2 != null) {
            z1 = mu1Var.getMessagesController().z1(mu1Var.f.id);
            int i92 = g7c.Q;
            if (z1 != null) {
                z12 = mu1Var.getMessagesController().z1(mu1Var.f.id);
                i2 = z12.name_change_date;
                if (i2 != 0) {
                }
                if (z12.photo_change_date != 0) {
                }
                int i1322 = this.r;
                this.r = i1322 + 1;
                this.E = i1322;
                i = mu1Var.g4;
                if (i == 9) {
                }
                if (i == 5) {
                }
                if (this.O) {
                }
            }
        }
        if (!l7c.B(mu1Var.f)) {
        }
        int i182 = this.r;
        this.r = i182 + 1;
        this.x = i182;
        i = mu1Var.g4;
        if (i == 9) {
        }
        if (i == 5) {
        }
        if (this.O) {
        }
    }

    public final void O() {
        int i = this.r;
        int i2 = this.x;
        int i3 = this.E;
        int i4 = this.s;
        int i5 = this.w;
        int i6 = this.F;
        int i7 = this.G;
        int i8 = this.K;
        int i9 = this.L;
        int i10 = this.H;
        int i11 = this.I;
        int i12 = this.J;
        N();
        if (i == this.r && i2 == this.x && i6 == this.F && i7 == this.G && i8 == this.K && i9 == this.L && i4 == this.s && i5 == this.w && i3 == this.E && i10 == this.H && i11 == this.I && i12 == this.J) {
            return;
        }
        J(false);
    }

    @Override // w39
    public final int b() {
        this.y = -5;
        mu1 mu1Var = this.R;
        vf6 vf6Var = mu1Var.v8;
        if (mu1Var.e6.get(mu1Var.s4, 0) == 0) {
            return this.r;
        }
        TLRPC.User user = mu1Var.f;
        if (user == null || !user.bot || mu1Var.g4 != 0 || ((vf6Var.m() <= 0 || (((TL_bots.BotInfo) vf6Var.f(mu1Var.f.id)).description == null && ((TL_bots.BotInfo) vf6Var.f(mu1Var.f.id)).description_photo == null && ((TL_bots.BotInfo) vf6Var.f(mu1Var.f.id)).description_document == null)) && !l7c.B(mu1Var.f) && !l7c.w(mu1Var.f))) {
            return 0;
        }
        this.y = 0;
        return 1;
    }

    @Override // w39
    public final long c(int i) {
        mu1 mu1Var = this.R;
        if (mu1Var.e6.get(mu1Var.s4, 0) != 0 && i == this.y) {
            return 1L;
        }
        ArrayList arrayList = this.M ? this.N : this.O ? this.Q : mu1Var.M6;
        if (i >= this.K && i < this.L) {
            return ((k27) arrayList.get(i - r1)).m1;
        }
        if (i == this.x || i == this.y) {
            return 1L;
        }
        if (i == this.F) {
            return 2L;
        }
        if (i == this.G) {
            return 3L;
        }
        if (i == this.s) {
            return 4L;
        }
        if (i == this.E) {
            return 6L;
        }
        if (i == this.H) {
            return 7L;
        }
        if (i == this.I) {
            return 8L;
        }
        if (i == this.J) {
            return 9L;
        }
        return i == this.w ? 10L : 5L;
    }

    @Override // w39
    public final int d(int i) {
        mu1 mu1Var = this.R;
        if (mu1Var.e6.get(mu1Var.s4, 0) != 0 && i == this.y) {
            return 3;
        }
        if (i == this.s || i == this.w) {
            return 1;
        }
        int i2 = this.K;
        if (i >= i2 && i < this.L) {
            return ((k27) (this.M ? this.N : this.O ? this.Q : mu1Var.M6).get(i - i2)).U;
        }
        if (i == this.x) {
            return 3;
        }
        if (i == this.E) {
            return 6;
        }
        if (i == this.I || i == this.H) {
            return 7;
        }
        return i == this.J ? 8 : 4;
    }

    @Override // r29, w39
    public final void f() {
        J(false);
    }

    @Override // r29, w39
    public final void g(int i) {
        boolean z;
        if (w01.a) {
            fa4.b("notify item changed " + i);
        }
        mu1 mu1Var = this.R;
        z = ((d) mu1Var).fragmentBeginToShow;
        if (!z || mu1Var.c1) {
            mu1Var.A0.setItemAnimator(null);
        } else {
            b49 itemAnimator = mu1Var.A0.getItemAnimator();
            lq1 lq1Var = mu1Var.B0;
            if (itemAnimator != lq1Var) {
                mu1Var.A0.setItemAnimator(lq1Var);
            }
        }
        N();
        try {
            super.g(i);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // r29, w39
    public final void i(int i) {
        boolean z;
        if (w01.a) {
            fa4.b("notify item inserted " + i);
        }
        mu1 mu1Var = this.R;
        z = ((d) mu1Var).fragmentBeginToShow;
        jq1 jq1Var = mu1Var.A0;
        if (z) {
            b49 itemAnimator = jq1Var.getItemAnimator();
            lq1 lq1Var = mu1Var.B0;
            if (itemAnimator != lq1Var) {
                mu1Var.A0.setItemAnimator(lq1Var);
            }
        } else {
            jq1Var.setItemAnimator(null);
        }
        N();
        try {
            super.i(i);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // w39
    public final void j(int i, int i2) {
        boolean z;
        if (w01.a) {
            fa4.b("notify item moved" + i + ":" + i2);
        }
        mu1 mu1Var = this.R;
        z = ((d) mu1Var).fragmentBeginToShow;
        jq1 jq1Var = mu1Var.A0;
        if (z) {
            b49 itemAnimator = jq1Var.getItemAnimator();
            lq1 lq1Var = mu1Var.B0;
            if (itemAnimator != lq1Var) {
                mu1Var.A0.setItemAnimator(lq1Var);
            }
        } else {
            jq1Var.setItemAnimator(null);
        }
        N();
        try {
            super.j(i, i2);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // r29, w39
    public final void l(int i, int i2) {
        boolean z;
        if (w01.a) {
            fa4.b("notify item range changed " + i + ":" + i2);
        }
        mu1 mu1Var = this.R;
        z = ((d) mu1Var).fragmentBeginToShow;
        jq1 jq1Var = mu1Var.A0;
        if (z) {
            b49 itemAnimator = jq1Var.getItemAnimator();
            lq1 lq1Var = mu1Var.B0;
            if (itemAnimator != lq1Var) {
                mu1Var.A0.setItemAnimator(lq1Var);
            }
        } else {
            jq1Var.setItemAnimator(null);
        }
        N();
        try {
            super.l(i, i2);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // r29, w39
    public final void p(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        mu1 mu1Var = this.R;
        ArrayList arrayList = mu1Var.M6;
        if (w01.a) {
            fa4.b("notify item range inserted " + i + ":" + i2);
        }
        z = ((d) mu1Var).fragmentBeginToShow;
        jq1 jq1Var = mu1Var.A0;
        if (z) {
            b49 itemAnimator = jq1Var.getItemAnimator();
            lq1 lq1Var = mu1Var.B0;
            if (itemAnimator != lq1Var) {
                mu1Var.A0.setItemAnimator(lq1Var);
            }
        } else {
            jq1Var.setItemAnimator(null);
        }
        N();
        if (i == 1 && i2 > 0 && (i3 = i + i2) >= (i4 = this.K) && i3 < this.L) {
            k27 k27Var = (k27) arrayList.get(i3 - i4);
            k27 k27Var2 = (k27) arrayList.get((i3 - this.K) - 1);
            if ((mu1Var.e != null && k27Var.Z0() == k27Var2.Z0()) || (mu1Var.f != null && k27Var.O3() == k27Var2.O3())) {
                g(i);
            }
        }
        try {
            super.p(i, i2);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // r29, w39
    public final void q(int i, int i2) {
        boolean z;
        if (w01.a) {
            fa4.b("notify item range removed" + i + ":" + i2);
        }
        mu1 mu1Var = this.R;
        z = ((d) mu1Var).fragmentBeginToShow;
        jq1 jq1Var = mu1Var.A0;
        if (z) {
            b49 itemAnimator = jq1Var.getItemAnimator();
            lq1 lq1Var = mu1Var.B0;
            if (itemAnimator != lq1Var) {
                mu1Var.A0.setItemAnimator(lq1Var);
            }
        } else {
            jq1Var.setItemAnimator(null);
        }
        N();
        try {
            super.q(i, i2);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // r29, w39
    public final void r(int i) {
        boolean z;
        if (w01.a) {
            fa4.b("notify item removed " + i);
        }
        mu1 mu1Var = this.R;
        z = ((d) mu1Var).fragmentBeginToShow;
        jq1 jq1Var = mu1Var.A0;
        if (z) {
            b49 itemAnimator = jq1Var.getItemAnimator();
            lq1 lq1Var = mu1Var.B0;
            if (itemAnimator != lq1Var) {
                mu1Var.A0.setItemAnimator(lq1Var);
            }
        } else {
            jq1Var.setItemAnimator(null);
        }
        N();
        try {
            super.r(i);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x024a, code lost:
    
        if (r4.X4.containsKey(java.lang.Integer.valueOf(((k27) r8.get(0)).e1())) != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x05a4, code lost:
    
        if (r18 != r25) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0913, code lost:
    
        if (r4.B0 == null) goto L531;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x05d5, code lost:
    
        if (k27.B1(r5.k.peer_id) == k27.B1(r2.k.peer_id)) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x064a, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x05ef, code lost:
    
        if (r2.R1() == r5.R1()) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0648, code lost:
    
        if (k27.B1(r8) == k27.B1(r5.k.fwd_from.from_id)) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0405, code lost:
    
        if (k27.B1(r5.k.peer_id) == k27.B1(r10.k.peer_id)) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x047a, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0423, code lost:
    
        if (r10.R1() == r5.R1()) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0478, code lost:
    
        if (k27.B1(r11) == k27.B1(r5.k.fwd_from.from_id)) goto L257;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0255 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x094e  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x095d  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0289  */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v18 */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        TLRPC.UserFull userFull;
        TLObject tLObject;
        String str;
        eq0 eq0Var;
        int i2;
        int i3;
        int i4;
        k27 k27Var;
        boolean z;
        boolean z2;
        boolean z3;
        int i5;
        ArrayList arrayList;
        long j;
        int i6;
        boolean z4;
        boolean z5;
        boolean z6;
        int i7;
        boolean z7;
        int d;
        ArrayList arrayList2;
        int i8;
        int i9;
        boolean z8;
        f27 f27Var;
        boolean z9;
        boolean z10;
        boolean z11;
        String str2;
        int indexOf;
        ?? r15;
        lq1 lq1Var;
        g27 g27Var;
        ar1 ar1Var;
        a aVar;
        int i10;
        byte b;
        a aVar2;
        a aVar3;
        boolean z12;
        boolean z13;
        q qVar;
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        String str3;
        boolean equals;
        boolean z14;
        long j2;
        long j3;
        int i11;
        int i12;
        int i13;
        String str4;
        boolean z15;
        int i14;
        TLRPC.ChatFull chatFull;
        View view = s49Var.a;
        mu1 mu1Var = this.R;
        vf6 vf6Var = mu1Var.v8;
        ArrayList arrayList3 = mu1Var.K4;
        HashMap hashMap = mu1Var.L4;
        if (i == this.x || i == this.y) {
            eq0 eq0Var2 = (eq0) view;
            if (l7c.B(mu1Var.f)) {
                eq0Var = eq0Var2;
                eq0Var.b(false, 0L, k96.M0(2131746074, null), null, null, null);
            } else {
                TLRPC.User user = mu1Var.f;
                if (user == null || user.id != 489000) {
                    TL_bots.BotInfo botInfo = vf6Var.m() != 0 ? (TL_bots.BotInfo) vf6Var.f(mu1Var.f.id) : null;
                    boolean z16 = (botInfo == null || (TextUtils.isEmpty(botInfo.description) && botInfo.description_photo == null && botInfo.description_document == null)) && l7c.v(mu1Var.f) && (userFull = mu1Var.s8) != null && userFull.bot_manager_id != 0 && mu1Var.f.bot_can_edit;
                    TLRPC.User user2 = mu1Var.f;
                    long j4 = user2 == null ? 0L : user2.id;
                    String str5 = botInfo != null ? botInfo.description : null;
                    if (botInfo != null) {
                        TLObject tLObject2 = botInfo.description_document;
                        if (tLObject2 == null) {
                            tLObject2 = botInfo.description_photo;
                        }
                        tLObject = tLObject2;
                    } else {
                        tLObject = null;
                    }
                    if (z16) {
                        i2 = ((d) mu1Var).currentAccount;
                        str = cf3.k(i2, mu1Var.s8.bot_manager_id);
                    } else {
                        str = null;
                    }
                    eq0Var = eq0Var2;
                    eq0Var.b(true, j4, str5, tLObject, botInfo, str);
                } else {
                    eq0Var = eq0Var2;
                    eq0Var.b(false, 0L, k96.M0(2131743378, null), null, null, null);
                }
            }
            mu1Var.Bc(eq0Var);
            return;
        }
        if (i == this.J) {
            ((oo0) view).setDialogId(mu1Var.a());
            return;
        }
        if (i == this.E) {
            g7c g7cVar = (g7c) view;
            TLRPC.EncryptedChat encryptedChat = mu1Var.h;
            long a = encryptedChat != null ? encryptedChat.user_id : mu1Var.a();
            g7cVar.b(a, mu1Var.getMessagesController().z1(a));
            return;
        }
        if (i == this.G || i == this.F) {
            ((ma2) view).setProgressVisible(mu1Var.b7 > 1);
            return;
        }
        if (i == this.I) {
            if (mu1Var.getMessagesController().z1(mu1Var.a()) != null) {
                ((uk1) view).setCustomText(k96.a0(null, null, 2131751782, k96.N(mu1Var.getConnectionsManager().getCurrentTime() - r0.name_change_date)));
                return;
            }
            return;
        }
        if (i == this.H) {
            if (mu1Var.getMessagesController().z1(mu1Var.a()) != null) {
                ((uk1) view).setCustomText(k96.a0(null, null, 2131751781, k96.N(mu1Var.getConnectionsManager().getCurrentTime() - r0.photo_change_date)));
                return;
            }
            return;
        }
        if (i == this.s) {
            uk1 uk1Var = (uk1) view;
            mu1Var.P5();
            uk1Var.setMessageObject(mu1Var.X3);
            int i15 = mu1Var.g4;
            if (i15 == 3) {
                uk1Var.setCustomText(k96.M0(2131745702, null));
            } else if (i15 == 5) {
                uk1Var.setCustomText(k96.M0(2131752659, null));
            } else if (i15 == 9) {
                uk1Var.setCustomText(k96.M0(2131742630, null));
            }
            uk1Var.setAlpha(1.0f);
            uk1Var.setSpoilersSuppressed(mu1Var.A0.getScrollState() != 0);
            return;
        }
        if (i == this.w) {
            uk1 uk1Var2 = (uk1) view;
            mu1Var.Q5();
            uk1Var2.setMessageObject(mu1Var.Y3);
            uk1Var2.setCustomText(k96.M0(2131742631, null));
            uk1Var2.setAlpha(1.0f);
            uk1Var2.setSpoilersSuppressed(mu1Var.A0.getScrollState() != 0);
            return;
        }
        int i16 = this.K;
        if (i < i16 || i >= this.L) {
            return;
        }
        ArrayList arrayList4 = this.M ? this.N : this.O ? this.Q : mu1Var.M6;
        k27 k27Var2 = (k27) arrayList4.get(i - i16);
        if (!(view instanceof gb2)) {
            ArrayList arrayList5 = arrayList4;
            if (!(view instanceof uk1)) {
                if (view instanceof ke2) {
                    ke2 ke2Var = (ke2) view;
                    ke2Var.setText(k96.M0(2131743599, null));
                    ke2Var.getTextView().setTranslationX(mu1Var.g7() / 2.0f);
                    if (mu1Var.V7 != 0) {
                        mu1Var.V7 = 0;
                        return;
                    }
                    return;
                }
                return;
            }
            if ((k27Var2 == null || !k27Var2.l0) && (i4 = (i3 = i + 1) - this.K) >= 0 && i4 < arrayList5.size()) {
                k27 k27Var3 = (k27) arrayList5.get(i3 - this.K);
                if (k27Var3 == null || !k27Var3.l0) {
                    k27Var = k27Var3;
                } else {
                    int i17 = i + 2;
                    int i18 = i17 - this.K;
                    k27Var = (i18 < 0 || i18 >= arrayList5.size()) ? null : (k27) arrayList5.get(i17 - this.K);
                }
                z = k27Var == null || !(k27Var2 == null || k27Var.Y1() == k27Var2.Y1());
            } else {
                z = false;
            }
            uk1 uk1Var3 = (uk1) view;
            uk1Var3.f0 = mu1Var.K7();
            uk1Var3.j0 = mu1Var.W7();
            mu1Var.V7();
            mu1Var.f7();
            uk1Var3.k0 = mu1Var.g7();
            uk1Var3.g0 = hc2.c0(mu1Var.e);
            uk1Var3.h0 = hc2.p0(mu1Var.e);
            uk1Var3.i0 = l7c.w(mu1Var.f);
            boolean z17 = uk1Var3.l0 != z;
            uk1Var3.l0 = z;
            uk1Var3.j0(k27Var2, z17);
            uk1Var3.setAlpha(1.0f);
            uk1Var3.setShowTopic(true);
            uk1Var3.setSpoilersSuppressed(mu1Var.A0.getScrollState() != 0);
            return;
        }
        gb2 gb2Var = (gb2) view;
        f27 n7 = mu1Var.n7(k27Var2);
        gb2Var.f6 = mu1Var.e != null || l7c.D(mu1Var.f) || l7c.B(mu1Var.f) || mu1Var.g4 == 7;
        gb2Var.E.a(false, false);
        gb2Var.g6 = l7c.w(mu1Var.f);
        gb2Var.s6 = mu1Var.T7();
        int i19 = mu1Var.g4;
        gb2Var.h6 = i19 == 3;
        gb2Var.i6 = i19 == 3 && mu1Var.mb;
        TLRPC.User user3 = mu1Var.f;
        gb2Var.j6 = user3 != null && user3.bot;
        gb2Var.k6 = hc2.T(mu1Var.e) && mu1Var.e.megagroup;
        gb2Var.l6 = hc2.c0(mu1Var.e);
        gb2Var.m6 = hc2.p0(mu1Var.e);
        gb2Var.n6 = hc2.c0(mu1Var.e) && mu1Var.x4 && mu1Var.d() == 1;
        gb2Var.o6 = (mu1Var.s4 != 0 || (gb2Var.l6 && mu1Var.x4)) && !gb2Var.m6;
        int i20 = mu1Var.g4;
        if (i20 != 1 && i20 != 9 && hc2.T(mu1Var.e)) {
            TLRPC.Chat chat = mu1Var.e;
            if (chat.has_link && !chat.megagroup) {
                z2 = true;
                gb2Var.p6 = z2;
                if (mu1Var.g4 == 0) {
                    if (!mu1Var.X4.containsKey(Integer.valueOf(k27Var2.e1()))) {
                        if (n7 != null) {
                            ArrayList arrayList6 = n7.d;
                            if (!arrayList6.isEmpty()) {
                            }
                        }
                    }
                    z3 = true;
                    gb2Var.q6 = z3;
                    i5 = mu1Var.g4;
                    if (i5 != 1 || i5 == 9 || (chatFull = mu1Var.r8) == null) {
                        arrayList = arrayList4;
                        j = 0;
                    } else {
                        arrayList = arrayList4;
                        j = chatFull.linked_chat_id;
                    }
                    gb2Var.t6 = j;
                    if (i5 == 7 || mu1Var.d4 != 1) {
                        gb2Var.u6 = l7c.B(mu1Var.f);
                    } else {
                        gb2Var.u6 = l7c.A(k27.B0(k27Var2.k));
                    }
                    gb2Var.v6 = mu1Var.g4 == 2;
                    gb2Var.W6 = mu1Var.K7();
                    gb2Var.X6 = mu1Var.W7();
                    gb2Var.Y6 = mu1Var.V7();
                    gb2Var.Z6 = mu1Var.f7();
                    gb2Var.a7 = mu1Var.g7();
                    if (k27Var2.q4()) {
                        gl.K(gb2Var, new jc((byte) 10));
                    }
                    int i21 = i + 2;
                    if (n7 != null) {
                        ArrayList arrayList7 = n7.e;
                        c27 d2 = n7.d(k27Var2);
                        int i22 = -100;
                        if (d2 == null) {
                            z4 = false;
                            z5 = false;
                            z15 = false;
                            z6 = false;
                            i6 = -100;
                        } else if (n7.i) {
                            i22 = arrayList7.indexOf(d2) + i + 1;
                            i6 = arrayList7.indexOf(d2) + (i - arrayList7.size());
                            z4 = false;
                            z5 = false;
                            z15 = false;
                            z6 = false;
                        } else {
                            if ((d2.l & 4) != 0) {
                                i14 = n7.n ? arrayList7.indexOf(d2) + (i - arrayList7.size()) : arrayList7.indexOf(d2) + i + 1;
                                z15 = false;
                                z6 = false;
                            } else {
                                z15 = true;
                                z6 = true;
                                i14 = -100;
                            }
                            if ((d2.l & 8) != 0) {
                                i22 = n7.n ? arrayList7.indexOf(d2) + i + 1 : arrayList7.indexOf(d2) + (i - arrayList7.size());
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            z5 = z4;
                            i6 = i22;
                            i22 = i14;
                        }
                        int i23 = i22;
                        z7 = z15;
                        i7 = i23;
                    } else {
                        i6 = i - 1;
                        z4 = false;
                        z5 = false;
                        z6 = false;
                        i7 = i + 1;
                        z7 = false;
                    }
                    int d3 = d(i6);
                    d = d(i7);
                    d(i21);
                    if ((k27Var2.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && d3 == s49Var.f) {
                        arrayList2 = arrayList;
                        k27 k27Var4 = (k27) arrayList2.get(i6 - this.K);
                        if (k27Var4.O3() != k27Var2.O3() || (Math.abs(k27Var4.k.date - k27Var2.k.date) > 300 && mu1Var.g4 != 9)) {
                            i13 = i7;
                            z5 = false;
                        } else {
                            i13 = i7;
                            z5 = true;
                        }
                        if (z5) {
                            TLRPC.Message message2 = k27Var4.k;
                            boolean z18 = z5;
                            i8 = i13;
                            if (message2 == null || message2.paid_message_stars <= 0) {
                                if (!k27Var2.y3() && !k27Var4.y3()) {
                                    if (mu1Var.e != null) {
                                        long Z0 = k27Var4.Z0();
                                        z18 = Z0 == k27Var2.Z0();
                                        if (!z4 && z18 && Z0 < 0 && mu1Var.e.megagroup && mu1Var.g4 != 9) {
                                            z18 = false;
                                        }
                                    } else {
                                        if (l7c.D(mu1Var.f) || l7c.B(mu1Var.f)) {
                                            if (!k27Var2.X3()) {
                                                if (!k27Var4.X3()) {
                                                }
                                            }
                                        } else if (mu1Var.g4 == 7) {
                                        }
                                        if (cf3.n(k27Var4.k.guestchat_via_from) != cf3.n(k27Var2.k.guestchat_via_from)) {
                                        }
                                    }
                                    z5 = z18;
                                    if (cf3.n(k27Var4.k.guestchat_via_from) != cf3.n(k27Var2.k.guestchat_via_from)) {
                                    }
                                } else if (k27Var2.y3() && k27Var4.y3() && Math.abs(k27Var4.k.fwd_from.date - k27Var2.k.fwd_from.date) <= 300) {
                                    TLRPC.MessageFwdHeader messageFwdHeader2 = k27Var4.k.fwd_from;
                                    String str6 = messageFwdHeader2.from_name;
                                    if (str6 == null || (str4 = k27Var2.k.fwd_from.from_name) == null) {
                                        TLRPC.Peer peer = messageFwdHeader2.from_id;
                                        if (peer != null) {
                                            if (k27Var2.k.fwd_from.from_id != null) {
                                            }
                                        }
                                    } else {
                                        z5 = str6.equals(str4);
                                        if (cf3.n(k27Var4.k.guestchat_via_from) != cf3.n(k27Var2.k.guestchat_via_from)) {
                                            z5 = false;
                                        }
                                    }
                                }
                            }
                            z5 = false;
                            if (cf3.n(k27Var4.k.guestchat_via_from) != cf3.n(k27Var2.k.guestchat_via_from)) {
                            }
                        } else {
                            i8 = i13;
                        }
                    } else {
                        arrayList2 = arrayList;
                        i8 = i7;
                    }
                    i9 = i8 - this.K;
                    if (i9 >= 0 || i9 >= arrayList2.size()) {
                        z8 = true;
                    } else {
                        k27 k27Var5 = (k27) arrayList2.get(i8 - this.K);
                        if (k27Var5 != null && k27Var5.l0) {
                            int i24 = i8 + 1;
                            int i25 = i24 - this.K;
                            k27Var5 = (i25 < 0 || i25 >= arrayList2.size()) ? null : (k27) arrayList2.get(i24 - this.K);
                        }
                        z8 = k27Var5 == null || k27Var5.Y1() != k27Var2.Y1();
                    }
                    int i26 = this.K;
                    boolean z19 = i == i26;
                    if (d == s49Var.f) {
                        k27 k27Var6 = (k27) arrayList2.get(i8 - i26);
                        z7 = !(k27Var6.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && k27Var6.O3() == k27Var2.O3() && (Math.abs(k27Var6.k.date - k27Var2.k.date) <= 300 || mu1Var.g4 == 9);
                        if (z7) {
                            if (k27Var2.y3() || k27Var6.y3()) {
                                f27Var = n7;
                                if (k27Var2.y3() && k27Var6.y3() && Math.abs(k27Var2.k.fwd_from.date - k27Var6.k.fwd_from.date) <= 300) {
                                    TLRPC.MessageFwdHeader messageFwdHeader3 = k27Var6.k.fwd_from;
                                    String str7 = messageFwdHeader3.from_name;
                                    if (str7 == null || (str3 = k27Var2.k.fwd_from.from_name) == null) {
                                        TLRPC.Peer peer2 = messageFwdHeader3.from_id;
                                        if (peer2 != null && k27Var2.k.fwd_from.from_id != null) {
                                        }
                                    } else {
                                        equals = str7.equals(str3);
                                        z7 = equals;
                                        if (cf3.n(k27Var6.k.guestchat_via_from) != cf3.n(k27Var2.k.guestchat_via_from)) {
                                            z7 = false;
                                        }
                                    }
                                }
                                z7 = false;
                                if (cf3.n(k27Var6.k.guestchat_via_from) != cf3.n(k27Var2.k.guestchat_via_from)) {
                                }
                            } else {
                                if (mu1Var.e != null) {
                                    long Z02 = k27Var6.Z0();
                                    equals = (Z02 != k27Var2.Z0() || k27Var2.y3() || k27Var6.y3()) ? false : true;
                                    if (!z6 && equals && Z02 < 0 && mu1Var.e.megagroup && mu1Var.g4 != 9) {
                                        equals = false;
                                    }
                                    if (equals && mu1Var.N7()) {
                                        TLRPC.TL_forumTopic tL_forumTopic = k27Var2.j1;
                                        if (tL_forumTopic == null) {
                                            i12 = ((d) mu1Var).currentAccount;
                                            z14 = false;
                                            j2 = k27.b2(i12, k27Var2.k, true, false);
                                            f27Var = n7;
                                        } else {
                                            z14 = false;
                                            f27Var = n7;
                                            j2 = tL_forumTopic.id;
                                        }
                                        TLRPC.TL_forumTopic tL_forumTopic2 = k27Var6.j1;
                                        if (tL_forumTopic2 == null) {
                                            i11 = ((d) mu1Var).currentAccount;
                                            j3 = k27.b2(i11, k27Var6.k, true, z14);
                                        } else {
                                            j3 = tL_forumTopic2.id;
                                        }
                                    } else {
                                        f27Var = n7;
                                    }
                                    z7 = equals;
                                    if (cf3.n(k27Var6.k.guestchat_via_from) != cf3.n(k27Var2.k.guestchat_via_from)) {
                                    }
                                } else {
                                    f27Var = n7;
                                    if (l7c.D(mu1Var.f) || l7c.B(mu1Var.f)) {
                                        if (!k27Var2.X3() && !k27Var6.X3()) {
                                        }
                                        z7 = false;
                                        if (cf3.n(k27Var6.k.guestchat_via_from) != cf3.n(k27Var2.k.guestchat_via_from)) {
                                        }
                                    } else {
                                        if (mu1Var.g4 == 7) {
                                        }
                                        if (cf3.n(k27Var6.k.guestchat_via_from) != cf3.n(k27Var2.k.guestchat_via_from)) {
                                        }
                                    }
                                    z7 = equals;
                                    if (cf3.n(k27Var6.k.guestchat_via_from) != cf3.n(k27Var2.k.guestchat_via_from)) {
                                    }
                                }
                                equals = false;
                                z7 = equals;
                                if (cf3.n(k27Var6.k.guestchat_via_from) != cf3.n(k27Var2.k.guestchat_via_from)) {
                                }
                            }
                            if (hc2.T(mu1Var.e) && mu1Var.e.megagroup && k27Var2.Z0() <= 0 && (messageFwdHeader = k27Var2.k.fwd_from) != null && (messageFwdHeader.saved_from_peer instanceof TLRPC.TL_peerChannel)) {
                                if (!z6) {
                                    z7 = false;
                                }
                                if (!z4) {
                                    z5 = false;
                                }
                            }
                            if (!z6 && (message = k27Var2.k) != null && message.paid_message_stars > 0) {
                                z7 = false;
                            }
                            boolean z20 = false;
                            k27Var2.f6(false);
                            f27 f27Var2 = f27Var;
                            if (f27Var != null) {
                                ArrayList arrayList8 = f27Var2.d;
                                int i27 = 0;
                                while (i27 < arrayList8.size()) {
                                    ((k27) arrayList8.get(i27)).f6(z20);
                                    i27++;
                                    z20 = false;
                                }
                            }
                            if (mu1Var.nb) {
                                z9 = z5;
                                z10 = z7;
                            } else {
                                if (f27Var2 != null) {
                                    z11 = true;
                                    z9 = false;
                                    z10 = false;
                                    gb2Var.setShowTopic(z11);
                                    gb2Var.z3(k27Var2, f27Var2, z9, z10, z8, z19);
                                    gb2Var.setSpoilersSuppressed(mu1Var.A0.getScrollState() != 0);
                                    gb2Var.setHighlighted(mu1Var.d8 == Integer.MAX_VALUE && k27Var2.e1() == mu1Var.d8);
                                    if (gb2Var.x6) {
                                        if (mu1Var.h8 != null) {
                                            long currentTimeMillis = System.currentTimeMillis();
                                            gb2Var.w3(true, mu1Var.k8, mu1Var.h8, mu1Var.f8 || currentTimeMillis - mu1Var.g8 < 200);
                                            if (mu1Var.f8) {
                                                mu1Var.g8 = currentTimeMillis;
                                            }
                                            mu1Var.f8 = false;
                                        } else {
                                            Integer num = mu1Var.i8;
                                            if (num != null) {
                                                gb2Var.u3(num.intValue());
                                            } else {
                                                byte[] bArr = mu1Var.j8;
                                                if (bArr != null) {
                                                    gb2Var.s3(bArr);
                                                }
                                            }
                                        }
                                        if (mu1Var.d8 != Integer.MAX_VALUE) {
                                            mu1Var.sc();
                                        }
                                        indexOf = arrayList3.indexOf(k27Var2);
                                        if (indexOf != -1) {
                                            if (k27Var2.D == 5 && (qVar = mu1Var.q3) != null && qVar.getTextureView() != null) {
                                                wl1 wl1Var = mu1Var.I7;
                                                if (wl1Var != null) {
                                                    gl.r(wl1Var);
                                                    mu1Var.I7 = null;
                                                }
                                                gb2Var.getViewTreeObserver().addOnPreDrawListener(new ts1(this, gb2Var, (byte) 0));
                                            } else if ((k27Var2.M2() && !k27Var2.I2()) || ((g27Var = k27Var2.N1) != null && g27Var.h)) {
                                                if (!k27Var2.N1.h || (ar1Var = mu1Var.a0) == null || ar1Var.M0 == null) {
                                                    gb2Var.getViewTreeObserver().addOnPreDrawListener(new ts1(this, gb2Var, (byte) 1));
                                                } else {
                                                    aVar = ((d) mu1Var).actionBar;
                                                    if (aVar.getVisibility() == 0) {
                                                        aVar2 = ((d) mu1Var).actionBar;
                                                        int translationY = (int) aVar2.getTranslationY();
                                                        aVar3 = ((d) mu1Var).actionBar;
                                                        int measuredHeight = aVar3.getMeasuredHeight() + translationY;
                                                        lr1 lr1Var = mu1Var.D1;
                                                        int currentHeight = measuredHeight + (lr1Var != null ? lr1Var.getCurrentHeight() : 0);
                                                        xq1 xq1Var = mu1Var.E1;
                                                        int currentHeight2 = currentHeight + (xq1Var != null ? xq1Var.getCurrentHeight() : 0);
                                                        z12 = ((d) mu1Var).inPreviewMode;
                                                        i10 = (z12 ? gl.m : 0) + currentHeight2;
                                                    } else {
                                                        i10 = 0;
                                                    }
                                                    float f = i10 + mu1Var.Q9;
                                                    float height = mu1Var.fragmentView == null ? 0.0f : r8.getHeight();
                                                    j47 j47Var = mu1Var.a0.M0;
                                                    Rect rect = j47Var.y0;
                                                    if (!j47Var.u0) {
                                                        j47Var.r = true;
                                                        j47Var.u0 = true;
                                                        a47 a47Var = j47Var.X;
                                                        if (a47Var != null) {
                                                            a47Var.invalidate();
                                                        }
                                                        ky1 ky1Var = j47Var.W;
                                                        if (ky1Var != null) {
                                                            ky1Var.invalidate();
                                                        }
                                                        if (j47Var.Q != null) {
                                                            j47Var.v0 = gb2Var;
                                                            gb2Var.setVisibility(4);
                                                            j47Var.w0 = f;
                                                            j47Var.x0 = height;
                                                            gb2 gb2Var2 = j47Var.Q;
                                                            gb2 gb2Var3 = j47Var.v0;
                                                            gb2Var2.f6 = gb2Var3.f6;
                                                            gb2Var2.o6 = gb2Var3.o6;
                                                            gb2Var2.h6 = gb2Var3.h6;
                                                            gb2Var2.j6 = gb2Var3.j6;
                                                            gb2Var2.l6 = gb2Var3.l6;
                                                            gb2Var2.n6 = gb2Var3.n6;
                                                            gb2Var2.z3(gb2Var.getMessageObject(), null, gb2Var.K2(), gb2Var.L2(), gb2Var.C2(), false);
                                                            nb2 transitionParams = j47Var.Q.getTransitionParams();
                                                            transitionParams.h = j47Var.Q.getTransitionParams().a();
                                                            Rect rect2 = transitionParams.E0;
                                                            transitionParams.L1 = 0.0f;
                                                            if (j47Var.Q.getTransitionParams().E0.left == j47Var.Q.getBackgroundDrawableLeft() && rect2.top == j47Var.Q.getBackgroundDrawableTop() && rect2.bottom == j47Var.Q.getBackgroundDrawableBottom()) {
                                                                b = 1;
                                                            } else {
                                                                rect.bottom = -(j47Var.Q.getBackgroundDrawableBottom() - rect2.bottom);
                                                                rect.top = -(j47Var.Q.getBackgroundDrawableTop() - rect2.top);
                                                                if (gb2Var.getMessageObject().O3()) {
                                                                    rect.left = -(j47Var.Q.getBackgroundDrawableLeft() - rect2.left);
                                                                    rect.right = 0;
                                                                } else {
                                                                    rect.left = 0;
                                                                    rect.right = j47Var.Q.getBackgroundDrawableRight() - rect2.right;
                                                                }
                                                                b = 1;
                                                                transitionParams.x0 = true;
                                                            }
                                                            int i28 = j47Var.Q.Cc;
                                                        } else {
                                                            b = 1;
                                                        }
                                                        j47Var.c(new u37(j47Var, b), false);
                                                        j47Var.F.invalidate();
                                                        kk7.f(j47Var.c).n(j47Var, kk7.v3);
                                                    }
                                                    mu1Var.a0.M0 = null;
                                                }
                                            }
                                            arrayList3.remove(indexOf);
                                            ar1 ar1Var2 = mu1Var.a0;
                                            Runnable runnable = ar1Var2.g0;
                                            if (runnable != null) {
                                                gl.r(runnable);
                                                z13 = true;
                                                ar1Var2.h0 = true;
                                                ar1Var2.g0.run();
                                                ar1Var2.g0 = null;
                                            } else {
                                                z13 = true;
                                            }
                                            mu1Var.a0.N0(z13);
                                        }
                                        if (!hashMap.isEmpty() && hashMap.containsKey(k27Var2.F0())) {
                                            hashMap.remove(k27Var2.F0());
                                            lq1Var = mu1Var.B0;
                                            if (lq1Var != null) {
                                                i92 i92Var = mu1Var.h1;
                                                lq1Var.O = s49Var;
                                                lq1Var.P = i92Var;
                                                r15 = 0;
                                                lq1Var.N = false;
                                                if (gb2Var.Ab) {
                                                    gb2Var.Ab = r15;
                                                    gb2Var.setVisibility(r15);
                                                }
                                                mu1Var.Kb(gb2Var);
                                            }
                                        }
                                        r15 = 0;
                                        if (gb2Var.Ab) {
                                        }
                                        mu1Var.Kb(gb2Var);
                                    }
                                    if (mu1Var.g4 == 7 && mu1Var.J3 != null && (str2 = mu1Var.I3) != null) {
                                        gb2Var.v3(str2);
                                    }
                                    if (mu1Var.d8 != Integer.MAX_VALUE) {
                                    }
                                    indexOf = arrayList3.indexOf(k27Var2);
                                    if (indexOf != -1) {
                                    }
                                    if (!hashMap.isEmpty()) {
                                        hashMap.remove(k27Var2.F0());
                                        lq1Var = mu1Var.B0;
                                        if (lq1Var != null) {
                                        }
                                    }
                                    r15 = 0;
                                    if (gb2Var.Ab) {
                                    }
                                    mu1Var.Kb(gb2Var);
                                }
                                z10 = z5;
                                z9 = z7;
                            }
                            z11 = true;
                            gb2Var.setShowTopic(z11);
                            gb2Var.z3(k27Var2, f27Var2, z9, z10, z8, z19);
                            gb2Var.setSpoilersSuppressed(mu1Var.A0.getScrollState() != 0);
                            gb2Var.setHighlighted(mu1Var.d8 == Integer.MAX_VALUE && k27Var2.e1() == mu1Var.d8);
                            if (gb2Var.x6) {
                            }
                            if (mu1Var.g4 == 7) {
                                gb2Var.v3(str2);
                            }
                            if (mu1Var.d8 != Integer.MAX_VALUE) {
                            }
                            indexOf = arrayList3.indexOf(k27Var2);
                            if (indexOf != -1) {
                            }
                            if (!hashMap.isEmpty()) {
                            }
                            r15 = 0;
                            if (gb2Var.Ab) {
                            }
                            mu1Var.Kb(gb2Var);
                        }
                    }
                    f27Var = n7;
                    if (hc2.T(mu1Var.e)) {
                        if (!z6) {
                        }
                        if (!z4) {
                        }
                    }
                    if (!z6) {
                        z7 = false;
                    }
                    boolean z202 = false;
                    k27Var2.f6(false);
                    f27 f27Var22 = f27Var;
                    if (f27Var != null) {
                    }
                    if (mu1Var.nb) {
                    }
                    z11 = true;
                    gb2Var.setShowTopic(z11);
                    gb2Var.z3(k27Var2, f27Var22, z9, z10, z8, z19);
                    gb2Var.setSpoilersSuppressed(mu1Var.A0.getScrollState() != 0);
                    gb2Var.setHighlighted(mu1Var.d8 == Integer.MAX_VALUE && k27Var2.e1() == mu1Var.d8);
                    if (gb2Var.x6) {
                    }
                    if (mu1Var.g4 == 7) {
                    }
                    if (mu1Var.d8 != Integer.MAX_VALUE) {
                    }
                    indexOf = arrayList3.indexOf(k27Var2);
                    if (indexOf != -1) {
                    }
                    if (!hashMap.isEmpty()) {
                    }
                    r15 = 0;
                    if (gb2Var.Ab) {
                    }
                    mu1Var.Kb(gb2Var);
                }
                z3 = false;
                gb2Var.q6 = z3;
                i5 = mu1Var.g4;
                if (i5 != 1) {
                }
                arrayList = arrayList4;
                j = 0;
                gb2Var.t6 = j;
                if (i5 == 7) {
                }
                gb2Var.u6 = l7c.B(mu1Var.f);
                gb2Var.v6 = mu1Var.g4 == 2;
                gb2Var.W6 = mu1Var.K7();
                gb2Var.X6 = mu1Var.W7();
                gb2Var.Y6 = mu1Var.V7();
                gb2Var.Z6 = mu1Var.f7();
                gb2Var.a7 = mu1Var.g7();
                if (k27Var2.q4()) {
                }
                int i212 = i + 2;
                if (n7 != null) {
                }
                int d32 = d(i6);
                d = d(i7);
                d(i212);
                if (k27Var2.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) {
                }
                arrayList2 = arrayList;
                i8 = i7;
                i9 = i8 - this.K;
                if (i9 >= 0) {
                }
                z8 = true;
                int i262 = this.K;
                if (i == i262) {
                }
                if (d == s49Var.f) {
                }
                f27Var = n7;
                if (hc2.T(mu1Var.e)) {
                }
                if (!z6) {
                }
                boolean z2022 = false;
                k27Var2.f6(false);
                f27 f27Var222 = f27Var;
                if (f27Var != null) {
                }
                if (mu1Var.nb) {
                }
                z11 = true;
                gb2Var.setShowTopic(z11);
                gb2Var.z3(k27Var2, f27Var222, z9, z10, z8, z19);
                gb2Var.setSpoilersSuppressed(mu1Var.A0.getScrollState() != 0);
                gb2Var.setHighlighted(mu1Var.d8 == Integer.MAX_VALUE && k27Var2.e1() == mu1Var.d8);
                if (gb2Var.x6) {
                }
                if (mu1Var.g4 == 7) {
                }
                if (mu1Var.d8 != Integer.MAX_VALUE) {
                }
                indexOf = arrayList3.indexOf(k27Var2);
                if (indexOf != -1) {
                }
                if (!hashMap.isEmpty()) {
                }
                r15 = 0;
                if (gb2Var.Ab) {
                }
                mu1Var.Kb(gb2Var);
            }
        }
        z2 = false;
        gb2Var.p6 = z2;
        if (mu1Var.g4 == 0) {
        }
        z3 = false;
        gb2Var.q6 = z3;
        i5 = mu1Var.g4;
        if (i5 != 1) {
        }
        arrayList = arrayList4;
        j = 0;
        gb2Var.t6 = j;
        if (i5 == 7) {
        }
        gb2Var.u6 = l7c.B(mu1Var.f);
        gb2Var.v6 = mu1Var.g4 == 2;
        gb2Var.W6 = mu1Var.K7();
        gb2Var.X6 = mu1Var.W7();
        gb2Var.Y6 = mu1Var.V7();
        gb2Var.Z6 = mu1Var.f7();
        gb2Var.a7 = mu1Var.g7();
        if (k27Var2.q4()) {
        }
        int i2122 = i + 2;
        if (n7 != null) {
        }
        int d322 = d(i6);
        d = d(i7);
        d(i2122);
        if (k27Var2.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) {
        }
        arrayList2 = arrayList;
        i8 = i7;
        i9 = i8 - this.K;
        if (i9 >= 0) {
        }
        z8 = true;
        int i2622 = this.K;
        if (i == i2622) {
        }
        if (d == s49Var.f) {
        }
        f27Var = n7;
        if (hc2.T(mu1Var.e)) {
        }
        if (!z6) {
        }
        boolean z20222 = false;
        k27Var2.f6(false);
        f27 f27Var2222 = f27Var;
        if (f27Var != null) {
        }
        if (mu1Var.nb) {
        }
        z11 = true;
        gb2Var.setShowTopic(z11);
        gb2Var.z3(k27Var2, f27Var2222, z9, z10, z8, z19);
        gb2Var.setSpoilersSuppressed(mu1Var.A0.getScrollState() != 0);
        gb2Var.setHighlighted(mu1Var.d8 == Integer.MAX_VALUE && k27Var2.e1() == mu1Var.d8);
        if (gb2Var.x6) {
        }
        if (mu1Var.g4 == 7) {
        }
        if (mu1Var.d8 != Integer.MAX_VALUE) {
        }
        indexOf = arrayList3.indexOf(k27Var2);
        if (indexOf != -1) {
        }
        if (!hashMap.isEmpty()) {
        }
        r15 = 0;
        if (gb2Var.Ab) {
        }
        mu1Var.Kb(gb2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v17, types: [eq0, rs1] */
    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        int i2;
        int i3;
        ss1 ss1Var;
        int i4;
        View view2;
        int i5;
        mu1 mu1Var = this.R;
        if (i == 0) {
            i5 = ((d) mu1Var).currentAccount;
            gb2 gb2Var = new gb2(this.h, i5, true, mu1Var.Za, mu1Var.Ba);
            gb2Var.setResourcesProvider(mu1Var.Ba);
            wt1 wt1Var = mu1Var.Xc;
            if (wt1Var == null) {
                wt1Var = new wt1(mu1Var);
                mu1Var.Xc = wt1Var;
            }
            gb2Var.setDelegate(wt1Var);
            gb2Var.jc = mu1Var.tc;
            view = gb2Var;
            if (mu1Var.h == null) {
                gb2Var.setAllowAssistant(true);
                view = gb2Var;
            }
        } else {
            Context context = this.h;
            if (i == 1) {
                ns1 ns1Var = new ns1(mu1Var.Ba, context, true);
                ns1Var.setInvalidateColors(true);
                ns1Var.setDelegate(new qs1(this));
                view = ns1Var;
            } else {
                if (i == 2) {
                    ke2 ke2Var = new ke2(context, mu1Var.Ba);
                    view2 = ke2Var;
                    if (!mu1Var.M7()) {
                        zkb.X(ke2Var.getTextView(), bkb.vf, mu1Var.Ba);
                        zkb.x(ke2Var.getBackgroundLayout(), ke2Var.getBackgroundLayout().getBackground(), bkb.wf, mu1Var.Ba, PorterDuff.Mode.MULTIPLY);
                        view2 = ke2Var;
                    }
                } else {
                    if (i == 3) {
                        i4 = ((d) mu1Var).currentAccount;
                        ?? rs1Var = new rs1(this, context, i4, mu1Var.Ba);
                        rs1Var.setDelegate(new rh1((Object) this, (byte) 9));
                        ss1Var = rs1Var;
                    } else if (i == 4) {
                        view2 = new ma2(context, mu1Var.Ba);
                    } else if (i == 6) {
                        i3 = ((d) mu1Var).currentAccount;
                        view2 = new g7c(i3, mu1Var.Ba, context);
                    } else if (i == 7) {
                        view2 = new uk1(mu1Var.Ba, context, false);
                    } else if (i == 8) {
                        i2 = ((d) mu1Var).currentAccount;
                        ss1Var = new ss1(this, context, i2, mu1Var.Ba);
                    } else if (i == 10) {
                        ob2 ob2Var = new ob2(context, mu1Var.Ba);
                        wt1 wt1Var2 = mu1Var.Xc;
                        if (wt1Var2 == null) {
                            wt1Var2 = new wt1(mu1Var);
                            mu1Var.Xc = wt1Var2;
                        }
                        ob2Var.setDelegate(wt1Var2);
                        view2 = ob2Var;
                    } else {
                        view = null;
                    }
                    view = ss1Var;
                }
                view = view2;
            }
        }
        return ls6.h(view, view, -1, -2);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x023f  */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(s49 s49Var) {
        TLRPC.Message message;
        boolean z;
        boolean z2;
        a aVar;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        String str;
        String V1;
        y97 y97Var;
        mu1 mu1Var = this.R;
        View view = s49Var.a;
        if ((view instanceof gb2) || (view instanceof uk1)) {
            mu1Var.I7();
        }
        boolean z8 = view instanceof gb2;
        boolean z9 = true;
        if (z8) {
            gb2 gb2Var = (gb2) view;
            k27 messageObject = gb2Var.getMessageObject();
            gb2Var.W6 = mu1Var.K7();
            gb2Var.X6 = mu1Var.W7();
            gb2Var.Y6 = mu1Var.V7();
            gb2Var.Z6 = mu1Var.f7();
            gb2Var.a7 = mu1Var.g7();
            gb2Var.J3(-1, true, false);
            k27 k27Var = mu1Var.V3;
            if (k27Var != null && k27Var.T(messageObject)) {
                gb2Var.J3(mu1Var.W3 ? 1 : 0, false, false);
            }
            if (messageObject.G2() && (V1 = messageObject.V1()) != null && (y97Var = (y97) mu1Var.getMessagesController().B3.get(V1.replace("️", ""))) != null) {
                MediaController mediaController = mu1Var.getMediaController();
                j5 accountInstance = mu1Var.getAccountInstance();
                mediaController.getClass();
                Utilities.d.c(new rg((Object) mediaController, (Object) y97Var, (Object) accountInstance, z9, (byte) 23));
            }
            if (messageObject.f6(false)) {
                gb2Var.z3(messageObject, gb2Var.getCurrentMessagesGroup(), gb2Var.K2(), gb2Var.L2(), gb2Var.C2(), gb2Var.G2());
            } else {
                f27 currentMessagesGroup = gb2Var.getCurrentMessagesGroup();
                if (currentMessagesGroup != null) {
                    ArrayList arrayList = currentMessagesGroup.d;
                    for (int i = 0; i < arrayList.size(); i++) {
                        ((k27) arrayList.get(i)).f6(false);
                    }
                }
            }
            aVar = ((d) mu1Var).actionBar;
            if (aVar.y() || mu1Var.T7()) {
                mu1Var.f8 = false;
                mu1Var.g8 = 0L;
                mu1Var.h8 = null;
                ArrayList arrayList2 = mu1Var.p4;
                gb2Var.m3(arrayList2 == null || !arrayList2.contains(messageObject), false);
                int i2 = k27.B0(messageObject.k) == mu1Var.l6 ? 0 : 1;
                if (mu1Var.o6[i2].indexOfKey(messageObject.e1()) >= 0) {
                    mu1Var.vb(messageObject, gb2Var, i2, false);
                    z3 = true;
                } else {
                    gb2Var.setDrawSelectionBackground(false);
                    gb2Var.o3(false, false, false);
                    z3 = false;
                }
                z4 = true;
                z5 = z3;
            } else {
                gb2Var.setDrawSelectionBackground(false);
                gb2Var.o3(false, false, false);
                gb2Var.m3(false, false);
                z5 = false;
                z4 = false;
            }
            gb2Var.n3(!z4, z4 && z5);
            if (mu1Var.g4 != 7 || mu1Var.J3 == null || (str = mu1Var.I3) == null) {
                dr1 dr1Var = mu1Var.g3;
                if (dr1Var != null && dr1Var.getVisibility() == 0) {
                    if (mu1Var.getMediaDataController().c1[k27.B0(messageObject.k) == mu1Var.d7 ? (char) 1 : (char) 0].indexOfKey(messageObject.e1()) >= 0 && mu1Var.getMediaDataController().e1 != null) {
                        gb2Var.v3(mu1Var.getMediaDataController().e1);
                    }
                }
                gb2Var.v3(null);
            } else {
                gb2Var.v3(str);
            }
            z6 = ((d) mu1Var).inPreviewMode;
            if (!z6 || !gb2Var.x6) {
                if (mu1Var.d8 != Integer.MAX_VALUE) {
                    if (gb2Var.getMessageObject() == null || gb2Var.getMessageObject().e1() != mu1Var.d8) {
                        if (gb2Var.getCurrentMessagesGroup() != null) {
                            f27 currentMessagesGroup2 = gb2Var.getCurrentMessagesGroup();
                            int i3 = mu1Var.d8;
                            ArrayList arrayList3 = currentMessagesGroup2.d;
                            for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                                k27 k27Var2 = (k27) arrayList3.get(i4);
                                if (k27Var2 == null || k27Var2.e1() != i3) {
                                }
                            }
                        }
                    }
                    z7 = true;
                    gb2Var.setHighlighted(z7);
                    if (gb2Var.x6) {
                        if (mu1Var.h8 != null) {
                            long currentTimeMillis = System.currentTimeMillis();
                            if (!gb2Var.w3(true, mu1Var.k8, mu1Var.h8, mu1Var.f8 || currentTimeMillis - mu1Var.g8 < 200) && mu1Var.e8) {
                                u21.b0(mu1Var).Q(R.raw.error, 36, k96.M0(2131746242, null)).k(true);
                            }
                            mu1Var.e8 = false;
                            if (mu1Var.f8) {
                                mu1Var.g8 = currentTimeMillis;
                            }
                            mu1Var.f8 = false;
                        } else {
                            Integer num = mu1Var.i8;
                            if (num != null) {
                                gb2Var.u3(num.intValue());
                            } else {
                                byte[] bArr = mu1Var.j8;
                                if (bArr != null) {
                                    gb2Var.s3(bArr);
                                }
                            }
                        }
                    }
                    if (mu1Var.d8 != Integer.MAX_VALUE) {
                        mu1Var.sc();
                    }
                }
                z7 = false;
                gb2Var.setHighlighted(z7);
                if (gb2Var.x6) {
                }
                if (mu1Var.d8 != Integer.MAX_VALUE) {
                }
            }
        } else if (view instanceof uk1) {
            uk1 uk1Var = (uk1) view;
            uk1Var.f0 = mu1Var.K7();
            uk1Var.j0 = mu1Var.W7();
            mu1Var.V7();
            mu1Var.f7();
            uk1Var.k0 = mu1Var.g7();
        } else if (view instanceof ke2) {
            ((ke2) view).getTextView().setTranslationX(mu1Var.g7() / 2.0f);
        }
        int b = s49Var.b();
        int i5 = this.K;
        if (b < i5 || b >= this.L) {
            return;
        }
        k27 k27Var3 = (k27) (this.M ? this.N : this.O ? this.Q : mu1Var.M6).get(b - i5);
        if (k27Var3 == null || (message = k27Var3.k) == null || !message.media_unread || !message.mentioned) {
            return;
        }
        z = ((d) mu1Var).inPreviewMode;
        if (!z && mu1Var.g4 == 0 && !k27.Q4(k27Var3.k) && !k27Var3.g4()) {
            int i6 = mu1Var.D6 - 1;
            mu1Var.D6 = i6;
            if (i6 <= 0) {
                mu1Var.D6 = 0;
                mu1Var.E6 = true;
                mu1Var.ac(false);
            } else {
                mu1Var.y1.c(2, i6, true);
            }
            mu1Var.getMessagesController().p3(hc2.T(mu1Var.e) ? mu1Var.e.id : 0L, k27Var3.e1(), mu1Var.l6);
            k27Var3.k.media_unread = false;
        }
        if (z8) {
            gb2 gb2Var2 = (gb2) view;
            z2 = ((d) mu1Var).inPreviewMode;
            if (z2) {
                gb2Var2.setHighlighted(true);
            } else {
                gb2Var2.r3();
            }
        }
    }
}
