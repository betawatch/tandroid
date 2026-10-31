package rh;

import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ef;
import org.telegram.messenger.j20;
import org.telegram.messenger.l20;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.cj0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b1 implements l20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ us b;

    public /* synthetic */ b1(us usVar, int i10) {
        this.a = i10;
        this.b = usVar;
    }

    @Override // org.telegram.messenger.l20
    public final void a(Object obj, Object obj2, Object obj3) {
        int i10;
        vh.r rVar;
        switch (this.a) {
            case 0:
                ((e4) this.b).p2((View) obj2, (CharSequence) obj, ((Boolean) obj3).booleanValue());
                break;
            case 1:
                e4 e4Var = (e4) this.b;
                ArrayList arrayList = (ArrayList) obj;
                j20 j20Var = (j20) obj2;
                Runnable runnable = (Runnable) obj3;
                ph.p3 p3Var = e4Var.O2;
                if (p3Var != null) {
                    p3Var.b();
                    e4Var.O2 = null;
                }
                TL_stars.craftStarGift craftstargift = new TL_stars.craftStarGift();
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj4 = arrayList.get(i11);
                    i11++;
                    TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                    tL_inputSavedStarGiftSlug.slug = ((TL_stars.StarGift) obj4).slug;
                    craftstargift.stargift.add(tL_inputSavedStarGiftSlug);
                }
                ConnectionsManager.getInstance(e4Var.a).sendRequestTyped(craftstargift, new a3.b(1), new cj0(e4Var, j20Var, arrayList, runnable, 2));
                break;
            default:
                vh.o8 o8Var = (vh.o8) this.b;
                Boolean bool = (Boolean) obj;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj3;
                if (o8Var.f0 == 0 && arrayList2 != null && !arrayList2.isEmpty() && o8Var.p2 == null && !o8Var.W && o8Var.I()) {
                    o8Var.H1 = null;
                    o8Var.I1 = null;
                    o8Var.J1 = null;
                    if (bool.booleanValue()) {
                        if (arrayList2.size() + o8Var.A0.getFilledCount() > o8Var.A0.getTotalCount()) {
                            int size2 = arrayList2.size() + o8Var.A0.getFilledCount();
                            ArrayList a2 = vh.r.a();
                            int size3 = a2.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 < size3) {
                                    Object obj5 = a2.get(i12);
                                    i12++;
                                    rVar = (vh.r) obj5;
                                    if (rVar.e.size() >= size2) {
                                    }
                                } else {
                                    rVar = null;
                                }
                            }
                            if (rVar == null) {
                                o8Var.A0.o(null);
                                o8Var.A0.e();
                                o8Var.I0.setSelected((vh.r) null);
                                vh.t7 t7Var = o8Var.B0;
                                if (t7Var != null) {
                                    t7Var.recordHevc = !o8Var.A0.j();
                                }
                                o8Var.I0.a(false, true);
                                o8Var.l0(true);
                                break;
                            } else {
                                vh.c8 c8Var = o8Var.A0;
                                o8Var.z0 = rVar;
                                c8Var.o(rVar);
                                o8Var.I0.setSelected(rVar);
                                int indexOf = vh.r.a().indexOf(rVar);
                                if (indexOf >= 0) {
                                    o8Var.I0.a.v0(indexOf);
                                }
                                vh.t7 t7Var2 = o8Var.B0;
                                if (t7Var2 != null) {
                                    t7Var2.recordHevc = !o8Var.A0.j();
                                }
                                o8Var.G0.setDrawable(new ob0(rVar, false));
                                o8Var.b0(o8Var.H0, o8Var.I0.e, true);
                                o8Var.O0.e(true, o8Var.A0.j() ? o8Var.A0.getFilledProgress() : 0.0f);
                            }
                        }
                    }
                    o8Var.L1 = true;
                    int i13 = 0;
                    while (true) {
                        if (i13 < arrayList2.size()) {
                            vh.n5 l4 = vh.n5.l((ef) arrayList2.get(i13));
                            l4.M0 = (Bitmap) arrayList3.get(i13);
                            l4.J0 = o8Var.v0;
                            l4.K0 = o8Var.w0;
                            l4.A();
                            if (!bool.booleanValue()) {
                                if (o8Var.K1 == null) {
                                    o8Var.K1 = l4;
                                } else {
                                    if (o8Var.H1 == null) {
                                        ArrayList arrayList4 = new ArrayList();
                                        o8Var.H1 = arrayList4;
                                        arrayList4.add(o8Var.K1);
                                    }
                                    if (o8Var.H1.size() < 10) {
                                        o8Var.H1.add(l4);
                                    }
                                }
                                i13++;
                            } else if (o8Var.A0.l(l4)) {
                                o8Var.K1 = vh.n5.a(o8Var.A0.getLayout(), o8Var.A0.getContent());
                            } else {
                                i13++;
                            }
                        }
                    }
                    if (o8Var.H1 != null) {
                        o8Var.h0(false, true);
                        o8Var.Q0.a(o8Var.O1);
                        vh.r4 r4Var = o8Var.O0;
                        boolean z10 = o8Var.O1 == 1;
                        r4Var.n0 = -1.0f;
                        r4Var.o0 = z10;
                        r4Var.invalidate();
                        o8Var.I1 = new ArrayList();
                        o8Var.J1 = new ArrayList();
                        for (int i14 = 0; i14 < o8Var.H1.size(); i14 = c3.i0.j(i14, i14, 1, o8Var.J1)) {
                            o8Var.I1.add(Integer.valueOf(i14));
                        }
                        o8Var.A0.n(null);
                        o8Var.I0.a(false, true);
                        o8Var.l0(true);
                        o8Var.e(false);
                        o8Var.J(1, true);
                        vh.k7 k7Var = o8Var.d1;
                        if (k7Var != null) {
                            vh.d0 d0Var = k7Var.h;
                            if (!k7Var.I && !k7Var.M && (i10 = vp.d1().getInt("multistorieshint", 0)) < 3) {
                                vp.d1().edit().putInt("multistorieshint", i10 + 1).apply();
                                org.telegram.messenger.i0.r(d0Var);
                                k7Var.I = true;
                                k7Var.invalidate();
                                org.telegram.messenger.i0.h3(d0Var, 5500L);
                            }
                        }
                        vh.m2 m2Var = o8Var.M0;
                        if (m2Var != null) {
                            o8Var.l2 = m2Var.e.e0();
                            o8Var.m2 = o8Var.M0.getSelectedAlbum();
                            break;
                        }
                    } else {
                        vh.n5 n5Var = o8Var.K1;
                        if (n5Var != null) {
                            n5Var.B();
                        }
                        o8Var.I0.a(false, true);
                        o8Var.l0(true);
                        o8Var.e(false);
                        vh.m2 m2Var2 = o8Var.M0;
                        if (m2Var2 != null) {
                            o8Var.l2 = m2Var2.e.e0();
                            o8Var.m2 = o8Var.M0.getSelectedAlbum();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
