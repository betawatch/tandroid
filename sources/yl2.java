// default package

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class yl2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cm2 b;

    public /* synthetic */ yl2(cm2 cm2Var, byte b) {
        this.a = b;
        this.b = cm2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c5 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a0  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        am2 am2Var;
        long j;
        am2 am2Var2;
        boolean z;
        long k;
        float f;
        am2 am2Var3;
        byte b = this.a;
        byte b2 = 5;
        byte b3 = 10;
        sl2 sl2Var = null;
        cm2 cm2Var = this.b;
        switch (b) {
            case 0:
                if (!cm2Var.f0 && !cm2Var.o0) {
                    bm2 bm2Var = cm2Var.k0;
                    if (bm2Var != null && (am2Var = bm2Var.d) != null) {
                        am2Var.setVolume(0.0f);
                    }
                    bm2 bm2Var2 = cm2Var.h0;
                    cm2Var.k0 = bm2Var2;
                    if (bm2Var2 != null && bm2Var2.n != null) {
                        Runnable runnable = cm2Var.m0;
                        if (runnable != null) {
                            runnable.run();
                        }
                        bm2 bm2Var3 = cm2Var.k0;
                        am2 am2Var4 = bm2Var3.d;
                        if (am2Var4 != null) {
                            am2Var4.setVolume(bm2Var3.n.P);
                        }
                        FrameLayout frameLayout = new FrameLayout(cm2Var.getContext());
                        ImageView imageView = new ImageView(cm2Var.getContext());
                        imageView.setImageResource(R.drawable.menu_lightbulb);
                        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        frameLayout.addView(imageView, qoe.d(24, 24.0f, 19, 12.0f, 12.0f, 12.0f, 12.0f));
                        TextView textView = new TextView(cm2Var.getContext());
                        td4.v(13.0f, 2131744391, 1, textView, null);
                        textView.setTextColor(-1);
                        frameLayout.addView(textView, qoe.d(-1, -2.0f, 23, 47.0f, 8.0f, 24.0f, 8.0f));
                        bu5 G = bu5.G(cm2Var.a, cm2Var.b, cm2Var);
                        if (cm2Var.k0.n.K) {
                            mla mlaVar = new mla(cm2Var.getContext(), 0);
                            mlaVar.b = 0.0f;
                            mlaVar.c = 1.5f;
                            mlaVar.c(cm2Var.k0.n.P);
                            mlaVar.h = new mf2(cm2Var, (byte) 25);
                            mlaVar.S = gm.L(220.0f);
                            G.p(mlaVar);
                            G.n(true);
                        }
                        G.W = (short) 220;
                        G.b(R.drawable.menu_camera_retake, jb6.M0(2131744500, null), new yl2(cm2Var, (byte) 4), false);
                        G.b(R.drawable.msg_delete, jb6.M0(2131751535, null), new yl2(cm2Var, b2), true);
                        G.n(true);
                        G.q(frameLayout, qoe.o(nm7.w3, -2));
                        G.p = new jd(b3);
                        G.i = (byte) 1;
                        G.Y = true;
                        G.u = true;
                        G.v = false;
                        int L = gm.L(12.0f);
                        int L2 = gm.L(10.0f);
                        G.l = L;
                        G.k = L2;
                        G.p = new yl2(cm2Var, (byte) 6);
                        G.a0();
                        try {
                            cm2Var.performHapticFeedback(0, 1);
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 1:
                cm2Var.invalidate();
                break;
            case 2:
                if (cm2Var.g0) {
                    cm2Var.g0 = false;
                    cm2Var.invalidate();
                    break;
                }
                break;
            case 3:
                long position = cm2Var.getPosition();
                bm2 mainPart = cm2Var.getMainPart();
                if (mainPart == null) {
                    j = 0;
                } else {
                    g6b g6bVar = mainPart.n;
                    j = g6bVar.X + ((long) (g6bVar.V * g6bVar.h0));
                }
                for (int i = 0; i < cm2Var.h.size(); i++) {
                    bm2 bm2Var4 = (bm2) cm2Var.h.get(i);
                    if (bm2Var4.n != null && (am2Var2 = bm2Var4.d) != null) {
                        long duration = am2Var2.getDuration();
                        long k2 = Utilities.k((position + j) - bm2Var4.n.X, duration, 0L);
                        if (!cm2Var.o0 || cm2Var.r0) {
                            float f2 = k2;
                            g6b g6bVar2 = bm2Var4.n;
                            float f3 = duration;
                            if (f2 > g6bVar2.V * f3 && f2 < g6bVar2.W * f3) {
                                z = true;
                                g6b g6bVar3 = bm2Var4.n;
                                float f4 = duration;
                                k = Utilities.k(k2, (long) (g6bVar3.W * f4), (long) (g6bVar3.V * f4));
                                if (bm2Var4.d.isPlaying() != z) {
                                    am2 am2Var5 = bm2Var4.d;
                                    if (z) {
                                        am2Var5.play();
                                    } else {
                                        am2Var5.pause();
                                    }
                                }
                                am2 am2Var6 = bm2Var4.d;
                                if (!cm2Var.w0) {
                                    g6b g6bVar4 = bm2Var4.n;
                                    if (!g6bVar4.Y && cm2Var.o0) {
                                        f = g6bVar4.P;
                                        am2Var6.setVolume(f);
                                        if (Math.abs((bm2Var4.g >= 0 ? bm2Var4.g : bm2Var4.d.getCurrentPosition()) - k) <= 450 && bm2Var4.g < 0) {
                                            am2 am2Var7 = bm2Var4.d;
                                            bm2Var4.g = k;
                                            am2Var7.seekTo(k, cm2Var.q0, new xf2(bm2Var4, b2));
                                        }
                                    }
                                }
                                f = 0.0f;
                                am2Var6.setVolume(f);
                                if (Math.abs((bm2Var4.g >= 0 ? bm2Var4.g : bm2Var4.d.getCurrentPosition()) - k) <= 450) {
                                    am2 am2Var72 = bm2Var4.d;
                                    bm2Var4.g = k;
                                    am2Var72.seekTo(k, cm2Var.q0, new xf2(bm2Var4, b2));
                                }
                            }
                        }
                        z = false;
                        g6b g6bVar32 = bm2Var4.n;
                        float f42 = duration;
                        k = Utilities.k(k2, (long) (g6bVar32.W * f42), (long) (g6bVar32.V * f42));
                        if (bm2Var4.d.isPlaying() != z) {
                        }
                        am2 am2Var62 = bm2Var4.d;
                        if (!cm2Var.w0) {
                        }
                        f = 0.0f;
                        am2Var62.setVolume(f);
                        if (Math.abs((bm2Var4.g >= 0 ? bm2Var4.g : bm2Var4.d.getCurrentPosition()) - k) <= 450) {
                        }
                    }
                }
                lqb lqbVar = cm2Var.s0;
                if (lqbVar != null) {
                    lqbVar.setProgress(position);
                }
                cl8 cl8Var = cm2Var.t0;
                if (cl8Var != null) {
                    cl8Var.w(true);
                    cm2Var.t0.y(true);
                }
                if (cm2Var.o0 && cm2Var.r0) {
                    gm.d3(cm2Var.x0, (long) (1000.0f / gm.r));
                    break;
                }
                break;
            case 4:
                bm2 bm2Var5 = cm2Var.k0;
                if (bm2Var5 != null) {
                    bm2Var5.a(null);
                    cm2Var.q();
                    cm2Var.invalidate();
                    Runnable runnable2 = cm2Var.n0;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                }
                break;
            case 5:
                bm2 bm2Var6 = cm2Var.k0;
                if (bm2Var6 != null && cm2Var.h.indexOf(bm2Var6) >= 0) {
                    sl2 sl2Var2 = cm2Var.f;
                    int indexOf = sl2Var2.e.indexOf(bm2Var6.h);
                    ArrayList arrayList = sl2Var2.e;
                    if (indexOf >= 0 && indexOf < arrayList.size()) {
                        ArrayList arrayList2 = new ArrayList(arrayList);
                        arrayList2.remove(indexOf);
                        StringBuilder sb = new StringBuilder();
                        int i2 = 0;
                        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                            rl2 rl2Var = (rl2) arrayList2.get(i3);
                            if (rl2Var.c != i2) {
                                sb.append("/");
                                i2 = rl2Var.c;
                            }
                            sb.append(".");
                        }
                        sl2Var = new sl2(sb.toString());
                    }
                    if (sl2Var.e.size() <= 1) {
                        cm2Var.b();
                        cm2Var.invalidate();
                    }
                    cm2Var.o(sl2Var);
                    cm2Var.g0 = true;
                    cm2Var.q();
                    cm2Var.invalidate();
                    Runnable runnable3 = cm2Var.n0;
                    if (runnable3 != null) {
                        runnable3.run();
                    }
                    v9b v9bVar = ((j9b) cm2Var).y0;
                    v9bVar.J0.a(false, true);
                    int size = sl2Var.e.size();
                    xl2 xl2Var = v9bVar.H0;
                    if (size > 1) {
                        v9bVar.A0 = sl2Var;
                        xl2Var.a(new tl2(sl2Var, false), true);
                        v9bVar.H0.b(true, true);
                    } else {
                        xl2Var.b(false, true);
                    }
                    v9bVar.l0(true);
                    wt4 wt4Var = v9bVar.N0;
                    if (wt4Var != null) {
                        wt4Var.setMultipleOnClick(v9bVar.B0.i());
                        v9bVar.N0.setMaxCount(Math.min(10, sl2.b() - v9bVar.B0.getFilledCount()));
                        break;
                    }
                }
                break;
            default:
                bm2 bm2Var7 = cm2Var.k0;
                if (bm2Var7 != null && (am2Var3 = bm2Var7.d) != null) {
                    am2Var3.setVolume(0.0f);
                    break;
                }
                break;
        }
    }
}
