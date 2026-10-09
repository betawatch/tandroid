package qb;

import android.graphics.Paint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaDrmException;
import android.os.Bundle;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.util.Log;
import ci.u5;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import ei.l4;
import j$.util.DesugarCollections;
import java.nio.ShortBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executors;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.dm;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.ib;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.vb;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.xb;
import org.telegram.ui.qv0;
import org.xml.sax.Attributes;
import r2.v;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public class b implements bg.a, cg.a, df.b, fb.n, wi, n5.b, n2.q, q9.d, wb, l1, v, u9.a, SuccessContinuation, z3.k {
    public static b b;
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    public static Calendar I3() {
        if (b == null) {
            b = new b(26);
        }
        b.getClass();
        return Calendar.getInstance();
    }

    public static yf.k J3(Editable editable, int i10) {
        yf.k[] kVarArr = (yf.k[]) editable.getSpans(0, editable.length(), yf.k.class);
        if (kVarArr.length == 0) {
            return null;
        }
        for (int length = kVarArr.length; length > 0; length--) {
            int i11 = length - 1;
            if (editable.getSpanFlags(kVarArr[i11]) == 17) {
                yf.k kVar = kVarArr[i11];
                if (kVar.a == i10) {
                    return kVar;
                }
            }
        }
        return null;
    }

    public static boolean K3(boolean z10, String str, Editable editable, Attributes attributes) {
        int i10;
        boolean z11 = false;
        Object obj = null;
        if (str.startsWith("animated-emoji")) {
            if (z10) {
                String a2 = yf.j.a("data-document-id", attributes);
                if (a2 != null) {
                    editable.setSpan(new b6(Long.parseLong(a2), (Paint.FontMetricsInt) null), editable.length(), editable.length(), 17);
                    return true;
                }
            } else {
                Object[] spans = editable.getSpans(0, editable.length(), b6.class);
                if (spans.length != 0) {
                    int length = spans.length;
                    while (true) {
                        if (length <= 0) {
                            break;
                        }
                        int i11 = length - 1;
                        if (editable.getSpanFlags(spans[i11]) == 17) {
                            obj = spans[i11];
                            break;
                        }
                        length--;
                    }
                }
                Object obj2 = (b6) obj;
                if (obj2 != null) {
                    int spanStart = editable.getSpanStart(obj2);
                    editable.removeSpan(obj2);
                    if (spanStart != editable.length()) {
                        editable.setSpan(obj2, spanStart, editable.length(), 33);
                        return true;
                    }
                    return true;
                }
            }
            return false;
        }
        if (str.equals("spoiler")) {
            if (z10) {
                editable.setSpan(new yf.k(0), editable.length(), editable.length(), 17);
                return true;
            }
            Object J3 = J3(editable, 0);
            if (J3 != null) {
                int spanStart2 = editable.getSpanStart(J3);
                editable.removeSpan(J3);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(J3, spanStart2, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        }
        if (str.equals("pre")) {
            if (z10) {
                String a10 = yf.j.a("language", attributes);
                if (a10 == null) {
                    a10 = yf.j.a("lang", attributes);
                }
                if (a10 == null) {
                    a10 = yf.j.a("lng", attributes);
                }
                editable.setSpan(new yf.k(a10), editable.length(), editable.length(), 17);
                return true;
            }
            Object J32 = J3(editable, 1);
            if (J32 != null) {
                int spanStart3 = editable.getSpanStart(J32);
                editable.removeSpan(J32);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(J32, spanStart3, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        }
        if (!str.equals("blockquote")) {
            if (str.equals("details")) {
                if (z10) {
                    editable.setSpan(new yf.k(3), editable.length(), editable.length(), 17);
                    return true;
                }
                Object J33 = J3(editable, 3);
                if (J33 != null) {
                    int spanStart4 = editable.getSpanStart(J33);
                    editable.removeSpan(J33);
                    if (spanStart4 != editable.length()) {
                        editable.setSpan(J33, spanStart4, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }
        if (z10) {
            String a11 = yf.j.a("class", attributes);
            if (yf.j.a("data-collapsed", attributes) != null || (a11 != null && a11.contains("telegram-collapsed-quote"))) {
                z11 = true;
            }
            editable.setSpan(new yf.k(z11 ? 3 : 2), editable.length(), editable.length(), 17);
            return true;
        }
        yf.k[] kVarArr = (yf.k[]) editable.getSpans(0, editable.length(), yf.k.class);
        for (int length2 = kVarArr.length - 1; length2 >= 0; length2--) {
            yf.k kVar = kVarArr[length2];
            if (editable.getSpanFlags(kVar) == 17 && ((i10 = kVar.a) == 2 || i10 == 3)) {
                obj = kVar;
                break;
            }
        }
        if (obj != null) {
            int spanStart5 = editable.getSpanStart(obj);
            editable.removeSpan(obj);
            if (spanStart5 != editable.length()) {
                editable.setSpan(obj, spanStart5, editable.length(), 33);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(u1 u1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A1(u1 u1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean A2(int i10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // n2.q
    public byte[] C(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C0(u1 u1Var, float f7, float f10, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C2() {
        int i10 = this.a;
    }

    @Override // r2.v
    public boolean D(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean D0(MessageObject messageObject) {
        switch (this.a) {
        }
        return true;
    }

    @Override // z3.k
    public boolean D1(b2.s sVar) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D2(u1 u1Var, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void E0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ p9 E2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // r2.v
    public int F() {
        return MediaCodecList.getCodecCount();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F0() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G0(u1 u1Var, TLObject tLObject, boolean z10) {
        int i10 = this.a;
    }

    @Override // n2.q
    public void H(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H0(u1 u1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean H1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.a;
    }

    @Override // n2.q
    public n2.o J(byte[] bArr, List list, int i10, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.l1
    public void J0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J1(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // n2.q
    public int K() {
        return 1;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K1(u1 u1Var, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M(int i10, u1 u1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean M1(u1 u1Var, TLRPC.Chat chat) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    public boolean N3(CharSequence charSequence) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean O1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // u9.a
    public void P(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Q1(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R(u1 u1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R0(long j3) {
        switch (this.a) {
        }
        return false;
    }

    @Override // bg.a
    public int R1(int i10, int i11, int i12) {
        return (i10 / i11) * i12;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S1(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.a;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.Cells.l1
    public void T1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.a) {
        }
        of.f.s(u1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // z3.k
    public int U0(b2.s sVar) {
        return 1;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle U1(u1 u1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void V0(int i10, u1 u1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void V1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int W() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean W1(u1 u1Var, MessageObject messageObject) {
        switch (this.a) {
        }
        return false;
    }

    @Override // r2.v
    public boolean X() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ hh.a Y() {
        switch (this.a) {
        }
        return null;
    }

    @Override // bg.a
    public void Y0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("Output must be 2 or 1 channels");
        }
        int min = Math.min(shortBuffer.remaining() / i10, shortBuffer2.remaining() / i11);
        for (int i12 = 0; i12 < min; i12++) {
            short s10 = shortBuffer.get();
            short s11 = shortBuffer.get();
            shortBuffer.position(shortBuffer.position() + 4);
            if (i11 == 2) {
                shortBuffer2.put(s10);
                shortBuffer2.put(s11);
            } else if (i11 == 1) {
                shortBuffer2.put(na.d.v3(s10, s11));
            }
        }
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ boolean Y1() {
        return false;
    }

    @Override // n2.q
    public boolean Z(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.a;
    }

    @Override // r2.v
    public MediaCodecInfo a(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void a2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.a;
    }

    @Override // n2.q
    public Map b(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b0(u1 u1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void b1(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b2(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.a) {
        }
        return false;
    }

    @Override // df.b
    public df.a c(b5 b5Var) {
        return new ze.h(b5Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c1(u1 u1Var, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.wb
    public void d(xb xbVar, ib ibVar, gb gbVar, jb jbVar) {
        o1.k kVar = new o1.k(xbVar, xb.IN_OUT_OFFSET_Y, xbVar.getHeight());
        kVar.u.a(0.8f);
        kVar.u.b(400.0f);
        kVar.a(new kb(gbVar, 1));
        kVar.b(new vb(jbVar, xbVar, 0));
        kVar.h();
        ibVar.run();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void d1(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean e() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e0(u1 u1Var, TLRPC.User user) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ qv0 e2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.wi
    public void f0(jh jhVar) {
        jhVar.run();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f1(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String g(u1 u1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g0(int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean g2(long j3) {
        switch (this.a) {
        }
        return false;
    }

    @Override // gd.a
    public Object get() {
        switch (this.a) {
            case 12:
                return new l5.p(Executors.newSingleThreadExecutor());
            default:
                ob.a aVar = new ob.a(24);
                HashMap hashMap = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(i5.d.a, new r5.b(30000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(i5.d.c, new r5.b(1000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(r5.c.b)));
                if (unmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(i5.d.b, new r5.b(86400000L, 86400000L, unmodifiableSet));
                if (hashMap.keySet().size() < i5.d.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new r5.a(aVar, hashMap);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean h0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void h2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i(u1 u1Var, bi.f fVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ boolean i0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean i1(int i10, u1 u1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean i2(u1 u1Var, TLRPC.TodoItem todoItem) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j0(u1 u1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k2(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // n2.q
    public n2.p l() {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int l0(u1 u1Var) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // r2.v
    public boolean m(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && MediaController.VIDEO_MIME_TYPE.equals(str2);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m2(u1 u1Var, long j3) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean n1(MessageObject messageObject) {
        int i10 = this.a;
        return c1.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean p0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // n2.q
    public h2.b q(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r0(String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean r2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s() {
        int i10 = this.a;
    }

    @Override // z3.k
    public z3.m s0(b2.s sVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s2(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean t0(b6 b6Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // n2.q
    public byte[] v() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v0(u1 u1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v1(u1 u1Var, TLRPC.Document document) {
        int i10 = this.a;
    }

    @Override // fb.n
    public Object v2() {
        switch (this.a) {
            case 8:
                return new ArrayDeque();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String w(long j3) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void w2() {
        int i10 = this.a;
    }

    @Override // n2.q
    public void x(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // cg.a
    public void x0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            throw new IllegalArgumentException("Illegal use of DownsampleAudioResampler");
        }
        if (i12 != 1 && i12 != 2) {
            throw new IllegalArgumentException(hg.c.h(i12, "Illegal use of DownsampleAudioResampler. Channels:"));
        }
        int remaining = shortBuffer.remaining() / i12;
        int ceil = (int) Math.ceil((i11 / i10) * remaining);
        int i13 = remaining - ceil;
        float f7 = ceil;
        float f10 = f7 / f7;
        float f11 = i13;
        float f12 = f11 / f11;
        while (ceil > 0 && i13 > 0) {
            if (f10 >= f12) {
                shortBuffer2.put(shortBuffer.get());
                if (i12 == 2) {
                    shortBuffer2.put(shortBuffer.get());
                }
                ceil--;
                f10 = ceil / f7;
            } else {
                shortBuffer.position(shortBuffer.position() + i12);
                i13--;
                f12 = i13 / f11;
            }
        }
    }

    @Override // q9.d
    public Object y0(u5 u5Var) {
        switch (this.a) {
            case 14:
                return new h();
            case 15:
                synchronized (androidx.activity.result.c.class) {
                    byte b10 = (byte) (((byte) 1) | 2);
                    if (b10 != 3) {
                        StringBuilder sb2 = new StringBuilder();
                        if ((b10 & 1) == 0) {
                            sb2.append(" enableFirelog");
                        }
                        if ((b10 & 2) == 0) {
                            sb2.append(" firelogEventType");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
                    }
                    androidx.activity.result.c.b(new t7.o());
                }
                return new ob.a(0);
            default:
                return new tb.a();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.wb
    public void z(xb xbVar, ib ibVar, rg rgVar, dm dmVar) {
        xbVar.setInOutOffset(xbVar.getMeasuredHeight());
        dmVar.accept(Float.valueOf(xbVar.getTranslationY()));
        o1.k kVar = new o1.k(xbVar, xb.IN_OUT_OFFSET_Y, 0.0f);
        kVar.u.a(0.8f);
        kVar.u.b(400.0f);
        kVar.a(new l4(1, xbVar, rgVar));
        kVar.b(new vb(dmVar, xbVar, 1));
        kVar.h();
        ibVar.run();
    }

    public b() {
        this.a = 22;
        new TreeMap(String.CASE_INSENSITIVE_ORDER).clear();
    }

    private final /* synthetic */ void I0() {
    }

    private final /* synthetic */ void K0() {
    }

    private final /* synthetic */ void L3() {
    }

    private final /* synthetic */ void M3() {
    }

    private final /* synthetic */ void Q3() {
    }

    private final /* synthetic */ void R3() {
    }

    private final /* synthetic */ void U3() {
    }

    private final /* synthetic */ void V3() {
    }

    private final /* synthetic */ void Y3() {
    }

    private final /* synthetic */ void Z3() {
    }

    private final /* synthetic */ void a3() {
    }

    private final /* synthetic */ void b3() {
    }

    private final /* synthetic */ void n0() {
    }

    private final /* synthetic */ void o0() {
    }

    private final /* synthetic */ void x2() {
    }

    private final /* synthetic */ void z2() {
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ void B0() {
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ void P0() {
    }

    @Override // n2.q
    public void release() {
    }

    private final /* synthetic */ void A3(u1 u1Var) {
    }

    private final /* synthetic */ void B3(u1 u1Var) {
    }

    private final /* synthetic */ void C1(u1 u1Var) {
    }

    private final void C3(u1 u1Var) {
    }

    private final /* synthetic */ void E1(u1 u1Var) {
    }

    private final void E3(u1 u1Var) {
    }

    private final /* synthetic */ void G3(u1 u1Var) {
    }

    private final /* synthetic */ void H3(u1 u1Var) {
    }

    private final /* synthetic */ void M0(u1 u1Var) {
    }

    private final /* synthetic */ void M2(u1 u1Var) {
    }

    private final /* synthetic */ void N2(u1 u1Var) {
    }

    private final /* synthetic */ void O0(u1 u1Var) {
    }

    private final /* synthetic */ void Q2(u1 u1Var) {
    }

    private final /* synthetic */ void R2(u1 u1Var) {
    }

    private final /* synthetic */ void S2(u1 u1Var) {
    }

    private final /* synthetic */ void S3(int i10) {
    }

    private final /* synthetic */ void T2(u1 u1Var) {
    }

    private final /* synthetic */ void T3(int i10) {
    }

    private final /* synthetic */ void U2(u1 u1Var) {
    }

    private final /* synthetic */ void V2(u1 u1Var) {
    }

    private final /* synthetic */ void W0(u1 u1Var) {
    }

    private final /* synthetic */ void W3(MessageObject messageObject) {
    }

    private final /* synthetic */ void X3(MessageObject messageObject) {
    }

    private final /* synthetic */ void Y2(u1 u1Var) {
    }

    private final /* synthetic */ void Z0(u1 u1Var) {
    }

    private final /* synthetic */ void Z2(u1 u1Var) {
    }

    private final /* synthetic */ void i3(String str) {
    }

    private final /* synthetic */ void j2(u1 u1Var) {
    }

    private final /* synthetic */ void j3(String str) {
    }

    private final /* synthetic */ void k1(u1 u1Var) {
    }

    private final /* synthetic */ void l1(u1 u1Var) {
    }

    private final /* synthetic */ void l2(u1 u1Var) {
    }

    private final /* synthetic */ void m1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void n2(u1 u1Var) {
    }

    private final /* synthetic */ void o1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void o2(u1 u1Var) {
    }

    private final /* synthetic */ void o3(u1 u1Var) {
    }

    private final /* synthetic */ void p3(u1 u1Var) {
    }

    private final /* synthetic */ void q0(u1 u1Var) {
    }

    private final /* synthetic */ void r1(u1 u1Var) {
    }

    private final /* synthetic */ void s3(u1 u1Var) {
    }

    private final /* synthetic */ void t1(u1 u1Var) {
    }

    private final /* synthetic */ void t3(u1 u1Var) {
    }

    private final /* synthetic */ void u0(u1 u1Var) {
    }

    private final /* synthetic */ void u3(MessageObject messageObject) {
    }

    private final /* synthetic */ void v3(MessageObject messageObject) {
    }

    private final /* synthetic */ void w0(u1 u1Var) {
    }

    private final /* synthetic */ void w3(u1 u1Var) {
    }

    private final /* synthetic */ void x1(u1 u1Var) {
    }

    private final /* synthetic */ void x3(u1 u1Var) {
    }

    private final /* synthetic */ void y1(u1 u1Var) {
    }

    private final /* synthetic */ void z0(u1 u1Var) {
    }

    @Override // n2.q
    public void V(l2.f fVar) {
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ void a1(Object obj) {
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ void p1(TLRPC.User user) {
    }

    @Override // n2.q
    public void y(byte[] bArr) {
    }

    private final /* synthetic */ void B1(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void D3(u1 u1Var, boolean z10) {
    }

    private final /* synthetic */ void F3(u1 u1Var, boolean z10) {
    }

    private final /* synthetic */ void L1(int i10, u1 u1Var) {
    }

    private final /* synthetic */ void O2(u1 u1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void P1(int i10, u1 u1Var) {
    }

    private final /* synthetic */ void P2(u1 u1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void Q0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void T0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void d0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void d2(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void f2(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void k0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void k3(u1 u1Var, long j3) {
    }

    private final /* synthetic */ void l3(u1 u1Var, long j3) {
    }

    private final /* synthetic */ void t2(int i10, u1 u1Var) {
    }

    private final /* synthetic */ void u1(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void u2(int i10, u1 u1Var) {
    }

    private final /* synthetic */ void w1(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void y3(u1 u1Var, bi.f fVar) {
    }

    private final /* synthetic */ void z1(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void z3(u1 u1Var, bi.f fVar) {
    }

    @Override // n2.q
    public /* synthetic */ void h(byte[] bArr, j2.k kVar) {
    }

    private final /* synthetic */ void B2(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void F1(u1 u1Var, int i10, int i11) {
    }

    private final /* synthetic */ void F2(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void G1(u1 u1Var, int i10, int i11) {
    }

    private final /* synthetic */ void W2(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void X2(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void a0(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void c0(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void c3(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void d3(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void h1(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void j1(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void q3(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void r3(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void G2(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void H2(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void e3(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    private final /* synthetic */ void f3(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    private final /* synthetic */ void g3(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void h3(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void p2(u1 u1Var, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void q2(u1 u1Var, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void I2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void J2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void K2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void L2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void m3(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void n3(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void e1(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void g1(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void O3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final /* synthetic */ void P3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ void c2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }

    @Override // org.telegram.ui.Components.wi
    public void I1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
    }
}
