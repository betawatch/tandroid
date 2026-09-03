package org.telegram.ui.web;

import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import oh.d6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.i50;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.mo;
import org.telegram.ui.ri1;
import qh.aa;
import qh.b9;
import qh.ba;
import qh.e3;
import qh.e9;
import qh.f9;
import qh.k4;
import qh.p5;
import qh.q5;
import qh.t8;
import qh.w2;
import qh.x8;
import qh.y2;
import qh.z7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        switch (this.a) {
            case 0:
                af.g.s(((t0) this.b).b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 1:
                e1 e1Var = (e1) this.b;
                Utilities.searchQueue.postRunnable(new n71(e1Var, new ArrayList(e1Var.h.e), e1Var.h.n, 7));
                break;
            case 2:
                ((HttpGetFileTask) this.b).lambda$doInBackground$1();
                break;
            case 3:
                ((org.telegram.ui.Cells.n1) this.b).invalidateSelf();
                break;
            case 4:
                x1 x1Var = (x1) this.b;
                File databasePath = ApplicationLoader.applicationContext.getDatabasePath("webview.db");
                long length = (databasePath == null || !databasePath.exists()) ? 0L : databasePath.length();
                File databasePath2 = ApplicationLoader.applicationContext.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    length += databasePath2.length();
                }
                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    length += x1.Z(file, Boolean.FALSE);
                }
                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    length += x1.Z(file2, null);
                }
                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                AndroidUtilities.runOnUIThread(new mo(x1Var, length, file3.exists() ? x1.Z(file3, Boolean.TRUE) : 0L, 1));
                break;
            case 5:
                ((boolean[]) this.b)[0] = true;
                break;
            case 6:
                ((mi) this.b).hide();
                break;
            case 7:
                ph.l lVar = (ph.l) this.b;
                nr0 nr0Var = lVar.T;
                d6 d6Var = lVar.a;
                nr0Var.a(d6Var == null ? "" : d6Var.E);
                break;
            case 8:
                ((qh.g) this.b).c.T = false;
                break;
            case 9:
                ((qh.j) this.b).invalidateSelf();
                break;
            case 10:
                ((qh.x) this.b).g = -1L;
                break;
            case 11:
                qh.f0 f0Var = (qh.f0) this.b;
                eg.i iVar = f0Var.b.E;
                if (iVar != null) {
                    iVar.b();
                }
                f0Var.b.k();
                break;
            case 12:
                ((qh.o0) this.b).a(false);
                break;
            case 13:
                k4 k4Var = (k4) this.b;
                ic.e();
                fg.n1 n1Var = new fg.n1((p2) new fg.x1(k4Var), 14, false);
                n1Var.setOnDismissListener(new eg.c0(7));
                n1Var.show();
                break;
            case 14:
                ((qh.f1) this.b).G();
                break;
            case 15:
                qh.m1 m1Var = (qh.m1) this.b;
                ArrayList arrayList = m1Var.v;
                ArrayList arrayList2 = m1Var.s;
                qh.n1 n1Var2 = m1Var.K;
                qh.x1 x1Var2 = n1Var2.s;
                i10 = ((h3) x1Var2).currentAccount;
                MediaDataController mediaDataController = MediaDataController.getInstance(i10);
                String str = m1Var.E;
                if (!"premium".equalsIgnoreCase(str)) {
                    if (n1Var2.a != 1 || !Emoji.fullyConsistsOfEmojis(m1Var.E)) {
                        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                        String[] strArr = m1Var.G;
                        if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                            i11 = ((h3) x1Var2).currentAccount;
                            MediaDataController.getInstance(i11).fetchNewEmojiKeywords(currentKeyboardLanguage);
                        }
                        m1Var.G = currentKeyboardLanguage;
                        mediaDataController.getEmojiSuggestions(currentKeyboardLanguage, m1Var.E, false, new qh.l1(m1Var, str, mediaDataController, 0), null, false, false, false, true, 50, false);
                        break;
                    } else {
                        TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                        tL_messages_getStickers.emoticon = m1Var.E;
                        tL_messages_getStickers.hash = 0L;
                        i12 = ((h3) x1Var2).currentAccount;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickers, new ri1(1, m1Var, str));
                        break;
                    }
                } else {
                    ArrayList<TLRPC.Document> recentStickers = mediaDataController.getRecentStickers(7);
                    m1Var.x = 0;
                    arrayList2.clear();
                    arrayList.clear();
                    m1Var.y.clear();
                    m1Var.n.clear();
                    m1Var.x++;
                    arrayList2.add(null);
                    arrayList.add(0L);
                    arrayList2.addAll(recentStickers);
                    m1Var.x = recentStickers.size() + m1Var.x;
                    m1Var.F = m1Var.E;
                    m1Var.l();
                    qh.d1.v1(n1Var2.b, 0, 0);
                    n1Var2.f.c(false);
                    n1Var2.e.n(false);
                    break;
                }
                break;
            case 16:
                qh.r1 r1Var = (qh.r1) ((eh.c) this.b).b;
                if (!r1Var.h) {
                    r1Var.n.setVisibility(8);
                    break;
                }
                break;
            case 17:
                qh.u1 u1Var = (qh.u1) ((i50) this.b).b;
                ArrayList arrayList3 = u1Var.o;
                if (!arrayList3.isEmpty()) {
                    u1Var.l.d(0.0f, true);
                    int i13 = u1Var.k + 1;
                    u1Var.k = i13;
                    if (i13 > arrayList3.size() - 1) {
                        u1Var.k = 0;
                    }
                    ng.h0 h0Var = u1Var.j;
                    h0Var.e((ng.q0) arrayList3.get(u1Var.k));
                    u1Var.j = u1Var.i;
                    u1Var.i = h0Var;
                    u1Var.p.invalidate();
                    break;
                }
                break;
            case 18:
                ((FfmpegAudioWaveformLoader) this.b).lambda$destroy$2();
                break;
            case 19:
                ((w2) this.b).b(null);
                break;
            case 20:
                ((y2) this.b).E();
                break;
            case 21:
                t8 t8Var = (t8) this.b;
                if (t8Var.F) {
                    t8Var.F = false;
                    t8Var.invalidate();
                    break;
                }
                break;
            case 22:
                q5 q5Var = ((p5) this.b).p;
                q5Var.N = System.currentTimeMillis();
                q5Var.O = 0L;
                q5Var.o0 = true;
                ((x8) q5Var.a).a.G0.a(0L, true);
                q5Var.invalidate();
                break;
            case 23:
                qh.n nVar = (qh.n) this.b;
                if (nVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) nVar.getParent()).removeView(nVar);
                    break;
                }
                break;
            case 24:
                qh.d dVar = (qh.d) this.b;
                if (dVar != null) {
                    dVar.setLoading(false);
                    break;
                }
                break;
            case 25:
                ((z7) ((lg.j) this.b).n).fullScroll(130);
                break;
            case 26:
                aa aaVar = (aa) this.b;
                aaVar.u0.onTouchEvent(AndroidUtilities.emptyMotionEvent());
                aaVar.t0.J(AndroidUtilities.emptyMotionEvent());
                break;
            case 27:
                ba baVar = ((b9) this.b).h0;
                baVar.v(true);
                baVar.x0.setCameraThumb(baVar.A());
                break;
            case 28:
                ((e9) this.b).x2.m1.setVisibility(8);
                break;
            default:
                f9 f9Var = (f9) this.b;
                ba baVar2 = f9Var.V;
                if (!baVar2.N1 && !baVar2.M1 && baVar2.y0 != null && baVar2.c0 == 0 && baVar2.j1 != null) {
                    String string = LocaleController.getString(f9Var.isFrontface() ? R.string.StoryCameraSavedDualBackHint : R.string.StoryCameraSavedDualFrontHint);
                    e3 e3Var = baVar2.j1;
                    e3Var.h = e3.a(string, e3Var.getTextPaint());
                    baVar2.j1.s(string);
                    baVar2.j1.u();
                    MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", MessagesController.getGlobalMainSettings().getInt("storysvddualhint", 0) + 1).apply();
                    break;
                }
                break;
        }
    }
}
