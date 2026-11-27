// default package

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.RectF;
import android.location.Address;
import android.location.Geocoder;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.NotificationBadge$ZukHomeBadger;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_feed;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.p;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class pl7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pl7(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        int i;
        int i2;
        TLRPC.Chat M0;
        String a0;
        v21 I;
        z28 z28Var;
        z28 z28Var2;
        qbb qbbVar;
        kcb kcbVar;
        String str = "";
        byte b = 2;
        byte b2 = 1;
        switch (this.a) {
            case 0:
                ((v35) this.b).a((TLRPC.User) this.c);
                break;
            case 1:
                lm7 lm7Var = (lm7) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList = lm7Var.c;
                jm7[] jm7VarArr = lm7Var.b;
                HashSet hashSet = lm7Var.e;
                HashSet hashSet2 = lm7Var.d;
                if (!lm7Var.h) {
                    lm7Var.n = false;
                    if (tLObject instanceof TL_feed.TL_interestCategories) {
                        TL_feed.TL_interestCategories tL_interestCategories = (TL_feed.TL_interestCategories) tLObject;
                        arrayList.clear();
                        arrayList.addAll(tL_interestCategories.categories);
                        if (!lm7Var.f && hashSet2.equals(hashSet)) {
                            hashSet2.clear();
                            hashSet2.addAll(tL_interestCategories.selected);
                            hashSet.clear();
                            hashSet.addAll(tL_interestCategories.selected);
                        }
                        lm7Var.M0(false);
                        lm7.L0(jm7VarArr[0]);
                        break;
                    } else {
                        lm7Var.r = true;
                        lm7.L0(jm7VarArr[0]);
                        break;
                    }
                }
                break;
            case 2:
                Intent intent = (Intent) this.b;
                Intent intent2 = (Intent) this.c;
                a.b.sendBroadcast(intent);
                a.b.sendBroadcast(intent2);
                break;
            case 3:
                try {
                    a.b.getContentResolver().call(((NotificationBadge$ZukHomeBadger) this.b).a, "setAppBadgeCount", (String) null, (Bundle) this.c);
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 4:
                Uri uri = (Uri) this.b;
                File file = (File) this.c;
                try {
                    a.b.revokeUriPermission(uri, 1);
                } catch (Exception e2) {
                    cc4.g(e2, true);
                }
                if (file != null) {
                    try {
                        file.delete();
                        break;
                    } catch (Exception e3) {
                        cc4.g(e3, true);
                        return;
                    }
                }
                break;
            case 5:
                ip7 ip7Var = (ip7) this.b;
                if (ip7Var.s.remove((String) this.c)) {
                    ip7Var.Z(true);
                    break;
                }
                break;
            case 6:
                ((tp8) this.b).x((HashSet) this.c);
                break;
            case 7:
                ip7 ip7Var2 = (ip7) this.b;
                zh6 zh6Var = (zh6) this.c;
                ArrayList arrayList2 = ip7Var2.b;
                ArrayList arrayList3 = ip7Var2.a;
                int m = zh6Var.m();
                boolean z = false;
                for (int i3 = 0; i3 < m; i3++) {
                    zh6Var.j(i3);
                    ArrayList arrayList4 = (ArrayList) zh6Var.n(i3);
                    int size = arrayList4.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        r47 r47Var = (r47) arrayList4.get(i4);
                        boolean z2 = r47Var.J;
                        TLRPC.Message message = r47Var.k;
                        if (z2) {
                            j = r47.B0(message);
                        } else {
                            long j2 = message.peer_id.channel_id;
                            j = j2 != 0 ? -j2 : 0L;
                        }
                        SparseArray sparseArray = (SparseArray) ip7Var2.c.f(j);
                        if (sparseArray != null) {
                            r47 r47Var2 = (r47) sparseArray.get(r47Var.e1());
                            if (r47Var2 != null && (r47Var2.I || r47Var2.J)) {
                                r47Var2 = null;
                            }
                            if (r47Var2 != null) {
                                sparseArray.put(r47Var.e1(), r47Var);
                                int indexOf = arrayList3.indexOf(r47Var2);
                                if (indexOf >= 0) {
                                    arrayList3.set(indexOf, r47Var);
                                }
                                int indexOf2 = arrayList2.indexOf(r47Var2);
                                if (indexOf2 >= 0) {
                                    arrayList2.set(indexOf2, r47Var);
                                }
                                z = true;
                            }
                        }
                    }
                }
                if (z) {
                    ip7Var2.Z(false);
                    break;
                }
                break;
            case 8:
                ((NotificationsCustomSettingsActivity) this.b).m0((ArrayList) this.c);
                break;
            case 9:
                nx0[] nx0VarArr = (nx0[]) this.b;
                boolean[] zArr = (boolean[]) this.c;
                nx0VarArr[0] = null;
                uq7.a = null;
                zArr[0] = true;
                break;
            case 10:
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.b;
                String str2 = (String) this.c;
                e S = LaunchActivity.S();
                d31 b0 = S != null ? d31.b0(S) : d31.Y();
                TLRPC.Document document = starGift.getDocument();
                v21 q = document != null ? b0.q(document, str2) : b0.Q(R.raw.contact_check, 36, str2);
                q.u = true;
                q.j();
                break;
            case 11:
                ((vt7) this.b).Y(((b8c) this.c).d);
                break;
            case 12:
                dx7 dx7Var = (dx7) this.b;
                View view = (View) this.c;
                if (view instanceof h44) {
                    h44 h44Var = (h44) view;
                    h44Var.m();
                    dx7Var.C0(h44Var, true);
                    break;
                }
                break;
            case 13:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.b;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.c;
                try {
                    List<Address> fromLocationName = new Geocoder(a.b, ob6.D0().y).getFromLocationName(messageMedia.title, 1);
                    if (fromLocationName.size() > 0) {
                        tL_mediaAreaGeoPoint.geo.lat = fromLocationName.get(0).getLatitude();
                        tL_mediaAreaGeoPoint.geo._long = fromLocationName.get(0).getLongitude();
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 14:
                nx7 nx7Var = (nx7) this.b;
                ka9 ka9Var = (ka9) this.c;
                nx7Var.v = true;
                ByteBuffer byteBuffer = (ByteBuffer) nx7Var.h(nx7Var.f(), true, false, false).c;
                RectF f = nx7Var.f();
                Object obj = nx7Var.a.b;
                nx7Var.w = new rx(byteBuffer, 0, f);
                nx7Var.a(false);
                ka9Var.run();
                break;
            case 15:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                Runnable runnable = (Runnable) this.c;
                for (ok2 ok2Var : passcodeActivity.n.f) {
                    ok2Var.D(0.0f);
                }
                runnable.run();
                break;
            case 16:
                py7 py7Var = (py7) this.b;
                b8 b8Var = (b8) this.c;
                PasscodeActivity passcodeActivity2 = (PasscodeActivity) py7Var.c;
                b8Var.setText(ob6.M0(!passcodeActivity2.E ? 2131747380 : 2131747381, null));
                b8Var.setIcon(!passcodeActivity2.E ? R.drawable.msg_permissions : R.drawable.msg_pin_code);
                passcodeActivity2.x0();
                if (passcodeActivity2.p0()) {
                    passcodeActivity2.h.setInputType(524417);
                    hl.T3(passcodeActivity2.s, true, 0.1f, true, false);
                    break;
                }
                break;
            case 17:
                ((PasskeysActivity) this.b).Y((TL_account.Passkey) this.c);
                break;
            case 18:
                ((icc) this.b).a(null, ((Throwable) this.c).getMessage());
                break;
            case 19:
                b18 b18Var = (b18) this.b;
                ei7 ei7Var = (ei7) this.c;
                int[] iArr = b18Var.y;
                byte b3 = ei7Var.a;
                if (b3 == 2) {
                    if (!(b18Var.G.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size2 = b18Var.H.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) b18Var.H.get(i5);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    b18Var.G = tL_secureRequiredType;
                                    b18Var.T1();
                                } else {
                                    i5++;
                                }
                            }
                        }
                    }
                } else if (b3 == 1) {
                    if (!(b18Var.G.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size3 = b18Var.H.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) b18Var.H.get(i6);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    b18Var.G = tL_secureRequiredType2;
                                    b18Var.T1();
                                } else {
                                    i6++;
                                }
                            }
                        }
                    }
                } else if (b3 == 3) {
                    if (!(b18Var.G.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size4 = b18Var.H.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 < size4) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) b18Var.H.get(i7);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    b18Var.G = tL_secureRequiredType3;
                                    b18Var.T1();
                                } else {
                                    i7++;
                                }
                            }
                        }
                    }
                } else if (b3 == 4 && !(b18Var.G.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size5 = b18Var.H.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 < size5) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) b18Var.H.get(i8);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                b18Var.G = tL_secureRequiredType4;
                                b18Var.T1();
                            } else {
                                i8++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(ei7Var.b)) {
                    b18Var.Z[0].setText(ei7Var.b);
                }
                if (!TextUtils.isEmpty(ei7Var.d)) {
                    b18Var.Z[1].setText(ei7Var.d);
                }
                if (!TextUtils.isEmpty(ei7Var.c)) {
                    b18Var.Z[2].setText(ei7Var.c);
                }
                if (!TextUtils.isEmpty(ei7Var.e)) {
                    b18Var.Z[7].setText(ei7Var.e);
                }
                int i9 = ei7Var.n;
                if (i9 != 0) {
                    if (i9 == 1) {
                        b18Var.x = "male";
                        b18Var.Z[4].setText(ob6.M0(2131747235, null));
                    } else if (i9 == 2) {
                        b18Var.x = "female";
                        b18Var.Z[4].setText(ob6.M0(2131747296, null));
                    }
                }
                if (!TextUtils.isEmpty(ei7Var.m)) {
                    String str3 = ei7Var.m;
                    b18Var.s = str3;
                    String str4 = (String) b18Var.Z0.get(str3);
                    if (str4 != null) {
                        b18Var.Z[5].setText(str4);
                    }
                }
                if (!TextUtils.isEmpty(ei7Var.l)) {
                    String str5 = ei7Var.l;
                    b18Var.w = str5;
                    String str6 = (String) b18Var.Z0.get(str5);
                    if (str6 != null) {
                        b18Var.Z[6].setText(str6);
                    }
                }
                int i10 = ei7Var.k;
                if (i10 > 0 && ei7Var.j > 0 && ei7Var.i > 0) {
                    b18Var.Z[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i10), Integer.valueOf(ei7Var.j), Integer.valueOf(ei7Var.i)));
                }
                int i11 = ei7Var.h;
                if (i11 <= 0 || (i = ei7Var.g) <= 0 || (i2 = ei7Var.f) <= 0) {
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    b18Var.Z[8].setText(ob6.M0(2131747221, null));
                    break;
                } else {
                    iArr[0] = i2;
                    iArr[1] = i;
                    iArr[2] = i11;
                    b18Var.Z[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i11), Integer.valueOf(ei7Var.g), Integer.valueOf(ei7Var.f)));
                    break;
                }
                break;
            case 20:
                b18 b18Var2 = (b18) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject2 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    b18Var2.K = password;
                    if (TwoStepVerificationActivity.a0(password, false)) {
                        TwoStepVerificationActivity.e0(b18Var2.K);
                        b18Var2.V1();
                        if (b18Var2.a0[0].getVisibility() == 0) {
                            b18Var2.Z[0].requestFocus();
                            hl.E3(b18Var2.Z[0]);
                        }
                        if (b18Var2.O0 == 1) {
                            b18Var2.E1(true);
                            break;
                        }
                    } else {
                        jj.u0(b18Var2.getParentActivity(), ob6.M0(2131743475, null), true);
                        break;
                    }
                }
                break;
            case 21:
                b18 b18Var3 = (b18) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (tL_error == null) {
                    b18Var3.g1 = true;
                    b18Var3.N0(true);
                    b18Var3.finishFragment();
                    break;
                } else {
                    b18Var3.Q1(false, false);
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        jj.u0(b18Var3.getParentActivity(), ob6.M0(2131743475, null), true);
                        break;
                    } else {
                        b18Var3.P1(ob6.M0(R.string.AppName, null), tL_error.text);
                        break;
                    }
                }
            case 22:
                ((w08) this.b).a.L = ((TLRPC.TL_error) this.c).text;
                break;
            case 23:
                p pVar = (p) this.b;
                View view2 = (View) this.c;
                pVar.J0(false);
                view2.callOnClick();
                break;
            case 24:
                p pVar2 = (p) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                pVar2.N0(true, false);
                if (tL_error2 == null) {
                    if (pVar2.getParentActivity() != null) {
                        x18 x18Var = pVar2.e0;
                        if (x18Var != null) {
                            hl.r(x18Var);
                            pVar2.e0 = null;
                        }
                        pVar2.h0();
                        break;
                    }
                } else if (tL_error2.text.startsWith("CODE_INVALID")) {
                    ku3 ku3Var = pVar2.T;
                    try {
                        ku3Var.performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                    hl.A3(2.5f, ku3Var, null);
                    ku3 ku3Var2 = pVar2.T;
                    ku3Var2.a.setText("");
                    ku3Var2.setWillNotDraw(true);
                    break;
                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.z(tL_error2.text).intValue();
                    pVar2.L0(ob6.M0(R.string.AppName, null), ob6.a0("FloodWaitTime", null, 2131750646, intValue < 60 ? ob6.G(intValue, "Seconds", new Object[0]) : ob6.G(intValue / 60, "Minutes", new Object[0])));
                    break;
                } else {
                    pVar2.L0(ob6.M0(R.string.AppName, null), tL_error2.text);
                    break;
                }
                break;
            case 25:
                ((p) this.b).u0((TLRPC.TL_payments_validatedRequestedInfo) this.c);
                break;
            case 26:
                p pVar3 = (p) this.b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.c;
                Context parentActivity = pVar3.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = a.b;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.H1;
                }
                if (parentActivity != null) {
                    pVar3.b1 = true;
                    pVar3.g1 = 1;
                    TLRPC.InputInvoice inputInvoice = pVar3.c1;
                    boolean z3 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                    boolean z4 = z3 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                    boolean z5 = z3 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                    if (!z3 && (z28Var2 = pVar3.a1) != null) {
                        z28Var2.c(1);
                    }
                    pVar3.h0();
                    if (z3 && (z28Var = pVar3.a1) != null) {
                        z28Var.c(pVar3.g1);
                    }
                    long e0 = pVar3.e0();
                    if (e0 > 0) {
                        str = lbc.l(pVar3.getMessagesController().X1(Long.valueOf(e0)));
                    } else if (e0 < 0 && (M0 = pVar3.getMessagesController().M0(Long.valueOf(-e0))) != null) {
                        str = M0.title;
                    }
                    long d0 = pVar3.d0();
                    int i12 = z3 ? (z4 || z5) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                    String M02 = z3 ? ob6.M0(z5 ? 2131744749 : z4 ? 2131744757 : 2131744816, null) : null;
                    if (!z3) {
                        a0 = ob6.a0(null, null, 2131747128, pVar3.S0[0], pVar3.r0);
                    } else if (z5) {
                        a0 = ob6.H(',', "StarsGiveawaySentPopupInfo", (int) d0);
                    } else {
                        a0 = ob6.K(z4 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo", (int) d0, ',', str);
                    }
                    SpannableStringBuilder S2 = hl.S2(a0);
                    e S3 = LaunchActivity.S();
                    if (S3 != null) {
                        d31 b02 = d31.b0(S3);
                        if (e0 == 0 || M02 == null || z5) {
                            String str7 = M02;
                            I = str7 != null ? b02.I(i12, str7, S2) : b02.Q(i12, 36, S2);
                        } else {
                            I = b02.L(i12, M02, S2, ob6.M0(2131743204, null), new tz6(b, e0));
                        }
                        I.s = false;
                        I.j = 5000;
                        if (messageArr[0] != null) {
                            e73 e73Var = new e73(pVar3, I, z4, messageArr, (byte) 3);
                            z11 z11Var = I.e;
                            if (z11Var != null) {
                                z11Var.setOnClickListener(e73Var);
                            }
                        }
                        I.k(z5);
                        break;
                    }
                }
                break;
            case 27:
                p pVar4 = (p) this.b;
                TLRPC.TL_payments_paymentVerificationNeeded tL_payments_paymentVerificationNeeded = (TLRPC.TL_payments_paymentVerificationNeeded) this.c;
                pcc pccVar = pVar4.e1;
                if (pccVar != null) {
                    pccVar.a(tL_payments_paymentVerificationNeeded);
                }
                pVar4.J0(false);
                pVar4.A0 = true;
                pVar4.N0(true, true);
                ww2 ww2Var = pVar4.r;
                if (ww2Var != null) {
                    ww2Var.setVisibility(0);
                }
                s7 s7Var = pVar4.n;
                if (s7Var != null) {
                    s7Var.setEnabled(false);
                    pVar4.n.getContentView().setVisibility(4);
                }
                pVar4.getMessagesController().b4 = new fu2((Object) pVar4, (Object) pVar4.getParentLayout(), (Object) pVar4.getParentActivity(), (byte) 21);
                WebView webView = pVar4.x;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = pVar4.x;
                    String str8 = tL_payments_paymentVerificationNeeded.url;
                    pVar4.y = str8;
                    webView2.loadUrl(str8);
                }
                pVar4.b1 = true;
                pVar4.g1 = 3;
                z28 z28Var3 = pVar4.a1;
                if (z28Var3 != null) {
                    z28Var3.c(3);
                    break;
                }
                break;
            case 28:
                o68 o68Var = (o68) this.b;
                kg5 kg5Var = (kg5) this.c;
                o68Var.removeView(kg5Var);
                if (o68Var.N1 == kg5Var) {
                    o68Var.N1 = null;
                    break;
                }
                break;
            default:
                o68 o68Var2 = (o68) this.b;
                rbb C = rbb.C((Activity) this.c, o68Var2.m2);
                d30 d30Var = o68Var2.w2;
                long j3 = (d30Var == null || (kcbVar = (kcb) d30Var.c) == null) ? 0L : kcbVar.currentPosition;
                File f2 = o68Var2.y1.f();
                TL_stories.StoryItem storyItem = o68Var2.y1.a;
                c8b c8bVar = new c8b();
                c8bVar.n = true;
                c8bVar.t = storyItem.media;
                int i13 = c8bVar.a;
                c8bVar.q = uc7.s1(i13).y1(storyItem.dialogId);
                c8bVar.r = storyItem.id;
                c8bVar.s = storyItem.caption;
                c8bVar.L = f2;
                c8bVar.M = false;
                c8bVar.k0 = 720;
                c8bVar.l0 = 1280;
                TLRPC.MessageMedia messageMedia2 = storyItem.media;
                if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
                    c8bVar.K = false;
                    if (f2 != null) {
                        c8bVar.h(f2.getAbsolutePath());
                    }
                } else if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
                    c8bVar.K = true;
                    TLRPC.Document document2 = messageMedia2.document;
                    if (document2 != null && document2.attributes != null) {
                        int i14 = 0;
                        while (true) {
                            if (i14 < storyItem.media.document.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i14);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    c8bVar.k0 = documentAttribute.w;
                                    c8bVar.l0 = documentAttribute.h;
                                    c8bVar.i = documentAttribute.duration;
                                } else {
                                    i14++;
                                }
                            }
                        }
                    }
                    TLRPC.Document document3 = storyItem.media.document;
                    if (document3 != null) {
                        String str9 = storyItem.firstFramePath;
                        if (str9 != null) {
                            c8bVar.N = str9;
                        } else if (document3.thumbs != null) {
                            for (int i15 = 0; i15 < storyItem.media.document.thumbs.size(); i15++) {
                                TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i15);
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                    c8bVar.O = in5.B(null, photoSize.bytes);
                                } else {
                                    xb4.G(i13);
                                    File J = xb4.J(photoSize, null, true, true);
                                    if (J != null && J.exists()) {
                                        c8bVar.N = J.getAbsolutePath();
                                    }
                                }
                            }
                        }
                    }
                }
                c8bVar.z();
                c8bVar.e(storyItem);
                kbb d = mbb.d(o68Var2.t0);
                RectF rectF = C.I;
                WindowManager.LayoutParams layoutParams = C.h;
                WindowManager windowManager = C.f;
                int i16 = C.c;
                if (!C.d) {
                    if (uc7.s1(i16).x2()) {
                        i5.b(i16);
                    } else {
                        C.v0 = false;
                        C.e = false;
                        C.C2 = false;
                        if (windowManager != null && (qbbVar = C.n) != null && qbbVar.getParent() == null) {
                            hl.s3(windowManager, C.n, layoutParams);
                            windowManager.addView(C.n, layoutParams);
                            C.f0();
                        }
                        C.L1 = c8bVar;
                        y9b.a(i16, c8bVar);
                        c8b c8bVar2 = C.L1;
                        C.P1 = (c8bVar2 == null || !c8bVar2.K) ? 0 : 1;
                        C.t0.g = false;
                        if (d != null) {
                            C.G = d;
                            C.K = d.a;
                            rectF.set(d.c);
                            C.H = d.b;
                            C.G.e();
                        } else {
                            C.K = false;
                            float L = hl.L(100.0f);
                            Point point = hl.q;
                            rectF.set(0.0f, L, point.x, hl.L(100.0f) + point.y);
                            C.H = hl.L(8.0f);
                        }
                        C.r.c();
                        ebb ebbVar = C.i0;
                        boolean z6 = C.K;
                        ebbVar.setBackgroundColor((z6 || !z6) ? 0 : -14737633);
                        C.r.setTranslationX(0.0f);
                        C.r.setTranslationY(0.0f);
                        C.r.b(0.0f);
                        C.r.setScaleX(1.0f);
                        C.r.setScaleY(1.0f);
                        C.L = 0.0f;
                        hl.e2(C.b);
                        c8b c8bVar3 = C.L1;
                        if (c8bVar3 != null) {
                            C.d1.setText(c8bVar3.C0);
                        }
                        C.J(new bab(C, (byte) 18), j3);
                        C.c1.b(true, false);
                        C.I(1, false);
                        C.k0(-1, false, false);
                        C.a();
                        C.w0 = 0L;
                        C.x0 = "";
                    }
                }
                C.R = new u48(o68Var2, (byte) 12);
                C.S = new k25(o68Var2, C, b2);
                break;
        }
    }
}
