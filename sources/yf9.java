// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntSupplier;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class yf9 implements oac, ee, hk3, zw9, ou3, lk9, ch0, mm0, ln5, h59, i99, g59, p4b, lh2, af7, ctc, kac, wv4, qy2, g94, w18 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yf9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // ln5
    public final void B0(int i, Drawable drawable) {
        byte b = this.a;
    }

    @Override // g94
    public final void D(int i, float f, float f2, h94 h94Var) {
        View view = ((ysa) this.b).b;
        if (view instanceof cm1) {
            ((cm1) view).T();
        } else {
            view.invalidate();
        }
    }

    @Override // hk3
    public final boolean E() {
        byte b = this.a;
        return false;
    }

    @Override // ln5
    public final void L(ImageReceiver imageReceiver) {
        byte b = this.a;
    }

    @Override // af7
    public final void a(String str) {
        h4b storiesController;
        nha nhaVar = ((nea) this.b).d;
        storiesController = nhaVar.getStoriesController();
        storiesController.q(nhaVar.m1, str, new nda(nhaVar, (byte) 1));
    }

    @Override // wv4
    public final void b(Canvas canvas) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 8:
                op9 op9Var = (op9) obj;
                Paint paint = op9Var.K;
                RectF rectF = op9Var.d;
                op9Var.d(canvas);
                pp9 pp9Var = op9Var.P;
                FrameLayout frameLayout = pp9Var.h;
                TextureView textureView = pp9Var.n;
                if (frameLayout.getVisibility() == 0 && frameLayout.getWidth() > 0) {
                    canvas.save();
                    canvas.translate(frameLayout.getLeft(), frameLayout.getTop());
                    canvas.concat(frameLayout.getMatrix());
                    float L = (1.0f - pp9Var.U) * gm.L(12.0f);
                    rectF.set(0.0f, 0.0f, frameLayout.getWidth(), frameLayout.getHeight());
                    canvas.clipRect(rectF);
                    paint.setColor(-16777216);
                    canvas.drawRoundRect(rectF, L, L, paint);
                    if (textureView.isAvailable() && textureView.isAttachedToWindow()) {
                        canvas.translate(textureView.getLeft(), textureView.getTop());
                        canvas.concat(textureView.getMatrix());
                        textureView.draw(canvas);
                    }
                    canvas.restore();
                    break;
                }
                break;
            default:
                ana anaVar = (ana) obj;
                canvas.save();
                canvas.translate(anaVar.a.getX(), anaVar.a.getY());
                anaVar.a.draw(canvas);
                canvas.restore();
                break;
        }
    }

    @Override // ln5
    public final void b0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        int v;
        k47 k47Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 10:
                rp9 rp9Var = (rp9) obj;
                if (z && !z2) {
                    rp9Var.a();
                    break;
                }
                break;
            default:
                sha shaVar = (sha) obj;
                ImageReceiver imageReceiver2 = shaVar.d;
                ImageReceiver imageReceiver3 = shaVar.c;
                if (z && !z2 && (k47Var = shaVar.n) != null && k47Var.t2() && imageReceiver3.n() != null) {
                    if (imageReceiver2.n() != null) {
                        imageReceiver2.n().recycle();
                    }
                    imageReceiver2.f0(Utilities.D(imageReceiver3.n(), false));
                }
                if (z && !z2 && shaVar.x0 && imageReceiver3.n() != null) {
                    int I0 = gm.I0(imageReceiver3.n());
                    shaVar.a = I0;
                    CheckBoxBase checkBoxBase = shaVar.Q;
                    if (checkBoxBase != null && checkBoxBase.x != (v = cmb.v(I0, cmb.p1(0.25f, -1)))) {
                        checkBoxBase.x = v;
                        checkBoxBase.b();
                        break;
                    }
                }
                break;
        }
    }

    @Override // w18
    public final void c(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 28:
                jac jacVar = (jac) obj;
                if (i != 1) {
                    if (i != 3) {
                        jacVar.a(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    jacVar.a(Boolean.TRUE, null);
                    break;
                }
                break;
            default:
                lf2 lf2Var = (lf2) obj;
                if (i != 1) {
                    if (i != 3) {
                        lf2Var.a(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    lf2Var.a(Boolean.TRUE, null);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0125  */
    @Override // g59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(float f, float f2, int i, View view) {
        long j;
        b1a b1aVar = (b1a) this.b;
        LinkedHashMap linkedHashMap = b1aVar.g2;
        a1a a1aVar = b1aVar.T1;
        HashSet hashSet = b1aVar.Z1;
        if (view instanceof xib) {
            linkedHashMap.clear();
            b1aVar.d1(true);
        } else if (view instanceof m1a) {
            m1a m1aVar = (m1a) view;
            TLRPC.User user = m1aVar.getUser();
            TLRPC.Chat chat = m1aVar.getChat();
            long j2 = user != null ? user.id : -chat.id;
            if (hashSet.contains(Long.valueOf(j2))) {
                hashSet.remove(Long.valueOf(j2));
            } else {
                hashSet.add(Long.valueOf(j2));
                Long valueOf = Long.valueOf(j2);
                if (user == null) {
                    user = chat;
                }
                linkedHashMap.put(valueOf, user);
            }
            if ((hashSet.size() == 11 && b1aVar.m2 == 1) || (hashSet.size() == oo0.g() + 1 && b1aVar.m2 == 2)) {
                hashSet.remove(Long.valueOf(j2));
                b1aVar.f1();
                return;
            }
            a1aVar.b(true, hashSet, new w0a(b1aVar, (byte) 1), null);
            b1aVar.i1(true, false);
            if (chat == null || sd2.t0(chat) || !hashSet.contains(Long.valueOf(j2))) {
                j = 1;
                if (chat != null) {
                    b1aVar.Y0();
                }
            } else {
                Context context = b1aVar.r1.getContext();
                ylb ylbVar = b1aVar.J0;
                j = 1;
                fu fuVar = new fu((Object) b1aVar, j2, (byte) 29);
                w0a w0aVar = new w0a(b1aVar, (byte) 2);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
                boolean V = sd2.V(chat);
                String M0 = jb6.M0(V ? 2131753362 : 2131753360, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = jb6.M0(V ? 2131753361 : 2131753359, null);
                alertDialog$Builder.j(jb6.M0(2131754483, "Add"), new o(atomicBoolean, w0aVar, (byte) 19));
                alertDialog$Builder.g(jb6.M0(2131752542, "Cancel"), new dq9((byte) 14));
                alertDialog$Builder.i(new dg(atomicBoolean, fuVar, (byte) 4));
                alertDialog$Builder.o();
            }
            if (view instanceof d1a) {
                return;
            }
            long hashCode = ((d1a) view).getCountry().default_name.hashCode();
            if (hashSet.contains(Long.valueOf(hashCode))) {
                hashSet.remove(Long.valueOf(hashCode));
            } else {
                hashSet.add(Long.valueOf(hashCode));
            }
            if (hashSet.size() == oo0.i() + j && b1aVar.m2 == 3) {
                hashSet.remove(Long.valueOf(hashCode));
                b1aVar.f1();
                return;
            }
            a1aVar.b(true, hashSet, new w0a(b1aVar, (byte) 3), b1aVar.f2);
            if (TextUtils.isEmpty(b1aVar.i2)) {
                b1aVar.i1(true, false);
                return;
            }
            b1aVar.i2 = null;
            a1aVar.setText("");
            b1aVar.i1(false, false);
            b1aVar.i1(true, true);
            return;
        }
        j = 1;
        if (view instanceof d1a) {
        }
    }

    @Override // p4b
    public final void e(boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 17:
                h2a h2aVar = (h2a) obj;
                if (h2aVar != null) {
                    h2aVar.c();
                    break;
                }
                break;
            default:
                z3b z3bVar = (z3b) obj;
                if (z) {
                    z3bVar.p(30, false);
                    break;
                }
                break;
        }
    }

    @Override // zw9
    public final void f(float f) {
        k47 k47Var = ((pi9) this.b).X;
        if (k47Var == null) {
            return;
        }
        k47Var.b0 = f;
        MediaController.w().h0(k47Var, f);
    }

    @Override // h59
    public final boolean g(int i, View view) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 12:
                ju9 ju9Var = (ju9) obj;
                ny0 ny0Var = ju9Var.c;
                k47 E = ny0Var.E(i);
                ju9 ju9Var2 = (ju9) ny0Var.d;
                if (E == null) {
                    return false;
                }
                if (!ju9Var.J.u()) {
                    ju9Var.J.f();
                    ny0Var.l(0, ju9Var2.r);
                }
                if (ju9Var.J.u()) {
                    ju9Var.J.i(E, view, 0);
                    if (!ju9Var.J.u()) {
                        ny0Var.l(0, ju9Var2.r);
                    }
                    ug4 ug4Var = ju9Var.K;
                    int e1 = E.e1();
                    ug4Var.a = k47.B0(E.k);
                    ug4Var.b = e1;
                }
                return true;
            default:
                return ((s0a) obj).Z0(i, view);
        }
    }

    @Override // lh2
    public final void i() {
        wca wcaVar = (wca) this.b;
        float progress = 1.0f - (wcaVar.d.getProgress() * 0.143f);
        bf0 bf0Var = wcaVar.a;
        bf0Var.setScaleX(progress);
        bf0Var.setScaleY(progress);
        wcaVar.invalidate();
    }

    @Override // kac
    public final Object j(Integer num, Object obj) {
        return (CharSequence) ((pb) this.b).a((Integer) obj);
    }

    @Override // oac
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                View view = (View) obj2;
                if (((ch9[]) obj3)[0] != null && (view instanceof xk9)) {
                    ((xk9) view).A();
                    break;
                }
                break;
            default:
                ((jva) obj3).R((ArrayList) obj, (Integer) obj2, (Long) number, (ArrayList) serializable, (ArrayList) serializable2);
                break;
        }
    }

    @Override // ctc
    public final void l(int i, int i2) {
        ela elaVar = (ela) this.b;
        elaVar.x = i;
        elaVar.y = i2;
        xd9 xd9Var = elaVar.M;
        if (xd9Var != null) {
            xd9Var.invalidate();
        }
    }

    @Override // ou3
    public final void m() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 4:
                ((ck9) obj).g();
                break;
            default:
                kk9 kk9Var = (kk9) obj;
                ll0 ll0Var = kk9Var.a;
                if (ll0Var != null) {
                    ll0Var.s = true;
                    ll0Var.r = kk9Var.r.q2;
                }
                kk9Var.w();
                kg9 kg9Var = kk9Var.F;
                if (kg9Var != null && kk9Var.a != null) {
                    kg9Var.a.W3();
                    break;
                }
                break;
        }
    }

    @Override // qy2
    public final void n(long j) {
        ((jsa) this.b).f();
    }

    @Override // mm0
    public final int o(ylb ylbVar, boolean z) {
        return ((IntSupplier) this.b).getAsInt();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a2, code lost:
    
        if (oc7.r1(j5.a(r3).a).A(r0, r24, null, null) != false) goto L22;
     */
    @Override // hk3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(nk3 nk3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, sxb sxbVar) {
        long j;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                oh9 oh9Var = (oh9) obj;
                if (arrayList.isEmpty() || ((bf7) arrayList.get(0)).a <= 0) {
                    return false;
                }
                oh9Var.run(((bf7) arrayList.get(0)).a);
                nk3Var.finishFragment();
                return true;
            default:
                sj3 sj3Var = (sj3) obj;
                int i3 = sj3Var.K0;
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap = sj3Var.C0;
                Iterator it = hashMap.keySet().iterator();
                while (it.hasNext()) {
                    arrayList2.add((k47) hashMap.get((ug4) it.next()));
                }
                hashMap.clear();
                sj3Var.R(false);
                if (arrayList.size() > 1 || ((bf7) arrayList.get(0)).a == z8c.h(j5.a(i3).a).e() || charSequence != null) {
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        long j2 = ((bf7) arrayList.get(i4)).a;
                        if (charSequence != null) {
                            j = j2;
                            a6a.B(j5.a(i3).a).q0(y5a.b(charSequence.toString(), j, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j = j2;
                        }
                        a6a.B(j5.a(i3).a).p0(arrayList2, j, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                    }
                    nk3Var.finishFragment();
                } else {
                    long j3 = ((bf7) arrayList.get(0)).a;
                    Bundle l = ts2.l("scrollToTopOnResume", true);
                    if (!pg3.B(j3)) {
                        if (pg3.D(j3)) {
                            l.putLong("user_id", j3);
                        } else {
                            l.putLong("chat_id", -j3);
                        }
                        break;
                    } else {
                        l.putInt("enc_id", (int) (j3 & 4294967295L));
                    }
                    yv1 yv1Var = new yv1(l);
                    nk3Var.presentFragment(yv1Var, true);
                    yv1Var.cc(arrayList2);
                }
                return true;
        }
    }

    @Override // ee
    public final void r(he heVar, int i) {
        ((eb7) this.b).run();
    }

    @Override // hk3
    public final boolean s(nk3 nk3Var) {
        byte b = this.a;
        return false;
    }

    @Override // i99
    public final void t(long j, yw7 yw7Var) {
        vsd.a(j, yw7Var, ((xx9) this.b).c);
    }

    @Override // g59
    public final boolean u(View view) {
        return false;
    }

    private final void x(ImageReceiver imageReceiver) {
    }

    private final void y(ImageReceiver imageReceiver) {
    }

    @Override // zw9
    public final void h(float f) {
    }

    private final void v(int i, Drawable drawable) {
    }

    private final void w(int i, Drawable drawable) {
    }

    @Override // g94
    public final void V(float f, int i) {
    }

    @Override // g59
    public final void p(View view, float f, float f2) {
    }
}
