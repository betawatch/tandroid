// default package

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.c;
import org.telegram.ui.o;
import org.webrtc.MediaConstraints;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.SSLCertificateVerifier;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class pt implements fd, oj3, hj, OnFailureListener, id3, fq7, is6, NativeLifecycleLock.NativeCallable, NativeLifecycleLock.NativePointerCallable, ff7, jcc, ci0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ pt(LaunchActivity launchActivity, e eVar, String str, String str2) {
        this.a = (byte) 13;
        this.b = launchActivity;
        this.e = eVar;
        this.c = str;
        this.d = str2;
    }

    @Override // oj3
    public final boolean E() {
        byte b = this.a;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // is6
    public final void b(String str, ArrayList arrayList) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object[] objArr = 0;
        switch (b) {
            case 15:
                ls6 ls6Var = (ls6) obj4;
                js6 js6Var = (js6) obj3;
                ks6 ks6Var = (ks6) obj2;
                pcc pccVar = (pcc) obj;
                HashMap hashMap = ls6Var.S1;
                if (hashMap.containsKey(js6Var)) {
                    StringBuilder sb = new StringBuilder();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj5 = arrayList.get(i);
                        i++;
                        hs6 hs6Var = (hs6) obj5;
                        if (!TextUtils.isEmpty(hs6Var.a) && !hs6Var.a.startsWith("animated_")) {
                            sb.append(hs6Var.a);
                        }
                    }
                    TLRPC.TL_messages_searchStickers tL_messages_searchStickers = new TLRPC.TL_messages_searchStickers();
                    boolean z = js6Var.a;
                    String str2 = js6Var.b;
                    tL_messages_searchStickers.emojis = z;
                    if (!TextUtils.isEmpty(str2)) {
                        tL_messages_searchStickers.lang_code.add(str2);
                    }
                    tL_messages_searchStickers.emoticon = sb.toString();
                    tL_messages_searchStickers.q = js6Var.c;
                    tL_messages_searchStickers.limit = 100;
                    tL_messages_searchStickers.offset = ks6Var == null ? 0 : ks6Var.b.intValue();
                    hashMap.put(js6Var, Integer.valueOf(ls6Var.getConnectionsManager().sendRequestTyped(tL_messages_searchStickers, new ic(objArr == true ? 1 : 0), new nu0((Object) ls6Var, (Object) js6Var, (Object) ks6Var, (Object) pccVar, (byte) 11))));
                    break;
                }
                break;
            case 19:
                ArrayList arrayList2 = (ArrayList) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                TLRPC.messages_AvailableEffects E0 = uc7.s1(((n1a) obj4).W).E0();
                HashSet hashSet = new HashSet();
                if (E0 != null) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        try {
                            if (!((hs6) arrayList.get(i2)).a.startsWith("animated_")) {
                                String c = pv3.c(((hs6) arrayList.get(i2)).a);
                                for (int i3 = 0; i3 < E0.effects.size(); i3++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = E0.effects.get(i3);
                                    if (!hashSet.contains(Long.valueOf(tL_availableEffect.id)) && (tL_availableEffect.emoticon.contains(c) || c.contains(tL_availableEffect.emoticon))) {
                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList2 : arrayList3).add(w49.e(tL_availableEffect));
                                        hashSet.add(Long.valueOf(tL_availableEffect.id));
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
                runnable.run();
                break;
            default:
                HashMap hashMap2 = (HashMap) obj4;
                HashMap hashMap3 = (HashMap) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                Runnable runnable2 = (Runnable) obj;
                int size2 = arrayList.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    String str3 = ((hs6) arrayList.get(i4)).a;
                    ArrayList arrayList5 = (ArrayList) hashMap2.get(str3);
                    if (arrayList5 != null && !arrayList5.isEmpty() && !hashMap3.containsKey(arrayList5)) {
                        hashMap3.put(arrayList5, str3);
                        arrayList4.add(arrayList5);
                    }
                }
                runnable2.run();
                break;
        }
    }

    @Override // ci0
    public final void c(gi0 gi0Var, List list) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 24:
                hl.c3(new esa((jxa) obj4, list, (qe2) obj3, (TLRPC.TL_inputStorePaymentStarsGiveaway) obj2, gi0Var, (Activity) obj, (byte) 2));
                break;
            default:
                hl.c3(new uwa(list, (icc) obj4, (TLRPC.TL_inputStorePaymentStarsTopup) obj3, (TL_stars.TL_starsTopupOption) obj2, (Activity) obj, (byte) 0));
                break;
        }
    }

    @Override // org.webrtc.NativeLifecycleLock.NativePointerCallable
    public final Object call(long j) {
        PeerConnection lambda$createPeerConnectionInternal$0;
        lambda$createPeerConnectionInternal$0 = PeerConnectionFactory.lambda$createPeerConnectionInternal$0((PeerConnection.Observer) this.b, (PeerConnection.RTCConfiguration) this.c, (MediaConstraints) this.d, (SSLCertificateVerifier) this.e, j);
        return lambda$createPeerConnectionInternal$0;
    }

    @Override // jcc
    public final Object g(Integer num, Object obj) {
        Context context = (Context) this.b;
        int[] iArr = (int[]) this.c;
        vnb vnbVar = (vnb) this.d;
        hjb hjbVar = (hjb) this.e;
        Float f = (Float) obj;
        LinearLayout j = uh9.j(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        j.addView(linearLayout, tre.t(-2, -2, 1, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(iArr[num.intValue() - 1]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, tre.o(24, 24));
        if (num.intValue() == 7) {
            for (int i = 0; i < 2; i++) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(iArr[num.intValue() - 1]);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                linearLayout.addView(imageView2, tre.o(24, 24));
            }
        }
        TextView textView = new TextView(context);
        textView.setTypeface(hl.n1("fonts/num.otf"));
        yob.X(textView, aob.j5, vnbVar);
        StringBuilder sb = new StringBuilder("x");
        float floatValue = f.floatValue();
        Object obj2 = f;
        if (floatValue <= 0.0f) {
            obj2 = "0";
        }
        sb.append(obj2);
        textView.setText(sb.toString());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        j.addView(textView, tre.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new ejb(hjbVar, j, false);
    }

    @Override // fq7
    public final void i(hq7 hq7Var, int i) {
        j95 j95Var = (j95) this.b;
        hq7 hq7Var2 = (hq7) this.c;
        v75 v75Var = (v75) this.d;
        w75 w75Var = (w75) this.e;
        try {
            j95Var.c.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        jj.g(j95Var.M1, j95Var.L1, 0L, 604800L, 2, hq7Var2, v75Var, w75Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    @Override // id3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j99 l(int i, t1c t1cVar, int[] iArr) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Point point;
        int i8;
        int i9;
        t1c t1cVar2 = t1cVar;
        gd3 gd3Var = (gd3) this.b;
        String str = (String) this.c;
        int[] iArr2 = (int[]) this.d;
        Point point2 = (Point) this.e;
        int i10 = iArr2[i];
        if (point2 != null) {
            i2 = point2.x;
            i3 = point2.y;
        } else {
            i2 = gd3Var.i;
            i3 = gd3Var.j;
        }
        boolean z = gd3Var.l;
        if (i2 == Integer.MAX_VALUE || i3 == Integer.MAX_VALUE) {
            i4 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        } else {
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < t1cVar2.a; i12++) {
                ko4 ko4Var = t1cVar2.d[i12];
                int i13 = ko4Var.A;
                int i14 = ko4Var.B;
                if (i13 > 0 && i14 > 0) {
                    if (z) {
                        if ((i13 > i14) != (i2 > i3)) {
                            i7 = i3;
                            i6 = i2;
                            int i15 = i13 * i6;
                            int i16 = i14 * i7;
                            point = i15 < i16 ? new Point(i7, gcc.g(i16, i13)) : new Point(gcc.g(i15, i14), i6);
                            i8 = ko4Var.A;
                            i9 = i8 * i14;
                            if (i8 >= ((int) (point.x * 0.98f)) && i14 >= ((int) (point.y * 0.98f)) && i9 < i11) {
                                i11 = i9;
                            }
                        }
                    }
                    i6 = i3;
                    i7 = i2;
                    int i152 = i13 * i6;
                    int i162 = i14 * i7;
                    if (i152 < i162) {
                    }
                    i8 = ko4Var.A;
                    i9 = i8 * i14;
                    if (i8 >= ((int) (point.x * 0.98f))) {
                        i11 = i9;
                    }
                }
            }
            i4 = i11;
        }
        mo5 p = po5.p();
        int i17 = 0;
        while (i17 < t1cVar2.a) {
            ko4 ko4Var2 = t1cVar2.d[i17];
            int i18 = ko4Var2.A;
            int i19 = (i18 == -1 || (i5 = ko4Var2.B) == -1) ? -1 : i18 * i5;
            p.c(new kd3(i, t1cVar2, i17, gd3Var, iArr[i17], str, i10, i4 == Integer.MAX_VALUE || (i19 != -1 && i19 <= i4)));
            i17++;
            t1cVar2 = t1cVar;
        }
        return p.f();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(final Exception exc) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 9:
                final r13 r13Var = (r13) obj3;
                final Executor executor = (Executor) obj2;
                final h23 h23Var = (h23) obj;
                exc.getClass();
                sr4 sr4Var = new sr4(r13Var, exc, executor, h23Var) { // from class: o13
                    public final /* synthetic */ Exception a;
                    public final /* synthetic */ Executor b;
                    public final /* synthetic */ h23 c;

                    {
                        this.a = exc;
                        this.b = executor;
                        this.c = h23Var;
                    }

                    @Override // sr4
                    public final Object invoke() {
                        Object v03Var;
                        Exception exc2 = this.a;
                        if (exc2 instanceof ao) {
                            int statusCode = ((ao) exc2).getStatusCode();
                            if (statusCode == 16) {
                                v03Var = new u03(exc2.getMessage());
                            } else if (statusCode == 17) {
                                v03Var = new v03("API is not supported: " + exc2.getMessage(), (byte) 3);
                            } else if (statusCode == 8) {
                                v03Var = new z03(exc2.getMessage());
                            } else if (q23.b.contains(Integer.valueOf(statusCode))) {
                                v03Var = new y03(exc2.getMessage());
                            } else {
                                v03Var = new v03("Conditional create failed, failure: " + exc2.getMessage(), (byte) 2);
                            }
                        } else if (exc2 instanceof eac) {
                            v03Var = new v03("API is unsupported", (byte) 3);
                        } else {
                            v03Var = new v03("Conditional create failed, failure: " + exc2, (byte) 2);
                        }
                        this.b.execute(new bv2(this.c, v03Var, (byte) 13));
                        return g9c.a;
                    }
                };
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!d33.a((CancellationSignal) obj4)) {
                    sr4Var.invoke();
                    break;
                }
                break;
            default:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27((CredentialProviderPlayServicesImpl) obj4, (CancellationSignal) obj3, (Executor) obj2, (h23) obj, exc);
                break;
        }
    }

    @Override // oj3
    public final boolean q(uj3 uj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, tzb tzbVar) {
        long j;
        long j2;
        TLRPC.TL_document tL_document;
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.c;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (b) {
            case 1:
                j20 j20Var = (j20) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                TLRPC.TL_document tL_document2 = (TLRPC.TL_document) obj3;
                r47 r47Var = (r47) obj;
                if (arrayList.size() <= 1) {
                    j = 0;
                    if (((jf7) arrayList.get(0)).a != yac.h(j20Var.a).e() && charSequence == null && arrayList2 != null) {
                        jf7 jf7Var = (jf7) arrayList.get(0);
                        long j3 = jf7Var.a;
                        Bundle l = bs2.l("scrollToTopOnResume", true);
                        if (wf3.B(j3)) {
                            l.putInt("enc_id", (int) (j3 & 4294967295L));
                        } else if (wf3.D(j3)) {
                            l.putLong("user_id", j3);
                        } else {
                            l.putLong("chat_id", -j3);
                        }
                        zu1 zu1Var = new zu1(l);
                        if (jf7Var.b != 0) {
                            ro4.a(zu1Var, jf7Var);
                        }
                        if (!j20Var.z2.u0(zu1Var, true, false)) {
                            uj3Var.finishFragment();
                            break;
                        } else {
                            zu1Var.cc(arrayList2);
                            if (jf7Var.b != 0) {
                                uj3Var.removeSelfFromStack();
                                break;
                            }
                        }
                    }
                } else {
                    j = 0;
                }
                int i3 = 0;
                while (i3 < arrayList.size()) {
                    long j4 = ((jf7) arrayList.get(i3)).a;
                    if (charSequence != null) {
                        j2 = j4;
                        r7a.B(j20Var.a).q0(p7a.b(charSequence.toString(), j2, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    } else {
                        j2 = j4;
                    }
                    int i4 = j20Var.a;
                    if (arrayList2 != null) {
                        r7a.B(i4).p0(arrayList2, j2, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                        tL_document = tL_document2;
                    } else {
                        tL_document = tL_document2;
                        r7a.B(i4).q0(p7a.e(tL_document, null, r47Var.k.attachPath, j2, null, null, null, null, null, z2, i, 0, 0, j20Var.p2, false));
                    }
                    i3++;
                    tL_document2 = tL_document;
                }
                uj3Var.finishFragment();
                e Q = LaunchActivity.Q();
                if (Q != null) {
                    d31.b0(Q).Q(R.raw.forward, 36, (arrayList.size() == 1 && ((jf7) arrayList.get(0)).a == yac.h(j20Var.a).e()) ? ob6.M0(2131750459, null) : (arrayList.size() != 1 || ((jf7) arrayList.get(0)).a <= j) ? (arrayList.size() != 1 || ((jf7) arrayList.get(0)).a >= j) ? ob6.H(',', "FwdMessageToManyChats", arrayList.size()) : ob6.a0(null, null, 2131750463, wf3.s(((jf7) arrayList.get(0)).a)) : ob6.a0(null, null, 2131750458, wf3.s(((jf7) arrayList.get(0)).a))).j();
                    break;
                }
                break;
            case 2:
                TLRPC.User user = (TLRPC.User) obj3;
                String str = (String) obj2;
                mu7 mu7Var = (mu7) obj;
                xw0 xw0Var = ((sw0) obj4).d;
                long j5 = ((jf7) arrayList.get(0)).a;
                Bundle l2 = bs2.l("scrollToTopOnResume", true);
                if (wf3.B(j5)) {
                    l2.putInt("enc_id", (int) (j5 & 4294967295L));
                } else if (wf3.D(j5)) {
                    l2.putLong("user_id", j5);
                } else {
                    l2.putLong("chat_id", -j5);
                }
                l2.putString("start_text", "@" + lbc.p(user) + " " + str);
                Activity activity = xw0Var.m0;
                if (activity instanceof LaunchActivity) {
                    e lastFragment = ((LaunchActivity) activity).N().getLastFragment();
                    if (uc7.s1(xw0Var.I).C(l2, lastFragment, null, null)) {
                        mu7Var.dismiss();
                        xw0Var.e0 = true;
                        hl.r(xw0Var.v0);
                        xw0Var.E.f();
                        jn7.f(xw0Var.I).n(xw0Var, jn7.z1);
                        jn7.e().n(xw0Var, jn7.q4);
                        jn7.f(xw0Var.I).n(xw0Var, jn7.M3);
                        if (!xw0Var.R0) {
                            super/*android.app.Dialog*/.dismiss();
                            xw0Var.R0 = true;
                        }
                        tk5 tk5Var = new tk5(new zu1(l2));
                        tk5Var.b = true;
                        lastFragment.presentFragment(tk5Var);
                        break;
                    }
                }
                break;
            default:
                TLRPC.User user2 = (TLRPC.User) obj3;
                String str2 = (String) obj2;
                mu7 mu7Var2 = (mu7) obj;
                n12 n12Var = ((s02) obj4).e;
                long j6 = ((jf7) arrayList.get(0)).a;
                Bundle l3 = bs2.l("scrollToTopOnResume", true);
                if (wf3.B(j6)) {
                    l3.putInt("enc_id", (int) (j6 & 4294967295L));
                } else if (wf3.D(j6)) {
                    l3.putLong("user_id", j6);
                } else {
                    l3.putLong("chat_id", -j6);
                }
                l3.putString("start_text", "@" + lbc.p(user2) + " " + str2);
                e eVar = n12Var.Z1;
                if (uc7.s1(n12Var.G3).C(l3, eVar, null, null)) {
                    mu7Var2.dismiss();
                    n12Var.a(true);
                    tk5 tk5Var2 = new tk5(new zu1(l3));
                    tk5Var2.b = true;
                    eVar.presentFragment(tk5Var2);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // ff7
    public final void run(long j) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 21:
                b2a b2aVar = (b2a) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP = (TLRPC.TL_inputCheckPasswordSRP) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                if (j != 0) {
                    b2aVar.S1 = uc7.s1(b2aVar.a).M0(Long.valueOf(j));
                    b2aVar.Z0(user, tL_inputCheckPasswordSRP, twoStepVerificationActivity);
                    break;
                }
                break;
            default:
                r7a r7aVar = (r7a) obj4;
                Uri uri = (Uri) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                e16 e16Var = (e16) obj;
                if (j == 0) {
                    e16Var.run(0L);
                    break;
                } else {
                    r7aVar.P(-j, uri, arrayList, e16Var);
                    break;
                }
        }
    }

    @Override // oj3
    public final boolean s(uj3 uj3Var) {
        byte b = this.a;
        return false;
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        byte b2 = 0;
        byte b3 = 1;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((o) obj4).P((String) obj3, (String) obj2, (wt) obj);
                break;
            case 4:
                ((zu1) obj4).m9((TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 13:
                String str = (String) obj2;
                String str2 = LaunchActivity.C1;
                sl7 sl7Var = new sl7((e) obj, (LaunchActivity) obj4);
                sl7Var.I0((String) obj3, false);
                if (str != null) {
                    String[] split = str.split(" ", 2);
                    String str3 = split[0];
                    String str4 = split.length > 1 ? split[1] : null;
                    ju7 ju7Var = sl7Var.m1;
                    if (ju7Var != null) {
                        ju7Var.getEditText().setText(str3);
                    } else {
                        sl7Var.D1 = str3;
                    }
                    ju7 ju7Var2 = sl7Var.n1;
                    if (ju7Var2 != null) {
                        ju7Var2.getEditText().setText(str4);
                    } else {
                        sl7Var.E1 = str4;
                    }
                }
                sl7Var.show();
                break;
            case 14:
                ((qh6) obj4).w1((String) obj3, (String) obj2, (String) obj);
                break;
            case 16:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj4;
                notificationsCustomSettingsActivity.getClass();
                SharedPreferences.Editor edit = ((SharedPreferences) obj2).edit();
                edit.putBoolean((String) obj3, ((boolean[]) obj)[0]);
                edit.apply();
                notificationsCustomSettingsActivity.p0(true);
                notificationsCustomSettingsActivity.getNotificationsController().b0(notificationsCustomSettingsActivity.s);
                break;
            case 26:
                tzb tzbVar = (tzb) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                tzbVar.B0 = hashSet2;
                hashSet2.addAll(hashSet);
                tzbVar.Z0(true, false);
                d31.b0(tzbVar).U(ob6.J0(hashSet.size(), "TopicsDeleted"), false, new po4(tzbVar, (byte) 4), new pwa(tzbVar, (ArrayList) obj2, (Runnable) obj, (byte) 27)).j();
                tzbVar.D0();
                idVar.dismiss();
                break;
            default:
                gtc gtcVar = (gtc) obj4;
                sg2 sg2Var = (sg2) obj3;
                c cVar = (c) obj2;
                Long l = (Long) obj;
                if (sg2Var.isEnabled()) {
                    boolean b4 = sg2Var.b();
                    sg2Var.setEnabled(false);
                    l01 g = idVar.g(i, true, true);
                    g.d();
                    if (!b4) {
                        cVar.E(false, true, false, new ctc(gtcVar, g, cVar, b2));
                        break;
                    } else {
                        byte b5 = 18;
                        if (cVar.z() >= l.longValue()) {
                            ctc ctcVar = new ctc(gtcVar, g, cVar, b3);
                            c.P("prepare disable backup");
                            cVar.E(true, false, false, new qe2(cVar, ctcVar, b5));
                            break;
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, gtcVar.getResourceProvider(), gtcVar.getParentActivity());
                            String M0 = ob6.M0(2131742716, null);
                            id idVar2 = alertDialog$Builder.a;
                            idVar2.S = M0;
                            idVar2.U = ob6.V(null, null, 2131742597, c.r(l.longValue(), false), cVar.q(l.longValue(), true));
                            alertDialog$Builder.g(ob6.M0(2131742714, null), new vr9((byte) 16));
                            alertDialog$Builder.j(ob6.M0(2131742621, null), new ftb(gtcVar, b5));
                            alertDialog$Builder.o();
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // hj
    public final void y(int i, int i2, boolean z) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (b) {
            case 3:
                ((zu1) obj3).I8((TLRPC.TL_document) obj2, (String) obj, this.e, z, i);
                break;
            case 4:
            case 5:
            default:
                ((pw2) obj3).k((TLRPC.Document) obj2, (String) obj, this.e, z, i, i2);
                break;
            case 6:
                a72 a72Var = (a72) obj3;
                a72Var.k0.a((TLRPC.TL_messageMediaPoll) obj, a72Var.P, a72Var.n1, (ArrayList) obj2, z, i, ((Long) this.e).longValue());
                a72Var.b.a(true);
                break;
            case 7:
                TLRPC.Document document = (TLRPC.Document) obj;
                ((pw2) obj3).v(document != null ? document : (TLRPC.BotInlineResult) obj2, this.e, z, i, i2);
                break;
        }
    }

    public /* synthetic */ pt(Object obj, Object obj2, Object obj3, String str, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = str;
        this.e = obj3;
    }

    public /* synthetic */ pt(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // org.webrtc.NativeLifecycleLock.NativeCallable
    public final Object call() {
        Boolean lambda$setBitrate$38;
        lambda$setBitrate$38 = ((PeerConnection) this.b).lambda$setBitrate$38((Integer) this.c, (Integer) this.d, (Integer) this.e);
        return lambda$setBitrate$38;
    }
}
