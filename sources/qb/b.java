package qb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaDrmException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.Editable;
import android.text.style.CharacterStyle;
import androidx.fragment.app.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import bi.u6;
import com.google.android.gms.internal.play_billing.x3;
import di.q4;
import e9.i0;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.nio.ShortBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import m.g3;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.em;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.rb;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.sb;
import org.telegram.ui.Components.tb;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.y5;
import org.telegram.ui.rv0;
import org.xml.sax.Attributes;
import r2.u;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public class b implements ag.a, s0, bg.a, i5.e, da.c, fb.n, wi, n5.b, n2.r, q9.d, sb, k1, u, u5.a, wf.a {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    public static byte[] D3(i0 i0Var, long j3) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i0Var.size());
        Iterator<E> it = i0Var.iterator();
        while (it.hasNext()) {
            d2.b bVar = (d2.b) it.next();
            Bundle a2 = bVar.a();
            Bitmap bitmap = bVar.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                e2.d.g(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                a2.putByteArray(d2.b.x, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(a2);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j3);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static xf.k K3(Editable editable, int i10) {
        xf.k[] kVarArr = (xf.k[]) editable.getSpans(0, editable.length(), xf.k.class);
        if (kVarArr.length == 0) {
            return null;
        }
        for (int length = kVarArr.length; length > 0; length--) {
            int i11 = length - 1;
            if (editable.getSpanFlags(kVarArr[i11]) == 17) {
                xf.k kVar = kVarArr[i11];
                if (kVar.a == i10) {
                    return kVar;
                }
            }
        }
        return null;
    }

    public static boolean M3(boolean z10, String str, Editable editable, Attributes attributes) {
        int i10;
        boolean z11 = false;
        Object obj = null;
        if (str.startsWith("animated-emoji")) {
            if (z10) {
                String a2 = xf.j.a("data-document-id", attributes);
                if (a2 != null) {
                    editable.setSpan(new y5(Long.parseLong(a2), (Paint.FontMetricsInt) null), editable.length(), editable.length(), 17);
                    return true;
                }
            } else {
                Object[] spans = editable.getSpans(0, editable.length(), y5.class);
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
                Object obj2 = (y5) obj;
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
                editable.setSpan(new xf.k(0), editable.length(), editable.length(), 17);
                return true;
            }
            Object K3 = K3(editable, 0);
            if (K3 != null) {
                int spanStart2 = editable.getSpanStart(K3);
                editable.removeSpan(K3);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(K3, spanStart2, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        }
        if (str.equals("pre")) {
            if (z10) {
                String a10 = xf.j.a("language", attributes);
                if (a10 == null) {
                    a10 = xf.j.a("lang", attributes);
                }
                if (a10 == null) {
                    a10 = xf.j.a("lng", attributes);
                }
                editable.setSpan(new xf.k(a10), editable.length(), editable.length(), 17);
                return true;
            }
            Object K32 = K3(editable, 1);
            if (K32 != null) {
                int spanStart3 = editable.getSpanStart(K32);
                editable.removeSpan(K32);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(K32, spanStart3, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        }
        if (!str.equals("blockquote")) {
            if (str.equals("details")) {
                if (z10) {
                    editable.setSpan(new xf.k(3), editable.length(), editable.length(), 17);
                    return true;
                }
                Object K33 = K3(editable, 3);
                if (K33 != null) {
                    int spanStart4 = editable.getSpanStart(K33);
                    editable.removeSpan(K33);
                    if (spanStart4 != editable.length()) {
                        editable.setSpan(K33, spanStart4, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }
        if (z10) {
            String a11 = xf.j.a("class", attributes);
            if (xf.j.a("data-collapsed", attributes) != null || (a11 != null && a11.contains("telegram-collapsed-quote"))) {
                z11 = true;
            }
            editable.setSpan(new xf.k(z11 ? 3 : 2), editable.length(), editable.length(), 17);
            return true;
        }
        xf.k[] kVarArr = (xf.k[]) editable.getSpans(0, editable.length(), xf.k.class);
        for (int length2 = kVarArr.length - 1; length2 >= 0; length2--) {
            xf.k kVar = kVarArr[length2];
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

    public static String X3(ad.c cVar) {
        String str = cVar.a;
        if ("br".equals(str)) {
            return "\n";
        }
        if ("img".equals(str)) {
            String str2 = (String) cVar.a().get("alt");
            return (str2 == null || str2.length() == 0) ? "￼" : str2;
        }
        if ("iframe".equals(str)) {
            return " ";
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A0() {
        int i10 = this.a;
    }

    @Override // n2.r
    public byte[] B() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B0(t1 t1Var, TLObject tLObject, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B1(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // androidx.lifecycle.s0
    public p0 C(Class cls, v1.b bVar) {
        switch (this.a) {
        }
        return b(cls);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void C0(t1 t1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void C1(t1 t1Var, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public void E0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean E1(t1 t1Var, TLRPC.Chat chat) {
        switch (this.a) {
        }
        return false;
    }

    @Override // n2.r
    public void F(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void G0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean G1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void H(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.sb
    public void I(tb tbVar, eb ebVar, rg rgVar, rl rlVar) {
        tbVar.setInOutOffset(tbVar.getMeasuredHeight());
        rlVar.accept(Float.valueOf(tbVar.getTranslationY()));
        o1.k kVar = new o1.k(tbVar, tb.IN_OUT_OFFSET_Y, 0.0f);
        kVar.u.a(0.8f);
        kVar.u.b(400.0f);
        kVar.a(new q4(1, tbVar, rgVar));
        kVar.b(new rb(rlVar, tbVar, 1));
        kVar.f();
        ebVar.run();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I1(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // n2.r
    public byte[] J(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K1(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L(int i10, t1 t1Var) {
        int i11 = this.a;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.Cells.k1
    public void L1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.a) {
        }
        nf.f.s(t1Var.getContext(), str);
    }

    public Signature[] L3(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean M0(long j3) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ CharacterStyle M1(t1 t1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean N(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O1(t1 t1Var, MessageObject messageObject) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean P(t1 t1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void P0(int i10, t1 t1Var) {
        int i11 = this.a;
    }

    @Override // q9.d
    public Object P1(u6 u6Var) {
        switch (this.a) {
            case 14:
                return new h();
            default:
                synchronized (t7.s.class) {
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
                    t7.s.d(new t7.o());
                }
                return new ob.a(0);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Q() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Q1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ boolean R1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // ag.a
    public void S0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        shortBuffer2.put(shortBuffer);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S1(t1 t1Var, ai.j jVar) {
        int i10 = this.a;
    }

    @Override // r2.u
    public boolean T(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int U() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.a;
    }

    @Override // r2.u
    public int V() {
        return MediaCodecList.getCodecCount();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void V0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean V1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.a) {
        }
        return false;
    }

    @Override // n2.r
    public void W(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean W0(t1 t1Var, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ gh.a X() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void X0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ rv0 X1() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Y(t1 t1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Y1(long j3) {
        switch (this.a) {
        }
        return false;
    }

    @Override // n2.r
    public n2.p Z(byte[] bArr, List list, int i10, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Z0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Z1(t1 t1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.a;
    }

    @Override // wf.a
    public boolean a(Context context) {
        return e0.b.l(context);
    }

    @Override // n2.r
    public int a0() {
        return 1;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean a2(t1 t1Var, TLRPC.TodoItem todoItem) {
        switch (this.a) {
        }
        return false;
    }

    @Override // i5.e
    public Object apply(Object obj) {
        return ((x3) obj).a();
    }

    @Override // androidx.lifecycle.s0
    public p0 b(Class cls) {
        switch (this.a) {
            case 4:
                return new m0(true);
            default:
                return new w1.b();
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean b0(t1 t1Var, TLRPC.User user) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void c0(int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean c1(int i10, t1 t1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void c2(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // r2.u
    public MediaCodecInfo d(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean d0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean e() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ boolean e0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e2(t1 t1Var, long j3) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void f0(t1 t1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String g(t1 t1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // r2.u
    public boolean g0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean g1(MessageObject messageObject) {
        int i10 = this.a;
        return em.a(messageObject);
    }

    @Override // fd.a
    public Object get() {
        switch (this.a) {
            case 12:
                return new l5.p(Executors.newSingleThreadExecutor());
            default:
                rb.a aVar = new rb.a(23);
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

    @Override // n2.r
    public Map h(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int h0(t1 t1Var) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j() {
        int i10 = this.a;
    }

    @Override // n2.r
    public boolean j0(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean j2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.sb
    public void k(tb tbVar, eb ebVar, cb cbVar, fb fbVar) {
        o1.k kVar = new o1.k(tbVar, tb.IN_OUT_OFFSET_Y, tbVar.getHeight());
        kVar.u.a(0.8f);
        kVar.u.b(400.0f);
        kVar.a(new gb(cbVar, 1));
        kVar.b(new rb(fbVar, tbVar, 0));
        kVar.f();
        ebVar.run();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k2(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean l0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n0(String str) {
        int i10 = this.a;
    }

    @Override // fb.n
    public Object n2() {
        switch (this.a) {
            case 8:
                return new ArrayDeque();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean o0(y5 y5Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o1(t1 t1Var, TLRPC.Document document) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o2() {
        int i10 = this.a;
    }

    @Override // n2.r
    public n2.q p() {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q0(t1 t1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // da.c
    public da.a q2(na.d dVar, JSONObject jSONObject) {
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        com.google.android.gms.internal.cast.a aVar = jSONObject.has("session") ? new com.google.android.gms.internal.cast.a(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new com.google.android.gms.internal.cast.a(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new da.a(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (optInt * 1000) + System.currentTimeMillis(), aVar, new ac.d(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), optDouble, optDouble2, optInt2);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void r() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void r2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // bg.a
    public void s0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 > i11) {
            throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler");
        }
        if (i12 != 1 && i12 != 2) {
            throw new IllegalArgumentException(hc.b.j(i12, "Illegal use of UpsampleAudioResampler. Channels:"));
        }
        int remaining = shortBuffer.remaining() / i12;
        int ceil = ((int) Math.ceil((i11 / i10) * remaining)) - remaining;
        float f7 = remaining;
        float f10 = f7 / f7;
        float f11 = ceil;
        float f12 = f11 / f11;
        while (remaining > 0 && ceil > 0) {
            if (f10 >= f12) {
                shortBuffer2.put(shortBuffer.get());
                if (i12 == 2) {
                    shortBuffer2.put(shortBuffer.get());
                }
                remaining--;
                f10 = remaining / f7;
            } else {
                shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i12));
                if (i12 == 2) {
                    shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i12));
                }
                ceil--;
                f12 = ceil / f11;
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t1(t1 t1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean t2(int i10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // u5.a
    public long u() {
        return SystemClock.elapsedRealtime();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void u0(t1 t1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String v(long j3) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v2() {
        int i10 = this.a;
    }

    @Override // r2.u
    public boolean w(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && MediaController.VIDEO_MIME_TYPE.equals(str2);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w0(t1 t1Var, float f7, float f10, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w2(t1 t1Var, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // n2.r
    public h2.b x(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean x0(MessageObject messageObject) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ t9 x2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // wf.a
    public boolean y(Context context) {
        return e0.b.p(context);
    }

    @Override // org.telegram.ui.Components.wi
    public void y0(jh jhVar) {
        jhVar.run();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean z1() {
        switch (this.a) {
        }
        return false;
    }

    public b(Context context) {
        this.a = 11;
    }

    private final /* synthetic */ void D0() {
    }

    private final /* synthetic */ void D2() {
    }

    private final /* synthetic */ void E2() {
    }

    private final /* synthetic */ void N3() {
    }

    private final /* synthetic */ void O0() {
    }

    private final /* synthetic */ void O3() {
    }

    private final /* synthetic */ void Q0() {
    }

    private final /* synthetic */ void R3() {
    }

    private final /* synthetic */ void S3() {
    }

    private final /* synthetic */ void V3() {
    }

    private final /* synthetic */ void W3() {
    }

    private final /* synthetic */ void a4() {
    }

    private final /* synthetic */ void b3() {
    }

    private final /* synthetic */ void b4() {
    }

    private final /* synthetic */ void c3() {
    }

    private final /* synthetic */ void t0() {
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ void K0() {
    }

    @Override // n2.r
    public void release() {
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ void v0() {
    }

    private final /* synthetic */ void B3(t1 t1Var) {
    }

    private final /* synthetic */ void C3(t1 t1Var) {
    }

    private final void E3(t1 t1Var) {
    }

    private final /* synthetic */ void F0(t1 t1Var) {
    }

    private final void G3(t1 t1Var) {
    }

    private final /* synthetic */ void H0(t1 t1Var) {
    }

    private final /* synthetic */ void I3(t1 t1Var) {
    }

    private final /* synthetic */ void J0(t1 t1Var) {
    }

    private final /* synthetic */ void J3(t1 t1Var) {
    }

    private final /* synthetic */ void L0(t1 t1Var) {
    }

    private final /* synthetic */ void N2(t1 t1Var) {
    }

    private final /* synthetic */ void O2(t1 t1Var) {
    }

    private final /* synthetic */ void R2(t1 t1Var) {
    }

    private final /* synthetic */ void S2(t1 t1Var) {
    }

    private final /* synthetic */ void T0(t1 t1Var) {
    }

    private final /* synthetic */ void T2(t1 t1Var) {
    }

    private final /* synthetic */ void T3(int i10) {
    }

    private final /* synthetic */ void U2(t1 t1Var) {
    }

    private final /* synthetic */ void U3(int i10) {
    }

    private final /* synthetic */ void V2(t1 t1Var) {
    }

    private final /* synthetic */ void W2(t1 t1Var) {
    }

    private final /* synthetic */ void Y0(t1 t1Var) {
    }

    private final /* synthetic */ void Y3(MessageObject messageObject) {
    }

    private final /* synthetic */ void Z2(t1 t1Var) {
    }

    private final /* synthetic */ void Z3(MessageObject messageObject) {
    }

    private final /* synthetic */ void a3(t1 t1Var) {
    }

    private final /* synthetic */ void b2(t1 t1Var) {
    }

    private final /* synthetic */ void d1(t1 t1Var) {
    }

    private final /* synthetic */ void d2(t1 t1Var) {
    }

    private final /* synthetic */ void e1(t1 t1Var) {
    }

    private final /* synthetic */ void j3(String str) {
    }

    private final /* synthetic */ void k3(String str) {
    }

    private final /* synthetic */ void n1(t1 t1Var) {
    }

    private final /* synthetic */ void p1(t1 t1Var) {
    }

    private final /* synthetic */ void p2(t1 t1Var) {
    }

    private final /* synthetic */ void p3(t1 t1Var) {
    }

    private final /* synthetic */ void q1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void q3(t1 t1Var) {
    }

    private final /* synthetic */ void r1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void s1(t1 t1Var) {
    }

    private final /* synthetic */ void s2(t1 t1Var) {
    }

    private final /* synthetic */ void t3(t1 t1Var) {
    }

    private final /* synthetic */ void u1(t1 t1Var) {
    }

    private final /* synthetic */ void u2(t1 t1Var) {
    }

    private final /* synthetic */ void u3(t1 t1Var) {
    }

    private final /* synthetic */ void v3(MessageObject messageObject) {
    }

    private final /* synthetic */ void w3(MessageObject messageObject) {
    }

    private final /* synthetic */ void x1(t1 t1Var) {
    }

    private final /* synthetic */ void x3(t1 t1Var) {
    }

    private final /* synthetic */ void y1(t1 t1Var) {
    }

    private final /* synthetic */ void y2(t1 t1Var) {
    }

    private final /* synthetic */ void y3(t1 t1Var) {
    }

    @Override // n2.r
    public void G(byte[] bArr) {
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ void U0(Object obj) {
    }

    @Override // n2.r
    public void c(g3 g3Var) {
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ void i1(TLRPC.User user) {
    }

    private final /* synthetic */ void A3(t1 t1Var, ai.j jVar) {
    }

    private final /* synthetic */ void B2(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void C2(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void D1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void F3(t1 t1Var, boolean z10) {
    }

    private final /* synthetic */ void H1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void H3(t1 t1Var, boolean z10) {
    }

    private final /* synthetic */ void P2(t1 t1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void Q2(t1 t1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void a1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void b1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void h2(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void i2(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void l2(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void l3(t1 t1Var, long j3) {
    }

    private final /* synthetic */ void m2(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void m3(t1 t1Var, long j3) {
    }

    private final /* synthetic */ void p0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void r0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void v1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void w1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void z3(t1 t1Var, ai.j jVar) {
    }

    @Override // n2.r
    public /* synthetic */ void l(byte[] bArr, j2.k kVar) {
    }

    private final /* synthetic */ void F2(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void G2(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void X2(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void Y2(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void d3(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void e3(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void f2(t1 t1Var, int i10, int i11) {
    }

    private final /* synthetic */ void g2(t1 t1Var, int i10, int i11) {
    }

    private final /* synthetic */ void k0(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void k1(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void m0(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void m1(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void r3(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void s3(t1 t1Var, float f7, float f10) {
    }

    @Override // ag.a
    public int J1(int i10, int i11, int i12) {
        return i10;
    }

    private final /* synthetic */ void A2(t1 t1Var, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void H2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void I2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void f3(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    private final /* synthetic */ void g3(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    private final /* synthetic */ void h3(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void i3(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void z2(t1 t1Var, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void J2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void K2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void L2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void M2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void n3(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void o3(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void f1(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void h1(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void P3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final /* synthetic */ void Q3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }

    @Override // org.telegram.ui.Components.wi
    public void A1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
    }
}
