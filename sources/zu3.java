// default package

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class zu3 implements gk7 {
    public static final HashSet M = new HashSet();
    public static final HashSet N;
    public li3 E;
    public tq4 F;
    public final FrameLayout H;
    public final jq1 I;
    public final long J;
    public final long K;
    public HashMap L;
    public final mu1 a;
    public int b;
    public TLRPC.TL_messages_stickerSet c;
    public boolean n;
    public String w;
    public boolean d = false;
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final Random h = new Random();
    public int r = -1;
    public long s = 0;
    public final ArrayList x = new ArrayList();
    public final ArrayList y = new ArrayList();
    public final ArrayList G = new ArrayList();

    static {
        HashSet hashSet = new HashSet();
        N = hashSet;
        hashSet.add("0⃣");
        hashSet.add("1⃣");
        hashSet.add("2⃣");
        hashSet.add("3⃣");
        hashSet.add("4⃣");
        hashSet.add("5⃣");
        hashSet.add("6⃣");
        hashSet.add("7⃣");
        hashSet.add("8⃣");
        hashSet.add("9⃣");
    }

    public zu3(mu1 mu1Var, FrameLayout frameLayout, jq1 jq1Var, int i, long j, long j2) {
        this.a = mu1Var;
        this.H = frameLayout;
        this.I = jq1Var;
        this.b = i;
        this.J = j;
        this.K = j2;
    }

    public static boolean a(gb2 gb2Var, float f, int i) {
        float s = gb2Var.getPhotoImage().s() + gb2Var.getY();
        return s > f && s < ((float) i);
    }

    public static int f() {
        float min;
        float f;
        if (gl.O1()) {
            min = gl.P0();
            f = 0.4f;
        } else {
            Point point = gl.q;
            min = Math.min(point.x, point.y);
            f = 0.5f;
        }
        return (int) ((((int) (min * f)) * 2.0f) / gl.p);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r8.charAt(r3) <= 57343) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        if (r8.charAt(r3) != 9794) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String p(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        int i = 0;
        String str2 = str;
        while (i < length) {
            if (i < length - 1) {
                if (str2.charAt(i) == 55356) {
                    int i2 = i + 1;
                    if (str2.charAt(i2) >= 57339) {
                    }
                }
                if (str2.charAt(i) == 8205) {
                    int i3 = i + 1;
                    if (str2.charAt(i3) != 9792) {
                    }
                    length -= 2;
                    str2 = TextUtils.concat(str2.subSequence(0, i), str2.subSequence(i + 2, str2.length()));
                    i--;
                    i++;
                    str2 = str2;
                }
            }
            if (str2.charAt(i) == 65039) {
                length--;
                str2 = TextUtils.concat(str2.subSequence(0, i), str2.subSequence(i + 1, str2.length()));
                i--;
                i++;
                str2 = str2;
            } else {
                i++;
                str2 = str2;
            }
        }
        return str2.toString();
    }

    public final void b() {
        if (this.d) {
            return;
        }
        TLRPC.TL_messages_stickerSet q0 = hq6.d0(this.b).q0("EmojiAnimations");
        this.c = q0;
        if (q0 == null) {
            q0 = hq6.d0(this.b).o0("EmojiAnimations");
            this.c = q0;
        }
        if (q0 == null) {
            hq6.d0(this.b).d1("EmojiAnimations", false, true);
        }
        if (this.c != null) {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < this.c.documents.size(); i++) {
                hashMap.put(Long.valueOf(this.c.documents.get(i).id), this.c.documents.get(i));
            }
            for (int i2 = 0; i2 < this.c.packs.size(); i2++) {
                TLRPC.TL_stickerPack tL_stickerPack = this.c.packs.get(i2);
                if (!N.contains(tL_stickerPack.emoticon) && tL_stickerPack.documents.size() > 0) {
                    String str = tL_stickerPack.emoticon;
                    HashSet hashSet = M;
                    hashSet.add(str);
                    ArrayList arrayList = new ArrayList();
                    String str2 = tL_stickerPack.emoticon;
                    HashMap hashMap2 = this.e;
                    hashMap2.put(str2, arrayList);
                    for (int i3 = 0; i3 < tL_stickerPack.documents.size(); i3++) {
                        arrayList.add((TLRPC.Document) hashMap.get(tL_stickerPack.documents.get(i3)));
                    }
                    if (tL_stickerPack.emoticon.equals("❤")) {
                        String[] strArr = {"🧡", "💛", "💚", "💙", "💜", "🖤", "🤍", "🤎"};
                        for (int i4 = 0; i4 < 8; i4++) {
                            String str3 = strArr[i4];
                            hashSet.add(str3);
                            hashMap2.put(str3, arrayList);
                        }
                    }
                }
            }
            this.d = true;
        }
    }

    public final void c() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i >= arrayList.size()) {
                arrayList.clear();
                return;
            }
            ((yu3) arrayList.get(i)).r.K();
            if (((yu3) arrayList.get(i)).j != null) {
                ((yu3) arrayList.get(i)).j.d(this.H);
            }
            i++;
        }
    }

    public final boolean d(String str, int i, TLRPC.Document document, k27 k27Var, int i2, boolean z, boolean z2, float f, float f2, boolean z3) {
        Random random;
        long j;
        TLRPC.Document document2;
        int abs;
        TLRPC.VideoSize F1;
        boolean z4;
        li3 li3Var;
        int i3 = i2;
        boolean z5 = k27Var != null && k27Var.V3();
        boolean z6 = (k27Var == null || k27Var.M0() == null) ? false : true;
        if (z6 || z5 || M.contains(str)) {
            ArrayList arrayList = (ArrayList) this.e.get(str);
            if (z6 || ((arrayList != null && !arrayList.isEmpty()) || z5)) {
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    ArrayList arrayList2 = this.G;
                    if (i4 >= arrayList2.size()) {
                        if (z && z5 && i5 > 0) {
                            m21 m21Var = m21.w;
                            if (m21Var != null && m21Var.b == k27Var.e1()) {
                                return false;
                            }
                            TLRPC.InputStickerSet j1 = k27.j1(k27Var.k);
                            TLRPC.TL_messages_stickerSet q0 = j1.short_name != null ? hq6.d0(this.b).q0(j1.short_name) : null;
                            if (q0 == null) {
                                q0 = hq6.d0(this.b).p0(j1.id);
                            }
                            if (q0 != null) {
                                o(q0, k27Var);
                                return false;
                            }
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                            tL_messages_getStickerSet.stickerset = j1;
                            ConnectionsManager.getInstance(this.b).sendRequest(tL_messages_getStickerSet, new pl(this, k27Var, (byte) 29));
                            return false;
                        }
                        if (i5 >= 4) {
                            return false;
                        }
                        Random random2 = this.h;
                        if (z6) {
                            TLRPC.TL_availableEffect M0 = k27Var.M0();
                            TLRPC.messages_AvailableEffects C0 = na7.q1(this.b).C0();
                            if (C0 == null) {
                                return false;
                            }
                            j = 0;
                            long j2 = M0.effect_animation_id;
                            if (j2 == 0) {
                                j2 = M0.effect_sticker_id;
                            }
                            random = random2;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= C0.documents.size()) {
                                    document2 = null;
                                    break;
                                }
                                document2 = C0.documents.get(i7);
                                long j3 = j2;
                                if (document2 != null && document2.id == j3) {
                                    break;
                                }
                                i7++;
                                j2 = j3;
                            }
                            if (document2 == null) {
                                return false;
                            }
                            if (M0.effect_sticker_id != 0) {
                                F1 = k27.F1(document2);
                                z5 = F1 != null;
                            }
                            F1 = null;
                        } else {
                            random = random2;
                            j = 0;
                            if (z5) {
                                document2 = k27Var.F0();
                                F1 = k27.F1(k27Var.F0());
                            } else {
                                if (k27Var == null || !k27Var.F2()) {
                                    if (i3 < 0 || i3 > arrayList.size() - 1) {
                                        i3 = Math.abs(random.nextInt()) % arrayList.size();
                                    }
                                    document2 = (TLRPC.Document) arrayList.get(i3);
                                } else {
                                    if (i3 < 0 || i3 > arrayList.size() - 1) {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (int i8 = 0; i8 < arrayList.size(); i8++) {
                                            TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i8);
                                            if (document3 != null) {
                                                HashMap hashMap = this.L;
                                                Boolean bool = hashMap != null ? (Boolean) hashMap.get(Long.valueOf(document3.id)) : null;
                                                if (bool != null && bool.booleanValue()) {
                                                    arrayList3.add(Integer.valueOf(i8));
                                                }
                                            }
                                        }
                                        abs = arrayList3.isEmpty() ? Math.abs(random.nextInt()) % arrayList.size() : ((Integer) arrayList3.get(Math.abs(random.nextInt()) % arrayList3.size())).intValue();
                                    } else {
                                        abs = i3;
                                    }
                                    document2 = (TLRPC.Document) arrayList.get(abs);
                                    i3 = abs;
                                }
                                F1 = null;
                            }
                        }
                        if (document2 == null && F1 == null) {
                            return false;
                        }
                        yu3 yu3Var = new yu3();
                        yu3Var.h = z5;
                        yu3Var.i = z6;
                        if (!z6) {
                            yu3Var.f = ((random.nextInt() % 101) / 100.0f) * (f / 4.0f);
                            yu3Var.g = ((random.nextInt() % 101) / 100.0f) * (f2 / 4.0f);
                        }
                        yu3Var.p = i;
                        yu3Var.q = document2;
                        yu3Var.m = z3;
                        ImageReceiver imageReceiver = yu3Var.r;
                        imageReceiver.u0 = true;
                        imageReceiver.t0 = z;
                        if (gba.o() > 1) {
                            boolean z7 = w01.a;
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        int i9 = i3;
                        HashMap hashMap2 = this.f;
                        boolean z8 = z5;
                        if (F1 == null) {
                            int f3 = f();
                            boolean z9 = z4;
                            Integer num = (Integer) hashMap2.get(Long.valueOf(document2.id));
                            int intValue = (num == null ? 0 : num.intValue()) + 1;
                            hashMap2.put(Long.valueOf(document2.id), Integer.valueOf(intValue));
                            gl5 b = gl5.b(document2);
                            StringBuilder sb = new StringBuilder();
                            sb.append(intValue);
                            sb.append("_");
                            imageReceiver.w1 = de9.l(sb, yu3Var.p, "_");
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(f3);
                            sb2.append("_");
                            sb2.append(f3);
                            sb2.append(z9 ? "_pcache" : "");
                            yu3Var.r.d0(b, sb2.toString(), null, "tgs", this.c, 1);
                            imageReceiver.h1 = new xu3(this, yu3Var, z, k27Var);
                            if (imageReceiver.y() != null) {
                                imageReceiver.y().I(0, false, true);
                            }
                        } else {
                            boolean z10 = z4;
                            int f4 = f();
                            if (i6 > 0) {
                                Integer num2 = (Integer) hashMap2.get(Long.valueOf(document2.id));
                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                hashMap2.put(Long.valueOf(document2.id), Integer.valueOf((intValue2 + 1) % 4));
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(intValue2);
                                sb3.append("_");
                                imageReceiver.w1 = de9.l(sb3, yu3Var.p, "_");
                            }
                            yu3Var.q = document2;
                            gl5 d = gl5.d(F1, document2);
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(f4);
                            sb4.append("_");
                            sb4.append(f4);
                            sb4.append(z10 ? "_pcache" : "");
                            yu3Var.r.d0(d, sb4.toString(), null, "tgs", this.c, 1);
                        }
                        imageReceiver.m0(ConnectionsManager.DEFAULT_DATACENTER_ID);
                        imageReceiver.M(0);
                        if (imageReceiver.y() != null) {
                            if (yu3Var.h) {
                                imageReceiver.y().I(0, false, true);
                            }
                            imageReceiver.y().start();
                        }
                        arrayList2.add(yu3Var);
                        imageReceiver.I();
                        FrameLayout frameLayout = this.H;
                        imageReceiver.p0(frameLayout);
                        frameLayout.invalidate();
                        if (z && !z8 && y6c.h(this.b).n != this.J) {
                            int i10 = this.r;
                            if (i10 != 0 && i10 != i && (li3Var = this.E) != null) {
                                gl.r(li3Var);
                                this.E.run();
                            }
                            this.r = i;
                            this.w = str;
                            long j4 = this.s;
                            ArrayList arrayList4 = this.y;
                            ArrayList arrayList5 = this.x;
                            if (j4 == j) {
                                this.s = System.currentTimeMillis();
                                arrayList5.clear();
                                arrayList4.clear();
                                arrayList5.add(Long.valueOf(j));
                                arrayList4.add(Integer.valueOf(i9));
                            } else {
                                arrayList5.add(Long.valueOf(System.currentTimeMillis() - this.s));
                                arrayList4.add(Integer.valueOf(i9));
                            }
                            li3 li3Var2 = this.E;
                            if (li3Var2 != null) {
                                gl.r(li3Var2);
                                this.E = null;
                            }
                            li3 li3Var3 = new li3(this, (byte) 18);
                            this.E = li3Var3;
                            gl.e3(li3Var3, 500L);
                        }
                        if (!z2) {
                            return true;
                        }
                        na7.q1(this.b).G4(11, 0, this.J, this.K, str);
                        return true;
                    }
                    if (((yu3) arrayList2.get(i4)).p == i) {
                        i5++;
                        if (!z6 && (((yu3) arrayList2.get(i4)).r.y() == null || ((yu3) arrayList2.get(i4)).r.y().t())) {
                            return false;
                        }
                    }
                    if (((yu3) arrayList2.get(i4)).q != null && document != null && ((yu3) arrayList2.get(i4)).q.id == document.id) {
                        i6++;
                    }
                    i4++;
                }
            }
        }
        return false;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        Integer B1;
        if (i == kk7.x0) {
            if ("EmojiAnimations".equals((String) objArr[0])) {
                b();
                return;
            }
            return;
        }
        int i3 = kk7.V4;
        long j = this.J;
        if (i != i3) {
            if (i == 2 && (B1 = na7.q1(this.b).B1(j, this.K)) != null && B1.intValue() == 5) {
                tq4 tq4Var = this.F;
                if (tq4Var != null) {
                    gl.r(tq4Var);
                }
                this.F = null;
                return;
            }
            return;
        }
        if (this.a != null) {
            long longValue = ((Long) objArr[0]).longValue();
            TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = (TLRPC.TL_sendMessageEmojiInteraction) objArr[1];
            if (longValue == j && M.contains(tL_sendMessageEmojiInteraction.emoticon)) {
                int i4 = tL_sendMessageEmojiInteraction.msg_id;
                if (tL_sendMessageEmojiInteraction.interaction.data != null) {
                    try {
                        JSONArray jSONArray = new JSONObject(tL_sendMessageEmojiInteraction.interaction.data).getJSONArray("a");
                        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i5);
                            gl.e3(new wu3(this, i4, jSONObject.optInt("i", 1) - 1), (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public final void e(Canvas canvas) {
        ArrayList arrayList;
        float f;
        float f2;
        float f3;
        ImageReceiver imageReceiver;
        k27 k27Var;
        if (this.G.isEmpty()) {
            return;
        }
        int i = 0;
        while (true) {
            int size = this.G.size();
            arrayList = this.G;
            if (i >= size) {
                break;
            }
            yu3 yu3Var = (yu3) arrayList.get(i);
            if (this.a != null) {
                yu3Var.c = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= this.I.getChildCount()) {
                        f = 3.0f;
                        f2 = 2.0f;
                        f3 = 0.0f;
                        break;
                    }
                    View childAt = this.I.getChildAt(i2);
                    if (childAt instanceof gb2) {
                        gb2 gb2Var = (gb2) childAt;
                        k27Var = gb2Var.getMessageObject();
                        imageReceiver = gb2Var.getPhotoImage();
                    } else if (childAt instanceof uk1) {
                        uk1 uk1Var = (uk1) childAt;
                        k27Var = uk1Var.getMessageObject();
                        imageReceiver = uk1Var.getPhotoImage();
                    } else {
                        imageReceiver = null;
                        k27Var = null;
                    }
                    if (k27Var == null || k27Var.e1() != yu3Var.p) {
                        i2++;
                    } else {
                        yu3Var.c = true;
                        float x = childAt.getX() + this.I.getX();
                        float y = childAt.getY() + this.I.getY();
                        f3 = childAt.getY();
                        f = 3.0f;
                        float f4 = imageReceiver.N0;
                        yu3Var.d = f4;
                        f2 = 2.0f;
                        yu3Var.e = imageReceiver.O0;
                        if (yu3Var.i && (childAt instanceof gb2)) {
                            gb2 gb2Var2 = (gb2) childAt;
                            float f5 = (f() * gl.p) / 1.3f;
                            float f6 = f5 / 3.0f;
                            yu3Var.d = f6;
                            yu3Var.e = f6;
                            float f7 = f5 / 2.0f;
                            yu3Var.a = Utilities.i((gb2Var2.getTimeX() + x) - f7, gl.q.x - f5, 0.0f);
                            yu3Var.b = (gb2Var2.getTimeY() + y) - f7;
                        } else {
                            boolean z = yu3Var.h;
                            float f8 = x + imageReceiver.L0;
                            if (z) {
                                yu3Var.a = f8;
                                yu3Var.b = y + imageReceiver.M0;
                            } else {
                                float f9 = y + imageReceiver.M0;
                                float L = yu3Var.m ? ((-f4) * 2.0f) + gl.L(24.0f) + f8 : (-gl.L(24.0f)) + f8;
                                float f10 = f9 - imageReceiver.N0;
                                yu3Var.a = L;
                                yu3Var.b = f10;
                            }
                        }
                    }
                }
                if (!yu3Var.c || yu3Var.e + f3 < this.a.P9 || f3 > this.I.getMeasuredHeight() - this.a.Ya) {
                    yu3Var.n = true;
                }
                if (yu3Var.h) {
                    float f11 = yu3Var.e / f2;
                    boolean z2 = ((float) this.I.getMeasuredHeight()) - f3 <= f11;
                    boolean z3 = (f3 - this.a.P9) + f11 <= 0.0f;
                    if (z2 || z3) {
                        yu3Var.n = true;
                    }
                }
                if (yu3Var.n) {
                    float f12 = yu3Var.o;
                    if (f12 != 1.0f) {
                        float i3 = Utilities.i(f12 + 0.10666667f, 1.0f, 0.0f);
                        yu3Var.o = i3;
                        yu3Var.r.setAlpha(1.0f - i3);
                        this.a.m1.invalidate();
                    }
                }
            } else {
                f = 3.0f;
                f2 = 2.0f;
                g(yu3Var);
            }
            boolean z4 = !yu3Var.l && yu3Var.n;
            if (!z4) {
                if (!yu3Var.h || yu3Var.i) {
                    xl xlVar = yu3Var.j;
                    if (xlVar != null) {
                        float f13 = yu3Var.a + yu3Var.f;
                        float f14 = yu3Var.b + yu3Var.g;
                        float f15 = yu3Var.d * f;
                        xlVar.e((int) f13, (int) f14, (int) (f13 + f15), (int) (f14 + f15));
                        yu3Var.j.b(canvas);
                    } else {
                        ImageReceiver imageReceiver2 = yu3Var.r;
                        float f16 = yu3Var.a + yu3Var.f;
                        float f17 = yu3Var.b + yu3Var.g;
                        float f18 = yu3Var.d * f;
                        imageReceiver2.i0(f16, f17, f18, f18);
                        if (yu3Var.m) {
                            yu3Var.r.h(canvas, null);
                        } else {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, yu3Var.r.r(), yu3Var.r.s());
                            yu3Var.r.h(canvas, null);
                            canvas.restore();
                        }
                    }
                } else {
                    float f19 = yu3Var.e;
                    float f20 = 1.49926f * f19;
                    float f21 = 0.0546875f * f20;
                    float f22 = (((f19 / f2) + yu3Var.b) - (f20 / f2)) - (0.00279f * f20);
                    boolean z5 = yu3Var.m;
                    ImageReceiver imageReceiver3 = yu3Var.r;
                    float f23 = yu3Var.a;
                    if (z5) {
                        imageReceiver3.i0(((f23 + yu3Var.d) - f20) + f21, f22, f20, f20);
                    } else {
                        imageReceiver3.i0(f23 - f21, f22, f20, f20);
                    }
                    if (yu3Var.m) {
                        yu3Var.r.h(canvas, null);
                    } else {
                        canvas.save();
                        canvas.scale(-1.0f, 1.0f, yu3Var.r.r(), yu3Var.r.s());
                        yu3Var.r.h(canvas, null);
                        canvas.restore();
                    }
                }
            }
            xl xlVar2 = yu3Var.j;
            boolean c = xlVar2 != null ? xlVar2.c() : yu3Var.l && yu3Var.r.y() != null && yu3Var.r.y().b0 >= yu3Var.r.y().e[0] + (-2);
            if (yu3Var.o == 1.0f || c || z4) {
                yu3 yu3Var2 = (yu3) this.G.remove(i);
                if (yu3Var.h && yu3Var.r.y() != null) {
                    yu3Var2.r.y().I(0, true, true);
                }
                yu3Var2.r.K();
                xl xlVar3 = yu3Var2.j;
                if (xlVar3 != null) {
                    xlVar3.d(this.H);
                }
                i--;
            } else if (yu3Var.r.y() != null && yu3Var.r.y().l0) {
                yu3Var.l = true;
            } else if (yu3Var.r.y() != null && !yu3Var.r.y().l0) {
                yu3Var.r.y().I(0, true, false);
                yu3Var.r.y().start();
            }
            i++;
        }
        if (arrayList.isEmpty()) {
            h();
        }
        this.H.invalidate();
    }

    public final void i() {
        this.n = true;
        b();
        kk7.f(this.b).b(this, kk7.x0);
        kk7.f(this.b).b(this, kk7.V4);
        kk7.f(this.b).b(this, 2);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i >= arrayList.size()) {
                return;
            }
            ((yu3) arrayList.get(i)).r.I();
            if (((yu3) arrayList.get(i)).j != null) {
                ((yu3) arrayList.get(i)).j.f(this.H);
            }
            i++;
        }
    }

    public final void j() {
        int i = 0;
        this.n = false;
        kk7.f(this.b).n(this, kk7.x0);
        kk7.f(this.b).n(this, kk7.V4);
        kk7.f(this.b).n(this, 2);
        while (true) {
            ArrayList arrayList = this.G;
            if (i >= arrayList.size()) {
                arrayList.clear();
                return;
            }
            ((yu3) arrayList.get(i)).r.K();
            if (((yu3) arrayList.get(i)).j != null) {
                ((yu3) arrayList.get(i)).j.d(this.H);
            }
            i++;
        }
    }

    public final void k(gb2 gb2Var, mu1 mu1Var, boolean z) {
        if (mu1Var.y() || gb2Var.getMessageObject() == null || gb2Var.getMessageObject().e1() < 0) {
            return;
        }
        if (gb2Var.getMessageObject().V3() || mu1Var.f != null) {
            boolean z2 = false;
            boolean n = n(gb2Var, -1, z, false);
            if (z && n) {
                String V1 = gb2Var.getMessageObject().V1();
                if (!ow3.a(V1) && !"🍑".equals(V1) && !"⚰".equals(V1) && !gb2Var.getMessageObject().V3() && !gb2Var.getMessageObject().F2()) {
                    try {
                        gb2Var.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
            }
            if (gb2Var.getMessageObject().V3() || gb2Var.getEffect() != null || (!z && gb2Var.getMessageObject().o != null)) {
                gb2Var.getMessageObject().R = false;
                gb2Var.getMessageObject().k.premiumEffectWasPlayed = true;
                mu1Var.getMessagesStorage().U1(this.J, gb2Var.getMessageObject().k);
                return;
            }
            Integer B1 = na7.q1(this.b).B1(this.J, this.K);
            if ((B1 == null || B1.intValue() != 5) && this.F == null && n) {
                m21 m21Var = m21.w;
                if ((m21Var == null || !m21Var.l) && gba.a1 > 0 && y6c.h(this.b).e() != mu1Var.f.id) {
                    gba.a1--;
                    a.b.getSharedPreferences("mainconfig", 0).edit().putInt("emojiInteractionsHintCount", gba.a1).apply();
                    nza nzaVar = new nza(mu1Var.getParentActivity(), null, 1, -1, gb2Var.getMessageObject().F2() ? gb2Var.getMessageObject().F0() : hq6.d0(this.b).V(gb2Var.getMessageObject().V1()), mu1Var.getResourceProvider());
                    nzaVar.c.setVisibility(8);
                    nzaVar.b.setText(vu3.m(gl.T2(k96.a0("EmojiInteractionTapHint", null, 2131751165, mu1Var.f.first_name)), nzaVar.b.getPaint().getFontMetricsInt(), false, null, 0));
                    nzaVar.b.setTypeface(null);
                    nzaVar.b.setMaxLines(3);
                    nzaVar.b.setSingleLine(false);
                    tq4 tq4Var = new tq4(this, m21.g(mu1Var, nzaVar, 2750), z2, (byte) 7);
                    this.F = tq4Var;
                    gl.e3(tq4Var, 1500L);
                }
            }
        }
    }

    public final void l(gb2 gb2Var) {
        ArrayList arrayList;
        k27 messageObject = gb2Var.getMessageObject();
        if (messageObject.V3()) {
            return;
        }
        String V1 = messageObject.V1();
        if (V1 == null) {
            V1 = messageObject.k.message;
        }
        String p = p(V1);
        if (!M.contains(p) || (arrayList = (ArrayList) this.e.get(p)) == null || arrayList.isEmpty()) {
            return;
        }
        int min = Math.min(1, arrayList.size());
        for (int i = 0; i < min; i++) {
            m((TLRPC.Document) arrayList.get(i));
        }
    }

    public final void m(TLRPC.Document document) {
        if (document != null) {
            HashMap hashMap = this.L;
            if (hashMap == null || !hashMap.containsKey(Long.valueOf(document.id))) {
                HashMap hashMap2 = this.L;
                if (hashMap2 == null) {
                    hashMap2 = new HashMap();
                    this.L = hashMap2;
                }
                hashMap2.put(Long.valueOf(document.id), Boolean.TRUE);
                hq6.d0(this.b).m1(gl5.b(document), 2);
            }
        }
    }

    public final boolean n(gb2 gb2Var, int i, boolean z, boolean z2) {
        if (gb2Var == null || this.G.size() > 12) {
            return false;
        }
        k27 messageObject = gb2Var.getMessageObject();
        if (gb2Var.getEffect() == null && !gb2Var.getPhotoImage().E()) {
            return false;
        }
        String V1 = messageObject.V1();
        if (V1 == null) {
            V1 = messageObject.k.message;
        }
        if (gb2Var.getEffect() == null && V1 == null) {
            return false;
        }
        float f = gb2Var.getPhotoImage().O0;
        float f2 = gb2Var.getPhotoImage().N0;
        if (gb2Var.getEffect() != null || (f > 0.0f && f2 > 0.0f)) {
            return d(p(V1), gb2Var.getMessageObject().e1(), gb2Var.getMessageObject().F0(), messageObject, i, z, z2, f2, f, gb2Var.getMessageObject().O3());
        }
        return false;
    }

    public final void o(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, k27 k27Var) {
        mu1 mu1Var = this.a;
        if (mu1Var == null || na7.q1(this.b).E3() || mu1Var.getParentActivity() == null) {
            return;
        }
        nza nzaVar = new nza(this.H.getContext(), null, 1, -1, k27Var.F0(), mu1Var.getResourceProvider());
        nzaVar.b.setText(tL_messages_stickerSet.set.title);
        nzaVar.c.setText(k96.M0(2131746757, null));
        k21 k21Var = new k21(mu1Var.getResourceProvider(), mu1Var.getParentActivity(), true);
        nzaVar.setButton(k21Var);
        k21Var.b = new eu3(this, k27Var, (byte) 1);
        k21Var.e(k96.M0(2131743321, null));
        m21 g = m21.g(mu1Var, nzaVar, 2750);
        g.b = k27Var.e1();
        g.j();
    }

    public void h() {
    }

    public void g(yu3 yu3Var) {
    }

    public zu3(int i, FrameLayout frameLayout) {
        this.H = frameLayout;
        this.b = i;
    }
}
