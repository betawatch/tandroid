// default package

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.opengl.Matrix;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SessionsActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class z6a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z6a(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a5  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        char c;
        boolean z;
        byte b;
        int i;
        boolean z2;
        int i2;
        int i3 = 0;
        switch (this.a) {
            case 0:
                ((SessionsActivity) this.b).l0();
                return;
            case 1:
                ((aaa) this.b).b.W0(1);
                return;
            case 2:
                bba bbaVar = (bba) this.b;
                ev3[] ev3VarArr = bbaVar.a;
                if (bbaVar.b != 1) {
                    for (ev3 ev3Var : ev3VarArr) {
                        jia jiaVar = (jia) ev3Var.e;
                        jiaVar.setAlpha(1.0f);
                        jiaVar.setScaleX(1.0f);
                        jiaVar.setScaleY(1.0f);
                        ((jia) ev3Var.f).setAlpha(0.0f);
                    }
                    bbaVar.F = false;
                    gl.d3(bbaVar.H, 4000L);
                    return;
                }
                bbaVar.F = !bbaVar.F;
                int length = ev3VarArr.length;
                while (i3 < length) {
                    ev3 ev3Var2 = ev3VarArr[i3];
                    jia jiaVar2 = (jia) ev3Var2.e;
                    jia jiaVar3 = (jia) ev3Var2.f;
                    jiaVar2.setPivotX(0.0f);
                    jiaVar3.setPivotX(0.0f);
                    boolean z3 = bbaVar.F;
                    jia jiaVar4 = (jia) ev3Var2.e;
                    if (z3) {
                        jiaVar4.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        jiaVar3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        jiaVar4.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        jiaVar3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                    i3++;
                }
                gl.d3(bbaVar.H, 4000L);
                return;
            case 3:
                ((ev3) this.b).setVisibility(8);
                return;
            case 4:
                nfa nfaVar = ((kca) this.b).H;
                if (nfaVar.F1) {
                    nfaVar.l1(false);
                    return;
                }
                return;
            case 5:
                ((sda) this.b).a.z1(false);
                return;
            case 6:
                d dVar = ((zda) this.b).f.y1;
                if (dVar != null) {
                    dVar.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 7:
                ((z6a) this.b).run();
                return;
            case 8:
                yea yeaVar = (yea) this.b;
                ArrayList arrayList = yeaVar.f;
                if (yeaVar.h) {
                    yeaVar.h = false;
                    ArrayList arrayList2 = new ArrayList();
                    while (i3 < arrayList.size()) {
                        if (((up9) arrayList.get(i3)).b) {
                            arrayList2.add(Long.valueOf(((up9) arrayList.get(i3)).a));
                        }
                        i3++;
                    }
                    vp9 D1 = yeaVar.y.y1.getMessagesController().D1();
                    ArrayList d = vp9.d(D1.j);
                    int i4 = D1.a;
                    if (arrayList2.size() > (y6c.h(i4).p() ? na7.q1(i4).k4.i2.f() : na7.q1(i4).k4.h2.f()) || vp9.j(d, arrayList2)) {
                        return;
                    }
                    D1.o(arrayList2);
                    return;
                }
                return;
            case 9:
                ((zea) this.b).F();
                return;
            case 10:
                ((qfa) this.b).h();
                return;
            case 11:
                vk9 vk9Var = (vk9) this.b;
                synchronized (((ArrayDeque) vk9Var.c)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) vk9Var.b).edit();
                    StringBuilder sb = new StringBuilder();
                    Iterator it = ((ArrayDeque) vk9Var.c).iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append(",");
                    }
                    edit.putString("topic_operation_queue", sb.toString()).apply();
                }
                return;
            case 12:
                ((cja) this.b).V();
                return;
            case 13:
                return;
            case 14:
                ((kna) this.b).onBackPressed();
                return;
            case 15:
                qlc qlcVar = (qlc) this.b;
                koc kocVar = qlcVar.c.k0;
                if (kocVar != null) {
                    TL_wallet.nftItem nftitem = qlcVar.b;
                    if (kocVar.A()) {
                        kocVar.c0(kocVar.v(nftitem));
                        return;
                    }
                    return;
                }
                return;
            case 16:
                rlc rlcVar = (rlc) this.b;
                koc kocVar2 = rlcVar.b.k0;
                if (kocVar2 != null) {
                    kocVar2.b0(rlcVar.a);
                    return;
                }
                return;
            case 17:
                upa upaVar = (upa) this.b;
                upaVar.i0 = false;
                upaVar.k0 = false;
                upaVar.a(upaVar.a0, upaVar.b0, upaVar.c0, upaVar.d0);
                return;
            case 18:
                ((lpa) this.b).invalidateSelf();
                return;
            case 19:
                opa opaVar = (opa) this.b;
                npa npaVar = opaVar.I;
                if (npaVar != null) {
                    opa opaVar2 = npaVar.a;
                    float[] fArr = npaVar.h;
                    if (!npaVar.e && (i2 = npaVar.c) != 0) {
                        if (npaVar.l) {
                            opaVar2.a();
                        } else {
                            int F = ug8.F(((mpa) npaVar.b.get(i2 - 1)).a);
                            if (F == 1 || F == 2) {
                                c = 2;
                                z = true;
                                b = 5;
                                i = 6;
                                opaVar2.a();
                                int i5 = npaVar.f - 1;
                                npaVar.f = i5;
                                if (i5 <= 0) {
                                    npaVar.b();
                                }
                            } else if (F == 3) {
                                c = 2;
                                z = true;
                                b = 5;
                                int i6 = 6;
                                float pow = 1.0f - ((float) Math.pow(1.0f - (1.0f - (npaVar.f / npaVar.g)), 3.0d));
                                float f = 1.0f - pow;
                                if (Math.abs(npaVar.j * f) > 1.0E-4f || Math.abs(npaVar.k * f) > 1.0E-4f) {
                                    float[] fArr2 = new float[16];
                                    float f2 = npaVar.j * f * 0.96f;
                                    opaVar2.getClass();
                                    opa.b(1.0f, 0.0f, f2, fArr2);
                                    opaVar2.getClass();
                                    opa.d(fArr2, fArr, fArr);
                                    float f3 = npaVar.k * f * 0.96f;
                                    opaVar2.getClass();
                                    opa.b(0.0f, 1.0f, f3, fArr2);
                                    opa.d(fArr2, fArr, fArr);
                                }
                                float[] fArr3 = npaVar.i;
                                float[] fArr4 = opaVar2.c;
                                int i7 = 0;
                                while (i7 < 16) {
                                    float f4 = fArr[i7];
                                    fArr4[i7] = tb4.A(fArr3[i7], f4, pow, f4);
                                    i7++;
                                    i6 = i6;
                                }
                                i = i6;
                                float[] fArr5 = {fArr4[0], fArr4[1], fArr4[2]};
                                float[] fArr6 = {fArr4[4], fArr4[5], fArr4[i]};
                                float[] fArr7 = new float[3];
                                opa.e(fArr5);
                                opa.c(fArr5, fArr6, fArr7);
                                opa.e(fArr7);
                                opa.c(fArr7, fArr5, fArr6);
                                fArr4[0] = fArr5[0];
                                fArr4[1] = fArr5[1];
                                fArr4[2] = fArr5[2];
                                fArr4[4] = fArr6[0];
                                fArr4[5] = fArr6[1];
                                fArr4[i] = fArr6[2];
                                fArr4[8] = fArr7[0];
                                fArr4[9] = fArr7[1];
                                fArr4[10] = fArr7[2];
                                int i8 = npaVar.f - 1;
                                npaVar.f = i8;
                                if (i8 <= 0) {
                                    System.arraycopy(npaVar.i, 0, opaVar2.c, 0, 16);
                                    opaVar2.d = 0.0f;
                                    opaVar2.e = 0.0f;
                                    npaVar.b();
                                }
                            }
                        }
                    }
                    c = 2;
                    z = true;
                    b = 5;
                    i = 6;
                } else {
                    c = 2;
                    z = true;
                    b = 5;
                    i = 6;
                    if (Math.abs(opaVar.d) <= 1.0E-4f && Math.abs(opaVar.e) <= 1.0E-4f) {
                        z2 = false;
                        if (opaVar.H == null ? z : z2) {
                            int i9 = i;
                            while (i3 < i9) {
                                Matrix.multiplyMV(opaVar.n, 0, opaVar.c, 0, opaVar.h[i3], 0);
                                opaVar.r[i3] = opaVar.n[c];
                                i3++;
                            }
                            Arrays.sort(opaVar.s, new bz0(opaVar, b));
                            opaVar.invalidate();
                        }
                        if (opaVar.isAttachedToWindow()) {
                            return;
                        }
                        gl.d3(opaVar.J, 16L);
                        return;
                    }
                    opaVar.a();
                }
                z2 = z;
                if (opaVar.H == null ? z : z2) {
                }
                if (opaVar.isAttachedToWindow()) {
                }
                break;
            case 20:
                ((ppa) this.b).invalidate();
                return;
            case 21:
                ((tpa) this.b).invalidateSelf();
                return;
            case 22:
                rqa rqaVar = (rqa) this.b;
                z6a z6aVar = rqaVar.p0;
                be0[] be0VarArr = rqaVar.d;
                if (!be0VarArr[2 - rqaVar.y0].getImageReceiver().C()) {
                    gl.r(z6aVar);
                    gl.d3(z6aVar, 150L);
                    return;
                }
                xpa xpaVar = rqaVar.b0;
                if (xpaVar != null && xpaVar.b == 1 && rqaVar.isAttachedToWindow()) {
                    gl.r(z6aVar);
                    ValueAnimator valueAnimator = rqaVar.o0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        rqaVar.o0 = null;
                    }
                    int i10 = 1 - rqaVar.y0;
                    rqaVar.y0 = i10;
                    oy8 y = be0VarArr[2 - i10].getImageReceiver().y();
                    oy8 y2 = be0VarArr[rqaVar.y0 + 1].getImageReceiver().y();
                    if (y2 != null && y != null) {
                        y2.O(false, y.o());
                    }
                    rqaVar.d0.b();
                    int i11 = rqaVar.y0 + 1;
                    TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = rqaVar.c0;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) rqaVar.f0.b();
                    stargiftattributebackdropArr[i11] = stargiftattributebackdrop;
                    rqaVar.e(i11, stargiftattributebackdrop);
                    rqaVar.g(1, (TL_stars.starGiftAttributePattern) rqaVar.e0.b(), true);
                    rqaVar.a();
                    float f5 = rqaVar.y0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f5, f5);
                    rqaVar.o0 = ofFloat;
                    ofFloat.addUpdateListener(new oqa(rqaVar, (byte) 2));
                    rqaVar.o0.addListener(new qqa(rqaVar));
                    rqaVar.o0.setDuration(320L);
                    rqaVar.o0.setInterpolator(s33.h);
                    rqaVar.o0.start();
                    return;
                }
                return;
            case 23:
                jva jvaVar = (jva) this.b;
                if (jvaVar.V == null || jvaVar.b0 == -1) {
                    return;
                }
                jvaVar.n1("POSTED_ALIGN");
                jvaVar.V.a();
                return;
            case 24:
                ((er4) this.b).setPaused(true);
                return;
            case 25:
                ((o0a[]) this.b)[0].dismiss();
                return;
            case 26:
                d01.t(((zua) this.b).getContext(), k96.M0(2131744729, null));
                return;
            case 27:
                d01.t(((ava) this.b).getContext(), k96.M0(2131744729, null));
                return;
            case 28:
                uxa uxaVar = (uxa) this.b;
                uxaVar.n0.a(uxaVar.k0.f0, uxaVar.l0.isAttachedToWindow());
                return;
            default:
                eya eyaVar = (eya) this.b;
                if (eyaVar.isShowing()) {
                    eyaVar.E0(true);
                    return;
                }
                return;
        }
    }
}
