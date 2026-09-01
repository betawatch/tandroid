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
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.li1;
import org.telegram.ui.mo;
import qh.a8;
import qh.ba;
import qh.c9;
import qh.ca;
import qh.f3;
import qh.f9;
import qh.g9;
import qh.l4;
import qh.q5;
import qh.r5;
import qh.u8;
import qh.x2;
import qh.y8;
import qh.z2;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                Utilities.searchQueue.postRunnable(new o71(e1Var, new ArrayList(e1Var.h.e), e1Var.h.n, 7));
                break;
            case 2:
                ((HttpGetFileTask) this.b).lambda$doInBackground$1();
                break;
            case 3:
                ((org.telegram.ui.Cells.n1) this.b).invalidateSelf();
                break;
            case 4:
                y1 y1Var = (y1) this.b;
                File databasePath = ApplicationLoader.applicationContext.getDatabasePath("webview.db");
                long length = (databasePath == null || !databasePath.exists()) ? 0L : databasePath.length();
                File databasePath2 = ApplicationLoader.applicationContext.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    length += databasePath2.length();
                }
                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    length += y1.Z(file, Boolean.FALSE);
                }
                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    length += y1.Z(file2, null);
                }
                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                AndroidUtilities.runOnUIThread(new mo(y1Var, length, file3.exists() ? y1.Z(file3, Boolean.TRUE) : 0L, 1));
                break;
            case 5:
                ((boolean[]) this.b)[0] = true;
                break;
            case 6:
                ((mi) this.b).hide();
                break;
            case 7:
                ph.l lVar = (ph.l) this.b;
                or0 or0Var = lVar.T;
                d6 d6Var = lVar.a;
                or0Var.a(d6Var == null ? "" : d6Var.E);
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
                l4 l4Var = (l4) this.b;
                ic.e();
                fg.n1 n1Var = new fg.n1((p2) new fg.x1(l4Var), 14, false);
                n1Var.setOnDismissListener(new eg.c0(7));
                n1Var.show();
                break;
            case 14:
                ((qh.g1) this.b).G();
                break;
            case 15:
                qh.n1 n1Var2 = (qh.n1) this.b;
                ArrayList arrayList = n1Var2.v;
                ArrayList arrayList2 = n1Var2.s;
                qh.o1 o1Var = n1Var2.K;
                qh.y1 y1Var2 = o1Var.s;
                i10 = ((h3) y1Var2).currentAccount;
                MediaDataController mediaDataController = MediaDataController.getInstance(i10);
                String str = n1Var2.E;
                if (!"premium".equalsIgnoreCase(str)) {
                    if (o1Var.a != 1 || !Emoji.fullyConsistsOfEmojis(n1Var2.E)) {
                        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                        String[] strArr = n1Var2.G;
                        if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                            i11 = ((h3) y1Var2).currentAccount;
                            MediaDataController.getInstance(i11).fetchNewEmojiKeywords(currentKeyboardLanguage);
                        }
                        n1Var2.G = currentKeyboardLanguage;
                        mediaDataController.getEmojiSuggestions(currentKeyboardLanguage, n1Var2.E, false, new qh.m1(n1Var2, str, mediaDataController, 0), null, false, false, false, true, 50, false);
                        break;
                    } else {
                        TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                        tL_messages_getStickers.emoticon = n1Var2.E;
                        tL_messages_getStickers.hash = 0L;
                        i12 = ((h3) y1Var2).currentAccount;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickers, new li1(1, n1Var2, str));
                        break;
                    }
                } else {
                    ArrayList<TLRPC.Document> recentStickers = mediaDataController.getRecentStickers(7);
                    n1Var2.x = 0;
                    arrayList2.clear();
                    arrayList.clear();
                    n1Var2.y.clear();
                    n1Var2.n.clear();
                    n1Var2.x++;
                    arrayList2.add(null);
                    arrayList.add(0L);
                    arrayList2.addAll(recentStickers);
                    n1Var2.x = recentStickers.size() + n1Var2.x;
                    n1Var2.F = n1Var2.E;
                    n1Var2.l();
                    qh.d1.w1(o1Var.b, 0, 0);
                    o1Var.f.c(false);
                    o1Var.e.n(false);
                    break;
                }
                break;
            case 16:
                qh.s1 s1Var = (qh.s1) ((eh.c) this.b).b;
                if (!s1Var.h) {
                    s1Var.n.setVisibility(8);
                    break;
                }
                break;
            case 17:
                qh.v1 v1Var = (qh.v1) ((i50) this.b).b;
                ArrayList arrayList3 = v1Var.o;
                if (!arrayList3.isEmpty()) {
                    v1Var.l.d(0.0f, true);
                    int i13 = v1Var.k + 1;
                    v1Var.k = i13;
                    if (i13 > arrayList3.size() - 1) {
                        v1Var.k = 0;
                    }
                    ng.h0 h0Var = v1Var.j;
                    h0Var.e((ng.q0) arrayList3.get(v1Var.k));
                    v1Var.j = v1Var.i;
                    v1Var.i = h0Var;
                    v1Var.p.invalidate();
                    break;
                }
                break;
            case 18:
                ((FfmpegAudioWaveformLoader) this.b).lambda$destroy$2();
                break;
            case 19:
                ((x2) this.b).b(null);
                break;
            case 20:
                ((z2) this.b).E();
                break;
            case 21:
                u8 u8Var = (u8) this.b;
                if (u8Var.F) {
                    u8Var.F = false;
                    u8Var.invalidate();
                    break;
                }
                break;
            case 22:
                r5 r5Var = ((q5) this.b).p;
                r5Var.N = System.currentTimeMillis();
                r5Var.O = 0L;
                r5Var.o0 = true;
                ((y8) r5Var.a).a.G0.a(0L, true);
                r5Var.invalidate();
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
                ((a8) ((lg.j) this.b).n).fullScroll(130);
                break;
            case 26:
                ba baVar = (ba) this.b;
                baVar.u0.onTouchEvent(AndroidUtilities.emptyMotionEvent());
                baVar.t0.J(AndroidUtilities.emptyMotionEvent());
                break;
            case 27:
                ca caVar = ((c9) this.b).h0;
                caVar.v(true);
                caVar.x0.setCameraThumb(caVar.A());
                break;
            case 28:
                ((f9) this.b).x2.m1.setVisibility(8);
                break;
            default:
                g9 g9Var = (g9) this.b;
                ca caVar2 = g9Var.V;
                if (!caVar2.N1 && !caVar2.M1 && caVar2.y0 != null && caVar2.c0 == 0 && caVar2.j1 != null) {
                    String string = LocaleController.getString(g9Var.isFrontface() ? R.string.StoryCameraSavedDualBackHint : R.string.StoryCameraSavedDualFrontHint);
                    f3 f3Var = caVar2.j1;
                    f3Var.h = f3.a(string, f3Var.getTextPaint());
                    caVar2.j1.t(string);
                    caVar2.j1.v();
                    MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", MessagesController.getGlobalMainSettings().getInt("storysvddualhint", 0) + 1).apply();
                    break;
                }
                break;
        }
    }
}
