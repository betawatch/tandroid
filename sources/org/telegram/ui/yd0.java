package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.CheckBox;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class yd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yd0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        TLRPC.Chat O0;
        String N0;
        String a02;
        org.telegram.ui.Components.fc I;
        jl0 jl0Var;
        jl0 jl0Var2;
        Uri fromFile;
        int indexOf;
        int i10;
        int i11;
        org.telegram.ui.web.v0 v0Var;
        int i12 = 6;
        int i13 = 3;
        int i14 = 2;
        switch (this.a) {
            case 0:
                ce0 ce0Var = (ce0) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.e;
                String str = (String) this.b;
                ce0Var.N = false;
                de0 de0Var = ce0Var.h0;
                de0Var.N1(false, true);
                if (tL_error != null) {
                    de0Var.D1(org.telegram.messenger.gd.N0(2131745875, null), tL_error.text);
                    return;
                }
                TL_account.Password password = (TL_account.Password) tLObject;
                if (!TwoStepVerificationActivity.n0(password, true)) {
                    org.telegram.ui.Components.b5.u0(de0Var.getParentActivity(), org.telegram.messenger.gd.N0(2131743573, "UpdateAppAlert"), true);
                    return;
                }
                Bundle bundle = new Bundle();
                SerializedData serializedData = new SerializedData(password.getObjectSize());
                password.serializeToStream(serializedData);
                bundle.putString("password", Utilities.f(serializedData.toByteArray()));
                bundle.putString("phoneFormated", str);
                de0Var.M1(6, true, bundle, false);
                return;
            case 1:
                jg0 jg0Var = (jg0) this.c;
                mg.b bVar = (mg.b) this.d;
                String str2 = (String) this.b;
                a51 a51Var = (a51) this.e;
                mg0 mg0Var = jg0Var.w.d;
                if (bVar != null) {
                    mg0Var.w.l(str2, bVar);
                }
                if (bVar != null && !a51Var.b && (i7 = a51Var.a) >= 0) {
                    View m10 = mg0Var.h.m(i7);
                    if (m10 instanceof l41) {
                        jg0Var.r.e = bVar;
                        l41 l41Var = (l41) m10;
                        l41Var.b.u0.d(false, false);
                        l41Var.g(false);
                    }
                }
                jg0Var.f();
                return;
            case 2:
                qh0 qh0Var = (qh0) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList arrayList3 = (ArrayList) this.b;
                jg.z1 z1Var = qh0Var.h;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = qh0Var.n;
                if (notificationsCustomSettingsActivity.f) {
                    qh0Var.f = null;
                    qh0Var.d = arrayList;
                    qh0Var.e = arrayList2;
                    z1Var.f(arrayList3, null);
                    if (notificationsCustomSettingsActivity.f && !z1Var.e()) {
                        notificationsCustomSettingsActivity.c.c();
                    }
                    qh0Var.f();
                    return;
                }
                return;
            case 3:
                kl0 kl0Var = (kl0) this.c;
                org.telegram.ui.ActionBar.r4 r4Var = (org.telegram.ui.ActionBar.r4) this.d;
                Activity activity = (Activity) this.e;
                TLRPC.Message message = (TLRPC.Message) this.b;
                String str3 = "";
                kl0Var.b1 = true;
                kl0Var.g1 = 1;
                kl0Var.D0(r4Var, activity);
                TLRPC.InputInvoice inputInvoice = kl0Var.c1;
                boolean z10 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                boolean z11 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                boolean z12 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                if (!z10 && (jl0Var2 = kl0Var.a1) != null) {
                    jl0Var2.e(kl0Var.g1);
                }
                kl0Var.z0();
                if (z10 && (jl0Var = kl0Var.a1) != null) {
                    jl0Var.e(kl0Var.g1);
                }
                long w02 = kl0Var.w0();
                if (w02 > 0) {
                    str3 = org.telegram.messenger.n10.l(kl0Var.getMessagesController().c2(Long.valueOf(w02)));
                } else if (w02 < 0 && (O0 = kl0Var.getMessagesController().O0(Long.valueOf(-w02))) != null) {
                    str3 = O0.title;
                }
                long v02 = kl0Var.v0();
                int i15 = z10 ? (z11 || z12) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                if (z10) {
                    N0 = org.telegram.messenger.gd.N0(z12 ? 2131744851 : z11 ? 2131744859 : 2131744918, null);
                } else {
                    N0 = null;
                }
                if (!z10) {
                    a02 = org.telegram.messenger.gd.a0(null, null, 2131747207, kl0Var.S0[0], kl0Var.r0);
                } else if (z12) {
                    a02 = org.telegram.messenger.gd.H(',', "StarsGiveawaySentPopupInfo", (int) v02);
                } else {
                    a02 = org.telegram.messenger.gd.K(z11 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo", (int) v02, ',', str3);
                }
                SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(a02);
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T == null) {
                    return;
                }
                org.telegram.ui.Components.kc b02 = org.telegram.ui.Components.kc.b0(T);
                if (w02 == 0 || N0 == null || z12) {
                    String str4 = N0;
                    I = str4 != null ? b02.I(i15, str4, W2) : b02.Q(i15, 36, W2);
                } else {
                    I = b02.L(i15, N0, W2, org.telegram.messenger.gd.N0(2131743302, null), new di.g3(w02, i13));
                }
                org.telegram.ui.Components.fc fcVar = I;
                fcVar.r = false;
                fcVar.j = 5000;
                if (message != null) {
                    fi.k3 k3Var = new fi.k3(kl0Var, fcVar, z11, message, 4);
                    org.telegram.ui.Components.kb kbVar = fcVar.e;
                    if (kbVar != null) {
                        kbVar.setOnClickListener(k3Var);
                    }
                }
                fcVar.k(z12);
                return;
            case 4:
                kl0.i0((kl0) this.c, (TLObject) this.e, (TLRPC.TL_error) this.d, (TL_account.getTmpPassword) this.b);
                return;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) this.d;
                org.telegram.messenger.ef efVar2 = (org.telegram.messenger.ef) this.e;
                String str5 = (String) this.b;
                Drawable[] drawableArr = PhotoViewer.f9;
                Bitmap decodeFile = BitmapFactory.decodeFile(efVar.I);
                if (decodeFile == null) {
                    org.telegram.messenger.g0.g3(new kn0(photoViewer, 5));
                    return;
                }
                int[] iArr = new int[11];
                AnimatedFileNative.d(efVar2.I, iArr, 0L);
                int max = Math.max(iArr[1], efVar2.F);
                int max2 = Math.max(iArr[2], efVar2.G);
                if ((iArr[8] / 90) % 2 == 1) {
                    max2 = max;
                    max = max2;
                }
                float f10 = max;
                float f11 = max2;
                float max3 = Math.max(decodeFile.getWidth() / f10, decodeFile.getHeight() / f11);
                int i16 = (int) (f10 * max3);
                int i17 = (int) (f11 * max3);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap createBitmap = Bitmap.createBitmap(i16, i17, config);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2, createBitmap.getHeight() / 2);
                float max4 = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max4, max4);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2, (-decodeFile.getHeight()) / 2, paint);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(str5));
                    createBitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                    fileOutputStream.close();
                    Bitmap createBitmap2 = Bitmap.createBitmap(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f), config);
                    Canvas canvas2 = new Canvas(createBitmap2);
                    canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
                    float max5 = Math.max(createBitmap2.getWidth() / createBitmap.getWidth(), createBitmap2.getHeight() / createBitmap.getHeight());
                    canvas2.scale(max5, max5);
                    canvas2.drawBitmap(createBitmap, (-createBitmap.getWidth()) / 2.0f, (-createBitmap.getHeight()) / 2.0f, paint);
                    org.telegram.messenger.g0.g3(new yd0((Object) photoViewer, (Object) efVar2, str5, (Object) createBitmap2, 7));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    org.telegram.messenger.g0.g3(new kn0(photoViewer, i12));
                    return;
                }
            case 6:
                PhotoViewer photoViewer2 = (PhotoViewer) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean[] zArr = (boolean[]) this.e;
                gn0 gn0Var = (gn0) this.b;
                ImageView imageView = photoViewer2.x3;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap);
                    photoViewer2.x3.setVisibility(0);
                    SurfaceView surfaceView = photoViewer2.D2;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    if (zArr[0]) {
                        return;
                    }
                    zArr[0] = true;
                    gn0Var.run();
                    return;
                }
                return;
            case 7:
                PhotoViewer photoViewer3 = (PhotoViewer) this.c;
                org.telegram.messenger.ef efVar3 = (org.telegram.messenger.ef) this.d;
                String str6 = (String) this.b;
                Bitmap bitmap2 = (Bitmap) this.e;
                Drawable[] drawableArr2 = PhotoViewer.f9;
                if (efVar3.g != null) {
                    try {
                        new File(efVar3.g).delete();
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                efVar3.d = -1L;
                efVar3.g = str6;
                efVar3.e = null;
                efVar3.f = null;
                photoViewer3.q5.b.setLoading(false);
                uq0 uq0Var = photoViewer3.d;
                if (uq0Var != null) {
                    uq0Var.X(photoViewer3.P4);
                }
                xo0 xo0Var = photoViewer3.h1;
                if (xo0Var != null) {
                    xo0Var.setImage(bitmap2);
                }
                photoViewer3.d3(0);
                CheckBox checkBox = photoViewer3.O0;
                if (checkBox.y) {
                    return;
                }
                checkBox.callOnClick();
                return;
            case 8:
                ro0 ro0Var = (ro0) this.c;
                TLObject tLObject2 = (TLObject) this.e;
                org.telegram.messenger.i10 i10Var = (org.telegram.messenger.i10) this.d;
                TLRPC.Photo photo = (TLRPC.Photo) this.b;
                PhotoViewer photoViewer4 = ro0Var.b;
                if (tLObject2 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject2;
                    int i18 = photoViewer4.U;
                    ArrayList arrayList4 = photoViewer4.f7;
                    org.telegram.messenger.mp.u1(i18).f4(tL_photos_photo.users, false);
                    TLRPC.User c22 = org.telegram.messenger.mp.u1(photoViewer4.U).c2(Long.valueOf(i10Var.n));
                    if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                        int indexOf2 = arrayList4.indexOf(photo);
                        if (indexOf2 >= 0) {
                            arrayList4.set(indexOf2, tL_photos_photo.photo);
                        }
                        if (c22 != null) {
                            c22.photo.photo_id = tL_photos_photo.photo.id;
                            i10Var.w(c22);
                            i10Var.v(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                hs0.Z((hs0) this.c, (TLRPC.TL_error) this.d, (TLObject) this.e, (TL_stars.updatePaidMessagesPrice) this.b);
                return;
            case 10:
                PrivacyControlActivity.a0((PrivacyControlActivity) this.c, (TLRPC.TL_error) this.d, (TLObject) this.e, (boolean[]) this.b);
                return;
            case 11:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.c;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.d;
                TLObject tLObject3 = (TLObject) this.e;
                TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) this.b;
                try {
                    t1Var.dismiss();
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    privacySettingsActivity.R = true;
                    privacySettingsActivity.getContactsController().I = setaccountttl.ttl.days;
                    privacySettingsActivity.a.f();
                    return;
                }
                return;
            case 12:
                org.telegram.ui.ActionBar.t1 t1Var2 = (org.telegram.ui.ActionBar.t1) this.c;
                boolean[] zArr2 = (boolean[]) this.d;
                Activity activity2 = (Activity) this.e;
                File file = (File) this.b;
                RectF rectF = ProfileActivity.Z6;
                try {
                    t1Var2.dismiss();
                } catch (Exception unused) {
                }
                if (!zArr2[0]) {
                    if (activity2 != null) {
                        Toast.makeText(activity2, org.telegram.messenger.gd.N0(2131751093, null), 0).show();
                        return;
                    }
                    return;
                }
                int i19 = Build.VERSION.SDK_INT;
                if (i19 >= 24) {
                    org.telegram.messenger.t0.d();
                    fromFile = FileProvider.d(activity2, "org.telegram.messenger.beta.provider", file);
                } else {
                    fromFile = Uri.fromFile(file);
                }
                Intent intent = new Intent("android.intent.action.SEND");
                if (i19 >= 24) {
                    intent.addFlags(1);
                }
                intent.setType("message/rfc822");
                intent.putExtra("android.intent.extra.EMAIL", "");
                intent.putExtra("android.intent.extra.SUBJECT", "Logs from " + org.telegram.messenger.gd.E0().z0().format(System.currentTimeMillis()));
                intent.putExtra("android.intent.extra.STREAM", fromFile);
                if (activity2 != null) {
                    try {
                        activity2.startActivityForResult(Intent.createChooser(intent, "Select email application."), 500);
                        return;
                    } catch (Exception e13) {
                        org.telegram.messenger.a8.g(e13, true);
                        return;
                    }
                }
                return;
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                TLObject tLObject4 = (TLObject) this.e;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                int[] iArr2 = (int[]) this.b;
                if (!(tLObject4 instanceof TLRPC.TL_boolTrue)) {
                    RectF rectF2 = ProfileActivity.Z6;
                    profileActivity.getClass();
                    org.telegram.ui.Components.kc.b0(profileActivity).g0(tL_error2, false);
                }
                if (profileActivity.r4 == iArr2[0]) {
                    profileActivity.r4 = 0;
                    return;
                }
                return;
            case 14:
                ProfileActivity.i0((ProfileActivity) this.c, (TLRPC.TL_error) this.d, (TLObject) this.e, (String) this.b);
                return;
            case 15:
                ProfileActivity profileActivity2 = (ProfileActivity) this.c;
                String[] strArr = (String[]) this.d;
                String str7 = (String) this.b;
                String str8 = (String) this.e;
                RectF rectF3 = ProfileActivity.Z6;
                if (org.telegram.messenger.g0.E1(profileActivity2.getParentActivity())) {
                    org.telegram.ui.Components.a31.W0(profileActivity2.getParentActivity(), profileActivity2, strArr[0], str7, str8, new n00(profileActivity2, 2), null);
                    return;
                }
                return;
            case 16:
                ProfileActivity profileActivity3 = (ProfileActivity) this.c;
                TLObject tLObject5 = (TLObject) this.e;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                if (tLObject5 instanceof TL_fragment.TL_collectibleInfo) {
                    l00.a(profileActivity3.getParentActivity(), 0, tL_username.username, profileActivity3.e1 != 0 ? profileActivity3.getMessagesController().c2(Long.valueOf(profileActivity3.e1)) : profileActivity3.getMessagesController().O0(Long.valueOf(profileActivity3.f1)), (TL_fragment.TL_collectibleInfo) tLObject5, profileActivity3.A0);
                    return;
                } else {
                    RectF rectF4 = ProfileActivity.Z6;
                    org.telegram.ui.Components.kc.e0(tL_error3);
                    return;
                }
            case 17:
                qv0 qv0Var = (qv0) this.c;
                TLObject tLObject6 = (TLObject) this.e;
                org.telegram.messenger.i10 i10Var2 = (org.telegram.messenger.i10) this.d;
                TLRPC.Photo photo2 = (TLRPC.Photo) this.b;
                ProfileActivity profileActivity4 = qv0Var.b;
                profileActivity4.o0.d1--;
                if (tLObject6 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo2 = (TLRPC.TL_photos_photo) tLObject6;
                    profileActivity4.getMessagesController().f4(tL_photos_photo2.users, false);
                    TLRPC.User c23 = profileActivity4.getMessagesController().c2(Long.valueOf(i10Var2.n));
                    TLRPC.Photo photo3 = tL_photos_photo2.photo;
                    if (photo3 instanceof TLRPC.TL_photo) {
                        ArrayList arrayList5 = profileActivity4.o0.W0;
                        if (!arrayList5.isEmpty() && (indexOf = arrayList5.indexOf(photo2)) >= 0) {
                            arrayList5.set(indexOf, photo3);
                        }
                        if (c23 != null) {
                            c23.photo.photo_id = tL_photos_photo2.photo.id;
                            i10Var2.w(c23);
                            i10Var2.v(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 18:
                cw0 cw0Var = (cw0) this.c;
                TLObject tLObject7 = (TLObject) this.e;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                ProfileActivity profileActivity5 = cw0Var.c.e;
                profileActivity5.h5(null);
                if (!(tLObject7 instanceof TL_fragment.TL_collectibleInfo)) {
                    org.telegram.ui.Components.kc.e0(tL_error4);
                    return;
                }
                TLObject c24 = profileActivity5.e1 != 0 ? profileActivity5.getMessagesController().c2(Long.valueOf(profileActivity5.e1)) : profileActivity5.getMessagesController().O0(Long.valueOf(profileActivity5.f1));
                if (profileActivity5.getParentActivity() == null) {
                    return;
                }
                l00.a(profileActivity5.getParentActivity(), 0, tL_username2.username, c24, (TL_fragment.TL_collectibleInfo) tLObject7, profileActivity5.A0);
                return;
            case 19:
                SessionsActivity sessionsActivity = (SessionsActivity) this.c;
                org.telegram.ui.ActionBar.t1 t1Var3 = (org.telegram.ui.ActionBar.t1) this.e;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) this.b;
                try {
                    t1Var3.dismiss();
                } catch (Exception e14) {
                    org.telegram.messenger.a8.g(e14, true);
                }
                if (tL_error5 == null) {
                    sessionsActivity.d.remove(tL_webAuthorization);
                    sessionsActivity.r0();
                    y21 y21Var = sessionsActivity.a;
                    if (y21Var != null) {
                        y21Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                SessionsActivity sessionsActivity2 = (SessionsActivity) this.c;
                org.telegram.ui.ActionBar.t1 t1Var4 = (org.telegram.ui.ActionBar.t1) this.e;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.b;
                try {
                    t1Var4.dismiss();
                } catch (Exception e15) {
                    org.telegram.messenger.a8.g(e15, true);
                }
                if (tL_error6 == null) {
                    sessionsActivity2.d.remove(tL_authorization);
                    sessionsActivity2.e.remove(tL_authorization);
                    sessionsActivity2.r0();
                    y21 y21Var2 = sessionsActivity2.a;
                    if (y21Var2 != null) {
                        y21Var2.f();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                x21 x21Var = (x21) this.c;
                TLObject tLObject8 = (TLObject) this.e;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.d;
                k9 k9Var = (k9) this.b;
                x21Var.a = tLObject8;
                x21Var.b = tL_error7;
                k9Var.run();
                return;
            case 22:
                n31.d0((n31) this.c, (TLRPC.TL_error) this.d, (TLObject) this.e, (String) this.b);
                return;
            case 23:
                m41 m41Var = (m41) this.c;
                mg.b bVar2 = (mg.b) this.d;
                String str9 = (String) this.b;
                a51 a51Var2 = (a51) this.e;
                b51 b51Var = m41Var.x;
                if (bVar2 != null) {
                    b51Var.V.l(str9, bVar2);
                }
                if (bVar2 != null && !a51Var2.b && (i10 = a51Var2.a) >= 0) {
                    View m11 = b51Var.U.m(i10);
                    if (m11 instanceof m41) {
                        m41Var.r.e = bVar2;
                        m41 m41Var2 = (m41) m11;
                        m41Var2.b.u0.d(false, false);
                        m41Var2.g(false);
                    }
                }
                b51.c0(b51Var);
                return;
            case 24:
                n41 n41Var = (n41) this.c;
                mg.b bVar3 = (mg.b) this.d;
                String str10 = (String) this.b;
                org.telegram.messenger.o10 o10Var = (org.telegram.messenger.o10) this.e;
                n41Var.k = false;
                n41Var.d = bVar3;
                n41Var.g = str10;
                l41 l41Var2 = (l41) o10Var.run();
                if (l41Var2 != null) {
                    l41Var2.e(n41Var, true);
                    return;
                }
                return;
            case 25:
                q81 q81Var = (q81) this.c;
                TLObject tLObject9 = (TLObject) this.e;
                String str11 = (String) this.b;
                org.telegram.ui.ActionBar.t1 t1Var5 = (org.telegram.ui.ActionBar.t1) this.d;
                u81 u81Var = q81Var.a;
                if (tLObject9 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject9;
                    int i20 = 0;
                    while (i20 < updates.updates.size()) {
                        if (updates.updates.get(i20) instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) updates.updates.get(i20);
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            tL_messageActionTopicCreate.title = str11;
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = u81Var.getMessagesController().B1(u81Var.a);
                            tL_messageService.dialog_id = u81Var.a;
                            tL_messageService.id = tL_updateMessageID.id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList6 = new ArrayList();
                            i11 = ((org.telegram.ui.ActionBar.g2) u81Var).currentAccount;
                            arrayList6.add(new org.telegram.messenger.fj(i11, tL_messageService, false, false));
                            TLRPC.Chat O02 = u81Var.getMessagesController().O0(Long.valueOf(-u81Var.a));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.id = tL_updateMessageID.id;
                            long j3 = u81Var.b;
                            if (j3 != 0) {
                                tL_forumTopic.icon_emoji_id = j3;
                                tL_forumTopic.flags |= 1;
                            }
                            tL_forumTopic.my = true;
                            tL_forumTopic.flags |= i14;
                            tL_forumTopic.topicStartMessage = tL_messageService;
                            tL_forumTopic.title = str11;
                            tL_forumTopic.top_message = tL_messageService.id;
                            tL_forumTopic.topMessage = tL_messageService;
                            tL_forumTopic.from_id = u81Var.getMessagesController().B1(u81Var.getUserConfig().n);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = u81Var.F;
                            bn bnVar = u81Var.E;
                            if (bnVar != null) {
                                bnVar.ob();
                                bnVar.sb();
                                bnVar.Vb(arrayList6, O02, tL_messageService.id, 1, 1, tL_forumTopic);
                                bnVar.c = true;
                                bnVar.L8();
                                bnVar.wd(true);
                                bnVar.p1.n(true);
                                bnVar.Cd();
                                bnVar.g2.setCurrentTopic(bnVar.b());
                                bnVar.zd(true);
                                bnVar.Pc(true);
                                bnVar.D9(true);
                                bnVar.N6(true, true);
                                bnVar.hb();
                                u81Var.getMessagesController().t7.q(u81Var.a, tL_forumTopic, true);
                                u81Var.finishFragment();
                            } else {
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", -u81Var.a);
                                bundle2.putInt("message_id", 1);
                                bundle2.putInt("unread_count", 0);
                                bundle2.putBoolean("historyPreloaded", false);
                                bn bnVar2 = new bn(bundle2);
                                bnVar2.Vb(arrayList6, O02, tL_messageService.id, 1, 1, tL_forumTopic);
                                bnVar2.c = true;
                                u81Var.getMessagesController().t7.q(u81Var.a, tL_forumTopic, true);
                                u81Var.presentFragment(bnVar2);
                            }
                        }
                        i20++;
                        i14 = 2;
                    }
                }
                t1Var5.dismiss();
                return;
            case 26:
                TwoStepVerificationActivity.j0((TwoStepVerificationActivity) this.c, (byte[]) this.d, (TLObject) this.e, (byte[]) this.b);
                return;
            case 27:
                za1 za1Var = (za1) this.c;
                TLObject tLObject10 = (TLObject) this.e;
                String str12 = (String) this.b;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.d;
                if (tLObject10 instanceof TLRPC.TL_boolTrue) {
                    za1Var.z0(new iy0(23, za1Var, str12));
                    return;
                }
                if (tL_error8 == null || tL_error8.text.startsWith("CODE_INVALID")) {
                    za1Var.D0();
                    return;
                } else if (!tL_error8.text.startsWith("FLOOD_WAIT")) {
                    za1Var.L0(org.telegram.messenger.gd.N0(2131743684, null), tL_error8.text);
                    return;
                } else {
                    int intValue = Utilities.z(tL_error8.text).intValue();
                    za1Var.L0(org.telegram.messenger.gd.N0(2131743684, null), org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750669, intValue < 60 ? org.telegram.messenger.gd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.gd.G(intValue / 60, "Minutes", new Object[0])));
                    return;
                }
            case 28:
                org.telegram.ui.web.s0 s0Var = (org.telegram.ui.web.s0) this.c;
                fi.f7 f7Var = (fi.f7) this.d;
                String str13 = (String) this.b;
                JSONObject jSONObject = (JSONObject) this.e;
                if (s0Var.c && ((v0Var = s0Var.R) == null || !v0Var.o(f7Var))) {
                    org.telegram.messenger.a8.b("notifyEvent " + str13 + " dropped after document change");
                    return;
                }
                s0Var.d("window.Telegram.WebView.receiveEvent('" + str13 + "', " + jSONObject + ");");
                return;
            default:
                ab.c0 c0Var = (ab.c0) this.c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
                p4.h hVar = (p4.h) this.e;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.b;
                synchronized (c0Var.b) {
                    try {
                        if (atomicBoolean.get()) {
                            atomicBoolean2.set(true);
                        } else {
                            c0Var.k(hVar);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    public /* synthetic */ yd0(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i7) {
        this.a = i7;
        this.c = obj;
        this.e = obj2;
        this.d = obj3;
        this.b = obj4;
    }

    public /* synthetic */ yd0(Object obj, Object obj2, String str, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = str;
        this.e = obj3;
    }

    public /* synthetic */ yd0(Object obj, TLObject tLObject, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.e = tLObject;
        this.b = obj2;
        this.d = obj3;
    }
}
