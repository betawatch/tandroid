package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.q20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class v8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ v8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
    }

    private final void a() {
        rh.e6 e6Var = (rh.e6) this.b;
        Runnable runnable = (Runnable) this.c;
        org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) this.d;
        TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) this.e;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) this.f;
        org.telegram.messenger.q20 q20Var = (org.telegram.messenger.q20) this.h;
        if (e6Var.e) {
            e6Var.X(jjVar, inputInvoice, tL_payments_paymentFormStars, runnable, q20Var);
        } else {
            rh.e6.e("NO_BALANCE");
            runnable.run();
        }
    }

    private final void b() {
        char c10;
        org.telegram.ui.ActionBar.k2 T;
        rh.u5 u5Var = (rh.u5) this.c;
        TLObject tLObject = (TLObject) this.b;
        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.d;
        rh.v5 v5Var = (rh.v5) this.e;
        org.telegram.messenger.q20 q20Var = (org.telegram.messenger.q20) this.f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
        long j10 = u5Var.b;
        int i10 = u5Var.a;
        HashMap hashMap = u5Var.h;
        ArrayList arrayList = u5Var.e;
        u5Var.k = false;
        boolean z10 = tLObject instanceof TL_stars.TL_starGiftCollection;
        int i11 = org.telegram.messenger.zs.H3;
        if (z10) {
            TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject;
            arrayList.remove(tL_starGiftCollection);
            arrayList.add(tL_starGiftCollection2);
            hashMap.remove(-1);
            int i12 = tL_starGiftCollection2.collection_id;
            v5Var.d = i12;
            hashMap.put(Integer.valueOf(i12), v5Var);
            u5Var.j();
            org.telegram.messenger.zs.f(i10).k(i11, Long.valueOf(j10), u5Var);
            q20Var.a(tL_starGiftCollection2);
            return;
        }
        if (tL_error == null || (T = LaunchActivity.T()) == null) {
            c10 = 0;
        } else {
            c10 = 0;
            org.telegram.ui.Components.cc.a0(T).f0(tL_error, false);
        }
        arrayList.remove(tL_starGiftCollection);
        hashMap.remove(-1);
        u5Var.j();
        org.telegram.messenger.zs f7 = org.telegram.messenger.zs.f(i10);
        Object[] objArr = new Object[2];
        objArr[c10] = Long.valueOf(j10);
        objArr[1] = u5Var;
        f7.k(i11, objArr);
    }

    private final void c() {
        th.x4 x4Var = (th.x4) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        ArrayList arrayList3 = (ArrayList) this.e;
        ArrayList arrayList4 = (ArrayList) this.f;
        HashSet hashSet = (HashSet) this.h;
        StringBuilder sb2 = new StringBuilder("StoriesList ");
        sb2.append(x4Var.e);
        sb2.append("{");
        sb2.append(x4Var.d);
        sb2.append("} preloadCache {");
        sb2.append(th.e5.a(arrayList));
        a1.g.z("}", sb2);
        ArrayList arrayList5 = x4Var.g;
        arrayList5.clear();
        arrayList5.addAll(arrayList2);
        x4Var.t = false;
        int i10 = x4Var.c;
        org.telegram.messenger.vp.r1(i10).V3(arrayList3, true);
        org.telegram.messenger.vp.r1(i10).P3(arrayList4, true);
        if (x4Var.v) {
            x4Var.v = false;
            x4Var.y = null;
            x4Var.j();
            return;
        }
        x4Var.m.addAll(hashSet);
        x4Var.k.clear();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            x4Var.t((org.telegram.messenger.jj) arrayList.get(i11), true);
        }
        x4Var.d(false);
        th.w4 w4Var = x4Var.y;
        if (w4Var != null) {
            w4Var.a(0);
            x4Var.y = null;
        }
        org.telegram.messenger.zs.f(i10).k(org.telegram.messenger.zs.x5, x4Var);
    }

    private final void d() {
        int[] iArr = (int[]) this.c;
        TLObject tLObject = (TLObject) this.b;
        org.telegram.messenger.vp vpVar = (org.telegram.messenger.vp) this.d;
        TLRPC.User[] userArr = (TLRPC.User[]) this.e;
        vh.h9 h9Var = (vh.h9) this.f;
        org.telegram.ui.Components.ll llVar = (org.telegram.ui.Components.ll) this.h;
        iArr[0] = 0;
        if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            vpVar.V3(tL_contacts_resolvedPeer.users, false);
            vpVar.P3(tL_contacts_resolvedPeer.chats, false);
            TLRPC.User Z1 = vpVar.Z1(Long.valueOf(org.telegram.messenger.o5.o(tL_contacts_resolvedPeer.peer)));
            userArr[0] = Z1;
            if (Z1 != null) {
                h9Var.run();
                return;
            }
        }
        llVar.a(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x03b9 A[Catch: Exception -> 0x04eb, TryCatch #1 {Exception -> 0x04eb, blocks: (B:100:0x025b, B:102:0x0277, B:103:0x0288, B:105:0x028c, B:107:0x02a1, B:108:0x02a7, B:110:0x02ad, B:111:0x02b1, B:113:0x02b7, B:114:0x02bb, B:116:0x02ca, B:117:0x02dd, B:119:0x02e3, B:121:0x02ef, B:123:0x02f7, B:125:0x0301, B:127:0x030f, B:128:0x0315, B:130:0x031b, B:132:0x0325, B:134:0x0333, B:135:0x0337, B:137:0x033d, B:139:0x0347, B:141:0x0355, B:142:0x0359, B:144:0x035f, B:146:0x0365, B:148:0x036f, B:150:0x0375, B:151:0x0378, B:152:0x037d, B:155:0x0384, B:157:0x038a, B:162:0x039d, B:164:0x03a3, B:166:0x03b9, B:174:0x03ce, B:176:0x03d8, B:178:0x0411, B:180:0x0426, B:181:0x042c, B:183:0x0432, B:184:0x0436, B:186:0x043c, B:187:0x0440, B:189:0x044a, B:190:0x0454, B:192:0x045a, B:194:0x0464, B:198:0x046f, B:200:0x0475, B:202:0x047f, B:204:0x04b8, B:205:0x04c5, B:159:0x0399, B:217:0x0280), top: B:99:0x025b }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0139 A[Catch: Exception -> 0x00f1, TryCatch #4 {Exception -> 0x00f1, blocks: (B:36:0x00dd, B:38:0x00e7, B:40:0x00ed, B:41:0x00f5, B:43:0x0133, B:45:0x0139, B:47:0x013f, B:48:0x0142, B:50:0x0147, B:52:0x014d, B:53:0x0150, B:56:0x015a, B:58:0x0164, B:60:0x0174, B:62:0x0180, B:64:0x018c, B:68:0x01da, B:70:0x01e0, B:71:0x01e3, B:73:0x01ec, B:74:0x01ef, B:75:0x01f9, B:78:0x0203, B:84:0x0216, B:86:0x021c, B:95:0x024e, B:97:0x0254, B:221:0x019d, B:223:0x01b1, B:225:0x01bb, B:227:0x01d5, B:233:0x00fc, B:235:0x0106, B:237:0x010c, B:238:0x010f, B:239:0x0113, B:241:0x011d, B:243:0x0123, B:245:0x0129, B:246:0x012c), top: B:35:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0164 A[Catch: Exception -> 0x00f1, TryCatch #4 {Exception -> 0x00f1, blocks: (B:36:0x00dd, B:38:0x00e7, B:40:0x00ed, B:41:0x00f5, B:43:0x0133, B:45:0x0139, B:47:0x013f, B:48:0x0142, B:50:0x0147, B:52:0x014d, B:53:0x0150, B:56:0x015a, B:58:0x0164, B:60:0x0174, B:62:0x0180, B:64:0x018c, B:68:0x01da, B:70:0x01e0, B:71:0x01e3, B:73:0x01ec, B:74:0x01ef, B:75:0x01f9, B:78:0x0203, B:84:0x0216, B:86:0x021c, B:95:0x024e, B:97:0x0254, B:221:0x019d, B:223:0x01b1, B:225:0x01bb, B:227:0x01d5, B:233:0x00fc, B:235:0x0106, B:237:0x010c, B:238:0x010f, B:239:0x0113, B:241:0x011d, B:243:0x0123, B:245:0x0129, B:246:0x012c), top: B:35:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e0 A[Catch: Exception -> 0x00f1, TryCatch #4 {Exception -> 0x00f1, blocks: (B:36:0x00dd, B:38:0x00e7, B:40:0x00ed, B:41:0x00f5, B:43:0x0133, B:45:0x0139, B:47:0x013f, B:48:0x0142, B:50:0x0147, B:52:0x014d, B:53:0x0150, B:56:0x015a, B:58:0x0164, B:60:0x0174, B:62:0x0180, B:64:0x018c, B:68:0x01da, B:70:0x01e0, B:71:0x01e3, B:73:0x01ec, B:74:0x01ef, B:75:0x01f9, B:78:0x0203, B:84:0x0216, B:86:0x021c, B:95:0x024e, B:97:0x0254, B:221:0x019d, B:223:0x01b1, B:225:0x01bb, B:227:0x01d5, B:233:0x00fc, B:235:0x0106, B:237:0x010c, B:238:0x010f, B:239:0x0113, B:241:0x011d, B:243:0x0123, B:245:0x0129, B:246:0x012c), top: B:35:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ec A[Catch: Exception -> 0x00f1, TryCatch #4 {Exception -> 0x00f1, blocks: (B:36:0x00dd, B:38:0x00e7, B:40:0x00ed, B:41:0x00f5, B:43:0x0133, B:45:0x0139, B:47:0x013f, B:48:0x0142, B:50:0x0147, B:52:0x014d, B:53:0x0150, B:56:0x015a, B:58:0x0164, B:60:0x0174, B:62:0x0180, B:64:0x018c, B:68:0x01da, B:70:0x01e0, B:71:0x01e3, B:73:0x01ec, B:74:0x01ef, B:75:0x01f9, B:78:0x0203, B:84:0x0216, B:86:0x021c, B:95:0x024e, B:97:0x0254, B:221:0x019d, B:223:0x01b1, B:225:0x01bb, B:227:0x01d5, B:233:0x00fc, B:235:0x0106, B:237:0x010c, B:238:0x010f, B:239:0x0113, B:241:0x011d, B:243:0x0123, B:245:0x0129, B:246:0x012c), top: B:35:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0203 A[Catch: Exception -> 0x00f1, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x00f1, blocks: (B:36:0x00dd, B:38:0x00e7, B:40:0x00ed, B:41:0x00f5, B:43:0x0133, B:45:0x0139, B:47:0x013f, B:48:0x0142, B:50:0x0147, B:52:0x014d, B:53:0x0150, B:56:0x015a, B:58:0x0164, B:60:0x0174, B:62:0x0180, B:64:0x018c, B:68:0x01da, B:70:0x01e0, B:71:0x01e3, B:73:0x01ec, B:74:0x01ef, B:75:0x01f9, B:78:0x0203, B:84:0x0216, B:86:0x021c, B:95:0x024e, B:97:0x0254, B:221:0x019d, B:223:0x01b1, B:225:0x01bb, B:227:0x01d5, B:233:0x00fc, B:235:0x0106, B:237:0x010c, B:238:0x010f, B:239:0x0113, B:241:0x011d, B:243:0x0123, B:245:0x0129, B:246:0x012c), top: B:35:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0249  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void f() {
        zf.c cVar;
        String str;
        Location location;
        Locale locale;
        List<Address> list;
        List<Address> list2;
        int i10;
        boolean z10;
        boolean z11;
        String countryName;
        boolean z12;
        boolean z13;
        Address address;
        StringBuilder sb2;
        StringBuilder sb3;
        Address address2;
        boolean z14;
        String str2;
        int i11;
        zf.c cVar2 = (zf.c) this.b;
        Locale locale2 = (Locale) this.c;
        String str3 = (String) this.d;
        Locale locale3 = (Locale) this.e;
        Location location2 = (Location) this.f;
        String str4 = (String) this.h;
        ArrayList arrayList = new ArrayList();
        try {
            int i12 = cVar2.e ? 10 : 5;
            List<Address> fromLocationName = new Geocoder(org.telegram.messenger.w0.b, locale2).getFromLocationName(str3, 5);
            List<Address> fromLocationName2 = cVar2.d ? new Geocoder(org.telegram.messenger.w0.b, locale3).getFromLocationName(str3, 5) : null;
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            int i13 = 0;
            while (i13 < fromLocationName.size()) {
                Address address3 = fromLocationName.get(i13);
                Address address4 = (fromLocationName2 == null || i13 >= fromLocationName2.size()) ? null : fromLocationName2.get(i13);
                if (address3.hasLatitude() && address3.hasLongitude()) {
                    i10 = i13;
                    double latitude = address3.getLatitude();
                    double longitude = address3.getLongitude();
                    StringBuilder sb4 = new StringBuilder();
                    StringBuilder sb5 = new StringBuilder();
                    locale = locale2;
                    StringBuilder sb6 = new StringBuilder();
                    String locality = address3.getLocality();
                    if (TextUtils.isEmpty(locality)) {
                        locality = address3.getAdminArea();
                    }
                    list = fromLocationName2;
                    String str5 = locality;
                    if (address4 != null && TextUtils.isEmpty(address4.getLocality())) {
                        address4.getAdminArea();
                    }
                    str = str4;
                    try {
                        String thoroughfare = address3.getThoroughfare();
                        location = location2;
                        if (TextUtils.isEmpty(thoroughfare)) {
                            list2 = fromLocationName;
                        } else {
                            list2 = fromLocationName;
                            try {
                                if (!TextUtils.equals(thoroughfare, address3.getAdminArea())) {
                                    if (sb6.length() > 0) {
                                        sb6.append(", ");
                                    }
                                    sb6.append(thoroughfare);
                                    z10 = false;
                                    if (TextUtils.isEmpty(str5)) {
                                        z11 = true;
                                    } else {
                                        if (sb5.length() > 0) {
                                            sb5.append(", ");
                                        }
                                        sb5.append(str5);
                                        if (sb6 != null) {
                                            if (sb6.length() > 0) {
                                                sb6.append(", ");
                                            }
                                            sb6.append(str5);
                                        }
                                        z11 = false;
                                    }
                                    StringBuilder sb7 = sb6;
                                    countryName = address3.getCountryName();
                                    if (TextUtils.isEmpty(countryName)) {
                                        z12 = z10;
                                        z13 = z11;
                                        address = address4;
                                    } else {
                                        z12 = z10;
                                        z13 = z11;
                                        if (!"US".equals(address3.getCountryCode()) && !"AE".equals(address3.getCountryCode()) && (!"GB".equals(address3.getCountryCode()) || !"en".equals(locale.getLanguage()))) {
                                            str2 = countryName;
                                            address = address4;
                                            if (sb5.length() > 0) {
                                                sb5.append(", ");
                                            }
                                            sb5.append(str2);
                                            if (sb4.length() > 0) {
                                                sb4.append(", ");
                                            }
                                            sb4.append(countryName);
                                        }
                                        String[] split = countryName.split(" ");
                                        int length = split.length;
                                        str2 = "";
                                        address = address4;
                                        int i14 = 0;
                                        while (i14 < length) {
                                            int i15 = length;
                                            String str6 = split[i14];
                                            if (str6.length() > 0) {
                                                i11 = i14;
                                                str2 = str2 + str6.charAt(0);
                                            } else {
                                                i11 = i14;
                                            }
                                            i14 = i11 + 1;
                                            length = i15;
                                        }
                                        if (sb5.length() > 0) {
                                        }
                                        sb5.append(str2);
                                        if (sb4.length() > 0) {
                                        }
                                        sb4.append(countryName);
                                    }
                                    if (cVar2.e) {
                                        StringBuilder sb8 = new StringBuilder();
                                        try {
                                            String addressLine = address3.getAddressLine(0);
                                            if (!TextUtils.isEmpty(addressLine)) {
                                                sb8.append(addressLine);
                                            }
                                        } catch (Exception unused) {
                                        }
                                        if (sb8.length() > 0) {
                                            TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                            TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                            tL_messageMediaVenue.geo = tL_geoPoint;
                                            tL_geoPoint.lat = latitude;
                                            tL_geoPoint._long = longitude;
                                            tL_messageMediaVenue.query_id = -1L;
                                            tL_messageMediaVenue.title = sb8.toString();
                                            tL_messageMediaVenue.icon = "pin";
                                            tL_messageMediaVenue.address = org.telegram.messenger.cd.L0(2131747618, null);
                                            arrayList.add(tL_messageMediaVenue);
                                        }
                                        cVar = cVar2;
                                    } else {
                                        if (sb7 == null || sb7.length() <= 0) {
                                            cVar = cVar2;
                                            sb2 = sb5;
                                            sb3 = sb4;
                                            address2 = address3;
                                        } else {
                                            TLRPC.TL_messageMediaVenue tL_messageMediaVenue2 = new TLRPC.TL_messageMediaVenue();
                                            cVar = cVar2;
                                            try {
                                                TLRPC.TL_geoPoint tL_geoPoint2 = new TLRPC.TL_geoPoint();
                                                tL_messageMediaVenue2.geo = tL_geoPoint2;
                                                tL_geoPoint2.lat = latitude;
                                                tL_geoPoint2._long = longitude;
                                                address2 = address3;
                                                tL_messageMediaVenue2.query_id = -1L;
                                                tL_messageMediaVenue2.title = sb7.toString();
                                                tL_messageMediaVenue2.icon = "pin";
                                                tL_messageMediaVenue2.address = z12 ? org.telegram.messenger.cd.L0(2131747611, null) : org.telegram.messenger.cd.L0(2131747476, null);
                                                if (address != null) {
                                                    TL_stories.TL_geoPointAddress tL_geoPointAddress = new TL_stories.TL_geoPointAddress();
                                                    tL_messageMediaVenue2.geoAddress = tL_geoPointAddress;
                                                    tL_geoPointAddress.country_iso2 = address.getCountryCode();
                                                    String locality2 = TextUtils.isEmpty(null) ? address.getLocality() : null;
                                                    if (TextUtils.isEmpty(locality2)) {
                                                        locality2 = address.getAdminArea();
                                                    }
                                                    if (TextUtils.isEmpty(locality2)) {
                                                        locality2 = address.getSubAdminArea();
                                                    }
                                                    String adminArea = address.getAdminArea();
                                                    StringBuilder sb9 = new StringBuilder();
                                                    if (TextUtils.isEmpty(adminArea)) {
                                                        sb3 = sb4;
                                                        sb2 = sb5;
                                                    } else {
                                                        sb3 = sb4;
                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress2 = tL_messageMediaVenue2.geoAddress;
                                                        tL_geoPointAddress2.state = adminArea;
                                                        sb2 = sb5;
                                                        tL_geoPointAddress2.flags |= 1;
                                                    }
                                                    if (!TextUtils.isEmpty(locality2)) {
                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress3 = tL_messageMediaVenue2.geoAddress;
                                                        tL_geoPointAddress3.city = locality2;
                                                        tL_geoPointAddress3.flags |= 2;
                                                    }
                                                    if (!z12) {
                                                        String thoroughfare2 = (!TextUtils.isEmpty(null) || TextUtils.equals(address.getThoroughfare(), str5) || TextUtils.equals(address.getThoroughfare(), address.getCountryName())) ? null : address.getThoroughfare();
                                                        if (TextUtils.isEmpty(thoroughfare2) && !TextUtils.equals(address.getSubLocality(), str5) && !TextUtils.equals(address.getSubLocality(), address.getCountryName())) {
                                                            thoroughfare2 = address.getSubLocality();
                                                        }
                                                        if (TextUtils.isEmpty(thoroughfare2) && !TextUtils.equals(address.getLocality(), str5) && !TextUtils.equals(address.getLocality(), address.getCountryName())) {
                                                            thoroughfare2 = address.getLocality();
                                                        }
                                                        if (TextUtils.isEmpty(thoroughfare2) || TextUtils.equals(thoroughfare2, adminArea) || TextUtils.equals(thoroughfare2, address.getCountryName())) {
                                                            sb9 = null;
                                                        } else {
                                                            if (sb9.length() > 0) {
                                                                sb9.append(", ");
                                                            }
                                                            sb9.append(thoroughfare2);
                                                        }
                                                        if (!TextUtils.isEmpty(sb9)) {
                                                            int i16 = 0;
                                                            while (true) {
                                                                String[] strArr = org.telegram.messenger.nd.P;
                                                                if (i16 >= 19) {
                                                                    break;
                                                                }
                                                                if (strArr[i16].equalsIgnoreCase(sb9.toString())) {
                                                                    z14 = true;
                                                                    break;
                                                                }
                                                                i16++;
                                                            }
                                                        }
                                                        z14 = false;
                                                        if (!TextUtils.isEmpty(sb9)) {
                                                            TL_stories.TL_geoPointAddress tL_geoPointAddress4 = tL_messageMediaVenue2.geoAddress;
                                                            tL_geoPointAddress4.flags |= 4;
                                                            tL_geoPointAddress4.street = sb9.toString();
                                                        }
                                                        if (!z14) {
                                                            arrayList.add(tL_messageMediaVenue2);
                                                            if (arrayList.size() >= i12) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    sb3 = sb4;
                                                    sb2 = sb5;
                                                }
                                                z14 = false;
                                                if (!z14) {
                                                }
                                            } catch (Exception unused2) {
                                            }
                                        }
                                        if (!z13 && !hashSet2.contains(sb2.toString())) {
                                            TLRPC.TL_messageMediaVenue tL_messageMediaVenue3 = new TLRPC.TL_messageMediaVenue();
                                            TLRPC.TL_geoPoint tL_geoPoint3 = new TLRPC.TL_geoPoint();
                                            tL_messageMediaVenue3.geo = tL_geoPoint3;
                                            tL_geoPoint3.lat = latitude;
                                            tL_geoPoint3._long = longitude;
                                            tL_messageMediaVenue3.query_id = -1L;
                                            tL_messageMediaVenue3.title = sb2.toString();
                                            tL_messageMediaVenue3.icon = "https://ss3.4sqi.net/img/categories_v2/travel/hotel_64.png";
                                            tL_messageMediaVenue3.emoji = org.telegram.messenger.nd.b(address2.getCountryCode());
                                            hashSet2.add(tL_messageMediaVenue3.title);
                                            tL_messageMediaVenue3.address = org.telegram.messenger.cd.L0(2131747611, null);
                                            if (address != null) {
                                                TL_stories.TL_geoPointAddress tL_geoPointAddress5 = new TL_stories.TL_geoPointAddress();
                                                tL_messageMediaVenue3.geoAddress = tL_geoPointAddress5;
                                                tL_geoPointAddress5.country_iso2 = address.getCountryCode();
                                                String locality3 = TextUtils.isEmpty(null) ? address.getLocality() : null;
                                                if (TextUtils.isEmpty(locality3)) {
                                                    locality3 = address.getAdminArea();
                                                }
                                                if (TextUtils.isEmpty(locality3)) {
                                                    locality3 = address.getSubAdminArea();
                                                }
                                                String adminArea2 = address.getAdminArea();
                                                if (!TextUtils.isEmpty(adminArea2)) {
                                                    TL_stories.TL_geoPointAddress tL_geoPointAddress6 = tL_messageMediaVenue3.geoAddress;
                                                    tL_geoPointAddress6.state = adminArea2;
                                                    tL_geoPointAddress6.flags |= 1;
                                                }
                                                if (!TextUtils.isEmpty(locality3)) {
                                                    TL_stories.TL_geoPointAddress tL_geoPointAddress7 = tL_messageMediaVenue3.geoAddress;
                                                    tL_geoPointAddress7.city = locality3;
                                                    tL_geoPointAddress7.flags |= 2;
                                                }
                                            }
                                            arrayList.add(tL_messageMediaVenue3);
                                            if (arrayList.size() >= i12) {
                                                break;
                                            }
                                        }
                                        if (sb3.length() > 0 && !hashSet.contains(sb3.toString())) {
                                            TLRPC.TL_messageMediaVenue tL_messageMediaVenue4 = new TLRPC.TL_messageMediaVenue();
                                            TLRPC.TL_geoPoint tL_geoPoint4 = new TLRPC.TL_geoPoint();
                                            tL_messageMediaVenue4.geo = tL_geoPoint4;
                                            tL_geoPoint4.lat = latitude;
                                            tL_geoPoint4._long = longitude;
                                            tL_messageMediaVenue4.query_id = -1L;
                                            tL_messageMediaVenue4.title = sb3.toString();
                                            tL_messageMediaVenue4.icon = "https://ss3.4sqi.net/img/categories_v2/building/government_capitolbuilding_64.png";
                                            tL_messageMediaVenue4.emoji = org.telegram.messenger.nd.b(address2.getCountryCode());
                                            hashSet.add(tL_messageMediaVenue4.title);
                                            tL_messageMediaVenue4.address = org.telegram.messenger.cd.L0(2131751754, null);
                                            if (address != null) {
                                                TL_stories.TL_geoPointAddress tL_geoPointAddress8 = new TL_stories.TL_geoPointAddress();
                                                tL_messageMediaVenue4.geoAddress = tL_geoPointAddress8;
                                                tL_geoPointAddress8.country_iso2 = address.getCountryCode();
                                            }
                                            arrayList.add(tL_messageMediaVenue4);
                                            if (arrayList.size() >= i12) {
                                                break;
                                            }
                                            i13 = i10 + 1;
                                            locale2 = locale;
                                            str4 = str;
                                            fromLocationName2 = list;
                                            fromLocationName = list2;
                                            location2 = location;
                                            cVar2 = cVar;
                                        }
                                    }
                                }
                            } catch (Exception unused3) {
                                cVar = cVar2;
                            }
                        }
                        String subLocality = address3.getSubLocality();
                        if (TextUtils.isEmpty(subLocality)) {
                            String locality4 = address3.getLocality();
                            if (TextUtils.isEmpty(locality4) || TextUtils.equals(locality4, str5)) {
                                z10 = true;
                                sb6 = null;
                                if (TextUtils.isEmpty(str5)) {
                                }
                                StringBuilder sb72 = sb6;
                                countryName = address3.getCountryName();
                                if (TextUtils.isEmpty(countryName)) {
                                }
                                if (cVar2.e) {
                                }
                            } else {
                                if (sb6.length() > 0) {
                                    sb6.append(", ");
                                }
                                sb6.append(locality4);
                            }
                        } else {
                            if (sb6.length() > 0) {
                                sb6.append(", ");
                            }
                            sb6.append(subLocality);
                        }
                        z10 = false;
                        if (TextUtils.isEmpty(str5)) {
                        }
                        StringBuilder sb722 = sb6;
                        countryName = address3.getCountryName();
                        if (TextUtils.isEmpty(countryName)) {
                        }
                        if (cVar2.e) {
                        }
                    } catch (Exception unused4) {
                        cVar = cVar2;
                    }
                } else {
                    locale = locale2;
                    list = fromLocationName2;
                    cVar = cVar2;
                    str = str4;
                    location = location2;
                    list2 = fromLocationName;
                    i10 = i13;
                }
                i13 = i10 + 1;
                locale2 = locale;
                str4 = str;
                fromLocationName2 = list;
                fromLocationName = list2;
                location2 = location;
                cVar2 = cVar;
            }
        } catch (Exception unused5) {
        }
        cVar = cVar2;
        str = str4;
        location = location2;
        org.telegram.messenger.i0.g3(new xh.p2(cVar, location, str, arrayList, 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:397:0x0c91, code lost:
    
        if (r10.creator == false) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0c8d, code lost:
    
        if ((r7 instanceof org.telegram.tgnet.TLRPC.TL_chatParticipantCreator) == false) goto L377;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        int i11;
        ArrayList arrayList3;
        TLRPC.ChatParticipants chatParticipants;
        boolean z10;
        String str2;
        xz0 xz0Var;
        xz0 xz0Var2;
        vh.d dVar;
        int i12;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        int i13 = 7;
        int i14 = 13;
        int i15 = 3;
        TLRPC.User user = null;
        int i16 = 1;
        final int i17 = 0;
        switch (this.a) {
            case 0:
                TLObject tLObject = (TLObject) this.b;
                String[] strArr = (String[]) this.c;
                final FrameLayout frameLayout = (FrameLayout) this.d;
                final org.telegram.ui.Components.p80 p80Var = (org.telegram.ui.Components.p80) this.e;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.f;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) this.h;
                if (tLObject instanceof TL_phone.exportedGroupCallInvite) {
                    final String str3 = ((TL_phone.exportedGroupCallInvite) tLObject).link;
                    strArr[0] = str3;
                    if (str3.startsWith("https://")) {
                        str3 = str3.substring(8);
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(220L);
                    final AtomicBoolean atomicBoolean = new AtomicBoolean();
                    duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.i8
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            float abs = (Math.abs(floatValue - 0.5f) / 5.0f) + 0.9f;
                            FrameLayout frameLayout2 = frameLayout;
                            frameLayout2.setScaleX(abs);
                            frameLayout2.setScaleY(abs);
                            if (floatValue >= 0.5f) {
                                AtomicBoolean atomicBoolean2 = atomicBoolean;
                                if (atomicBoolean2.get()) {
                                    return;
                                }
                                atomicBoolean2.set(true);
                                p80Var.setText(str3);
                            }
                        }
                    });
                    duration.addListener(new b9(atomicBoolean, p80Var, str3));
                    duration.start();
                    new org.telegram.ui.Components.cc(z2Var.E, p6Var).I(R.raw.linkbroken, org.telegram.messenger.cd.L0(2131749484, null), org.telegram.messenger.cd.L0(2131749485, null)).j();
                    break;
                }
                break;
            case 1:
                sb sbVar = (sb) this.b;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                ArrayList arrayList5 = (ArrayList) this.e;
                ArrayList arrayList6 = (ArrayList) this.f;
                ab abVar = (ab) this.h;
                TLRPC.Chat chat = sbVar.f;
                sbVar.Z = channelParticipant;
                if (channelParticipant != null) {
                    if (!(channelParticipant.peer instanceof TLRPC.TL_peerUser)) {
                        i10 = 33;
                        arrayList = arrayList5;
                    } else if (org.telegram.messenger.w3.T(chat)) {
                        org.telegram.messenger.vp messagesController = sbVar.getMessagesController();
                        long j10 = channelParticipant.peer.user_id;
                        i11 = 33;
                        arrayList3 = arrayList5;
                        a0.h hVar = (a0.h) messagesController.x1.f(chat.id);
                        TLRPC.ChannelParticipant channelParticipant2 = hVar == null ? null : (TLRPC.ChannelParticipant) hVar.f(j10);
                        if (channelParticipant2 != null && ((channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator) || channelParticipant2.admin_rights.manage_call)) {
                            i10 = 33;
                            arrayList = arrayList3;
                            break;
                        }
                        i10 = i11;
                        arrayList = arrayList3;
                    } else {
                        i11 = 33;
                        arrayList3 = arrayList5;
                        TLRPC.ChatFull M0 = sbVar.getMessagesController().M0(chat.id);
                        if (M0 != null && (chatParticipants = M0.participants) != null) {
                            int size = chatParticipants.participants.size();
                            while (i17 < size) {
                                TLRPC.ChatParticipant chatParticipant = M0.participants.participants.get(i17);
                                i10 = i11;
                                arrayList = arrayList3;
                                if (chatParticipant.user_id != channelParticipant.peer.user_id) {
                                    i17++;
                                    i11 = i10;
                                    arrayList3 = arrayList;
                                } else if (!(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                    break;
                                }
                            }
                        }
                        i10 = i11;
                        arrayList = arrayList3;
                    }
                    if (org.telegram.messenger.w3.x(chat, channelParticipant, 6) || org.telegram.messenger.w3.x(chat, channelParticipant, 7)) {
                        arrayList2 = arrayList;
                        str = null;
                        org.telegram.ui.Cells.f1.t(null, 2131746080, arrayList4, R.drawable.msg_block2, arrayList2);
                        arrayList6.add(Integer.valueOf(i10));
                    } else {
                        arrayList2 = arrayList;
                        str = null;
                    }
                    org.telegram.ui.Cells.f1.t(str, 2131753729, arrayList4, R.drawable.msg_block, arrayList2);
                    arrayList6.add(35);
                }
                abVar.run();
                break;
            case 2:
                un unVar = (un) this.c;
                gf.e eVar = (gf.e) this.d;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.e;
                String str4 = (String) this.f;
                TLObject tLObject2 = (TLObject) this.b;
                CharacterStyle characterStyle = (CharacterStyle) this.h;
                eVar.b();
                org.telegram.ui.Components.z60 I = org.telegram.ui.Components.z60.I(unVar, q1Var);
                org.telegram.ui.Components.nl0 nl0Var = new org.telegram.ui.Components.nl0(unVar.getParentActivity(), unVar.xa);
                I.p = new se(nl0Var, i17);
                I.c(R.drawable.msg_copy, org.telegram.messenger.cd.L0(2131751766, null), new we(unVar, nl0Var, str4, 2), false);
                if (tLObject2 instanceof TLRPC.TL_payments_bankCardData) {
                    TLRPC.TL_payments_bankCardData tL_payments_bankCardData = (TLRPC.TL_payments_bankCardData) tLObject2;
                    ArrayList<TLRPC.TL_bankCardOpenUrl> arrayList7 = tL_payments_bankCardData.open_urls;
                    int size2 = arrayList7.size();
                    int i18 = 0;
                    while (i18 < size2) {
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl = arrayList7.get(i18);
                        i18++;
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl2 = tL_bankCardOpenUrl;
                        I.c(R.drawable.msg_payment_card, tL_bankCardOpenUrl2.name, new zg(i17, unVar, tL_bankCardOpenUrl2), false);
                    }
                    if (!TextUtils.isEmpty(tL_payments_bankCardData.title)) {
                        I.k();
                        I.p(13, org.telegram.messenger.i0.L(200.0f), tL_payments_bankCardData.title);
                    }
                }
                nl0Var.e(I);
                nl0Var.f(q1Var, characterStyle, null, false);
                unVar.showDialog(nl0Var);
                break;
            case 3:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.p6 p6Var2 = (org.telegram.ui.ActionBar.p6) this.h;
                vh.d dVar2 = (vh.d) this.d;
                p6 p6Var3 = (p6) this.e;
                Runnable runnable = (Runnable) this.f;
                if (tL_error == null) {
                    dVar2.setLoading(false);
                    p6Var3.dismiss();
                    org.telegram.messenger.m5.n(null, 2131746968, new org.telegram.ui.Components.cc(org.telegram.ui.Components.ra.a(context), p6Var2), R.raw.chats_infotip, 36);
                    runnable.run();
                    break;
                } else {
                    new org.telegram.ui.Components.cc(org.telegram.ui.Components.ra.a(context), p6Var2).f0(tL_error, false);
                    break;
                }
            case 4:
                org.telegram.ui.Components.cx0 cx0Var = (org.telegram.ui.Components.cx0) this.c;
                TLObject tLObject3 = (TLObject) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                TextView textView = (TextView) this.e;
                TextView textView2 = (TextView) this.f;
                int[] iArr = (int[]) this.h;
                cx0Var.getClass();
                if (!(tLObject3 instanceof TLRPC.TL_stickers_suggestedShortName) || (str2 = ((TLRPC.TL_stickers_suggestedShortName) tLObject3).short_name) == null) {
                    z10 = false;
                } else {
                    editTextBoldCursor.setText(str2);
                    editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                    cx0Var.K0(textView, editTextBoldCursor.getText().toString(), true);
                    z10 = true;
                }
                textView2.setVisibility(0);
                editTextBoldCursor.setPadding(textView2.getMeasuredWidth(), org.telegram.messenger.i0.L(4.0f), 0, 0);
                if (!z10) {
                    editTextBoldCursor.setText("");
                }
                iArr[0] = 2;
                break;
            case 5:
                ll0.a0((ll0) this.c, (TLRPC.TL_error) this.d, (String) this.e, (bl0) this.f, (TLObject) this.b, (TL_account.sendVerifyPhoneCode) this.h);
                break;
            case 6:
                c01 c01Var = (c01) this.c;
                TLObject tLObject4 = (TLObject) this.b;
                CharSequence charSequence = (CharSequence) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                byte[] bArr = (byte[]) this.f;
                String str5 = (String) this.h;
                hk hkVar = c01Var.i1;
                if ((hkVar.getCurrentView() instanceof b01) && (dVar = ((b01) hkVar.getCurrentView()).s) != null) {
                    dVar.setLoading(false);
                }
                if (tLObject4 == null) {
                    if (tL_error2 != null) {
                        if (!c01Var.l1 && "MESSAGE_ID_REQUIRED".equals(tL_error2.text)) {
                            long j11 = c01Var.q1;
                            String charSequence2 = charSequence.toString();
                            int i19 = un.ad;
                            org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                            if (T != null) {
                                Bundle bundle = new Bundle();
                                if (org.telegram.messenger.o5.E(j11)) {
                                    bundle.putLong("user_id", j11);
                                } else {
                                    bundle.putLong("chat_id", -j11);
                                }
                                bundle.putString("reportTitle", charSequence2);
                                bundle.putByteArray("reportOption", bArr);
                                bundle.putString("reportMessage", str5);
                                T.presentFragment(new un(bundle));
                            }
                        } else if ("PREMIUM_ACCOUNT_REQUIRED".equals(tL_error2.text)) {
                            xz0 xz0Var3 = c01Var.r1;
                            if (xz0Var3 != null) {
                                xz0Var3.d();
                            }
                        } else if ("AD_EXPIRED".equals(tL_error2.text) && (xz0Var = c01Var.r1) != null) {
                            xz0Var.b();
                        }
                        c01Var.dismiss();
                        break;
                    }
                } else {
                    boolean z11 = tLObject4 instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption;
                    if (!z11 && !(tLObject4 instanceof TLRPC.TL_reportResultChooseOption) && !(tLObject4 instanceof TLRPC.TL_reportResultAddComment)) {
                        if (!(tLObject4 instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden)) {
                            if (((tLObject4 instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) || (tLObject4 instanceof TLRPC.TL_reportResultReported)) && (xz0Var2 = c01Var.r1) != null) {
                                xz0Var2.b();
                                c01Var.dismiss();
                                break;
                            }
                        } else {
                            org.telegram.messenger.vp.r1(c01Var.a).o0(false);
                            xz0 xz0Var4 = c01Var.r1;
                            if (xz0Var4 != null) {
                                xz0Var4.c();
                                c01Var.dismiss();
                                break;
                            }
                        }
                    } else {
                        hkVar.E(hkVar.b + 1);
                        b01 b01Var = (b01) hkVar.getViewPages()[1];
                        if (b01Var != null) {
                            org.telegram.ui.Components.u51 u51Var = b01Var.f;
                            if (tLObject4 instanceof TLRPC.TL_reportResultChooseOption) {
                                b01Var.b = null;
                                b01Var.c = (TLRPC.TL_reportResultChooseOption) tLObject4;
                                b01Var.d = null;
                                u51Var.f3.O(false);
                            } else if (tLObject4 instanceof TLRPC.TL_reportResultAddComment) {
                                b01Var.b((TLRPC.TL_reportResultAddComment) tLObject4);
                            } else if (z11) {
                                b01Var.b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject4;
                                b01Var.c = null;
                                b01Var.d = null;
                                u51Var.f3.O(false);
                            }
                            if (charSequence != null) {
                                jg.b1 b1Var = b01Var.h;
                                ((TextView) b1Var.c).setText(charSequence);
                                ((TextView) b1Var.c).getText();
                                b1Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.q.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(120.0f), TLObject.FLAG_31));
                                if (u51Var != null) {
                                    u51Var.f3.O(true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 7:
                TLObject tLObject5 = (TLObject) this.b;
                Context context2 = (Context) this.c;
                org.telegram.ui.ActionBar.p6 p6Var4 = (org.telegram.ui.ActionBar.p6) this.h;
                byte[] bArr2 = (byte[]) this.d;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.e;
                org.telegram.ui.Components.gi0 gi0Var = (org.telegram.ui.Components.gi0) this.f;
                c01 c01Var2 = new c01(context2, p6Var4, 0L, bArr2);
                c01Var2.N0((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject5);
                c01Var2.r1 = new ji.f(k2Var, context2, p6Var4, gi0Var, 11);
                c01Var2.show();
                break;
            case 8:
                final s31 s31Var = (s31) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.d;
                TLRPC.User user2 = (TLRPC.User) this.e;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
                TLRPC.TL_channels_editCreator tL_channels_editCreator = (TLRPC.TL_channels_editCreator) this.h;
                if (tL_error3 == null) {
                    if (inputCheckPasswordSRP != null) {
                        ag.d3 d3Var = s31Var.R1;
                        if (d3Var != null) {
                            d3Var.run();
                        }
                        s31Var.dismiss();
                        twoStepVerificationActivity.s0();
                        twoStepVerificationActivity.finishFragment();
                        break;
                    }
                } else if (s31Var.b2 != null) {
                    if (!"PASSWORD_HASH_INVALID".equals(tL_error3.text)) {
                        if (!"PASSWORD_MISSING".equals(tL_error3.text) && !tL_error3.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error3.text.startsWith("SESSION_TOO_FRESH_")) {
                            if (!"SRP_ID_INVALID".equals(tL_error3.text)) {
                                if (!tL_error3.text.equals("CHANNELS_TOO_MUCH")) {
                                    if (twoStepVerificationActivity != null) {
                                        twoStepVerificationActivity.s0();
                                        twoStepVerificationActivity.finishFragment();
                                    }
                                    org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                                    if (T2 != null) {
                                        org.telegram.ui.Components.s4.g0(tL_error3, T2, org.telegram.messenger.w3.V(s31Var.P1), org.telegram.messenger.w3.Y(s31Var.P1), tL_channels_editCreator);
                                        break;
                                    }
                                } else if (s31Var.b2 != null && !org.telegram.messenger.d20.i(org.telegram.messenger.c.a(s31Var.a).a).q()) {
                                    org.telegram.ui.ActionBar.k2 T3 = LaunchActivity.T();
                                    if (T3 != null) {
                                        new kg.q0(5, s31Var.a, s31Var.b2, T3, null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.ActionBar.k2 T4 = LaunchActivity.T();
                                    if (T4 != null) {
                                        s31Var.dismiss();
                                        T4.presentFragment(new ea1(1));
                                        break;
                                    }
                                }
                            } else {
                                ConnectionsManager.getInstance(s31Var.a).sendRequest(new TL_account.getPassword(), new vp0(s31Var, twoStepVerificationActivity, user2, i13), 8);
                                break;
                            }
                        } else {
                            if (twoStepVerificationActivity != null) {
                                twoStepVerificationActivity.s0();
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(s31Var.b2);
                            alertDialog$Builder.a.R = org.telegram.messenger.cd.L0(2131751298, null);
                            LinearLayout linearLayout = new LinearLayout(s31Var.b2);
                            linearLayout.setPadding(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(24.0f), 0);
                            linearLayout.setOrientation(1);
                            alertDialog$Builder.o(linearLayout);
                            TextView textView3 = new TextView(s31Var.b2);
                            int i20 = org.telegram.ui.ActionBar.t6.j5;
                            org.telegram.ui.ActionBar.a7.V(textView3, i20, null);
                            textView3.setTextSize(1, 16.0f);
                            textView3.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 48);
                            if (org.telegram.messenger.w3.V(s31Var.P1)) {
                                org.telegram.messenger.m5.q(null, null, 2131751284, new Object[]{org.telegram.messenger.h20.j(user2, true)}, textView3);
                            } else {
                                org.telegram.messenger.m5.q(null, null, 2131751302, new Object[]{org.telegram.messenger.h20.j(user2, true)}, textView3);
                            }
                            linearLayout.addView(textView3, w7.b6.o(-1, -2));
                            LinearLayout linearLayout2 = new LinearLayout(s31Var.b2);
                            linearLayout2.setOrientation(0);
                            linearLayout.addView(linearLayout2, w7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                            ImageView imageView = new ImageView(s31Var.b2);
                            imageView.setImageResource(R.drawable.list_circle);
                            imageView.setPadding(org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(11.0f) : 0, org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.cd.X ? 0 : org.telegram.messenger.i0.L(11.0f), 0);
                            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                            org.telegram.ui.ActionBar.a7.t(imageView, i20, null, mode);
                            TextView textView4 = new TextView(s31Var.b2);
                            org.telegram.ui.ActionBar.a7.V(textView4, i20, null);
                            textView4.setTextSize(1, 16.0f);
                            textView4.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 48);
                            textView4.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131751301, null)));
                            if (org.telegram.messenger.cd.X) {
                                linearLayout2.addView(textView4, w7.b6.o(-1, -2));
                                linearLayout2.addView(imageView, w7.b6.r(-2, -2, 5));
                            } else {
                                linearLayout2.addView(imageView, w7.b6.o(-2, -2));
                                linearLayout2.addView(textView4, w7.b6.o(-1, -2));
                            }
                            LinearLayout linearLayout3 = new LinearLayout(s31Var.b2);
                            linearLayout3.setOrientation(0);
                            linearLayout.addView(linearLayout3, w7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                            ImageView imageView2 = new ImageView(s31Var.b2);
                            imageView2.setImageResource(R.drawable.list_circle);
                            imageView2.setPadding(org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(11.0f) : 0, org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.cd.X ? 0 : org.telegram.messenger.i0.L(11.0f), 0);
                            org.telegram.ui.ActionBar.a7.t(imageView2, i20, null, mode);
                            TextView textView5 = new TextView(s31Var.b2);
                            org.telegram.ui.ActionBar.a7.V(textView5, i20, null);
                            textView5.setTextSize(1, 16.0f);
                            textView5.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 48);
                            textView5.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131751300, null)));
                            if (org.telegram.messenger.cd.X) {
                                linearLayout3.addView(textView5, w7.b6.o(-1, -2));
                                i12 = 5;
                                linearLayout3.addView(imageView2, w7.b6.r(-2, -2, 5));
                            } else {
                                i12 = 5;
                                linearLayout3.addView(imageView2, w7.b6.o(-2, -2));
                                linearLayout3.addView(textView5, w7.b6.o(-1, -2));
                            }
                            if ("PASSWORD_MISSING".equals(tL_error3.text)) {
                                final int i21 = 1;
                                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751292, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.j31
                                    @Override // org.telegram.ui.ActionBar.u1
                                    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i22) {
                                        switch (i21) {
                                            case 0:
                                                s31Var.Z1.setLoading(false);
                                                break;
                                            case 1:
                                                s31 s31Var2 = s31Var;
                                                s31Var2.getClass();
                                                org.telegram.ui.ActionBar.k2 T5 = LaunchActivity.T();
                                                if (T5 != null) {
                                                    s31Var2.dismiss();
                                                    T5.presentFragment(new tc1(6, null));
                                                    break;
                                                }
                                                break;
                                            case 2:
                                                s31Var.Z1.setLoading(false);
                                                break;
                                            default:
                                                s31Var.Z1.setLoading(false);
                                                break;
                                        }
                                    }
                                });
                                final int i22 = 2;
                                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.j31
                                    @Override // org.telegram.ui.ActionBar.u1
                                    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i222) {
                                        switch (i22) {
                                            case 0:
                                                s31Var.Z1.setLoading(false);
                                                break;
                                            case 1:
                                                s31 s31Var2 = s31Var;
                                                s31Var2.getClass();
                                                org.telegram.ui.ActionBar.k2 T5 = LaunchActivity.T();
                                                if (T5 != null) {
                                                    s31Var2.dismiss();
                                                    T5.presentFragment(new tc1(6, null));
                                                    break;
                                                }
                                                break;
                                            case 2:
                                                s31Var.Z1.setLoading(false);
                                                break;
                                            default:
                                                s31Var.Z1.setLoading(false);
                                                break;
                                        }
                                    }
                                });
                            } else {
                                TextView textView6 = new TextView(s31Var.b2);
                                org.telegram.ui.ActionBar.a7.V(textView6, i20, null);
                                textView6.setTextSize(1, 16.0f);
                                if (!org.telegram.messenger.cd.X) {
                                    i12 = 3;
                                }
                                org.telegram.messenger.m5.l(textView6, i12 | 48, null, 2131751299);
                                linearLayout.addView(textView6, w7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                final int i23 = 3;
                                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131747847, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.j31
                                    @Override // org.telegram.ui.ActionBar.u1
                                    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i222) {
                                        switch (i23) {
                                            case 0:
                                                s31Var.Z1.setLoading(false);
                                                break;
                                            case 1:
                                                s31 s31Var2 = s31Var;
                                                s31Var2.getClass();
                                                org.telegram.ui.ActionBar.k2 T5 = LaunchActivity.T();
                                                if (T5 != null) {
                                                    s31Var2.dismiss();
                                                    T5.presentFragment(new tc1(6, null));
                                                    break;
                                                }
                                                break;
                                            case 2:
                                                s31Var.Z1.setLoading(false);
                                                break;
                                            default:
                                                s31Var.Z1.setLoading(false);
                                                break;
                                        }
                                    }
                                });
                            }
                            alertDialog$Builder.p();
                            break;
                        }
                    } else if (inputCheckPasswordSRP == null) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(s31Var.b2);
                        alertDialog$Builder2.a.R = org.telegram.messenger.cd.L0(org.telegram.messenger.w3.V(s31Var.P1) ? 2131751323 : 2131751316, null);
                        alertDialog$Builder2.a.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131751293, s31Var.P1.title, org.telegram.messenger.h20.j(user2, true)));
                        alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131751297, null), new ep0(i14, s31Var, user2));
                        alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.j31
                            @Override // org.telegram.ui.ActionBar.u1
                            public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i222) {
                                switch (i17) {
                                    case 0:
                                        s31Var.Z1.setLoading(false);
                                        break;
                                    case 1:
                                        s31 s31Var2 = s31Var;
                                        s31Var2.getClass();
                                        org.telegram.ui.ActionBar.k2 T5 = LaunchActivity.T();
                                        if (T5 != null) {
                                            s31Var2.dismiss();
                                            T5.presentFragment(new tc1(6, null));
                                            break;
                                        }
                                        break;
                                    case 2:
                                        s31Var.Z1.setLoading(false);
                                        break;
                                    default:
                                        s31Var.Z1.setLoading(false);
                                        break;
                                }
                            }
                        });
                        alertDialog$Builder2.p();
                        break;
                    }
                }
                break;
            case 9:
                org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) this.b;
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) this.c;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.d;
                f11 f11Var = (f11) this.e;
                JSONObject jSONObject = (JSONObject) this.f;
                String str6 = (String) this.h;
                if (e2Var.A(a2Var) && !e2Var.j(a2Var)) {
                    e2Var.y(a2Var, h0Var, jSONObject, jSONObject == null ? 0 : -1, str6, f11Var);
                    break;
                } else {
                    e2Var.y(a2Var, h0Var, null, 0, "Request expired or wallet changed", f11Var);
                    break;
                }
                break;
            case 10:
                org.telegram.ui.Wallet.e2 e2Var2 = (org.telegram.ui.Wallet.e2) this.b;
                String str7 = (String) this.c;
                byte[] bArr3 = (byte[]) this.d;
                f11 f11Var2 = (f11) this.e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.f;
                org.telegram.ui.Wallet.b2 b2Var = (org.telegram.ui.Wallet.b2) this.h;
                org.telegram.ui.Wallet.k0 k0Var = e2Var2.b;
                if (!TextUtils.equals(str7, k0Var.t()) || !Arrays.equals(bArr3, k0Var.y())) {
                    f11Var2.a("Wallet or TON Connect session changed. Open the request again.");
                    break;
                } else {
                    TL_wallet.tonConnectCloseSession tonconnectclosesession = new TL_wallet.tonConnectCloseSession();
                    tonconnectclosesession.session_id = tonconnectsession.id;
                    tonconnectclosesession.body = b2Var.c;
                    e2Var2.f.sendRequestTyped(tonconnectclosesession, new a3.b(i16), new org.telegram.ui.Wallet.d(f11Var2, i15));
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Wallet.e2 e2Var3 = (org.telegram.ui.Wallet.e2) this.b;
                String str8 = (String) this.c;
                byte[] bArr4 = (byte[]) this.d;
                org.telegram.ui.Wallet.b2 b2Var2 = (org.telegram.ui.Wallet.b2) this.e;
                byte[] bArr5 = b2Var2.b;
                ih.s sVar = (ih.s) this.f;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.h;
                org.telegram.ui.Wallet.k0 k0Var2 = e2Var3.b;
                if (!TextUtils.equals(str8, k0Var2.t()) || !Arrays.equals(bArr4, k0Var2.y())) {
                    Arrays.fill(bArr5, (byte) 0);
                    sVar.a(null, "Wallet changed. Open the request again.");
                    break;
                } else {
                    TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = new TL_wallet.inputTonConnectOauthSession();
                    inputtonconnectoauthsession.session_id = tonconnectsession2.id;
                    inputtonconnectoauthsession.challenge_answer = bArr5;
                    inputtonconnectoauthsession.body = b2Var2.c;
                    inputtonconnectoauthsession.proof = b2Var2.d;
                    sVar.a(inputtonconnectoauthsession, null);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Wallet.e2 e2Var4 = (org.telegram.ui.Wallet.e2) this.b;
                String str9 = (String) this.c;
                org.telegram.messenger.q20 q20Var = (org.telegram.messenger.q20) this.d;
                org.telegram.ui.Wallet.a2 a2Var2 = (org.telegram.ui.Wallet.a2) this.e;
                org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) this.f;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.h;
                if (str9 == null) {
                    if (e2Var4.A(a2Var2) && !e2Var4.j(a2Var2)) {
                        e2Var4.f.sendRequestTyped(sendtransfer, new a3.b(i16), new af(e2Var4, q20Var, a2Var2, h0Var2, sendtransfer, 5));
                        break;
                    } else {
                        q20Var.a("Request expired or wallet changed");
                        break;
                    }
                } else {
                    q20Var.a(str9);
                    break;
                }
            case 13:
                org.telegram.ui.Wallet.t2 t2Var = (org.telegram.ui.Wallet.t2) this.b;
                int[] iArr2 = (int[]) this.c;
                TextView textView7 = (TextView) this.d;
                org.telegram.ui.Wallet.k7 k7Var = (org.telegram.ui.Wallet.k7) this.e;
                org.telegram.ui.Wallet.k0 k0Var3 = (org.telegram.ui.Wallet.k0) this.f;
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.h;
                if (!t2Var.e && !t2Var.d) {
                    iArr2[0] = 0;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.u80(org.telegram.messenger.i0.L(80.0f), textView7), 0, spannableStringBuilder.length(), 33);
                    textView7.setText(org.telegram.messenger.cd.V(null, null, 2131743146, spannableStringBuilder));
                    k7Var.run();
                    WalletEngine2 walletEngine2 = k0Var3.b;
                    if (walletEngine2 != null) {
                        walletEngine2.previewTonConnect(d2Var, new org.telegram.ui.Wallet.e1(t2Var, iArr2, k0Var3, textView7, d2Var, k7Var, 4));
                        break;
                    } else {
                        iArr2[0] = 3;
                        textView7.setText(org.telegram.messenger.cd.L0(2131743012, null));
                        k7Var.run();
                        break;
                    }
                }
                break;
            case 14:
                ((WalletEngine2) this.b).lambda$prepareSendNFT$26((String) this.c, (String) this.d, (String) this.e, (byte[]) this.f, (org.telegram.messenger.j20) this.h);
                break;
            case 15:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.c;
                TLObject tLObject6 = (TLObject) this.b;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.d;
                String str10 = (String) this.e;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.f;
                String str11 = (String) this.h;
                org.telegram.ui.ActionBar.p6 p6Var5 = z0Var.e;
                if (tLObject6 == null) {
                    if (tL_error4 != null) {
                        if (!"URL_EXPIRED".equalsIgnoreCase(tL_error4.text)) {
                            new org.telegram.ui.Components.cc(z0Var, p6Var5).f0(tL_error4, false);
                            break;
                        } else {
                            new org.telegram.ui.Components.cc(z0Var, p6Var5).I(R.raw.error, org.telegram.messenger.cd.L0(2131753128, null), org.telegram.messenger.i0.O2(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.uj, p6Var5), org.telegram.messenger.cd.a0(null, null, 2131753130, str11))).j();
                            break;
                        }
                    }
                } else if (!(tLObject6 instanceof TLRPC.TL_urlAuthResultRequest)) {
                    if (!(tLObject6 instanceof TLRPC.TL_urlAuthResultAccepted)) {
                        if (tLObject6 instanceof TLRPC.TL_urlAuthResultDefault) {
                            org.telegram.ui.Components.s4.o0(z0Var.getContext(), str10, false, true, true, false, 0L, null, null, null);
                            break;
                        }
                    } else {
                        jj0.b(false, z0Var.M, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject6, null, null, null, false, z0Var);
                        break;
                    }
                } else {
                    jj0.b(false, z0Var.M, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject6, null, null, null, false, z0Var);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.web.z0 z0Var2 = (org.telegram.ui.web.z0) this.b;
                File file = (File) this.c;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.d;
                String str12 = (String) this.e;
                String str13 = (String) this.f;
                String str14 = (String) this.h;
                if (file != null) {
                    int[] iArr3 = new int[11];
                    Utilities.e.c(new org.telegram.ui.Components.u41(file, iArr3, new mg.c0(z0Var2, iArr3, file, x1Var, str12, str13, str14, 13), 4));
                    break;
                } else {
                    x1Var.c(500L);
                    break;
                }
            case 17:
                final ph.l1 l1Var = (ph.l1) this.c;
                org.telegram.ui.ActionBar.x1 x1Var2 = (org.telegram.ui.ActionBar.x1) this.d;
                TLObject tLObject7 = (TLObject) this.b;
                i2.g1 g1Var = (i2.g1) this.e;
                final org.telegram.messenger.q20 q20Var2 = (org.telegram.messenger.q20) this.f;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.h;
                x1Var2.dismiss();
                if (!(tLObject7 instanceof TL_stars.checkCanSendGiftResultOk)) {
                    if (!(tLObject7 instanceof TL_stars.checkCanSendGiftResultFail)) {
                        if (tL_error5 != null) {
                            new org.telegram.ui.Components.cc(l1Var.c, l1Var.I0).f0(tL_error5, false);
                            break;
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, l1Var.getContext(), l1Var.I0);
                        alertDialog$Builder3.a.R = org.telegram.messenger.cd.L0(2131749761, null);
                        alertDialog$Builder3.a.T = org.telegram.messenger.jj.h0(((TL_stars.checkCanSendGiftResultFail) tLObject7).reason, false);
                        alertDialog$Builder3.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                        final org.telegram.ui.ActionBar.x1 p5 = alertDialog$Builder3.p();
                        final org.telegram.ui.Components.xt xtVar = p5.n;
                        if (xtVar != null) {
                            xtVar.setOnLinkPressListener(new org.telegram.ui.Components.o80() { // from class: ph.r0
                                @Override // org.telegram.ui.Components.o80
                                public final void a(ClickableSpan clickableSpan) {
                                    l1 l1Var2 = l1.this;
                                    l1Var2.getClass();
                                    p5.dismiss();
                                    q20 q20Var3 = q20Var2;
                                    if (q20Var3 != null) {
                                        q20Var3.a(Boolean.FALSE);
                                    }
                                    l1Var2.dismiss();
                                    clickableSpan.onClick(xtVar);
                                }
                            });
                            break;
                        }
                    }
                } else {
                    g1Var.run();
                    break;
                }
                break;
            case 18:
                rh.e4 e4Var = (rh.e4) this.c;
                TLObject tLObject8 = (TLObject) this.b;
                mg.i2[] i2VarArr = (mg.i2[]) this.d;
                Long l4 = (Long) this.e;
                org.telegram.ui.Components.u41 u41Var = (org.telegram.ui.Components.u41) this.f;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.h;
                if (!(tLObject8 instanceof TLRPC.TL_users_userFull)) {
                    org.telegram.ui.Components.wb Y = e4Var.k().Y(tL_error6);
                    Y.t = true;
                    Y.j();
                    break;
                } else {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject8;
                    org.telegram.messenger.vp.r1(e4Var.a).V3(tL_users_userFull.users, false);
                    org.telegram.messenger.vp.r1(e4Var.a).P3(tL_users_userFull.chats, false);
                    TLRPC.UserFull userFull = tL_users_userFull.full_user;
                    if (userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                        org.telegram.messenger.z20.s(org.telegram.messenger.cd.a0(null, null, 2131743768, org.telegram.messenger.o5.t(l4.longValue())), new org.telegram.ui.Components.cc(i2VarArr[0].c, e4Var.I0), R.raw.error, 36);
                        break;
                    } else {
                        u41Var.run();
                        break;
                    }
                }
                break;
            case 19:
                rh.e4 e4Var2 = (rh.e4) this.c;
                TLObject tLObject9 = (TLObject) this.b;
                CharSequence charSequence3 = (CharSequence) this.d;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.e;
                TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.f;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.h;
                if (!(tLObject9 instanceof TLRPC.PaymentForm)) {
                    if (tL_error7 != null) {
                        e4Var2.k().f0(tL_error7, false);
                        break;
                    }
                } else {
                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject9;
                    ArrayList<TLRPC.TL_labeledPrice> arrayList8 = paymentForm.invoice.prices;
                    int size3 = arrayList8.size();
                    long j12 = 0;
                    int i24 = 0;
                    while (i24 < size3) {
                        TLRPC.TL_labeledPrice tL_labeledPrice = arrayList8.get(i24);
                        i24++;
                        j12 += tL_labeledPrice.amount;
                    }
                    LinearLayout linearLayout4 = new LinearLayout(e4Var2.getContext());
                    linearLayout4.setOrientation(1);
                    linearLayout4.setPadding(org.telegram.messenger.i0.L(23.0f), 0, org.telegram.messenger.i0.L(23.0f), 0);
                    TextView b10 = w7.g6.b(e4Var2.getContext(), 16.0f, org.telegram.ui.ActionBar.t6.j5, false, null);
                    b10.setText(org.telegram.messenger.cd.L0(2131750050, null));
                    linearLayout4.addView(b10, w7.b6.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
                    org.telegram.ui.Components.wy0 wy0Var = new org.telegram.ui.Components.wy0(e4Var2.getContext(), e4Var2.I0);
                    org.telegram.ui.Components.uy0 a2 = wy0Var.a(charSequence3);
                    a2.setFilled(true);
                    nh.p pVar = (nh.p) a2.getChildAt(0);
                    pVar.setTextSize(1, 12.0f);
                    pVar.setGravity(17);
                    linearLayout4.addView(wy0Var, w7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, e4Var2.getContext(), e4Var2.I0);
                    alertDialog$Builder4.a.R = org.telegram.messenger.cd.L0(2131750049, null);
                    alertDialog$Builder4.o(linearLayout4);
                    alertDialog$Builder4.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                    alertDialog$Builder4.k(rh.h8.S0(org.telegram.messenger.cd.a0(null, null, 2131750051, Integer.valueOf((int) j12))), new org.telegram.ui.Components.y11(e4Var2, tL_starGiftUnique, paymentForm, tL_inputInvoiceStarGiftDropOriginalDetails, j12, charSequence3));
                    alertDialog$Builder4.p();
                    break;
                }
                break;
            case 20:
                rh.e6 e6Var = (rh.e6) this.b;
                List list = (List) this.c;
                ih.s sVar2 = (ih.s) this.d;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.e;
                c5.g gVar = (c5.g) this.f;
                Activity activity = (Activity) this.h;
                if (!list.isEmpty()) {
                    c5.m mVar = (c5.m) list.get(0);
                    if (mVar.a() != null) {
                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGiveaway;
                        ConnectionsManager.getInstance(e6Var.a).sendRequest(tL_payments_canPurchaseStore, new mg.e0(mVar, gVar, (org.telegram.messenger.j20) sVar2, activity, (TLRPC.InputStorePaymentPurpose) tL_inputStorePaymentStarsGiveaway, list, 3));
                        break;
                    } else {
                        org.telegram.messenger.i0.g3(new rh.p4(sVar2, i16));
                        break;
                    }
                } else {
                    org.telegram.messenger.i0.g3(new rh.p4(sVar2, i17));
                    break;
                }
            case 21:
                rh.e6 e6Var2 = (rh.e6) this.b;
                boolean[] zArr = (boolean[]) this.c;
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) this.d;
                TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) this.e;
                TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) this.f;
                org.telegram.messenger.q20 q20Var3 = (org.telegram.messenger.q20) this.h;
                zArr[0] = true;
                e6Var2.Z(jjVar, inputInvoice, tL_payments_paymentFormStars, new rh.e1(q20Var3, 1));
                break;
            case 22:
                rh.e6 e6Var3 = (rh.e6) this.c;
                TLObject tLObject10 = (TLObject) this.b;
                org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) this.d;
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = (TLRPC.TL_inputInvoiceMessage) this.e;
                rh rhVar = (rh) this.f;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.h;
                if (tLObject10 instanceof TLRPC.TL_payments_paymentFormStars) {
                    e6Var3.X(jjVar2, tL_inputInvoiceMessage, (TLRPC.TL_payments_paymentFormStars) tLObject10, rhVar, null);
                } else {
                    rh.e6.e(tL_error8 == null ? "NO_PAYMENT_FORM" : tL_error8.text);
                }
                rhVar.run();
                break;
            case 23:
                a();
                break;
            case 24:
                b();
                break;
            case 25:
                c();
                break;
            case 26:
                d();
                break;
            case 27:
                f();
                break;
            default:
                zf.p0 p0Var = (zf.p0) this.c;
                String str15 = (String) this.d;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.e;
                TLObject tLObject11 = (TLObject) this.b;
                org.telegram.messenger.vp vpVar = (org.telegram.messenger.vp) this.f;
                org.telegram.messenger.hs hsVar = (org.telegram.messenger.hs) this.h;
                zf.x0 x0Var = p0Var.e;
                String str16 = x0Var.q0;
                if (str16 != null && str16.equals(str15)) {
                    if (tL_error9 == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject11;
                        if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                            TLRPC.User user3 = tL_contacts_resolvedPeer.users.get(0);
                            vpVar.U3(user3, false, false);
                            hsVar.m1(tL_contacts_resolvedPeer.users, null, true, true);
                            user = user3;
                        }
                    }
                    x0Var.R(user);
                    x0Var.t0 = 0;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ v8(Object obj, TLObject tLObject, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = tLObject;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
    }

    public /* synthetic */ v8(TLObject tLObject, Context context, org.telegram.ui.ActionBar.p6 p6Var, Object obj, Object obj2, Runnable runnable, int i10) {
        this.a = i10;
        this.b = tLObject;
        this.c = context;
        this.h = p6Var;
        this.d = obj;
        this.e = obj2;
        this.f = runnable;
    }

    public /* synthetic */ v8(org.telegram.ui.ActionBar.k2 k2Var, Object obj, Object obj2, Object obj3, TLObject tLObject, Object obj4, int i10) {
        this.a = i10;
        this.c = k2Var;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = tLObject;
        this.h = obj4;
    }

    public /* synthetic */ v8(ph.l1 l1Var, org.telegram.ui.ActionBar.x1 x1Var, TLObject tLObject, i2.g1 g1Var, org.telegram.messenger.q20 q20Var, TLRPC.TL_error tL_error) {
        this.a = 17;
        this.c = l1Var;
        this.d = x1Var;
        this.b = tLObject;
        this.e = g1Var;
        this.f = q20Var;
        this.h = tL_error;
    }

    public /* synthetic */ v8(zf.p0 p0Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, org.telegram.messenger.vp vpVar, org.telegram.messenger.hs hsVar) {
        this.a = 28;
        this.c = p0Var;
        this.d = str;
        this.e = tL_error;
        this.b = tLObject;
        this.f = vpVar;
        this.h = hsVar;
    }
}
