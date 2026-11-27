// default package

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class xo2 extends nx0 implements fn7, s84, kf3 {
    public static final /* synthetic */ int P1 = 0;
    public final q9c A1;
    public final tb B1;
    public final tb C1;
    public final n15 D1;
    public final n15 E1;
    public final View F1;
    public final fp2 G1;
    public final boolean H1;
    public final i61 I1;
    public final Paint J1;
    public ArrayList K1;
    public String L1;
    public String M1;
    public mq5 N1;
    public mq5 O1;
    public final fm0 l1;
    public final fm0 m1;
    public final ir1 n1;
    public final long o1;
    public TLRPC.Chat p1;
    public boolean q1;
    public c51 r1;
    public c51 s1;
    public final e t1;
    public final ro2 u1;
    public final qo2 v1;
    public final qo2 w1;
    public final rq4 x1;
    public final rq4 y1;
    public final yg4 z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo2(e eVar, long j, ArrayList arrayList, i61 i61Var) {
        super(eVar.getResourceProvider(), eVar.getContext(), true, true);
        byte b = 1;
        k43 k43Var = k43.h;
        this.l1 = new fm0(1, this, k43Var, 350L, false);
        this.m1 = new fm0(2, this, k43Var, 350L, false);
        this.D1 = new n15(2);
        this.E1 = new n15(8);
        Paint paint = new Paint(1);
        this.J1 = paint;
        mq5 mq5Var = mq5.e;
        this.N1 = mq5Var;
        this.O1 = mq5Var;
        hl.S(getWindow());
        this.t1 = eVar;
        byte b2 = 0;
        this.H1 = arrayList != null;
        this.K1 = arrayList;
        this.I1 = i61Var;
        Context context = eVar.getContext();
        jn7.f(this.a).b(this, jn7.T);
        jn7.f(this.a).b(this, 2);
        int i = aob.a7;
        paint.setColor(aob.v0(i, this.J0));
        L(i);
        this.b = new so2(this, context);
        ir1 ir1Var = new ir1(b, context, this);
        this.n1 = ir1Var;
        int i2 = this.u0;
        ir1Var.setPadding(i2, 0, i2, 0);
        this.b.addView(this.n1, tre.e(-1, -1, jn7.D1));
        byte b3 = 9;
        this.B1 = new tb(b3, context, this);
        this.C1 = new tb(b3, context, this);
        rq4 rq4Var = new rq4(context, this.J0);
        this.x1 = rq4Var;
        rq4Var.setCloseButtonVisible(true);
        rq4Var.y = true;
        rq4Var.updateColors();
        String M0 = ob6.M0(2131745564, null);
        m7 m7Var = rq4Var.r;
        m7Var.setHint(M0);
        m7Var.addTextChangedListener(new po2(this, b2));
        rq4Var.setVisibility(8);
        rq4 rq4Var2 = new rq4(context, this.J0);
        this.y1 = rq4Var2;
        rq4Var2.setCloseButtonVisible(true);
        rq4Var2.y = true;
        rq4Var2.updateColors();
        String M02 = ob6.M0(2131745564, null);
        m7 m7Var2 = rq4Var2.r;
        m7Var2.setHint(M02);
        m7Var2.addTextChangedListener(new po2(this, b));
        rq4Var2.setVisibility(8);
        q9c q9cVar = new q9c(context, this.a, 0, false, new lo2(this, b2), new mo2(this, b2), null, this.J0);
        this.A1 = q9cVar;
        q9cVar.j(new y(this, (byte) 29));
        q9cVar.setClipToPadding(false);
        q9cVar.setVisibility(8);
        q9cVar.s1();
        q9cVar.g3.r = false;
        q9cVar.setPadding(0, hl.L(52.0f) + hl.m, 0, hl.n);
        yg4 yg4Var = new yg4(eVar);
        this.z1 = yg4Var;
        yg4Var.setVisibility(8);
        yg4Var.setBackground(null);
        byte b4 = 15;
        yg4Var.setChatPreviewDelegate(new z6f(b4));
        yg4Var.setUiCallback(new wz4(this));
        yg4Var.b.setClipToPadding(false);
        this.F1 = new View(getContext());
        Context context2 = getContext();
        vnb vnbVar = this.J0;
        fp2 fp2Var = new fp2(context2, vnbVar, new d31((FrameLayout) this.b, vnbVar), this.a, j);
        this.G1 = fp2Var;
        fp2Var.h = new qx6(this, eVar, b4);
        this.o1 = j;
        this.p1 = uc7.s1(this.a).M0(Long.valueOf(j));
        uc7.s1(this.a).N0(j);
        TLRPC.Chat chat = this.p1;
        this.q1 = chat != null && chat.collapsed_in_dialogs;
        ph4 ph4Var = new ph4(R.drawable.search_users_filled, 4, wf3.t(chat));
        ph4Var.f = this.p1;
        ph4Var.h = false;
        ArrayList arrayList2 = rq4Var.H;
        arrayList2.add(ph4Var);
        rq4Var.K = arrayList2.size() - 1;
        rq4Var.f();
        s0(aob.v0(i, this.J0));
        this.v1 = new qo2(this, context, (byte) 1);
        this.u1 = new ro2(this, context);
        this.w1 = new qo2(this, context, (byte) 0);
        this.n1.setAdapter(new mm2(this, b));
        rq4Var.setCloseButtonOnClickListener(new no2(this, b2));
        rq4Var2.setCloseButtonOnClickListener(new no2(this, b));
        fp2Var.d();
        uc7.s1(this.a).e3(0, j, true);
        v21.a((FrameLayout) this.b, new py((byte) 6));
        ViewGroup viewGroup = this.b;
        mo2 mo2Var = new mo2(this, b);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(viewGroup, mo2Var);
    }

    @Override // nx0
    public final boolean D() {
        if (this.l1.f || this.m1.f) {
            return false;
        }
        View currentView = this.n1.getCurrentView();
        if (currentView instanceof vo2) {
            return ((vo2) currentView).e;
        }
        return true;
    }

    public final boolean E0(b8c b8cVar) {
        Object obj = b8cVar.H;
        if (!(obj instanceof do2)) {
            return false;
        }
        do2 do2Var = (do2) obj;
        long j = do2Var.a;
        TLRPC.Chat M0 = uc7.s1(this.a).M0(Long.valueOf(-j));
        TLRPC.User X1 = uc7.s1(this.a).X1(Long.valueOf(j));
        e eVar = this.t1;
        if (X1 != null) {
            eVar.presentFragment(zu1.ha(X1.id));
            return true;
        }
        if (xc2.t0(M0) || xc2.j0(M0)) {
            eVar.presentFragment(zu1.ha(-M0.id));
            return true;
        }
        new yn2(getContext(), M0, new ea2(this, do2Var, (byte) 22)).show();
        return true;
    }

    public final void F0(ArrayList arrayList, boolean z) {
        String str;
        int i = 0;
        if (!z) {
            arrayList.add(b8c.E(99, (int) (hl.q.y * 0.35f)));
            arrayList.add(b8c.E(0, hl.L(56.0f)));
        }
        if (this.K1 != null) {
            String lowerCase = (!z || (str = this.M1) == null) ? null : str.toLowerCase();
            ArrayList arrayList2 = this.K1;
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (!z || TextUtils.isEmpty(lowerCase)) {
                    arrayList.add(b8c.w(chat));
                } else {
                    String str2 = chat.title;
                    if (str2 != null && str2.toLowerCase().contains(lowerCase)) {
                        arrayList.add(b8c.w(chat));
                    }
                }
            }
        }
    }

    public final void G0(TLRPC.Chat chat, long j, boolean z) {
        long j2 = -chat.id;
        boolean V = xc2.V(chat);
        if (xc2.T(chat)) {
            uc7.s1(this.a).Z2(j2, j, false, z, new oo2(this, V, (byte) 0));
            return;
        }
        id idVar = new id(3, null, getContext());
        idVar.q(250L);
        uc7.s1(this.a).R(getContext(), -j2, null, new on2(this, idVar, j, z, (byte) 1), null);
    }

    @Override // nx0
    public final void H() {
        jn7.f(this.a).n(this, jn7.T);
        jn7.f(this.a).n(this, 2);
        super.H();
    }

    public final void H0(b8c b8cVar) {
        Object obj = b8cVar.H;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (!this.H1) {
                new kn2(getContext(), this.p1, -chat.id, new rx1((Object) this, (Object) chat, (byte) 10)).show();
            } else {
                this.I1.a(chat);
                dismiss();
            }
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = jn7.T;
        long j = this.o1;
        ro2 ro2Var = this.u1;
        if (i == i3) {
            if (((TLRPC.ChatFull) objArr[0]).id == j) {
                ro2Var.d.g3.O(true);
            }
        } else if (i == 2) {
            Integer num = (Integer) objArr[0];
            int intValue = num.intValue();
            int i4 = uc7.s5;
            if ((intValue & TLObject.FLAG_13) == 0 && (num.intValue() & 2) == 0 && (num.intValue() & 8) == 0 && (num.intValue() & 16) == 0) {
                return;
            }
            TLRPC.Chat M0 = uc7.s1(this.a).M0(Long.valueOf(j));
            this.p1 = M0;
            ro2Var.a.setTitle(wf3.l(M0));
            ro2Var.h.f(this.p1, ro2Var.n);
        }
    }

    @Override // kf3
    public final void k(of3 of3Var) {
        if (uc7.s1(this.a).O1().J(of3Var.getDialogId())) {
            e eVar = this.t1;
            eVar.getOrCreateStoryViewer().getClass();
            eVar.getOrCreateStoryViewer().H(eVar.getContext(), of3Var.getDialogId(), l6b.a((d79) of3Var.getParent()));
        }
    }

    @Override // kf3
    public final boolean m() {
        return true;
    }

    @Override // kf3
    public final void o(of3 of3Var) {
        TLRPC.TL_forumTopic f;
        if (of3Var.getMessage() == null || (f = uc7.s1(this.a).h4.f(-of3Var.getDialogId(), r47.b2(this.a, of3Var.getMessage().k, true, false))) == null) {
            return;
        }
        ro4.n(this.t1, -of3Var.getDialogId(), f, 0);
    }

    @Override // nx0, android.app.Dialog
    public final void onBackPressed() {
        ir1 ir1Var = this.n1;
        if (ir1Var.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        if (ir1Var.getCurrentPosition() == 2) {
            fm0 fm0Var = this.m1;
            if (fm0Var.f) {
                this.w1.d.f3.g1(1, this.O1.b);
                fm0Var.a(false, true);
                this.r0 = true;
                rq4 rq4Var = this.y1;
                hl.t1(rq4Var.r);
                rq4Var.r.clearFocus();
                return;
            }
        }
        ir1Var.F(0);
    }

    @Override // nx0
    public final void p0() {
        Paint paint = this.J1;
        try {
            super.p0();
            int v0 = aob.v0(aob.a7, this.J0);
            if (paint.getColor() != v0) {
                s0(v0);
                paint.setColor(v0);
                ViewGroup viewGroup = this.b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        if (i == 1) {
            float a = qke.a(f);
            float R1 = hl.R1(0.9f, 1.0f, a);
            ro2 ro2Var = this.u1;
            ro2Var.a.setAlpha(a);
            ro2Var.a.setScaleX(R1);
            ro2Var.a.setScaleY(R1);
            ro2Var.a.setVisibility(a > 0.0f ? 0 : 8);
            float R12 = hl.R1(0.9f, 1.0f, f);
            rq4 rq4Var = this.x1;
            rq4Var.setAlpha(f);
            rq4Var.setScaleX(R12);
            rq4Var.setScaleY(R12);
            rq4Var.setVisibility(f > 0.0f ? 0 : 8);
            ro2Var.d.setAlpha(a);
            ro2Var.d.setVisibility(a > 0.0f ? 0 : 8);
            this.r1.setAlpha(a);
            this.r1.setScaleX(hl.R1(0.95f, 1.0f, a));
            this.r1.setScaleY(hl.R1(0.95f, 1.0f, a));
            this.r1.setVisibility(a > 0.0f ? 0 : 8);
            yg4 yg4Var = this.z1;
            yg4Var.setAlpha(f);
            yg4Var.setVisibility(f > 0.0f ? 0 : 8);
            this.b.invalidate();
            this.B1.invalidate();
        }
        if (i == 2) {
            float a2 = qke.a(f);
            float R13 = hl.R1(0.9f, 1.0f, a2);
            qo2 qo2Var = this.w1;
            qo2Var.a.setAlpha(a2);
            qo2Var.a.setScaleX(R13);
            qo2Var.a.setScaleY(R13);
            qo2Var.a.setVisibility(a2 > 0.0f ? 0 : 8);
            float R14 = hl.R1(0.9f, 1.0f, f);
            rq4 rq4Var2 = this.y1;
            rq4Var2.setAlpha(f);
            rq4Var2.setScaleX(R14);
            rq4Var2.setScaleY(R14);
            rq4Var2.setVisibility(f > 0.0f ? 0 : 8);
            qo2Var.d.setAlpha(a2);
            qo2Var.d.setVisibility(a2 > 0.0f ? 0 : 8);
            if (!this.H1) {
                this.s1.setAlpha(a2);
                this.s1.setScaleX(hl.R1(0.95f, 1.0f, a2));
                this.s1.setScaleY(hl.R1(0.95f, 1.0f, a2));
                this.s1.setVisibility(a2 > 0.0f ? 0 : 8);
            }
            q9c q9cVar = this.A1;
            q9cVar.setAlpha(f);
            q9cVar.setVisibility(f > 0.0f ? 0 : 8);
            this.b.invalidate();
            this.C1.invalidate();
        }
    }

    @Override // kf3
    public final void r() {
    }

    @Override // kf3
    public final void v(of3 of3Var) {
    }

    @Override // kf3
    public final void w(of3 of3Var) {
    }

    @Override // s84
    public final void v0(float f, int i) {
    }

    public xo2(e eVar, long j) {
        this(eVar, j, null, null);
    }
}
