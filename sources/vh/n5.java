package vh;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.provider.MediaStore;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.d20;
import org.telegram.messenger.ef;
import org.telegram.messenger.ff;
import org.telegram.messenger.hc;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.tz;
import org.telegram.messenger.u20;
import org.telegram.messenger.v20;
import org.telegram.messenger.vp;
import org.telegram.messenger.ye;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.mb;
import org.telegram.ui.px0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n5 {
    public String A;
    public int A0;
    public String B;
    public int B0;
    public long C;
    public CharSequence C0;
    public long D;
    public float E;
    public u6 E0;
    public long H;
    public boolean H0;
    public long I;
    public long J;
    public long J0;
    public boolean K;
    public File L;
    public TLRPC.InputMedia L0;
    public boolean M;
    public Bitmap M0;
    public String N;
    public File N0;
    public Bitmap O;
    public File O0;
    public File P0;
    public int Q;
    public File Q0;
    public int R;
    public File R0;
    public r S;
    public ArrayList T;
    public ArrayList T0;
    public List U0;
    public ArrayList V0;
    public File W0;
    public long X;
    public File X0;
    public boolean Y;
    public File Y0;
    public float Z;
    public File Z0;
    public ff a1;
    public long b;
    public boolean b0;
    public Bitmap b1;
    public boolean c;
    public TLRPC.Document c0;
    public boolean c1;
    public long d;
    public kg.d0 d0;
    public m5 d1;
    public long e;
    public int f;
    public boolean f0;
    public boolean g;
    public Bitmap g0;
    public boolean h;
    public long h0;
    public boolean j;
    public boolean k;
    public int k0;
    public boolean l;
    public int l0;
    public ArrayList m;
    public ye m0;
    public boolean n;
    public boolean o;
    public File o0;
    public SpannableStringBuilder p;
    public String p0;
    public TLRPC.Peer q;
    public long q0;
    public int r;
    public long r0;
    public String s;
    public float s0;
    public TLRPC.MessageMedia t;
    public boolean u;
    public ArrayList v;
    public TLRPC.InputPeer v0;
    public boolean w;
    public HashSet w0;
    public TLRPC.TL_error x;
    public Drawable x0;
    public String y;
    public TLRPC.InputDocument z;
    public final int a = d20.s0;
    public double i = -1.0d;
    public float F = 1.0f;
    public float G = 1.0f;
    public float P = 1.0f;
    public boolean U = false;
    public float V = 0.0f;
    public float W = 1.0f;
    public float a0 = 1.0f;
    public long e0 = -1;
    public int i0 = 720;
    public int j0 = 1280;
    public final Matrix n0 = new Matrix();
    public float t0 = 1.0f;
    public float u0 = 1.0f;
    public boolean y0 = org.telegram.ui.ActionBar.t6.I.q();
    public long z0 = Long.MIN_VALUE;
    public boolean D0 = true;
    public final ArrayList F0 = new ArrayList();
    public boolean G0 = true;
    public int I0 = 86400;
    public String K0 = "";
    public long S0 = 5000;
    public int e1 = 0;

    public static void C(BitmapFactory.Options options, int i10) {
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        int i11 = options.outWidth;
        int i12 = options.outHeight;
        if (i11 * i12 * 8 > maxMemory || Math.max(i11, i12) > 4200 || tz.o() <= 0) {
            options.inScaled = true;
            options.inDensity = options.outWidth;
            options.inTargetDensity = i10;
        }
    }

    public static Boolean D(jj jjVar) {
        TLRPC.Peer peer;
        if (jjVar != null) {
            int i10 = jjVar.I1;
            TLRPC.Message message = jjVar.k;
            if (message != null) {
                TLRPC.Chat L0 = vp.r1(i10).L0(Long.valueOf(-org.telegram.messenger.o5.o(message.peer_id)));
                if ((L0 == null || !L0.noforwards) && org.telegram.messenger.w3.V(L0)) {
                    return Boolean.FALSE;
                }
                TLRPC.MessageFwdHeader messageFwdHeader = jjVar.k.fwd_from;
                if (messageFwdHeader != null && (peer = messageFwdHeader.from_id) != null && (messageFwdHeader.flags & 4) != 0) {
                    long o10 = org.telegram.messenger.o5.o(peer);
                    TLRPC.Chat L02 = vp.r1(i10).L0(Long.valueOf(-o10));
                    if (o10 < 0 && ((L02 == null || !L02.noforwards) && org.telegram.messenger.w3.V(L02))) {
                        return Boolean.TRUE;
                    }
                }
                return null;
            }
        }
        return null;
    }

    public static n5 a(r rVar, ArrayList arrayList) {
        n5 n5Var = new n5();
        n5Var.S = rVar;
        n5Var.T = arrayList;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            n5 n5Var2 = (n5) obj;
            if (n5Var2.K) {
                n5Var.K = true;
                n5Var2.V = 0.0f;
                n5Var2.W = Math.min(1.0f, 59000.0f / n5Var2.h0);
            }
        }
        if (n5Var.K) {
            n5Var.k0 = 720;
            n5Var.l0 = 1280;
            n5Var.i0 = 720;
            n5Var.j0 = 1280;
        } else {
            n5Var.k0 = 1080;
            n5Var.l0 = 1920;
            n5Var.i0 = 1080;
            n5Var.j0 = 1920;
        }
        n5Var.A();
        return n5Var;
    }

    public static int d(BitmapFactory.Options options, int i10, int i11) {
        double min = (options.outHeight > i11 || options.outWidth > i10) ? Math.min((int) Math.ceil(r0 / i11), (int) Math.ceil(r6 / i10)) : 1;
        return Math.max(1, (int) Math.pow(min, Math.floor(Math.log(min) / Math.log(2.0d))));
    }

    public static void j(Canvas canvas, Drawable drawable, int i10, int i11) {
        if (drawable == null) {
            return;
        }
        Rect rect = new Rect(drawable.getBounds());
        Drawable.Callback callback = drawable.getCallback();
        drawable.setCallback(null);
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            float width = bitmapDrawable.getBitmap().getWidth();
            float height = bitmapDrawable.getBitmap().getHeight();
            float max = Math.max(i10 / width, i11 / height);
            drawable.setBounds(0, 0, (int) (width * max), (int) (height * max));
            drawable.draw(canvas);
        } else {
            drawable.setBounds(0, 0, i10, i11);
            drawable.draw(canvas);
        }
        drawable.setBounds(rect);
        drawable.setCallback(callback);
    }

    public static String k(File file) {
        String path;
        int lastIndexOf;
        if (file != null && (lastIndexOf = (path = file.getPath()).lastIndexOf(46)) > 0) {
            return path.substring(lastIndexOf + 1);
        }
        return null;
    }

    public static n5 l(ef efVar) {
        int i10;
        n5 n5Var = new n5();
        n5Var.L = new File(efVar.I);
        n5Var.Q = efVar.J;
        n5Var.R = efVar.K;
        n5Var.K = !efVar.d() && efVar.b;
        n5Var.N = efVar.c;
        long j10 = efVar.E * 1000;
        n5Var.h0 = j10;
        n5Var.Z = 0.0f;
        n5Var.a0 = Math.min(1.0f, 59000.0f / j10);
        if (n5Var.K && n5Var.N == null) {
            n5Var.N = "vthumb://" + efVar.C;
        }
        n5Var.A0 = efVar.T;
        n5Var.B0 = efVar.U;
        n5Var.h(n5Var.L.getAbsolutePath());
        int i11 = efVar.F;
        if (i11 > 0 && (i10 = efVar.G) > 0) {
            n5Var.k0 = i11;
            n5Var.l0 = i10;
        }
        n5Var.A();
        return n5Var;
    }

    public static n5 m(File file, int i10) {
        n5 n5Var = new n5();
        n5Var.L = file;
        n5Var.M = true;
        n5Var.Q = i10;
        n5Var.R = 0;
        n5Var.K = false;
        if (file != null) {
            n5Var.h(file.getAbsolutePath());
        }
        n5Var.A();
        return n5Var;
    }

    public static n5 n(File file, TL_stories.StoryItem storyItem) {
        n5 n5Var = new n5();
        n5Var.g = true;
        n5Var.f = storyItem.id;
        n5Var.L = file;
        n5Var.M = false;
        n5Var.k0 = 720;
        n5Var.l0 = 1280;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        boolean z10 = messageMedia instanceof TLRPC.TL_messageMediaPhoto;
        int i10 = n5Var.a;
        if (z10) {
            n5Var.K = false;
            if (file != null) {
                n5Var.h(file.getAbsolutePath());
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            n5Var.K = true;
            TLRPC.Document document = messageMedia.document;
            if (document != null && document.attributes != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= storyItem.media.document.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i11);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        n5Var.k0 = documentAttribute.w;
                        n5Var.l0 = documentAttribute.h;
                        n5Var.i = documentAttribute.duration;
                        break;
                    }
                    i11++;
                }
            }
            TLRPC.Document document2 = storyItem.media.document;
            if (document2 != null) {
                String str = storyItem.firstFramePath;
                if (str != null) {
                    n5Var.N = str;
                } else if (document2.thumbs != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= storyItem.media.document.thumbs.size()) {
                            break;
                        }
                        TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i12);
                        if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                            n5Var.O = hc.F(null, photoSize.bytes);
                            break;
                        }
                        org.telegram.messenger.b8.G(i10);
                        File K = org.telegram.messenger.b8.K(photoSize, null, true, true);
                        if (K != null && K.exists()) {
                            n5Var.N = K.getAbsolutePath();
                            break;
                        }
                        i12++;
                    }
                }
            }
        }
        ArrayList arrayList = n5Var.F0;
        arrayList.clear();
        ArrayList<TLRPC.PrivacyRule> arrayList2 = storyItem.privacy;
        vp r12 = vp.r1(i10);
        ArrayList arrayList3 = new ArrayList();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            TLRPC.PrivacyRule privacyRule = arrayList2.get(i13);
            if (privacyRule != null) {
                if (privacyRule instanceof TLRPC.TL_privacyValueAllowAll) {
                    arrayList3.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowCloseFriends) {
                    arrayList3.add(new TLRPC.TL_inputPrivacyValueAllowCloseFriends());
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowContacts) {
                    arrayList3.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers) {
                    TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers = (TLRPC.TL_privacyValueDisallowUsers) privacyRule;
                    TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
                    for (int i14 = 0; i14 < tL_privacyValueDisallowUsers.users.size(); i14++) {
                        Long l4 = tL_privacyValueDisallowUsers.users.get(i14);
                        l4.getClass();
                        TLRPC.InputUser p12 = r12.p1(r12.Z1(l4));
                        if (!(p12 instanceof TLRPC.TL_inputUserEmpty)) {
                            tL_inputPrivacyValueDisallowUsers.users.add(p12);
                        }
                    }
                    arrayList3.add(tL_inputPrivacyValueDisallowUsers);
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                    TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = (TLRPC.TL_privacyValueAllowUsers) privacyRule;
                    TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
                    for (int i15 = 0; i15 < tL_privacyValueAllowUsers.users.size(); i15++) {
                        Long l10 = tL_privacyValueAllowUsers.users.get(i15);
                        l10.getClass();
                        TLRPC.InputUser p13 = r12.p1(r12.Z1(l10));
                        if (!(p13 instanceof TLRPC.TL_inputUserEmpty)) {
                            tL_inputPrivacyValueAllowUsers.users.add(p13);
                        }
                    }
                    arrayList3.add(tL_inputPrivacyValueAllowUsers);
                }
            }
        }
        arrayList.addAll(arrayList3);
        n5Var.I0 = storyItem.expire_date - storyItem.date;
        try {
            CharSequence m10 = org.telegram.messenger.k6.m(new SpannableString(storyItem.caption), org.telegram.ui.ActionBar.t6.o2.getFontMetricsInt(), true, null, 0);
            jj.b(m10, storyItem.entities, true, false, true, false, 0);
            n5Var.C0 = jj.A5(m10, storyItem.entities, org.telegram.ui.ActionBar.t6.o2.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        n5Var.A();
        n5Var.e(storyItem);
        n5Var.m = storyItem.media_areas;
        n5Var.v0 = vp.r1(i10).i1(storyItem.dialogId);
        return n5Var;
    }

    public static n5 o(File file, String str, long j10) {
        n5 n5Var = new n5();
        n5Var.c1 = true;
        n5Var.L = file;
        n5Var.M = true;
        n5Var.Q = 0;
        n5Var.R = 0;
        n5Var.K = true;
        n5Var.h0 = j10;
        n5Var.N = str;
        n5Var.Z = 0.0f;
        n5Var.a0 = Math.min(1.0f, 59500.0f / j10);
        return n5Var;
    }

    public static long p(jj jjVar) {
        Boolean D = D(jjVar);
        if (D == null) {
            return 0L;
        }
        return D.booleanValue() ? org.telegram.messenger.o5.o(jjVar.k.fwd_from.from_id) : jj.B0(jjVar.k);
    }

    public static Bitmap q(l5 l5Var, int i10, int i11, int i12, boolean z10) {
        int i13;
        int i14;
        if (i12 == 90 || i12 == 270) {
            i13 = i10;
            i14 = i11;
        } else {
            i14 = i10;
            i13 = i11;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        l5Var.i(options);
        options.inJustDecodeBounds = false;
        options.inScaled = false;
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        int i15 = options.outWidth;
        int i16 = options.outHeight;
        boolean z11 = ((double) ((((long) (i14 * i13)) * 4) + (((long) (i15 * i16)) * 4))) * 1.1d <= ((double) maxMemory);
        if (i15 <= i14 && i16 <= i13) {
            return l5Var.i(options);
        }
        if (z10 && z11 && tz.o() >= 1) {
            Bitmap i17 = l5Var.i(options);
            float max = Math.max(i14 / i17.getWidth(), i13 / i17.getHeight());
            Bitmap createBitmap = Bitmap.createBitmap((int) (i17.getWidth() * max), (int) (i17.getHeight() * max), Bitmap.Config.ARGB_8888);
            Utilities.y(i17, createBitmap);
            Utilities.j(Math.round(1.0f / max), 8, 0);
            return createBitmap;
        }
        options.inScaled = true;
        int i18 = options.outWidth;
        float f7 = i14 / i18;
        int i19 = options.outHeight;
        if (f7 > i13 / i19) {
            options.inDensity = i18;
            options.inTargetDensity = i14;
        } else {
            options.inDensity = i19;
            options.inTargetDensity = i13;
        }
        return l5Var.i(options);
    }

    public static boolean u(TLRPC.Document document, String str) {
        long j10;
        if (document != null) {
            if (!"video/webm".equals(document.mime_type) && !"video/mp4".equals(document.mime_type)) {
                if (jj.K2(document, true)) {
                    RLottieNative a2 = RLottieNative.a(str, null, null, null, 0, null);
                    if (a2 != null) {
                        int i10 = a2.a[0];
                        a2.d();
                        j10 = i10;
                    } else {
                        j10 = 0;
                    }
                    if (j10 > 1) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [org.telegram.tgnet.TLRPC$PhotoSize, org.telegram.tgnet.TLRPC$TL_photoSize_layer127] */
    public static File w(int i10, String str) {
        TLRPC.TL_videoSize_layer127 tL_videoSize_layer127;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
        tL_fileLocationToBeDeprecated.volume_id = -2147483648L;
        tL_fileLocationToBeDeprecated.dc_id = TLObject.FLAG_31;
        tL_fileLocationToBeDeprecated.local_id = tz.p();
        tL_fileLocationToBeDeprecated.file_reference = new byte[0];
        if ("mp4".equals(str) || "webm".equals(str)) {
            TLRPC.TL_videoSize_layer127 tL_videoSize_layer1272 = new TLRPC.TL_videoSize_layer127();
            tL_videoSize_layer1272.location = tL_fileLocationToBeDeprecated;
            tL_videoSize_layer127 = tL_videoSize_layer1272;
        } else {
            ?? tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.location = tL_fileLocationToBeDeprecated;
            tL_videoSize_layer127 = tL_photoSize_layer127;
        }
        org.telegram.messenger.b8.G(i10);
        return org.telegram.messenger.b8.K(tL_videoSize_layer127, str, true, true);
    }

    public static File x(int i10, boolean z10) {
        return w(i10, z10 ? "mp4" : "jpg");
    }

    public static n5 y(ArrayList arrayList) {
        jj jjVar;
        int i10;
        n5 n5Var = new n5();
        n5Var.u = true;
        n5Var.v = arrayList;
        n5Var.i0 = 1080;
        n5Var.j0 = 1920;
        n5Var.z0 = p((jj) arrayList.get(0));
        v20 v20Var = new v20();
        v20Var.a = (byte) 6;
        v20Var.c = 0.5f;
        v20Var.d = 0.5f;
        ArrayList arrayList2 = new ArrayList();
        n5Var.T0 = arrayList2;
        arrayList2.add(v20Var);
        if (arrayList.size() == 1 && (jjVar = (jj) arrayList.get(0)) != null && ((i10 = jjVar.D) == 8 || i10 == 3 || i10 == 5)) {
            TLRPC.Message message = jjVar.k;
            if (message != null && message.attachPath != null) {
                n5Var.L = new File(jjVar.k.attachPath);
            }
            File file = n5Var.L;
            if (file == null || !file.exists()) {
                org.telegram.messenger.b8.G(n5Var.a);
                n5Var.L = org.telegram.messenger.b8.N(jjVar.k, false, true);
            }
            File file2 = n5Var.L;
            if (file2 != null && file2.exists()) {
                n5Var.K = true;
                n5Var.M = false;
                long L0 = (long) (jjVar.L0() * 1000.0d);
                n5Var.h0 = L0;
                n5Var.Z = 0.0f;
                n5Var.a0 = Math.min(1.0f, 59500.0f / L0);
                return n5Var;
            }
            n5Var.L = null;
        }
        return n5Var;
    }

    public final void A() {
        Matrix matrix = this.n0;
        matrix.reset();
        int i10 = this.k0;
        int i11 = this.l0;
        int i12 = this.Q;
        int i13 = this.R;
        matrix.postScale(i13 == 1 ? -1.0f : 1.0f, i13 == 2 ? -1.0f : 1.0f, i10 / 2.0f, i11 / 2.0f);
        if (i12 != 0) {
            matrix.postTranslate((-i10) / 2.0f, (-i11) / 2.0f);
            matrix.postRotate(i12);
            if (i12 == 90 || i12 == 270) {
                i11 = i10;
                i10 = i11;
            }
            matrix.postTranslate(i10 / 2.0f, i11 / 2.0f);
        }
        float f7 = i10;
        float f10 = this.i0 / f7;
        if (this.J0 != 0) {
            f10 = Math.min(f10, this.j0 / i11);
        } else {
            float f11 = i11;
            if (f11 / f7 > 1.29f) {
                f10 = Math.max(f10, this.j0 / f11);
            }
        }
        matrix.postScale(f10, f10);
        matrix.postTranslate(c3.i0.g(f7, f10, this.i0, 2.0f), c3.i0.g(i11, f10, this.j0, 2.0f));
    }

    public final void B() {
        if (!this.K || v() || this.g || this.n || this.h0 <= 69000 || !d20.i(this.a).q()) {
            return;
        }
        long j10 = this.h0 - 59000;
        long min = j10 > 10000 ? Math.min(59000L, j10) + 59000 : 59000L;
        long j11 = this.h0 - min;
        if (j11 > 10000) {
            min += Math.min(59000L, j11);
        }
        this.a0 = Math.min(1.0f, min / this.h0);
    }

    public final boolean E() {
        ArrayList arrayList;
        ArrayList arrayList2;
        jj jjVar;
        TLRPC.Message message;
        ArrayList arrayList3 = this.T0;
        if (!this.K && this.y == null && this.o0 == null && ((arrayList = this.v) == null || arrayList.size() != 1 || (jjVar = (jj) this.v.get(0)) == null || (message = jjVar.k) == null || !(message.action instanceof TLRPC.TL_messageActionStarGiftUnique))) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                    v20 v20Var = (v20) arrayList3.get(i10);
                    byte b10 = v20Var.a;
                    if (b10 != 0) {
                        if (b10 == 1 && (arrayList2 = v20Var.k) != null && !arrayList2.isEmpty()) {
                            for (int i11 = 0; i11 < v20Var.k.size(); i11++) {
                                u20 u20Var = (u20) v20Var.k.get(i11);
                                if (!u(u20Var.document, u20Var.a)) {
                                }
                            }
                        }
                    } else if (!u(v20Var.B, v20Var.j)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0261 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0291 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap b(float f7, Bitmap bitmap) {
        int i10;
        final int i11;
        Bitmap bitmap2;
        float f10;
        Paint paint;
        boolean z10;
        Paint paint2;
        Bitmap bitmap3;
        int i12;
        boolean z11;
        Matrix matrix = new Matrix();
        Paint paint3 = new Paint(7);
        int i13 = (int) (this.i0 * f7);
        int i14 = (int) (this.j0 * f7);
        Bitmap createBitmap = Bitmap.createBitmap(i13, i14, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        final int i15 = 0;
        if (this.Y0 != null) {
            try {
                Bitmap q6 = q(new l5() { // from class: vh.j5
                    @Override // vh.l5
                    public final Bitmap i(BitmapFactory.Options options) {
                        switch (i15) {
                            case 0:
                                return BitmapFactory.decodeFile(this.Y0.getPath(), options);
                            case 1:
                                return BitmapFactory.decodeFile(this.P0.getPath(), options);
                            case 2:
                                return BitmapFactory.decodeFile(this.W0.getPath(), options);
                            default:
                                return BitmapFactory.decodeFile(this.R0.getPath(), options);
                        }
                    }
                }, i13, i14, 0, true);
                canvas.save();
                float width = this.i0 / q6.getWidth();
                canvas.scale(width, width);
                matrix.postScale(f7, f7);
                canvas.drawBitmap(q6, 0.0f, 0.0f, paint3);
                canvas.restore();
                q6.recycle();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        } else {
            long j10 = this.z0;
            if (j10 == Long.MIN_VALUE) {
                Paint paint4 = new Paint(1);
                paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, canvas.getHeight(), new int[]{this.A0, this.B0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                i10 = 2;
                i11 = 0;
                canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), paint4);
                matrix.set(this.n0);
                if (bitmap == null) {
                    float width2 = this.k0 / bitmap.getWidth();
                    matrix.preScale(width2, width2);
                    matrix.postScale(f7, f7);
                    canvas.drawBitmap(bitmap, matrix, paint3);
                    return createBitmap;
                }
                if (v()) {
                    int i16 = i11;
                    while (i16 < this.T.size()) {
                        n5 n5Var = (n5) this.T.get(i16);
                        final File file = n5Var.Z0;
                        if (file == null) {
                            file = n5Var.L;
                        }
                        if (file != null) {
                            try {
                                boolean z12 = true;
                                try {
                                    Bitmap q10 = q(new l5() { // from class: vh.k5
                                        @Override // vh.l5
                                        public final Bitmap i(BitmapFactory.Options options) {
                                            switch (i11) {
                                            }
                                            return BitmapFactory.decodeFile(file.getPath(), options);
                                        }
                                    }, i13, i14, i11, true);
                                    canvas.save();
                                    RectF rectF = new RectF();
                                    int width3 = q10.getWidth();
                                    int height = q10.getHeight();
                                    if ((((Integer) org.telegram.messenger.i0.L0(file).first).intValue() / 90) % 2 == 1) {
                                        try {
                                            width3 = q10.getHeight();
                                            height = q10.getWidth();
                                        } catch (Exception e7) {
                                            e = e7;
                                            paint2 = paint3;
                                            bitmap3 = createBitmap;
                                            i12 = i16;
                                            org.telegram.messenger.f8.g(e, z12);
                                            i16 = i12 + 1;
                                            createBitmap = bitmap3;
                                            paint3 = paint2;
                                            i11 = 0;
                                        }
                                    }
                                    q qVar = (q) this.S.e.get(i16);
                                    z11 = true;
                                    float f11 = i13;
                                    bitmap3 = createBitmap;
                                    float f12 = i14;
                                    try {
                                        i12 = i16;
                                        try {
                                            paint2 = paint3;
                                            try {
                                                rectF.set(qVar.a(f11), qVar.c * (f12 / qVar.a.c), qVar.b(f11), (f12 / qVar.a.c) * (qVar.c + 1));
                                            } catch (Exception e10) {
                                                e = e10;
                                            }
                                        } catch (Exception e11) {
                                            e = e11;
                                            paint2 = paint3;
                                        }
                                        try {
                                            canvas.translate(rectF.centerX(), rectF.centerY());
                                            canvas.clipRect((-rectF.width()) / 2.0f, (-rectF.height()) / 2.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
                                            float max = Math.max(rectF.width() / width3, rectF.height() / height);
                                            canvas.scale(max, max);
                                            canvas.rotate(((Integer) r3.first).intValue());
                                            canvas.translate((-q10.getWidth()) / 2.0f, (-q10.getHeight()) / 2.0f);
                                            try {
                                                canvas.drawBitmap(q10, 0.0f, 0.0f, (Paint) null);
                                                canvas.restore();
                                            } catch (Exception e12) {
                                                e = e12;
                                                z12 = z11;
                                                org.telegram.messenger.f8.g(e, z12);
                                                i16 = i12 + 1;
                                                createBitmap = bitmap3;
                                                paint3 = paint2;
                                                i11 = 0;
                                            }
                                        } catch (Exception e13) {
                                            e = e13;
                                            z12 = z11;
                                            org.telegram.messenger.f8.g(e, z12);
                                            i16 = i12 + 1;
                                            createBitmap = bitmap3;
                                            paint3 = paint2;
                                            i11 = 0;
                                        }
                                    } catch (Exception e14) {
                                        e = e14;
                                        paint2 = paint3;
                                        i12 = i16;
                                    }
                                } catch (Exception e15) {
                                    e = e15;
                                    paint2 = paint3;
                                    bitmap3 = createBitmap;
                                    i12 = i16;
                                }
                            } catch (Exception e16) {
                                e = e16;
                                paint2 = paint3;
                                bitmap3 = createBitmap;
                                i12 = i16;
                                z11 = true;
                            }
                        } else {
                            paint2 = paint3;
                            bitmap3 = createBitmap;
                            i12 = i16;
                        }
                        i16 = i12 + 1;
                        createBitmap = bitmap3;
                        paint3 = paint2;
                        i11 = 0;
                    }
                    bitmap2 = createBitmap;
                    f10 = 0.0f;
                    paint = paint3;
                } else {
                    bitmap2 = createBitmap;
                    f10 = 0.0f;
                    final File file2 = this.Z0;
                    if (file2 == null) {
                        file2 = this.L;
                    }
                    if (file2 != null) {
                        try {
                            final int i17 = 1;
                            Bitmap q11 = q(new l5() { // from class: vh.k5
                                @Override // vh.l5
                                public final Bitmap i(BitmapFactory.Options options) {
                                    switch (i17) {
                                    }
                                    return BitmapFactory.decodeFile(file2.getPath(), options);
                                }
                            }, i13, i14, this.Q, true);
                            float width4 = this.k0 / q11.getWidth();
                            matrix.preScale(width4, width4);
                            matrix.postScale(f7, f7);
                            paint = paint3;
                            try {
                                canvas.drawBitmap(q11, matrix, paint);
                                q11.recycle();
                            } catch (Exception e17) {
                                e = e17;
                                z10 = true;
                                org.telegram.messenger.f8.g(e, true);
                                if (this.P0 != null) {
                                }
                                if (this.W0 != null) {
                                }
                                if (this.R0 != null) {
                                }
                            }
                        } catch (Exception e18) {
                            e = e18;
                            paint = paint3;
                        }
                    } else {
                        paint = paint3;
                    }
                }
                z10 = true;
                if (this.P0 != null) {
                    try {
                        final int i18 = z10 ? 1 : 0;
                        Bitmap q12 = q(new l5() { // from class: vh.j5
                            @Override // vh.l5
                            public final Bitmap i(BitmapFactory.Options options) {
                                switch (i18) {
                                    case 0:
                                        return BitmapFactory.decodeFile(this.Y0.getPath(), options);
                                    case 1:
                                        return BitmapFactory.decodeFile(this.P0.getPath(), options);
                                    case 2:
                                        return BitmapFactory.decodeFile(this.W0.getPath(), options);
                                    default:
                                        return BitmapFactory.decodeFile(this.R0.getPath(), options);
                                }
                            }
                        }, i13, i14, 0, z10);
                        canvas.save();
                        float width5 = this.i0 / q12.getWidth();
                        canvas.scale(width5, width5);
                        matrix.postScale(f7, f7);
                        canvas.drawBitmap(q12, f10, f10, paint);
                        canvas.restore();
                        q12.recycle();
                        z10 = true;
                    } catch (Exception e19) {
                        z10 = true;
                        org.telegram.messenger.f8.g(e19, true);
                    }
                }
                if (this.W0 != null) {
                    try {
                        final int i19 = i10;
                        Bitmap q13 = q(new l5() { // from class: vh.j5
                            @Override // vh.l5
                            public final Bitmap i(BitmapFactory.Options options) {
                                switch (i19) {
                                    case 0:
                                        return BitmapFactory.decodeFile(this.Y0.getPath(), options);
                                    case 1:
                                        return BitmapFactory.decodeFile(this.P0.getPath(), options);
                                    case 2:
                                        return BitmapFactory.decodeFile(this.W0.getPath(), options);
                                    default:
                                        return BitmapFactory.decodeFile(this.R0.getPath(), options);
                                }
                            }
                        }, i13, i14, 0, z10);
                        canvas.save();
                        float width6 = this.i0 / q13.getWidth();
                        canvas.scale(width6, width6);
                        matrix.postScale(f7, f7);
                        canvas.drawBitmap(q13, f10, f10, paint);
                        canvas.restore();
                        q13.recycle();
                        z10 = true;
                    } catch (Exception e20) {
                        z10 = true;
                        org.telegram.messenger.f8.g(e20, true);
                    }
                }
                if (this.R0 != null) {
                    return bitmap2;
                }
                try {
                    final int i20 = 3;
                    Bitmap q14 = q(new l5() { // from class: vh.j5
                        @Override // vh.l5
                        public final Bitmap i(BitmapFactory.Options options) {
                            switch (i20) {
                                case 0:
                                    return BitmapFactory.decodeFile(this.Y0.getPath(), options);
                                case 1:
                                    return BitmapFactory.decodeFile(this.P0.getPath(), options);
                                case 2:
                                    return BitmapFactory.decodeFile(this.W0.getPath(), options);
                                default:
                                    return BitmapFactory.decodeFile(this.R0.getPath(), options);
                            }
                        }
                    }, i13, i14, 0, z10);
                    canvas.save();
                    float width7 = this.i0 / q14.getWidth();
                    canvas.scale(width7, width7);
                    matrix.postScale(f7, f7);
                    canvas.drawBitmap(q14, f10, f10, paint);
                    canvas.restore();
                    q14.recycle();
                    return bitmap2;
                } catch (Exception e21) {
                    org.telegram.messenger.f8.g(e21, true);
                    return bitmap2;
                }
            }
            Drawable drawable = this.x0;
            if (drawable == null) {
                drawable = k4.e(null, this.a, j10, this.y0);
            }
            j(canvas, drawable, canvas.getWidth(), canvas.getHeight());
        }
        i10 = 2;
        i11 = 0;
        matrix.set(this.n0);
        if (bitmap == null) {
        }
    }

    public final void c(File file) {
        Bitmap b10 = b(1.0f, null);
        Bitmap bitmap = this.b1;
        if (bitmap != null) {
            bitmap.recycle();
            this.b1 = null;
        }
        this.b1 = Bitmap.createScaledBitmap(b10, 40, 22, true);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            b10.compress(Bitmap.CompressFormat.JPEG, 95, fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        b10.recycle();
    }

    public final void e(TL_stories.StoryItem storyItem) {
        if (storyItem != null && storyItem.media != null) {
            TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Photo photo = messageMedia.photo;
            if (photo == null) {
                TLRPC.Document document = messageMedia.document;
                if (document != null && jj.V2(document)) {
                    TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = new TLRPC.TL_inputStickeredMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputStickeredMediaDocument.id = tL_inputDocument;
                    tL_inputDocument.id = document.id;
                    tL_inputDocument.access_hash = document.access_hash;
                    byte[] bArr = document.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
                    this.e1 = ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getAttachedStickers, new mb(this, storyItem, tL_messages_getAttachedStickers, new ag.c(this, 24), 18));
                }
            } else if (photo.has_stickers) {
                TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputStickeredMediaPhoto.id = tL_inputPhoto;
                tL_inputPhoto.id = photo.id;
                tL_inputPhoto.access_hash = photo.access_hash;
                byte[] bArr2 = photo.file_reference;
                tL_inputPhoto.file_reference = bArr2;
                if (bArr2 == null) {
                    tL_inputPhoto.file_reference = new byte[0];
                }
                tL_messages_getAttachedStickers.media = tL_inputStickeredMediaPhoto;
                this.e1 = ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getAttachedStickers, new mb(this, storyItem, tL_messages_getAttachedStickers, new ag.c(this, 24), 18));
            }
        }
    }

    public final void f() {
        File file = this.P0;
        if (file != null) {
            file.delete();
            this.P0 = null;
        }
        File file2 = this.Y0;
        if (file2 != null) {
            file2.delete();
            this.Y0 = null;
        }
        File file3 = this.W0;
        if (file3 != null) {
            file3.delete();
            this.W0 = null;
        }
        File file4 = this.X0;
        if (file4 != null) {
            file4.delete();
            this.X0 = null;
        }
        File file5 = this.R0;
        if (file5 != null) {
            file5.delete();
            this.R0 = null;
        }
    }

    public final n5 g() {
        n5 n5Var = new n5();
        n5Var.b = this.b;
        n5Var.c = this.c;
        n5Var.d = this.d;
        n5Var.e = this.e;
        n5Var.f = this.f;
        n5Var.g = this.g;
        n5Var.h = this.h;
        n5Var.i = this.i;
        n5Var.j = this.j;
        n5Var.k = this.k;
        n5Var.l = this.l;
        n5Var.m = this.m;
        n5Var.w = this.w;
        n5Var.x = this.x;
        n5Var.y = this.y;
        n5Var.z = this.z;
        n5Var.A = this.A;
        n5Var.B = this.B;
        n5Var.C = this.C;
        n5Var.D = this.D;
        n5Var.E = this.E;
        n5Var.F = this.F;
        n5Var.G = this.G;
        n5Var.H = this.H;
        n5Var.I = this.I;
        n5Var.J = this.J;
        n5Var.K = this.K;
        n5Var.L = this.L;
        n5Var.M = this.M;
        boolean z10 = this.M;
        int i10 = this.a;
        if (z10) {
            File w9 = w(i10, k(this.L));
            n5Var.L = w9;
            org.telegram.messenger.i0.F(this.L, w9);
        }
        n5Var.N = this.N;
        n5Var.Y = this.Y;
        n5Var.Z = this.Z;
        n5Var.a0 = this.a0;
        n5Var.h0 = this.h0;
        n5Var.k0 = this.k0;
        n5Var.l0 = this.l0;
        n5Var.i0 = this.i0;
        n5Var.j0 = this.j0;
        n5Var.v0 = this.v0;
        n5Var.R = this.R;
        n5Var.n0.set(this.n0);
        n5Var.A0 = this.A0;
        n5Var.B0 = this.B0;
        n5Var.C0 = this.C0;
        n5Var.D0 = this.D0;
        n5Var.E0 = this.E0;
        ArrayList arrayList = n5Var.F0;
        arrayList.clear();
        arrayList.addAll(this.F0);
        n5Var.G0 = this.G0;
        n5Var.H0 = this.H0;
        n5Var.I0 = this.I0;
        n5Var.M0 = this.M0;
        n5Var.N0 = this.N0;
        n5Var.w0 = this.w0;
        File file = this.N0;
        if (file != null && file.exists()) {
            File w10 = w(i10, k(this.N0));
            n5Var.N0 = w10;
            org.telegram.messenger.i0.F(this.N0, w10);
        }
        n5Var.O0 = this.O0;
        File file2 = this.O0;
        if (file2 != null && file2.exists()) {
            File w11 = w(i10, k(this.O0));
            n5Var.O0 = w11;
            org.telegram.messenger.i0.F(this.O0, w11);
        }
        n5Var.P0 = this.P0;
        File file3 = this.P0;
        if (file3 != null && file3.exists()) {
            File w12 = w(i10, k(this.P0));
            n5Var.P0 = w12;
            org.telegram.messenger.i0.F(this.P0, w12);
        }
        n5Var.W0 = this.W0;
        File file4 = this.W0;
        if (file4 != null && file4.exists()) {
            File w13 = w(i10, k(this.W0));
            n5Var.W0 = w13;
            org.telegram.messenger.i0.F(this.W0, w13);
        }
        n5Var.Y0 = this.Y0;
        File file5 = this.Y0;
        if (file5 != null && file5.exists()) {
            File w14 = w(i10, k(this.Y0));
            n5Var.Y0 = w14;
            org.telegram.messenger.i0.F(this.Y0, w14);
        }
        n5Var.Q0 = this.Q0;
        File file6 = this.Q0;
        if (file6 != null && file6.exists()) {
            File w15 = w(i10, k(this.Q0));
            n5Var.Q0 = w15;
            org.telegram.messenger.i0.F(this.Q0, w15);
        }
        n5Var.R0 = this.R0;
        File file7 = this.R0;
        if (file7 != null && file7.exists()) {
            File w16 = w(i10, k(this.R0));
            n5Var.R0 = w16;
            org.telegram.messenger.i0.F(this.R0, w16);
        }
        n5Var.S0 = this.S0;
        n5Var.T0 = new ArrayList();
        if (this.T0 != null) {
            for (int i11 = 0; i11 < this.T0.size(); i11++) {
                n5Var.T0.add(((v20) this.T0.get(i11)).a());
            }
        }
        n5Var.U0 = this.U0;
        n5Var.V0 = this.V0;
        n5Var.Z0 = this.Z0;
        File file8 = this.Z0;
        if (file8 != null && file8.exists()) {
            File w17 = w(i10, k(this.Z0));
            n5Var.Z0 = w17;
            org.telegram.messenger.i0.F(this.Z0, w17);
        }
        n5Var.a1 = this.a1;
        n5Var.b1 = this.b1;
        n5Var.c1 = this.c1;
        n5Var.O = this.O;
        n5Var.n = this.n;
        n5Var.o = this.o;
        n5Var.o0 = this.o0;
        n5Var.s0 = this.s0;
        n5Var.t0 = this.t0;
        n5Var.q0 = this.q0;
        n5Var.p0 = this.p0;
        n5Var.r0 = this.r0;
        n5Var.u0 = this.u0;
        n5Var.b0 = this.b0;
        n5Var.J0 = this.J0;
        n5Var.K0 = this.K0;
        n5Var.L0 = this.L0;
        n5Var.e0 = this.e0;
        n5Var.T = this.T;
        n5Var.S = this.S;
        n5Var.U = this.U;
        n5Var.X = this.X;
        n5Var.P = this.P;
        return n5Var;
    }

    public final void h(String str) {
        if (str != null) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                this.k0 = options.outWidth;
                this.l0 = options.outHeight;
            } catch (Exception unused) {
            }
        }
        if (this.K) {
            return;
        }
        if (((int) Math.max(this.k0, (this.l0 / 16.0f) * 9.0f)) <= 900) {
            this.i0 = 720;
            this.j0 = 1280;
        } else {
            this.i0 = 1080;
            this.j0 = 1920;
        }
    }

    public final void i(boolean z10) {
        if (this.M0 != null) {
            this.M0 = null;
        }
        File file = this.N0;
        if (file != null) {
            file.delete();
            this.N0 = null;
        }
        if (!z10) {
            f();
            File file2 = this.Z0;
            if (file2 != null) {
                file2.delete();
                this.Z0 = null;
            }
            File file3 = this.L;
            if (file3 != null) {
                if (this.M && (!this.g || this.j)) {
                    file3.delete();
                }
                this.L = null;
            }
            if (this.N != null) {
                if (this.M) {
                    new File(this.N).delete();
                }
                this.N = null;
            }
            ArrayList arrayList = this.T0;
            if (arrayList != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    v20 v20Var = (v20) obj;
                    if (v20Var.a == 2 && !TextUtils.isEmpty(v20Var.t)) {
                        try {
                            new File(v20Var.t).delete();
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                        v20Var.t = "";
                    }
                }
            }
            File file4 = this.o0;
            if (file4 != null && (!this.g || this.j)) {
                file4.delete();
                this.o0 = null;
            }
            if (this.p0 != null && (!this.g || this.j)) {
                try {
                    new File(this.p0).delete();
                } catch (Exception unused) {
                }
                this.p0 = null;
            }
        }
        this.O = null;
        if (this.T != null) {
            for (int i11 = 0; i11 < this.T.size(); i11++) {
                ((n5) this.T.get(i11)).i(z10);
            }
        }
        if (this.e1 != 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.e1, true);
        }
    }

    public final int r() {
        if (!this.K || v() || this.g) {
            return 1;
        }
        long j10 = this.h0;
        if (j10 <= 0 || this.n) {
            return 1;
        }
        if (((long) ((this.a0 - this.Z) * j10)) < 68999) {
            return 1;
        }
        return (int) Math.ceil(r0 / 59000.0f);
    }

    public final void s(q20 q20Var) {
        int i10;
        if (!E()) {
            q20Var.a(null);
            return;
        }
        if (!this.K && ((i10 = this.i0) > 720 || this.j0 > 1280)) {
            float f7 = 720.0f / i10;
            this.n0.postScale(f7, f7, 0.0f, 0.0f);
            this.i0 = 720;
            this.j0 = 1280;
        }
        File file = this.L;
        String absolutePath = file == null ? null : file.getAbsolutePath();
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, Math.max(1, v() ? this.T.size() : 0), 11);
        iArr[0] = new int[11];
        px0 px0Var = new px0(this, absolutePath, iArr, q20Var, 27);
        if (!v()) {
            if (this.L == null) {
                px0Var.run();
                return;
            } else {
                Utilities.e.c(new rh.l5(absolutePath, iArr, px0Var, 16));
                return;
            }
        }
        String[] strArr = new String[this.T.size()];
        for (int i11 = 0; i11 < this.T.size(); i11++) {
            strArr[i11] = ((n5) this.T.get(i11)).L == null ? null : ((n5) this.T.get(i11)).L.getAbsolutePath();
            iArr[i11] = new int[11];
        }
        Utilities.e.c(new rh.l5(strArr, iArr, px0Var, 15));
    }

    public final boolean t() {
        if (v()) {
            for (int i10 = 0; i10 < this.T.size(); i10++) {
                if (((n5) this.T.get(i10)).K) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean v() {
        return (this.S == null || this.T == null) ? false : true;
    }

    public final void z(Runnable runnable) {
        Bitmap bitmap;
        if (this.K && this.A0 == 0 && this.B0 == 0) {
            if (this.N == null) {
                Bitmap bitmap2 = this.O;
                if (bitmap2 != null) {
                    int[] b10 = w7.l8.b(bitmap2, true);
                    this.A0 = b10[0];
                    this.B0 = b10[1];
                    runnable.run();
                    return;
                }
                return;
            }
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (this.N.startsWith("vthumb://")) {
                    long parseInt = Integer.parseInt(this.N.substring(9));
                    options.inJustDecodeBounds = true;
                    MediaStore.Video.Thumbnails.getThumbnail(org.telegram.messenger.w0.b.getContentResolver(), parseInt, 1, options);
                    options.inSampleSize = d(options, zs.P3, zs.P3);
                    options.inJustDecodeBounds = false;
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                    options.inDither = true;
                    bitmap = MediaStore.Video.Thumbnails.getThumbnail(org.telegram.messenger.w0.b.getContentResolver(), parseInt, 1, options);
                } else {
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(this.N);
                    options.inSampleSize = d(options, zs.P3, zs.P3);
                    options.inJustDecodeBounds = false;
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                    options.inDither = true;
                    bitmap = BitmapFactory.decodeFile(this.N);
                }
            } catch (Exception unused) {
                bitmap = null;
            }
            if (bitmap != null) {
                int[] b11 = w7.l8.b(bitmap, true);
                this.A0 = b11[0];
                this.B0 = b11[1];
                bitmap.recycle();
                runnable.run();
            }
        }
    }
}
