package sg;

import ag.b1;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.m5;
import org.telegram.messenger.sc;
import org.telegram.messenger.tz;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k1;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.s0;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.r8;
import org.telegram.ui.s21;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k0 {
    public static k0 B;
    public static k0 C;
    public static int D;
    public static long E;
    public boolean A;
    public final int a;
    public final i0 b;
    public final i0 c;
    public final i0 d;
    public final FrameLayout e;
    public final k0 f;
    public float g;
    public float h;
    public final h0 i;
    public WindowManager k;
    public boolean l;
    public float m;
    public final int n;
    public final long o;
    public final o0 p;
    public float q;
    public float r;
    public boolean s;
    public final kj0 t;
    public boolean u;
    public final View v;
    public boolean w;
    public long y;
    public boolean z;
    public final int[] j = new int[2];
    public final ArrayList x = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0205  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v39, types: [org.telegram.messenger.ImageReceiver] */
    /* JADX WARN: Type inference failed for: r5v47, types: [org.telegram.ui.Components.bi0] */
    /* JADX WARN: Type inference failed for: r5v51, types: [org.telegram.ui.Components.bi0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k0(Context context, k2 k2Var, mj0 mj0Var, View view, View view2, float f7, float f10, o0 o0Var, int i10, int i11, boolean z10) {
        jj jjVar;
        Context context2;
        k2 k2Var2;
        View view3;
        m0 m0Var;
        long j10;
        jj jjVar2;
        mj0 mj0Var2;
        View view4;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        int i12;
        int round;
        int i13;
        int i14;
        FrameLayout frameLayout;
        h0 h0Var;
        ?? r15;
        i0 i0Var;
        i0 i0Var2;
        TLRPC.TL_availableReaction tL_availableReaction;
        ?? r11;
        int i15;
        i0 i0Var3;
        jj jjVar3;
        int i16;
        int i17;
        boolean z11;
        un unVar;
        int i18;
        TLRPC.TL_messageReactions tL_messageReactions;
        this.t = null;
        this.z = z10;
        boolean z12 = view instanceof q1;
        if (z12) {
            jjVar = ((q1) view).getMessageObject();
            this.n = jjVar.f1();
            this.o = jjVar.d1();
        } else if (view instanceof s0) {
            jjVar = ((s0) view).getMessageObject();
            this.n = jjVar.f1();
            this.o = 0L;
        } else {
            this.n = 0;
            this.o = 0L;
            jjVar = null;
        }
        this.p = o0Var;
        this.a = i11;
        this.v = view;
        m0 l4 = z12 ? ((q1) view).N.l(o0Var) : view instanceof s0 ? ((s0) view).E0.l(o0Var) : null;
        if (z10 && i11 == 2) {
            view3 = view2;
            m0Var = l4;
            j10 = 0;
            jjVar2 = jjVar;
            mj0Var2 = mj0Var;
            k2Var2 = k2Var;
            k0 k0Var = new k0(context, k2Var2, mj0Var2, view, view3, f7, f10, o0Var, i10, 1, true);
            context2 = context;
            this.f = k0Var;
            C = k0Var;
        } else {
            context2 = context;
            k2Var2 = k2Var;
            view3 = view2;
            m0Var = l4;
            j10 = 0;
            jjVar2 = jjVar;
            mj0Var2 = mj0Var;
        }
        un unVar2 = k2Var2 instanceof un ? (un) k2Var2 : null;
        if (mj0Var2 != null) {
            b1 b1Var = mj0Var2.b;
            int i19 = 0;
            while (true) {
                if (i19 >= b1Var.getChildCount()) {
                    break;
                }
                if ((b1Var.getChildAt(i19) instanceof kj0) && ((kj0) b1Var.getChildAt(i19)).e.equals(this.p)) {
                    this.t = (kj0) b1Var.getChildAt(i19);
                    break;
                }
                i19++;
            }
        }
        int i20 = 1;
        if (i11 == 1) {
            Random random = new Random();
            ArrayList<TLRPC.MessagePeerReaction> arrayList = (jjVar2 == null || (tL_messageReactions = jjVar2.k.reactions) == null) ? null : tL_messageReactions.recent_reactions;
            if (arrayList != null && unVar2 != null && unVar2.a() < j10) {
                int i21 = 0;
                while (i21 < arrayList.size()) {
                    if (this.p.equals(arrayList.get(i21).reaction) && arrayList.get(i21).unread) {
                        r8 r8Var = new r8((p6) null);
                        i18 = i20;
                        ImageReceiver imageReceiver = new ImageReceiver(null);
                        long C1 = jj.C1(arrayList.get(i21).peer_id);
                        if (C1 < j10) {
                            TLRPC.Chat L0 = vp.r1(i10).L0(Long.valueOf(-C1));
                            if (L0 != null) {
                                r8Var.q(L0);
                                imageReceiver.i0(L0, r8Var, null);
                                j0 j0Var = new j0();
                                j0Var.a = imageReceiver;
                                float f16 = 100.0f;
                                j0Var.e = a1.g.c(Math.abs(random.nextInt() % 100), 100.0f, 0.1f, 0.3f);
                                j0Var.h = a1.g.c(Math.abs(random.nextInt() % 100), 100.0f, 0.4f, 0.8f);
                                j0Var.i = (Math.abs(random.nextInt() % 100) * 60) / 100.0f;
                                float f17 = 0.4f;
                                j0Var.b = (int) a1.g.c(Math.abs(random.nextInt() % 100), 100.0f, 200.0f, 400.0f);
                                float f18 = 0.2f;
                                if (this.x.isEmpty()) {
                                    float f19 = 0.0f;
                                    float f20 = 0.0f;
                                    float f21 = 0.0f;
                                    int i22 = 0;
                                    while (i22 < 10) {
                                        un unVar3 = unVar2;
                                        float A = a1.g.A(Math.abs(random.nextInt() % 100), 0.6f, f16, f18);
                                        float A2 = a1.g.A(Math.abs(random.nextInt() % 100), f17, f16, f18);
                                        float f22 = 2.14748365E9f;
                                        for (int i23 = 0; i23 < this.x.size(); i23++) {
                                            float f23 = ((j0) this.x.get(i23)).f - A;
                                            float f24 = ((j0) this.x.get(i23)).g - A2;
                                            float f25 = (f24 * f24) + (f23 * f23);
                                            if (f25 < f22) {
                                                f22 = f25;
                                            }
                                        }
                                        if (f22 > f21) {
                                            f20 = A2;
                                            f19 = A;
                                            f21 = f22;
                                        }
                                        i22++;
                                        unVar2 = unVar3;
                                        f18 = 0.2f;
                                        f16 = 100.0f;
                                        f17 = 0.4f;
                                    }
                                    unVar = unVar2;
                                    j0Var.f = f19;
                                    j0Var.g = f20;
                                } else {
                                    j0Var.f = a1.g.A(Math.abs(random.nextInt() % 100), 0.6f, 100.0f, 0.2f);
                                    j0Var.g = (Math.abs(random.nextInt() % 100) * 0.4f) / 100.0f;
                                    unVar = unVar2;
                                }
                                this.x.add(j0Var);
                            }
                            unVar = unVar2;
                        } else {
                            TLRPC.User Z1 = vp.r1(i10).Z1(Long.valueOf(C1));
                            if (Z1 != null) {
                                r8Var.r(Z1);
                                imageReceiver.i0(Z1, r8Var, null);
                                j0 j0Var2 = new j0();
                                j0Var2.a = imageReceiver;
                                float f162 = 100.0f;
                                j0Var2.e = a1.g.c(Math.abs(random.nextInt() % 100), 100.0f, 0.1f, 0.3f);
                                j0Var2.h = a1.g.c(Math.abs(random.nextInt() % 100), 100.0f, 0.4f, 0.8f);
                                j0Var2.i = (Math.abs(random.nextInt() % 100) * 60) / 100.0f;
                                float f172 = 0.4f;
                                j0Var2.b = (int) a1.g.c(Math.abs(random.nextInt() % 100), 100.0f, 200.0f, 400.0f);
                                float f182 = 0.2f;
                                if (this.x.isEmpty()) {
                                }
                                this.x.add(j0Var2);
                            }
                            unVar = unVar2;
                        }
                    } else {
                        unVar = unVar2;
                        i18 = i20;
                    }
                    i21++;
                    i20 = i18;
                    unVar2 = unVar;
                }
            }
        }
        un unVar4 = unVar2;
        int i24 = i20;
        kj0 kj0Var = this.t;
        ?? r10 = (kj0Var == null && (f7 == 0.0f || f10 == 0.0f)) ? 0 : i24;
        if (view3 == null) {
            if (kj0Var != null) {
                kj0Var.getLocationOnScreen(this.j);
                float x10 = this.j[0] + this.t.b.getX();
                float y3 = this.j[i24] + this.t.b.getY();
                f11 = this.t.getScaleX() * this.t.b.getWidth();
                view4 = view;
                f12 = x10;
                f13 = y3;
            } else {
                if (m0Var != null) {
                    view4 = view;
                    view4.getLocationInWindow(this.j);
                    float f26 = this.j[0];
                    ImageReceiver imageReceiver2 = m0Var.B;
                    f14 = f26 + (imageReceiver2 == null ? 0.0f : imageReceiver2.K0);
                    f15 = r3[i24] + (imageReceiver2 == null ? 0.0f : imageReceiver2.L0);
                    if (imageReceiver2 != null) {
                        f11 = imageReceiver2.N0;
                    }
                } else {
                    view4 = view;
                    if (view4 != null) {
                        ((View) view4.getParent()).getLocationInWindow(this.j);
                        int[] iArr = this.j;
                        f14 = iArr[0] + f7;
                        f15 = iArr[i24] + f10 + (view4 instanceof q1 ? ((q1) view4).V : 0);
                    } else {
                        f11 = 0.0f;
                        f12 = f7;
                        f13 = f10;
                    }
                }
                f11 = 0.0f;
            }
            if (i11 != 2) {
                int L = org.telegram.messenger.i0.L((z10 && tz.j()) ? 60.0f : 34.0f);
                round = (int) ((L * 2.0f) / org.telegram.messenger.i0.p);
                i13 = L;
                i12 = i24;
            } else {
                i12 = i24;
                if (i11 != i12) {
                    int L2 = org.telegram.messenger.i0.L(350.0f);
                    Point point = org.telegram.messenger.i0.q;
                    int round2 = Math.round(Math.min(L2, Math.min(point.x, point.y)) * 0.8f);
                    round = (int) (Math.round(Math.min(org.telegram.messenger.i0.L(350.0f), Math.min(point.x, point.y)) * 0.7f) / org.telegram.messenger.i0.p);
                    i13 = round2;
                } else if (z10) {
                    i13 = org.telegram.messenger.i0.L(tz.j() ? 240.0f : 140.0f);
                    round = tz.j() ? (int) ((org.telegram.messenger.i0.L(80.0f) * 2.0f) / org.telegram.messenger.i0.p) : e();
                } else {
                    i13 = org.telegram.messenger.i0.L(80.0f);
                    round = e();
                }
            }
            float f27 = f11;
            i14 = i13 >> 1;
            int i25 = round >> 1;
            float f28 = f27 / i14;
            this.g = 0.0f;
            this.h = 0.0f;
            frameLayout = new FrameLayout(context2);
            this.e = frameLayout;
            int i26 = round;
            View view5 = view4;
            int i27 = i13;
            jj jjVar4 = jjVar2;
            r15 = i12;
            h0Var = new h0(this, context2, k2Var, view5, z10, jjVar4, unVar4, i14, i11, r10, f28, f12, f13, o0Var);
            this.i = h0Var;
            i0Var = new i0(this, context2);
            this.b = i0Var;
            i0Var2 = new i0(this, context2);
            this.c = i0Var2;
            i0 i0Var4 = new i0(this, context2);
            this.d = i0Var4;
            tL_availableReaction = o0Var.f == null ? (TLRPC.TL_availableReaction) ui.b0(i10).r.get(this.p.f) : null;
            if (tL_availableReaction != null && o0Var.g == j10) {
                this.l = r15;
                return;
            }
            if (tL_availableReaction == null) {
                int i28 = 2;
                if (i11 != 2) {
                    if ((i11 == r15 && sc.e(4112)) || i11 == 0) {
                        TLRPC.Document document = i11 == r15 ? tL_availableReaction.around_animation : tL_availableReaction.effect_animation;
                        String a2 = i11 == r15 ? a() : a1.g.i(i26, i26, "_");
                        ImageReceiver imageReceiver3 = i0Var.getImageReceiver();
                        StringBuilder sb2 = new StringBuilder();
                        int i29 = D;
                        D = i29 + 1;
                        sb2.append(i29);
                        sb2.append("_");
                        imageReceiver3.v1 = a1.g.p(sb2, this.n, "_");
                        i0Var.l(ic.b(document), a2, null, null, 0, null);
                        z11 = false;
                        i0Var.getImageReceiver().W(0);
                        i0Var.getImageReceiver().t0 = false;
                    } else {
                        z11 = false;
                    }
                    if (i0Var.getImageReceiver().B() != null) {
                        i0Var.getImageReceiver().B().N(z11 ? 1 : 0, z11, z11);
                        i0Var.getImageReceiver().B().start();
                    }
                    i28 = 2;
                    r11 = z11;
                } else {
                    r11 = 0;
                }
                if (i11 == i28) {
                    TLRPC.Document document2 = z10 ? tL_availableReaction.select_animation : tL_availableReaction.appear_animation;
                    ImageReceiver imageReceiver4 = i0Var2.getImageReceiver();
                    StringBuilder sb3 = new StringBuilder();
                    int i30 = D;
                    D = i30 + 1;
                    sb3.append(i30);
                    sb3.append("_");
                    imageReceiver4.v1 = a1.g.p(sb3, this.n, "_");
                    i0Var2.l(ic.b(document2), a1.g.i(i25, i25, "_"), null, null, 0, null);
                } else if (i11 == 0) {
                    TLRPC.Document document3 = tL_availableReaction.activate_animation;
                    ImageReceiver imageReceiver5 = i0Var2.getImageReceiver();
                    StringBuilder sb4 = new StringBuilder();
                    int i31 = D;
                    D = i31 + 1;
                    sb4.append(i31);
                    sb4.append("_");
                    imageReceiver5.v1 = a1.g.p(sb4, this.n, "_");
                    i0Var2.l(ic.b(document3), a1.g.i(i25, i25, "_"), null, null, 0, null);
                }
                i0Var3 = i0Var4;
            } else {
                r11 = 0;
                r11 = 0;
                if (i11 == 0) {
                    i15 = i10;
                    f5 f5Var = new f5(r15 == true ? 1 : 0, i15, o0Var.g);
                    f5Var.n(i0Var2);
                    i0Var2.H = f5Var;
                    if (i0Var2.J) {
                        f5Var.a(i0Var2);
                    }
                } else {
                    i15 = i10;
                    if (i11 == 2) {
                        i0Var3 = i0Var4;
                        jjVar3 = jjVar4;
                        f5 f5Var2 = new f5(2, i15, o0Var.g);
                        f5Var2.n(i0Var2);
                        i0Var2.H = f5Var2;
                        if (i0Var2.J) {
                            f5Var2.a(i0Var2);
                        }
                        if (i11 != 0 || i11 == r15) {
                            f5 f5Var3 = new f5(2, i15, o0Var.g);
                            f5Var3.setColorFilter(new PorterDuffColorFilter(jjVar3 == null ? t6.w0(jjVar3.O5() ? jjVar3.P3() ? t6.Gc : t6.qk : jjVar3.P3() ? t6.uk : t6.tk, k2Var != null ? k2Var.getResourceProvider() : null) : -1, PorterDuff.Mode.SRC_IN));
                            boolean z13 = i11 != 0 ? r15 == true ? 1 : 0 : false;
                            i0Var.I = d.a(f5Var3, z13, !z13);
                            h0Var.setClipChildren(false);
                        }
                    }
                }
                i0Var3 = i0Var4;
                jjVar3 = jjVar4;
                if (i11 != 0) {
                }
                f5 f5Var32 = new f5(2, i15, o0Var.g);
                if (jjVar3 == null) {
                }
                f5Var32.setColorFilter(new PorterDuffColorFilter(jjVar3 == null ? t6.w0(jjVar3.O5() ? jjVar3.P3() ? t6.Gc : t6.qk : jjVar3.P3() ? t6.uk : t6.tk, k2Var != null ? k2Var.getResourceProvider() : null) : -1, PorterDuff.Mode.SRC_IN));
                if (i11 != 0) {
                }
                i0Var.I = d.a(f5Var32, z13, !z13);
                h0Var.setClipChildren(false);
            }
            i0Var2.getImageReceiver().W(r11);
            i0Var2.getImageReceiver().t0 = r11;
            if (i0Var2.getImageReceiver().B() != null) {
                if (i11 == 2) {
                    i0Var2.getImageReceiver().B().N(i0Var2.getImageReceiver().B().e[r11] - (r15 == true ? 1 : 0), r11, r11);
                } else {
                    i0Var2.getImageReceiver().B().N(r11, r11, r11);
                    i0Var2.getImageReceiver().B().start();
                }
            }
            i16 = i27 - i14;
            i17 = i16 >> 1;
            i16 = i11 == r15 ? i17 : i16;
            frameLayout.addView(i0Var2);
            i0Var2.getLayoutParams().width = i14;
            i0Var2.getLayoutParams().height = i14;
            ((FrameLayout.LayoutParams) i0Var2.getLayoutParams()).topMargin = i17;
            ((FrameLayout.LayoutParams) i0Var2.getLayoutParams()).leftMargin = i16;
            if (i11 != r15 && !z10) {
                if (tL_availableReaction != null) {
                    i0Var3.getImageReceiver().q0(ic.b(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
                }
                frameLayout.addView(i0Var3);
                i0Var3.getLayoutParams().width = i14;
                i0Var3.getLayoutParams().height = i14;
                ((FrameLayout.LayoutParams) i0Var3.getLayoutParams()).topMargin = i17;
                ((FrameLayout.LayoutParams) i0Var3.getLayoutParams()).leftMargin = i16;
            }
            h0Var.addView(frameLayout);
            frameLayout.getLayoutParams().width = i27;
            frameLayout.getLayoutParams().height = i27;
            int i32 = -i17;
            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i32;
            int i33 = -i16;
            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i33;
            h0Var.addView(i0Var);
            i0Var.getLayoutParams().width = i27;
            i0Var.getLayoutParams().height = i27;
            i0Var.getLayoutParams().width = i27;
            i0Var.getLayoutParams().height = i27;
            ((FrameLayout.LayoutParams) i0Var.getLayoutParams()).topMargin = i32;
            ((FrameLayout.LayoutParams) i0Var.getLayoutParams()).leftMargin = i33;
            frameLayout.setPivotX(i16);
            frameLayout.setPivotY(i17);
        }
        view3.getLocationOnScreen(this.j);
        int[] iArr2 = this.j;
        f14 = iArr2[0];
        f15 = iArr2[i24];
        f11 = view3.getScaleX() * view3.getWidth();
        if (view3 instanceof s21) {
            float f29 = ((s21) view3).G;
            if (f29 > 0.0f) {
                f11 = view3.getWidth() * ((f29 * 2.0f) + 1.0f);
                f14 = m5.y(f11, view3.getWidth(), 2.0f, f14);
                f15 -= f11 - view3.getWidth();
            }
        }
        view4 = view;
        f13 = f15;
        f12 = f14;
        if (i11 != 2) {
        }
        float f272 = f11;
        i14 = i13 >> 1;
        int i252 = round >> 1;
        float f282 = f272 / i14;
        this.g = 0.0f;
        this.h = 0.0f;
        frameLayout = new FrameLayout(context2);
        this.e = frameLayout;
        int i262 = round;
        View view52 = view4;
        int i272 = i13;
        jj jjVar42 = jjVar2;
        r15 = i12;
        h0Var = new h0(this, context2, k2Var, view52, z10, jjVar42, unVar4, i14, i11, r10, f282, f12, f13, o0Var);
        this.i = h0Var;
        i0Var = new i0(this, context2);
        this.b = i0Var;
        i0Var2 = new i0(this, context2);
        this.c = i0Var2;
        i0 i0Var42 = new i0(this, context2);
        this.d = i0Var42;
        if (o0Var.f == null) {
        }
        if (tL_availableReaction != null) {
        }
        if (tL_availableReaction == null) {
        }
        i0Var2.getImageReceiver().W(r11);
        i0Var2.getImageReceiver().t0 = r11;
        if (i0Var2.getImageReceiver().B() != null) {
        }
        i16 = i272 - i14;
        i17 = i16 >> 1;
        if (i11 == r15) {
        }
        frameLayout.addView(i0Var2);
        i0Var2.getLayoutParams().width = i14;
        i0Var2.getLayoutParams().height = i14;
        ((FrameLayout.LayoutParams) i0Var2.getLayoutParams()).topMargin = i17;
        ((FrameLayout.LayoutParams) i0Var2.getLayoutParams()).leftMargin = i16;
        if (i11 != r15) {
            if (tL_availableReaction != null) {
            }
            frameLayout.addView(i0Var3);
            i0Var3.getLayoutParams().width = i14;
            i0Var3.getLayoutParams().height = i14;
            ((FrameLayout.LayoutParams) i0Var3.getLayoutParams()).topMargin = i17;
            ((FrameLayout.LayoutParams) i0Var3.getLayoutParams()).leftMargin = i16;
        }
        h0Var.addView(frameLayout);
        frameLayout.getLayoutParams().width = i272;
        frameLayout.getLayoutParams().height = i272;
        int i322 = -i17;
        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i322;
        int i332 = -i16;
        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i332;
        h0Var.addView(i0Var);
        i0Var.getLayoutParams().width = i272;
        i0Var.getLayoutParams().height = i272;
        i0Var.getLayoutParams().width = i272;
        i0Var.getLayoutParams().height = i272;
        ((FrameLayout.LayoutParams) i0Var.getLayoutParams()).topMargin = i322;
        ((FrameLayout.LayoutParams) i0Var.getLayoutParams()).leftMargin = i332;
        frameLayout.setPivotX(i16);
        frameLayout.setPivotY(i17);
    }

    public static String a() {
        return e() + "_" + e() + "_nolimit_pcache";
    }

    public static void b(boolean z10) {
        int i10 = 0;
        while (i10 < 2) {
            k0 k0Var = i10 == 0 ? B : C;
            if (k0Var != null) {
                if (z10) {
                    k0Var.c();
                } else {
                    k0Var.l = true;
                }
            }
            i10++;
        }
        C = null;
        B = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r22 != 2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r1.isShowing() == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(k2 k2Var, mj0 mj0Var, View view, View view2, float f7, float f10, o0 o0Var, int i10, int i11) {
        if (view == null || o0Var == null || k2Var == null || k2Var.getParentActivity() == null) {
            return;
        }
        boolean z10 = true;
        if (vp.d1().getBoolean("view_animations", true)) {
            if (i11 == 2 || i11 == 0) {
                d(k2Var, null, view, view2, 0.0f, 0.0f, o0Var, i10, 1);
            }
            k0 k0Var = new k0(k2Var.getParentActivity(), k2Var, mj0Var, view, view2, f7, f10, o0Var, i10, i11, false);
            if (i11 == 1) {
                C = k0Var;
            } else {
                B = k0Var;
            }
            if (k2Var instanceof un) {
                un unVar = (un) k2Var;
                if (i11 != 0) {
                }
                k1 k1Var = unVar.e9;
                if (k1Var != null) {
                }
            }
            z10 = false;
            k0Var.w = z10;
            if (z10) {
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.height = -1;
                layoutParams.width = -1;
                layoutParams.type = 1000;
                layoutParams.flags = 65816;
                layoutParams.format = -3;
                WindowManager windowManager = k2Var.getParentActivity().getWindowManager();
                k0Var.k = windowManager;
                org.telegram.messenger.i0.x3(windowManager, k0Var.i, layoutParams);
                k0Var.k.addView(k0Var.i, layoutParams);
            } else {
                ((FrameLayout) k2Var.getParentActivity().getWindow().getDecorView()).addView(k0Var.i);
            }
            view.invalidate();
            if (!(view instanceof q1) || ((q1) view).getCurrentMessagesGroup() == null || view.getParent() == null) {
                return;
            }
            ((View) view.getParent()).invalidate();
        }
    }

    public static int e() {
        return (int) ((org.telegram.messenger.i0.L(40.0f) * 2.0f) / org.telegram.messenger.i0.p);
    }

    public static void f() {
        k0 k0Var = B;
        if (k0Var != null) {
            k0Var.s = true;
            k0Var.y = System.currentTimeMillis();
            if (B.a != 0 || System.currentTimeMillis() - E <= 200) {
                return;
            }
            E = System.currentTimeMillis();
            B.v.performHapticFeedback(3);
            return;
        }
        g();
        k0 k0Var2 = C;
        if (k0Var2 != null) {
            View view = k0Var2.v;
            if (view instanceof q1) {
                ((q1) view).N.b(k0Var2.p);
            } else if (view instanceof s0) {
                ((s0) view).E0.b(k0Var2.p);
            }
        }
    }

    public static void g() {
        k0 k0Var = C;
        if (k0Var == null || k0Var.s) {
            return;
        }
        k0Var.s = true;
        k0Var.y = System.currentTimeMillis();
        if (C.a != 1 || System.currentTimeMillis() - E <= 200) {
            return;
        }
        E = System.currentTimeMillis();
        View view = C.v;
        if (view != null) {
            view.performHapticFeedback(3);
        }
    }

    public final void c() {
        try {
            boolean z10 = this.w;
            h0 h0Var = this.i;
            if (z10) {
                this.k.removeView(h0Var);
            } else {
                org.telegram.messenger.i0.E2(h0Var);
            }
        } catch (Exception unused) {
        }
    }
}
