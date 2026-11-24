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
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntSupplier;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class wh9 implements et3, ji9, bg0, ml0, ll5, e39, wi3, g79, d39, o2b, xf2, yc7, arc, j8c, ut4, gx2, x74, n8c, tz7, lf0, OnSuccessListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wh9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // ll5
    public final void C(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        int v;
        k27 k27Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 6:
                qn9 qn9Var = (qn9) obj;
                if (z && !z2) {
                    qn9Var.a();
                    break;
                }
                break;
            default:
                qfa qfaVar = (qfa) obj;
                ImageReceiver imageReceiver2 = qfaVar.d;
                ImageReceiver imageReceiver3 = qfaVar.c;
                if (z && !z2 && (k27Var = qfaVar.n) != null && k27Var.t2() && imageReceiver3.n() != null) {
                    if (imageReceiver2.n() != null) {
                        imageReceiver2.n().recycle();
                    }
                    imageReceiver2.f0(Utilities.D(imageReceiver3.n(), false));
                }
                if (z && !z2 && qfaVar.x0 && imageReceiver3.n() != null) {
                    int I0 = gl.I0(imageReceiver3.n());
                    qfaVar.a = I0;
                    CheckBoxBase checkBoxBase = qfaVar.Q;
                    if (checkBoxBase != null && checkBoxBase.x != (v = bkb.v(I0, bkb.p1(0.25f, -1)))) {
                        checkBoxBase.x = v;
                        checkBoxBase.b();
                        break;
                    }
                }
                break;
        }
    }

    @Override // ll5
    public final void E(int i, Drawable drawable) {
        byte b = this.a;
    }

    @Override // wi3
    public final boolean G() {
        return false;
    }

    @Override // yc7
    public final void a(String str) {
        g2b storiesController;
        nfa nfaVar = ((nca) this.b).d;
        storiesController = nfaVar.getStoriesController();
        storiesController.q(nfaVar.m1, str, new nba(nfaVar, (byte) 1));
    }

    @Override // ut4
    public final void b(Canvas canvas) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 4:
                nn9 nn9Var = (nn9) obj;
                Paint paint = nn9Var.K;
                RectF rectF = nn9Var.d;
                nn9Var.d(canvas);
                on9 on9Var = nn9Var.P;
                FrameLayout frameLayout = on9Var.h;
                TextureView textureView = on9Var.n;
                if (frameLayout.getVisibility() == 0 && frameLayout.getWidth() > 0) {
                    canvas.save();
                    canvas.translate(frameLayout.getLeft(), frameLayout.getTop());
                    canvas.concat(frameLayout.getMatrix());
                    float L = (1.0f - on9Var.U) * gl.L(12.0f);
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
                zka zkaVar = (zka) obj;
                canvas.save();
                canvas.translate(zkaVar.a.getX(), zkaVar.a.getY());
                zkaVar.a.draw(canvas);
                canvas.restore();
                break;
        }
    }

    @Override // tz7
    public final void c(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 24:
                i8c i8cVar = (i8c) obj;
                if (i != 1) {
                    if (i != 3) {
                        i8cVar.a(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    i8cVar.a(Boolean.TRUE, null);
                    break;
                }
                break;
            case 25:
                ae2 ae2Var = (ae2) obj;
                if (i != 1) {
                    if (i != 3) {
                        ae2Var.a(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    ae2Var.a(Boolean.TRUE, null);
                    break;
                }
                break;
            default:
                et4 et4Var = (et4) obj;
                if (i != 1) {
                    if (i != 3) {
                        et4Var.a(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    et4Var.a(Boolean.TRUE, null);
                    break;
                }
                break;
        }
    }

    @Override // e39
    public final boolean d(int i, View view) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 8:
                hs9 hs9Var = (hs9) obj;
                gx0 gx0Var = hs9Var.c;
                k27 E = gx0Var.E(i);
                hs9 hs9Var2 = (hs9) gx0Var.d;
                if (E == null) {
                    return false;
                }
                if (!hs9Var.J.t()) {
                    hs9Var.J.c();
                    gx0Var.l(0, hs9Var2.r);
                }
                if (hs9Var.J.t()) {
                    hs9Var.J.f(E, view, 0);
                    if (!hs9Var.J.t()) {
                        gx0Var.l(0, hs9Var2.r);
                    }
                    se4 se4Var = hs9Var.K;
                    int e1 = E.e1();
                    se4Var.a = k27.B0(E.k);
                    se4Var.b = e1;
                }
                return true;
            default:
                return ((qy9) obj).Z0(i, view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0125  */
    @Override // d39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(float f, float f2, int i, View view) {
        long j;
        zy9 zy9Var = (zy9) this.b;
        LinkedHashMap linkedHashMap = zy9Var.g2;
        yy9 yy9Var = zy9Var.T1;
        HashSet hashSet = zy9Var.Z1;
        if (view instanceof wgb) {
            linkedHashMap.clear();
            zy9Var.d1(true);
        } else if (view instanceof kz9) {
            kz9 kz9Var = (kz9) view;
            TLRPC.User user = kz9Var.getUser();
            TLRPC.Chat chat = kz9Var.getChat();
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
            if ((hashSet.size() == 11 && zy9Var.m2 == 1) || (hashSet.size() == on0.g() + 1 && zy9Var.m2 == 2)) {
                hashSet.remove(Long.valueOf(j2));
                zy9Var.f1();
                return;
            }
            yy9Var.b(true, hashSet, new uy9(zy9Var, (byte) 1), null);
            zy9Var.i1(true, false);
            if (chat == null || hc2.t0(chat) || !hashSet.contains(Long.valueOf(j2))) {
                j = 1;
                if (chat != null) {
                    zy9Var.Y0();
                }
            } else {
                Context context = zy9Var.r1.getContext();
                wjb wjbVar = zy9Var.J0;
                j = 1;
                et etVar = new et((Object) zy9Var, j2, (byte) 29);
                uy9 uy9Var = new uy9(zy9Var, (byte) 2);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
                boolean V = hc2.V(chat);
                String M0 = k96.M0(V ? 2131753394 : 2131753392, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = k96.M0(V ? 2131753393 : 2131753391, null);
                alertDialog$Builder.j(k96.M0(2131754483, "Add"), new o(atomicBoolean, uy9Var, (byte) 19));
                alertDialog$Builder.g(k96.M0(2131752577, "Cancel"), new ho9((byte) 13));
                alertDialog$Builder.i(new cf(atomicBoolean, etVar, (byte) 4));
                alertDialog$Builder.o();
            }
            if (view instanceof bz9) {
                return;
            }
            long hashCode = ((bz9) view).getCountry().default_name.hashCode();
            if (hashSet.contains(Long.valueOf(hashCode))) {
                hashSet.remove(Long.valueOf(hashCode));
            } else {
                hashSet.add(Long.valueOf(hashCode));
            }
            if (hashSet.size() == on0.i() + j && zy9Var.m2 == 3) {
                hashSet.remove(Long.valueOf(hashCode));
                zy9Var.f1();
                return;
            }
            yy9Var.b(true, hashSet, new uy9(zy9Var, (byte) 3), zy9Var.f2);
            if (TextUtils.isEmpty(zy9Var.i2)) {
                zy9Var.i1(true, false);
                return;
            }
            zy9Var.i2 = null;
            yy9Var.setText("");
            zy9Var.i1(false, false);
            zy9Var.i1(true, true);
            return;
        }
        j = 1;
        if (view instanceof bz9) {
        }
    }

    @Override // xf2
    public final void f() {
        waa waaVar = (waa) this.b;
        float progress = 1.0f - (waaVar.d.getProgress() * 0.143f);
        be0 be0Var = waaVar.a;
        be0Var.setScaleX(progress);
        be0Var.setScaleY(progress);
        waaVar.invalidate();
    }

    @Override // j8c
    public final Object g(Integer num, Object obj) {
        return (CharSequence) ((pb) this.b).a((Integer) obj);
    }

    @Override // arc
    public final void h(int i, int i2) {
        cja cjaVar = (cja) this.b;
        cjaVar.x = i;
        cjaVar.y = i2;
        si9 si9Var = cjaVar.M;
        if (si9Var != null) {
            si9Var.invalidate();
        }
    }

    @Override // o2b
    public final void i(boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 13:
                f0a f0aVar = (f0a) obj;
                if (f0aVar != null) {
                    f0aVar.c();
                    break;
                }
                break;
            default:
                y1b y1bVar = (y1b) obj;
                if (z) {
                    y1bVar.p(30, false);
                    break;
                }
                break;
        }
    }

    @Override // n8c
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        d S;
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 23:
                ((gta) obj3).R((ArrayList) obj, (Integer) obj2, (Long) number, (ArrayList) serializable, (ArrayList) serializable2);
                break;
            default:
                gva gvaVar = (gva) obj3;
                c4c c4cVar = (c4c) obj;
                Object obj4 = c4cVar.H;
                if (!(obj4 instanceof TL_stars.StarsTransaction)) {
                    if ((obj4 instanceof TL_wallet.walletTransaction) && (S = LaunchActivity.S()) != null) {
                        S.presentFragment(new hmc());
                        break;
                    }
                } else {
                    jva.k1(gvaVar.getContext(), false, 0L, gvaVar.c, (TL_stars.StarsTransaction) c4cVar.H, gvaVar.b);
                    break;
                }
                break;
        }
    }

    @Override // ml0
    public final int k(wjb wjbVar, boolean z) {
        return ((IntSupplier) this.b).getAsInt();
    }

    @Override // et3
    public final void m() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((ai9) obj).g();
                break;
            default:
                ii9 ii9Var = (ii9) obj;
                lk0 lk0Var = ii9Var.a;
                if (lk0Var != null) {
                    lk0Var.s = true;
                    lk0Var.r = ii9Var.r.q2;
                }
                ii9Var.w();
                ge9 ge9Var = ii9Var.F;
                if (ge9Var != null && ii9Var.a != null) {
                    ge9Var.a.W3();
                    break;
                }
                break;
        }
    }

    @Override // gx2
    public final void o(long j) {
        ((jqa) this.b).f();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        a61 a61Var = (a61) this.b;
        dab dabVar = (dab) obj;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < dabVar.a.size(); i++) {
            cab cabVar = (cab) dabVar.a.get(i);
            lza lzaVar = new lza();
            lzaVar.a = cabVar.a;
            lzaVar.b = cabVar.d;
            lzaVar.c = cabVar.e;
            lzaVar.d = cabVar.b;
            lzaVar.e = cabVar.c;
            arrayList.add(lzaVar);
        }
        a61Var.a(arrayList);
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        View view = ((xqa) this.b).b;
        if (view instanceof uk1) {
            ((uk1) view).W();
        } else {
            view.invalidate();
        }
    }

    @Override // d39
    public final boolean q(View view) {
        return false;
    }

    @Override // wi3
    public final boolean r(cj3 cj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, qvb qvbVar) {
        hi3 hi3Var = (hi3) this.b;
        int i3 = hi3Var.K0;
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = hi3Var.C0;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList2.add((k27) hashMap.get((se4) it.next()));
        }
        hashMap.clear();
        hi3Var.R(false);
        boolean z3 = true;
        if (arrayList.size() > 1 || ((zc7) arrayList.get(0)).a == y6c.h(j5.a(i3).a).e() || charSequence != null) {
            int i4 = 0;
            while (i4 < arrayList.size()) {
                long j = ((zc7) arrayList.get(i4)).a;
                if (charSequence != null) {
                    z3a.B(j5.a(i3).a).q0(x3a.b(charSequence.toString(), j, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                z3a.B(j5.a(i3).a).p0(arrayList2, j, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                i4++;
                z3 = z3;
            }
            boolean z4 = z3;
            cj3Var.finishFragment();
            return z4;
        }
        long j2 = ((zc7) arrayList.get(0)).a;
        Bundle l = ir2.l("scrollToTopOnResume", true);
        if (cf3.B(j2)) {
            l.putInt("enc_id", (int) (j2 & 4294967295L));
        } else {
            if (cf3.D(j2)) {
                l.putLong("user_id", j2);
            } else {
                l.putLong("chat_id", -j2);
            }
            if (!na7.q1(j5.a(i3).a).A(l, cj3Var, null, null)) {
                return true;
            }
        }
        mu1 mu1Var = new mu1(l);
        cj3Var.presentFragment(mu1Var, true);
        mu1Var.Qb(arrayList2);
        return true;
    }

    @Override // g79
    public final void s(long j, xu7 xu7Var) {
        sqd.a(j, xu7Var, ((uv9) this.b).c);
    }

    @Override // wi3
    public final boolean t(cj3 cj3Var) {
        return false;
    }

    @Override // ll5
    public final void v(ImageReceiver imageReceiver) {
        byte b = this.a;
    }

    private final void w(ImageReceiver imageReceiver) {
    }

    private final void x(ImageReceiver imageReceiver) {
    }

    private final void n(int i, Drawable drawable) {
    }

    private final void u(int i, Drawable drawable) {
    }

    @Override // x74
    public final void F(float f, int i) {
    }

    @Override // d39
    public final void l(View view, float f, float f2) {
    }
}
