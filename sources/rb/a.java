package rb;

import android.content.Context;
import android.graphics.Paint;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Trace;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.Surface;
import b2.s;
import c3.b0;
import c3.p;
import c3.t;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import fb.m;
import fb.n;
import hg.k0;
import i5.e;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import nf.f;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.z5;
import org.telegram.ui.pv0;
import org.xml.sax.Attributes;
import pb.b;
import q9.d;
import r2.k;
import r2.l;
import r2.o;
import r2.x;
import x3.g;
import y6.c;
import yf.j;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final class a implements bg.a, e, cg.a, ea.a, n, dh.a, d, l1, OnFailureListener, k, u5.a, Continuation, g, c, z3.k {
    public static volatile a b;
    public static a c;
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    public static MediaCodec J(com.google.firebase.messaging.n nVar) {
        String str = ((o) nVar.a).a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    public static yf.k q3(Editable editable, int i10) {
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

    public static boolean r3(boolean z10, String str, Editable editable, Attributes attributes) {
        int i10;
        boolean z11 = false;
        Object obj = null;
        if (str.startsWith("animated-emoji")) {
            if (z10) {
                String a2 = j.a("data-document-id", attributes);
                if (a2 != null) {
                    editable.setSpan(new z5(Long.parseLong(a2), (Paint.FontMetricsInt) null), editable.length(), editable.length(), 17);
                    return true;
                }
            } else {
                Object[] spans = editable.getSpans(0, editable.length(), z5.class);
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
                Object obj2 = (z5) obj;
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
            Object q32 = q3(editable, 0);
            if (q32 != null) {
                int spanStart2 = editable.getSpanStart(q32);
                editable.removeSpan(q32);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(q32, spanStart2, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        }
        if (str.equals("pre")) {
            if (z10) {
                String a10 = j.a("language", attributes);
                if (a10 == null) {
                    a10 = j.a("lang", attributes);
                }
                if (a10 == null) {
                    a10 = j.a("lng", attributes);
                }
                editable.setSpan(new yf.k(a10), editable.length(), editable.length(), 17);
                return true;
            }
            Object q33 = q3(editable, 1);
            if (q33 != null) {
                int spanStart3 = editable.getSpanStart(q33);
                editable.removeSpan(q33);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(q33, spanStart3, editable.length(), 33);
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
                Object q34 = q3(editable, 3);
                if (q34 != null) {
                    int spanStart4 = editable.getSpanStart(q34);
                    editable.removeSpan(q34);
                    if (spanStart4 != editable.length()) {
                        editable.setSpan(q34, spanStart4, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }
        if (z10) {
            String a11 = j.a("class", attributes);
            if (j.a("data-collapsed", attributes) != null || (a11 != null && a11.contains("telegram-collapsed-quote"))) {
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
    public /* synthetic */ void A0(u1 u1Var, TLObject tLObject, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean A1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B0(u1 u1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // ea.a
    public StackTraceElement[] C(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C1(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // z3.k
    public int D(s sVar) {
        return 1;
    }

    @Override // org.telegram.ui.Cells.l1
    public void D0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D1(u1 u1Var, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // q9.d
    public Object G(cf.c cVar) {
        switch (this.a) {
            case 14:
                return new pb.c(cVar.x(b.class));
            default:
                return new b(cVar.c(ob.a.class));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean G1(u1 u1Var, TLRPC.Chat chat) {
        switch (this.a) {
        }
        return false;
    }

    @Override // dh.a
    public int H() {
        return 1711276032;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean I1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K1(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // bg.a
    public int L1(int i10, int i11, int i12) {
        return i10 * 2;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M(int i10, u1 u1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean M0(long j3) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M1(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(u1 u1Var) {
        int i10 = this.a;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.Cells.l1
    public void N1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.a) {
        }
        f.s(u1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle O1(u1 u1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean P() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P0(int i10, u1 u1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q(u1 u1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q1(u1 u1Var, MessageObject messageObject) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void R0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void R1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.a;
    }

    @Override // bg.a
    public void S0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i12 = 0; i12 < min; i12++) {
            short s10 = shortBuffer.get();
            shortBuffer2.put(s10);
            shortBuffer2.put(s10);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U1(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int V() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void V0(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean V1(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.a) {
        }
        return false;
    }

    @Override // z3.k
    public boolean W(s sVar) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean W0(u1 u1Var, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ hh.a Y() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ pv0 Y1() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // dh.a
    public int a() {
        return 872415231;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean a0(u1 u1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean a2(long j3) {
        switch (this.a) {
        }
        return false;
    }

    @Override // i5.e
    public Object apply(Object obj) {
        return ((x3) obj).a();
    }

    @Override // x3.g
    public long b(p pVar) {
        return -1L;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b0(u1 u1Var, TLRPC.User user) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void b2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.a;
    }

    @Override // dh.a
    public int c() {
        return 352321535;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c1(int i10, u1 u1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c2(u1 u1Var, TLRPC.TodoItem todoItem) {
        switch (this.a) {
        }
        return false;
    }

    @Override // y6.c
    public int d(Context context, String str, boolean z10) {
        return y6.e.d(context, str, z10);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void d0(int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e2(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f0(u1 u1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // x3.g
    public b0 g() {
        return new t(-9223372036854775807L);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g2(u1 u1Var, long j3) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String h(u1 u1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int h0(u1 u1Var) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean h1(MessageObject messageObject) {
        int i10 = this.a;
        return c1.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i(u1 u1Var, bi.f fVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k1() {
        int i10 = this.a;
    }

    @Override // y6.c
    public int l(Context context, String str) {
        return y6.e.a(context, str);
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean l0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean l2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        switch (this.a) {
        }
        return false;
    }

    @Override // dh.a
    public int m() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m2(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n0(String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean o0(z5 z5Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p1(u1 u1Var, TLRPC.Document document) {
        int i10 = this.a;
    }

    @Override // fb.n
    public Object p2() {
        switch (this.a) {
            case 8:
                return new ArrayList();
            default:
                return new m(true);
        }
    }

    @Override // u5.a
    public long q() {
        return System.currentTimeMillis();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q0(u1 u1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q2() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t0(u1 u1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* bridge */ /* synthetic */ Object then(Task task) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u1(u1 u1Var, float f7, float f10) {
        int i10 = this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // r2.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l v(com.google.firebase.messaging.n nVar) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = J(nVar);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) nVar.d;
            mediaCodec.configure((MediaFormat) nVar.b, surface, (MediaCrypto) nVar.e, (surface == null && ((o) nVar.a).h && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodec.start();
            Trace.endSection();
            return new x(mediaCodec, (r2.j) nVar.f);
        } catch (IOException e) {
            e = e;
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        } catch (RuntimeException e7) {
            e = e7;
            if (mediaCodec != null) {
            }
            throw e;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v0(u1 u1Var, float f7, float f10, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean v2(int i10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String w(long j3) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w0(MessageObject messageObject) {
        switch (this.a) {
        }
        return true;
    }

    @Override // z3.k
    public z3.m x(s sVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x2() {
        int i10 = this.a;
    }

    @Override // cg.a
    public void y(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            throw new IllegalArgumentException("Illegal use of DownsampleAudioResampler");
        }
        if (i12 != 1 && i12 != 2) {
            throw new IllegalArgumentException(k0.h(i12, "Illegal use of DownsampleAudioResampler. Channels:"));
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y2(u1 u1Var, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ r9 z2() {
        switch (this.a) {
        }
        return null;
    }

    public a() {
        this.a = 10;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    private final /* synthetic */ void A3() {
    }

    private final /* synthetic */ void B3() {
    }

    private final /* synthetic */ void E3() {
    }

    private final /* synthetic */ void F3() {
    }

    private final /* synthetic */ void I2() {
    }

    private final /* synthetic */ void J2() {
    }

    private final /* synthetic */ void S1() {
    }

    private final /* synthetic */ void W1() {
    }

    private final /* synthetic */ void c0() {
    }

    private final /* synthetic */ void g0() {
    }

    private final /* synthetic */ void r0() {
    }

    private final /* synthetic */ void s0() {
    }

    private final /* synthetic */ void s3() {
    }

    private final /* synthetic */ void t3() {
    }

    private final /* synthetic */ void w3() {
    }

    private final /* synthetic */ void x3() {
    }

    private final /* synthetic */ void A2(u1 u1Var) {
    }

    private final /* synthetic */ void B2(u1 u1Var) {
    }

    private final /* synthetic */ void C2(u1 u1Var) {
    }

    private final /* synthetic */ void C3(MessageObject messageObject) {
    }

    private final /* synthetic */ void D2(u1 u1Var) {
    }

    private final /* synthetic */ void D3(MessageObject messageObject) {
    }

    private final /* synthetic */ void G0(u1 u1Var) {
    }

    private final /* synthetic */ void G2(u1 u1Var) {
    }

    private final /* synthetic */ void H0(u1 u1Var) {
    }

    private final /* synthetic */ void H2(u1 u1Var) {
    }

    private final /* synthetic */ void Q0(u1 u1Var) {
    }

    private final /* synthetic */ void Q2(String str) {
    }

    private final /* synthetic */ void R2(String str) {
    }

    private final /* synthetic */ void T0(u1 u1Var) {
    }

    private final /* synthetic */ void U0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void W2(u1 u1Var) {
    }

    private final /* synthetic */ void X2(u1 u1Var) {
    }

    private final /* synthetic */ void Y0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void a1(u1 u1Var) {
    }

    private final /* synthetic */ void a3(u1 u1Var) {
    }

    private final /* synthetic */ void b1(u1 u1Var) {
    }

    private final /* synthetic */ void b3(u1 u1Var) {
    }

    private final /* synthetic */ void c3(MessageObject messageObject) {
    }

    private final /* synthetic */ void d3(MessageObject messageObject) {
    }

    private final /* synthetic */ void e3(u1 u1Var) {
    }

    private final /* synthetic */ void f1(u1 u1Var) {
    }

    private final /* synthetic */ void f3(u1 u1Var) {
    }

    private final /* synthetic */ void g1(u1 u1Var) {
    }

    private final /* synthetic */ void i3(u1 u1Var) {
    }

    private final /* synthetic */ void j0(u1 u1Var) {
    }

    private final /* synthetic */ void j3(u1 u1Var) {
    }

    private final /* synthetic */ void k0(u1 u1Var) {
    }

    private final void k3(u1 u1Var) {
    }

    private final /* synthetic */ void l1(u1 u1Var) {
    }

    private final /* synthetic */ void m0(u1 u1Var) {
    }

    private final void m3(u1 u1Var) {
    }

    private final /* synthetic */ void n1(u1 u1Var) {
    }

    private final /* synthetic */ void n2(u1 u1Var) {
    }

    private final /* synthetic */ void o2(u1 u1Var) {
    }

    private final /* synthetic */ void o3(u1 u1Var) {
    }

    private final /* synthetic */ void p0(u1 u1Var) {
    }

    private final /* synthetic */ void p3(u1 u1Var) {
    }

    private final /* synthetic */ void u0(u1 u1Var) {
    }

    private final /* synthetic */ void u2(u1 u1Var) {
    }

    private final /* synthetic */ void w1(u1 u1Var) {
    }

    private final /* synthetic */ void w2(u1 u1Var) {
    }

    private final /* synthetic */ void x0(u1 u1Var) {
    }

    private final /* synthetic */ void x1(u1 u1Var) {
    }

    private final /* synthetic */ void y1(u1 u1Var) {
    }

    private final /* synthetic */ void y3(int i10) {
    }

    private final /* synthetic */ void z1(u1 u1Var) {
    }

    private final /* synthetic */ void z3(int i10) {
    }

    @Override // x3.g
    public void B(long j3) {
    }

    private final /* synthetic */ void C0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void E0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void F1(int i10, u1 u1Var) {
    }

    private final /* synthetic */ void J1(int i10, u1 u1Var) {
    }

    private final /* synthetic */ void S2(u1 u1Var, long j3) {
    }

    private final /* synthetic */ void T2(u1 u1Var, long j3) {
    }

    private final /* synthetic */ void X(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void Z(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void d1(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void e1(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void g3(u1 u1Var, bi.f fVar) {
    }

    private final /* synthetic */ void h3(u1 u1Var, bi.f fVar) {
    }

    private final /* synthetic */ void i1(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void j1(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void l3(u1 u1Var, boolean z10) {
    }

    private final /* synthetic */ void n3(u1 u1Var, boolean z10) {
    }

    private final /* synthetic */ void r1(int i10, u1 u1Var) {
    }

    private final /* synthetic */ void r2(u1 u1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void s1(int i10, u1 u1Var) {
    }

    private final /* synthetic */ void s2(u1 u1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void t1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void v1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void E2(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void F2(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void K(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void K2(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void L0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void L2(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void O0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void U(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void X1(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void Y2(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void Z1(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void Z2(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void o1(u1 u1Var, int i10, int i11) {
    }

    private final /* synthetic */ void q1(u1 u1Var, int i10, int i11) {
    }

    private final /* synthetic */ void B1(u1 u1Var, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void E1(u1 u1Var, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void M2(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    private final /* synthetic */ void N2(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    private final /* synthetic */ void O2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void P2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void d2(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void f2(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void U2(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void V2(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void h2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void i2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void j2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void k2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void J0(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void K0(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void u3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final /* synthetic */ void v3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
