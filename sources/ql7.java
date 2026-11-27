// default package

import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.location.Address;
import android.location.Geocoder;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
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
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.p;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ql7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ql7(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        long j2;
        int i;
        int i2;
        TLRPC.Chat M0;
        String a0;
        v21 I;
        z28 z28Var;
        z28 z28Var2;
        long j3 = 0;
        String str = "";
        byte b = 2;
        switch (this.a) {
            case 0:
                sl7 sl7Var = (sl7) this.c;
                TLRPC.User user = (TLRPC.User) this.b;
                sl7Var.dismiss();
                e S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(ProfileActivity.Q2(user.id));
                    break;
                }
                break;
            case 1:
                ((v35) this.c).a((TLRPC.User) this.b);
                break;
            case 2:
                lm7 lm7Var = (lm7) this.c;
                TLObject tLObject = (TLObject) this.b;
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
                        lm7Var.K0(false);
                        lm7.J0(jm7VarArr[0]);
                        break;
                    } else {
                        lm7Var.r = true;
                        lm7.J0(jm7VarArr[0]);
                        break;
                    }
                }
                break;
            case 3:
                Intent intent = (Intent) this.c;
                Intent intent2 = (Intent) this.b;
                a.b.sendBroadcast(intent);
                a.b.sendBroadcast(intent2);
                break;
            case 4:
                try {
                    a.b.getContentResolver().call(((NotificationBadge$ZukHomeBadger) this.c).a, "setAppBadgeCount", (String) null, (Bundle) this.b);
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 5:
                Uri uri = (Uri) this.c;
                File file = (File) this.b;
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
            case 6:
                ip7 ip7Var = (ip7) this.c;
                if (ip7Var.s.remove((String) this.b)) {
                    ip7Var.Z(true);
                    break;
                }
                break;
            case 7:
                ((tp8) this.c).x((HashSet) this.b);
                break;
            case 8:
                ip7 ip7Var2 = (ip7) this.c;
                zh6 zh6Var = (zh6) this.b;
                ArrayList arrayList2 = ip7Var2.b;
                ArrayList arrayList3 = ip7Var2.a;
                int m = zh6Var.m();
                int i3 = 0;
                boolean z = false;
                while (i3 < m) {
                    zh6Var.j(i3);
                    ArrayList arrayList4 = (ArrayList) zh6Var.n(i3);
                    int size = arrayList4.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 < size) {
                            r47 r47Var = (r47) arrayList4.get(i4);
                            j = j3;
                            boolean z2 = r47Var.J;
                            TLRPC.Message message = r47Var.k;
                            if (z2) {
                                j2 = r47.B0(message);
                            } else {
                                long j4 = message.peer_id.channel_id;
                                j2 = j4 != j ? -j4 : j;
                            }
                            SparseArray sparseArray = (SparseArray) ip7Var2.c.f(j2);
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
                                i4++;
                                j3 = j;
                            }
                        } else {
                            j = j3;
                        }
                    }
                    i3++;
                    j3 = j;
                }
                if (z) {
                    ip7Var2.Z(false);
                    break;
                }
                break;
            case 9:
                ((NotificationsCustomSettingsActivity) this.c).m0((ArrayList) this.b);
                break;
            case 10:
                nx0[] nx0VarArr = (nx0[]) this.c;
                boolean[] zArr = (boolean[]) this.b;
                nx0VarArr[0] = null;
                uq7.a = null;
                zArr[0] = true;
                break;
            case 11:
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.c;
                String str2 = (String) this.b;
                e S2 = LaunchActivity.S();
                d31 b0 = S2 != null ? d31.b0(S2) : d31.Y();
                TLRPC.Document document = starGift.getDocument();
                v21 q = document != null ? b0.q(document, str2) : b0.Q(R.raw.contact_check, 36, str2);
                q.u = true;
                q.j();
                break;
            case 12:
                ((vt7) this.c).Y(((b8c) this.b).d);
                break;
            case 13:
                dx7 dx7Var = (dx7) this.c;
                View view = (View) this.b;
                if (view instanceof h44) {
                    h44 h44Var = (h44) view;
                    h44Var.m();
                    dx7Var.C0(h44Var, true);
                    break;
                }
                break;
            case 14:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.c;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.b;
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
            case 15:
                nx7 nx7Var = (nx7) this.c;
                ka9 ka9Var = (ka9) this.b;
                nx7Var.v = true;
                ByteBuffer byteBuffer = (ByteBuffer) nx7Var.h(nx7Var.f(), true, false, false).c;
                RectF f = nx7Var.f();
                Object obj = nx7Var.a.b;
                nx7Var.w = new rx(byteBuffer, 0, f);
                nx7Var.a(false);
                ka9Var.run();
                break;
            case 16:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.c;
                Runnable runnable = (Runnable) this.b;
                for (ok2 ok2Var : passcodeActivity.n.f) {
                    ok2Var.D(0.0f);
                }
                runnable.run();
                break;
            case 17:
                py7 py7Var = (py7) this.c;
                b8 b8Var = (b8) this.b;
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
            case 18:
                ((PasskeysActivity) this.c).Y((TL_account.Passkey) this.b);
                break;
            case 19:
                ((icc) this.c).a(null, ((Throwable) this.b).getMessage());
                break;
            case 20:
                b18 b18Var = (b18) this.c;
                fi7 fi7Var = (fi7) this.b;
                int[] iArr = b18Var.y;
                byte b2 = fi7Var.a;
                if (b2 == 2) {
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
                } else if (b2 == 1) {
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
                } else if (b2 == 3) {
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
                } else if (b2 == 4 && !(b18Var.G.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
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
                if (!TextUtils.isEmpty(fi7Var.b)) {
                    b18Var.Z[0].setText(fi7Var.b);
                }
                if (!TextUtils.isEmpty(fi7Var.d)) {
                    b18Var.Z[1].setText(fi7Var.d);
                }
                if (!TextUtils.isEmpty(fi7Var.c)) {
                    b18Var.Z[2].setText(fi7Var.c);
                }
                if (!TextUtils.isEmpty(fi7Var.e)) {
                    b18Var.Z[7].setText(fi7Var.e);
                }
                int i9 = fi7Var.n;
                if (i9 != 0) {
                    if (i9 == 1) {
                        b18Var.x = "male";
                        b18Var.Z[4].setText(ob6.M0(2131747235, null));
                    } else if (i9 == 2) {
                        b18Var.x = "female";
                        b18Var.Z[4].setText(ob6.M0(2131747296, null));
                    }
                }
                if (!TextUtils.isEmpty(fi7Var.m)) {
                    String str3 = fi7Var.m;
                    b18Var.s = str3;
                    String str4 = (String) b18Var.Z0.get(str3);
                    if (str4 != null) {
                        b18Var.Z[5].setText(str4);
                    }
                }
                if (!TextUtils.isEmpty(fi7Var.l)) {
                    String str5 = fi7Var.l;
                    b18Var.w = str5;
                    String str6 = (String) b18Var.Z0.get(str5);
                    if (str6 != null) {
                        b18Var.Z[6].setText(str6);
                    }
                }
                int i10 = fi7Var.k;
                if (i10 > 0 && fi7Var.j > 0 && fi7Var.i > 0) {
                    b18Var.Z[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i10), Integer.valueOf(fi7Var.j), Integer.valueOf(fi7Var.i)));
                }
                int i11 = fi7Var.h;
                if (i11 <= 0 || (i = fi7Var.g) <= 0 || (i2 = fi7Var.f) <= 0) {
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    b18Var.Z[8].setText(ob6.M0(2131747221, null));
                    break;
                } else {
                    iArr[0] = i2;
                    iArr[1] = i;
                    iArr[2] = i11;
                    b18Var.Z[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i11), Integer.valueOf(fi7Var.g), Integer.valueOf(fi7Var.f)));
                    break;
                }
                break;
            case 21:
                b18 b18Var2 = (b18) this.c;
                TLObject tLObject2 = (TLObject) this.b;
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
            case 22:
                b18 b18Var3 = (b18) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
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
            case 23:
                ((w08) this.c).a.L = ((TLRPC.TL_error) this.b).text;
                break;
            case 24:
                p pVar = (p) this.c;
                View view2 = (View) this.b;
                pVar.J0(false);
                view2.callOnClick();
                break;
            case 25:
                p pVar2 = (p) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
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
            case 26:
                ((p) this.c).u0((TLRPC.TL_payments_validatedRequestedInfo) this.b);
                break;
            case 27:
                p pVar3 = (p) this.c;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.b;
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
                    SpannableStringBuilder S22 = hl.S2(a0);
                    e S3 = LaunchActivity.S();
                    if (S3 != null) {
                        d31 b02 = d31.b0(S3);
                        if (e0 == 0 || M02 == null || z5) {
                            String str7 = M02;
                            I = str7 != null ? b02.I(i12, str7, S22) : b02.Q(i12, 36, S22);
                        } else {
                            I = b02.L(i12, M02, S22, ob6.M0(2131743204, null), new tz6(b, e0));
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
            case 28:
                p pVar4 = (p) this.c;
                TLRPC.TL_payments_paymentVerificationNeeded tL_payments_paymentVerificationNeeded = (TLRPC.TL_payments_paymentVerificationNeeded) this.b;
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
                pVar4.getMessagesController().c4 = new fu2((Object) pVar4, (Object) pVar4.getParentLayout(), (Object) pVar4.getParentActivity(), (byte) 21);
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
            default:
                o68 o68Var = (o68) this.c;
                kg5 kg5Var = (kg5) this.b;
                o68Var.removeView(kg5Var);
                if (o68Var.N1 == kg5Var) {
                    o68Var.N1 = null;
                    break;
                }
                break;
        }
    }
}
