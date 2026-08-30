package org.telegram.ui.web;

import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
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
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.g50;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.vt;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.ii1;
import org.telegram.ui.mo;
import ph.a9;
import ph.c8;
import ph.ca;
import ph.da;
import ph.e9;
import ph.f3;
import ph.h9;
import ph.i9;
import ph.l4;
import ph.s5;
import ph.t5;
import ph.w8;
import ph.x2;
import ph.z2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o0(Object obj, int i10) {
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
                ((vt) this.b).requestFocus();
                break;
            case 1:
                af.g.s(((s0) this.b).b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 2:
                d1 d1Var = (d1) this.b;
                Utilities.searchQueue.postRunnable(new m71(d1Var, new ArrayList(d1Var.h.e), d1Var.h.n, 7));
                break;
            case 3:
                ((HttpGetFileTask) this.b).lambda$doInBackground$1();
                break;
            case 4:
                ((org.telegram.ui.Cells.n1) this.b).invalidateSelf();
                break;
            case 5:
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
            case 6:
                ((boolean[]) this.b)[0] = true;
                break;
            case 7:
                ((ph.g) this.b).c.T = false;
                break;
            case 8:
                ((ph.j) this.b).invalidateSelf();
                break;
            case 9:
                ((ph.x) this.b).g = -1L;
                break;
            case 10:
                ph.f0 f0Var = (ph.f0) this.b;
                dg.i iVar = f0Var.b.E;
                if (iVar != null) {
                    iVar.b();
                }
                f0Var.b.k();
                break;
            case 11:
                ((ph.o0) this.b).a(false);
                break;
            case 12:
                l4 l4Var = (l4) this.b;
                ic.e();
                eg.o1 o1Var = new eg.o1((p2) new eg.y1(l4Var), 14, false);
                o1Var.setOnDismissListener(new dg.e0(7));
                o1Var.show();
                break;
            case 13:
                ((ph.g1) this.b).G();
                break;
            case 14:
                ph.n1 n1Var = (ph.n1) this.b;
                ArrayList arrayList = n1Var.v;
                ArrayList arrayList2 = n1Var.s;
                ph.o1 o1Var2 = n1Var.K;
                ph.y1 y1Var = o1Var2.s;
                i10 = ((g3) y1Var).currentAccount;
                MediaDataController mediaDataController = MediaDataController.getInstance(i10);
                String str = n1Var.E;
                if (!"premium".equalsIgnoreCase(str)) {
                    if (o1Var2.a != 1 || !Emoji.fullyConsistsOfEmojis(n1Var.E)) {
                        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                        String[] strArr = n1Var.G;
                        if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                            i11 = ((g3) y1Var).currentAccount;
                            MediaDataController.getInstance(i11).fetchNewEmojiKeywords(currentKeyboardLanguage);
                        }
                        n1Var.G = currentKeyboardLanguage;
                        mediaDataController.getEmojiSuggestions(currentKeyboardLanguage, n1Var.E, false, new ph.m1(n1Var, str, mediaDataController, 0), null, false, false, false, true, 50, false);
                        break;
                    } else {
                        TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                        tL_messages_getStickers.emoticon = n1Var.E;
                        tL_messages_getStickers.hash = 0L;
                        i12 = ((g3) y1Var).currentAccount;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickers, new ii1(1, n1Var, str));
                        break;
                    }
                } else {
                    ArrayList<TLRPC.Document> recentStickers = mediaDataController.getRecentStickers(7);
                    n1Var.x = 0;
                    arrayList2.clear();
                    arrayList.clear();
                    n1Var.y.clear();
                    n1Var.n.clear();
                    n1Var.x++;
                    arrayList2.add(null);
                    arrayList.add(0L);
                    arrayList2.addAll(recentStickers);
                    n1Var.x = recentStickers.size() + n1Var.x;
                    n1Var.F = n1Var.E;
                    n1Var.l();
                    ph.d1.w1(o1Var2.b, 0, 0);
                    o1Var2.f.c(false);
                    o1Var2.e.n(false);
                    break;
                }
                break;
            case 15:
                ph.s1 s1Var = (ph.s1) ((dh.c) this.b).b;
                if (!s1Var.h) {
                    s1Var.n.setVisibility(8);
                    break;
                }
                break;
            case 16:
                ph.v1 v1Var = (ph.v1) ((g50) this.b).b;
                ArrayList arrayList3 = v1Var.o;
                if (!arrayList3.isEmpty()) {
                    v1Var.l.d(0.0f, true);
                    int i13 = v1Var.k + 1;
                    v1Var.k = i13;
                    if (i13 > arrayList3.size() - 1) {
                        v1Var.k = 0;
                    }
                    mg.h0 h0Var = v1Var.j;
                    h0Var.e((mg.q0) arrayList3.get(v1Var.k));
                    v1Var.j = v1Var.i;
                    v1Var.i = h0Var;
                    v1Var.p.invalidate();
                    break;
                }
                break;
            case 17:
                ((FfmpegAudioWaveformLoader) this.b).lambda$destroy$2();
                break;
            case 18:
                ((x2) this.b).b(null);
                break;
            case 19:
                ((z2) this.b).E();
                break;
            case 20:
                w8 w8Var = (w8) this.b;
                if (w8Var.F) {
                    w8Var.F = false;
                    w8Var.invalidate();
                    break;
                }
                break;
            case 21:
                t5 t5Var = ((s5) this.b).p;
                t5Var.N = System.currentTimeMillis();
                t5Var.O = 0L;
                t5Var.o0 = true;
                ((a9) t5Var.a).a.G0.a(0L, true);
                t5Var.invalidate();
                break;
            case 22:
                ph.n nVar = (ph.n) this.b;
                if (nVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) nVar.getParent()).removeView(nVar);
                    break;
                }
                break;
            case 23:
                ph.d dVar = (ph.d) this.b;
                if (dVar != null) {
                    dVar.setLoading(false);
                    break;
                }
                break;
            case 24:
                ((c8) ((kg.j) this.b).n).fullScroll(130);
                break;
            case 25:
                ca caVar = (ca) this.b;
                caVar.u0.onTouchEvent(AndroidUtilities.emptyMotionEvent());
                caVar.t0.v0(AndroidUtilities.emptyMotionEvent());
                break;
            case 26:
                da daVar = ((e9) this.b).h0;
                daVar.v(true);
                daVar.x0.setCameraThumb(daVar.A());
                break;
            case 27:
                ((h9) this.b).x2.m1.setVisibility(8);
                break;
            case 28:
                i9 i9Var = (i9) this.b;
                da daVar2 = i9Var.V;
                if (!daVar2.N1 && !daVar2.M1 && daVar2.y0 != null && daVar2.c0 == 0 && daVar2.j1 != null) {
                    String string = LocaleController.getString(i9Var.isFrontface() ? R.string.StoryCameraSavedDualBackHint : R.string.StoryCameraSavedDualFrontHint);
                    f3 f3Var = daVar2.j1;
                    f3Var.h = f3.a(string, f3Var.getTextPaint());
                    daVar2.j1.t(string);
                    daVar2.j1.v();
                    MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", MessagesController.getGlobalMainSettings().getInt("storysvddualhint", 0) + 1).apply();
                    break;
                }
                break;
            default:
                ((p9) this.b).setVisibility(8);
                break;
        }
    }
}
