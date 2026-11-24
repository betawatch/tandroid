// default package

import android.content.Context;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MusicPlayerService;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class pg6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pg6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f;
        int i;
        zna znaVar;
        String d;
        TelephonyManager telephonyManager;
        byte b = this.a;
        Integer num = null;
        byte b2 = 2;
        Object obj = this.b;
        switch (b) {
            case 0:
                double currentTimeMillis = System.currentTimeMillis();
                rg6 rg6Var = ((qg6) obj).b;
                double d2 = currentTimeMillis - rg6Var.e0;
                rg6Var.e0 = currentTimeMillis;
                int i2 = (int) (rg6Var.c0 - d2);
                rg6Var.c0 = i2;
                if (i2 <= 1000) {
                    rg6Var.setProblemTextVisible(true);
                    rg6Var.w.setVisibility(8);
                    ng6 ng6Var = rg6Var.y;
                    if (ng6Var != null) {
                        ng6Var.setVisibility(0);
                    }
                    rg6Var.s();
                    return;
                }
                return;
            case 1:
                double currentTimeMillis2 = System.currentTimeMillis();
                rg6 rg6Var2 = ((qg6) obj).b;
                double d3 = rg6Var2.d0;
                ng6 ng6Var2 = rg6Var2.w;
                rg6Var2.d0 = currentTimeMillis2;
                int i3 = (int) (rg6Var2.b0 - (currentTimeMillis2 - d3));
                rg6Var2.b0 = i3;
                if (i3 < 1000) {
                    rg6Var2.t();
                    int i4 = rg6Var2.j0;
                    if (i4 == 3 || i4 == 4 || i4 == 2 || i4 == 17 || i4 == 16 || i4 == 11) {
                        if (i4 == 4) {
                            ng6Var2.setText(jb6.M0(2131745910, "RequestCallButton"));
                        } else if (i4 == 11 || i4 == 3) {
                            ng6Var2.setText(jb6.M0(2131745909, null));
                        } else {
                            ng6Var2.setText(jb6.M0(2131745908, "RequestSmsButton"));
                        }
                        int i5 = cmb.O9;
                        anb.X(ng6Var2, i5, null);
                        ng6Var2.setTag(R.id.color_key_tag, Integer.valueOf(i5));
                        return;
                    }
                    return;
                }
                int i6 = i3 / 1000;
                int i7 = i6 / 60;
                int i8 = i6 - (i7 * 60);
                int i9 = rg6Var2.j0;
                if (i9 == 4 || i9 == 3 || i9 == 11) {
                    ng6Var2.setText(jb6.a0("CallAvailableIn", null, 2131752583, Integer.valueOf(i7), Integer.valueOf(i8)));
                    return;
                }
                if (rg6Var2.i0 == 2 && (i9 == 2 || i9 == 17 || i9 == 16)) {
                    ng6Var2.setText(jb6.a0("ResendSmsAvailableIn", null, 2131745852, Integer.valueOf(i7), Integer.valueOf(i8)));
                    return;
                } else {
                    if (i9 == 2 || i9 == 17 || i9 == 16) {
                        ng6Var2.setText(jb6.a0("SmsAvailableIn", null, 2131745031, Integer.valueOf(i7), Integer.valueOf(i8)));
                        return;
                    }
                    return;
                }
            case 2:
                ((d65) obj).run();
                return;
            case 3:
                ((ej6) obj).q();
                return;
            case 4:
                hk6 hk6Var = (hk6) obj;
                hk6Var.k = false;
                hk6Var.c();
                return;
            case 5:
                fl6 fl6Var = (fl6) obj;
                if (fl6Var.d) {
                    fl6Var.e = true;
                    fl6Var.r = false;
                    fl6Var.f = 0.0f;
                    fl6Var.h = SystemClock.uptimeMillis();
                    fl6Var.invalidate();
                    return;
                }
                return;
            case 6:
                ((nn6) obj).d.l(true, true, false, false);
                return;
            case 7:
                ((xn6) obj).e.l(true, true, false, false);
                return;
            case 8:
                pe1 pe1Var = (pe1) obj;
                if (!PhotoViewer.r0().V0()) {
                    MediaController.Z1 = null;
                    MediaController.N(0);
                    return;
                } else {
                    pg6 pg6Var = new pg6(pe1Var, r7);
                    MediaController.Z1 = pg6Var;
                    gm.d3(pg6Var, 2000L);
                    return;
                }
            case 9:
                ((ho6) obj).d();
                return;
            case 10:
                oo6 oo6Var = (oo6) obj;
                try {
                    o04 o04Var = new o04();
                    o04Var.b = oo6Var;
                    Thread thread = new Thread(o04Var, "VideoConvertRunnable");
                    thread.start();
                    thread.join();
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 11:
                nm7.e().k(nm7.T4, 0, (TLRPC.Document) obj, 7);
                return;
            case 12:
                ((s31) obj).f();
                return;
            case 13:
                h97 h97Var = (h97) obj;
                if (h97Var != null) {
                    h97Var.a(null);
                    return;
                }
                return;
            case 14:
                ((cu6) obj).n = -1;
                return;
            case 15:
                w07 w07Var = (w07) obj;
                w07Var.f();
                w07Var.e(true);
                return;
            case 16:
                final u17 u17Var = (u17) obj;
                boolean z = u17Var.J;
                boolean z2 = !z;
                pt7 pt7Var = u17Var.e;
                t17 t17Var = u17Var.b;
                if (t17Var == null || pt7Var == null) {
                    u17Var.P = 0;
                    return;
                }
                if (u17Var.M && (znaVar = u17Var.L) != null && znaVar.f && !z) {
                    u17Var.P = 0;
                    return;
                }
                boolean g = u17Var.g();
                if (z) {
                    int computeVerticalScrollRange = t17Var.computeVerticalScrollRange();
                    f = (computeVerticalScrollRange - pt7Var.h) + u17Var.s;
                    if (computeVerticalScrollRange <= 0 && u17Var.f.K() > 0 && (i = u17Var.P) < 3) {
                        u17Var.P = i + 1;
                        u17Var.o(true);
                        return;
                    }
                } else {
                    f = (-u17Var.s) - gm.L(6.0f);
                }
                u17Var.P = 0;
                float f2 = u17Var.w;
                float max = g ? -Math.max(0.0f, f2 - f) : Math.max(0.0f, f2 - f) + (-f2);
                if (!z && !g) {
                    max += t17Var.computeVerticalScrollOffset();
                }
                zna znaVar2 = u17Var.L;
                if (znaVar2 != null) {
                    znaVar2.d();
                }
                u17Var.M = z2;
                final float translationY = t17Var.getTranslationY();
                final float f3 = u17Var.N;
                final float f4 = !z ? 1.0f : 0.0f;
                if (translationY == max) {
                    u17Var.L = null;
                    num = Integer.valueOf(z ? (byte) 0 : (byte) 8);
                    if (u17Var.O && !z) {
                        u17Var.O = false;
                        t17Var.setLayoutManager(u17Var.getNeededLayoutManager());
                        u17Var.J = true;
                        u17Var.o(true);
                    }
                } else {
                    zna znaVar3 = new zna(new xk4(translationY));
                    aoa aoaVar = new aoa(max);
                    aoaVar.a(1.0f);
                    aoaVar.b(550.0f);
                    znaVar3.m = aoaVar;
                    u17Var.L = znaVar3;
                    final float f5 = max;
                    znaVar3.b(new it3() { // from class: l17
                        @Override // it3
                        public final void a(zna znaVar4, float f6, float f7) {
                            u17 u17Var2 = u17.this;
                            u17Var2.b.setTranslationY(f6);
                            u17Var2.i();
                            float f8 = translationY;
                            u17Var2.N = gm.R1(f3, f4, (f6 - f8) / (f5 - f8));
                        }
                    });
                    if (!z) {
                        u17Var.L.a(new ay5(u17Var, z2, b2));
                    }
                    u17Var.L.a(new m17());
                    u17Var.L.h();
                }
                if (num == null || u17Var.getVisibility() == num.intValue()) {
                    return;
                }
                u17Var.setVisibility(num.intValue());
                return;
            case 17:
                ((h22) obj).setVisibility(8);
                return;
            case 18:
                pv7 pv7Var = (pv7) obj;
                pv7Var.z0 = true;
                pv7Var.s();
                return;
            case 19:
                ((f57) ((s37) obj).T).n.f();
                return;
            case 20:
                ((n57) obj).a();
                return;
            case 21:
                gm.E3(((u67) obj).p1);
                return;
            case 22:
                ((ho1) obj).run();
                return;
            case 23:
                u3b u3bVar = ((sc7) obj).E;
                if (u3bVar != null) {
                    u3bVar.p(3, true);
                    return;
                }
                return;
            case 24:
                ((mf2) obj).a(null);
                return;
            case 25:
                ((tl2) obj).invalidateSelf();
                return;
            case 26:
                r8b r8bVar = (r8b) obj;
                if (r8bVar.J) {
                    r8bVar.J = false;
                    r8bVar.invalidate();
                    return;
                }
                return;
            case 27:
                ((MusicPlayerService) obj).stopSelf();
                return;
            case 28:
                ((kc2) obj).invalidateSelf();
                return;
            default:
                dl7 dl7Var = (dl7) obj;
                db3 db3Var = (db3) dl7Var.a.get();
                if (db3Var != null) {
                    int h = dl7Var.c.h();
                    eb3 eb3Var = db3Var.a;
                    synchronized (eb3Var) {
                        int i10 = eb3Var.n;
                        if (i10 == 0 || eb3Var.e) {
                            if (i10 != h || eb3Var.o == null) {
                                eb3Var.n = h;
                                if (h == 1 || h == 0 || h == 8) {
                                    return;
                                }
                                if (eb3Var.o == null) {
                                    Context context = eb3Var.a;
                                    String str = hac.a;
                                    if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                        String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                        if (!TextUtils.isEmpty(networkCountryIso)) {
                                            d = vod.d(networkCountryIso);
                                            eb3Var.o = d;
                                        }
                                    }
                                    d = vod.d(Locale.getDefault().getCountry());
                                    eb3Var.o = d;
                                }
                                eb3Var.l = eb3Var.c(h);
                                eb3Var.d.getClass();
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                eb3Var.e(eb3Var.i, eb3Var.g > 0 ? (int) (elapsedRealtime - eb3Var.h) : 0, eb3Var.l);
                                eb3Var.h = elapsedRealtime;
                                eb3Var.i = 0L;
                                eb3Var.k = 0L;
                                eb3Var.j = 0L;
                                ola olaVar = eb3Var.f;
                                olaVar.a.clear();
                                olaVar.c = -1;
                                olaVar.d = 0;
                                olaVar.e = 0;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }
}
