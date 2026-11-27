// default package

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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class s49 {
    public static s49 B;
    public static s49 C;
    public static int D;
    public static long E;
    public boolean A;
    public final int a;
    public final q49 b;
    public final q49 c;
    public final q49 d;
    public final FrameLayout e;
    public final s49 f;
    public float g;
    public float h;
    public final p49 i;
    public WindowManager k;
    public boolean l;
    public float m;
    public final int n;
    public final long o;
    public final w49 p;
    public float q;
    public float r;
    public boolean s;
    public final g49 t;
    public boolean u;
    public final View v;
    public boolean w;
    public long y;
    public boolean z;
    public final int[] j = new int[2];
    public final ArrayList x = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0203  */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v86 */
    /* JADX WARN: Type inference failed for: r6v87 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s49(Context context, e eVar, i49 i49Var, View view, View view2, float f, float f2, w49 w49Var, int i, int i2, boolean z) {
        r47 r47Var;
        Context context2;
        e eVar2;
        View view3;
        u49 u49Var;
        long j;
        r47 r47Var2;
        i49 i49Var2;
        View view4;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int round;
        int i3;
        int i4;
        FrameLayout frameLayout;
        q49 q49Var;
        q49 q49Var2;
        TLRPC.TL_availableReaction tL_availableReaction;
        ?? r6;
        int i5;
        TLRPC.Document document;
        String m;
        int i6;
        int i7;
        zu1 zu1Var;
        int i8;
        TLRPC.TL_messageReactions tL_messageReactions;
        this.t = null;
        this.z = z;
        boolean z2 = view instanceof wb2;
        if (z2) {
            r47Var = ((wb2) view).getMessageObject();
            this.n = r47Var.e1();
            this.o = r47Var.c1();
        } else if (view instanceof dl1) {
            r47Var = ((dl1) view).getMessageObject();
            this.n = r47Var.e1();
            this.o = 0L;
        } else {
            this.n = 0;
            this.o = 0L;
            r47Var = null;
        }
        this.p = w49Var;
        this.a = i2;
        this.v = view;
        u49 k = z2 ? ((wb2) view).O.k(w49Var) : view instanceof dl1 ? ((dl1) view).F0.k(w49Var) : null;
        if (z && i2 == 2) {
            view3 = view2;
            u49Var = k;
            j = 0;
            r47Var2 = r47Var;
            i49Var2 = i49Var;
            eVar2 = eVar;
            s49 s49Var = new s49(context, eVar2, i49Var2, view, view3, f, f2, w49Var, i, 1, true);
            context2 = context;
            this.f = s49Var;
            C = s49Var;
        } else {
            context2 = context;
            eVar2 = eVar;
            view3 = view2;
            u49Var = k;
            j = 0;
            r47Var2 = r47Var;
            i49Var2 = i49Var;
        }
        zu1 zu1Var2 = eVar2 instanceof zu1 ? (zu1) eVar2 : null;
        if (i49Var2 != null) {
            gu guVar = i49Var2.b;
            int i9 = 0;
            while (true) {
                if (i9 >= guVar.getChildCount()) {
                    break;
                }
                if ((guVar.getChildAt(i9) instanceof g49) && ((g49) guVar.getChildAt(i9)).e.equals(this.p)) {
                    this.t = (g49) guVar.getChildAt(i9);
                    break;
                }
                i9++;
            }
        }
        int i10 = 1;
        if (i2 == 1) {
            Random random = new Random();
            ArrayList<TLRPC.MessagePeerReaction> arrayList = (r47Var2 == null || (tL_messageReactions = r47Var2.k.reactions) == null) ? null : tL_messageReactions.recent_reactions;
            if (arrayList != null && zu1Var2 != null && zu1Var2.a() < j) {
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    if (this.p.equals(arrayList.get(i11).reaction) && arrayList.get(i11).unread) {
                        rb0 rb0Var = new rb0((vnb) null);
                        i8 = i10;
                        ImageReceiver imageReceiver = new ImageReceiver(null);
                        long B1 = r47.B1(arrayList.get(i11).peer_id);
                        if (B1 < j) {
                            TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-B1));
                            if (M0 != null) {
                                rb0Var.p(M0);
                                imageReceiver.U(M0, rb0Var, null);
                                r49 r49Var = new r49();
                                r49Var.a = imageReceiver;
                                float f8 = 100.0f;
                                r49Var.e = c00.B(Math.abs(random.nextInt() % 100), 100.0f, 0.1f, 0.3f);
                                r49Var.h = c00.B(Math.abs(random.nextInt() % 100), 100.0f, 0.4f, 0.8f);
                                r49Var.i = (Math.abs(random.nextInt() % 100) * 60) / 100.0f;
                                float f9 = 0.4f;
                                r49Var.b = (int) c00.B(Math.abs(random.nextInt() % 100), 100.0f, 200.0f, 400.0f);
                                float f10 = 0.2f;
                                if (this.x.isEmpty()) {
                                    float f11 = 0.0f;
                                    float f12 = 0.0f;
                                    float f13 = 0.0f;
                                    int i12 = 0;
                                    while (i12 < 10) {
                                        zu1 zu1Var3 = zu1Var2;
                                        float d = qu6.d(Math.abs(random.nextInt() % 100), 0.6f, f8, f10);
                                        float d2 = qu6.d(Math.abs(random.nextInt() % 100), f9, f8, f10);
                                        float f14 = 2.1474836E9f;
                                        for (int i13 = 0; i13 < this.x.size(); i13++) {
                                            float f15 = ((r49) this.x.get(i13)).f - d;
                                            float f16 = ((r49) this.x.get(i13)).g - d2;
                                            float f17 = (f16 * f16) + (f15 * f15);
                                            if (f17 < f14) {
                                                f14 = f17;
                                            }
                                        }
                                        if (f14 > f13) {
                                            f12 = d2;
                                            f11 = d;
                                            f13 = f14;
                                        }
                                        i12++;
                                        zu1Var2 = zu1Var3;
                                        f8 = 100.0f;
                                        f10 = 0.2f;
                                        f9 = 0.4f;
                                    }
                                    zu1Var = zu1Var2;
                                    r49Var.f = f11;
                                    r49Var.g = f12;
                                } else {
                                    r49Var.f = qu6.d(Math.abs(random.nextInt() % 100), 0.6f, 100.0f, 0.2f);
                                    r49Var.g = (Math.abs(random.nextInt() % 100) * 0.4f) / 100.0f;
                                    zu1Var = zu1Var2;
                                }
                                this.x.add(r49Var);
                            }
                            zu1Var = zu1Var2;
                        } else {
                            TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(B1));
                            if (X1 != null) {
                                rb0Var.q(X1);
                                imageReceiver.U(X1, rb0Var, null);
                                r49 r49Var2 = new r49();
                                r49Var2.a = imageReceiver;
                                float f82 = 100.0f;
                                r49Var2.e = c00.B(Math.abs(random.nextInt() % 100), 100.0f, 0.1f, 0.3f);
                                r49Var2.h = c00.B(Math.abs(random.nextInt() % 100), 100.0f, 0.4f, 0.8f);
                                r49Var2.i = (Math.abs(random.nextInt() % 100) * 60) / 100.0f;
                                float f92 = 0.4f;
                                r49Var2.b = (int) c00.B(Math.abs(random.nextInt() % 100), 100.0f, 200.0f, 400.0f);
                                float f102 = 0.2f;
                                if (this.x.isEmpty()) {
                                }
                                this.x.add(r49Var2);
                            }
                            zu1Var = zu1Var2;
                        }
                    } else {
                        zu1Var = zu1Var2;
                        i8 = i10;
                    }
                    i11++;
                    i10 = i8;
                    zu1Var2 = zu1Var;
                }
            }
        }
        zu1 zu1Var4 = zu1Var2;
        int i14 = i10;
        g49 g49Var = this.t;
        boolean z3 = (g49Var == null && (f == 0.0f || f2 == 0.0f)) ? 0 : i14;
        if (view3 == null) {
            if (g49Var != null) {
                g49Var.getLocationOnScreen(this.j);
                float x = this.j[0] + this.t.b.getX();
                float y = this.j[i14] + this.t.b.getY();
                f3 = this.t.getScaleX() * this.t.b.getWidth();
                view4 = view;
                f4 = x;
                f5 = y;
            } else {
                if (u49Var != null) {
                    view4 = view;
                    view4.getLocationInWindow(this.j);
                    float f18 = this.j[0];
                    ImageReceiver imageReceiver2 = u49Var.B;
                    f6 = f18 + (imageReceiver2 == null ? 0.0f : imageReceiver2.L0);
                    f7 = r3[i14] + (imageReceiver2 == null ? 0.0f : imageReceiver2.M0);
                    if (imageReceiver2 != null) {
                        f3 = imageReceiver2.O0;
                    }
                } else {
                    view4 = view;
                    if (view4 != null) {
                        ((View) view4.getParent()).getLocationInWindow(this.j);
                        int[] iArr = this.j;
                        f6 = iArr[0] + f;
                        f7 = iArr[i14] + f2 + (view4 instanceof wb2 ? ((wb2) view4).W : 0);
                    } else {
                        f3 = 0.0f;
                        f4 = f;
                        f5 = f2;
                    }
                }
                f3 = 0.0f;
            }
            if (i2 != 2) {
                int L = hl.L((z && xea.j()) ? 60.0f : 34.0f);
                round = (int) ((L * 2.0f) / hl.p);
                i3 = L;
            } else if (i2 != i14) {
                int L2 = hl.L(350.0f);
                Point point = hl.q;
                int round2 = Math.round(Math.min(L2, Math.min(point.x, point.y)) * 0.8f);
                round = (int) (Math.round(Math.min(hl.L(350.0f), Math.min(point.x, point.y)) * 0.7f) / hl.p);
                i3 = round2;
            } else if (z) {
                int L3 = hl.L(xea.j() ? 240.0f : 140.0f);
                round = xea.j() ? (int) ((hl.L(80.0f) * 2.0f) / hl.p) : e();
                i3 = L3;
            } else {
                i3 = hl.L(80.0f);
                round = e();
            }
            float f19 = f3;
            i4 = i3 >> 1;
            int i15 = round >> 1;
            float f20 = f19 / i4;
            this.g = 0.0f;
            this.h = 0.0f;
            frameLayout = new FrameLayout(context2);
            this.e = frameLayout;
            int i16 = i3;
            int i17 = round;
            View view5 = view4;
            r47 r47Var3 = r47Var2;
            p49 p49Var = new p49(this, context2, eVar, view5, z, r47Var3, zu1Var4, i4, i2, z3, f20, f4, f5, w49Var);
            this.i = p49Var;
            q49 q49Var3 = new q49(this, context2);
            this.b = q49Var3;
            q49Var = new q49(this, context2);
            this.c = q49Var;
            q49Var2 = new q49(this, context2);
            this.d = q49Var2;
            tL_availableReaction = w49Var.f == null ? (TLRPC.TL_availableReaction) ls6.d0(i).r.get(this.p.f) : null;
            if (tL_availableReaction == null) {
                r6 = 0;
                r6 = 0;
                r6 = 0;
                i5 = 1;
                int i18 = 2;
                if (i2 != 2) {
                    if ((i2 == 1 && i86.e(4112)) || i2 == 0) {
                        if (i2 == 1) {
                            document = tL_availableReaction.around_animation;
                            m = a();
                        } else {
                            document = tL_availableReaction.effect_animation;
                            m = qd4.m(i17, i17, "_");
                        }
                        ImageReceiver imageReceiver3 = q49Var3.getImageReceiver();
                        StringBuilder sb = new StringBuilder();
                        int i19 = D;
                        D = i19 + 1;
                        sb.append(i19);
                        sb.append("_");
                        imageReceiver3.w1 = uh9.l(sb, this.n, "_");
                        q49Var3.h(jn5.b(document), m, null, null, 0, null);
                        q49Var3.getImageReceiver().M(0);
                        q49Var3.getImageReceiver().u0 = false;
                    }
                    if (q49Var3.getImageReceiver().y() != null) {
                        q49Var3.getImageReceiver().y().I(0, false, false);
                        q49Var3.getImageReceiver().y().start();
                    }
                    i18 = 2;
                }
                if (i2 == i18) {
                    TLRPC.Document document2 = z ? tL_availableReaction.select_animation : tL_availableReaction.appear_animation;
                    ImageReceiver imageReceiver4 = q49Var.getImageReceiver();
                    StringBuilder sb2 = new StringBuilder();
                    int i20 = D;
                    D = i20 + 1;
                    sb2.append(i20);
                    sb2.append("_");
                    imageReceiver4.w1 = uh9.l(sb2, this.n, "_");
                    q49Var.h(jn5.b(document2), qd4.m(i15, i15, "_"), null, null, 0, null);
                } else if (i2 == 0) {
                    TLRPC.Document document3 = tL_availableReaction.activate_animation;
                    ImageReceiver imageReceiver5 = q49Var.getImageReceiver();
                    StringBuilder sb3 = new StringBuilder();
                    int i21 = D;
                    D = i21 + 1;
                    sb3.append(i21);
                    sb3.append("_");
                    imageReceiver5.w1 = uh9.l(sb3, this.n, "_");
                    q49Var.h(jn5.b(document3), qd4.m(i15, i15, "_"), null, null, 0, null);
                }
            } else {
                if (w49Var.g == j) {
                    this.l = true;
                    return;
                }
                if (i2 == 0) {
                    i5 = 1;
                    wl wlVar = new wl(1, i, w49Var.g);
                    wlVar.o(q49Var);
                    q49Var.I = wlVar;
                    if (q49Var.K) {
                        wlVar.b(q49Var);
                    }
                } else {
                    i5 = 1;
                    if (i2 == 2) {
                        wl wlVar2 = new wl(2, i, w49Var.g);
                        wlVar2.o(q49Var);
                        q49Var.I = wlVar2;
                        if (q49Var.K) {
                            wlVar2.b(q49Var);
                        }
                    }
                }
                if (i2 == 0 || i2 == i5) {
                    wl wlVar3 = new wl(2, i, w49Var.g);
                    wlVar3.setColorFilter(new PorterDuffColorFilter(r47Var3 != null ? aob.v0(r47Var3.O5() ? r47Var3.O3() ? aob.Jc : aob.tk : r47Var3.O3() ? aob.xk : aob.wk, eVar != null ? eVar.getResourceProvider() : null) : -1, PorterDuff.Mode.SRC_IN));
                    boolean z4 = i2 == 0 ? i5 : 0;
                    q49Var3.J = yl.a(wlVar3, z4, !z4);
                    r6 = 0;
                    p49Var.setClipChildren(false);
                } else {
                    r6 = 0;
                }
            }
            q49Var.getImageReceiver().M(r6);
            q49Var.getImageReceiver().u0 = r6;
            if (q49Var.getImageReceiver().y() != null) {
                if (i2 == 2) {
                    q49Var.getImageReceiver().y().I(q49Var.getImageReceiver().y().e[r6] - i5, r6, r6);
                } else {
                    q49Var.getImageReceiver().y().I(r6, r6, r6);
                    q49Var.getImageReceiver().y().start();
                }
            }
            i6 = i16 - i4;
            i7 = i6 >> 1;
            i6 = i2 == i5 ? i7 : i6;
            frameLayout.addView(q49Var);
            q49Var.getLayoutParams().width = i4;
            q49Var.getLayoutParams().height = i4;
            ((FrameLayout.LayoutParams) q49Var.getLayoutParams()).topMargin = i7;
            ((FrameLayout.LayoutParams) q49Var.getLayoutParams()).leftMargin = i6;
            if (i2 != i5 && !z) {
                if (tL_availableReaction != null) {
                    q49Var2.getImageReceiver().d0(jn5.b(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
                }
                frameLayout.addView(q49Var2);
                q49Var2.getLayoutParams().width = i4;
                q49Var2.getLayoutParams().height = i4;
                ((FrameLayout.LayoutParams) q49Var2.getLayoutParams()).topMargin = i7;
                ((FrameLayout.LayoutParams) q49Var2.getLayoutParams()).leftMargin = i6;
            }
            p49Var.addView(frameLayout);
            frameLayout.getLayoutParams().width = i16;
            frameLayout.getLayoutParams().height = i16;
            int i22 = -i7;
            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i22;
            int i23 = -i6;
            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i23;
            p49Var.addView(q49Var3);
            q49Var3.getLayoutParams().width = i16;
            q49Var3.getLayoutParams().height = i16;
            q49Var3.getLayoutParams().width = i16;
            q49Var3.getLayoutParams().height = i16;
            ((FrameLayout.LayoutParams) q49Var3.getLayoutParams()).topMargin = i22;
            ((FrameLayout.LayoutParams) q49Var3.getLayoutParams()).leftMargin = i23;
            frameLayout.setPivotX(i6);
            frameLayout.setPivotY(i7);
        }
        view3.getLocationOnScreen(this.j);
        int[] iArr2 = this.j;
        f6 = iArr2[0];
        f7 = iArr2[i14];
        f3 = view3.getScaleX() * view3.getWidth();
        if (view3 instanceof w0a) {
            float f21 = ((w0a) view3).H;
            if (f21 > 0.0f) {
                f3 = view3.getWidth() * ((f21 * 2.0f) + 1.0f);
                f6 = qd4.x(f3, view3.getWidth(), 2.0f, f6);
                f7 -= f3 - view3.getWidth();
            }
        }
        view4 = view;
        f5 = f7;
        f4 = f6;
        if (i2 != 2) {
        }
        float f192 = f3;
        i4 = i3 >> 1;
        int i152 = round >> 1;
        float f202 = f192 / i4;
        this.g = 0.0f;
        this.h = 0.0f;
        frameLayout = new FrameLayout(context2);
        this.e = frameLayout;
        int i162 = i3;
        int i172 = round;
        View view52 = view4;
        r47 r47Var32 = r47Var2;
        p49 p49Var2 = new p49(this, context2, eVar, view52, z, r47Var32, zu1Var4, i4, i2, z3, f202, f4, f5, w49Var);
        this.i = p49Var2;
        q49 q49Var32 = new q49(this, context2);
        this.b = q49Var32;
        q49Var = new q49(this, context2);
        this.c = q49Var;
        q49Var2 = new q49(this, context2);
        this.d = q49Var2;
        if (w49Var.f == null) {
        }
        if (tL_availableReaction == null) {
        }
        q49Var.getImageReceiver().M(r6);
        q49Var.getImageReceiver().u0 = r6;
        if (q49Var.getImageReceiver().y() != null) {
        }
        i6 = i162 - i4;
        i7 = i6 >> 1;
        if (i2 == i5) {
        }
        frameLayout.addView(q49Var);
        q49Var.getLayoutParams().width = i4;
        q49Var.getLayoutParams().height = i4;
        ((FrameLayout.LayoutParams) q49Var.getLayoutParams()).topMargin = i7;
        ((FrameLayout.LayoutParams) q49Var.getLayoutParams()).leftMargin = i6;
        if (i2 != i5) {
            if (tL_availableReaction != null) {
            }
            frameLayout.addView(q49Var2);
            q49Var2.getLayoutParams().width = i4;
            q49Var2.getLayoutParams().height = i4;
            ((FrameLayout.LayoutParams) q49Var2.getLayoutParams()).topMargin = i7;
            ((FrameLayout.LayoutParams) q49Var2.getLayoutParams()).leftMargin = i6;
        }
        p49Var2.addView(frameLayout);
        frameLayout.getLayoutParams().width = i162;
        frameLayout.getLayoutParams().height = i162;
        int i222 = -i7;
        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i222;
        int i232 = -i6;
        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i232;
        p49Var2.addView(q49Var32);
        q49Var32.getLayoutParams().width = i162;
        q49Var32.getLayoutParams().height = i162;
        q49Var32.getLayoutParams().width = i162;
        q49Var32.getLayoutParams().height = i162;
        ((FrameLayout.LayoutParams) q49Var32.getLayoutParams()).topMargin = i222;
        ((FrameLayout.LayoutParams) q49Var32.getLayoutParams()).leftMargin = i232;
        frameLayout.setPivotX(i6);
        frameLayout.setPivotY(i7);
    }

    public static String a() {
        return e() + "_" + e() + "_nolimit_pcache";
    }

    public static void b(boolean z) {
        int i = 0;
        while (i < 2) {
            s49 s49Var = i == 0 ? B : C;
            if (s49Var != null) {
                if (z) {
                    s49Var.c();
                } else {
                    s49Var.l = true;
                }
            }
            i++;
        }
        C = null;
        B = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        if (r22 != 2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r1.isShowing() == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(e eVar, i49 i49Var, jf0 jf0Var, View view, float f, float f2, w49 w49Var, int i, int i2) {
        if (jf0Var == null || w49Var == null || eVar == null || eVar.getParentActivity() == null) {
            return;
        }
        boolean z = true;
        if (uc7.e1().getBoolean("view_animations", true)) {
            if (i2 == 2 || i2 == 0) {
                d(eVar, null, jf0Var, view, 0.0f, 0.0f, w49Var, i, 1);
            }
            s49 s49Var = new s49(eVar.getParentActivity(), eVar, i49Var, jf0Var, view, f, f2, w49Var, i, i2, false);
            if (i2 == 1) {
                C = s49Var;
            } else {
                B = s49Var;
            }
            if (eVar instanceof zu1) {
                zu1 zu1Var = (zu1) eVar;
                if (i2 != 0) {
                }
                n8 n8Var = zu1Var.g9;
                if (n8Var != null) {
                }
            }
            z = false;
            s49Var.w = z;
            p49 p49Var = s49Var.i;
            if (z) {
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.height = -1;
                layoutParams.width = -1;
                layoutParams.type = 1000;
                layoutParams.flags = 65816;
                layoutParams.format = -3;
                WindowManager windowManager = eVar.getParentActivity().getWindowManager();
                s49Var.k = windowManager;
                hl.s3(windowManager, p49Var, layoutParams);
                s49Var.k.addView(p49Var, layoutParams);
            } else {
                ((FrameLayout) eVar.getParentActivity().getWindow().getDecorView()).addView(p49Var);
            }
            jf0Var.invalidate();
            if (!(jf0Var instanceof wb2) || ((wb2) jf0Var).getCurrentMessagesGroup() == null || jf0Var.getParent() == null) {
                return;
            }
            ((View) jf0Var.getParent()).invalidate();
        }
    }

    public static int e() {
        return (int) ((hl.L(40.0f) * 2.0f) / hl.p);
    }

    public static void f() {
        s49 s49Var = B;
        if (s49Var != null) {
            s49Var.s = true;
            s49Var.y = System.currentTimeMillis();
            if (B.a != 0 || System.currentTimeMillis() - E <= 200) {
                return;
            }
            E = System.currentTimeMillis();
            B.v.performHapticFeedback(3);
            return;
        }
        g();
        s49 s49Var2 = C;
        if (s49Var2 != null) {
            View view = s49Var2.v;
            if (view instanceof wb2) {
                ((wb2) view).O.b(s49Var2.p);
            } else if (view instanceof dl1) {
                ((dl1) view).F0.b(s49Var2.p);
            }
        }
    }

    public static void g() {
        s49 s49Var = C;
        if (s49Var == null || s49Var.s) {
            return;
        }
        s49Var.s = true;
        s49Var.y = System.currentTimeMillis();
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
            boolean z = this.w;
            p49 p49Var = this.i;
            if (z) {
                this.k.removeView(p49Var);
            } else {
                hl.B2(p49Var);
            }
        } catch (Exception unused) {
        }
    }
}
