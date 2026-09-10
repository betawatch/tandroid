package sg;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.IStartCarApp;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
import bi.l9;
import bi.ma;
import bi.pb;
import bi.rb;
import bi.u6;
import com.google.firebase.FirebaseCommonRegistrar;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Cells.d6;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ig1;
import org.telegram.ui.ip0;
import org.telegram.ui.l61;
import org.telegram.ui.qy;
import org.telegram.ui.wy;
import org.telegram.ui.zg1;
import wh.f4;
import wh.g4;
import wh.m2;
import wh.p2;
import wh.s3;
import wh.y1;
import xh.k2;
import xh.x3;
import zh.a3;
import zh.u7;
import zh.v2;
import zh.z2;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements qy, c3.r, androidx.car.app.utils.d, c2, k2, Utilities.Callback5, kl0, q9.d, zg1, l61, gh.i, ma {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // org.telegram.ui.qy
    public /* synthetic */ boolean A() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.qy
    public /* synthetic */ boolean J(wy wyVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // q9.d
    public Object P1(u6 u6Var) {
        String valueOf;
        String str = (String) this.b;
        j2.h hVar = (j2.h) this.c;
        Context context = (Context) u6Var.a(Context.class);
        switch (hVar.a) {
            case 5:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                    valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                    break;
                }
                valueOf = "";
                break;
            case 6:
                valueOf = FirebaseCommonRegistrar.a(context);
                break;
            case 7:
                int i10 = Build.VERSION.SDK_INT;
                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                        if (i10 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            valueOf = "auto";
                            break;
                        } else {
                            if (i10 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                valueOf = "embedded";
                                break;
                            }
                            valueOf = "";
                            break;
                        }
                    } else {
                        valueOf = "watch";
                        break;
                    }
                } else {
                    valueOf = "tv";
                    break;
                }
                break;
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName != null) {
                    valueOf = FirebaseCommonRegistrar.b(installerPackageName);
                    break;
                }
                valueOf = "";
                break;
        }
        return new xa.a(str, valueOf);
    }

    @Override // xh.k2
    public void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        m2 m2Var = (m2) this.c;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.b;
        wr0 wr0Var = m2Var.a;
        m2Var.e.l.remove(savedStarGift);
        m2Var.f(true);
        int i10 = m2Var.b;
        if (j3 == UserConfig.getInstance(i10).getClientUserId()) {
            wc a02 = wc.a0(wr0Var.a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
            int i11 = R.string.BoughtResoldGiftText;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            pc O = a02.O(document, string, LocaleController.formatString(i11, hc.b.l(tL_starGiftUnique.num, ',', sb2)));
            O.r = false;
            O.j();
        } else {
            pc O2 = wc.a0(wr0Var.a).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(i10, j3)));
            O2.r = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.x0.c(true);
        }
    }

    @Override // c3.r
    public c3.o[] b(Uri uri, Map map) {
        u2.q qVar = (u2.q) this.c;
        b2.s sVar = (b2.s) this.b;
        return new c3.o[]{qVar.c.C(sVar) ? new z3.h(qVar.c.d(sVar), null) : new k3.a(sVar)};
    }

    @Override // org.telegram.ui.Components.kl0
    public void c(float f7, float f10, int i10, View view) {
        g4.Q((g4) this.c, (f4) this.b, i10);
    }

    @Override // androidx.car.app.utils.d
    public void call() {
        IStartCarApp iStartCarApp = (IStartCarApp) this.c;
        Intent intent = (Intent) this.b;
        int i10 = CarAppNotificationBroadcastReceiver.a;
        iStartCarApp.startCarApp(intent);
    }

    @Override // org.telegram.ui.zg1
    public void d(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.a) {
            case 10:
                ((xh.h) this.c).h0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.b);
                break;
            default:
                ((x3) this.c).M1(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.b);
                break;
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // gh.i
    public void e(RectF rectF, View view) {
        bh.d dVar = (bh.d) this.c;
        View view2 = (View) this.b;
        dVar.s(rectF.left, rectF.top);
        view2.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(d2 d2Var, int i10) {
        switch (this.a) {
            case 4:
                wh.m mVar = (wh.m) this.c;
                d6 d6Var = (d6) this.b;
                try {
                    int parseInt = Integer.parseInt(d6Var.getText().toString().trim());
                    mVar.X(parseInt);
                    mVar.c0.setValue(parseInt);
                    d2Var.dismiss();
                    break;
                } catch (Throwable th2) {
                    AndroidUtilities.shakeView(d6Var);
                    FileLog.e(th2);
                    return;
                }
            case 5:
                y1 y1Var = (y1) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.b;
                String obj = y1Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    callback.run(obj);
                    d2Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.shakeView(y1Var);
                    break;
                }
                break;
            case 11:
                x3 x3Var = (x3) this.c;
                p1[] p1VarArr = (p1[]) this.b;
                nf.e g10 = d2Var.g(i10, true, true);
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                f0 f0Var = new f0(12, x3Var, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 2;
                twoStepVerificationActivity.b0 = f0Var;
                twoStepVerificationActivity.a0 = x3Var.C1();
                g10.d();
                twoStepVerificationActivity.s0(new xh.n1(x3Var, p1VarArr, g10, twoStepVerificationActivity));
                break;
            default:
                v2 v2Var = (v2) this.c;
                zh.t0 t0Var = ((u7) this.b).A0;
                if (t0Var == null) {
                    a3.f0(v2Var.l);
                    break;
                } else if (!t0Var.w) {
                    TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                    discardgroupcall.call = t0Var.f;
                    ConnectionsManager.getInstance(t0Var.e).sendRequest(discardgroupcall, new zh.o0(t0Var, 4));
                    t0Var.e();
                    break;
                }
                break;
        }
    }

    @Override // bi.ma
    public void g(pb pbVar, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.InputPeer inputPeer, int i10, a1.e eVar, a3.d dVar) {
        switch (this.a) {
            case 15:
                a3 a3Var = (a3) this.c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.b;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = MessagesController.getInstance(a3Var.C2).getInputPeer(storyItem.dialogId);
                tL_stories_editStory.id = storyItem.id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = pbVar.b;
                ConnectionsManager.getInstance(a3Var.C2).sendRequest(tL_stories_editStory, new l9(a3Var, eVar, storyItem, pbVar));
                break;
            default:
                v2 v2Var = (v2) this.c;
                rb rbVar = (rb) this.b;
                a3 a3Var2 = v2Var.l;
                z2 z2Var = a3Var2.O1;
                TL_stories.StoryItem storyItem2 = z2Var.a;
                if ((storyItem2 != null && storyItem2.pinned) != z12) {
                    MessagesController.getInstance(a3Var2.C2).getStoriesController().o0(a3Var2.B1, a3Var2.v1, z12, null);
                }
                TL_stories.StoryItem storyItem3 = z2Var.a;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(a3Var2.C2).sendRequest(togglegroupcallsettings, new s3(8, v2Var, rbVar));
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        p2 p2Var = (p2) this.c;
        bi.d dVar = (bi.d) this.b;
        View view = (View) obj2;
        p2Var.getClass();
        long j3 = ((TL_stars.SavedStarGift) ((v51) obj).G).gift.id;
        if (p2Var.b == j3) {
            p2Var.b = 0L;
        } else {
            p2Var.b = j3;
        }
        dVar.setEnabled(p2Var.b != 0);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof ip0) {
                    ip0 ip0Var = (ip0) childAt;
                    ip0Var.b(p2Var.b == ip0Var.getGiftId(), true);
                }
            }
        }
    }

    @Override // org.telegram.ui.qy
    public boolean v(wy wyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ig1 ig1Var) {
        switch (this.a) {
            case 0:
                h0 h0Var = (h0) this.c;
                String str = (String) this.b;
                long j3 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    j3 = ((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId;
                    h0Var.n.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str, j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                wyVar.finishFragment();
                i.h(j3);
                break;
            default:
                tg.e eVar = (tg.e) this.c;
                String str2 = (String) this.b;
                long j10 = 0;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    j10 = ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId;
                    eVar.e.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str2, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i13++;
                    eVar = eVar;
                }
                wyVar.finishFragment();
                i.h(j10);
                break;
        }
        return true;
    }

    public /* synthetic */ f0(String str, j2.h hVar) {
        this.a = 9;
        this.b = str;
        this.c = hVar;
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ void p0(View view, float f7, float f10) {
    }
}
