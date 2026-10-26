package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements org.telegram.ui.Components.hp0, hi.m4, og1, r0.n, org.telegram.ui.ActionBar.b2, tg.t, org.telegram.ui.Components.je0, org.telegram.ui.Components.am0, org.telegram.ui.Components.jw0, org.telegram.ui.Components.yw0, di.t9, org.telegram.ui.Components.ol0, CameraView.CameraViewDelegate, Utilities.Callback5, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.mk0, MessagesStorage.BooleanCallback, org.telegram.ui.Cells.e0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        k0 k0Var;
        c2.b bVar = (c2.b) this.b;
        bVar.getClass();
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        v4 v4Var = (v4) bVar.d;
        if (v4Var == view && (k0Var = v4Var.b) != null) {
            k0Var.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.og1
    public void a(int i10, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.m0(13, (q4) this.b, arrayList), 100L);
    }

    @Override // org.telegram.ui.Components.jw0
    public /* synthetic */ float b(RecyclerView recyclerView) {
        return org.telegram.ui.Components.b10.c(recyclerView);
    }

    @Override // org.telegram.ui.Components.hp0
    public void c(float f7) {
        z0 z0Var = (z0) this.b;
        MessageObject messageObject = z0Var.M;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(z0Var.M, f7);
    }

    @Override // org.telegram.ui.Components.am0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.ol0
    public void d() {
        ((oi.q) this.b).g();
    }

    @Override // org.telegram.ui.Components.am0
    public void e(float f7, float f10, int i10, View view) {
        c6 c6Var = (c6) this.b;
        ArrayList arrayList = c6Var.c;
        if (((b6) arrayList.get(i10)).a != 1) {
            if (((b6) arrayList.get(i10)).a == 2) {
                CacheByChatsController.KeepMediaException keepMediaException = ((b6) arrayList.get(i10)).c;
                b80 b80Var = new b80(view.getContext(), c6Var);
                b80Var.h(false);
                b80Var.setParentWindow(org.telegram.ui.Components.g5.P(c6Var, b80Var, view, f7, f10));
                b80Var.setCallback(new z5(c6Var, keepMediaException, 0));
                return;
            }
            if (((b6) arrayList.get(i10)).a == 4) {
                org.telegram.ui.ActionBar.e2 e2Var = org.telegram.ui.Components.g5.N(c6Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new zt0(c6Var, 13), null).a;
                e2Var.show();
                e2Var.i();
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        int i11 = c6Var.e;
        if (i11 == 1) {
            bundle.putInt("dialogsType", 6);
        } else if (i11 == 2) {
            bundle.putInt("dialogsType", 5);
        } else {
            bundle.putInt("dialogsType", 4);
        }
        bundle.putBoolean("allowGlobalSearch", false);
        cy cyVar = new cy(bundle);
        cyVar.C2 = new m4.s0(9, c6Var, cyVar);
        c6Var.presentFragment(cyVar);
    }

    @Override // org.telegram.ui.Components.mk0
    public void g(ArrayList arrayList) {
        zh zhVar = (zh) this.b;
        un unVar = zhVar.p;
        if (unVar.getParentActivity() == null || unVar.getParentActivity() == null) {
            return;
        }
        yh yhVar = new yh(zhVar, unVar, unVar.getParentActivity(), unVar.qa, arrayList);
        yhVar.setCalcMandatoryInsets(unVar.F9());
        yhVar.setDimBehind(false);
        unVar.H7(false);
        unVar.showDialog(yhVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        int i11;
        int i12 = 0;
        switch (this.a) {
            case 4:
                k5 k5Var = (k5) this.b;
                k5Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    k5Var.startActivity(intent);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 9:
                t6 t6Var = (t6) this.b;
                s6 s6Var = new s6(t6Var.getContext(), null == true ? 1 : 0);
                s6Var.fixNavigationBar();
                s6Var.setCanDismissWithSwipe(false);
                s6Var.setCancelable(false);
                Context context = t6Var.getContext();
                v6 v6Var = new v6(context);
                org.telegram.ui.Components.ak0 ak0Var = new org.telegram.ui.Components.ak0(context);
                ak0Var.setAutoRepeat(true);
                ak0Var.f(R.raw.utyan_cache, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, null);
                v6Var.addView(ak0Var, org.telegram.ui.Components.gb1.h(ImageReceiver.DEFAULT_CROSSFADE_DURATION, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                ak0Var.d();
                org.telegram.ui.Components.s6 s6Var2 = new org.telegram.ui.Components.s6(context, false, true, true);
                v6Var.a = s6Var2;
                org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.g;
                s6Var2.b(0.35f, 120L, dsVar);
                s6Var2.setGravity(1);
                int i13 = org.telegram.ui.ActionBar.y6.j5;
                org.telegram.ui.ActionBar.f7.Z(s6Var2, i13, null);
                s6Var2.setTextSize(AndroidUtilities.dp(24.0f));
                s6Var2.setTypeface(AndroidUtilities.bold());
                v6Var.addView(s6Var2, org.telegram.ui.Components.gb1.h(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                u6 u6Var = new u6(context);
                Paint paint = new Paint(1);
                u6Var.a = paint;
                Paint paint2 = new Paint(1);
                u6Var.b = paint2;
                u6Var.d = new org.telegram.ui.Components.h6(u6Var, 350L, dsVar);
                int i14 = org.telegram.ui.ActionBar.y6.N6;
                paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, i14, false));
                paint2.setColor(org.telegram.ui.ActionBar.y6.o1(0.2f, org.telegram.ui.ActionBar.y6.x0(null, i14, false)));
                v6Var.b = u6Var;
                v6Var.addView(u6Var, org.telegram.ui.Components.gb1.h(240, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.t.r(textView, i13, null, 1, 16.0f);
                textView.setText(LocaleController.getString(R.string.ClearingCache));
                v6Var.addView(textView, org.telegram.ui.Components.gb1.h(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                org.telegram.ui.ActionBar.f7.V(textView2, i13, null);
                textView2.setTextSize(1, 14.0f);
                textView2.setText(LocaleController.getString(R.string.ClearingCacheDescription));
                v6Var.addView(textView2, org.telegram.ui.Components.gb1.h(240, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
                v6Var.a(0.0f);
                s6Var.setCustomView(v6Var);
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                m4.v0 v0Var = new m4.v0(t6Var, v6Var, fArr, zArr2, 8);
                long[] jArr = {-1};
                AndroidUtilities.runOnUIThread(new m4.v0(t6Var, zArr, jArr, s6Var, 9), 150L);
                c7 c7Var = t6Var.d;
                q6 q6Var = new q6(fArr, zArr2, v0Var, null == true ? 1 : 0);
                r6 r6Var = new r6(zArr, v6Var, jArr, s6Var, 0);
                ci.b bVar = c7Var.e0;
                if (bVar != null) {
                    bVar.d();
                }
                m6 m6Var = c7Var.M;
                if (m6Var != null) {
                    m6Var.e();
                    c7Var.M.f(false);
                }
                c7Var.getFileLoader().cancelLoadAllFiles();
                c7Var.getFileLoader().getFileLoaderQueue().postRunnable(new i6(c7Var, q6Var, r6Var, null == true ? 1 : 0));
                c7Var.e0 = null;
                m6 m6Var2 = c7Var.M;
                if (m6Var2 != null) {
                    m6Var2.setCacheModel(null);
                    break;
                }
                break;
            case 14:
                nd.V((nd) this.b, e2Var);
                break;
            case 17:
                ((jg) this.b).run();
                break;
            case 19:
                un unVar = ((gj) this.b).b;
                unVar.finishFragment();
                unVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteBusinessLink, unVar.b4);
                break;
            case 23:
                un unVar2 = ((wl) this.b).a.Q;
                i11 = ((org.telegram.ui.ActionBar.r2) unVar2).currentAccount;
                ChatThemeController.getInstance(i11).clearWallpaper(unVar2.f6, true, true);
                break;
            case 24:
                np npVar = (np) this.b;
                boolean z10 = npVar.s;
                if (!z10 || npVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.e2[] e2VarArr = {new org.telegram.ui.ActionBar.e2(npVar.getParentActivity(), 3, null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z10) {
                        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(npVar.f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(npVar.f);
                    }
                    AndroidUtilities.runOnUIThread(new cp(npVar, e2VarArr, npVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new z7(9, npVar, e2VarArr)), i12), 500L);
                    break;
                }
                break;
            default:
                ((pq) this.b).run(1);
                break;
        }
    }

    @Override // org.telegram.ui.Components.jw0
    public RecyclerView i(View view) {
        return ((x7) this.b).c(view);
    }

    @Override // org.telegram.ui.Components.yw0
    public void j(int i10) {
        SharedConfig.getPreferences().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.b).get(i10)).intValue()).apply();
    }

    @Override // di.t9
    public void k(Canvas canvas, RectF rectF, float f7) {
        n8 n8Var = (n8) ((f) this.b).b;
        Paint paint = n8Var.w;
        TextPaint textPaint = n8Var.e;
        paint.setAlpha((int) (80.0f * f7));
        float lerp = AndroidUtilities.lerp(0.0f, Math.min(rectF.width(), rectF.height()) / 2.0f, f7);
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
        float clamp = Utilities.clamp((f7 - 0.5f) / 0.5f, 1.0f, 0.0f);
        if (clamp > 0.0f) {
            int alpha = textPaint.getAlpha();
            textPaint.setAlpha((int) (alpha * clamp));
            canvas.save();
            float min = Math.min(2.0f, Math.min(rectF.height(), rectF.width()) / AndroidUtilities.dp(44.0f));
            canvas.scale(min, min, rectF.centerX(), rectF.centerY());
            canvas.drawText(Integer.toString(n8Var.h0 + 1), rectF.centerX(), rectF.centerY() + AndroidUtilities.dp(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override // org.telegram.ui.Components.je0
    public void l(org.telegram.ui.Components.le0 le0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.b;
        BubbleActivity bubbleActivity2 = BubbleActivity.a0;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = bubbleActivity.U;
        if (intent != null) {
            bubbleActivity.y(intent, bubbleActivity.V, bubbleActivity.X, true, bubbleActivity.W);
            bubbleActivity.U = null;
        }
        bubbleActivity.S.e0();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, le0Var);
    }

    @Override // org.telegram.ui.Components.jw0
    public /* synthetic */ void n(RecyclerView recyclerView) {
        org.telegram.ui.Components.b10.b(recyclerView);
    }

    @Override // hi.m4
    public void o(boolean z10) {
        m3 m3Var = (m3) this.b;
        v3 v3Var = m3Var.L.K;
        if (v3Var != null) {
            m3Var.h = true;
            v3Var.dismiss(true);
        }
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        y9 y9Var = (y9) this.b;
        HandlerThread handlerThread = y9Var.e;
        handlerThread.start();
        y9Var.f = new Handler(handlerThread.getLooper());
        AndroidUtilities.runOnUIThread(y9Var.d0, 0L);
        if (y9Var.b0()) {
            o1.j jVar = y9Var.y;
            if (jVar != null) {
                jVar.c();
                y9Var.y = null;
            }
            o1.j jVar2 = new o1.j(new ac.a(0.0f));
            y9Var.y = jVar2;
            int i10 = 0;
            jVar2.b(new q9(y9Var, i10));
            y9Var.y.a(new r9(y9Var, i10));
            y9Var.y.u = new o1.k(500.0f);
            y9Var.y.u.a(0.8f);
            y9Var.y.u.b(250.0f);
            y9Var.y.h();
        }
    }

    public void p(String str) {
        un unVar = ((fm) this.b).Q;
        if (str.startsWith("@")) {
            unVar.getMessagesController().openByUserName(str.substring(1), unVar, 0);
            return;
        }
        if (str.startsWith("#") || str.startsWith("$")) {
            cy cyVar = new cy(null);
            cyVar.n2 = str;
            unVar.presentFragment(cyVar);
        } else {
            if (!str.startsWith("/")) {
                unVar.Ga(0, str, null, null, false);
                return;
            }
            unVar.Y.X0(null, str, false, false);
            if (unVar.Y.getFieldText() == null) {
                unVar.o9(false);
            }
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 15:
                ee eeVar = (ee) this.b;
                org.telegram.ui.Components.t61 t61Var = (org.telegram.ui.Components.t61) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                ge geVar = eeVar.f;
                Object obj6 = t61Var.G;
                if (!(obj6 instanceof TL_stars.StarsTransaction)) {
                    if (obj6 instanceof TL_stats.BroadcastRevenueTransaction) {
                        ke.M(eeVar.getContext(), eeVar.c, (TL_stats.BroadcastRevenueTransaction) t61Var.G, geVar.e, eeVar.b);
                        break;
                    }
                } else {
                    bi.dd.g1(eeVar.getContext(), true, geVar.e, eeVar.c, (TL_stars.StarsTransaction) t61Var.G, eeVar.b);
                    break;
                }
                break;
            default:
                js jsVar = (js) this.b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = ((org.telegram.ui.Components.t61) obj).d;
                if (i10 != 1) {
                    if (i10 == 2) {
                        boolean z10 = !jsVar.X;
                        jsVar.X = z10;
                        ((org.telegram.ui.Cells.a9) view).setChecked(z10);
                        break;
                    }
                } else {
                    TLRPC.User user = jsVar.getMessagesController().getUser(Long.valueOf(jsVar.H));
                    if (user != null && jsVar.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jsVar.getParentActivity(), 0, jsVar.r);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteContact);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.AreYouSureDeleteContact);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.voip.k1(2, jsVar, user));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ y0(fj fjVar, boolean z10) {
        this.a = 20;
        this.b = fjVar;
    }

    @Override // org.telegram.ui.Components.yw0
    public /* synthetic */ void m() {
    }

    @Override // org.telegram.ui.Components.hp0
    public /* synthetic */ void f(float f7) {
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.j5 j5Var2;
        org.telegram.ui.ActionBar.j5 j5Var3;
        org.telegram.ui.ActionBar.j5 j5Var4;
        org.telegram.ui.ActionBar.j5 j5Var5;
        switch (this.a) {
            case 20:
                un unVar = ((fj) this.b).b.b;
                unVar.Aa(unVar.p4, true);
                break;
            case 21:
                un unVar2 = ((ql) this.b).b;
                if (z10) {
                    unVar2.X7();
                    UndoView undoView = unVar2.K3;
                    if (undoView != null) {
                        undoView.j(76, 0L, null);
                        break;
                    }
                }
                break;
            default:
                kr krVar = ((cr) this.b).b;
                if (z10) {
                    j5Var = ((org.telegram.ui.ActionBar.r2) krVar).parentLayout;
                    if (j5Var != null) {
                        j5Var2 = ((org.telegram.ui.ActionBar.r2) krVar).parentLayout;
                        List fragmentStack = j5Var2.getFragmentStack();
                        j5Var3 = ((org.telegram.ui.ActionBar.r2) krVar).parentLayout;
                        org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) fragmentStack.get(j5Var3.getFragmentStack().size() - 2);
                        if (r2Var instanceof mo) {
                            r2Var.removeSelfFromStack();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", krVar.M);
                            mo moVar = new mo(bundle);
                            moVar.m0(krVar.r);
                            j5Var4 = ((org.telegram.ui.ActionBar.r2) krVar).parentLayout;
                            j5Var5 = ((org.telegram.ui.ActionBar.r2) krVar).parentLayout;
                            ((ActionBarLayout) j5Var4).c(j5Var5.getFragmentStack().size() - 1, moVar);
                            krVar.finishFragment();
                            moVar.c.j(76, 0L, null);
                            break;
                        } else {
                            krVar.finishFragment();
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        ((org.telegram.ui.Cells.g0) this.b).setClickable(false);
    }

    @Override // org.telegram.ui.Components.am0
    public /* synthetic */ void l0(View view, float f7, float f10) {
    }
}
