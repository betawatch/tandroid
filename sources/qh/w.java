package qh;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.q70;
import org.telegram.ui.sj0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y b;

    public /* synthetic */ w(y yVar, int i10) {
        this.a = i10;
        this.b = yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e0 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b6  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        fg.s2 s2Var;
        long j10;
        fg.s2 s2Var2;
        boolean z4;
        long clamp;
        float f10;
        r rVar;
        fg.s2 s2Var3;
        switch (this.a) {
            case 0:
                y yVar = this.b;
                if (!yVar.b0 && !yVar.k0) {
                    x xVar = yVar.g0;
                    if (xVar != null && (s2Var = xVar.d) != null) {
                        s2Var.setVolume(0.0f);
                    }
                    x xVar2 = yVar.d0;
                    yVar.g0 = xVar2;
                    if (xVar2 != null && xVar2.n != null) {
                        Runnable runnable = yVar.i0;
                        if (runnable != null) {
                            runnable.run();
                        }
                        x xVar3 = yVar.g0;
                        fg.s2 s2Var4 = xVar3.d;
                        if (s2Var4 != null) {
                            s2Var4.setVolume(xVar3.n.P);
                        }
                        FrameLayout frameLayout = new FrameLayout(yVar.getContext());
                        ImageView imageView = new ImageView(yVar.getContext());
                        imageView.setImageResource(R.drawable.menu_lightbulb);
                        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        frameLayout.addView(imageView, k7.c6.d(24, 24.0f, 19, 12.0f, 12.0f, 12.0f, 12.0f));
                        TextView textView = new TextView(yVar.getContext());
                        textView.setText(LocaleController.getString(R.string.StoryCollageMenuHint));
                        textView.setTextSize(1, 13.0f);
                        textView.setTextColor(-1);
                        frameLayout.addView(textView, k7.c6.d(-1, -2.0f, 23, 47.0f, 8.0f, 24.0f, 8.0f));
                        q70 F = q70.F(yVar.a, yVar.b, yVar);
                        if (yVar.g0.n.K) {
                            m6 m6Var = new m6(yVar.getContext(), 0);
                            m6Var.b = 0.0f;
                            m6Var.c = 1.5f;
                            m6Var.d(yVar.g0.n.P);
                            m6Var.h = new org.telegram.ui.web.d1(yVar, 4);
                            m6Var.O = AndroidUtilities.dp(220.0f);
                            F.q(m6Var);
                            F.o();
                        }
                        F.T = 220;
                        F.c(R.drawable.menu_camera_retake, LocaleController.getString(R.string.StoreCollageRetake), new w(yVar, 4), false);
                        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new w(yVar, 5), true);
                        F.o();
                        F.r(frameLayout, k7.c6.n(220, -2));
                        F.p = new sj0(13);
                        F.i = 1;
                        F.V = true;
                        F.u = true;
                        F.v = false;
                        int dp = AndroidUtilities.dp(12.0f);
                        int dp2 = AndroidUtilities.dp(10.0f);
                        F.l = dp;
                        F.k = dp2;
                        F.p = new w(yVar, 6);
                        F.Z();
                        try {
                            yVar.performHapticFeedback(0, 1);
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 1:
                this.b.invalidate();
                break;
            case 2:
                y yVar2 = this.b;
                if (yVar2.c0) {
                    yVar2.c0 = false;
                    yVar2.invalidate();
                    break;
                }
                break;
            case 3:
                y yVar3 = this.b;
                long position = yVar3.getPosition();
                x mainPart = yVar3.getMainPart();
                if (mainPart == null) {
                    j10 = 0;
                } else {
                    s6 s6Var = mainPart.n;
                    j10 = s6Var.X + ((long) (s6Var.V * s6Var.h0));
                }
                for (int i10 = 0; i10 < yVar3.h.size(); i10++) {
                    x xVar4 = (x) yVar3.h.get(i10);
                    if (xVar4.n != null && (s2Var2 = xVar4.d) != null) {
                        long duration = s2Var2.getDuration();
                        long clamp2 = Utilities.clamp((position + j10) - xVar4.n.X, duration, 0L);
                        if (!yVar3.k0 || yVar3.n0) {
                            float f11 = clamp2;
                            s6 s6Var2 = xVar4.n;
                            float f12 = duration;
                            if (f11 > s6Var2.V * f12 && f11 < s6Var2.W * f12) {
                                z4 = true;
                                s6 s6Var3 = xVar4.n;
                                float f13 = duration;
                                clamp = Utilities.clamp(clamp2, (long) (s6Var3.W * f13), (long) (s6Var3.V * f13));
                                if (xVar4.d.isPlaying() != z4) {
                                    if (z4) {
                                        xVar4.d.play();
                                    } else {
                                        xVar4.d.pause();
                                    }
                                }
                                fg.s2 s2Var5 = xVar4.d;
                                if (!yVar3.s0) {
                                    s6 s6Var4 = xVar4.n;
                                    if (!s6Var4.Y && yVar3.k0) {
                                        f10 = s6Var4.P;
                                        s2Var5.setVolume(f10);
                                        if (Math.abs((xVar4.g >= 0 ? xVar4.g : xVar4.d.getCurrentPosition()) - clamp) <= 450 && xVar4.g < 0) {
                                            fg.s2 s2Var6 = xVar4.d;
                                            xVar4.g = clamp;
                                            s2Var6.seekTo(clamp, yVar3.m0, new org.telegram.ui.web.s0(xVar4, 10));
                                        }
                                    }
                                }
                                f10 = 0.0f;
                                s2Var5.setVolume(f10);
                                if (Math.abs((xVar4.g >= 0 ? xVar4.g : xVar4.d.getCurrentPosition()) - clamp) <= 450) {
                                    fg.s2 s2Var62 = xVar4.d;
                                    xVar4.g = clamp;
                                    s2Var62.seekTo(clamp, yVar3.m0, new org.telegram.ui.web.s0(xVar4, 10));
                                }
                            }
                        }
                        z4 = false;
                        s6 s6Var32 = xVar4.n;
                        float f132 = duration;
                        clamp = Utilities.clamp(clamp2, (long) (s6Var32.W * f132), (long) (s6Var32.V * f132));
                        if (xVar4.d.isPlaying() != z4) {
                        }
                        fg.s2 s2Var52 = xVar4.d;
                        if (!yVar3.s0) {
                        }
                        f10 = 0.0f;
                        s2Var52.setVolume(f10);
                        if (Math.abs((xVar4.g >= 0 ? xVar4.g : xVar4.d.getCurrentPosition()) - clamp) <= 450) {
                        }
                    }
                }
                ma maVar = yVar3.o0;
                if (maVar != null) {
                    maVar.setProgress(position);
                }
                j5 j5Var = yVar3.p0;
                if (j5Var != null) {
                    j5Var.w(true);
                    yVar3.p0.y(true);
                }
                if (yVar3.k0 && yVar3.n0) {
                    AndroidUtilities.runOnUIThread(yVar3.t0, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                    break;
                }
                break;
            case 4:
                y yVar4 = this.b;
                x xVar5 = yVar4.g0;
                if (xVar5 != null) {
                    xVar5.a(null);
                    yVar4.q();
                    yVar4.invalidate();
                    Runnable runnable2 = yVar4.j0;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                }
                break;
            case 5:
                y yVar5 = this.b;
                x xVar6 = yVar5.g0;
                if (xVar6 != null && yVar5.h.indexOf(xVar6) >= 0) {
                    r rVar2 = yVar5.f;
                    int indexOf = rVar2.e.indexOf(xVar6.h);
                    ArrayList arrayList = rVar2.e;
                    if (indexOf < 0 || indexOf >= arrayList.size()) {
                        rVar = null;
                    } else {
                        ArrayList arrayList2 = new ArrayList(arrayList);
                        arrayList2.remove(indexOf);
                        StringBuilder sb = new StringBuilder();
                        int i11 = 0;
                        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                            q qVar = (q) arrayList2.get(i12);
                            if (qVar.c != i11) {
                                sb.append("/");
                                i11 = qVar.c;
                            }
                            sb.append(".");
                        }
                        rVar = new r(sb.toString());
                    }
                    if (rVar.e.size() <= 1) {
                        yVar5.e();
                        yVar5.invalidate();
                    }
                    yVar5.o(rVar);
                    yVar5.c0 = true;
                    yVar5.q();
                    yVar5.invalidate();
                    Runnable runnable3 = yVar5.j0;
                    if (runnable3 != null) {
                        runnable3.run();
                    }
                    ca caVar = ((p9) yVar5).v0;
                    caVar.F0.a(false, true);
                    if (rVar.e.size() > 1) {
                        v vVar = caVar.D0;
                        caVar.w0 = rVar;
                        vVar.a(new lc0(rVar, false), true);
                        caVar.D0.b(true, true);
                    } else {
                        caVar.D0.b(false, true);
                    }
                    caVar.m0(true);
                    c9 c9Var = caVar.J0;
                    if (c9Var != null) {
                        c9Var.setMultipleOnClick(caVar.x0.j());
                        caVar.J0.setMaxCount(Math.min(10, r.b() - caVar.x0.getFilledCount()));
                        break;
                    }
                }
                break;
            default:
                x xVar7 = this.b.g0;
                if (xVar7 != null && (s2Var3 = xVar7.d) != null) {
                    s2Var3.setVolume(0.0f);
                    break;
                }
                break;
        }
    }
}
