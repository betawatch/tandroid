package vh;

import android.graphics.Bitmap;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.wb;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z6 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o8 b;

    public /* synthetic */ z6(o8 o8Var, int i10) {
        this.a = i10;
        this.b = o8Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        boolean z10;
        z8 z8Var;
        k7 k7Var;
        int i10 = this.a;
        int i11 = 3;
        int i12 = 0;
        o8 o8Var = this.b;
        switch (i10) {
            case 0:
                z1 z1Var = o8Var.s;
                z1Var.p = ((Float) obj).floatValue();
                z1Var.i();
                break;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                n5 n5Var = o8Var.K1;
                if (n5Var != null) {
                    org.telegram.messenger.i0.z2(n5Var.g0);
                    o8Var.K1.g0 = bitmap;
                    w6 w6Var = o8Var.q0;
                    if (w6Var != null) {
                        w6Var.T0(bitmap);
                        break;
                    }
                }
                break;
            case 2:
                n5 n5Var2 = (n5) obj;
                o8Var.V(n5Var2, false);
                int i13 = o8Var.c;
                th.e5 O1 = vp.r1(i13).O1();
                a0.h hVar = O1.e;
                int i14 = O1.a;
                ArrayList arrayList = O1.h;
                ArrayList arrayList2 = O1.g;
                th.d5 d5Var = new th.d5(O1, n5Var2);
                boolean z11 = n5Var2.g;
                long j10 = d5Var.J;
                if (z11) {
                    HashMap hashMap = (HashMap) hVar.f(j10);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        hVar.k(hashMap, j10);
                    }
                    hashMap.put(Integer.valueOf(n5Var2.f), d5Var);
                } else {
                    O1.d(j10, d5Var, O1.b, false);
                }
                O1.d(j10, d5Var, O1.c, true);
                if (j10 != d20.i(i14).n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= arrayList2.size()) {
                            z10 = false;
                        } else if (org.telegram.messenger.o5.o(((TL_stories.PeerStories) arrayList2.get(i15)).peer) == j10) {
                            arrayList2.add(0, (TL_stories.PeerStories) arrayList2.remove(i15));
                            z10 = true;
                        } else {
                            i15++;
                        }
                    }
                    if (!z10) {
                        int i16 = 0;
                        while (true) {
                            if (i16 < arrayList.size()) {
                                if (org.telegram.messenger.o5.o(((TL_stories.PeerStories) arrayList.get(i16)).peer) == j10) {
                                    arrayList.add(0, (TL_stories.PeerStories) arrayList.remove(i16));
                                    z10 = true;
                                } else {
                                    i16++;
                                }
                            }
                        }
                    }
                    if (!z10) {
                        TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                        tL_peerStories.peer = vp.r1(i14).y1(j10);
                        O1.e0(j10, tL_peerStories);
                        arrayList2.add(0, tL_peerStories);
                        O1.R(j10);
                    }
                }
                d5Var.d();
                zs.f(i14).k(zs.v5, new Object[0]);
                if (n5Var2.c && !n5Var2.g) {
                    vp.r1(i13).O1().w.c(n5Var2);
                }
                if (n5Var2.e1 != 0) {
                    ConnectionsManager.getInstance(n5Var2.a).cancelRequest(n5Var2.e1, true);
                    break;
                }
                break;
            case 3:
                m4 m4Var = (m4) obj;
                if (o8Var.C0 != null) {
                    o8Var.D0.setLink(m4Var == null ? null : m4Var.a);
                    c8 c8Var = o8Var.A0;
                    if (c8Var != null) {
                        c8Var.c.a(o8Var.D0.D ? o8Var.C0.d : null);
                        break;
                    }
                }
                break;
            case 4:
                Integer num = (Integer) obj;
                n5 n5Var3 = o8Var.K1;
                if (n5Var3 != null) {
                    n5Var3.I0 = num.intValue();
                    vp.d1().edit().putInt("story_period", num.intValue()).apply();
                    break;
                }
                break;
            case 5:
                th.b bVar = o8Var.a;
                int intValue = ((Integer) obj).intValue() / 3600;
                qa qaVar = new ra(o8Var.b, new mg.u(12)).a;
                WindowManager.LayoutParams layout = qaVar.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = o8Var.r.getWidth();
                    layout.y = (int) (o8Var.r.getY() + org.telegram.messenger.i0.L(56.0f));
                    ra raVar = qaVar.a;
                    raVar.getWindow().setAttributes(raVar.b);
                }
                qaVar.setTouchable(true);
                new cc(qaVar, bVar).G(R.raw.fire_on, 3, org.telegram.messenger.i0.R2(cd.G(intValue, "StoryPeriodPremium", new Object[0]), org.telegram.ui.ActionBar.t6.Uc, 0, new y6(o8Var, 27), bVar)).k(true);
                break;
            case 6:
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue() && (z8Var = o8Var.Z0) != null && z8Var.P) {
                    z8Var.P = false;
                    if (z8Var.E && z8Var.h == null) {
                        z8Var.G = true;
                        t8 t8Var = z8Var.a;
                        if (t8Var != null) {
                            t8Var.A(true);
                        }
                    }
                }
                o8Var.X0.x(2, bool.booleanValue());
                o8Var.Y0.clearAnimation();
                z20.l(o8Var.Y0.animate(), bool.booleanValue() ? 0.0f : 1.0f, 120L);
                wb wbVar = wb.w;
                if (wbVar != null && wbVar.a == 2) {
                    wbVar.l();
                    break;
                }
                break;
            case 7:
                o8Var.k();
                o8Var.l();
                o8Var.h((Runnable) obj);
                break;
            case 8:
                r rVar = (r) obj;
                c8 c8Var2 = o8Var.A0;
                o8Var.z0 = rVar;
                c8Var2.o(rVar);
                o8Var.I0.setSelected(rVar);
                t7 t7Var = o8Var.B0;
                if (t7Var != null) {
                    t7Var.recordHevc = !o8Var.A0.j();
                }
                o8Var.G0.setDrawable(new ob0(rVar, false));
                o8Var.b0(o8Var.H0, o8Var.I0.e, true);
                o8Var.O0.e(true, o8Var.A0.j() ? o8Var.A0.getFilledProgress() : 0.0f);
                m2 m2Var = o8Var.M0;
                if (m2Var != null) {
                    m2Var.setMultipleOnClick(o8Var.A0.j());
                    o8Var.M0.setMaxCount(Math.min(10, r.b() - o8Var.A0.getFilledCount()));
                    break;
                }
                break;
            case 9:
                o8Var.O = true;
                o8Var.p(true);
                org.telegram.messenger.i0.h3(new mg.g0((q20) obj, i11), 210L);
                break;
            case 10:
                Integer num2 = (Integer) obj;
                if (!o8Var.P1 && !o8Var.Q1) {
                    int intValue2 = num2.intValue();
                    o8Var.O1 = intValue2;
                    o8Var.o0.a(intValue2 == -1, true);
                    o8Var.h0(o8Var.O1 == 1 && !o8Var.I0.e, true);
                    o8Var.Q0.a(num2.intValue());
                    r4 r4Var = o8Var.O0;
                    boolean z12 = num2.intValue() == 1;
                    r4Var.n0 = -1.0f;
                    r4Var.o0 = z12;
                    r4Var.invalidate();
                    if (num2.intValue() == -1) {
                        t7 t7Var2 = o8Var.B0;
                        if (t7Var2 != null && t7Var2.isDual()) {
                            o8Var.B0.toggleDual();
                        }
                        p2 p2Var = o8Var.l1;
                        if (p2Var != null) {
                            p2Var.e(true);
                        }
                        p2 p2Var2 = o8Var.m1;
                        if (p2Var2 != null) {
                            p2Var2.e(true);
                        }
                        p2 p2Var3 = o8Var.W0;
                        if (p2Var3 != null) {
                            p2Var3.e(true);
                        }
                        o8Var.A0.o(null);
                        o8Var.A0.e();
                        o8Var.I0.setSelected((r) null);
                        t7 t7Var3 = o8Var.B0;
                        if (t7Var3 != null) {
                            t7Var3.recordHevc = !o8Var.A0.j();
                        }
                    }
                    o8Var.I0.a(false, true);
                    o8Var.l0(true);
                    break;
                }
                break;
            case 11:
                Float f7 = (Float) obj;
                r4 r4Var2 = o8Var.O0;
                r4Var2.n0 = f7.floatValue();
                r4Var2.invalidate();
                o8Var.O0.setVisibility(f7.floatValue() <= -1.0f ? 8 : 0);
                o8Var.O0.setAlpha(Utilities.l(f7.floatValue() + 1.0f));
                o8Var.P0.setVisibility(f7.floatValue() < 0.0f ? 0 : 8);
                o8Var.P0.setAlpha(org.telegram.messenger.i0.z1(f7.floatValue(), 0.0f, -1.0f));
                o8Var.P0.setScaleX(org.telegram.messenger.i0.T1(0.8f, 1.0f, org.telegram.messenger.i0.z1(f7.floatValue(), 0.0f, -1.0f)));
                o8Var.P0.setScaleY(org.telegram.messenger.i0.T1(0.8f, 1.0f, org.telegram.messenger.i0.z1(f7.floatValue(), 0.0f, -1.0f)));
                o8Var.P0.setTranslationY(org.telegram.messenger.i0.W1(org.telegram.messenger.i0.z1(f7.floatValue(), 0.0f, -1.0f), org.telegram.messenger.i0.L(12.0f), 0));
                if (f7.floatValue() < 0.0f) {
                    o8Var.e(false);
                    break;
                }
                break;
            case 12:
                Integer num3 = (Integer) obj;
                if (o8Var.K1 != null) {
                    e8 e8Var = o8Var.c1;
                    if (!e8Var.N1) {
                        e8Var.clearFocus();
                        if (num3.intValue() != 5) {
                            if (num3.intValue() != 0) {
                                if (num3.intValue() != 1) {
                                    if (num3.intValue() != 2) {
                                        if (num3.intValue() != 4) {
                                            if (num3.intValue() == 3) {
                                                o8Var.k0(3, false, true);
                                                break;
                                            }
                                        } else {
                                            o8Var.k0(1, false, true);
                                            break;
                                        }
                                    } else {
                                        o8Var.t();
                                        o8Var.G();
                                        s7 s7Var = o8Var.v1;
                                        if (s7Var != null) {
                                            s7Var.O0(1);
                                            s7Var.x0();
                                            break;
                                        }
                                    }
                                } else {
                                    o8Var.k0(0, false, true);
                                    s7 s7Var2 = o8Var.v1;
                                    if (s7Var2 != null) {
                                        s7Var2.O0(2);
                                        s7Var2.U1 = true;
                                        s7Var2.l0(true);
                                        o8Var.v1.v0 = true;
                                        break;
                                    }
                                }
                            } else {
                                o8Var.k0(0, false, true);
                                s7 s7Var3 = o8Var.v1;
                                if (s7Var3 != null) {
                                    s7Var3.v0 = false;
                                    s7Var3.O0(0);
                                    s7Var3.A0(null, true);
                                    break;
                                }
                            }
                        } else {
                            o8Var.W();
                            break;
                        }
                    }
                }
                break;
            case 13:
                FrameLayout frameLayout = o8Var.Y0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(o8Var.g0 == 2 ? org.telegram.messenger.i0.L(68.0f) : org.telegram.messenger.i0.L(64.0f) + (-(org.telegram.messenger.i0.L(12.0f) + o8Var.c1.getEditTextHeight())));
                }
                k7 k7Var2 = o8Var.d1;
                if (k7Var2 != null) {
                    int i17 = -(org.telegram.messenger.i0.L(24.0f) + o8Var.c1.getEditTextHeight());
                    k7Var2.setTranslationY(i17 - (o8Var.Z0 == null ? 0 : r3.getContentHeight() - org.telegram.messenger.i0.L(5.0f)));
                }
                wb wbVar2 = wb.w;
                if (wbVar2 != null && wbVar2.a == 2) {
                    wbVar2.l();
                }
                if (o8Var.c1.o0 && (k7Var = o8Var.d1) != null) {
                    k7Var.c(false, true);
                    break;
                }
                break;
            case 14:
                u6 u6Var = (u6) obj;
                n5 n5Var4 = o8Var.K1;
                if (n5Var4 != null) {
                    n5Var4.E0 = u6Var;
                }
                ArrayList arrayList3 = o8Var.H1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i12 < size) {
                        Object obj2 = arrayList3.get(i12);
                        i12++;
                        ((n5) obj2).E0 = u6Var;
                    }
                    break;
                }
                break;
            case 15:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                n5 n5Var5 = o8Var.K1;
                if (n5Var5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    n5Var5.v0 = inputPeer;
                    ArrayList arrayList4 = o8Var.H1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        while (i12 < size2) {
                            Object obj3 = arrayList4.get(i12);
                            i12++;
                            ((n5) obj3).v0 = o8Var.K1.v0;
                        }
                        break;
                    }
                }
                break;
            case 16:
                HashSet hashSet = (HashSet) obj;
                n5 n5Var6 = o8Var.K1;
                if (n5Var6 != null) {
                    n5Var6.w0 = hashSet;
                    ArrayList arrayList5 = o8Var.H1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        while (i12 < size3) {
                            Object obj4 = arrayList5.get(i12);
                            i12++;
                            ((n5) obj4).w0 = hashSet;
                        }
                        break;
                    }
                }
                break;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                n5 n5Var7 = o8Var.K1;
                if (n5Var7 != null) {
                    Bitmap bitmap3 = n5Var7.g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    o8Var.K1.g0 = bitmap2;
                    w6 w6Var2 = o8Var.q0;
                    if (w6Var2 != null) {
                        w6Var2.T0(bitmap2);
                        break;
                    }
                }
                break;
            case 18:
                o8Var.y0 = (u6) obj;
                break;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                g5 g5Var = o8Var.o0;
                o8Var.x0 = inputPeer2;
                g5Var.set(inputPeer2);
                break;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                g5 g5Var2 = o8Var.o0;
                o8Var.x0 = inputPeer3;
                g5Var2.set(inputPeer3);
                break;
            default:
                z1 z1Var2 = o8Var.s;
                float floatValue = ((Float) obj).floatValue();
                z1Var2.o = floatValue;
                z1Var2.n = z1.f(floatValue);
                z1Var2.g();
                break;
        }
    }
}
