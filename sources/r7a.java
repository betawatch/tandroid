// default package

import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.text.Spannable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.SparseArray;
import android.webkit.MimeTypeMap;
import j$.util.Map;
import j$.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.TwoStepVerificationActivity;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class r7a extends rf0 implements fn7 {
    public static final to3 J = new to3("mediaSendQueue");
    public static final ThreadPoolExecutor K;
    public static volatile r7a[] L;
    public final zh6 E;
    public final HashMap F;
    public final HashMap G;
    public final fp H;
    public final HashMap I;
    public final HashMap a;
    public final SparseArray b;
    public final SparseArray c;
    public final SparseArray d;
    public final SparseArray e;
    public final zh6 f;
    public final zh6 h;
    public final HashMap n;
    public final HashMap r;
    public final HashMap s;
    public final HashMap w;
    public final zh6 x;
    public final HashMap y;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        K = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        L = new r7a[4];
    }

    public r7a(int i) {
        super(i);
        this.a = new HashMap();
        this.b = new SparseArray();
        this.c = new SparseArray();
        this.d = new SparseArray();
        this.e = new SparseArray();
        this.f = new zh6();
        this.h = new zh6();
        this.n = new HashMap();
        this.r = new HashMap();
        this.s = new HashMap();
        this.w = new HashMap();
        this.x = new zh6();
        this.y = new HashMap();
        this.E = new zh6();
        this.F = new HashMap();
        this.G = new HashMap();
        this.H = new fp(new ve9((Object) this, (byte) 7));
        this.I = new HashMap();
        hl.c3(new ux9(this, (byte) 15));
    }

    public static void A0(TLRPC.Message message, SerializedData serializedData) {
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia == null) {
            new TLRPC.TL_messageMediaEmpty().serializeToStream(serializedData);
        } else {
            messageMedia.serializeToStream(serializedData);
        }
        String str = message.message;
        if (str == null) {
            str = "";
        }
        serializedData.writeString(str);
        String str2 = message.attachPath;
        serializedData.writeString(str2 != null ? str2 : "");
        int size = message.entities.size();
        serializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            message.entities.get(i).serializeToStream(serializedData);
        }
    }

    public static r7a B(int i) {
        r7a r7aVar;
        r7a r7aVar2 = L[i];
        if (r7aVar2 != null) {
            return r7aVar2;
        }
        synchronized (r7a.class) {
            r7aVar = L[i];
            if (r7aVar == null) {
                r7a[] r7aVarArr = L;
                r7a r7aVar3 = new r7a(i);
                r7aVarArr[i] = r7aVar3;
                r7aVar = r7aVar3;
            }
        }
        return r7aVar;
    }

    public static String C(k5 k5Var, TLRPC.PhotoSize photoSize, Bitmap[] bitmapArr, boolean z, boolean z2) {
        if (photoSize == null || photoSize.location == null) {
            return null;
        }
        PointF S1 = wb2.S1(photoSize.w, photoSize.h, 0, 0);
        if (bitmapArr != null) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                xb4.G(k5Var.a);
                File J2 = xb4.J(photoSize, null, z2, true);
                FileInputStream fileInputStream = new FileInputStream(J2);
                BitmapFactory.decodeStream(fileInputStream, null, options);
                fileInputStream.close();
                float max = Math.max(options.outWidth / S1.x, options.outHeight / S1.y);
                if (max < 1.0f) {
                    max = 1.0f;
                }
                options.inJustDecodeBounds = false;
                options.inSampleSize = (int) max;
                options.inPreferredConfig = Bitmap.Config.RGB_565;
                FileInputStream fileInputStream2 = new FileInputStream(J2);
                bitmapArr[0] = BitmapFactory.decodeStream(fileInputStream2, null, options);
                fileInputStream2.close();
            } catch (Throwable unused) {
            }
        }
        return String.format(Locale.US, z ? "%d_%d@%d_%d_b" : "%d_%d@%d_%d", Long.valueOf(photoSize.location.volume_id), Integer.valueOf(photoSize.location.local_id), Integer.valueOf((int) (S1.x / hl.p)), Integer.valueOf((int) (S1.y / hl.p)));
    }

    public static long D() {
        long j = 0;
        while (j == 0) {
            j = Utilities.b.nextLong();
        }
        return j;
    }

    public static TLRPC.PhotoSize F(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) arrayList.get(i);
            if (photoSize != null && !(photoSize instanceof TLRPC.TL_photoPathSize) && !(photoSize instanceof TLRPC.TL_photoSizeEmpty) && photoSize.location != null) {
                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                    return photoSize;
                }
                TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
                tL_photoSize_layer127.type = photoSize.type;
                tL_photoSize_layer127.w = photoSize.w;
                tL_photoSize_layer127.h = photoSize.h;
                tL_photoSize_layer127.size = photoSize.size;
                byte[] bArr = photoSize.bytes;
                tL_photoSize_layer127.bytes = bArr;
                if (bArr == null) {
                    tL_photoSize_layer127.bytes = new byte[0];
                }
                TLRPC.TL_fileLocation_layer82 tL_fileLocation_layer82 = new TLRPC.TL_fileLocation_layer82();
                tL_photoSize_layer127.location = tL_fileLocation_layer82;
                TLRPC.FileLocation fileLocation = photoSize.location;
                tL_fileLocation_layer82.dc_id = fileLocation.dc_id;
                tL_fileLocation_layer82.volume_id = fileLocation.volume_id;
                tL_fileLocation_layer82.local_id = fileLocation.local_id;
                tL_fileLocation_layer82.secret = fileLocation.secret;
                return tL_photoSize_layer127;
            }
        }
        return null;
    }

    public static CharSequence G(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        CharSequence m1 = hl.m1(charSequence);
        if (m1.length() == 0) {
            return m1;
        }
        while (charSequence.length() > 0 && charSequence.charAt(0) == '\n') {
            charSequence = charSequence.subSequence(1, charSequence.length());
        }
        while (charSequence.length() > 0 && charSequence.charAt(charSequence.length() - 1) == '\n') {
            charSequence = charSequence.subSequence(0, charSequence.length() - 1);
        }
        return charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x01d5, code lost:
    
        if (w0(r9.a, null) != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01eb, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01df, code lost:
    
        if (android.text.TextUtils.isEmpty(r9.d) != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0662, code lost:
    
        if (r8 == (r50 - 1)) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0a9d, code lost:
    
        if (r1 == (r59 - 1)) goto L461;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0a5f, code lost:
    
        if (r85.size() == r15) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x07c1, code lost:
    
        if (r3 == null) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0183, code lost:
    
        if (r4 != false) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0468 A[Catch: Exception -> 0x04a0, TryCatch #11 {Exception -> 0x04a0, blocks: (B:204:0x0455, B:190:0x045e, B:192:0x0468, B:194:0x047f, B:197:0x0489, B:199:0x048f, B:200:0x049c, B:202:0x0472), top: B:203:0x0455 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x047f A[Catch: Exception -> 0x04a0, TryCatch #11 {Exception -> 0x04a0, blocks: (B:204:0x0455, B:190:0x045e, B:192:0x0468, B:194:0x047f, B:197:0x0489, B:199:0x048f, B:200:0x049c, B:202:0x0472), top: B:203:0x0455 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0472 A[Catch: Exception -> 0x04a0, TryCatch #11 {Exception -> 0x04a0, blocks: (B:204:0x0455, B:190:0x045e, B:192:0x0468, B:194:0x047f, B:197:0x0489, B:199:0x048f, B:200:0x049c, B:202:0x0472), top: B:203:0x0455 }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x08c6  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0989  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x07be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0b6b  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0cd9  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x0e32  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x0e3a  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0e4d  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0ed4  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x0ee5  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0efc  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x0f45  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0f5a  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x106d  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x107a  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x1089  */
    /* JADX WARN: Removed duplicated region for block: B:659:0x1094 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:662:0x109e  */
    /* JADX WARN: Removed duplicated region for block: B:668:0x10ac  */
    /* JADX WARN: Removed duplicated region for block: B:670:0x10af  */
    /* JADX WARN: Removed duplicated region for block: B:673:0x10e9  */
    /* JADX WARN: Removed duplicated region for block: B:678:0x10fc  */
    /* JADX WARN: Removed duplicated region for block: B:680:0x1103 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:688:0x1132 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:698:0x116d A[LOOP:5: B:696:0x1165->B:698:0x116d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:714:0x0fad  */
    /* JADX WARN: Removed duplicated region for block: B:716:0x0f4b  */
    /* JADX WARN: Removed duplicated region for block: B:722:0x0eb1  */
    /* JADX WARN: Removed duplicated region for block: B:723:0x0e37  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:755:0x0fc2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:802:0x11e4  */
    /* JADX WARN: Removed duplicated region for block: B:805:0x1201  */
    /* JADX WARN: Removed duplicated region for block: B:806:0x0b6d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0286  */
    /* JADX WARN: Type inference failed for: r0v154 */
    /* JADX WARN: Type inference failed for: r0v155, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v167 */
    /* JADX WARN: Type inference failed for: r3v116 */
    /* JADX WARN: Type inference failed for: r3v90 */
    /* JADX WARN: Type inference failed for: r3v91 */
    /* JADX WARN: Type inference failed for: r3v95, types: [org.telegram.tgnet.TLRPC$TL_photo] */
    /* JADX WARN: Type inference failed for: r3v98 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v71, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v72 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void J(ArrayList arrayList, final long j, boolean z, boolean z2, boolean z3, final k5 k5Var, long j2, final r47 r47Var, final TLRPC.TL_inputPollAnswer tL_inputPollAnswer, final r47 r47Var2, final r47 r47Var3, final boolean z4, final int i, final int i2, final TL_stories.StoryItem storyItem, final ou1 ou1Var, final c5a c5aVar, final long j3, final boolean z5, final long j4, final long j5, final b77 b77Var, final ki8 ki8Var, boolean z6, kj4 kj4Var, final boolean z7) {
        String str;
        String str2;
        ?? r5;
        String str3;
        String str4;
        HashMap hashMap;
        boolean z8;
        int i3;
        long j6;
        long j7;
        ro6 ro6Var;
        int i4;
        ArrayList arrayList2;
        HashMap hashMap2;
        int i5;
        String str5;
        String str6;
        String str7;
        HashMap hashMap3;
        long j8;
        boolean z9;
        String str8;
        String str9;
        int i6;
        oec oecVar;
        int i7;
        String str10;
        String str11;
        ArrayList arrayList3;
        long j9;
        boolean z10;
        k5 k5Var2;
        String str12;
        String str13;
        String str14;
        File file;
        String str15;
        Object obj;
        String str16;
        Object obj2;
        oec oecVar2;
        long j10;
        String str17;
        boolean z11;
        TLRPC.TL_document tL_document;
        String str18;
        String str19;
        q7a q7aVar;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        String str20;
        int i8;
        String str21;
        String str22;
        final oec oecVar3;
        String str23;
        Bitmap bitmap;
        int i9;
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize m;
        final HashMap hashMap4;
        int i10;
        long j11;
        ArrayList arrayList4;
        int i11;
        int size;
        int i12;
        Object obj9;
        Object obj10;
        String str24;
        Bitmap decodeFile;
        q7a q7aVar2;
        int i13;
        int i14;
        TLRPC.PhotoSize photoSize2;
        String str25;
        TLRPC.TL_document tL_document2;
        oec oecVar4;
        oec oecVar5;
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo;
        int i15;
        int i16;
        TLRPC.FileLocation fileLocation;
        Bitmap decodeFile2;
        ro6 ro6Var2;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        String str32;
        String str33;
        String str34;
        boolean z12;
        String str35;
        String str36;
        String str37;
        Object obj11;
        Object obj12;
        Object obj13;
        String str38;
        String str39;
        int i17;
        String str40;
        Object obj14;
        String str41;
        TLRPC.TL_photo tL_photo;
        String str42;
        final TLRPC.TL_photo tL_photo2;
        int i18;
        String str43;
        Object[] e0;
        Object obj15;
        String str44;
        ArrayList arrayList5;
        int i19;
        int i20;
        long j12;
        TLRPC.TL_photo tL_photo3;
        ArrayList arrayList6;
        Uri uri;
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        Uri uri2;
        Uri uri3;
        boolean z13;
        int i21;
        File file2;
        TLRPC.TL_document tL_document3;
        String str45;
        File file3;
        TLRPC.TL_document tL_document4;
        File file4;
        int i22;
        Bitmap G;
        String str46;
        String str47;
        int i23;
        String str48;
        boolean z14;
        boolean z15;
        String str49;
        String str50;
        q7a q7aVar3;
        boolean z16;
        TLRPC.TL_photo tL_photo4;
        String str51;
        int i24;
        Object[] e02;
        String str52;
        ?? r3;
        Object[] e03;
        Object obj16;
        Uri uri4;
        Uri uri5;
        Bitmap decodeFile3;
        ArrayList arrayList7 = arrayList;
        k5 k5Var3 = k5Var;
        long currentTimeMillis = System.currentTimeMillis();
        int size2 = arrayList7.size();
        int i25 = 0;
        while (true) {
            str = ".jpeg";
            str2 = "-2147483648_";
            r5 = 1;
            if (i25 >= size2) {
                break;
            }
            q7a q7aVar4 = (q7a) arrayList7.get(i25);
            if (q7aVar4.c != null && q7aVar4.p && q7aVar4.q) {
                File file5 = new File(q7aVar4.c);
                File file6 = new File(xb4.z(4), "-2147483648_" + xea.p() + ".jpeg");
                long j13 = q7aVar4.z;
                try {
                    if (TextUtils.isEmpty(q7aVar4.b)) {
                        m(0L, j13, file5, file6);
                        q7aVar4.c = file6.getAbsolutePath();
                        Pair L0 = hl.L0(file6);
                        if (((Integer) L0.first).intValue() != 0 && (decodeFile3 = BitmapFactory.decodeFile(file6.getAbsolutePath())) != null) {
                            int intValue = ((Integer) L0.second).intValue();
                            Matrix matrix = new Matrix();
                            matrix.postScale(intValue == 1 ? -1.0f : 1.0f, intValue == 2 ? -1.0f : 1.0f, decodeFile3.getWidth() / 2.0f, decodeFile3.getHeight() / 2.0f);
                            matrix.postRotate(((Integer) L0.first).intValue());
                            Bitmap createBitmap = Bitmap.createBitmap(decodeFile3, 0, 0, decodeFile3.getWidth(), decodeFile3.getHeight(), matrix, true);
                            File file7 = new File(xb4.z(4), "-2147483648_" + xea.p() + ".jpeg");
                            createBitmap.compress(Bitmap.CompressFormat.JPEG, 97, new FileOutputStream(file7));
                            q7aVar4.c = file7.getAbsolutePath();
                            file6.delete();
                        }
                    } else {
                        q7aVar4.c = q7aVar4.b;
                    }
                    q7aVar4.k = null;
                    q7aVar4.o = false;
                    q7aVar4.p = false;
                } catch (Exception e) {
                    cc4.f(e);
                }
            }
            i25++;
        }
        boolean B = wf3.B(j);
        String str53 = ".gif";
        String str54 = "_";
        if (z || !z2) {
            str3 = ".gif";
            str4 = "_";
            hashMap = null;
        } else {
            HashMap hashMap5 = new HashMap();
            int i26 = 0;
            while (i26 < size2) {
                q7a q7aVar5 = (q7a) arrayList7.get(i26);
                if (q7aVar5.l == null && !q7aVar5.o && q7aVar5.k == null) {
                    no6 no6Var = q7aVar5.y;
                    if (no6Var != null && q7aVar5.x) {
                        no6Var.m();
                        String str55 = q7aVar5.y.h;
                        if (str55 != null) {
                            q7aVar5.c = str55;
                        }
                    }
                    String str56 = q7aVar5.c;
                    if (str56 != null || (uri5 = q7aVar5.a) == null) {
                        str48 = str56;
                    } else {
                        str56 = hl.S0(uri5);
                        str48 = q7aVar5.a.toString();
                    }
                    if (str56 == null || q7aVar5.h > 0) {
                        z14 = B;
                        z15 = false;
                    } else {
                        if (str56.endsWith(str53)) {
                            z15 = false;
                            z14 = B;
                        } else {
                            z15 = str56.endsWith(".webp");
                            z14 = B;
                        }
                        if (arrayList7.size() > r5 || ((z15 && !w0(null, str56)) || !TextUtils.isEmpty(q7aVar5.d))) {
                            q7aVar5.s = r5;
                            str49 = null;
                            if (str56 != null) {
                                File file8 = new File(str56);
                                StringBuilder r = qd4.r(str48);
                                r.append(file8.length());
                                r.append(str54);
                                r.append(file8.lastModified());
                                str50 = r.toString();
                            } else {
                                str50 = str49;
                            }
                            if (z14 && q7aVar5.h == 0 && !z3) {
                                boolean z17 = q7aVar5.x;
                                int i27 = z17 ? !z14 ? 6 : 7 : !z14 ? 0 : 3;
                                if (q7aVar5.q) {
                                    i24 = z17 ? 6 : 0;
                                } else {
                                    if (q7aVar5.p) {
                                        if (z17) {
                                            i24 = 8;
                                        } else {
                                            i27 = 2;
                                        }
                                    }
                                    e02 = jf7.Y(k5Var3.a).e0(i27, str50);
                                    if (e02 != null) {
                                        Object obj17 = e02[0];
                                        if (obj17 instanceof TLRPC.TL_photo) {
                                            TLRPC.TL_photo tL_photo5 = (TLRPC.TL_photo) obj17;
                                            str52 = (String) e02[1];
                                            r3 = tL_photo5;
                                            if (r3 == 0 && q7aVar5.a != null && (e03 = jf7.Y(k5Var3.a).e0(i27, hl.S0(q7aVar5.a))) != null) {
                                                obj16 = e03[0];
                                                if (obj16 instanceof TLRPC.TL_photo) {
                                                    r3 = (TLRPC.TL_photo) obj16;
                                                    str52 = (String) e03[1];
                                                }
                                            }
                                            tL_photo4 = r3;
                                            str51 = str52;
                                            str46 = str53;
                                            z16 = z14;
                                            str47 = str54;
                                            i23 = i26;
                                            q7aVar3 = q7aVar5;
                                            v(k5Var3, z16, tL_photo4, q7aVar5.c, q7aVar5.a, 0L, q7aVar5.x);
                                        }
                                    }
                                    String str57 = str49;
                                    str52 = str57;
                                    r3 = str57;
                                    if (r3 == 0) {
                                        obj16 = e03[0];
                                        if (obj16 instanceof TLRPC.TL_photo) {
                                        }
                                    }
                                    tL_photo4 = r3;
                                    str51 = str52;
                                    str46 = str53;
                                    z16 = z14;
                                    str47 = str54;
                                    i23 = i26;
                                    q7aVar3 = q7aVar5;
                                    v(k5Var3, z16, tL_photo4, q7aVar5.c, q7aVar5.a, 0L, q7aVar5.x);
                                }
                                i27 = i24;
                                e02 = jf7.Y(k5Var3.a).e0(i27, str50);
                                if (e02 != null) {
                                }
                                String str572 = str49;
                                str52 = str572;
                                r3 = str572;
                                if (r3 == 0) {
                                }
                                tL_photo4 = r3;
                                str51 = str52;
                                str46 = str53;
                                z16 = z14;
                                str47 = str54;
                                i23 = i26;
                                q7aVar3 = q7aVar5;
                                v(k5Var3, z16, tL_photo4, q7aVar5.c, q7aVar5.a, 0L, q7aVar5.x);
                            } else {
                                str46 = str53;
                                str47 = str54;
                                q7aVar3 = q7aVar5;
                                z16 = z14;
                                i23 = i26;
                                tL_photo4 = null;
                                str51 = null;
                            }
                            boolean z18 = z16;
                            o7a o7aVar = new o7a();
                            hashMap5.put(q7aVar3, o7aVar);
                            if (tL_photo4 != null) {
                                o7aVar.b = str51;
                                o7aVar.a = tL_photo4;
                                k5Var3 = k5Var;
                                B = z18;
                            } else {
                                o7aVar.c = new CountDownLatch(1);
                                ThreadPoolExecutor threadPoolExecutor = K;
                                lb7 lb7Var = new lb7((Object) o7aVar, (Object) k5Var, (Object) q7aVar3, z18, (byte) 12);
                                k5Var3 = k5Var;
                                B = z18;
                                threadPoolExecutor.execute(lb7Var);
                            }
                            i26 = i23 + 1;
                            str53 = str46;
                            str54 = str47;
                            r5 = 1;
                        }
                        str46 = str53;
                        str47 = str54;
                        B = z14;
                    }
                    if (!in5.Y(q7aVar5.a, q7aVar5.c)) {
                        if (str56 == null && (uri4 = q7aVar5.a) != null && (MediaController.F(uri4) || (z15 = MediaController.L(q7aVar5.a)))) {
                            boolean z19 = true;
                            if (arrayList7.size() > 1) {
                                str49 = null;
                            } else if (z15) {
                                str49 = null;
                            } else {
                                str49 = null;
                            }
                            q7aVar5.s = z19;
                            if (str56 != null) {
                            }
                            if (z14) {
                            }
                            str46 = str53;
                            str47 = str54;
                            q7aVar3 = q7aVar5;
                            z16 = z14;
                            i23 = i26;
                            tL_photo4 = null;
                            str51 = null;
                            boolean z182 = z16;
                            o7a o7aVar2 = new o7a();
                            hashMap5.put(q7aVar3, o7aVar2);
                            if (tL_photo4 != null) {
                            }
                            i26 = i23 + 1;
                            str53 = str46;
                            str54 = str47;
                            r5 = 1;
                        }
                        str49 = null;
                        if (str56 != null) {
                        }
                        if (z14) {
                        }
                        str46 = str53;
                        str47 = str54;
                        q7aVar3 = q7aVar5;
                        z16 = z14;
                        i23 = i26;
                        tL_photo4 = null;
                        str51 = null;
                        boolean z1822 = z16;
                        o7a o7aVar22 = new o7a();
                        hashMap5.put(q7aVar3, o7aVar22);
                        if (tL_photo4 != null) {
                        }
                        i26 = i23 + 1;
                        str53 = str46;
                        str54 = str47;
                        r5 = 1;
                    }
                    str46 = str53;
                    str47 = str54;
                    B = z14;
                } else {
                    str46 = str53;
                    str47 = str54;
                }
                i23 = i26;
                i26 = i23 + 1;
                str53 = str46;
                str54 = str47;
                r5 = 1;
            }
            str3 = str53;
            str4 = str54;
            hashMap = hashMap5;
        }
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        String str58 = ".webp";
        int i28 = 0;
        int i29 = 0;
        ArrayList arrayList8 = null;
        ArrayList arrayList9 = null;
        ArrayList arrayList10 = null;
        ArrayList arrayList11 = null;
        ArrayList arrayList12 = null;
        String str59 = null;
        while (i29 < size2) {
            final q7a q7aVar6 = (q7a) arrayList7.get(i29);
            boolean z20 = i28 == 0;
            if (j2 != j14) {
                j6 = j2;
                j7 = j6;
            } else if (z2 && size2 > 1 && i28 % 10 == 0) {
                j7 = Utilities.b.nextLong();
                j6 = j7;
            } else {
                i3 = i28;
                j6 = j16;
                j7 = j15;
                ro6Var = q7aVar6.l;
                i4 = i29;
                arrayList2 = arrayList8;
                ArrayList arrayList13 = arrayList9;
                hashMap2 = hashMap;
                i5 = size2;
                ArrayList arrayList14 = arrayList10;
                if (ro6Var == null && q7aVar6.k == null) {
                    ArrayList arrayList15 = arrayList11;
                    str11 = str;
                    if (ro6Var.H) {
                        HashMap hashMap6 = new HashMap();
                        TLRPC.Document document = q7aVar6.l.J;
                        if (document instanceof TLRPC.TL_document) {
                            tL_document3 = (TLRPC.TL_document) document;
                            xb4.G(k5Var3.a);
                            file2 = xb4.K(tL_document3, true);
                        } else {
                            file2 = new File(xb4.z(4), Utilities.a(q7aVar6.l.C) + "." + in5.x(q7aVar6.l.C, "jpg"));
                            tL_document3 = null;
                        }
                        if (tL_document3 == null) {
                            TLRPC.TL_document tL_document5 = new TLRPC.TL_document();
                            str45 = str2;
                            tL_document5.id = 0L;
                            tL_document5.file_reference = new byte[0];
                            tL_document5.date = ConnectionsManager.getInstance(k5Var3.a).getCurrentTime();
                            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                            tL_documentAttributeFilename.file_name = "animation.gif";
                            tL_document5.attributes.add(tL_documentAttributeFilename);
                            tL_document5.size = q7aVar6.l.G;
                            tL_document5.dc_id = 0;
                            if (z || !file2.toString().endsWith("mp4")) {
                                tL_document5.mime_type = "image/gif";
                            } else {
                                tL_document5.mime_type = "video/mp4";
                                tL_document5.attributes.add(new TLRPC.TL_documentAttributeAnimated());
                            }
                            if (file2.exists()) {
                                file3 = file2;
                            } else {
                                file3 = null;
                                file2 = null;
                            }
                            if (file2 == null) {
                                file4 = new File(xb4.z(4), Utilities.a(q7aVar6.l.D) + "." + in5.x(q7aVar6.l.D, "jpg"));
                                if (!file4.exists()) {
                                    file4 = null;
                                }
                            } else {
                                file4 = file2;
                            }
                            if (file4 != null) {
                                if (!B) {
                                    try {
                                        if (q7aVar6.h == 0) {
                                            i22 = jn7.q5;
                                            if (file4.getAbsolutePath().endsWith("mp4")) {
                                                String absolutePath = file4.getAbsolutePath();
                                                float f = i22;
                                                G = in5.G(absolutePath, null, f, f, true);
                                            } else {
                                                G = q(1, file4.getAbsolutePath());
                                            }
                                            if (G != null) {
                                                float f2 = i22;
                                                TLRPC.PhotoSize U = in5.U(G, f2, f2, i22 > 90 ? 80 : 55, B);
                                                if (U != null) {
                                                    tL_document5.thumbs.add(U);
                                                    tL_document5.flags |= 1;
                                                }
                                                G.recycle();
                                            }
                                        }
                                    } catch (Exception e2) {
                                        cc4.f(e2);
                                    }
                                }
                                i22 = 90;
                                if (file4.getAbsolutePath().endsWith("mp4")) {
                                }
                                if (G != null) {
                                }
                            }
                            if (tL_document5.thumbs.isEmpty()) {
                                TLRPC.TL_photoSize tL_photoSize = new TLRPC.TL_photoSize();
                                ro6 ro6Var3 = q7aVar6.l;
                                tL_photoSize.w = ro6Var3.E;
                                tL_photoSize.h = ro6Var3.F;
                                tL_photoSize.size = 0;
                                tL_photoSize.location = new TLRPC.TL_fileLocationUnavailable();
                                tL_photoSize.type = "x";
                                tL_document5.thumbs.add(tL_photoSize);
                                tL_document5.flags |= 1;
                            }
                            tL_document4 = tL_document5;
                        } else {
                            str45 = str2;
                            file3 = file2;
                            tL_document4 = tL_document3;
                        }
                        String str60 = q7aVar6.l.C;
                        if (file3 != null) {
                            str60 = file3.toString();
                        }
                        String str61 = str60;
                        String str62 = q7aVar6.l.C;
                        if (str62 != null) {
                            hashMap6.put("originalPath", str62);
                        }
                        String str63 = str45;
                        str7 = str58;
                        i6 = i4;
                        hashMap3 = hashMap2;
                        j8 = 0;
                        z9 = B;
                        k5Var3 = k5Var;
                        hl.c3(new g6a(r47Var, tL_inputPollAnswer, k5Var, tL_document4, str61, hashMap6, q7aVar6, j, r47Var2, r47Var3, z4, i, i2, storyItem, ou1Var, c5aVar, z20, j3, z5, j4, j5, b77Var, ki8Var));
                        i28 = i3;
                        arrayList8 = arrayList2;
                        arrayList9 = arrayList13;
                        arrayList10 = arrayList14;
                        arrayList11 = arrayList15;
                        i7 = i5;
                        str9 = str63;
                        str10 = str4;
                    } else {
                        String str64 = str2;
                        str7 = str58;
                        hashMap3 = hashMap2;
                        j8 = 0;
                        z9 = B;
                        TLRPC.Photo photo = ro6Var.K;
                        TLRPC.TL_photo tL_photo6 = photo instanceof TLRPC.TL_photo ? (TLRPC.TL_photo) photo : null;
                        if (tL_photo6 == null) {
                            File file9 = new File(xb4.z(4), Utilities.a(q7aVar6.l.C) + "." + in5.x(q7aVar6.l.C, "jpg"));
                            if (!file9.exists() || file9.length() == 0) {
                                uri3 = null;
                            } else {
                                r7a B2 = B(k5Var3.a);
                                String file10 = file9.toString();
                                uri3 = null;
                                tL_photo6 = B2.z(file10, null, false);
                                if (tL_photo6 != null) {
                                    z13 = false;
                                    if (tL_photo6 == null) {
                                        File file11 = new File(xb4.z(4), Utilities.a(q7aVar6.l.D) + "." + in5.x(q7aVar6.l.D, "jpg"));
                                        if (file11.exists()) {
                                            tL_photo6 = B(k5Var3.a).z(file11.toString(), uri3, false);
                                        }
                                        if (tL_photo6 == null) {
                                            tL_photo6 = new TLRPC.TL_photo();
                                            tL_photo6.date = ConnectionsManager.getInstance(k5Var3.a).getCurrentTime();
                                            tL_photo6.file_reference = new byte[0];
                                            TLRPC.TL_photoSize tL_photoSize2 = new TLRPC.TL_photoSize();
                                            ro6 ro6Var4 = q7aVar6.l;
                                            tL_photoSize2.w = ro6Var4.E;
                                            tL_photoSize2.h = ro6Var4.F;
                                            tL_photoSize2.size = 0;
                                            tL_photoSize2.location = new TLRPC.TL_fileLocationUnavailable();
                                            tL_photoSize2.type = "x";
                                            tL_photo6.sizes.add(tL_photoSize2);
                                        }
                                    }
                                }
                            }
                            z13 = true;
                            if (tL_photo6 == null) {
                            }
                        } else {
                            uri3 = null;
                            z13 = true;
                        }
                        final HashMap hashMap7 = new HashMap();
                        String str65 = q7aVar6.l.C;
                        if (str65 != null) {
                            hashMap7.put("originalPath", str65);
                        }
                        if (z2) {
                            int i30 = i3 + 1;
                            hashMap7.put("groupId", String.valueOf(j7));
                            if (z6) {
                                i21 = i4;
                            } else {
                                if (ki8Var == null && i30 == 10) {
                                    i21 = i4;
                                } else {
                                    i21 = i4;
                                }
                                hashMap7.put("final", "1");
                                i3 = i30;
                                j6 = 0;
                            }
                            i3 = i30;
                        } else {
                            i21 = i4;
                        }
                        final TLRPC.TL_photo tL_photo7 = tL_photo6;
                        int i31 = i21;
                        final boolean z21 = z13;
                        k5Var3 = k5Var;
                        hl.c3(new Runnable() { // from class: h6a
                            @Override // java.lang.Runnable
                            public final void run() {
                                r47 r47Var4 = r47.this;
                                TLRPC.TL_inputPollAnswer tL_inputPollAnswer2 = tL_inputPollAnswer;
                                k5 k5Var4 = k5Var;
                                TLRPC.TL_photo tL_photo8 = tL_photo7;
                                boolean z22 = z21;
                                q7a q7aVar7 = q7aVar6;
                                HashMap hashMap8 = hashMap7;
                                if (r47Var4 != null || tL_inputPollAnswer2 != null) {
                                    r7a.B(k5Var4.a).s(r47Var4, tL_inputPollAnswer2, tL_photo8, null, null, z22 ? q7aVar7.l.C : null, null, hashMap8, false, q7aVar7.u, null);
                                    return;
                                }
                                p7a c = p7a.c(null, q7aVar7.d, null, tL_photo8, null, null, null, null, null, null, j, z22 ? q7aVar7.l.C : null, r47Var2, r47Var3, null, true, null, q7aVar7.i, null, hashMap8, z4, i, i2, q7aVar7.h, null, null, false, q7aVar7.u);
                                c.H = storyItem;
                                c.J = ou1Var;
                                c.K = c5aVar;
                                c.O = j3;
                                c.L = z5;
                                c.Q = j4;
                                c.R = j5;
                                c.T = b77Var;
                                c.k = q7aVar7.B;
                                c.j = ki8Var;
                                r7a.B(k5Var4.a).q0(c);
                            }
                        });
                        i28 = i3;
                        arrayList8 = arrayList2;
                        str10 = str4;
                        arrayList9 = arrayList13;
                        arrayList10 = arrayList14;
                        arrayList11 = arrayList15;
                        str11 = str11;
                        str9 = str64;
                        i7 = i5;
                        i6 = i31;
                    }
                } else {
                    ArrayList arrayList16 = arrayList11;
                    str5 = str;
                    str6 = str2;
                    str7 = str58;
                    hashMap3 = hashMap2;
                    j8 = 0;
                    z9 = B;
                    if ((q7aVar6.o && q7aVar6.k == null) || (q7aVar6.p && q7aVar6.q)) {
                        String str66 = q7aVar6.c;
                        if (str66 != null || (uri2 = q7aVar6.a) == null) {
                            str26 = str66;
                            str27 = str26;
                        } else {
                            str27 = (Build.VERSION.SDK_INT < 30 || !"content".equals(uri2.getScheme())) ? hl.S0(q7aVar6.a) : null;
                            str26 = q7aVar6.a.toString();
                        }
                        if (kj4Var == null || q7aVar6.a == null || !kj4Var.R().hasMimeType("image/png")) {
                            str28 = "";
                            str29 = str26;
                            str30 = str7;
                            str31 = str6;
                        } else {
                            try {
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                InputStream openInputStream = a.b.getContentResolver().openInputStream(q7aVar6.a);
                                try {
                                    Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, null, options);
                                    StringBuilder sb = new StringBuilder();
                                    str31 = str6;
                                    try {
                                        sb.append(str31);
                                        sb.append(xea.p());
                                        str30 = str7;
                                        try {
                                            sb.append(str30);
                                            str28 = "";
                                            try {
                                                str29 = str26;
                                                try {
                                                    File file12 = new File(xb4.z(4), sb.toString());
                                                    fileOutputStream = new FileOutputStream(file12);
                                                    try {
                                                        decodeStream.compress(Bitmap.CompressFormat.WEBP, 100, fileOutputStream);
                                                        xea.x();
                                                        q7aVar6.a = Uri.fromFile(file12);
                                                        if (openInputStream != null) {
                                                            try {
                                                                openInputStream.close();
                                                            } catch (Exception unused) {
                                                            }
                                                        }
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        inputStream = openInputStream;
                                                        try {
                                                            cc4.f(th);
                                                            if (inputStream != null) {
                                                                try {
                                                                    inputStream.close();
                                                                } catch (Exception unused2) {
                                                                }
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    inputStream = openInputStream;
                                                    fileOutputStream = null;
                                                    cc4.f(th);
                                                    if (inputStream != null) {
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                str29 = str26;
                                                inputStream = openInputStream;
                                                fileOutputStream = null;
                                                cc4.f(th);
                                                if (inputStream != null) {
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            str28 = "";
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        str28 = "";
                                        str29 = str26;
                                        str30 = str7;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    str28 = "";
                                    str29 = str26;
                                    str30 = str7;
                                    str31 = str6;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                str28 = "";
                                str29 = str26;
                                str30 = str7;
                                str31 = str6;
                                fileOutputStream = null;
                                inputStream = null;
                            }
                            try {
                                fileOutputStream.close();
                            } catch (Exception unused3) {
                            }
                        }
                        if (!z) {
                            if (!in5.Y(q7aVar6.a, q7aVar6.c)) {
                                if (q7aVar6.s || str27 == null) {
                                    str32 = str3;
                                } else {
                                    str32 = str3;
                                    if ((str27.endsWith(str32) || str27.endsWith(str30)) && q7aVar6.h <= 0) {
                                        str59 = str27.endsWith(str32) ? "gif" : "webp";
                                        str7 = str30;
                                        str33 = str27;
                                        str34 = str29;
                                        z12 = true;
                                        if (z12) {
                                            if (arrayList2 == null) {
                                                arrayList8 = new ArrayList();
                                                arrayList9 = new ArrayList();
                                                arrayList11 = new ArrayList();
                                                arrayList12 = new ArrayList();
                                                arrayList6 = new ArrayList();
                                            } else {
                                                arrayList8 = arrayList2;
                                                arrayList9 = arrayList13;
                                                arrayList6 = arrayList14;
                                                arrayList11 = arrayList16;
                                            }
                                            ArrayList arrayList17 = arrayList12;
                                            arrayList8.add(str33);
                                            arrayList9.add(str34);
                                            arrayList6.add(q7aVar6.a);
                                            arrayList11.add(q7aVar6.d);
                                            arrayList17.add(q7aVar6.i);
                                            arrayList10 = arrayList6;
                                            arrayList12 = arrayList17;
                                            str3 = str32;
                                            str9 = str31;
                                            i28 = i3;
                                            str10 = str4;
                                            str11 = str5;
                                            i7 = i5;
                                            i6 = i4;
                                        } else {
                                            if (str33 != null) {
                                                File file13 = new File(str33);
                                                StringBuilder r2 = qd4.r(str34);
                                                r2.append(file13.length());
                                                str35 = str4;
                                                r2.append(str35);
                                                r2.append(file13.lastModified());
                                                str36 = r2.toString();
                                            } else {
                                                str35 = str4;
                                                str36 = null;
                                            }
                                            if (hashMap3 != null) {
                                                o7a o7aVar3 = (o7a) hashMap3.get(q7aVar6);
                                                TLRPC.TL_photo tL_photo8 = o7aVar3.a;
                                                String str67 = o7aVar3.b;
                                                if (tL_photo8 == null) {
                                                    try {
                                                        o7aVar3.c.await();
                                                    } catch (Exception e3) {
                                                        cc4.f(e3);
                                                    }
                                                    tL_photo3 = o7aVar3.a;
                                                    str42 = o7aVar3.b;
                                                } else {
                                                    str42 = str67;
                                                    tL_photo3 = tL_photo8;
                                                }
                                                str37 = str33;
                                                hashMap3 = hashMap3;
                                                obj11 = "1";
                                                obj12 = "final";
                                                obj13 = "groupId";
                                                str3 = str32;
                                                str38 = str35;
                                                str39 = str31;
                                                i17 = 1;
                                                tL_photo2 = tL_photo3;
                                                str40 = str36;
                                                obj14 = "originalPath";
                                            } else {
                                                if (z9 || q7aVar6.h != 0 || z3) {
                                                    str37 = str33;
                                                    hashMap3 = hashMap3;
                                                    obj11 = "1";
                                                    obj12 = "final";
                                                    obj13 = "groupId";
                                                    str3 = str32;
                                                    str38 = str35;
                                                    str39 = str31;
                                                    i17 = 1;
                                                    str40 = str36;
                                                    obj14 = "originalPath";
                                                    str41 = null;
                                                    tL_photo = null;
                                                } else {
                                                    int i32 = q7aVar6.x ? !z9 ? 6 : 7 : !z9 ? 0 : 3;
                                                    Object[] e04 = jf7.Y(k5Var3.a).e0(i32, str36);
                                                    String str68 = str36;
                                                    if (e04 != null) {
                                                        Object obj18 = e04[0];
                                                        hashMap3 = hashMap3;
                                                        if (obj18 instanceof TLRPC.TL_photo) {
                                                            tL_photo = (TLRPC.TL_photo) obj18;
                                                            i18 = 1;
                                                            str43 = (String) e04[1];
                                                            if (tL_photo == null && q7aVar6.a != null && (e0 = jf7.Y(k5Var3.a).e0(i32, hl.S0(q7aVar6.a))) != null) {
                                                                obj15 = e0[0];
                                                                if (obj15 instanceof TLRPC.TL_photo) {
                                                                    tL_photo = (TLRPC.TL_photo) obj15;
                                                                    str41 = (String) e0[i18];
                                                                    String str69 = q7aVar6.c;
                                                                    Uri uri6 = q7aVar6.a;
                                                                    str3 = str32;
                                                                    str38 = str35;
                                                                    str39 = str31;
                                                                    str40 = str68;
                                                                    obj14 = "originalPath";
                                                                    i17 = i18;
                                                                    str37 = str33;
                                                                    obj11 = "1";
                                                                    obj13 = "groupId";
                                                                    k5Var3 = k5Var;
                                                                    obj12 = "final";
                                                                    v(k5Var3, z9, tL_photo, str69, uri6, 0L, false);
                                                                }
                                                            }
                                                            str41 = str43;
                                                            String str692 = q7aVar6.c;
                                                            Uri uri62 = q7aVar6.a;
                                                            str3 = str32;
                                                            str38 = str35;
                                                            str39 = str31;
                                                            str40 = str68;
                                                            obj14 = "originalPath";
                                                            i17 = i18;
                                                            str37 = str33;
                                                            obj11 = "1";
                                                            obj13 = "groupId";
                                                            k5Var3 = k5Var;
                                                            obj12 = "final";
                                                            v(k5Var3, z9, tL_photo, str692, uri62, 0L, false);
                                                        }
                                                    } else {
                                                        hashMap3 = hashMap3;
                                                    }
                                                    i18 = 1;
                                                    str43 = null;
                                                    tL_photo = null;
                                                    if (tL_photo == null) {
                                                        obj15 = e0[0];
                                                        if (obj15 instanceof TLRPC.TL_photo) {
                                                        }
                                                    }
                                                    str41 = str43;
                                                    String str6922 = q7aVar6.c;
                                                    Uri uri622 = q7aVar6.a;
                                                    str3 = str32;
                                                    str38 = str35;
                                                    str39 = str31;
                                                    str40 = str68;
                                                    obj14 = "originalPath";
                                                    i17 = i18;
                                                    str37 = str33;
                                                    obj11 = "1";
                                                    obj13 = "groupId";
                                                    k5Var3 = k5Var;
                                                    obj12 = "final";
                                                    v(k5Var3, z9, tL_photo, str6922, uri622, 0L, false);
                                                }
                                                if (tL_photo == null) {
                                                    TLRPC.TL_photo z22 = B(k5Var3.a).z(q7aVar6.c, q7aVar6.a, false);
                                                    if (z9 && q7aVar6.r) {
                                                        new File(q7aVar6.c).delete();
                                                    }
                                                    str42 = str41;
                                                    tL_photo2 = z22;
                                                } else {
                                                    str42 = str41;
                                                    tL_photo2 = tL_photo;
                                                }
                                            }
                                            if (tL_photo2 != null) {
                                                final HashMap hashMap8 = new HashMap();
                                                final Bitmap[] bitmapArr = new Bitmap[i17];
                                                final String[] strArr = new String[i17];
                                                ArrayList arrayList18 = q7aVar6.j;
                                                ?? r0 = (arrayList18 == null || arrayList18.isEmpty()) ? 0 : i17;
                                                tL_photo2.has_stickers = r0;
                                                if (r0 != 0) {
                                                    SerializedData serializedData = new SerializedData((q7aVar6.j.size() * 20) + 4);
                                                    serializedData.writeInt32(q7aVar6.j.size());
                                                    for (int i33 = 0; i33 < q7aVar6.j.size(); i33++) {
                                                        ((TLRPC.InputDocument) q7aVar6.j.get(i33)).serializeToStream(serializedData);
                                                    }
                                                    hashMap8.put("masks", Utilities.f(serializedData.toByteArray()));
                                                    serializedData.cleanup();
                                                }
                                                if (str40 != null) {
                                                    hashMap8.put(obj14, str40);
                                                }
                                                if (str42 != null) {
                                                    hashMap8.put("parentObject", str42);
                                                }
                                                if (z2) {
                                                    try {
                                                    } catch (Exception e4) {
                                                        cc4.f(e4);
                                                    }
                                                }
                                                TLRPC.PhotoSize u = xb4.u(hl.Y0(q7aVar6.x), tL_photo2.sizes);
                                                if (u != null) {
                                                    strArr[0] = C(k5Var3, u, bitmapArr, false, false);
                                                }
                                                if (z2) {
                                                    i28 = i3 + 1;
                                                    hashMap8.put(obj13, String.valueOf(j7));
                                                    if (z6) {
                                                        i19 = i5;
                                                        i20 = i4;
                                                    } else {
                                                        if (ki8Var == null && i28 == 10) {
                                                            i19 = i5;
                                                            i20 = i4;
                                                        } else {
                                                            i19 = i5;
                                                            i20 = i4;
                                                        }
                                                        hashMap8.put(obj12, obj11);
                                                        j12 = 0;
                                                        final boolean z23 = q7aVar6.x;
                                                        i6 = i20;
                                                        final String str70 = str42;
                                                        str44 = str38;
                                                        str9 = str39;
                                                        k5Var3 = k5Var;
                                                        hl.c3(new Runnable() { // from class: j6a
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                Bitmap[] bitmapArr2 = bitmapArr;
                                                                if (bitmapArr2[0] != null) {
                                                                    String[] strArr2 = strArr;
                                                                    if (strArr2[0] != null) {
                                                                        in5.z().K(new BitmapDrawable(bitmapArr2[0]), strArr2[0], false);
                                                                    }
                                                                }
                                                                r47 r47Var4 = r47Var;
                                                                TLRPC.TL_inputPollAnswer tL_inputPollAnswer2 = tL_inputPollAnswer;
                                                                k5 k5Var4 = k5Var;
                                                                TLRPC.TL_photo tL_photo9 = tL_photo2;
                                                                HashMap hashMap9 = hashMap8;
                                                                q7a q7aVar7 = q7aVar6;
                                                                String str71 = str70;
                                                                if (r47Var4 != null || tL_inputPollAnswer2 != null) {
                                                                    r7a.B(k5Var4.a).s(r47Var4, tL_inputPollAnswer2, tL_photo9, null, null, null, null, hashMap9, false, q7aVar7.u, str71);
                                                                    return;
                                                                }
                                                                p7a c = p7a.c(null, q7aVar7.d, null, tL_photo9, null, null, null, null, null, null, j, null, r47Var2, r47Var3, null, true, null, q7aVar7.i, null, hashMap9, z4, i, i2, q7aVar7.h, str71, null, z7, q7aVar7.u);
                                                                c.H = storyItem;
                                                                c.J = ou1Var;
                                                                c.K = c5aVar;
                                                                c.O = j3;
                                                                c.L = z5;
                                                                c.P = q7aVar7.w;
                                                                c.k = q7aVar7.B;
                                                                c.Q = j4;
                                                                c.R = j5;
                                                                c.T = b77Var;
                                                                c.S = z23;
                                                                c.j = ki8Var;
                                                                r7a.B(k5Var4.a).q0(c);
                                                            }
                                                        });
                                                        arrayList8 = arrayList2;
                                                        arrayList9 = arrayList13;
                                                        arrayList10 = arrayList14;
                                                        arrayList11 = arrayList16;
                                                        i7 = i19;
                                                        j6 = j12;
                                                    }
                                                } else {
                                                    i19 = i5;
                                                    i20 = i4;
                                                    i28 = i3;
                                                }
                                                j12 = j6;
                                                final boolean z232 = q7aVar6.x;
                                                i6 = i20;
                                                final String str702 = str42;
                                                str44 = str38;
                                                str9 = str39;
                                                k5Var3 = k5Var;
                                                hl.c3(new Runnable() { // from class: j6a
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        Bitmap[] bitmapArr2 = bitmapArr;
                                                        if (bitmapArr2[0] != null) {
                                                            String[] strArr2 = strArr;
                                                            if (strArr2[0] != null) {
                                                                in5.z().K(new BitmapDrawable(bitmapArr2[0]), strArr2[0], false);
                                                            }
                                                        }
                                                        r47 r47Var4 = r47Var;
                                                        TLRPC.TL_inputPollAnswer tL_inputPollAnswer2 = tL_inputPollAnswer;
                                                        k5 k5Var4 = k5Var;
                                                        TLRPC.TL_photo tL_photo9 = tL_photo2;
                                                        HashMap hashMap9 = hashMap8;
                                                        q7a q7aVar7 = q7aVar6;
                                                        String str71 = str702;
                                                        if (r47Var4 != null || tL_inputPollAnswer2 != null) {
                                                            r7a.B(k5Var4.a).s(r47Var4, tL_inputPollAnswer2, tL_photo9, null, null, null, null, hashMap9, false, q7aVar7.u, str71);
                                                            return;
                                                        }
                                                        p7a c = p7a.c(null, q7aVar7.d, null, tL_photo9, null, null, null, null, null, null, j, null, r47Var2, r47Var3, null, true, null, q7aVar7.i, null, hashMap9, z4, i, i2, q7aVar7.h, str71, null, z7, q7aVar7.u);
                                                        c.H = storyItem;
                                                        c.J = ou1Var;
                                                        c.K = c5aVar;
                                                        c.O = j3;
                                                        c.L = z5;
                                                        c.P = q7aVar7.w;
                                                        c.k = q7aVar7.B;
                                                        c.Q = j4;
                                                        c.R = j5;
                                                        c.T = b77Var;
                                                        c.S = z232;
                                                        c.j = ki8Var;
                                                        r7a.B(k5Var4.a).q0(c);
                                                    }
                                                });
                                                arrayList8 = arrayList2;
                                                arrayList9 = arrayList13;
                                                arrayList10 = arrayList14;
                                                arrayList11 = arrayList16;
                                                i7 = i19;
                                                j6 = j12;
                                            } else {
                                                str44 = str38;
                                                str9 = str39;
                                                i6 = i4;
                                                if (arrayList2 == null) {
                                                    arrayList8 = new ArrayList();
                                                    arrayList9 = new ArrayList();
                                                    arrayList11 = new ArrayList();
                                                    arrayList12 = new ArrayList();
                                                    arrayList5 = new ArrayList();
                                                } else {
                                                    arrayList8 = arrayList2;
                                                    arrayList9 = arrayList13;
                                                    arrayList5 = arrayList14;
                                                    arrayList11 = arrayList16;
                                                }
                                                ArrayList arrayList19 = arrayList12;
                                                arrayList8.add(str37);
                                                arrayList9.add(str40);
                                                arrayList5.add(q7aVar6.a);
                                                arrayList11.add(q7aVar6.d);
                                                arrayList19.add(q7aVar6.i);
                                                arrayList10 = arrayList5;
                                                arrayList12 = arrayList19;
                                                i28 = i3;
                                                i7 = i5;
                                            }
                                            str10 = str44;
                                            str11 = str5;
                                        }
                                    }
                                }
                                if (q7aVar6.s || str27 != null || (uri = q7aVar6.a) == null) {
                                    str7 = str30;
                                } else {
                                    boolean F = MediaController.F(uri);
                                    Uri uri7 = q7aVar6.a;
                                    str7 = str30;
                                    if (F) {
                                        String uri8 = uri7.toString();
                                        str59 = "gif";
                                        str33 = MediaController.q(-1L, q7aVar6.a, "gif");
                                        z12 = true;
                                        str34 = uri8;
                                        if (z12) {
                                        }
                                    } else if (MediaController.L(uri7)) {
                                        str34 = q7aVar6.a.toString();
                                        str59 = "webp";
                                        str33 = MediaController.q(-1L, q7aVar6.a, "webp");
                                        z12 = true;
                                        if (z12) {
                                        }
                                    }
                                }
                                str33 = str27;
                                str34 = str29;
                                z12 = false;
                                if (z12) {
                                }
                            }
                        }
                        str7 = str30;
                        str32 = str3;
                        str59 = str27 != null ? xb4.D(new File(str27)) : str28;
                        str33 = str27;
                        str34 = str29;
                        z12 = true;
                        if (z12) {
                        }
                    } else {
                        str8 = str4;
                        str9 = str6;
                        i6 = i4;
                        if (z) {
                            oec oecVar6 = q7aVar6.k;
                            if (oecVar6 == null) {
                                oecVar6 = n(q7aVar6.z, q7aVar6.c);
                            }
                            oecVar = oecVar6;
                        } else {
                            oecVar = null;
                        }
                        if ((!z || (oecVar == null && !q7aVar6.c.endsWith("mp4"))) && !q7aVar6.p) {
                            i7 = i5;
                            str10 = str8;
                            str11 = str5;
                            if (arrayList2 != null) {
                                ArrayList arrayList20 = new ArrayList();
                                arrayList9 = new ArrayList();
                                arrayList11 = new ArrayList();
                                arrayList12 = new ArrayList();
                                arrayList3 = new ArrayList();
                                arrayList8 = arrayList20;
                            } else {
                                arrayList8 = arrayList2;
                                arrayList9 = arrayList13;
                                arrayList3 = arrayList14;
                                arrayList11 = arrayList16;
                            }
                            ArrayList arrayList21 = arrayList12;
                            arrayList8.add(q7aVar6.c);
                            arrayList9.add(q7aVar6.c);
                            arrayList3.add(q7aVar6.a);
                            arrayList11.add(q7aVar6.d);
                            arrayList21.add(q7aVar6.i);
                            arrayList12 = arrayList21;
                            arrayList10 = arrayList3;
                        } else {
                            String str71 = q7aVar6.c;
                            if (str71 == null && (ro6Var2 = q7aVar6.l) != null) {
                                if (ro6Var2.K instanceof TLRPC.TL_photo) {
                                    xb4.G(k5Var3.a);
                                    str71 = xb4.K(q7aVar6.l.K, true).getAbsolutePath();
                                    q7aVar6.c = str71;
                                } else {
                                    str71 = new File(xb4.z(4), Utilities.a(q7aVar6.l.C) + "." + in5.x(q7aVar6.l.C, "jpg")).getAbsolutePath();
                                    q7aVar6.c = str71;
                                }
                            }
                            String str72 = str71;
                            File file14 = new File(str72);
                            StringBuilder r4 = qd4.r(str72);
                            r4.append(file14.length());
                            r4.append(str8);
                            r4.append(file14.lastModified());
                            String sb2 = r4.toString();
                            if (oecVar != null) {
                                boolean z24 = oecVar.t;
                                StringBuilder sb3 = new StringBuilder(sb2);
                                sb3.append(oecVar.r);
                                sb3.append(str8);
                                sb3.append(oecVar.a);
                                sb3.append(str8);
                                sb3.append(oecVar.b);
                                sb3.append(oecVar.t ? "_m" : "");
                                sb2 = sb3.toString();
                                if (oecVar.k != oecVar.h) {
                                    StringBuilder l = c00.l(sb2, str8);
                                    l.append(oecVar.k);
                                    sb2 = l.toString();
                                }
                                long j17 = oecVar.a;
                                if (j17 < 0) {
                                    j17 = 0;
                                }
                                j9 = j17;
                                z10 = z24;
                            } else {
                                j9 = 0;
                                z10 = false;
                            }
                            String str73 = sb2;
                            if (z9 || q7aVar6.h != 0 || z3 || !(oecVar == null || (oecVar.A == null && oecVar.B == null && oecVar.G == null && oecVar.H == null))) {
                                k5Var2 = k5Var;
                            } else {
                                k5Var2 = k5Var;
                                Object[] e05 = jf7.Y(k5Var2.a).e0(!z9 ? 2 : 5, str73);
                                if (e05 != null) {
                                    Object obj19 = e05[0];
                                    if (obj19 instanceof TLRPC.TL_document) {
                                        String str74 = (String) e05[1];
                                        String str75 = q7aVar6.c;
                                        str12 = str73;
                                        str15 = ".";
                                        str14 = "video/mp4";
                                        obj = "1";
                                        file = file14;
                                        str16 = str8;
                                        str13 = str72;
                                        tL_document = (TLRPC.TL_document) obj19;
                                        obj2 = "originalPath";
                                        oecVar2 = oecVar;
                                        j10 = j9;
                                        str17 = "mp4";
                                        z11 = z9;
                                        v(k5Var2, z11, tL_document, str75, null, j10, false);
                                        str18 = str74;
                                        if (tL_document != null) {
                                            if (q7aVar6.c == null || !q7aVar6.p) {
                                                z9 = z11;
                                                str19 = str18;
                                                obj9 = "parentObject";
                                                obj10 = "masks";
                                                str21 = str5;
                                                str22 = str9;
                                            } else {
                                                File file15 = new File(q7aVar6.c);
                                                File z25 = xb4.z(4);
                                                z9 = z11;
                                                str22 = str9;
                                                StringBuilder sb4 = new StringBuilder(str22);
                                                sb4.append(xea.p());
                                                str19 = str18;
                                                str21 = str5;
                                                sb4.append(str21);
                                                File file16 = new File(z25, sb4.toString());
                                                File file17 = new File(xb4.z(4), str22 + xea.p() + ".mp4");
                                                long j18 = q7aVar6.z;
                                                try {
                                                    m(j18, file15.length(), file15, file17);
                                                    str24 = file17.getAbsolutePath();
                                                } catch (Exception e5) {
                                                    e = e5;
                                                    obj9 = "parentObject";
                                                }
                                                try {
                                                    q7aVar6.c = str24;
                                                    if (TextUtils.isEmpty(q7aVar6.b)) {
                                                        m(0L, j18, file15, file16);
                                                        q7aVar6.f = file16.getAbsolutePath();
                                                        Pair L02 = hl.L0(file16);
                                                        if (((Integer) L02.first).intValue() != 0 && (decodeFile2 = BitmapFactory.decodeFile(file16.getAbsolutePath())) != null) {
                                                            int intValue2 = ((Integer) L02.second).intValue();
                                                            Matrix matrix2 = new Matrix();
                                                            str13 = str24;
                                                            obj9 = "parentObject";
                                                            try {
                                                                obj10 = "masks";
                                                            } catch (Exception e6) {
                                                                e = e6;
                                                                obj10 = "masks";
                                                                str24 = str13;
                                                                cc4.f(e);
                                                                String str76 = q7aVar6.e;
                                                                if (str76 == null) {
                                                                }
                                                                if (decodeFile == null) {
                                                                }
                                                                if (decodeFile == null) {
                                                                }
                                                                str25 = null;
                                                                tL_document2 = new TLRPC.TL_document();
                                                                tL_document2.file_reference = new byte[i14];
                                                                if (photoSize2 != null) {
                                                                }
                                                                oecVar4 = q7aVar2.k;
                                                                if (oecVar4 == null) {
                                                                }
                                                                tL_document2.mime_type = str14;
                                                                k5Var2.e().u(false);
                                                                oecVar5 = q7aVar2.k;
                                                                if (oecVar5 != null) {
                                                                }
                                                                if (z9) {
                                                                }
                                                                tL_document2.attributes.add(tL_documentAttributeVideo);
                                                                if (oecVar3 != null) {
                                                                }
                                                                if (file.exists()) {
                                                                }
                                                                w(q7aVar2.c, tL_documentAttributeVideo, null);
                                                                str13 = str24;
                                                                q7aVar = q7aVar2;
                                                                tL_document = tL_document2;
                                                                str23 = str25;
                                                                m = in5.m(q7aVar.f);
                                                                if (m == null) {
                                                                }
                                                                if (oecVar3 != null) {
                                                                }
                                                                if (oecVar3 != null) {
                                                                }
                                                                hashMap4 = new HashMap();
                                                                hashMap4.put(obj8, str12);
                                                                if (q7aVar.p) {
                                                                }
                                                                final String str77 = str19;
                                                                if (str19 != null) {
                                                                }
                                                                if (z10) {
                                                                }
                                                                i10 = i3;
                                                                j11 = j6;
                                                                if (!z9) {
                                                                }
                                                                final TLRPC.PhotoSize photoSize3 = m;
                                                                str9 = str22;
                                                                str11 = str21;
                                                                i6 = i8;
                                                                final Bitmap bitmap2 = bitmap;
                                                                final q7a q7aVar7 = q7aVar;
                                                                final TLRPC.TL_document tL_document6 = tL_document;
                                                                final String str78 = str23;
                                                                i7 = i5;
                                                                str10 = str16;
                                                                final String str79 = str13;
                                                                k5Var3 = k5Var;
                                                                hl.c3(new Runnable() { // from class: i6a
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        String str80;
                                                                        Bitmap bitmap3 = bitmap2;
                                                                        if (bitmap3 != null && (str80 = str78) != null) {
                                                                            in5.z().K(new BitmapDrawable(bitmap3), str80, false);
                                                                        }
                                                                        r47 r47Var4 = r47Var;
                                                                        TLRPC.TL_inputPollAnswer tL_inputPollAnswer2 = tL_inputPollAnswer;
                                                                        k5 k5Var4 = k5Var;
                                                                        oec oecVar7 = oecVar3;
                                                                        TLRPC.TL_document tL_document7 = tL_document6;
                                                                        String str81 = str79;
                                                                        HashMap hashMap9 = hashMap4;
                                                                        q7a q7aVar8 = q7aVar7;
                                                                        String str82 = str77;
                                                                        if (r47Var4 != null || tL_inputPollAnswer2 != null) {
                                                                            r7a.B(k5Var4.a).s(r47Var4, tL_inputPollAnswer2, null, oecVar7, tL_document7, str81, null, hashMap9, false, q7aVar8.u, str82);
                                                                            return;
                                                                        }
                                                                        p7a e7 = p7a.e(tL_document7, oecVar7, str81, j, r47Var2, r47Var3, q7aVar8.d, q7aVar8.i, hashMap9, z4, i, i2, q7aVar8.h, str82, q7aVar8.u);
                                                                        e7.H = storyItem;
                                                                        e7.J = ou1Var;
                                                                        e7.K = c5aVar;
                                                                        e7.O = j3;
                                                                        e7.L = z5;
                                                                        e7.P = q7aVar8.w;
                                                                        e7.k = q7aVar8.B;
                                                                        e7.o = photoSize3;
                                                                        e7.Q = j4;
                                                                        e7.R = j5;
                                                                        e7.T = b77Var;
                                                                        e7.U = q7aVar8.p;
                                                                        e7.V = q7aVar8.A / 1000;
                                                                        e7.j = ki8Var;
                                                                        r7a.B(k5Var4.a).q0(e7);
                                                                    }
                                                                });
                                                                arrayList8 = arrayList2;
                                                                i3 = i10;
                                                                arrayList9 = arrayList13;
                                                                arrayList10 = arrayList14;
                                                                arrayList11 = arrayList16;
                                                                j6 = j11;
                                                                i28 = i3;
                                                                i29 = i6 + 1;
                                                                size2 = i7;
                                                                j15 = j7;
                                                                j14 = j8;
                                                                B = z9;
                                                                str = str11;
                                                                str4 = str10;
                                                                hashMap = hashMap3;
                                                                str58 = str7;
                                                                str2 = str9;
                                                                arrayList7 = arrayList;
                                                                j16 = j6;
                                                            }
                                                            try {
                                                                matrix2.postScale(intValue2 == 1 ? -1.0f : 1.0f, intValue2 == 2 ? -1.0f : 1.0f, decodeFile2.getWidth() / 2.0f, decodeFile2.getHeight() / 2.0f);
                                                                matrix2.postRotate(((Integer) L02.first).intValue());
                                                                Bitmap createBitmap2 = Bitmap.createBitmap(decodeFile2, 0, 0, decodeFile2.getWidth(), decodeFile2.getHeight(), matrix2, true);
                                                                File file18 = new File(xb4.z(4), str22 + xea.p() + str21);
                                                                createBitmap2.compress(Bitmap.CompressFormat.JPEG, 97, new FileOutputStream(file18));
                                                                q7aVar6.f = file18.getAbsolutePath();
                                                                file16.delete();
                                                            } catch (Exception e7) {
                                                                e = e7;
                                                                str24 = str13;
                                                                cc4.f(e);
                                                                String str762 = q7aVar6.e;
                                                                if (str762 == null) {
                                                                }
                                                                if (decodeFile == null) {
                                                                }
                                                                if (decodeFile == null) {
                                                                }
                                                                str25 = null;
                                                                tL_document2 = new TLRPC.TL_document();
                                                                tL_document2.file_reference = new byte[i14];
                                                                if (photoSize2 != null) {
                                                                }
                                                                oecVar4 = q7aVar2.k;
                                                                if (oecVar4 == null) {
                                                                }
                                                                tL_document2.mime_type = str14;
                                                                k5Var2.e().u(false);
                                                                oecVar5 = q7aVar2.k;
                                                                if (oecVar5 != null) {
                                                                }
                                                                if (z9) {
                                                                }
                                                                tL_document2.attributes.add(tL_documentAttributeVideo);
                                                                if (oecVar3 != null) {
                                                                }
                                                                if (file.exists()) {
                                                                }
                                                                w(q7aVar2.c, tL_documentAttributeVideo, null);
                                                                str13 = str24;
                                                                q7aVar = q7aVar2;
                                                                tL_document = tL_document2;
                                                                str23 = str25;
                                                                m = in5.m(q7aVar.f);
                                                                if (m == null) {
                                                                }
                                                                if (oecVar3 != null) {
                                                                }
                                                                if (oecVar3 != null) {
                                                                }
                                                                hashMap4 = new HashMap();
                                                                hashMap4.put(obj8, str12);
                                                                if (q7aVar.p) {
                                                                }
                                                                final String str772 = str19;
                                                                if (str19 != null) {
                                                                }
                                                                if (z10) {
                                                                }
                                                                i10 = i3;
                                                                j11 = j6;
                                                                if (!z9) {
                                                                }
                                                                final TLRPC.PhotoSize photoSize32 = m;
                                                                str9 = str22;
                                                                str11 = str21;
                                                                i6 = i8;
                                                                final Bitmap bitmap22 = bitmap;
                                                                final q7a q7aVar72 = q7aVar;
                                                                final TLRPC.TL_document tL_document62 = tL_document;
                                                                final String str782 = str23;
                                                                i7 = i5;
                                                                str10 = str16;
                                                                final String str792 = str13;
                                                                k5Var3 = k5Var;
                                                                hl.c3(new Runnable() { // from class: i6a
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        String str80;
                                                                        Bitmap bitmap3 = bitmap22;
                                                                        if (bitmap3 != null && (str80 = str782) != null) {
                                                                            in5.z().K(new BitmapDrawable(bitmap3), str80, false);
                                                                        }
                                                                        r47 r47Var4 = r47Var;
                                                                        TLRPC.TL_inputPollAnswer tL_inputPollAnswer2 = tL_inputPollAnswer;
                                                                        k5 k5Var4 = k5Var;
                                                                        oec oecVar7 = oecVar3;
                                                                        TLRPC.TL_document tL_document7 = tL_document62;
                                                                        String str81 = str792;
                                                                        HashMap hashMap9 = hashMap4;
                                                                        q7a q7aVar8 = q7aVar72;
                                                                        String str82 = str772;
                                                                        if (r47Var4 != null || tL_inputPollAnswer2 != null) {
                                                                            r7a.B(k5Var4.a).s(r47Var4, tL_inputPollAnswer2, null, oecVar7, tL_document7, str81, null, hashMap9, false, q7aVar8.u, str82);
                                                                            return;
                                                                        }
                                                                        p7a e72 = p7a.e(tL_document7, oecVar7, str81, j, r47Var2, r47Var3, q7aVar8.d, q7aVar8.i, hashMap9, z4, i, i2, q7aVar8.h, str82, q7aVar8.u);
                                                                        e72.H = storyItem;
                                                                        e72.J = ou1Var;
                                                                        e72.K = c5aVar;
                                                                        e72.O = j3;
                                                                        e72.L = z5;
                                                                        e72.P = q7aVar8.w;
                                                                        e72.k = q7aVar8.B;
                                                                        e72.o = photoSize32;
                                                                        e72.Q = j4;
                                                                        e72.R = j5;
                                                                        e72.T = b77Var;
                                                                        e72.U = q7aVar8.p;
                                                                        e72.V = q7aVar8.A / 1000;
                                                                        e72.j = ki8Var;
                                                                        r7a.B(k5Var4.a).q0(e72);
                                                                    }
                                                                });
                                                                arrayList8 = arrayList2;
                                                                i3 = i10;
                                                                arrayList9 = arrayList13;
                                                                arrayList10 = arrayList14;
                                                                arrayList11 = arrayList16;
                                                                j6 = j11;
                                                                i28 = i3;
                                                                i29 = i6 + 1;
                                                                size2 = i7;
                                                                j15 = j7;
                                                                j14 = j8;
                                                                B = z9;
                                                                str = str11;
                                                                str4 = str10;
                                                                hashMap = hashMap3;
                                                                str58 = str7;
                                                                str2 = str9;
                                                                arrayList7 = arrayList;
                                                                j16 = j6;
                                                            }
                                                        }
                                                    } else {
                                                        q7aVar6.f = q7aVar6.b;
                                                    }
                                                    str13 = str24;
                                                    obj9 = "parentObject";
                                                    obj10 = "masks";
                                                } catch (Exception e8) {
                                                    e = e8;
                                                    obj9 = "parentObject";
                                                    obj10 = "masks";
                                                    cc4.f(e);
                                                    String str7622 = q7aVar6.e;
                                                    if (str7622 == null) {
                                                    }
                                                    if (decodeFile == null) {
                                                        decodeFile = q(1, q7aVar6.c);
                                                    }
                                                    if (decodeFile == null) {
                                                    }
                                                    str25 = null;
                                                    tL_document2 = new TLRPC.TL_document();
                                                    tL_document2.file_reference = new byte[i14];
                                                    if (photoSize2 != null) {
                                                    }
                                                    oecVar4 = q7aVar2.k;
                                                    if (oecVar4 == null) {
                                                    }
                                                    tL_document2.mime_type = str14;
                                                    k5Var2.e().u(false);
                                                    oecVar5 = q7aVar2.k;
                                                    if (oecVar5 != null) {
                                                    }
                                                    if (z9) {
                                                    }
                                                    tL_document2.attributes.add(tL_documentAttributeVideo);
                                                    if (oecVar3 != null) {
                                                    }
                                                    if (file.exists()) {
                                                    }
                                                    w(q7aVar2.c, tL_documentAttributeVideo, null);
                                                    str13 = str24;
                                                    q7aVar = q7aVar2;
                                                    tL_document = tL_document2;
                                                    str23 = str25;
                                                    m = in5.m(q7aVar.f);
                                                    if (m == null) {
                                                    }
                                                    if (oecVar3 != null) {
                                                    }
                                                    if (oecVar3 != null) {
                                                    }
                                                    hashMap4 = new HashMap();
                                                    hashMap4.put(obj8, str12);
                                                    if (q7aVar.p) {
                                                    }
                                                    final String str7722 = str19;
                                                    if (str19 != null) {
                                                    }
                                                    if (z10) {
                                                    }
                                                    i10 = i3;
                                                    j11 = j6;
                                                    if (!z9) {
                                                    }
                                                    final TLRPC.PhotoSize photoSize322 = m;
                                                    str9 = str22;
                                                    str11 = str21;
                                                    i6 = i8;
                                                    final Bitmap bitmap222 = bitmap;
                                                    final q7a q7aVar722 = q7aVar;
                                                    final TLRPC.TL_document tL_document622 = tL_document;
                                                    final String str7822 = str23;
                                                    i7 = i5;
                                                    str10 = str16;
                                                    final String str7922 = str13;
                                                    k5Var3 = k5Var;
                                                    hl.c3(new Runnable() { // from class: i6a
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            String str80;
                                                            Bitmap bitmap3 = bitmap222;
                                                            if (bitmap3 != null && (str80 = str7822) != null) {
                                                                in5.z().K(new BitmapDrawable(bitmap3), str80, false);
                                                            }
                                                            r47 r47Var4 = r47Var;
                                                            TLRPC.TL_inputPollAnswer tL_inputPollAnswer2 = tL_inputPollAnswer;
                                                            k5 k5Var4 = k5Var;
                                                            oec oecVar7 = oecVar3;
                                                            TLRPC.TL_document tL_document7 = tL_document622;
                                                            String str81 = str7922;
                                                            HashMap hashMap9 = hashMap4;
                                                            q7a q7aVar8 = q7aVar722;
                                                            String str82 = str7722;
                                                            if (r47Var4 != null || tL_inputPollAnswer2 != null) {
                                                                r7a.B(k5Var4.a).s(r47Var4, tL_inputPollAnswer2, null, oecVar7, tL_document7, str81, null, hashMap9, false, q7aVar8.u, str82);
                                                                return;
                                                            }
                                                            p7a e72 = p7a.e(tL_document7, oecVar7, str81, j, r47Var2, r47Var3, q7aVar8.d, q7aVar8.i, hashMap9, z4, i, i2, q7aVar8.h, str82, q7aVar8.u);
                                                            e72.H = storyItem;
                                                            e72.J = ou1Var;
                                                            e72.K = c5aVar;
                                                            e72.O = j3;
                                                            e72.L = z5;
                                                            e72.P = q7aVar8.w;
                                                            e72.k = q7aVar8.B;
                                                            e72.o = photoSize322;
                                                            e72.Q = j4;
                                                            e72.R = j5;
                                                            e72.T = b77Var;
                                                            e72.U = q7aVar8.p;
                                                            e72.V = q7aVar8.A / 1000;
                                                            e72.j = ki8Var;
                                                            r7a.B(k5Var4.a).q0(e72);
                                                        }
                                                    });
                                                    arrayList8 = arrayList2;
                                                    i3 = i10;
                                                    arrayList9 = arrayList13;
                                                    arrayList10 = arrayList14;
                                                    arrayList11 = arrayList16;
                                                    j6 = j11;
                                                    i28 = i3;
                                                    i29 = i6 + 1;
                                                    size2 = i7;
                                                    j15 = j7;
                                                    j14 = j8;
                                                    B = z9;
                                                    str = str11;
                                                    str4 = str10;
                                                    hashMap = hashMap3;
                                                    str58 = str7;
                                                    str2 = str9;
                                                    arrayList7 = arrayList;
                                                    j16 = j6;
                                                }
                                            }
                                            str24 = str13;
                                            String str76222 = q7aVar6.e;
                                            decodeFile = str76222 == null ? BitmapFactory.decodeFile(str76222) : null;
                                            if (decodeFile == null && (decodeFile = r(q7aVar6.c, j10, null, false)) == null) {
                                                decodeFile = q(1, q7aVar6.c);
                                            }
                                            if (decodeFile == null) {
                                                int max = (z9 || q7aVar6.h != 0) ? 90 : Math.max(decodeFile.getWidth(), decodeFile.getHeight());
                                                Bitmap.CompressFormat compressFormat = (oecVar2 == null || !oecVar2.N) ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.WEBP;
                                                float f3 = max;
                                                int i34 = max > 90 ? 80 : 55;
                                                str20 = str17;
                                                i13 = 90;
                                                oecVar3 = oecVar2;
                                                obj6 = obj;
                                                obj7 = "final";
                                                obj8 = obj2;
                                                obj5 = "groupId";
                                                obj3 = obj9;
                                                obj4 = obj10;
                                                i8 = i6;
                                                Bitmap.CompressFormat compressFormat2 = compressFormat;
                                                q7aVar2 = q7aVar6;
                                                bitmap = decodeFile;
                                                photoSize2 = in5.W(null, bitmap, compressFormat2, f3, f3, i34, z9, 0, 0, false);
                                                if (photoSize2 == null || photoSize2.location == null) {
                                                    i14 = 0;
                                                } else {
                                                    i14 = 0;
                                                    str25 = C(k5Var2, photoSize2, null, true, false);
                                                    tL_document2 = new TLRPC.TL_document();
                                                    tL_document2.file_reference = new byte[i14];
                                                    if (photoSize2 != null) {
                                                        tL_document2.thumbs.add(photoSize2);
                                                        tL_document2.flags |= 1;
                                                    }
                                                    oecVar4 = q7aVar2.k;
                                                    if (oecVar4 == null && oecVar4.N) {
                                                        tL_document2.mime_type = "video/webm";
                                                    } else {
                                                        tL_document2.mime_type = str14;
                                                    }
                                                    k5Var2.e().u(false);
                                                    oecVar5 = q7aVar2.k;
                                                    if (oecVar5 != null && oecVar5.N) {
                                                        tL_document2.attributes.add(new TLRPC.TL_documentAttributeAnimated());
                                                        TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                                                        tL_documentAttributeSticker.alt = "👍";
                                                        tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                                                        tL_document2.attributes.add(tL_documentAttributeSticker);
                                                        if (photoSize2 != null && (fileLocation = photoSize2.location) != null) {
                                                            Locale locale = Locale.US;
                                                            str25 = fileLocation.volume_id + str16 + fileLocation.local_id + "@b1";
                                                        }
                                                    }
                                                    if (z9) {
                                                        tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo_layer159();
                                                    } else {
                                                        tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                                                        tL_documentAttributeVideo.supports_streaming = true;
                                                    }
                                                    tL_document2.attributes.add(tL_documentAttributeVideo);
                                                    if (oecVar3 != null || (!oecVar3.b() && q7aVar2.o)) {
                                                        if (file.exists()) {
                                                            tL_document2.size = (int) file.length();
                                                        }
                                                        w(q7aVar2.c, tL_documentAttributeVideo, null);
                                                    } else {
                                                        if (q7aVar2.o && oecVar3.t) {
                                                            w(q7aVar2.c, tL_documentAttributeVideo, oecVar3);
                                                            oecVar3.h = tL_documentAttributeVideo.w;
                                                            oecVar3.i = tL_documentAttributeVideo.h;
                                                        } else {
                                                            tL_documentAttributeVideo.duration = (int) (oecVar3.r / 1000);
                                                        }
                                                        int i35 = oecVar3.g;
                                                        fo6 fo6Var = oecVar3.H;
                                                        if (fo6Var != null) {
                                                            i15 = fo6Var.i;
                                                            i16 = fo6Var.j;
                                                        } else {
                                                            i15 = oecVar3.k;
                                                            i16 = oecVar3.l;
                                                        }
                                                        if (i35 == i13 || i35 == 270) {
                                                            tL_documentAttributeVideo.w = i16;
                                                            tL_documentAttributeVideo.h = i15;
                                                        } else {
                                                            tL_documentAttributeVideo.w = i15;
                                                            tL_documentAttributeVideo.h = i16;
                                                        }
                                                        tL_document2.size = oecVar3.q;
                                                    }
                                                    str13 = str24;
                                                    q7aVar = q7aVar2;
                                                    tL_document = tL_document2;
                                                    str23 = str25;
                                                }
                                            } else {
                                                oecVar3 = oecVar2;
                                                q7aVar2 = q7aVar6;
                                                obj5 = "groupId";
                                                obj6 = obj;
                                                obj7 = "final";
                                                obj8 = obj2;
                                                str20 = str17;
                                                obj3 = obj9;
                                                obj4 = obj10;
                                                i8 = i6;
                                                i13 = 90;
                                                i14 = 0;
                                                bitmap = decodeFile;
                                                photoSize2 = null;
                                            }
                                            str25 = null;
                                            tL_document2 = new TLRPC.TL_document();
                                            tL_document2.file_reference = new byte[i14];
                                            if (photoSize2 != null) {
                                            }
                                            oecVar4 = q7aVar2.k;
                                            if (oecVar4 == null) {
                                            }
                                            tL_document2.mime_type = str14;
                                            k5Var2.e().u(false);
                                            oecVar5 = q7aVar2.k;
                                            if (oecVar5 != null) {
                                                tL_document2.attributes.add(new TLRPC.TL_documentAttributeAnimated());
                                                TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker2 = new TLRPC.TL_documentAttributeSticker();
                                                tL_documentAttributeSticker2.alt = "👍";
                                                tL_documentAttributeSticker2.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                                                tL_document2.attributes.add(tL_documentAttributeSticker2);
                                                if (photoSize2 != null) {
                                                    Locale locale2 = Locale.US;
                                                    str25 = fileLocation.volume_id + str16 + fileLocation.local_id + "@b1";
                                                }
                                            }
                                            if (z9) {
                                            }
                                            tL_document2.attributes.add(tL_documentAttributeVideo);
                                            if (oecVar3 != null) {
                                            }
                                            if (file.exists()) {
                                            }
                                            w(q7aVar2.c, tL_documentAttributeVideo, null);
                                            str13 = str24;
                                            q7aVar = q7aVar2;
                                            tL_document = tL_document2;
                                            str23 = str25;
                                        } else {
                                            z9 = z11;
                                            str19 = str18;
                                            q7aVar = q7aVar6;
                                            obj3 = "parentObject";
                                            obj4 = "masks";
                                            obj5 = "groupId";
                                            obj6 = obj;
                                            obj7 = "final";
                                            obj8 = obj2;
                                            str20 = str17;
                                            i8 = i6;
                                            str21 = str5;
                                            str22 = str9;
                                            if (tL_document.thumbs.isEmpty()) {
                                                oecVar3 = oecVar2;
                                                str23 = null;
                                                bitmap = null;
                                            } else {
                                                String str80 = q7aVar.e;
                                                Bitmap decodeFile4 = str80 != null ? BitmapFactory.decodeFile(str80) : null;
                                                if (decodeFile4 == null && (decodeFile4 = r(q7aVar.c, j10, null, false)) == null) {
                                                    decodeFile4 = q(1, q7aVar.c);
                                                }
                                                bitmap = decodeFile4;
                                                if (bitmap != null) {
                                                    int max2 = (z9 || q7aVar.h != 0) ? 90 : Math.max(bitmap.getWidth(), bitmap.getHeight());
                                                    float f4 = max2;
                                                    oecVar3 = oecVar2;
                                                    photoSize = in5.W(null, bitmap, (oecVar2 == null || !oecVar2.N) ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.WEBP, f4, f4, max2 > 90 ? 80 : 55, z9, 0, 0, false);
                                                    if (photoSize == null || photoSize.location == null) {
                                                        i9 = 1;
                                                        str23 = null;
                                                    } else {
                                                        i9 = 1;
                                                        str23 = C(k5Var2, photoSize, null, true, false);
                                                    }
                                                } else {
                                                    oecVar3 = oecVar2;
                                                    i9 = 1;
                                                    photoSize = null;
                                                    str23 = null;
                                                }
                                                if (photoSize != null) {
                                                    tL_document.thumbs.add(photoSize);
                                                    tL_document.flags |= i9;
                                                }
                                            }
                                        }
                                        m = in5.m(q7aVar.f);
                                        if (m == null && q7aVar.g != null) {
                                            m = new fn5(q7aVar.g);
                                        }
                                        if (oecVar3 != null && oecVar3.t) {
                                            size = tL_document.attributes.size();
                                            i12 = 0;
                                            while (true) {
                                                ArrayList<TLRPC.DocumentAttribute> arrayList22 = tL_document.attributes;
                                                if (i12 < size) {
                                                    arrayList22.add(new TLRPC.TL_documentAttributeAnimated());
                                                    break;
                                                } else if (arrayList22.get(i12) instanceof TLRPC.TL_documentAttributeAnimated) {
                                                    break;
                                                } else {
                                                    i12++;
                                                }
                                            }
                                        }
                                        if (oecVar3 != null && (oecVar3.b() || !q7aVar.o)) {
                                            File file19 = new File(xb4.z(4), str22 + xea.p() + str15 + (!oecVar3.N ? "webm" : str20));
                                            xea.x();
                                            str13 = file19.getAbsolutePath();
                                        }
                                        hashMap4 = new HashMap();
                                        hashMap4.put(obj8, str12);
                                        if (q7aVar.p && !TextUtils.isEmpty(q7aVar.f)) {
                                            hashMap4.put("imagePath", q7aVar.f);
                                        }
                                        final String str77222 = str19;
                                        if (str19 != null) {
                                            hashMap4.put(obj3, str77222);
                                        }
                                        if (z10 && z2) {
                                            int i36 = i3 + 1;
                                            hashMap4.put(obj5, String.valueOf(j7));
                                            if (z6 || !((ki8Var == null && i36 == 10) || i8 == i5 - 1)) {
                                                i10 = i36;
                                            } else {
                                                hashMap4.put(obj7, obj6);
                                                i10 = i36;
                                                j11 = 0;
                                                if (!z9 && ((oecVar3 == null || !oecVar3.N) && (arrayList4 = q7aVar.j) != null && !arrayList4.isEmpty())) {
                                                    tL_document.attributes.add(new TLRPC.TL_documentAttributeHasStickers());
                                                    SerializedData serializedData2 = new SerializedData((q7aVar.j.size() * 20) + 4);
                                                    serializedData2.writeInt32(q7aVar.j.size());
                                                    for (i11 = 0; i11 < q7aVar.j.size(); i11++) {
                                                        ((TLRPC.InputDocument) q7aVar.j.get(i11)).serializeToStream(serializedData2);
                                                    }
                                                    hashMap4.put(obj4, Utilities.f(serializedData2.toByteArray()));
                                                    serializedData2.cleanup();
                                                }
                                                final TLRPC.PhotoSize photoSize3222 = m;
                                                str9 = str22;
                                                str11 = str21;
                                                i6 = i8;
                                                final Bitmap bitmap2222 = bitmap;
                                                final q7a q7aVar7222 = q7aVar;
                                                final TLRPC.TL_document tL_document6222 = tL_document;
                                                final String str78222 = str23;
                                                i7 = i5;
                                                str10 = str16;
                                                final String str79222 = str13;
                                                k5Var3 = k5Var;
                                                hl.c3(new Runnable() { // from class: i6a
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        String str802;
                                                        Bitmap bitmap3 = bitmap2222;
                                                        if (bitmap3 != null && (str802 = str78222) != null) {
                                                            in5.z().K(new BitmapDrawable(bitmap3), str802, false);
                                                        }
                                                        r47 r47Var4 = r47Var;
                                                        TLRPC.TL_inputPollAnswer tL_inputPollAnswer2 = tL_inputPollAnswer;
                                                        k5 k5Var4 = k5Var;
                                                        oec oecVar7 = oecVar3;
                                                        TLRPC.TL_document tL_document7 = tL_document6222;
                                                        String str81 = str79222;
                                                        HashMap hashMap9 = hashMap4;
                                                        q7a q7aVar8 = q7aVar7222;
                                                        String str82 = str77222;
                                                        if (r47Var4 != null || tL_inputPollAnswer2 != null) {
                                                            r7a.B(k5Var4.a).s(r47Var4, tL_inputPollAnswer2, null, oecVar7, tL_document7, str81, null, hashMap9, false, q7aVar8.u, str82);
                                                            return;
                                                        }
                                                        p7a e72 = p7a.e(tL_document7, oecVar7, str81, j, r47Var2, r47Var3, q7aVar8.d, q7aVar8.i, hashMap9, z4, i, i2, q7aVar8.h, str82, q7aVar8.u);
                                                        e72.H = storyItem;
                                                        e72.J = ou1Var;
                                                        e72.K = c5aVar;
                                                        e72.O = j3;
                                                        e72.L = z5;
                                                        e72.P = q7aVar8.w;
                                                        e72.k = q7aVar8.B;
                                                        e72.o = photoSize3222;
                                                        e72.Q = j4;
                                                        e72.R = j5;
                                                        e72.T = b77Var;
                                                        e72.U = q7aVar8.p;
                                                        e72.V = q7aVar8.A / 1000;
                                                        e72.j = ki8Var;
                                                        r7a.B(k5Var4.a).q0(e72);
                                                    }
                                                });
                                                arrayList8 = arrayList2;
                                                i3 = i10;
                                                arrayList9 = arrayList13;
                                                arrayList10 = arrayList14;
                                                arrayList11 = arrayList16;
                                                j6 = j11;
                                            }
                                        } else {
                                            i10 = i3;
                                        }
                                        j11 = j6;
                                        if (!z9) {
                                            tL_document.attributes.add(new TLRPC.TL_documentAttributeHasStickers());
                                            SerializedData serializedData22 = new SerializedData((q7aVar.j.size() * 20) + 4);
                                            serializedData22.writeInt32(q7aVar.j.size());
                                            while (i11 < q7aVar.j.size()) {
                                            }
                                            hashMap4.put(obj4, Utilities.f(serializedData22.toByteArray()));
                                            serializedData22.cleanup();
                                        }
                                        final TLRPC.PhotoSize photoSize32222 = m;
                                        str9 = str22;
                                        str11 = str21;
                                        i6 = i8;
                                        final Bitmap bitmap22222 = bitmap;
                                        final q7a q7aVar72222 = q7aVar;
                                        final TLRPC.TL_document tL_document62222 = tL_document;
                                        final String str782222 = str23;
                                        i7 = i5;
                                        str10 = str16;
                                        final String str792222 = str13;
                                        k5Var3 = k5Var;
                                        hl.c3(new Runnable() { // from class: i6a
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                String str802;
                                                Bitmap bitmap3 = bitmap22222;
                                                if (bitmap3 != null && (str802 = str782222) != null) {
                                                    in5.z().K(new BitmapDrawable(bitmap3), str802, false);
                                                }
                                                r47 r47Var4 = r47Var;
                                                TLRPC.TL_inputPollAnswer tL_inputPollAnswer2 = tL_inputPollAnswer;
                                                k5 k5Var4 = k5Var;
                                                oec oecVar7 = oecVar3;
                                                TLRPC.TL_document tL_document7 = tL_document62222;
                                                String str81 = str792222;
                                                HashMap hashMap9 = hashMap4;
                                                q7a q7aVar8 = q7aVar72222;
                                                String str82 = str77222;
                                                if (r47Var4 != null || tL_inputPollAnswer2 != null) {
                                                    r7a.B(k5Var4.a).s(r47Var4, tL_inputPollAnswer2, null, oecVar7, tL_document7, str81, null, hashMap9, false, q7aVar8.u, str82);
                                                    return;
                                                }
                                                p7a e72 = p7a.e(tL_document7, oecVar7, str81, j, r47Var2, r47Var3, q7aVar8.d, q7aVar8.i, hashMap9, z4, i, i2, q7aVar8.h, str82, q7aVar8.u);
                                                e72.H = storyItem;
                                                e72.J = ou1Var;
                                                e72.K = c5aVar;
                                                e72.O = j3;
                                                e72.L = z5;
                                                e72.P = q7aVar8.w;
                                                e72.k = q7aVar8.B;
                                                e72.o = photoSize32222;
                                                e72.Q = j4;
                                                e72.R = j5;
                                                e72.T = b77Var;
                                                e72.U = q7aVar8.p;
                                                e72.V = q7aVar8.A / 1000;
                                                e72.j = ki8Var;
                                                r7a.B(k5Var4.a).q0(e72);
                                            }
                                        });
                                        arrayList8 = arrayList2;
                                        i3 = i10;
                                        arrayList9 = arrayList13;
                                        arrayList10 = arrayList14;
                                        arrayList11 = arrayList16;
                                        j6 = j11;
                                    }
                                }
                            }
                            str12 = str73;
                            str13 = str72;
                            str14 = "video/mp4";
                            file = file14;
                            str15 = ".";
                            obj = "1";
                            str16 = str8;
                            obj2 = "originalPath";
                            oecVar2 = oecVar;
                            j10 = j9;
                            str17 = "mp4";
                            z11 = z9;
                            tL_document = null;
                            str18 = null;
                            if (tL_document != null) {
                            }
                            m = in5.m(q7aVar.f);
                            if (m == null) {
                                m = new fn5(q7aVar.g);
                            }
                            if (oecVar3 != null) {
                                size = tL_document.attributes.size();
                                i12 = 0;
                                while (true) {
                                    ArrayList<TLRPC.DocumentAttribute> arrayList222 = tL_document.attributes;
                                    if (i12 < size) {
                                    }
                                    i12++;
                                }
                            }
                            if (oecVar3 != null) {
                                if (!oecVar3.N) {
                                }
                                File file192 = new File(xb4.z(4), str22 + xea.p() + str15 + (!oecVar3.N ? "webm" : str20));
                                xea.x();
                                str13 = file192.getAbsolutePath();
                            }
                            hashMap4 = new HashMap();
                            hashMap4.put(obj8, str12);
                            if (q7aVar.p) {
                                hashMap4.put("imagePath", q7aVar.f);
                            }
                            final String str772222 = str19;
                            if (str19 != null) {
                            }
                            if (z10) {
                            }
                            i10 = i3;
                            j11 = j6;
                            if (!z9) {
                            }
                            final TLRPC.PhotoSize photoSize322222 = m;
                            str9 = str22;
                            str11 = str21;
                            i6 = i8;
                            final Bitmap bitmap222222 = bitmap;
                            final q7a q7aVar722222 = q7aVar;
                            final TLRPC.TL_document tL_document622222 = tL_document;
                            final String str7822222 = str23;
                            i7 = i5;
                            str10 = str16;
                            final String str7922222 = str13;
                            k5Var3 = k5Var;
                            hl.c3(new Runnable() { // from class: i6a
                                @Override // java.lang.Runnable
                                public final void run() {
                                    String str802;
                                    Bitmap bitmap3 = bitmap222222;
                                    if (bitmap3 != null && (str802 = str7822222) != null) {
                                        in5.z().K(new BitmapDrawable(bitmap3), str802, false);
                                    }
                                    r47 r47Var4 = r47Var;
                                    TLRPC.TL_inputPollAnswer tL_inputPollAnswer2 = tL_inputPollAnswer;
                                    k5 k5Var4 = k5Var;
                                    oec oecVar7 = oecVar3;
                                    TLRPC.TL_document tL_document7 = tL_document622222;
                                    String str81 = str7922222;
                                    HashMap hashMap9 = hashMap4;
                                    q7a q7aVar8 = q7aVar722222;
                                    String str82 = str772222;
                                    if (r47Var4 != null || tL_inputPollAnswer2 != null) {
                                        r7a.B(k5Var4.a).s(r47Var4, tL_inputPollAnswer2, null, oecVar7, tL_document7, str81, null, hashMap9, false, q7aVar8.u, str82);
                                        return;
                                    }
                                    p7a e72 = p7a.e(tL_document7, oecVar7, str81, j, r47Var2, r47Var3, q7aVar8.d, q7aVar8.i, hashMap9, z4, i, i2, q7aVar8.h, str82, q7aVar8.u);
                                    e72.H = storyItem;
                                    e72.J = ou1Var;
                                    e72.K = c5aVar;
                                    e72.O = j3;
                                    e72.L = z5;
                                    e72.P = q7aVar8.w;
                                    e72.k = q7aVar8.B;
                                    e72.o = photoSize322222;
                                    e72.Q = j4;
                                    e72.R = j5;
                                    e72.T = b77Var;
                                    e72.U = q7aVar8.p;
                                    e72.V = q7aVar8.A / 1000;
                                    e72.j = ki8Var;
                                    r7a.B(k5Var4.a).q0(e72);
                                }
                            });
                            arrayList8 = arrayList2;
                            i3 = i10;
                            arrayList9 = arrayList13;
                            arrayList10 = arrayList14;
                            arrayList11 = arrayList16;
                            j6 = j11;
                        }
                        i28 = i3;
                    }
                }
                i29 = i6 + 1;
                size2 = i7;
                j15 = j7;
                j14 = j8;
                B = z9;
                str = str11;
                str4 = str10;
                hashMap = hashMap3;
                str58 = str7;
                str2 = str9;
                arrayList7 = arrayList;
                j16 = j6;
            }
            i3 = 0;
            ro6Var = q7aVar6.l;
            i4 = i29;
            arrayList2 = arrayList8;
            ArrayList arrayList132 = arrayList9;
            hashMap2 = hashMap;
            i5 = size2;
            ArrayList arrayList142 = arrayList10;
            if (ro6Var == null) {
            }
            ArrayList arrayList162 = arrayList11;
            str5 = str;
            str6 = str2;
            str7 = str58;
            hashMap3 = hashMap2;
            j8 = 0;
            z9 = B;
            if (q7aVar6.o) {
            }
            str8 = str4;
            str9 = str6;
            i6 = i4;
            if (z) {
            }
            if (z) {
            }
            i7 = i5;
            str10 = str8;
            str11 = str5;
            if (arrayList2 != null) {
            }
            ArrayList arrayList212 = arrayList12;
            arrayList8.add(q7aVar6.c);
            arrayList9.add(q7aVar6.c);
            arrayList3.add(q7aVar6.a);
            arrayList11.add(q7aVar6.d);
            arrayList212.add(q7aVar6.i);
            arrayList12 = arrayList212;
            arrayList10 = arrayList3;
            i28 = i3;
            i29 = i6 + 1;
            size2 = i7;
            j15 = j7;
            j14 = j8;
            B = z9;
            str = str11;
            str4 = str10;
            hashMap = hashMap3;
            str58 = str7;
            str2 = str9;
            arrayList7 = arrayList;
            j16 = j6;
        }
        boolean z26 = B;
        ArrayList arrayList23 = arrayList8;
        ArrayList arrayList24 = arrayList9;
        int i37 = size2;
        ArrayList arrayList25 = arrayList10;
        ArrayList arrayList26 = arrayList11;
        long j19 = j16;
        int i38 = 10;
        if (j19 != j14 && !z6) {
            y(k5Var3, j19, i);
        }
        if (kj4Var != null) {
            ((iq5) kj4Var.b).n();
        }
        if (arrayList23 != null && !arrayList23.isEmpty()) {
            int i39 = 1;
            long[] jArr = new long[1];
            int size3 = arrayList23.size();
            int i40 = i28;
            int i41 = 0;
            while (i41 < size3) {
                if (!z || z26 || i37 <= i39 || i40 % 10 != 0) {
                    z8 = false;
                } else {
                    z8 = false;
                    jArr[0] = Utilities.b.nextLong();
                    i40 = 0;
                }
                int i42 = i40 + 1;
                ArrayList arrayList27 = arrayList23;
                String str81 = (String) arrayList27.get(i41);
                ArrayList arrayList28 = arrayList24;
                String str82 = (String) arrayList28.get(i41);
                ArrayList arrayList29 = arrayList25;
                Uri uri9 = (Uri) arrayList29.get(i41);
                ArrayList arrayList30 = arrayList12;
                ArrayList arrayList31 = (ArrayList) arrayList30.get(i41);
                boolean z27 = (i42 == i38 || i41 == size3 + (-1)) ? true : z8;
                ArrayList arrayList32 = arrayList26;
                int i43 = size3;
                int i44 = i38;
                arrayList24 = arrayList28;
                arrayList25 = arrayList29;
                arrayList12 = arrayList30;
                arrayList26 = arrayList32;
                String str83 = str59;
                int T = T(k5Var3, str81, str82, uri9, str83, j, r47Var2, r47Var3, storyItem, ou1Var, arrayList31, r47Var, jArr, z27, (CharSequence) arrayList32.get(i41), z4, i, null, z, c5aVar, j3, z5, j4, j5, b77Var, null, -1);
                if (T != 0) {
                    hl.c3(new me7(T, (Object) k5Var3, (byte) 16));
                }
                i41++;
                str59 = str83;
                arrayList23 = arrayList27;
                size3 = i43;
                i40 = i42;
                i39 = 1;
                i38 = i44;
            }
        }
        if (f11.a) {
            cc4.b("total send time = " + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public static void Q(k5 k5Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j, r47 r47Var, r47 r47Var2, ou1 ou1Var, boolean z, int i, int i2, c5a c5aVar, long j2, long j3, long j4) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
        int i3 = 0;
        richMessage.rtl = false;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
            if (pageBlock != null) {
                richMessage.blocks.add(pageBlock);
            }
        }
        if (richMessage.blocks.isEmpty()) {
            return;
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            richMessage.photos.addAll(arrayList2);
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            richMessage.documents.addAll(arrayList3);
        }
        IdentityHashMap identityHashMap = new IdentityHashMap();
        ArrayList<TL_iv.PageBlock> arrayList5 = richMessage.blocks;
        int size2 = arrayList5.size();
        while (i3 < size2) {
            TL_iv.PageBlock pageBlock2 = arrayList5.get(i3);
            i3++;
            j(pageBlock2, identityHashMap);
        }
        p7a c = p7a.c(null, null, null, null, null, null, null, null, null, null, j, null, r47Var, r47Var2, null, true, null, null, null, null, z, i, i2, 0, null, null, false, false);
        c.Y = richMessage;
        c.Z = arrayList4;
        c.J = ou1Var;
        c.K = c5aVar;
        c.O = j2;
        c.R = j3;
        c.Q = j4;
        B(k5Var.a).q0(c);
    }

    public static void R(final int i, final long j, final long j2, final long j3, final k5 k5Var, final ou1 ou1Var, final r47 r47Var, final r47 r47Var2, final c5a c5aVar, final HashMap hashMap, final TLRPC.BotInlineResult botInlineResult, final TL_stories.StoryItem storyItem, final e eVar, final boolean z) {
        p7a d;
        TLRPC.TL_webPagePending tL_webPagePending;
        if (botInlineResult != null) {
            TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
            if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaAuto) {
                new Thread(new Runnable() { // from class: r6a
                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0490  */
                    /* JADX WARN: Removed duplicated region for block: B:19:0x04a4 A[ADDED_TO_REGION] */
                    /* JADX WARN: Removed duplicated region for block: B:23:0x04af  */
                    /* JADX WARN: Removed duplicated region for block: B:32:0x04ed  */
                    /* JADX WARN: Removed duplicated region for block: B:38:0x0542  */
                    /* JADX WARN: Removed duplicated region for block: B:40:0x0555  */
                    /* JADX WARN: Removed duplicated region for block: B:49:0x0583  */
                    /* JADX WARN: Removed duplicated region for block: B:52:0x058e  */
                    /* JADX WARN: Removed duplicated region for block: B:58:0x054f  */
                    /* JADX WARN: Removed duplicated region for block: B:60:0x0534  */
                    /* JADX WARN: Type inference failed for: r9v11 */
                    /* JADX WARN: Type inference failed for: r9v6 */
                    /* JADX WARN: Type inference failed for: r9v7 */
                    /* JADX WARN: Type inference failed for: r9v8 */
                    /* JADX WARN: Type inference failed for: r9v9, types: [org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$Document] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        boolean z2;
                        char c;
                        long j4;
                        char c2;
                        final String str;
                        ?? r9;
                        TLRPC.TL_photo tL_photo;
                        TLRPC.TL_game tL_game;
                        Bitmap G;
                        int i2;
                        final HashMap hashMap2;
                        TLRPC.TL_photo tL_photo2;
                        String[] strArr;
                        long j5;
                        TLRPC.InputPeer inputPeer;
                        long j6;
                        TLRPC.InputPeer inputPeer2;
                        boolean P4;
                        boolean z3;
                        int i3;
                        TLRPC.WebDocument webDocument;
                        long j7 = j;
                        boolean B = wf3.B(j7);
                        final TLRPC.BotInlineResult botInlineResult2 = botInlineResult;
                        boolean equals = "game".equals(botInlineResult2.type);
                        final k5 k5Var2 = k5Var;
                        if (!equals) {
                            if (botInlineResult2 instanceof TLRPC.TL_botInlineMediaResult) {
                                TLRPC.Document document = botInlineResult2.document;
                                if (document == null) {
                                    TLRPC.Photo photo = botInlineResult2.photo;
                                    if (photo != null && (photo instanceof TLRPC.TL_photo)) {
                                        tL_photo = (TLRPC.TL_photo) photo;
                                        j4 = j7;
                                        z2 = B;
                                        tL_game = null;
                                        str = null;
                                    }
                                } else if (document instanceof TLRPC.TL_document) {
                                    r9 = (TLRPC.TL_document) document;
                                    j4 = j7;
                                    z2 = B;
                                    tL_photo = null;
                                    tL_game = null;
                                    str = null;
                                    hashMap2 = hashMap;
                                    if (hashMap2 != null && (webDocument = botInlineResult2.content) != null) {
                                        hashMap2.put("originalPath", webDocument.url);
                                    }
                                    final Bitmap[] bitmapArr = new Bitmap[1];
                                    final TLRPC.TL_game tL_game2 = tL_game;
                                    String[] strArr2 = new String[1];
                                    if (z2 && r9 != 0) {
                                        for (i3 = 0; i3 < r9.attributes.size(); i3++) {
                                            if (r9.attributes.get(i3) instanceof TLRPC.TL_documentAttributeVideo) {
                                                TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) r9.attributes.get(i3);
                                                TLRPC.TL_documentAttributeVideo_layer159 tL_documentAttributeVideo_layer159 = new TLRPC.TL_documentAttributeVideo_layer159();
                                                tL_documentAttributeVideo_layer159.flags = tL_documentAttributeVideo.flags;
                                                tL_documentAttributeVideo_layer159.round_message = tL_documentAttributeVideo.round_message;
                                                tL_documentAttributeVideo_layer159.supports_streaming = tL_documentAttributeVideo.supports_streaming;
                                                tL_documentAttributeVideo_layer159.duration = tL_documentAttributeVideo.duration;
                                                tL_documentAttributeVideo_layer159.w = tL_documentAttributeVideo.w;
                                                tL_documentAttributeVideo_layer159.h = tL_documentAttributeVideo.h;
                                                r9.attributes.set(i3, tL_documentAttributeVideo_layer159);
                                            }
                                        }
                                    }
                                    if (r47.s3(r9, false)) {
                                        tL_photo2 = tL_photo;
                                        strArr = strArr2;
                                        j5 = 0;
                                        inputPeer = null;
                                    } else {
                                        TLRPC.PhotoSize w = xb4.w(r9.thumbs, jn7.q5, false, null, false);
                                        xb4.G(k5Var2.a);
                                        File I = xb4.I(r9);
                                        if (I.exists()) {
                                            z3 = true;
                                        } else {
                                            xb4.G(k5Var2.a);
                                            z3 = true;
                                            I = xb4.J(r9, null, true, true);
                                        }
                                        inputPeer = null;
                                        boolean z4 = z3;
                                        tL_photo2 = tL_photo;
                                        strArr = strArr2;
                                        j5 = 0;
                                        r7a.v(k5Var2, z2, r9, I.getAbsolutePath(), null, 0L, false);
                                        strArr[0] = r7a.C(k5Var2, w, bitmapArr, z4, z4);
                                    }
                                    if (wf3.B(j4)) {
                                        j6 = j4;
                                        inputPeer2 = uc7.s1(k5Var2.a).j1(j6);
                                    } else {
                                        j6 = j4;
                                        inputPeer2 = inputPeer;
                                    }
                                    if (inputPeer2 != null && inputPeer2.user_id != j5 && uc7.s1(k5Var2.a).Y1(inputPeer2.user_id) != null && uc7.s1(k5Var2.a).Y1(inputPeer2.user_id).voice_messages_forbidden && r9 != 0) {
                                        P4 = r47.P4(r9);
                                        e eVar2 = eVar;
                                        if (!P4) {
                                            hl.c3(new ds8(eVar2, (byte) 24));
                                            return;
                                        } else if (r47.h4(r9)) {
                                            hl.c3(new ds8(eVar2, (byte) 25));
                                            return;
                                        }
                                    }
                                    final r47 r47Var3 = r47Var;
                                    final r47 r47Var4 = r47Var2;
                                    final long j8 = j6;
                                    final boolean z5 = z;
                                    final int i4 = i;
                                    final c5a c5aVar2 = c5aVar;
                                    final TL_stories.StoryItem storyItem2 = storyItem;
                                    final ou1 ou1Var2 = ou1Var;
                                    final long j9 = j2;
                                    final long j10 = j3;
                                    final TLRPC.TL_document tL_document = r9;
                                    final String[] strArr3 = strArr;
                                    final TLRPC.TL_photo tL_photo3 = tL_photo2;
                                    hl.c3(new Runnable() { // from class: a7a
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            p7a c3;
                                            TLRPC.TL_document tL_document2 = TLRPC.TL_document.this;
                                            long j11 = j8;
                                            r47 r47Var5 = r47Var3;
                                            r47 r47Var6 = r47Var4;
                                            TLRPC.BotInlineResult botInlineResult3 = botInlineResult2;
                                            HashMap hashMap3 = hashMap2;
                                            boolean z6 = z5;
                                            int i5 = i4;
                                            if (tL_document2 != null) {
                                                Bitmap[] bitmapArr2 = bitmapArr;
                                                if (bitmapArr2[0] != null) {
                                                    String[] strArr4 = strArr3;
                                                    if (strArr4[0] != null) {
                                                        in5.z().K(new BitmapDrawable(bitmapArr2[0]), strArr4[0], false);
                                                    }
                                                }
                                                TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult3.send_message;
                                                c3 = p7a.f(tL_document2, null, str, j11, r47Var5, r47Var6, botInlineMessage2.message, botInlineMessage2.entities, botInlineMessage2.reply_markup, hashMap3, z6, i5, 0, 0, botInlineResult3, null, false);
                                            } else {
                                                TLRPC.TL_photo tL_photo4 = tL_photo3;
                                                if (tL_photo4 != null) {
                                                    TLRPC.WebDocument webDocument2 = botInlineResult3.content;
                                                    String str2 = webDocument2 != null ? webDocument2.url : null;
                                                    TLRPC.BotInlineMessage botInlineMessage3 = botInlineResult3.send_message;
                                                    c3 = p7a.c(null, botInlineMessage3.message, null, tL_photo4, null, null, null, null, null, null, j11, str2, r47Var5, r47Var6, null, true, null, botInlineMessage3.entities, botInlineMessage3.reply_markup, hashMap3, z6, i5, 0, 0, botInlineResult3, null, false, false);
                                                } else {
                                                    TLRPC.TL_game tL_game3 = tL_game2;
                                                    c3 = tL_game3 != null ? p7a.c(null, null, null, null, null, null, null, tL_game3, null, null, j11, null, r47Var5, r47Var6, null, true, null, null, botInlineResult3.send_message.reply_markup, hashMap3, z6, i5, 0, 0, null, null, false, false) : null;
                                                }
                                            }
                                            if (c3 != null) {
                                                c3.K = c5aVar2;
                                                c3.H = storyItem2;
                                                c3.J = ou1Var2;
                                                c3.Q = j9;
                                                c3.R = j10;
                                                r7a.B(k5Var2.a).q0(c3);
                                            }
                                        }
                                    });
                                }
                                j4 = j7;
                                z2 = B;
                                tL_photo = null;
                                tL_game = null;
                                str = null;
                            } else {
                                TLRPC.WebDocument webDocument2 = botInlineResult2.content;
                                if (webDocument2 != null) {
                                    String x = in5.x(webDocument2.url, null);
                                    File file = new File(xb4.z(4), Utilities.a(botInlineResult2.content.url) + (TextUtils.isEmpty(x) ? xb4.C(botInlineResult2.content.mime_type) : c00.i(".", x)));
                                    String absolutePath = file.exists() ? file.getAbsolutePath() : botInlineResult2.content.url;
                                    String str2 = botInlineResult2.type;
                                    str2.getClass();
                                    z2 = B;
                                    switch (str2.hashCode()) {
                                        case -1890252483:
                                            if (str2.equals("sticker")) {
                                                c = 0;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 102340:
                                            if (str2.equals("gif")) {
                                                c = 1;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 3143036:
                                            if (str2.equals("file")) {
                                                c = 2;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 93166550:
                                            if (str2.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                                                c = 3;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 106642994:
                                            if (str2.equals("photo")) {
                                                c = 4;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 112202875:
                                            if (str2.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                                                c = 5;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 112386354:
                                            if (str2.equals("voice")) {
                                                c = 6;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        default:
                                            c = 65535;
                                            break;
                                    }
                                    switch (c) {
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 5:
                                        case 6:
                                            TLRPC.TL_document tL_document2 = new TLRPC.TL_document();
                                            j4 = j7;
                                            tL_document2.id = 0L;
                                            tL_document2.size = 0L;
                                            tL_document2.dc_id = 0;
                                            tL_document2.mime_type = botInlineResult2.content.mime_type;
                                            tL_document2.file_reference = new byte[0];
                                            tL_document2.date = ConnectionsManager.getInstance(k5Var2.a).getCurrentTime();
                                            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                            tL_document2.attributes.add(tL_documentAttributeFilename);
                                            String str3 = botInlineResult2.type;
                                            str3.getClass();
                                            switch (str3.hashCode()) {
                                                case -1890252483:
                                                    if (str3.equals("sticker")) {
                                                        c2 = 0;
                                                        break;
                                                    }
                                                    c2 = 65535;
                                                    break;
                                                case 102340:
                                                    if (str3.equals("gif")) {
                                                        c2 = 1;
                                                        break;
                                                    }
                                                    c2 = 65535;
                                                    break;
                                                case 3143036:
                                                    if (str3.equals("file")) {
                                                        c2 = 2;
                                                        break;
                                                    }
                                                    c2 = 65535;
                                                    break;
                                                case 93166550:
                                                    if (str3.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                                                        c2 = 3;
                                                        break;
                                                    }
                                                    c2 = 65535;
                                                    break;
                                                case 112202875:
                                                    if (str3.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                                                        c2 = 4;
                                                        break;
                                                    }
                                                    c2 = 65535;
                                                    break;
                                                case 112386354:
                                                    if (str3.equals("voice")) {
                                                        c2 = 5;
                                                        break;
                                                    }
                                                    c2 = 65535;
                                                    break;
                                                default:
                                                    c2 = 65535;
                                                    break;
                                            }
                                            switch (c2) {
                                                case 0:
                                                    TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                                                    tL_documentAttributeSticker.alt = "";
                                                    tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                                                    tL_document2.attributes.add(tL_documentAttributeSticker);
                                                    TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = new TLRPC.TL_documentAttributeImageSize();
                                                    int[] g1 = r47.g1(botInlineResult2);
                                                    tL_documentAttributeImageSize.w = g1[0];
                                                    tL_documentAttributeImageSize.h = g1[1];
                                                    tL_document2.attributes.add(tL_documentAttributeImageSize);
                                                    tL_documentAttributeFilename.file_name = "sticker.webp";
                                                    try {
                                                        if (botInlineResult2.thumb != null) {
                                                            Bitmap G2 = in5.G(new File(xb4.z(4), Utilities.a(botInlineResult2.thumb.url) + "." + in5.x(botInlineResult2.thumb.url, "webp")).getAbsolutePath(), null, 90.0f, 90.0f, true);
                                                            if (G2 != null) {
                                                                TLRPC.PhotoSize U = in5.U(G2, 90.0f, 90.0f, 55, false);
                                                                if (U != null) {
                                                                    tL_document2.thumbs.add(U);
                                                                    tL_document2.flags |= 1;
                                                                }
                                                                G2.recycle();
                                                                break;
                                                            }
                                                        }
                                                    } catch (Throwable th) {
                                                        cc4.g(th, true);
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    tL_documentAttributeFilename.file_name = "animation.gif";
                                                    if (absolutePath.endsWith("mp4")) {
                                                        tL_document2.mime_type = "video/mp4";
                                                        tL_document2.attributes.add(new TLRPC.TL_documentAttributeAnimated());
                                                    } else {
                                                        tL_document2.mime_type = "image/gif";
                                                    }
                                                    int i5 = z2 ? 90 : jn7.q5;
                                                    try {
                                                        if (absolutePath.endsWith("mp4")) {
                                                            G = r7a.q(1, absolutePath);
                                                            if (G == null) {
                                                                TLRPC.WebDocument webDocument3 = botInlineResult2.thumb;
                                                                if ((webDocument3 instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument3.mime_type)) {
                                                                    String x2 = in5.x(botInlineResult2.thumb.url, null);
                                                                    G = r7a.q(1, new File(xb4.z(4), Utilities.a(botInlineResult2.thumb.url) + (TextUtils.isEmpty(x2) ? xb4.C(botInlineResult2.thumb.mime_type) : "." + x2)).getAbsolutePath());
                                                                }
                                                            }
                                                        } else {
                                                            float f = i5;
                                                            G = in5.G(absolutePath, null, f, f, true);
                                                        }
                                                        if (G != null) {
                                                            float f2 = i5;
                                                            TLRPC.PhotoSize U2 = in5.U(G, f2, f2, i5 > 90 ? 80 : 55, false);
                                                            if (U2 != null) {
                                                                tL_document2.thumbs.add(U2);
                                                                tL_document2.flags |= 1;
                                                            }
                                                            G.recycle();
                                                            break;
                                                        }
                                                    } catch (Throwable th2) {
                                                        cc4.g(th2, true);
                                                        break;
                                                    }
                                                    break;
                                                case 2:
                                                    int lastIndexOf = botInlineResult2.content.mime_type.lastIndexOf(47);
                                                    if (lastIndexOf != -1) {
                                                        tL_documentAttributeFilename.file_name = "file.".concat(botInlineResult2.content.mime_type.substring(lastIndexOf + 1));
                                                        break;
                                                    } else {
                                                        tL_documentAttributeFilename.file_name = "file";
                                                        break;
                                                    }
                                                case 3:
                                                    TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                                    tL_documentAttributeAudio.duration = r47.f1(botInlineResult2);
                                                    tL_documentAttributeAudio.title = botInlineResult2.title;
                                                    int i6 = tL_documentAttributeAudio.flags;
                                                    tL_documentAttributeAudio.flags = i6 | 1;
                                                    String str4 = botInlineResult2.description;
                                                    if (str4 != null) {
                                                        tL_documentAttributeAudio.performer = str4;
                                                        tL_documentAttributeAudio.flags = i6 | 3;
                                                    }
                                                    tL_documentAttributeFilename.file_name = "audio.mp3";
                                                    tL_document2.attributes.add(tL_documentAttributeAudio);
                                                    break;
                                                case 4:
                                                    tL_documentAttributeFilename.file_name = "video.mp4";
                                                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo2 = new TLRPC.TL_documentAttributeVideo();
                                                    int[] g12 = r47.g1(botInlineResult2);
                                                    tL_documentAttributeVideo2.w = g12[0];
                                                    tL_documentAttributeVideo2.h = g12[1];
                                                    tL_documentAttributeVideo2.duration = r47.f1(botInlineResult2);
                                                    tL_documentAttributeVideo2.supports_streaming = true;
                                                    tL_document2.attributes.add(tL_documentAttributeVideo2);
                                                    try {
                                                        if (botInlineResult2.thumb != null) {
                                                            Bitmap G3 = in5.G(new File(xb4.z(4), Utilities.a(botInlineResult2.thumb.url) + "." + in5.x(botInlineResult2.thumb.url, "jpg")).getAbsolutePath(), null, 90.0f, 90.0f, true);
                                                            if (G3 != null) {
                                                                TLRPC.PhotoSize U3 = in5.U(G3, 90.0f, 90.0f, 55, false);
                                                                if (U3 != null) {
                                                                    tL_document2.thumbs.add(U3);
                                                                    tL_document2.flags |= 1;
                                                                }
                                                                G3.recycle();
                                                                break;
                                                            }
                                                        }
                                                    } catch (Throwable th3) {
                                                        cc4.g(th3, true);
                                                        break;
                                                    }
                                                    break;
                                                case 5:
                                                    TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2 = new TLRPC.TL_documentAttributeAudio();
                                                    tL_documentAttributeAudio2.duration = r47.f1(botInlineResult2);
                                                    tL_documentAttributeAudio2.voice = true;
                                                    tL_documentAttributeFilename.file_name = "audio.ogg";
                                                    tL_document2.attributes.add(tL_documentAttributeAudio2);
                                                    break;
                                            }
                                            if (tL_documentAttributeFilename.file_name == null) {
                                                tL_documentAttributeFilename.file_name = "file";
                                            }
                                            if (tL_document2.mime_type == null) {
                                                tL_document2.mime_type = "application/octet-stream";
                                            }
                                            if (tL_document2.thumbs.isEmpty()) {
                                                TLRPC.TL_photoSize tL_photoSize = new TLRPC.TL_photoSize();
                                                int[] g13 = r47.g1(botInlineResult2);
                                                tL_photoSize.w = g13[0];
                                                tL_photoSize.h = g13[1];
                                                tL_photoSize.size = 0;
                                                tL_photoSize.location = new TLRPC.TL_fileLocationUnavailable();
                                                tL_photoSize.type = "x";
                                                tL_document2.thumbs.add(tL_photoSize);
                                                tL_document2.flags |= 1;
                                            }
                                            str = absolutePath;
                                            r9 = tL_document2;
                                            tL_photo = null;
                                            tL_game = null;
                                            break;
                                        case 4:
                                            if (file.exists()) {
                                                i2 = 0;
                                                tL_photo = r7a.B(k5Var2.a).z(absolutePath, null, false);
                                            } else {
                                                i2 = 0;
                                                tL_photo = null;
                                            }
                                            if (tL_photo == null) {
                                                tL_photo = new TLRPC.TL_photo();
                                                tL_photo.date = ConnectionsManager.getInstance(k5Var2.a).getCurrentTime();
                                                tL_photo.file_reference = new byte[i2];
                                                TLRPC.TL_photoSize tL_photoSize2 = new TLRPC.TL_photoSize();
                                                int[] g14 = r47.g1(botInlineResult2);
                                                tL_photoSize2.w = g14[i2];
                                                tL_photoSize2.h = g14[1];
                                                tL_photoSize2.size = 1;
                                                tL_photoSize2.location = new TLRPC.TL_fileLocationUnavailable();
                                                tL_photoSize2.type = "x";
                                                tL_photo.sizes.add(tL_photoSize2);
                                            }
                                            str = absolutePath;
                                            j4 = j7;
                                            tL_game = null;
                                            break;
                                        default:
                                            str = absolutePath;
                                            j4 = j7;
                                            tL_photo = null;
                                            tL_game = null;
                                            break;
                                    }
                                    hashMap2 = hashMap;
                                    if (hashMap2 != null) {
                                        hashMap2.put("originalPath", webDocument.url);
                                    }
                                    final Bitmap[] bitmapArr2 = new Bitmap[1];
                                    final TLRPC.TL_game tL_game22 = tL_game;
                                    String[] strArr22 = new String[1];
                                    if (z2) {
                                        while (i3 < r9.attributes.size()) {
                                        }
                                    }
                                    if (r47.s3(r9, false)) {
                                    }
                                    if (wf3.B(j4)) {
                                    }
                                    if (inputPeer2 != null) {
                                        P4 = r47.P4(r9);
                                        e eVar22 = eVar;
                                        if (!P4) {
                                        }
                                    }
                                    final r47 r47Var32 = r47Var;
                                    final r47 r47Var42 = r47Var2;
                                    final long j82 = j6;
                                    final boolean z52 = z;
                                    final int i42 = i;
                                    final c5a c5aVar22 = c5aVar;
                                    final TL_stories.StoryItem storyItem22 = storyItem;
                                    final ou1 ou1Var22 = ou1Var;
                                    final long j92 = j2;
                                    final long j102 = j3;
                                    final TLRPC.TL_document tL_document3 = r9;
                                    final String[] strArr32 = strArr;
                                    final TLRPC.TL_photo tL_photo32 = tL_photo2;
                                    hl.c3(new Runnable() { // from class: a7a
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            p7a c3;
                                            TLRPC.TL_document tL_document22 = TLRPC.TL_document.this;
                                            long j11 = j82;
                                            r47 r47Var5 = r47Var32;
                                            r47 r47Var6 = r47Var42;
                                            TLRPC.BotInlineResult botInlineResult3 = botInlineResult2;
                                            HashMap hashMap3 = hashMap2;
                                            boolean z6 = z52;
                                            int i52 = i42;
                                            if (tL_document22 != null) {
                                                Bitmap[] bitmapArr22 = bitmapArr2;
                                                if (bitmapArr22[0] != null) {
                                                    String[] strArr4 = strArr32;
                                                    if (strArr4[0] != null) {
                                                        in5.z().K(new BitmapDrawable(bitmapArr22[0]), strArr4[0], false);
                                                    }
                                                }
                                                TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult3.send_message;
                                                c3 = p7a.f(tL_document22, null, str, j11, r47Var5, r47Var6, botInlineMessage2.message, botInlineMessage2.entities, botInlineMessage2.reply_markup, hashMap3, z6, i52, 0, 0, botInlineResult3, null, false);
                                            } else {
                                                TLRPC.TL_photo tL_photo4 = tL_photo32;
                                                if (tL_photo4 != null) {
                                                    TLRPC.WebDocument webDocument22 = botInlineResult3.content;
                                                    String str22 = webDocument22 != null ? webDocument22.url : null;
                                                    TLRPC.BotInlineMessage botInlineMessage3 = botInlineResult3.send_message;
                                                    c3 = p7a.c(null, botInlineMessage3.message, null, tL_photo4, null, null, null, null, null, null, j11, str22, r47Var5, r47Var6, null, true, null, botInlineMessage3.entities, botInlineMessage3.reply_markup, hashMap3, z6, i52, 0, 0, botInlineResult3, null, false, false);
                                                } else {
                                                    TLRPC.TL_game tL_game3 = tL_game22;
                                                    c3 = tL_game3 != null ? p7a.c(null, null, null, null, null, null, null, tL_game3, null, null, j11, null, r47Var5, r47Var6, null, true, null, null, botInlineResult3.send_message.reply_markup, hashMap3, z6, i52, 0, 0, null, null, false, false) : null;
                                                }
                                            }
                                            if (c3 != null) {
                                                c3.K = c5aVar22;
                                                c3.H = storyItem22;
                                                c3.J = ou1Var22;
                                                c3.Q = j92;
                                                c3.R = j102;
                                                r7a.B(k5Var2.a).q0(c3);
                                            }
                                        }
                                    });
                                }
                                j4 = j7;
                                z2 = B;
                                tL_photo = null;
                                tL_game = null;
                                str = null;
                            }
                            r9 = 0;
                            hashMap2 = hashMap;
                            if (hashMap2 != null) {
                            }
                            final Bitmap[] bitmapArr22 = new Bitmap[1];
                            final TLRPC.TL_game tL_game222 = tL_game;
                            String[] strArr222 = new String[1];
                            if (z2) {
                            }
                            if (r47.s3(r9, false)) {
                            }
                            if (wf3.B(j4)) {
                            }
                            if (inputPeer2 != null) {
                            }
                            final r47 r47Var322 = r47Var;
                            final r47 r47Var422 = r47Var2;
                            final long j822 = j6;
                            final boolean z522 = z;
                            final int i422 = i;
                            final c5a c5aVar222 = c5aVar;
                            final TL_stories.StoryItem storyItem222 = storyItem;
                            final ou1 ou1Var222 = ou1Var;
                            final long j922 = j2;
                            final long j1022 = j3;
                            final TLRPC.TL_document tL_document32 = r9;
                            final String[] strArr322 = strArr;
                            final TLRPC.TL_photo tL_photo322 = tL_photo2;
                            hl.c3(new Runnable() { // from class: a7a
                                @Override // java.lang.Runnable
                                public final void run() {
                                    p7a c3;
                                    TLRPC.TL_document tL_document22 = TLRPC.TL_document.this;
                                    long j11 = j822;
                                    r47 r47Var5 = r47Var322;
                                    r47 r47Var6 = r47Var422;
                                    TLRPC.BotInlineResult botInlineResult3 = botInlineResult2;
                                    HashMap hashMap3 = hashMap2;
                                    boolean z6 = z522;
                                    int i52 = i422;
                                    if (tL_document22 != null) {
                                        Bitmap[] bitmapArr222 = bitmapArr22;
                                        if (bitmapArr222[0] != null) {
                                            String[] strArr4 = strArr322;
                                            if (strArr4[0] != null) {
                                                in5.z().K(new BitmapDrawable(bitmapArr222[0]), strArr4[0], false);
                                            }
                                        }
                                        TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult3.send_message;
                                        c3 = p7a.f(tL_document22, null, str, j11, r47Var5, r47Var6, botInlineMessage2.message, botInlineMessage2.entities, botInlineMessage2.reply_markup, hashMap3, z6, i52, 0, 0, botInlineResult3, null, false);
                                    } else {
                                        TLRPC.TL_photo tL_photo4 = tL_photo322;
                                        if (tL_photo4 != null) {
                                            TLRPC.WebDocument webDocument22 = botInlineResult3.content;
                                            String str22 = webDocument22 != null ? webDocument22.url : null;
                                            TLRPC.BotInlineMessage botInlineMessage3 = botInlineResult3.send_message;
                                            c3 = p7a.c(null, botInlineMessage3.message, null, tL_photo4, null, null, null, null, null, null, j11, str22, r47Var5, r47Var6, null, true, null, botInlineMessage3.entities, botInlineMessage3.reply_markup, hashMap3, z6, i52, 0, 0, botInlineResult3, null, false, false);
                                        } else {
                                            TLRPC.TL_game tL_game3 = tL_game222;
                                            c3 = tL_game3 != null ? p7a.c(null, null, null, null, null, null, null, tL_game3, null, null, j11, null, r47Var5, r47Var6, null, true, null, null, botInlineResult3.send_message.reply_markup, hashMap3, z6, i52, 0, 0, null, null, false, false) : null;
                                        }
                                    }
                                    if (c3 != null) {
                                        c3.K = c5aVar222;
                                        c3.H = storyItem222;
                                        c3.J = ou1Var222;
                                        c3.Q = j922;
                                        c3.R = j1022;
                                        r7a.B(k5Var2.a).q0(c3);
                                    }
                                }
                            });
                        }
                        if (B) {
                            return;
                        }
                        TLRPC.TL_game tL_game3 = new TLRPC.TL_game();
                        tL_game3.title = botInlineResult2.title;
                        tL_game3.description = botInlineResult2.description;
                        tL_game3.short_name = botInlineResult2.id;
                        TLRPC.Photo photo2 = botInlineResult2.photo;
                        tL_game3.photo = photo2;
                        if (photo2 == null) {
                            tL_game3.photo = new TLRPC.TL_photoEmpty();
                        }
                        TLRPC.Document document2 = botInlineResult2.document;
                        if (document2 instanceof TLRPC.TL_document) {
                            tL_game3.document = document2;
                            tL_game3.flags |= 1;
                        }
                        tL_game = tL_game3;
                        j4 = j7;
                        z2 = B;
                        tL_photo = null;
                        str = null;
                        r9 = str;
                        hashMap2 = hashMap;
                        if (hashMap2 != null) {
                        }
                        final Bitmap[] bitmapArr222 = new Bitmap[1];
                        final TLRPC.TL_game tL_game2222 = tL_game;
                        String[] strArr2222 = new String[1];
                        if (z2) {
                        }
                        if (r47.s3(r9, false)) {
                        }
                        if (wf3.B(j4)) {
                        }
                        if (inputPeer2 != null) {
                        }
                        final r47 r47Var3222 = r47Var;
                        final r47 r47Var4222 = r47Var2;
                        final long j8222 = j6;
                        final boolean z5222 = z;
                        final int i4222 = i;
                        final c5a c5aVar2222 = c5aVar;
                        final TL_stories.StoryItem storyItem2222 = storyItem;
                        final ou1 ou1Var2222 = ou1Var;
                        final long j9222 = j2;
                        final long j10222 = j3;
                        final TLRPC.TL_document tL_document322 = r9;
                        final String[] strArr3222 = strArr;
                        final TLRPC.TL_photo tL_photo3222 = tL_photo2;
                        hl.c3(new Runnable() { // from class: a7a
                            @Override // java.lang.Runnable
                            public final void run() {
                                p7a c3;
                                TLRPC.TL_document tL_document22 = TLRPC.TL_document.this;
                                long j11 = j8222;
                                r47 r47Var5 = r47Var3222;
                                r47 r47Var6 = r47Var4222;
                                TLRPC.BotInlineResult botInlineResult3 = botInlineResult2;
                                HashMap hashMap3 = hashMap2;
                                boolean z6 = z5222;
                                int i52 = i4222;
                                if (tL_document22 != null) {
                                    Bitmap[] bitmapArr2222 = bitmapArr222;
                                    if (bitmapArr2222[0] != null) {
                                        String[] strArr4 = strArr3222;
                                        if (strArr4[0] != null) {
                                            in5.z().K(new BitmapDrawable(bitmapArr2222[0]), strArr4[0], false);
                                        }
                                    }
                                    TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult3.send_message;
                                    c3 = p7a.f(tL_document22, null, str, j11, r47Var5, r47Var6, botInlineMessage2.message, botInlineMessage2.entities, botInlineMessage2.reply_markup, hashMap3, z6, i52, 0, 0, botInlineResult3, null, false);
                                } else {
                                    TLRPC.TL_photo tL_photo4 = tL_photo3222;
                                    if (tL_photo4 != null) {
                                        TLRPC.WebDocument webDocument22 = botInlineResult3.content;
                                        String str22 = webDocument22 != null ? webDocument22.url : null;
                                        TLRPC.BotInlineMessage botInlineMessage3 = botInlineResult3.send_message;
                                        c3 = p7a.c(null, botInlineMessage3.message, null, tL_photo4, null, null, null, null, null, null, j11, str22, r47Var5, r47Var6, null, true, null, botInlineMessage3.entities, botInlineMessage3.reply_markup, hashMap3, z6, i52, 0, 0, botInlineResult3, null, false, false);
                                    } else {
                                        TLRPC.TL_game tL_game32 = tL_game2222;
                                        c3 = tL_game32 != null ? p7a.c(null, null, null, null, null, null, null, tL_game32, null, null, j11, null, r47Var5, r47Var6, null, true, null, null, botInlineResult3.send_message.reply_markup, hashMap3, z6, i52, 0, 0, null, null, false, false) : null;
                                    }
                                }
                                if (c3 != null) {
                                    c3.K = c5aVar2222;
                                    c3.H = storyItem2222;
                                    c3.J = ou1Var2222;
                                    c3.Q = j9222;
                                    c3.R = j10222;
                                    r7a.B(k5Var2.a).q0(c3);
                                }
                            }
                        });
                    }
                }).run();
                return;
            }
            if (botInlineMessage instanceof TLRPC.TL_botInlineMessageText) {
                if (wf3.B(j)) {
                    for (int i2 = 0; i2 < botInlineResult.send_message.entities.size(); i2++) {
                        TLRPC.MessageEntity messageEntity = botInlineResult.send_message.entities.get(i2);
                        if (messageEntity instanceof TLRPC.TL_messageEntityUrl) {
                            tL_webPagePending = new TLRPC.TL_webPagePending();
                            String str = botInlineResult.send_message.message;
                            int i3 = messageEntity.offset;
                            tL_webPagePending.url = str.substring(i3, messageEntity.length + i3);
                            break;
                        }
                    }
                }
                tL_webPagePending = null;
                TLRPC.TL_webPagePending tL_webPagePending2 = tL_webPagePending;
                TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
                p7a b = p7a.b(botInlineMessage2.message, j, r47Var, r47Var2, tL_webPagePending2, !botInlineMessage2.no_webpage, botInlineMessage2.entities, botInlineMessage2.reply_markup, hashMap, z, i, 0, null, false);
                b.K = c5aVar;
                b.J = ou1Var;
                b.Q = j2;
                b.R = j3;
                B(k5Var.a).q0(b);
                return;
            }
            if (botInlineMessage instanceof TLRPC.TL_botInlineMessageRichMessage) {
                TL_iv.RichMessage richMessage = botInlineMessage.rich_message;
                p7a c = p7a.c(null, null, null, null, null, null, null, null, null, null, j, null, r47Var, r47Var2, null, true, null, null, botInlineMessage.reply_markup, hashMap, z, i, 0, 0, null, null, false, false);
                c.Y = richMessage;
                c.K = c5aVar;
                c.J = ou1Var;
                c.Q = j2;
                c.R = j3;
                B(k5Var.a).q0(c);
                return;
            }
            if (botInlineMessage instanceof TLRPC.TL_botInlineMessageWidget) {
                TLRPC.TL_botInlineMessageWidget tL_botInlineMessageWidget = (TLRPC.TL_botInlineMessageWidget) botInlineMessage;
                TLRPC.TL_messageMediaWidget tL_messageMediaWidget = new TLRPC.TL_messageMediaWidget();
                tL_messageMediaWidget.width = tL_botInlineMessageWidget.width;
                tL_messageMediaWidget.height = tL_botInlineMessageWidget.height;
                tL_messageMediaWidget.payload = tL_botInlineMessageWidget.payload;
                tL_messageMediaWidget.public_data = tL_botInlineMessageWidget.public_data;
                tL_messageMediaWidget.public_data_hash = tL_botInlineMessageWidget.public_data_hash;
                tL_messageMediaWidget.chat_data = tL_botInlineMessageWidget.chat_data;
                tL_messageMediaWidget.widget_id = tL_botInlineMessageWidget.widget_id;
                p7a d2 = p7a.d(tL_messageMediaWidget, j, r47Var, r47Var2, botInlineResult.send_message.reply_markup, hashMap, z, i);
                d2.b = tL_botInlineMessageWidget.message;
                d2.w = tL_botInlineMessageWidget.entities;
                d2.L = tL_botInlineMessageWidget.invert_media;
                d2.K = c5aVar;
                d2.J = ou1Var;
                d2.Q = j2;
                d2.R = j3;
                B(k5Var.a).q0(d2);
                return;
            }
            if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue) {
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                TLRPC.BotInlineMessage botInlineMessage3 = botInlineResult.send_message;
                tL_messageMediaVenue.geo = botInlineMessage3.geo;
                tL_messageMediaVenue.address = botInlineMessage3.address;
                tL_messageMediaVenue.title = botInlineMessage3.title;
                tL_messageMediaVenue.provider = botInlineMessage3.provider;
                String str2 = botInlineMessage3.venue_type;
                tL_messageMediaVenue.venue_id = str2;
                tL_messageMediaVenue.venue_type = str2;
                if (str2 == null) {
                    tL_messageMediaVenue.venue_type = "";
                }
                p7a d3 = p7a.d(tL_messageMediaVenue, j, r47Var, r47Var2, botInlineMessage3.reply_markup, hashMap, z, i);
                d3.K = c5aVar;
                d3.J = ou1Var;
                d3.Q = j2;
                d3.R = j3;
                B(k5Var.a).q0(d3);
                return;
            }
            if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo) {
                if (botInlineMessage.period == 0 && botInlineMessage.proximity_notification_radius == 0) {
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    TLRPC.BotInlineMessage botInlineMessage4 = botInlineResult.send_message;
                    tL_messageMediaGeo.geo = botInlineMessage4.geo;
                    tL_messageMediaGeo.heading = botInlineMessage4.heading;
                    d = p7a.d(tL_messageMediaGeo, j, r47Var, r47Var2, botInlineMessage4.reply_markup, hashMap, z, i);
                } else {
                    TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                    TLRPC.BotInlineMessage botInlineMessage5 = botInlineResult.send_message;
                    int i4 = botInlineMessage5.period;
                    if (i4 == 0) {
                        i4 = 900;
                    }
                    tL_messageMediaGeoLive.period = i4;
                    tL_messageMediaGeoLive.geo = botInlineMessage5.geo;
                    tL_messageMediaGeoLive.heading = botInlineMessage5.heading;
                    tL_messageMediaGeoLive.proximity_notification_radius = botInlineMessage5.proximity_notification_radius;
                    d = p7a.d(tL_messageMediaGeoLive, j, r47Var, r47Var2, botInlineMessage5.reply_markup, hashMap, z, i);
                }
                d.K = c5aVar;
                d.J = ou1Var;
                d.Q = j2;
                d.R = j3;
                B(k5Var.a).q0(d);
                return;
            }
            if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaContact) {
                TLRPC.TL_user tL_user = new TLRPC.TL_user();
                TLRPC.BotInlineMessage botInlineMessage6 = botInlineResult.send_message;
                tL_user.phone = botInlineMessage6.phone_number;
                tL_user.first_name = botInlineMessage6.first_name;
                tL_user.last_name = botInlineMessage6.last_name;
                TLRPC.RestrictionReason restrictionReason = new TLRPC.RestrictionReason();
                restrictionReason.text = botInlineResult.send_message.vcard;
                restrictionReason.platform = "";
                restrictionReason.reason = "";
                tL_user.restriction_reason.add(restrictionReason);
                p7a g = p7a.g(tL_user, j, r47Var, r47Var2, botInlineResult.send_message.reply_markup, hashMap, z, i, 0);
                g.K = c5aVar;
                g.J = ou1Var;
                g.Q = j2;
                g.R = j3;
                B(k5Var.a).q0(g);
                return;
            }
            if (!(botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaInvoice)) {
                if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage) {
                    TLRPC.TL_webPagePending tL_webPagePending3 = new TLRPC.TL_webPagePending();
                    tL_webPagePending3.url = ((TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage).url;
                    TLRPC.BotInlineMessage botInlineMessage7 = botInlineResult.send_message;
                    p7a b2 = p7a.b(botInlineMessage7.message, j, r47Var, r47Var2, tL_webPagePending3, !botInlineMessage7.no_webpage, botInlineMessage7.entities, botInlineMessage7.reply_markup, hashMap, z, i, 0, null, false);
                    b2.K = c5aVar;
                    b2.J = ou1Var;
                    b2.Q = j2;
                    b2.R = j3;
                    b2.L = botInlineResult.send_message.invert_media;
                    B(k5Var.a).q0(b2);
                    return;
                }
                return;
            }
            if (wf3.B(j)) {
                return;
            }
            TLRPC.TL_botInlineMessageMediaInvoice tL_botInlineMessageMediaInvoice = (TLRPC.TL_botInlineMessageMediaInvoice) botInlineResult.send_message;
            TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice = new TLRPC.TL_messageMediaInvoice();
            tL_messageMediaInvoice.shipping_address_requested = tL_botInlineMessageMediaInvoice.shipping_address_requested;
            tL_messageMediaInvoice.test = tL_botInlineMessageMediaInvoice.test;
            tL_messageMediaInvoice.title = tL_botInlineMessageMediaInvoice.title;
            tL_messageMediaInvoice.description = tL_botInlineMessageMediaInvoice.description;
            TLRPC.WebDocument webDocument = tL_botInlineMessageMediaInvoice.photo;
            if (webDocument != null) {
                tL_messageMediaInvoice.webPhoto = webDocument;
                tL_messageMediaInvoice.flags |= 1;
            }
            tL_messageMediaInvoice.currency = tL_botInlineMessageMediaInvoice.currency;
            tL_messageMediaInvoice.total_amount = tL_botInlineMessageMediaInvoice.total_amount;
            tL_messageMediaInvoice.start_param = "";
            p7a c2 = p7a.c(null, null, null, null, null, null, null, null, null, tL_messageMediaInvoice, j, null, r47Var, r47Var2, null, true, null, null, botInlineResult.send_message.reply_markup, hashMap, z, i, 0, 0, null, null, false, false);
            c2.K = c5aVar;
            c2.J = ou1Var;
            c2.Q = j2;
            c2.R = j3;
            B(k5Var.a).q0(c2);
        }
    }

    public static void S(k5 k5Var, String str, String str2, Uri uri, String str3, String str4, long j, r47 r47Var, r47 r47Var2, TL_stories.StoryItem storyItem, ou1 ou1Var, boolean z, kj4 kj4Var, c5a c5aVar) {
        ArrayList arrayList;
        if ((str == null || str2 == null) && uri == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (uri != null) {
            arrayList = new ArrayList();
            arrayList.add(uri);
        } else {
            arrayList = null;
        }
        ArrayList arrayList4 = arrayList;
        if (str != null) {
            arrayList2.add(str);
            arrayList3.add(str2);
        }
        U(0, j, 0L, 0L, 0L, k5Var, ou1Var, kj4Var, r47Var, r47Var2, null, null, null, c5aVar, str3, str4, arrayList2, arrayList3, arrayList4, null, null, null, storyItem, z, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:284|285|(7:287|288|289|290|291|292|293)(1:340)|(3:303|304|(3:306|307|(5:309|296|297|298|299)))|295|296|297|298|299) */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x01f5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x01f6, code lost:
    
        r29 = r3;
        cc4.g(r0, true);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x056c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x05e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x022d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x023f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:339:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02e0 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int T(k5 k5Var, String str, String str2, Uri uri, String str3, final long j, final r47 r47Var, final r47 r47Var2, final TL_stories.StoryItem storyItem, final ou1 ou1Var, final ArrayList arrayList, final r47 r47Var3, long[] jArr, boolean z, CharSequence charSequence, final boolean z2, int i, Integer[] numArr, boolean z3, final c5a c5aVar, final long j2, final boolean z4, final long j3, final long j4, final b77 b77Var, final ki8 ki8Var, final int i2) {
        MimeTypeMap mimeTypeMap;
        int i3;
        int i4;
        long j5;
        int i5;
        final String str4;
        String str5;
        int i6;
        File file;
        String str6;
        String lowerCase;
        String str7;
        Object obj;
        Object obj2;
        File file2;
        h00 a;
        Bitmap bitmap;
        String str8;
        String str9;
        int i7;
        Bitmap bitmap2;
        String str10;
        boolean z5;
        String str11;
        int i8;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        boolean z6;
        String str12;
        Integer num;
        long j6;
        Object obj3;
        Object obj4;
        Bitmap bitmap3;
        boolean z7;
        int i9;
        String str13;
        String str14;
        MimeTypeMap mimeTypeMap2;
        Object obj5;
        String str15;
        TLRPC.TL_document tL_document;
        boolean z8;
        String str16;
        String str17;
        final HashMap hashMap;
        String str18;
        final String str19;
        int i10;
        Integer num2;
        final k5 k5Var2;
        final int i11;
        boolean z9;
        int i12;
        BitmapFactory.Options options;
        int i13;
        int i14;
        TLRPC.PhotoSize W;
        Bitmap G;
        String str20;
        int i15;
        String str21;
        TLRPC.TL_document tL_document2;
        String str22;
        String str23;
        String sb;
        Throwable th;
        MediaMetadataRetriever mediaMetadataRetriever;
        Bitmap bitmap4;
        boolean z10;
        MediaMetadataRetriever mediaMetadataRetriever2;
        String str24;
        Throwable th2;
        String str25;
        boolean z11;
        long j7;
        int i16;
        boolean z12;
        k5 k5Var3 = k5Var;
        String str26 = str;
        String str27 = str2;
        long j8 = ki8Var != null ? ki8Var.c : 0L;
        if (((str26 == null || str26.length() == 0) && uri == null) || ((uri != null && hl.G1(uri, 0)) || (str26 != null && hl.G1(Uri.fromFile(new File(str26)), 0)))) {
            return 1;
        }
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        if (uri != null && str26 == null) {
            try {
                AssetFileDescriptor openAssetFileDescriptor = a.b.getContentResolver().openAssetFileDescriptor(uri, "r", null);
                if (openAssetFileDescriptor != null) {
                    try {
                        j7 = openAssetFileDescriptor.getLength();
                    } catch (Exception e) {
                        e = e;
                        mimeTypeMap = singleton;
                        i3 = 2;
                        z11 = 1;
                        j7 = 0;
                        j5 = 0;
                        cc4.g(e, z11);
                        i16 = z11;
                        if (xb4.m(k5Var3.a, j7)) {
                        }
                        return i3;
                    }
                } else {
                    j7 = 0;
                }
                try {
                } catch (Exception e2) {
                    e = e2;
                    mimeTypeMap = singleton;
                    i3 = 2;
                }
                try {
                    mimeTypeMap = singleton;
                    i3 = 2;
                    z11 = 1;
                    i16 = 1;
                    j5 = 0;
                    try {
                        Cursor query = a.b.getContentResolver().query(uri, new String[]{"_size"}, null, null, null);
                        int columnIndex = query.getColumnIndex("_size");
                        query.moveToFirst();
                        j7 = query.getLong(columnIndex);
                        query.close();
                    } catch (Exception e3) {
                        e = e3;
                        cc4.g(e, z11);
                        i16 = z11;
                        if (xb4.m(k5Var3.a, j7)) {
                        }
                        return i3;
                    }
                } catch (Exception e4) {
                    e = e4;
                    i3 = 2;
                    mimeTypeMap = singleton;
                    z11 = 1;
                    j5 = 0;
                    cc4.g(e, z11);
                    i16 = z11;
                    if (xb4.m(k5Var3.a, j7)) {
                    }
                    return i3;
                }
            } catch (Exception e5) {
                e = e5;
                mimeTypeMap = singleton;
                i3 = 2;
                z11 = 1;
                j5 = 0;
                j7 = 0;
            }
            if (xb4.m(k5Var3.a, j7)) {
                str5 = str3 != null ? mimeTypeMap.getExtensionFromMimeType(str3) : null;
                if (str5 == null) {
                    str5 = "txt";
                    z12 = false;
                } else {
                    z12 = i16 == true ? 1 : 0;
                }
                str26 = MediaController.q(-1L, uri, str5);
                i4 = i16;
                i5 = i16;
                if (str26 != null) {
                    if (z12) {
                        str4 = str26;
                        i6 = i16;
                        file = new File(str4);
                        i5 = i6;
                        if (file.exists()) {
                            i5 = i6;
                            if (file.length() != j5) {
                                if (xb4.m(k5Var3.a, file.length())) {
                                    boolean B = wf3.B(j);
                                    String name = file.getName();
                                    if (str5 == null) {
                                        int lastIndexOf = str4.lastIndexOf(46);
                                        if (lastIndexOf == -1) {
                                            str6 = "";
                                            lowerCase = str6.toLowerCase();
                                            if (lowerCase.equals("mp3") && !lowerCase.equals("m4a")) {
                                                if (lowerCase.equals("opus") || lowerCase.equals("ogg") || lowerCase.equals("flac")) {
                                                    str7 = name;
                                                    try {
                                                        MediaMetadataRetriever mediaMetadataRetriever3 = new MediaMetadataRetriever();
                                                        try {
                                                            try {
                                                                mediaMetadataRetriever3.setDataSource(file.getAbsolutePath());
                                                                if (mediaMetadataRetriever3.extractMetadata(9) != null) {
                                                                    obj2 = "opus";
                                                                    file2 = file;
                                                                    try {
                                                                        try {
                                                                            i7 = (int) Math.ceil(Long.parseLong(r0) / 1000.0f);
                                                                            try {
                                                                                str10 = mediaMetadataRetriever3.extractMetadata(7);
                                                                                obj = "flac";
                                                                                try {
                                                                                    str25 = mediaMetadataRetriever3.extractMetadata(2);
                                                                                } catch (Exception e6) {
                                                                                    e = e6;
                                                                                    mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                                                    bitmap4 = null;
                                                                                    z10 = true;
                                                                                    str24 = null;
                                                                                    cc4.g(e, z10);
                                                                                    if (mediaMetadataRetriever2 != null) {
                                                                                    }
                                                                                    bitmap2 = bitmap4;
                                                                                    str8 = str24;
                                                                                    z5 = false;
                                                                                    if (i7 != 0) {
                                                                                    }
                                                                                    if (str27 != null) {
                                                                                    }
                                                                                    z6 = false;
                                                                                    if (ki8Var == null) {
                                                                                    }
                                                                                    if (z6) {
                                                                                    }
                                                                                    str12 = str27;
                                                                                    num = 0;
                                                                                    j6 = j8;
                                                                                    obj3 = obj2;
                                                                                    obj4 = obj;
                                                                                    bitmap3 = bitmap2;
                                                                                    z7 = B;
                                                                                    i9 = -1;
                                                                                    str13 = str7;
                                                                                    str14 = "";
                                                                                    mimeTypeMap2 = mimeTypeMap;
                                                                                    obj5 = "mp3";
                                                                                    str15 = null;
                                                                                    tL_document = null;
                                                                                    if (tL_document != null) {
                                                                                    }
                                                                                    str17 = str14;
                                                                                    if (charSequence != null) {
                                                                                    }
                                                                                    hashMap = new HashMap();
                                                                                    str18 = str12;
                                                                                    if (str18 != null) {
                                                                                    }
                                                                                    if (z3) {
                                                                                    }
                                                                                    if (str16 != null) {
                                                                                    }
                                                                                    int i17 = 0;
                                                                                    if (numArr != null) {
                                                                                    }
                                                                                    if (z8) {
                                                                                    }
                                                                                    k5Var2 = k5Var;
                                                                                    i11 = i;
                                                                                    if (j6 != 0) {
                                                                                    }
                                                                                    final TLRPC.TL_document tL_document3 = tL_document;
                                                                                    int i18 = i17;
                                                                                    hl.c3(new Runnable() { // from class: f6a
                                                                                        @Override // java.lang.Runnable
                                                                                        public final void run() {
                                                                                            r47 r47Var4 = r47.this;
                                                                                            k5 k5Var4 = k5Var2;
                                                                                            TLRPC.TL_document tL_document4 = tL_document3;
                                                                                            String str28 = str4;
                                                                                            HashMap hashMap2 = hashMap;
                                                                                            String str29 = str19;
                                                                                            if (r47Var4 != null) {
                                                                                                r7a.B(k5Var4.a).s(r47Var4, null, null, null, tL_document4, str28, null, hashMap2, false, false, str29);
                                                                                                return;
                                                                                            }
                                                                                            p7a f = p7a.f(tL_document4, null, str28, j, r47Var, r47Var2, r11, arrayList, null, hashMap2, z2, i11, 0, 0, str29, null, false);
                                                                                            f.H = storyItem;
                                                                                            f.J = ou1Var;
                                                                                            f.K = c5aVar;
                                                                                            f.O = j2;
                                                                                            f.L = z4;
                                                                                            f.Q = j3;
                                                                                            f.R = j4;
                                                                                            f.T = b77Var;
                                                                                            f.k = i2;
                                                                                            f.j = ki8Var;
                                                                                            r7a.B(k5Var4.a).q0(f);
                                                                                        }
                                                                                    });
                                                                                    return i18;
                                                                                }
                                                                            } catch (Exception e7) {
                                                                                e = e7;
                                                                                obj = "flac";
                                                                                mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                                                bitmap4 = null;
                                                                                z10 = true;
                                                                                str10 = null;
                                                                                str24 = null;
                                                                                cc4.g(e, z10);
                                                                                if (mediaMetadataRetriever2 != null) {
                                                                                }
                                                                                bitmap2 = bitmap4;
                                                                                str8 = str24;
                                                                                z5 = false;
                                                                                if (i7 != 0) {
                                                                                }
                                                                                if (str27 != null) {
                                                                                }
                                                                                z6 = false;
                                                                                if (ki8Var == null) {
                                                                                }
                                                                                if (z6) {
                                                                                }
                                                                                str12 = str27;
                                                                                num = 0;
                                                                                j6 = j8;
                                                                                obj3 = obj2;
                                                                                obj4 = obj;
                                                                                bitmap3 = bitmap2;
                                                                                z7 = B;
                                                                                i9 = -1;
                                                                                str13 = str7;
                                                                                str14 = "";
                                                                                mimeTypeMap2 = mimeTypeMap;
                                                                                obj5 = "mp3";
                                                                                str15 = null;
                                                                                tL_document = null;
                                                                                if (tL_document != null) {
                                                                                }
                                                                                str17 = str14;
                                                                                if (charSequence != null) {
                                                                                }
                                                                                hashMap = new HashMap();
                                                                                str18 = str12;
                                                                                if (str18 != null) {
                                                                                }
                                                                                if (z3) {
                                                                                }
                                                                                if (str16 != null) {
                                                                                }
                                                                                int i172 = 0;
                                                                                if (numArr != null) {
                                                                                }
                                                                                if (z8) {
                                                                                }
                                                                                k5Var2 = k5Var;
                                                                                i11 = i;
                                                                                if (j6 != 0) {
                                                                                }
                                                                                final TLRPC.TL_document tL_document32 = tL_document;
                                                                                int i182 = i172;
                                                                                hl.c3(new Runnable() { // from class: f6a
                                                                                    @Override // java.lang.Runnable
                                                                                    public final void run() {
                                                                                        r47 r47Var4 = r47.this;
                                                                                        k5 k5Var4 = k5Var2;
                                                                                        TLRPC.TL_document tL_document4 = tL_document32;
                                                                                        String str28 = str4;
                                                                                        HashMap hashMap2 = hashMap;
                                                                                        String str29 = str19;
                                                                                        if (r47Var4 != null) {
                                                                                            r7a.B(k5Var4.a).s(r47Var4, null, null, null, tL_document4, str28, null, hashMap2, false, false, str29);
                                                                                            return;
                                                                                        }
                                                                                        p7a f = p7a.f(tL_document4, null, str28, j, r47Var, r47Var2, r11, arrayList, null, hashMap2, z2, i11, 0, 0, str29, null, false);
                                                                                        f.H = storyItem;
                                                                                        f.J = ou1Var;
                                                                                        f.K = c5aVar;
                                                                                        f.O = j2;
                                                                                        f.L = z4;
                                                                                        f.Q = j3;
                                                                                        f.R = j4;
                                                                                        f.T = b77Var;
                                                                                        f.k = i2;
                                                                                        f.j = ki8Var;
                                                                                        r7a.B(k5Var4.a).q0(f);
                                                                                    }
                                                                                });
                                                                                return i182;
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            mediaMetadataRetriever = mediaMetadataRetriever3;
                                                                            if (mediaMetadataRetriever == null) {
                                                                                throw th;
                                                                            }
                                                                            try {
                                                                                mediaMetadataRetriever.release();
                                                                                throw th;
                                                                            } catch (Exception e8) {
                                                                                cc4.g(e8, true);
                                                                                throw th;
                                                                            }
                                                                        }
                                                                    } catch (Exception e9) {
                                                                        e = e9;
                                                                        obj = "flac";
                                                                        mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                                        bitmap4 = null;
                                                                        z10 = true;
                                                                        i7 = 0;
                                                                        str10 = null;
                                                                        str24 = null;
                                                                        cc4.g(e, z10);
                                                                        if (mediaMetadataRetriever2 != null) {
                                                                        }
                                                                        bitmap2 = bitmap4;
                                                                        str8 = str24;
                                                                        z5 = false;
                                                                        if (i7 != 0) {
                                                                        }
                                                                        if (str27 != null) {
                                                                        }
                                                                        z6 = false;
                                                                        if (ki8Var == null) {
                                                                        }
                                                                        if (z6) {
                                                                        }
                                                                        str12 = str27;
                                                                        num = 0;
                                                                        j6 = j8;
                                                                        obj3 = obj2;
                                                                        obj4 = obj;
                                                                        bitmap3 = bitmap2;
                                                                        z7 = B;
                                                                        i9 = -1;
                                                                        str13 = str7;
                                                                        str14 = "";
                                                                        mimeTypeMap2 = mimeTypeMap;
                                                                        obj5 = "mp3";
                                                                        str15 = null;
                                                                        tL_document = null;
                                                                        if (tL_document != null) {
                                                                        }
                                                                        str17 = str14;
                                                                        if (charSequence != null) {
                                                                        }
                                                                        hashMap = new HashMap();
                                                                        str18 = str12;
                                                                        if (str18 != null) {
                                                                        }
                                                                        if (z3) {
                                                                        }
                                                                        if (str16 != null) {
                                                                        }
                                                                        int i1722 = 0;
                                                                        if (numArr != null) {
                                                                        }
                                                                        if (z8) {
                                                                        }
                                                                        k5Var2 = k5Var;
                                                                        i11 = i;
                                                                        if (j6 != 0) {
                                                                        }
                                                                        final TLRPC.TL_document tL_document322 = tL_document;
                                                                        int i1822 = i1722;
                                                                        hl.c3(new Runnable() { // from class: f6a
                                                                            @Override // java.lang.Runnable
                                                                            public final void run() {
                                                                                r47 r47Var4 = r47.this;
                                                                                k5 k5Var4 = k5Var2;
                                                                                TLRPC.TL_document tL_document4 = tL_document322;
                                                                                String str28 = str4;
                                                                                HashMap hashMap2 = hashMap;
                                                                                String str29 = str19;
                                                                                if (r47Var4 != null) {
                                                                                    r7a.B(k5Var4.a).s(r47Var4, null, null, null, tL_document4, str28, null, hashMap2, false, false, str29);
                                                                                    return;
                                                                                }
                                                                                p7a f = p7a.f(tL_document4, null, str28, j, r47Var, r47Var2, r11, arrayList, null, hashMap2, z2, i11, 0, 0, str29, null, false);
                                                                                f.H = storyItem;
                                                                                f.J = ou1Var;
                                                                                f.K = c5aVar;
                                                                                f.O = j2;
                                                                                f.L = z4;
                                                                                f.Q = j3;
                                                                                f.R = j4;
                                                                                f.T = b77Var;
                                                                                f.k = i2;
                                                                                f.j = ki8Var;
                                                                                r7a.B(k5Var4.a).q0(f);
                                                                            }
                                                                        });
                                                                        return i1822;
                                                                    }
                                                                } else {
                                                                    obj = "flac";
                                                                    obj2 = "opus";
                                                                    file2 = file;
                                                                    str25 = null;
                                                                    i7 = 0;
                                                                    str10 = null;
                                                                }
                                                                try {
                                                                    byte[] embeddedPicture = mediaMetadataRetriever3.getEmbeddedPicture();
                                                                    if (embeddedPicture != null) {
                                                                        mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                                        try {
                                                                            try {
                                                                                str24 = str25;
                                                                            } catch (Exception e10) {
                                                                                e = e10;
                                                                                str24 = str25;
                                                                                bitmap4 = null;
                                                                                z10 = true;
                                                                                cc4.g(e, z10);
                                                                                if (mediaMetadataRetriever2 != null) {
                                                                                    try {
                                                                                        mediaMetadataRetriever2.release();
                                                                                    } catch (Exception e11) {
                                                                                        cc4.g(e11, z10);
                                                                                    }
                                                                                }
                                                                                bitmap2 = bitmap4;
                                                                                str8 = str24;
                                                                                z5 = false;
                                                                                if (i7 != 0) {
                                                                                }
                                                                                if (str27 != null) {
                                                                                }
                                                                                z6 = false;
                                                                                if (ki8Var == null) {
                                                                                }
                                                                                if (z6) {
                                                                                }
                                                                                str12 = str27;
                                                                                num = 0;
                                                                                j6 = j8;
                                                                                obj3 = obj2;
                                                                                obj4 = obj;
                                                                                bitmap3 = bitmap2;
                                                                                z7 = B;
                                                                                i9 = -1;
                                                                                str13 = str7;
                                                                                str14 = "";
                                                                                mimeTypeMap2 = mimeTypeMap;
                                                                                obj5 = "mp3";
                                                                                str15 = null;
                                                                                tL_document = null;
                                                                                if (tL_document != null) {
                                                                                }
                                                                                str17 = str14;
                                                                                if (charSequence != null) {
                                                                                }
                                                                                hashMap = new HashMap();
                                                                                str18 = str12;
                                                                                if (str18 != null) {
                                                                                }
                                                                                if (z3) {
                                                                                }
                                                                                if (str16 != null) {
                                                                                }
                                                                                int i17222 = 0;
                                                                                if (numArr != null) {
                                                                                }
                                                                                if (z8) {
                                                                                }
                                                                                k5Var2 = k5Var;
                                                                                i11 = i;
                                                                                if (j6 != 0) {
                                                                                }
                                                                                final TLRPC.TL_document tL_document3222 = tL_document;
                                                                                int i18222 = i17222;
                                                                                hl.c3(new Runnable() { // from class: f6a
                                                                                    @Override // java.lang.Runnable
                                                                                    public final void run() {
                                                                                        r47 r47Var4 = r47.this;
                                                                                        k5 k5Var4 = k5Var2;
                                                                                        TLRPC.TL_document tL_document4 = tL_document3222;
                                                                                        String str28 = str4;
                                                                                        HashMap hashMap2 = hashMap;
                                                                                        String str29 = str19;
                                                                                        if (r47Var4 != null) {
                                                                                            r7a.B(k5Var4.a).s(r47Var4, null, null, null, tL_document4, str28, null, hashMap2, false, false, str29);
                                                                                            return;
                                                                                        }
                                                                                        p7a f = p7a.f(tL_document4, null, str28, j, r47Var, r47Var2, r11, arrayList, null, hashMap2, z2, i11, 0, 0, str29, null, false);
                                                                                        f.H = storyItem;
                                                                                        f.J = ou1Var;
                                                                                        f.K = c5aVar;
                                                                                        f.O = j2;
                                                                                        f.L = z4;
                                                                                        f.Q = j3;
                                                                                        f.R = j4;
                                                                                        f.T = b77Var;
                                                                                        f.k = i2;
                                                                                        f.j = ki8Var;
                                                                                        r7a.B(k5Var4.a).q0(f);
                                                                                    }
                                                                                });
                                                                                return i18222;
                                                                            }
                                                                            try {
                                                                                bitmap4 = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
                                                                            } catch (Exception e12) {
                                                                                e = e12;
                                                                                bitmap4 = null;
                                                                                z10 = true;
                                                                                cc4.g(e, z10);
                                                                                if (mediaMetadataRetriever2 != null) {
                                                                                }
                                                                                bitmap2 = bitmap4;
                                                                                str8 = str24;
                                                                                z5 = false;
                                                                                if (i7 != 0) {
                                                                                }
                                                                                if (str27 != null) {
                                                                                }
                                                                                z6 = false;
                                                                                if (ki8Var == null) {
                                                                                }
                                                                                if (z6) {
                                                                                }
                                                                                str12 = str27;
                                                                                num = 0;
                                                                                j6 = j8;
                                                                                obj3 = obj2;
                                                                                obj4 = obj;
                                                                                bitmap3 = bitmap2;
                                                                                z7 = B;
                                                                                i9 = -1;
                                                                                str13 = str7;
                                                                                str14 = "";
                                                                                mimeTypeMap2 = mimeTypeMap;
                                                                                obj5 = "mp3";
                                                                                str15 = null;
                                                                                tL_document = null;
                                                                                if (tL_document != null) {
                                                                                }
                                                                                str17 = str14;
                                                                                if (charSequence != null) {
                                                                                }
                                                                                hashMap = new HashMap();
                                                                                str18 = str12;
                                                                                if (str18 != null) {
                                                                                }
                                                                                if (z3) {
                                                                                }
                                                                                if (str16 != null) {
                                                                                }
                                                                                int i172222 = 0;
                                                                                if (numArr != null) {
                                                                                }
                                                                                if (z8) {
                                                                                }
                                                                                k5Var2 = k5Var;
                                                                                i11 = i;
                                                                                if (j6 != 0) {
                                                                                }
                                                                                final TLRPC.TL_document tL_document32222 = tL_document;
                                                                                int i182222 = i172222;
                                                                                hl.c3(new Runnable() { // from class: f6a
                                                                                    @Override // java.lang.Runnable
                                                                                    public final void run() {
                                                                                        r47 r47Var4 = r47.this;
                                                                                        k5 k5Var4 = k5Var2;
                                                                                        TLRPC.TL_document tL_document4 = tL_document32222;
                                                                                        String str28 = str4;
                                                                                        HashMap hashMap2 = hashMap;
                                                                                        String str29 = str19;
                                                                                        if (r47Var4 != null) {
                                                                                            r7a.B(k5Var4.a).s(r47Var4, null, null, null, tL_document4, str28, null, hashMap2, false, false, str29);
                                                                                            return;
                                                                                        }
                                                                                        p7a f = p7a.f(tL_document4, null, str28, j, r47Var, r47Var2, r11, arrayList, null, hashMap2, z2, i11, 0, 0, str29, null, false);
                                                                                        f.H = storyItem;
                                                                                        f.J = ou1Var;
                                                                                        f.K = c5aVar;
                                                                                        f.O = j2;
                                                                                        f.L = z4;
                                                                                        f.Q = j3;
                                                                                        f.R = j4;
                                                                                        f.T = b77Var;
                                                                                        f.k = i2;
                                                                                        f.j = ki8Var;
                                                                                        r7a.B(k5Var4.a).q0(f);
                                                                                    }
                                                                                });
                                                                                return i182222;
                                                                            }
                                                                        } catch (Throwable th4) {
                                                                            th2 = th4;
                                                                            th = th2;
                                                                            mediaMetadataRetriever = mediaMetadataRetriever2;
                                                                            if (mediaMetadataRetriever == null) {
                                                                            }
                                                                        }
                                                                    } else {
                                                                        mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                                        str24 = str25;
                                                                        bitmap4 = null;
                                                                    }
                                                                    if (r47Var3 == null) {
                                                                        try {
                                                                            if (lowerCase.equals("ogg")) {
                                                                                if (MediaController.isOpusFile(file2.getAbsolutePath()) == 1) {
                                                                                    z5 = true;
                                                                                    mediaMetadataRetriever2.release();
                                                                                    bitmap2 = bitmap4;
                                                                                    str8 = str24;
                                                                                }
                                                                            }
                                                                        } catch (Exception e13) {
                                                                            e = e13;
                                                                            z10 = true;
                                                                            cc4.g(e, z10);
                                                                            if (mediaMetadataRetriever2 != null) {
                                                                            }
                                                                            bitmap2 = bitmap4;
                                                                            str8 = str24;
                                                                            z5 = false;
                                                                            if (i7 != 0) {
                                                                            }
                                                                            if (str27 != null) {
                                                                            }
                                                                            z6 = false;
                                                                            if (ki8Var == null) {
                                                                            }
                                                                            if (z6) {
                                                                            }
                                                                            str12 = str27;
                                                                            num = 0;
                                                                            j6 = j8;
                                                                            obj3 = obj2;
                                                                            obj4 = obj;
                                                                            bitmap3 = bitmap2;
                                                                            z7 = B;
                                                                            i9 = -1;
                                                                            str13 = str7;
                                                                            str14 = "";
                                                                            mimeTypeMap2 = mimeTypeMap;
                                                                            obj5 = "mp3";
                                                                            str15 = null;
                                                                            tL_document = null;
                                                                            if (tL_document != null) {
                                                                            }
                                                                            str17 = str14;
                                                                            if (charSequence != null) {
                                                                            }
                                                                            hashMap = new HashMap();
                                                                            str18 = str12;
                                                                            if (str18 != null) {
                                                                            }
                                                                            if (z3) {
                                                                            }
                                                                            if (str16 != null) {
                                                                            }
                                                                            int i1722222 = 0;
                                                                            if (numArr != null) {
                                                                            }
                                                                            if (z8) {
                                                                            }
                                                                            k5Var2 = k5Var;
                                                                            i11 = i;
                                                                            if (j6 != 0) {
                                                                            }
                                                                            final TLRPC.TL_document tL_document322222 = tL_document;
                                                                            int i1822222 = i1722222;
                                                                            hl.c3(new Runnable() { // from class: f6a
                                                                                @Override // java.lang.Runnable
                                                                                public final void run() {
                                                                                    r47 r47Var4 = r47.this;
                                                                                    k5 k5Var4 = k5Var2;
                                                                                    TLRPC.TL_document tL_document4 = tL_document322222;
                                                                                    String str28 = str4;
                                                                                    HashMap hashMap2 = hashMap;
                                                                                    String str29 = str19;
                                                                                    if (r47Var4 != null) {
                                                                                        r7a.B(k5Var4.a).s(r47Var4, null, null, null, tL_document4, str28, null, hashMap2, false, false, str29);
                                                                                        return;
                                                                                    }
                                                                                    p7a f = p7a.f(tL_document4, null, str28, j, r47Var, r47Var2, r11, arrayList, null, hashMap2, z2, i11, 0, 0, str29, null, false);
                                                                                    f.H = storyItem;
                                                                                    f.J = ou1Var;
                                                                                    f.K = c5aVar;
                                                                                    f.O = j2;
                                                                                    f.L = z4;
                                                                                    f.Q = j3;
                                                                                    f.R = j4;
                                                                                    f.T = b77Var;
                                                                                    f.k = i2;
                                                                                    f.j = ki8Var;
                                                                                    r7a.B(k5Var4.a).q0(f);
                                                                                }
                                                                            });
                                                                            return i1822222;
                                                                        }
                                                                    }
                                                                    z5 = false;
                                                                    mediaMetadataRetriever2.release();
                                                                    bitmap2 = bitmap4;
                                                                    str8 = str24;
                                                                } catch (Exception e14) {
                                                                    e = e14;
                                                                    mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                                }
                                                            } catch (Throwable th5) {
                                                                th2 = th5;
                                                                mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                                th = th2;
                                                                mediaMetadataRetriever = mediaMetadataRetriever2;
                                                                if (mediaMetadataRetriever == null) {
                                                                }
                                                            }
                                                        } catch (Exception e15) {
                                                            e = e15;
                                                            mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                            obj = "flac";
                                                            obj2 = "opus";
                                                            file2 = file;
                                                        }
                                                    } catch (Exception e16) {
                                                        e = e16;
                                                        obj = "flac";
                                                        obj2 = "opus";
                                                        file2 = file;
                                                        bitmap4 = null;
                                                        z10 = true;
                                                        i7 = 0;
                                                        str10 = null;
                                                        mediaMetadataRetriever2 = null;
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        mediaMetadataRetriever = null;
                                                    }
                                                } else {
                                                    str7 = name;
                                                    obj = "flac";
                                                    obj2 = "opus";
                                                    file2 = file;
                                                    str8 = null;
                                                    z5 = false;
                                                    i7 = 0;
                                                    str10 = null;
                                                    bitmap2 = null;
                                                }
                                                if (i7 != 0) {
                                                    i8 = 3;
                                                    TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2 = new TLRPC.TL_documentAttributeAudio();
                                                    str11 = lowerCase;
                                                    tL_documentAttributeAudio2.duration = i7;
                                                    tL_documentAttributeAudio2.title = str10;
                                                    tL_documentAttributeAudio2.performer = str8;
                                                    if (str10 == null) {
                                                        tL_documentAttributeAudio2.title = "";
                                                    }
                                                    int i19 = tL_documentAttributeAudio2.flags;
                                                    tL_documentAttributeAudio2.flags = i19 | 1;
                                                    if (str8 == null) {
                                                        tL_documentAttributeAudio2.performer = "";
                                                    }
                                                    tL_documentAttributeAudio2.flags = i19 | 3;
                                                    if (z5) {
                                                        tL_documentAttributeAudio2.voice = true;
                                                    }
                                                    tL_documentAttributeAudio = tL_documentAttributeAudio2;
                                                } else {
                                                    str11 = lowerCase;
                                                    i8 = 3;
                                                    tL_documentAttributeAudio = null;
                                                }
                                                if (str27 != null) {
                                                    if (str27.endsWith("attheme")) {
                                                        z6 = true;
                                                        boolean z13 = ki8Var == null;
                                                        if (!z6 || B || z13) {
                                                            str12 = str27;
                                                            num = 0;
                                                            j6 = j8;
                                                            obj3 = obj2;
                                                            obj4 = obj;
                                                            bitmap3 = bitmap2;
                                                            z7 = B;
                                                            i9 = -1;
                                                            str13 = str7;
                                                            str14 = "";
                                                            mimeTypeMap2 = mimeTypeMap;
                                                            obj5 = "mp3";
                                                            str15 = null;
                                                            tL_document = null;
                                                        } else {
                                                            Object[] e0 = jf7.Y(k5Var3.a).e0(!B ? 1 : 4, str27);
                                                            if (e0 != null) {
                                                                Object obj6 = e0[0];
                                                                if (obj6 instanceof TLRPC.TL_document) {
                                                                    tL_document2 = (TLRPC.TL_document) obj6;
                                                                    str21 = (String) e0[1];
                                                                    if (tL_document2 == null || str4.equals(str27) || B) {
                                                                        str22 = str21;
                                                                    } else {
                                                                        jf7 Y = jf7.Y(k5Var3.a);
                                                                        StringBuilder sb2 = new StringBuilder(str4);
                                                                        str22 = str21;
                                                                        sb2.append(file2.length());
                                                                        Object[] e02 = Y.e0(!B ? 1 : 4, sb2.toString());
                                                                        if (e02 != null) {
                                                                            Object obj7 = e02[0];
                                                                            if (obj7 instanceof TLRPC.TL_document) {
                                                                                tL_document2 = (TLRPC.TL_document) obj7;
                                                                                str23 = (String) e02[1];
                                                                                TLRPC.TL_document tL_document4 = tL_document2;
                                                                                str12 = str27;
                                                                                num = 0;
                                                                                j6 = j8;
                                                                                obj3 = obj2;
                                                                                obj4 = obj;
                                                                                bitmap3 = bitmap2;
                                                                                z7 = B;
                                                                                i9 = -1;
                                                                                str13 = str7;
                                                                                str14 = "";
                                                                                mimeTypeMap2 = mimeTypeMap;
                                                                                k5Var3 = k5Var;
                                                                                obj5 = "mp3";
                                                                                v(k5Var3, z7, tL_document4, str4, null, 0L, false);
                                                                                str15 = str23;
                                                                                tL_document = tL_document4;
                                                                            }
                                                                        }
                                                                    }
                                                                    str23 = str22;
                                                                    TLRPC.TL_document tL_document42 = tL_document2;
                                                                    str12 = str27;
                                                                    num = 0;
                                                                    j6 = j8;
                                                                    obj3 = obj2;
                                                                    obj4 = obj;
                                                                    bitmap3 = bitmap2;
                                                                    z7 = B;
                                                                    i9 = -1;
                                                                    str13 = str7;
                                                                    str14 = "";
                                                                    mimeTypeMap2 = mimeTypeMap;
                                                                    k5Var3 = k5Var;
                                                                    obj5 = "mp3";
                                                                    v(k5Var3, z7, tL_document42, str4, null, 0L, false);
                                                                    str15 = str23;
                                                                    tL_document = tL_document42;
                                                                }
                                                            }
                                                            str21 = null;
                                                            tL_document2 = null;
                                                            if (tL_document2 == null) {
                                                            }
                                                            str22 = str21;
                                                            str23 = str22;
                                                            TLRPC.TL_document tL_document422 = tL_document2;
                                                            str12 = str27;
                                                            num = 0;
                                                            j6 = j8;
                                                            obj3 = obj2;
                                                            obj4 = obj;
                                                            bitmap3 = bitmap2;
                                                            z7 = B;
                                                            i9 = -1;
                                                            str13 = str7;
                                                            str14 = "";
                                                            mimeTypeMap2 = mimeTypeMap;
                                                            k5Var3 = k5Var;
                                                            obj5 = "mp3";
                                                            v(k5Var3, z7, tL_document422, str4, null, 0L, false);
                                                            str15 = str23;
                                                            tL_document = tL_document422;
                                                        }
                                                        if (tL_document != null) {
                                                            tL_document = new TLRPC.TL_document();
                                                            str16 = str15;
                                                            tL_document.id = j5;
                                                            tL_document.date = ConnectionsManager.getInstance(k5Var3.a).getCurrentTime();
                                                            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                                            tL_documentAttributeFilename.file_name = str13;
                                                            tL_document.file_reference = new byte[0];
                                                            tL_document.attributes.add(tL_documentAttributeFilename);
                                                            boolean z14 = z7;
                                                            tL_document.size = file2.length();
                                                            tL_document.dc_id = 0;
                                                            if (tL_documentAttributeAudio != null) {
                                                                tL_document.attributes.add(tL_documentAttributeAudio);
                                                            }
                                                            String str28 = "application/octet-stream";
                                                            if (str6.length() != 0) {
                                                                switch (str11.hashCode()) {
                                                                    case 106458:
                                                                        str20 = str11;
                                                                        if (str20.equals("m4a")) {
                                                                            i15 = 0;
                                                                            break;
                                                                        }
                                                                        i15 = i9;
                                                                        break;
                                                                    case 108272:
                                                                        str20 = str11;
                                                                        if (str20.equals(obj5)) {
                                                                            i15 = 1;
                                                                            break;
                                                                        }
                                                                        i15 = i9;
                                                                        break;
                                                                    case 109967:
                                                                        str20 = str11;
                                                                        if (str20.equals("ogg")) {
                                                                            i15 = 2;
                                                                            break;
                                                                        }
                                                                        i15 = i9;
                                                                        break;
                                                                    case 3145576:
                                                                        str20 = str11;
                                                                        if (str20.equals(obj4)) {
                                                                            i15 = i8;
                                                                            break;
                                                                        }
                                                                        i15 = i9;
                                                                        break;
                                                                    case 3418175:
                                                                        str20 = str11;
                                                                        if (str20.equals(obj3)) {
                                                                            i15 = 4;
                                                                            break;
                                                                        }
                                                                        i15 = i9;
                                                                        break;
                                                                    case 3645340:
                                                                        str20 = str11;
                                                                        if (str20.equals("webp")) {
                                                                            i15 = 5;
                                                                            break;
                                                                        }
                                                                        i15 = i9;
                                                                        break;
                                                                    default:
                                                                        str20 = str11;
                                                                        i15 = i9;
                                                                        break;
                                                                }
                                                                switch (i15) {
                                                                    case 0:
                                                                        str28 = "audio/m4a";
                                                                        tL_document.mime_type = "audio/m4a";
                                                                        break;
                                                                    case 1:
                                                                        str28 = "audio/mpeg";
                                                                        tL_document.mime_type = "audio/mpeg";
                                                                        break;
                                                                    case 2:
                                                                        str28 = "audio/ogg";
                                                                        tL_document.mime_type = "audio/ogg";
                                                                        break;
                                                                    case 3:
                                                                        str28 = "audio/flac";
                                                                        tL_document.mime_type = "audio/flac";
                                                                        break;
                                                                    case 4:
                                                                        str28 = "audio/opus";
                                                                        tL_document.mime_type = "audio/opus";
                                                                        break;
                                                                    case 5:
                                                                        tL_document.mime_type = "image/webp";
                                                                        str28 = "image/webp";
                                                                        break;
                                                                    default:
                                                                        String mimeTypeFromExtension = mimeTypeMap2.getMimeTypeFromExtension(str20);
                                                                        if (mimeTypeFromExtension == null) {
                                                                            tL_document.mime_type = "application/octet-stream";
                                                                            break;
                                                                        } else {
                                                                            tL_document.mime_type = mimeTypeFromExtension;
                                                                            str28 = mimeTypeFromExtension;
                                                                            break;
                                                                        }
                                                                }
                                                            } else {
                                                                tL_document.mime_type = "application/octet-stream";
                                                            }
                                                            if (!z3 && str28.equals("image/gif") && (r47Var3 == null || r47Var3.d1() == 0)) {
                                                                try {
                                                                    G = in5.G(file2.getAbsolutePath(), null, 90.0f, 90.0f, true);
                                                                } catch (Exception e17) {
                                                                    e = e17;
                                                                    z9 = z14;
                                                                }
                                                                if (G != null) {
                                                                    tL_documentAttributeFilename.file_name = "animation.gif";
                                                                    tL_document.attributes.add(new TLRPC.TL_documentAttributeAnimated());
                                                                    z9 = z14;
                                                                    try {
                                                                        TLRPC.PhotoSize U = in5.U(G, 90.0f, 90.0f, 55, z9);
                                                                        if (U != null) {
                                                                            tL_document.thumbs.add(U);
                                                                            tL_document.flags |= 1;
                                                                        }
                                                                        G.recycle();
                                                                        i12 = 1;
                                                                    } catch (Exception e18) {
                                                                        e = e18;
                                                                        i12 = 1;
                                                                        cc4.g(e, true);
                                                                        if (bitmap3 != null) {
                                                                        }
                                                                        if (tL_document.mime_type.equals("image/webp")) {
                                                                        }
                                                                        z8 = z9;
                                                                        str17 = str14;
                                                                        if (charSequence != null) {
                                                                        }
                                                                        hashMap = new HashMap();
                                                                        str18 = str12;
                                                                        if (str18 != null) {
                                                                        }
                                                                        if (z3) {
                                                                        }
                                                                        if (str16 != null) {
                                                                        }
                                                                        int i17222222 = 0;
                                                                        if (numArr != null) {
                                                                        }
                                                                        if (z8) {
                                                                        }
                                                                        k5Var2 = k5Var;
                                                                        i11 = i;
                                                                        if (j6 != 0) {
                                                                        }
                                                                        final TLRPC.TL_document tL_document3222222 = tL_document;
                                                                        int i18222222 = i17222222;
                                                                        hl.c3(new Runnable() { // from class: f6a
                                                                            @Override // java.lang.Runnable
                                                                            public final void run() {
                                                                                r47 r47Var4 = r47.this;
                                                                                k5 k5Var4 = k5Var2;
                                                                                TLRPC.TL_document tL_document43 = tL_document3222222;
                                                                                String str282 = str4;
                                                                                HashMap hashMap2 = hashMap;
                                                                                String str29 = str19;
                                                                                if (r47Var4 != null) {
                                                                                    r7a.B(k5Var4.a).s(r47Var4, null, null, null, tL_document43, str282, null, hashMap2, false, false, str29);
                                                                                    return;
                                                                                }
                                                                                p7a f = p7a.f(tL_document43, null, str282, j, r47Var, r47Var2, r11, arrayList, null, hashMap2, z2, i11, 0, 0, str29, null, false);
                                                                                f.H = storyItem;
                                                                                f.J = ou1Var;
                                                                                f.K = c5aVar;
                                                                                f.O = j2;
                                                                                f.L = z4;
                                                                                f.Q = j3;
                                                                                f.R = j4;
                                                                                f.T = b77Var;
                                                                                f.k = i2;
                                                                                f.j = ki8Var;
                                                                                r7a.B(k5Var4.a).q0(f);
                                                                            }
                                                                        });
                                                                        return i18222222;
                                                                    }
                                                                    if (bitmap3 != null) {
                                                                        Bitmap bitmap5 = bitmap3;
                                                                        TLRPC.PhotoSize U2 = in5.U(bitmap5, 132.0f, 132.0f, 55, z9);
                                                                        if (U2 != null) {
                                                                            tL_document.thumbs.add(U2);
                                                                            tL_document.flags |= i12;
                                                                        }
                                                                        bitmap5.recycle();
                                                                    }
                                                                    if (tL_document.mime_type.equals("image/webp") && r47Var3 == null) {
                                                                        options = new BitmapFactory.Options();
                                                                        try {
                                                                            options.inJustDecodeBounds = true;
                                                                            BitmapFactory.decodeFile(str4, options);
                                                                        } catch (Exception e19) {
                                                                            cc4.g(e19, true);
                                                                        }
                                                                        i13 = options.outWidth;
                                                                        if (i13 != 0 && (i14 = options.outHeight) != 0 && i13 <= 800 && i14 <= 800) {
                                                                            TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                                                                            str17 = str14;
                                                                            tL_documentAttributeSticker.alt = str17;
                                                                            tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                                                                            tL_document.attributes.add(tL_documentAttributeSticker);
                                                                            TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = new TLRPC.TL_documentAttributeImageSize();
                                                                            tL_documentAttributeImageSize.w = options.outWidth;
                                                                            tL_documentAttributeImageSize.h = options.outHeight;
                                                                            tL_document.attributes.add(tL_documentAttributeImageSize);
                                                                            z8 = z9;
                                                                            W = in5.W(null, in5.G(file2.getAbsolutePath(), null, 400.0f, 400.0f, true), Bitmap.CompressFormat.PNG, 400.0f, 400.0f, 100, z8, 0, 0, false);
                                                                            if (W != null) {
                                                                                tL_document.thumbs.add(W);
                                                                                tL_document.flags |= 1;
                                                                            }
                                                                            final String charSequence2 = charSequence != null ? charSequence.toString() : str17;
                                                                            hashMap = new HashMap();
                                                                            str18 = str12;
                                                                            if (str18 != null) {
                                                                                hashMap.put("originalPath", str18);
                                                                            }
                                                                            if (z3 && tL_documentAttributeAudio == null) {
                                                                                hashMap.put("forceDocument", "1");
                                                                            }
                                                                            if (str16 != null) {
                                                                                str19 = str16;
                                                                                hashMap.put("parentObject", str19);
                                                                            } else {
                                                                                str19 = str16;
                                                                            }
                                                                            int i172222222 = 0;
                                                                            if (numArr != null) {
                                                                                Integer num3 = numArr[0];
                                                                                String str29 = tL_document.mime_type;
                                                                                if (str29 == null || !str29.toLowerCase().startsWith("image/webp")) {
                                                                                    String str30 = tL_document.mime_type;
                                                                                    if ((str30 == null || !(str30.toLowerCase().startsWith("image/") || tL_document.mime_type.toLowerCase().startsWith("video/mp4"))) && !r47.y(tL_document)) {
                                                                                        i172222222 = 0;
                                                                                        if (tL_documentAttributeAudio != null) {
                                                                                            numArr[0] = 2;
                                                                                        } else {
                                                                                            numArr[0] = num;
                                                                                        }
                                                                                    } else {
                                                                                        i172222222 = 0;
                                                                                        numArr[0] = 1;
                                                                                    }
                                                                                    num2 = num3;
                                                                                    i10 = i172222222;
                                                                                } else {
                                                                                    numArr[0] = Integer.valueOf(i9);
                                                                                    num2 = num3;
                                                                                    i10 = 1;
                                                                                    i172222222 = 0;
                                                                                }
                                                                            } else {
                                                                                i10 = 0;
                                                                                num2 = num;
                                                                            }
                                                                            if (!z8 || jArr == null) {
                                                                                k5Var2 = k5Var;
                                                                                i11 = i;
                                                                            } else {
                                                                                if (numArr == null || num2 == null || num2 == numArr[i172222222] || ki8Var != null) {
                                                                                    k5Var2 = k5Var;
                                                                                    i11 = i;
                                                                                } else {
                                                                                    k5Var2 = k5Var;
                                                                                    i11 = i;
                                                                                    y(k5Var2, jArr[i172222222], i11);
                                                                                    jArr[i172222222] = Utilities.b.nextLong();
                                                                                }
                                                                                if (i10 == 0) {
                                                                                    hashMap.put("groupId", String.valueOf(jArr[i172222222]));
                                                                                    if (z) {
                                                                                        hashMap.put("final", "1");
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (j6 != 0) {
                                                                                hashMap.put("groupId", String.valueOf(j6));
                                                                            }
                                                                            final TLRPC.TL_document tL_document32222222 = tL_document;
                                                                            int i182222222 = i172222222;
                                                                            hl.c3(new Runnable() { // from class: f6a
                                                                                @Override // java.lang.Runnable
                                                                                public final void run() {
                                                                                    r47 r47Var4 = r47.this;
                                                                                    k5 k5Var4 = k5Var2;
                                                                                    TLRPC.TL_document tL_document43 = tL_document32222222;
                                                                                    String str282 = str4;
                                                                                    HashMap hashMap2 = hashMap;
                                                                                    String str292 = str19;
                                                                                    if (r47Var4 != null) {
                                                                                        r7a.B(k5Var4.a).s(r47Var4, null, null, null, tL_document43, str282, null, hashMap2, false, false, str292);
                                                                                        return;
                                                                                    }
                                                                                    p7a f = p7a.f(tL_document43, null, str282, j, r47Var, r47Var2, charSequence2, arrayList, null, hashMap2, z2, i11, 0, 0, str292, null, false);
                                                                                    f.H = storyItem;
                                                                                    f.J = ou1Var;
                                                                                    f.K = c5aVar;
                                                                                    f.O = j2;
                                                                                    f.L = z4;
                                                                                    f.Q = j3;
                                                                                    f.R = j4;
                                                                                    f.T = b77Var;
                                                                                    f.k = i2;
                                                                                    f.j = ki8Var;
                                                                                    r7a.B(k5Var4.a).q0(f);
                                                                                }
                                                                            });
                                                                            return i182222222;
                                                                        }
                                                                    }
                                                                    z8 = z9;
                                                                }
                                                            }
                                                            z9 = z14;
                                                            i12 = 1;
                                                            if (bitmap3 != null) {
                                                            }
                                                            if (tL_document.mime_type.equals("image/webp")) {
                                                                options = new BitmapFactory.Options();
                                                                options.inJustDecodeBounds = true;
                                                                BitmapFactory.decodeFile(str4, options);
                                                                i13 = options.outWidth;
                                                                if (i13 != 0) {
                                                                    TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker2 = new TLRPC.TL_documentAttributeSticker();
                                                                    str17 = str14;
                                                                    tL_documentAttributeSticker2.alt = str17;
                                                                    tL_documentAttributeSticker2.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                                                                    tL_document.attributes.add(tL_documentAttributeSticker2);
                                                                    TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize2 = new TLRPC.TL_documentAttributeImageSize();
                                                                    tL_documentAttributeImageSize2.w = options.outWidth;
                                                                    tL_documentAttributeImageSize2.h = options.outHeight;
                                                                    tL_document.attributes.add(tL_documentAttributeImageSize2);
                                                                    z8 = z9;
                                                                    W = in5.W(null, in5.G(file2.getAbsolutePath(), null, 400.0f, 400.0f, true), Bitmap.CompressFormat.PNG, 400.0f, 400.0f, 100, z8, 0, 0, false);
                                                                    if (W != null) {
                                                                    }
                                                                    if (charSequence != null) {
                                                                    }
                                                                    hashMap = new HashMap();
                                                                    str18 = str12;
                                                                    if (str18 != null) {
                                                                    }
                                                                    if (z3) {
                                                                        hashMap.put("forceDocument", "1");
                                                                    }
                                                                    if (str16 != null) {
                                                                    }
                                                                    int i1722222222 = 0;
                                                                    if (numArr != null) {
                                                                    }
                                                                    if (z8) {
                                                                    }
                                                                    k5Var2 = k5Var;
                                                                    i11 = i;
                                                                    if (j6 != 0) {
                                                                    }
                                                                    final TLRPC.TL_document tL_document322222222 = tL_document;
                                                                    int i1822222222 = i1722222222;
                                                                    hl.c3(new Runnable() { // from class: f6a
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            r47 r47Var4 = r47.this;
                                                                            k5 k5Var4 = k5Var2;
                                                                            TLRPC.TL_document tL_document43 = tL_document322222222;
                                                                            String str282 = str4;
                                                                            HashMap hashMap2 = hashMap;
                                                                            String str292 = str19;
                                                                            if (r47Var4 != null) {
                                                                                r7a.B(k5Var4.a).s(r47Var4, null, null, null, tL_document43, str282, null, hashMap2, false, false, str292);
                                                                                return;
                                                                            }
                                                                            p7a f = p7a.f(tL_document43, null, str282, j, r47Var, r47Var2, charSequence2, arrayList, null, hashMap2, z2, i11, 0, 0, str292, null, false);
                                                                            f.H = storyItem;
                                                                            f.J = ou1Var;
                                                                            f.K = c5aVar;
                                                                            f.O = j2;
                                                                            f.L = z4;
                                                                            f.Q = j3;
                                                                            f.R = j4;
                                                                            f.T = b77Var;
                                                                            f.k = i2;
                                                                            f.j = ki8Var;
                                                                            r7a.B(k5Var4.a).q0(f);
                                                                        }
                                                                    });
                                                                    return i1822222222;
                                                                }
                                                            }
                                                            z8 = z9;
                                                        } else {
                                                            z8 = z7;
                                                            str16 = str15;
                                                        }
                                                        str17 = str14;
                                                        if (charSequence != null) {
                                                        }
                                                        hashMap = new HashMap();
                                                        str18 = str12;
                                                        if (str18 != null) {
                                                        }
                                                        if (z3) {
                                                        }
                                                        if (str16 != null) {
                                                        }
                                                        int i17222222222 = 0;
                                                        if (numArr != null) {
                                                        }
                                                        if (z8) {
                                                        }
                                                        k5Var2 = k5Var;
                                                        i11 = i;
                                                        if (j6 != 0) {
                                                        }
                                                        final TLRPC.TL_document tL_document3222222222 = tL_document;
                                                        int i18222222222 = i17222222222;
                                                        hl.c3(new Runnable() { // from class: f6a
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                r47 r47Var4 = r47.this;
                                                                k5 k5Var4 = k5Var2;
                                                                TLRPC.TL_document tL_document43 = tL_document3222222222;
                                                                String str282 = str4;
                                                                HashMap hashMap2 = hashMap;
                                                                String str292 = str19;
                                                                if (r47Var4 != null) {
                                                                    r7a.B(k5Var4.a).s(r47Var4, null, null, null, tL_document43, str282, null, hashMap2, false, false, str292);
                                                                    return;
                                                                }
                                                                p7a f = p7a.f(tL_document43, null, str282, j, r47Var, r47Var2, charSequence2, arrayList, null, hashMap2, z2, i11, 0, 0, str292, null, false);
                                                                f.H = storyItem;
                                                                f.J = ou1Var;
                                                                f.K = c5aVar;
                                                                f.O = j2;
                                                                f.L = z4;
                                                                f.Q = j3;
                                                                f.R = j4;
                                                                f.T = b77Var;
                                                                f.k = i2;
                                                                f.j = ki8Var;
                                                                r7a.B(k5Var4.a).q0(f);
                                                            }
                                                        });
                                                        return i18222222222;
                                                    }
                                                    if (tL_documentAttributeAudio != null) {
                                                        StringBuilder l = c00.l(str27, MediaStreamTrack.AUDIO_TRACK_KIND);
                                                        l.append(file2.length());
                                                        sb = l.toString();
                                                    } else {
                                                        StringBuilder l2 = c00.l(str27, "");
                                                        l2.append(file2.length());
                                                        sb = l2.toString();
                                                    }
                                                    str27 = sb;
                                                }
                                                z6 = false;
                                                if (ki8Var == null) {
                                                }
                                                if (z6) {
                                                }
                                                str12 = str27;
                                                num = 0;
                                                j6 = j8;
                                                obj3 = obj2;
                                                obj4 = obj;
                                                bitmap3 = bitmap2;
                                                z7 = B;
                                                i9 = -1;
                                                str13 = str7;
                                                str14 = "";
                                                mimeTypeMap2 = mimeTypeMap;
                                                obj5 = "mp3";
                                                str15 = null;
                                                tL_document = null;
                                                if (tL_document != null) {
                                                }
                                                str17 = str14;
                                                if (charSequence != null) {
                                                }
                                                hashMap = new HashMap();
                                                str18 = str12;
                                                if (str18 != null) {
                                                }
                                                if (z3) {
                                                }
                                                if (str16 != null) {
                                                }
                                                int i172222222222 = 0;
                                                if (numArr != null) {
                                                }
                                                if (z8) {
                                                }
                                                k5Var2 = k5Var;
                                                i11 = i;
                                                if (j6 != 0) {
                                                }
                                                final TLRPC.TL_document tL_document32222222222 = tL_document;
                                                int i182222222222 = i172222222222;
                                                hl.c3(new Runnable() { // from class: f6a
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        r47 r47Var4 = r47.this;
                                                        k5 k5Var4 = k5Var2;
                                                        TLRPC.TL_document tL_document43 = tL_document32222222222;
                                                        String str282 = str4;
                                                        HashMap hashMap2 = hashMap;
                                                        String str292 = str19;
                                                        if (r47Var4 != null) {
                                                            r7a.B(k5Var4.a).s(r47Var4, null, null, null, tL_document43, str282, null, hashMap2, false, false, str292);
                                                            return;
                                                        }
                                                        p7a f = p7a.f(tL_document43, null, str282, j, r47Var, r47Var2, charSequence2, arrayList, null, hashMap2, z2, i11, 0, 0, str292, null, false);
                                                        f.H = storyItem;
                                                        f.J = ou1Var;
                                                        f.K = c5aVar;
                                                        f.O = j2;
                                                        f.L = z4;
                                                        f.Q = j3;
                                                        f.R = j4;
                                                        f.T = b77Var;
                                                        f.k = i2;
                                                        f.j = ki8Var;
                                                        r7a.B(k5Var4.a).q0(f);
                                                    }
                                                });
                                                return i182222222222;
                                            }
                                            str7 = name;
                                            obj = "flac";
                                            obj2 = "opus";
                                            file2 = file;
                                            a = h00.a(file2);
                                            if (a == null) {
                                                long j9 = a.b;
                                                if (j9 != j5) {
                                                    str8 = a.d;
                                                    str9 = a.c;
                                                    i7 = (int) (j9 / 1000);
                                                } else {
                                                    str8 = null;
                                                    str9 = null;
                                                    i7 = 0;
                                                }
                                                bitmap = a.o;
                                            } else {
                                                bitmap = null;
                                                str8 = null;
                                                str9 = null;
                                                i7 = 0;
                                            }
                                            bitmap2 = bitmap;
                                            str10 = str9;
                                            z5 = false;
                                            if (i7 != 0) {
                                            }
                                            if (str27 != null) {
                                            }
                                            z6 = false;
                                            if (ki8Var == null) {
                                            }
                                            if (z6) {
                                            }
                                            str12 = str27;
                                            num = 0;
                                            j6 = j8;
                                            obj3 = obj2;
                                            obj4 = obj;
                                            bitmap3 = bitmap2;
                                            z7 = B;
                                            i9 = -1;
                                            str13 = str7;
                                            str14 = "";
                                            mimeTypeMap2 = mimeTypeMap;
                                            obj5 = "mp3";
                                            str15 = null;
                                            tL_document = null;
                                            if (tL_document != null) {
                                            }
                                            str17 = str14;
                                            if (charSequence != null) {
                                            }
                                            hashMap = new HashMap();
                                            str18 = str12;
                                            if (str18 != null) {
                                            }
                                            if (z3) {
                                            }
                                            if (str16 != null) {
                                            }
                                            int i1722222222222 = 0;
                                            if (numArr != null) {
                                            }
                                            if (z8) {
                                            }
                                            k5Var2 = k5Var;
                                            i11 = i;
                                            if (j6 != 0) {
                                            }
                                            final TLRPC.TL_document tL_document322222222222 = tL_document;
                                            int i1822222222222 = i1722222222222;
                                            hl.c3(new Runnable() { // from class: f6a
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    r47 r47Var4 = r47.this;
                                                    k5 k5Var4 = k5Var2;
                                                    TLRPC.TL_document tL_document43 = tL_document322222222222;
                                                    String str282 = str4;
                                                    HashMap hashMap2 = hashMap;
                                                    String str292 = str19;
                                                    if (r47Var4 != null) {
                                                        r7a.B(k5Var4.a).s(r47Var4, null, null, null, tL_document43, str282, null, hashMap2, false, false, str292);
                                                        return;
                                                    }
                                                    p7a f = p7a.f(tL_document43, null, str282, j, r47Var, r47Var2, charSequence2, arrayList, null, hashMap2, z2, i11, 0, 0, str292, null, false);
                                                    f.H = storyItem;
                                                    f.J = ou1Var;
                                                    f.K = c5aVar;
                                                    f.O = j2;
                                                    f.L = z4;
                                                    f.Q = j3;
                                                    f.R = j4;
                                                    f.T = b77Var;
                                                    f.k = i2;
                                                    f.j = ki8Var;
                                                    r7a.B(k5Var4.a).q0(f);
                                                }
                                            });
                                            return i1822222222222;
                                        }
                                        str5 = str4.substring(lastIndexOf + i6);
                                    }
                                    str6 = str5;
                                    lowerCase = str6.toLowerCase();
                                    if (lowerCase.equals("mp3")) {
                                    }
                                    str7 = name;
                                    obj = "flac";
                                    obj2 = "opus";
                                    file2 = file;
                                    a = h00.a(file2);
                                    if (a == null) {
                                    }
                                    bitmap2 = bitmap;
                                    str10 = str9;
                                    z5 = false;
                                    if (i7 != 0) {
                                    }
                                    if (str27 != null) {
                                    }
                                    z6 = false;
                                    if (ki8Var == null) {
                                    }
                                    if (z6) {
                                    }
                                    str12 = str27;
                                    num = 0;
                                    j6 = j8;
                                    obj3 = obj2;
                                    obj4 = obj;
                                    bitmap3 = bitmap2;
                                    z7 = B;
                                    i9 = -1;
                                    str13 = str7;
                                    str14 = "";
                                    mimeTypeMap2 = mimeTypeMap;
                                    obj5 = "mp3";
                                    str15 = null;
                                    tL_document = null;
                                    if (tL_document != null) {
                                    }
                                    str17 = str14;
                                    if (charSequence != null) {
                                    }
                                    hashMap = new HashMap();
                                    str18 = str12;
                                    if (str18 != null) {
                                    }
                                    if (z3) {
                                    }
                                    if (str16 != null) {
                                    }
                                    int i17222222222222 = 0;
                                    if (numArr != null) {
                                    }
                                    if (z8) {
                                    }
                                    k5Var2 = k5Var;
                                    i11 = i;
                                    if (j6 != 0) {
                                    }
                                    final TLRPC.TL_document tL_document3222222222222 = tL_document;
                                    int i18222222222222 = i17222222222222;
                                    hl.c3(new Runnable() { // from class: f6a
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            r47 r47Var4 = r47.this;
                                            k5 k5Var4 = k5Var2;
                                            TLRPC.TL_document tL_document43 = tL_document3222222222222;
                                            String str282 = str4;
                                            HashMap hashMap2 = hashMap;
                                            String str292 = str19;
                                            if (r47Var4 != null) {
                                                r7a.B(k5Var4.a).s(r47Var4, null, null, null, tL_document43, str282, null, hashMap2, false, false, str292);
                                                return;
                                            }
                                            p7a f = p7a.f(tL_document43, null, str282, j, r47Var, r47Var2, charSequence2, arrayList, null, hashMap2, z2, i11, 0, 0, str292, null, false);
                                            f.H = storyItem;
                                            f.J = ou1Var;
                                            f.K = c5aVar;
                                            f.O = j2;
                                            f.L = z4;
                                            f.Q = j3;
                                            f.R = j4;
                                            f.T = b77Var;
                                            f.k = i2;
                                            f.j = ki8Var;
                                            r7a.B(k5Var4.a).q0(f);
                                        }
                                    });
                                    return i18222222222222;
                                }
                            }
                        }
                    }
                }
                return i5;
            }
            return i3;
        }
        mimeTypeMap = singleton;
        i3 = 2;
        i4 = 1;
        j5 = 0;
        str4 = str26;
        str5 = null;
        i6 = i4;
        file = new File(str4);
        i5 = i6;
        if (file.exists()) {
        }
        return i5;
    }

    public static void U(final int i, final long j, final long j2, final long j3, final long j4, final k5 k5Var, final ou1 ou1Var, final kj4 kj4Var, final r47 r47Var, final r47 r47Var2, final r47 r47Var3, final b77 b77Var, final ki8 ki8Var, final c5a c5aVar, final String str, final String str2, final ArrayList arrayList, final ArrayList arrayList2, final ArrayList arrayList3, final ArrayList arrayList4, final ArrayList arrayList5, final ArrayList arrayList6, final TL_stories.StoryItem storyItem, final boolean z, final boolean z2) {
        if (arrayList == null && arrayList2 == null && arrayList3 == null) {
            return;
        }
        if (arrayList == null || arrayList2 == null || arrayList.size() == arrayList2.size()) {
            Utilities.e.c(new Runnable() { // from class: c6a
                @Override // java.lang.Runnable
                public final void run() {
                    int i2;
                    boolean z3;
                    String str3;
                    long j5;
                    int i3;
                    k5 k5Var2;
                    Uri uri;
                    long j6;
                    b77 b77Var2;
                    long j7;
                    int i4;
                    ArrayList arrayList7;
                    boolean z4;
                    long[] jArr = new long[1];
                    Integer[] numArr = new Integer[1];
                    long j8 = j;
                    boolean B = wf3.B(j8);
                    ArrayList arrayList8 = arrayList;
                    String str4 = str;
                    ki8 ki8Var2 = ki8Var;
                    k5 k5Var3 = k5Var;
                    int i5 = i;
                    String str5 = str2;
                    r47 r47Var4 = r47Var;
                    r47 r47Var5 = r47Var2;
                    TL_stories.StoryItem storyItem2 = storyItem;
                    String str6 = str5;
                    ou1 ou1Var2 = ou1Var;
                    ArrayList arrayList9 = arrayList4;
                    r47 r47Var6 = r47Var3;
                    boolean z5 = z;
                    kj4 kj4Var2 = kj4Var;
                    c5a c5aVar2 = c5aVar;
                    kj4 kj4Var3 = kj4Var2;
                    int i6 = i5;
                    long j9 = j2;
                    boolean z6 = z2;
                    String str7 = str4;
                    long j10 = j9;
                    long j11 = j3;
                    long j12 = j4;
                    b77 b77Var3 = b77Var;
                    if (arrayList8 != null) {
                        int size = arrayList8.size();
                        int i7 = 0;
                        i2 = 0;
                        int i8 = 0;
                        z3 = true;
                        while (i7 < size) {
                            kj4 kj4Var4 = kj4Var3;
                            String str8 = i7 == 0 ? str7 : null;
                            boolean z7 = z6;
                            if (B || size <= 1 || i8 % 10 != 0 || ki8Var2 != null) {
                                b77Var2 = b77Var3;
                                j7 = j8;
                                i4 = i6;
                            } else {
                                b77Var2 = b77Var3;
                                j7 = j8;
                                long j13 = jArr[0];
                                if (j13 != 0) {
                                    i4 = i6;
                                    r7a.y(k5Var3, j13, i4);
                                } else {
                                    i4 = i6;
                                }
                                jArr[0] = Utilities.b.nextLong();
                                i8 = 0;
                            }
                            int i9 = i8 + 1;
                            long j14 = jArr[0];
                            if ((ki8Var2 == null && i9 == 10) || i7 == size - 1) {
                                arrayList7 = arrayList9;
                                z4 = true;
                            } else {
                                arrayList7 = arrayList9;
                                z4 = false;
                            }
                            String str9 = (String) arrayList8.get(i7);
                            b77 b77Var4 = b77Var2;
                            String str10 = (String) arrayList2.get(i7);
                            int i10 = i9;
                            String str11 = str6;
                            ArrayList arrayList10 = i7 == 0 ? arrayList7 : null;
                            String str12 = str7;
                            boolean z8 = kj4Var4 == null;
                            long j15 = j10;
                            if (!z3) {
                                j10 = 0;
                            }
                            ArrayList arrayList11 = arrayList5;
                            int i11 = i7;
                            int i12 = size;
                            long j16 = j7;
                            ArrayList arrayList12 = arrayList8;
                            ArrayList arrayList13 = arrayList7;
                            int i13 = i4;
                            j8 = j16;
                            i2 = r7a.T(k5Var3, str9, str10, null, str11, j8, r47Var4, r47Var5, storyItem2, ou1Var2, arrayList10, r47Var6, jArr, z4, str8, z5, i13, numArr, z8, c5aVar2, j10, z7, j11, j12, b77Var4, ki8Var2, arrayList11 != null ? ((Integer) arrayList11.get(i7)).intValue() : -1);
                            k5 k5Var4 = k5Var3;
                            long j17 = jArr[0];
                            if (j14 != j17 || j17 == -1) {
                                i10 = 1;
                            }
                            if (i2 != 0 && z4 && ki8Var2 == null && j17 != 0) {
                                r7a.y(k5Var4, j17, i13);
                                jArr[0] = 0;
                                i10 = 0;
                            }
                            int i14 = i11 + 1;
                            i6 = i13;
                            k5Var3 = k5Var4;
                            str6 = str11;
                            b77Var3 = b77Var4;
                            z3 = false;
                            arrayList8 = arrayList12;
                            arrayList9 = arrayList13;
                            str7 = str12;
                            j10 = j15;
                            kj4Var3 = kj4Var4;
                            i7 = i14;
                            z6 = z7;
                            size = i12;
                            i8 = i10;
                        }
                    } else {
                        i2 = 0;
                        z3 = true;
                    }
                    boolean z9 = z6;
                    k5 k5Var5 = k5Var3;
                    ArrayList arrayList14 = arrayList8;
                    b77 b77Var5 = b77Var3;
                    String str13 = str6;
                    ArrayList arrayList15 = arrayList9;
                    kj4 kj4Var5 = kj4Var3;
                    int i15 = i6;
                    String str14 = str7;
                    long j18 = j10;
                    ArrayList arrayList16 = arrayList3;
                    if (arrayList16 != null) {
                        jArr[0] = 0;
                        int size2 = arrayList16.size();
                        boolean z10 = z9;
                        int i16 = 0;
                        int i17 = 0;
                        while (i16 < arrayList16.size()) {
                            String str15 = (i16 == 0 && (arrayList14 == null || arrayList14.size() == 0)) ? str14 : null;
                            ArrayList arrayList17 = (i16 == 0 && (arrayList14 == null || arrayList14.size() == 0)) ? arrayList15 : null;
                            if (B || size2 <= 1 || i17 % 10 != 0 || ki8Var2 != null) {
                                str3 = str13;
                                j5 = j8;
                            } else {
                                str3 = str13;
                                j5 = j8;
                                long j19 = jArr[0];
                                if (j19 != 0) {
                                    r7a.y(k5Var5, j19, i15);
                                }
                                jArr[0] = Utilities.b.nextLong();
                                i17 = 0;
                            }
                            int i18 = i17 + 1;
                            long j20 = jArr[0];
                            boolean z11 = (ki8Var2 == null && i18 == 10) || i16 == size2 + (-1);
                            Uri uri2 = (Uri) arrayList16.get(i16);
                            boolean z12 = kj4Var5 == null;
                            if (z3) {
                                i3 = size2;
                                k5Var2 = k5Var5;
                                uri = uri2;
                                j8 = j5;
                                j6 = j18;
                            } else {
                                i3 = size2;
                                k5Var2 = k5Var5;
                                uri = uri2;
                                j8 = j5;
                                j6 = 0;
                            }
                            ArrayList arrayList18 = arrayList16;
                            ArrayList arrayList19 = arrayList6;
                            int intValue = arrayList19 != null ? ((Integer) arrayList19.get(i16)).intValue() : -1;
                            int i19 = i16;
                            int i20 = i15;
                            int i21 = i18;
                            str13 = str3;
                            boolean z13 = z10;
                            int i22 = i3;
                            i2 = r7a.T(k5Var2, null, null, uri, str13, j8, r47Var4, r47Var5, storyItem2, ou1Var2, arrayList17, r47Var6, jArr, z11, str15, z5, i20, numArr, z12, c5aVar2, j6, z13, j11, j12, b77Var5, ki8Var2, intValue);
                            i15 = i20;
                            long j21 = jArr[0];
                            if (j20 != j21 || j21 == -1) {
                                i21 = 1;
                            }
                            if (i2 == 0 || !z11 || ki8Var2 != null || j21 == 0) {
                                i17 = i21;
                            } else {
                                r7a.y(k5Var2, j21, i15);
                                jArr[0] = 0;
                                i17 = 0;
                            }
                            i16 = i19 + 1;
                            k5Var5 = k5Var2;
                            z10 = z13;
                            z3 = false;
                            size2 = i22;
                            arrayList16 = arrayList18;
                        }
                    }
                    k5 k5Var6 = k5Var5;
                    int i23 = i2;
                    if (kj4Var5 != null) {
                        ((iq5) kj4Var5.b).n();
                    }
                    if (i23 != 0) {
                        hl.c3(new me7(i23, k5Var6, (byte) 16));
                    }
                }
            });
        }
    }

    public static void V(k5 k5Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, CharSequence charSequence, String str, long j, r47 r47Var, r47 r47Var2, boolean z, int i) {
        k5 k5Var2;
        CharSequence charSequence2;
        ArrayList arrayList4;
        if (charSequence != null) {
            CharSequence[] charSequenceArr = {charSequence};
            k5Var2 = k5Var;
            ArrayList Y = ls6.d0(k5Var2.a).Y(charSequenceArr, true, true);
            charSequence2 = charSequenceArr[0];
            arrayList4 = Y;
        } else {
            k5Var2 = k5Var;
            charSequence2 = charSequence;
            arrayList4 = null;
        }
        U(i, j, 0L, 0L, 0L, k5Var2, null, null, r47Var, r47Var2, null, null, null, null, charSequence2 != null ? charSequence2.toString() : null, str, arrayList, arrayList2, arrayList3, arrayList4, null, null, null, z, false);
    }

    public static void W(final k5 k5Var, final ArrayList arrayList, final long j, final r47 r47Var, final r47 r47Var2, final TL_stories.StoryItem storyItem, final ou1 ou1Var, final boolean z, boolean z2, final r47 r47Var3, final TLRPC.TL_inputPollAnswer tL_inputPollAnswer, final boolean z3, final int i, final int i2, final boolean z4, final kj4 kj4Var, final c5a c5aVar, final long j2, final boolean z5, final long j3, final long j4, final b77 b77Var, final ki8 ki8Var, final boolean z6) {
        final boolean z7;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                z7 = z2;
                break;
            } else {
                if (((q7a) arrayList.get(i3)).h > 0) {
                    z7 = false;
                    break;
                }
                i3++;
            }
        }
        final long j5 = ki8Var != null ? ki8Var.c : 0L;
        final boolean z8 = j5 != 0;
        J.c(new Runnable() { // from class: x6a
            @Override // java.lang.Runnable
            public final void run() {
                r7a.J(arrayList, j, z, z7, z8, k5Var, j5, r47Var3, tL_inputPollAnswer, r47Var, r47Var2, z3, i, i2, storyItem, ou1Var, c5aVar, j2, z5, j3, j4, b77Var, ki8Var, z6, kj4Var, z4);
            }
        });
    }

    public static void X(k5 k5Var, Uri uri, long j, r47 r47Var, r47 r47Var2, kj4 kj4Var, r47 r47Var3, boolean z, int i, c5a c5aVar) {
        Y(k5Var, null, null, uri, j, r47Var, r47Var2, null, null, null, kj4Var, 0, r47Var3, null, z, i, false, null, c5aVar, 0L, 0L, 0L, null);
    }

    public static void Y(k5 k5Var, String str, String str2, Uri uri, long j, r47 r47Var, r47 r47Var2, ou1 ou1Var, ArrayList arrayList, ArrayList arrayList2, kj4 kj4Var, int i, r47 r47Var3, oec oecVar, boolean z, int i2, boolean z2, CharSequence charSequence, c5a c5aVar, long j2, long j3, long j4, b77 b77Var) {
        q7a q7aVar = new q7a();
        q7aVar.c = str;
        q7aVar.e = str2;
        q7aVar.a = uri;
        if (charSequence != null) {
            q7aVar.d = charSequence.toString();
        }
        q7aVar.i = arrayList;
        q7aVar.h = i;
        if (arrayList2 != null) {
            q7aVar.j = new ArrayList(arrayList2);
        }
        q7aVar.k = oecVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(q7aVar);
        W(k5Var, arrayList3, j, r47Var, r47Var2, null, ou1Var, z2, false, r47Var3, null, z, i2, 0, false, kj4Var, c5aVar, j2, false, j3, j4, b77Var, null, false);
    }

    public static void Z(k5 k5Var, CharSequence charSequence, long j, long j2, boolean z, int i, int i2) {
        jf7.Y(k5Var.a).a.c(new m5a(charSequence, k5Var, j2, j, z, i, i2, (byte) 1));
    }

    public static void a0(int i, int i2, long j, long j2, long j3, long j4, k5 k5Var, ou1 ou1Var, r47 r47Var, r47 r47Var2, r47 r47Var3, b77 b77Var, c5a c5aVar, oec oecVar, CharSequence charSequence, String str, String str2, ArrayList arrayList, TLRPC.Photo photo, TL_stories.StoryItem storyItem, boolean z, boolean z2, boolean z3) {
        if (str == null || str.length() == 0) {
            return;
        }
        new Thread(new g6a(i, i2, j, j2, j3, j4, k5Var, ou1Var, r47Var3, r47Var, r47Var2, b77Var, c5aVar, oecVar, charSequence, str, str2, arrayList, photo, storyItem, z3, z, z2)).start();
    }

    public static boolean h(CharSequence charSequence) {
        if (charSequence instanceof Spannable) {
            for (hm hmVar : (hm[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), hm.class)) {
                if (hmVar.fromEmojiKeyboard) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void i(TL_iv.RichText richText) {
        if (richText != null) {
            richText.parentRichText = null;
            TL_iv.RichText richText2 = richText.text;
            if (richText2 != null) {
                i(richText2);
            }
            ArrayList<TL_iv.RichText> arrayList = richText.texts;
            if (arrayList != null) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    TL_iv.RichText richText3 = arrayList.get(i);
                    i++;
                    i(richText3);
                }
            }
        }
    }

    public static void j(TL_iv.PageBlock pageBlock, IdentityHashMap identityHashMap) {
        if (pageBlock == null || identityHashMap.put(pageBlock, Boolean.TRUE) != null) {
            return;
        }
        for (Field field : pageBlock.getClass().getFields()) {
            if (!Modifier.isStatic(field.getModifiers())) {
                try {
                    Object obj = field.get(pageBlock);
                    if (obj instanceof TL_iv.RichText) {
                        i((TL_iv.RichText) obj);
                    } else if (obj instanceof TL_iv.PageBlock) {
                        j((TL_iv.PageBlock) obj, identityHashMap);
                    } else if (obj instanceof TL_iv.PageCaption) {
                        i(((TL_iv.PageCaption) obj).text);
                        i(((TL_iv.PageCaption) obj).credit);
                    } else if (obj instanceof List) {
                        for (Object obj2 : (List) obj) {
                            if (obj2 instanceof TL_iv.PageBlock) {
                                j((TL_iv.PageBlock) obj2, identityHashMap);
                            } else if (obj2 instanceof TL_iv.RichText) {
                                i((TL_iv.RichText) obj2);
                            } else if ((obj2 instanceof TL_iv.PageListItem) || (obj2 instanceof TL_iv.PageListOrderedItem)) {
                                for (Field field2 : obj2.getClass().getFields()) {
                                    if (!Modifier.isStatic(field2.getModifiers())) {
                                        try {
                                            Object obj3 = field2.get(obj2);
                                            if (obj3 instanceof TL_iv.RichText) {
                                                i((TL_iv.RichText) obj3);
                                            } else if (obj3 instanceof List) {
                                                for (Object obj4 : (List) obj3) {
                                                    if (obj4 instanceof TL_iv.PageBlock) {
                                                        j((TL_iv.PageBlock) obj4, identityHashMap);
                                                    }
                                                }
                                            }
                                        } catch (IllegalAccessException unused) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                } catch (IllegalAccessException unused2) {
                }
            }
        }
    }

    public static ArrayList l(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) arrayList.get(i);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo_layer159 tL_documentAttributeVideo_layer159 = new TLRPC.TL_documentAttributeVideo_layer159();
                    tL_documentAttributeVideo_layer159.flags = documentAttribute.flags;
                    tL_documentAttributeVideo_layer159.round_message = documentAttribute.round_message;
                    tL_documentAttributeVideo_layer159.supports_streaming = documentAttribute.supports_streaming;
                    tL_documentAttributeVideo_layer159.duration = documentAttribute.duration;
                    tL_documentAttributeVideo_layer159.w = documentAttribute.w;
                    tL_documentAttributeVideo_layer159.h = documentAttribute.h;
                    arrayList2.add(tL_documentAttributeVideo_layer159);
                } else {
                    arrayList2.add(documentAttribute);
                }
            }
        }
        return arrayList2;
    }

    public static TL_iv.TL_inputRichMessage l0(ArrayList arrayList, TL_iv.RichMessage richMessage) {
        TL_iv.TL_inputRichMessage tL_inputRichMessage = new TL_iv.TL_inputRichMessage();
        if (richMessage != null) {
            tL_inputRichMessage.rtl = richMessage.rtl;
            tL_inputRichMessage.blocks = new ArrayList<>(richMessage.blocks.size());
            for (int i = 0; i < richMessage.blocks.size(); i++) {
                tL_inputRichMessage.blocks.add(x0(richMessage.blocks.get(i)));
            }
            ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                tL_inputRichMessage.flags |= 4;
                ArrayList<TLRPC.Photo> arrayList3 = richMessage.photos;
                int size = arrayList3.size();
                int i2 = 0;
                while (i2 < size) {
                    TLRPC.Photo photo = arrayList3.get(i2);
                    i2++;
                    TLRPC.Photo photo2 = photo;
                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                    tL_inputPhoto.id = photo2.id;
                    tL_inputPhoto.access_hash = photo2.access_hash;
                    byte[] bArr = photo2.file_reference;
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    tL_inputPhoto.file_reference = bArr;
                    tL_inputRichMessage.photos.add(tL_inputPhoto);
                }
            }
            ArrayList<TLRPC.Document> arrayList4 = richMessage.documents;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                tL_inputRichMessage.flags |= 8;
                ArrayList<TLRPC.Document> arrayList5 = richMessage.documents;
                int size2 = arrayList5.size();
                int i3 = 0;
                while (i3 < size2) {
                    TLRPC.Document document = arrayList5.get(i3);
                    i3++;
                    TLRPC.Document document2 = document;
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputDocument.id = document2.id;
                    tL_inputDocument.access_hash = document2.access_hash;
                    byte[] bArr2 = document2.file_reference;
                    if (bArr2 == null) {
                        bArr2 = new byte[0];
                    }
                    tL_inputDocument.file_reference = bArr2;
                    tL_inputRichMessage.documents.add(tL_inputDocument);
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                tL_inputRichMessage.flags |= 16;
                tL_inputRichMessage.users.addAll(arrayList);
            }
        }
        return tL_inputRichMessage;
    }

    public static void m(long j, long j2, File file, File file2) {
        FileChannel channel = new FileInputStream(file).getChannel();
        try {
            FileChannel channel2 = new FileOutputStream(file2).getChannel();
            try {
                channel.position(j);
                ByteBuffer allocate = ByteBuffer.allocate(262144);
                while (j2 > 0) {
                    allocate.clear();
                    allocate.limit((int) Math.min(allocate.capacity(), j2));
                    int read = channel.read(allocate);
                    if (read <= 0) {
                        break;
                    }
                    allocate.flip();
                    channel2.write(allocate);
                    j2 -= read;
                }
                channel2.force(true);
                channel2.close();
                channel.close();
            } finally {
            }
        } catch (Throwable th) {
            if (channel != null) {
                try {
                    channel.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static oec n(long j, String str) {
        long d;
        int[] iArr = new int[11];
        AnimatedFileNative.d(str, iArr, j);
        if (iArr[0] == 0) {
            if (!f11.a) {
                return null;
            }
            cc4.b("video hasn't avc1 atom");
            return null;
        }
        long length = new File(str).length();
        int C = MediaController.C(str);
        if (C == -1) {
            C = iArr[3];
        }
        float f = iArr[4];
        long j2 = iArr[5];
        int i = iArr[7];
        oec oecVar = new oec();
        oecVar.a = -1L;
        oecVar.b = -1L;
        oecVar.m = C;
        oecVar.o = str;
        oecVar.p = j;
        oecVar.n = i;
        oecVar.r = (long) Math.ceil(f);
        boolean z = true;
        int i2 = iArr[1];
        oecVar.h = i2;
        oecVar.k = i2;
        int i3 = iArr[2];
        oecVar.i = i3;
        oecVar.l = i3;
        oecVar.g = iArr[8];
        oecVar.v = (long) (f * 1000.0f);
        float max = Math.max(i2, i3);
        float f2 = 1280.0f;
        int i4 = max > 1280.0f ? 4 : max > 854.0f ? 3 : max > 640.0f ? 2 : 1;
        lq3 q = lq3.q(yac.t0);
        int e = a.e();
        int round = Math.round((e == 1 ? q.p().h : e == 2 ? q.o().h : q.n().h) / (100.0f / i4));
        if (round > i4) {
            round = i4;
        }
        if (new File(str).length() < 1048576000) {
            if (round != i4 || Math.max(oecVar.h, oecVar.i) > 1280) {
                if (round == 1) {
                    f2 = 432.0f;
                } else if (round == 2) {
                    f2 = 640.0f;
                } else if (round == 3) {
                    f2 = 848.0f;
                }
                int i5 = oecVar.h;
                int i6 = oecVar.i;
                float f3 = f2 / (i5 > i6 ? i5 : i6);
                oecVar.k = Math.round((i5 * f3) / 2.0f) << 1;
                oecVar.l = Math.round((oecVar.i * f3) / 2.0f) << 1;
            } else {
                z = false;
            }
            C = MediaController.T(oecVar.i, oecVar.h, C, oecVar.l, oecVar.k);
        } else {
            z = false;
        }
        if (z) {
            oecVar.m = C;
            d = (long) qu6.d(f / 1000.0f, MediaController.s(oecVar.k, oecVar.l, C, false), 8.0f, j2);
            oecVar.q = d;
        } else {
            oecVar.k = oecVar.h;
            oecVar.l = oecVar.i;
            oecVar.m = C;
            oecVar.q = length;
            d = length;
        }
        if (d == 0) {
            oecVar.q = 1L;
        }
        return oecVar;
    }

    public static Bitmap q(int i, String str) {
        float f = i == 2 ? 1920.0f : i == 3 ? 96.0f : 512.0f;
        Bitmap r = r(str, 0L, null, false);
        if (r != null) {
            int width = r.getWidth();
            int height = r.getHeight();
            float f2 = width;
            if (f2 > f || height > f) {
                float max = Math.max(width, height) / f;
                return Bitmap.createScaledBitmap(r, (int) (f2 / max), (int) (height / max), true);
            }
        }
        return r;
    }

    public static Bitmap r(String str, long j, int[] iArr, boolean z) {
        if (z) {
            lm lmVar = new lm(new File(str), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
            Bitmap q = lmVar.q(j, z);
            if (iArr != null) {
                iArr[0] = lmVar.d[2];
            }
            lmVar.u();
            return q == null ? r(str, j, iArr, false) : q;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        Bitmap bitmap = null;
        try {
            mediaMetadataRetriever.setDataSource(str);
            bitmap = mediaMetadataRetriever.getFrameAtTime(j, 1);
            if (bitmap == null) {
                bitmap = mediaMetadataRetriever.getFrameAtTime(j, 3);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            try {
                mediaMetadataRetriever.release();
            } catch (Throwable unused2) {
            }
            throw th;
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Throwable unused3) {
        }
        return bitmap;
    }

    public static void v(k5 k5Var, boolean z, TLObject tLObject, String str, Uri uri, long j, boolean z2) {
        boolean z3;
        TLRPC.PhotoSize W;
        TLRPC.PhotoSize W2;
        if (tLObject instanceof TLRPC.TL_photo) {
            TLRPC.TL_photo tL_photo = (TLRPC.TL_photo) tLObject;
            TLRPC.PhotoSize w = xb4.w(tL_photo.sizes, 90, false, null, false);
            if ((w instanceof TLRPC.TL_photoStrippedSize) || (w instanceof TLRPC.TL_photoPathSize)) {
                z3 = true;
            } else {
                xb4.G(k5Var.a);
                z3 = xb4.J(w, null, true, true).exists();
            }
            TLRPC.PhotoSize w2 = xb4.w(tL_photo.sizes, hl.Y0(z2), false, null, false);
            xb4.G(k5Var.a);
            boolean exists = xb4.J(w2, null, false, true).exists();
            if (z3 && exists) {
                return;
            }
            Bitmap G = in5.G(str, uri, hl.Y0(false), hl.Y0(false), true);
            if (G == null) {
                G = in5.G(str, uri, 800.0f, 800.0f, true);
            }
            Bitmap bitmap = G;
            if (!exists && (W2 = in5.W(w2, bitmap, Bitmap.CompressFormat.JPEG, hl.Y0(false), hl.Y0(false), 80, false, 101, 101, false)) != w2) {
                tL_photo.sizes.add(0, W2);
            }
            if (!z3 && (W = in5.W(w, bitmap, Bitmap.CompressFormat.JPEG, 90.0f, 90.0f, 55, true, 0, 0, false)) != w) {
                tL_photo.sizes.add(0, W);
            }
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        if (tLObject instanceof TLRPC.TL_document) {
            TLRPC.TL_document tL_document = (TLRPC.TL_document) tLObject;
            if ((r47.J4(tL_document) || r47.M3(tL_document)) && r47.W2(tL_document)) {
                ArrayList<TLRPC.PhotoSize> arrayList = tL_document.thumbs;
                int i = jn7.q5;
                TLRPC.PhotoSize w3 = xb4.w(arrayList, jn7.q5, false, null, false);
                if ((w3 instanceof TLRPC.TL_photoStrippedSize) || (w3 instanceof TLRPC.TL_photoPathSize)) {
                    return;
                }
                xb4.G(k5Var.a);
                if (xb4.J(w3, null, true, true).exists()) {
                    return;
                }
                Bitmap r = r(str, j, null, false);
                if (r == null) {
                    r = q(1, str);
                }
                Bitmap bitmap2 = r;
                if (z) {
                    i = 90;
                }
                ArrayList<TLRPC.PhotoSize> arrayList2 = tL_document.thumbs;
                float f = i;
                int i2 = i > 90 ? 80 : 55;
                ThreadLocal threadLocal = in5.I;
                arrayList2.set(0, in5.W(w3, bitmap2, Bitmap.CompressFormat.JPEG, f, f, i2, false, 0, 0, true));
            }
        }
    }

    public static void w(String str, TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo, oec oecVar) {
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        try {
            try {
                mediaMetadataRetriever = new MediaMetadataRetriever();
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            mediaMetadataRetriever.setDataSource(str);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
            if (extractMetadata != null) {
                tL_documentAttributeVideo.w = Integer.parseInt(extractMetadata);
            }
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
            if (extractMetadata2 != null) {
                tL_documentAttributeVideo.h = Integer.parseInt(extractMetadata2);
            }
            if (mediaMetadataRetriever.extractMetadata(9) != null) {
                tL_documentAttributeVideo.duration = Long.parseLong(r3) / 1000.0d;
            }
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
            if (extractMetadata3 != null) {
                int intValue = Utilities.z(extractMetadata3).intValue();
                if (oecVar == null && (intValue == 90 || intValue == 270)) {
                    int i = tL_documentAttributeVideo.w;
                    tL_documentAttributeVideo.w = tL_documentAttributeVideo.h;
                    tL_documentAttributeVideo.h = i;
                }
            }
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
        } catch (Exception e3) {
            e = e3;
            mediaMetadataRetriever2 = mediaMetadataRetriever;
            cc4.g(e, true);
            if (mediaMetadataRetriever2 != null) {
                try {
                    mediaMetadataRetriever2.release();
                } catch (Exception e4) {
                    cc4.g(e4, true);
                }
            }
            try {
                MediaPlayer create = MediaPlayer.create(a.b, Uri.fromFile(new File(str)));
                if (create != null) {
                    tL_documentAttributeVideo.duration = create.getDuration() / 1000.0d;
                    tL_documentAttributeVideo.w = create.getVideoWidth();
                    tL_documentAttributeVideo.h = create.getVideoHeight();
                    create.release();
                }
            } catch (Exception e5) {
                cc4.g(e5, true);
            }
        } catch (Throwable th2) {
            th = th2;
            mediaMetadataRetriever2 = mediaMetadataRetriever;
            if (mediaMetadataRetriever2 != null) {
                try {
                    mediaMetadataRetriever2.release();
                } catch (Exception e6) {
                    cc4.g(e6, true);
                }
            }
            throw th;
        }
    }

    public static boolean w0(Uri uri, String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (str != null) {
            try {
                BitmapFactory.decodeFile(str, options);
            } catch (Exception e) {
                cc4.g(e, true);
            }
        } else {
            try {
                InputStream openInputStream = a.b.getContentResolver().openInputStream(uri);
                try {
                    BitmapFactory.decodeStream(openInputStream, null, options);
                    if (openInputStream != null) {
                        openInputStream.close();
                    }
                } finally {
                }
            } catch (Exception unused) {
            }
        }
        return options.outWidth < 800 && options.outHeight < 800;
    }

    public static TL_iv.PageBlock x0(TL_iv.PageBlock pageBlock) {
        TLRPC.InputGeoPoint inputGeoPoint;
        if (!(pageBlock instanceof TL_iv.pageBlockMap)) {
            return pageBlock;
        }
        TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
        TL_iv.inputPageBlockMap inputpageblockmap = new TL_iv.inputPageBlockMap();
        TLRPC.GeoPoint geoPoint = pageblockmap.geo;
        if (geoPoint instanceof TLRPC.TL_geoPoint) {
            TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
            tL_inputGeoPoint.lat = geoPoint.lat;
            tL_inputGeoPoint._long = geoPoint._long;
            int i = geoPoint.accuracy_radius;
            if (i != 0) {
                tL_inputGeoPoint.flags |= 1;
                tL_inputGeoPoint.accuracy_radius = i;
            }
            inputGeoPoint = tL_inputGeoPoint;
        } else {
            inputGeoPoint = new TLRPC.TL_inputGeoPointEmpty();
        }
        inputpageblockmap.geo = inputGeoPoint;
        inputpageblockmap.zoom = pageblockmap.zoom;
        inputpageblockmap.w = pageblockmap.w;
        inputpageblockmap.h = pageblockmap.h;
        inputpageblockmap.caption = pageblockmap.caption;
        return inputpageblockmap;
    }

    public static void y(k5 k5Var, long j, int i) {
        hl.c3(new lb2((Object) k5Var, j, i, (byte) 4));
    }

    public final i7a A(long j) {
        return (i7a) this.E.f(j);
    }

    public final Boolean E(r47 r47Var, TLRPC.TodoItem todoItem) {
        return (Boolean) this.I.get(Integer.valueOf(Objects.hash(Long.valueOf(r47.B0(r47Var.k)), Integer.valueOf(r47Var.e1()), Integer.valueOf(todoItem.id))));
    }

    public final long H(long j) {
        return ((Long) this.x.g(j, 0L)).longValue();
    }

    public final boolean I(int i) {
        return this.c.indexOfKey(i) >= 0 || this.d.indexOfKey(i) >= 0;
    }

    public final void K(d7a d7aVar) {
        L(d7aVar, -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [org.telegram.tgnet.TLRPC$InputMedia] */
    /* JADX WARN: Type inference failed for: r0v13, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r0v17, types: [org.telegram.tgnet.TLRPC$InputMedia] */
    /* JADX WARN: Type inference failed for: r0v19, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r0v25, types: [org.telegram.tgnet.TLRPC$InputMedia] */
    public final void L(d7a d7aVar, int i) {
        TLRPC.InputEncryptedFile inputEncryptedFile;
        TLRPC.InputFile inputFile;
        String str;
        TLRPC.InputMedia inputMedia;
        TLRPC.InputPeer inputPeer;
        TLRPC.InputMedia inputMedia2;
        r47 r47Var;
        TLRPC.PhotoSize photoSize;
        ArrayList arrayList;
        TLRPC.PhotoSize photoSize2;
        int i2;
        TLRPC.InputMedia inputMedia3;
        TLRPC.InputPeer inputPeer2;
        oec oecVar;
        TLRPC.InputMedia d;
        TLRPC.PhotoSize photoSize3;
        r7a r7aVar = this;
        d7a d7aVar2 = d7aVar;
        byte b = d7aVar2.e;
        boolean z = true;
        if (b == 0) {
            String str2 = d7aVar2.l;
            if (str2 != null) {
                r7aVar.d0(str2, d7aVar2);
                in5.z().H(r7aVar.currentAccount, d7aVar2.l, "file");
                return;
            }
            TLObject tLObject = d7aVar2.c;
            int i3 = r7aVar.currentAccount;
            if (tLObject != null) {
                xb4.G(i3);
                String file = xb4.I(d7aVar2.g).toString();
                r7aVar.d0(file, d7aVar2);
                r7aVar.getFileLoader().h0(false, 16777216, file, true);
                r7aVar.g0(d7aVar2.m);
                return;
            }
            xb4.G(i3);
            String file2 = xb4.I(d7aVar2.g).toString();
            if (d7aVar2.d != null && (photoSize3 = d7aVar2.g) != null && photoSize3.location.dc_id != 0) {
                File file3 = new File(file2);
                if (!file3.exists()) {
                    xb4.G(r7aVar.currentAccount);
                    file2 = xb4.J(d7aVar2.g, null, true, true).toString();
                    file3 = new File(file2);
                }
                if (!file3.exists()) {
                    r7aVar.d0(xb4.r(null, d7aVar2.g), d7aVar2);
                    r7aVar.getFileLoader().V(jn5.f(d7aVar2.g, d7aVar2.h), d7aVar2.K, "jpg", 3, 0);
                    return;
                }
            }
            r7aVar.d0(file2, d7aVar2);
            r7aVar.getFileLoader().h0(true, 16777216, file2, true);
            r7aVar.g0(d7aVar2.m);
            return;
        }
        if (b == 1) {
            oec oecVar2 = d7aVar2.o;
            if (oecVar2 != null && oecVar2.b() && d7aVar2.p) {
                r47 r47Var2 = d7aVar2.m;
                String str3 = r47Var2.k.attachPath;
                TLRPC.Document F0 = r47Var2.F0();
                if (str3 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(xb4.z(4));
                    sb.append("/");
                    sb.append(F0.id);
                    sb.append(".");
                    sb.append(d7aVar2.o.N ? "webm" : "mp4");
                    str3 = sb.toString();
                }
                r7aVar.d0(str3, d7aVar2);
                d7aVar2.o.getClass();
                MediaController.z().j0(d7aVar2.m, false, true, false);
                r7aVar.g0(d7aVar2.m);
                return;
            }
            oec oecVar3 = d7aVar2.o;
            if (oecVar3 != null) {
                TLRPC.InputFile inputFile2 = oecVar3.w;
                i2 = 4;
                if (inputFile2 != null) {
                    TLObject tLObject2 = d7aVar2.c;
                    (tLObject2 instanceof TLRPC.TL_messages_sendMedia ? ((TLRPC.TL_messages_sendMedia) tLObject2).media : tLObject2 instanceof TL_ephemeral.TL_sendMessage ? ((TL_ephemeral.TL_sendMessage) tLObject2).media : tLObject2 instanceof TLRPC.TL_messages_addPollAnswer ? ((TLRPC.TL_messages_addPollAnswer) tLObject2).answer.input_media : ((TLRPC.TL_messages_editMessage) tLObject2).media).file = inputFile2;
                    oecVar3.w = null;
                } else if (oecVar3.x != null) {
                    TLRPC.TL_decryptedMessage tL_decryptedMessage = (TLRPC.TL_decryptedMessage) d7aVar2.d;
                    TLRPC.DecryptedMessageMedia decryptedMessageMedia = tL_decryptedMessage.media;
                    decryptedMessageMedia.size = oecVar3.q;
                    decryptedMessageMedia.key = oecVar3.y;
                    decryptedMessageMedia.iv = oecVar3.z;
                    wx9 secretChatHelper = r7aVar.getSecretChatHelper();
                    r47 r47Var3 = d7aVar2.m;
                    secretChatHelper.j(tL_decryptedMessage, r47Var3.k, d7aVar2.n, d7aVar2.o.x, d7aVar2.f, r47Var3);
                    d7aVar2.o.x = null;
                    return;
                }
            } else {
                i2 = 4;
            }
            TLObject tLObject3 = d7aVar2.c;
            if (tLObject3 == null) {
                r47 r47Var4 = d7aVar2.m;
                String str4 = r47Var4.k.attachPath;
                TLRPC.Document F02 = r47Var4.F0();
                if (str4 == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(xb4.z(i2));
                    sb2.append("/");
                    str4 = qu6.p(sb2, F02.id, ".mp4");
                }
                if (d7aVar2.d != null && F02.dc_id != 0) {
                    File file4 = new File(str4);
                    if (!file4.exists()) {
                        xb4 fileLoader = r7aVar.getFileLoader();
                        TLRPC.Message message = d7aVar2.m.k;
                        fileLoader.getClass();
                        file4 = xb4.M(message, false, true);
                        if (file4 != null && file4.exists()) {
                            TLRPC.Message message2 = d7aVar2.m.k;
                            String absolutePath = file4.getAbsolutePath();
                            message2.attachPath = absolutePath;
                            d7aVar2.m.y0 = true;
                            str4 = absolutePath;
                        }
                    }
                    if (file4 == null || (!file4.exists() && d7aVar2.m.F0() != null)) {
                        xb4 fileLoader2 = r7aVar.getFileLoader();
                        TLRPC.Document F03 = d7aVar2.m.F0();
                        fileLoader2.getClass();
                        file4 = xb4.J(F03, null, false, true);
                        if (file4 != null && file4.exists()) {
                            TLRPC.Message message3 = d7aVar2.m.k;
                            String absolutePath2 = file4.getAbsolutePath();
                            message3.attachPath = absolutePath2;
                            d7aVar2.m.y0 = true;
                            str4 = absolutePath2;
                        }
                    }
                    if (file4 == null || (!file4.exists() && d7aVar2.m.F0() != null)) {
                        xb4 fileLoader3 = r7aVar.getFileLoader();
                        TLRPC.Document F04 = d7aVar2.m.F0();
                        fileLoader3.getClass();
                        file4 = xb4.J(F04, null, true, true);
                        if (file4 != null && file4.exists()) {
                            TLRPC.Message message4 = d7aVar2.m.k;
                            String absolutePath3 = file4.getAbsolutePath();
                            message4.attachPath = absolutePath3;
                            d7aVar2.m.y0 = true;
                            str4 = absolutePath3;
                        }
                    }
                    if (file4 == null || !file4.exists()) {
                        r7aVar.d0(xb4.r(null, F02), d7aVar2);
                        r7aVar.getFileLoader().X(F02, d7aVar2.K, 3, 0);
                        return;
                    }
                }
                String str5 = str4;
                r7aVar.d0(str5, d7aVar2);
                oec oecVar4 = d7aVar2.m.r0;
                if (oecVar4 != null) {
                    if (!oecVar4.O) {
                        if (oecVar4.b()) {
                            r7aVar.getFileLoader().g0(str5, true, false, F02.size, 33554432, false);
                        }
                    }
                    r7aVar.g0(d7aVar2.m);
                    return;
                }
                r7aVar.getFileLoader().h0(true, 33554432, str5, false);
                r7aVar.g0(d7aVar2.m);
                return;
            }
            if (tLObject3 instanceof TLRPC.TL_messages_sendMedia) {
                TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject3;
                inputMedia3 = tL_messages_sendMedia.media;
                inputPeer2 = tL_messages_sendMedia.peer;
            } else if (tLObject3 instanceof TL_ephemeral.TL_sendMessage) {
                TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) tLObject3;
                inputMedia3 = tL_sendMessage.media;
                inputPeer2 = tL_sendMessage.peer;
            } else if (tLObject3 instanceof TLRPC.TL_messages_addPollAnswer) {
                TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer = (TLRPC.TL_messages_addPollAnswer) tLObject3;
                inputMedia3 = tL_messages_addPollAnswer.answer.input_media;
                inputPeer2 = tL_messages_addPollAnswer.peer;
            } else {
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) tLObject3;
                inputMedia3 = tL_messages_editMessage.media;
                inputPeer2 = tL_messages_editMessage.peer;
            }
            if (inputMedia3 instanceof TLRPC.TL_inputMediaPaidMedia) {
                TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) inputMedia3;
                if (!tL_inputMediaPaidMedia.extended_media.isEmpty()) {
                    inputMedia3 = tL_inputMediaPaidMedia.extended_media.get(0);
                }
            }
            if ((inputMedia3 instanceof TLRPC.TL_inputMediaPoll) && (d = ih8.d((TLRPC.TL_inputMediaPoll) inputMedia3)) != null) {
                inputMedia3 = d;
            }
            TLRPC.InputFile inputFile3 = inputMedia3.file;
            if (inputFile3 == null && !(inputMedia3 instanceof TLRPC.TL_inputMediaDocument) && d7aVar2.p) {
                r47 r47Var5 = d7aVar2.m;
                String str6 = r47Var5.k.attachPath;
                TLRPC.Document F05 = r47Var5.F0();
                TLRPC.TL_document tL_document = d7aVar2.m.E1;
                if (tL_document != null) {
                    F05 = tL_document;
                }
                if (str6 == null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(xb4.z(i2));
                    sb3.append("/");
                    str6 = qu6.p(sb3, F05.id, ".mp4");
                }
                String str7 = str6;
                r7aVar.d0(str7, d7aVar2);
                oec oecVar5 = d7aVar2.m.r0;
                if (oecVar5 != null) {
                    if (!oecVar5.O) {
                        if (oecVar5.b()) {
                            r7aVar.getFileLoader().g0(str7, false, false, F05.size, 33554432, false);
                        }
                    }
                    r7aVar.g0(d7aVar2.m);
                    return;
                }
                r7aVar.getFileLoader().h0(false, 33554432, str7, false);
                r7aVar.g0(d7aVar2.m);
                return;
            }
            TLRPC.InputPhoto inputPhoto = inputMedia3.video_cover;
            if (inputPhoto == null && d7aVar2.j == null && d7aVar2.i != null && d7aVar2.q) {
                String str8 = xb4.z(i2) + "/" + d7aVar2.i.location.volume_id + "_" + d7aVar2.i.location.local_id + ".jpg";
                r7aVar.d0(str8, d7aVar2);
                r7aVar.getFileLoader().h0(false, 16777216, str8, true);
                r7aVar.g0(d7aVar2.m);
                return;
            }
            if (d7aVar2.k && (inputMedia3 instanceof TLRPC.TL_inputMediaUploadedDocument) && inputFile3 != null && d7aVar2.j != null) {
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia.peer = inputPeer2;
                inputMedia3.flags &= -65;
                inputMedia3.video_cover = null;
                tL_messages_uploadMedia.media = inputMedia3;
                r7aVar.getConnectionsManager().sendRequest(tL_messages_uploadMedia, new jk3(r7aVar, d7aVar2, inputMedia3.spoiler, inputMedia3.ttl_seconds));
                return;
            }
            if (inputPhoto == null && d7aVar2.j != null && d7aVar2.q) {
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia2 = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia2.peer = inputPeer2;
                TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                tL_inputMediaUploadedPhoto.file = d7aVar2.j;
                tL_messages_uploadMedia2.media = tL_inputMediaUploadedPhoto;
                r7aVar.getConnectionsManager().sendRequest(tL_messages_uploadMedia2, new e6a(r7aVar, inputMedia3, d7aVar2, z ? 1 : 0));
                return;
            }
            r47 r47Var6 = d7aVar2.m;
            String str9 = xb4.z(i2) + "/" + d7aVar2.g.location.volume_id + "_" + d7aVar2.g.location.local_id + "." + ((r47Var6 == null || (oecVar = r47Var6.r0) == null || !oecVar.N) ? "jpg" : "webp");
            r7aVar.d0(str9, d7aVar2);
            r7aVar.getFileLoader().h0(false, 16777216, str9, true);
            r7aVar.g0(d7aVar2.m);
            return;
        }
        if (b == 2) {
            String str10 = d7aVar2.l;
            if (str10 != null) {
                r7aVar.d0(str10, d7aVar2);
                in5.z().H(r7aVar.currentAccount, d7aVar2.l, "gif");
                return;
            }
            TLObject tLObject4 = d7aVar2.c;
            if (tLObject4 != null) {
                TLRPC.InputMedia inputMedia4 = tLObject4 instanceof TLRPC.TL_messages_sendMedia ? ((TLRPC.TL_messages_sendMedia) tLObject4).media : tLObject4 instanceof TL_ephemeral.TL_sendMessage ? ((TL_ephemeral.TL_sendMessage) tLObject4).media : tLObject4 instanceof TLRPC.TL_messages_addPollAnswer ? ((TLRPC.TL_messages_addPollAnswer) tLObject4).answer.input_media : ((TLRPC.TL_messages_editMessage) tLObject4).media;
                if (inputMedia4.file == null) {
                    String str11 = d7aVar2.m.k.attachPath;
                    r7aVar.d0(str11, d7aVar2);
                    r7aVar.getFileLoader().h0(d7aVar2.c == null, 67108864, str11, false);
                    r7aVar.g0(d7aVar2.m);
                    return;
                }
                if (inputMedia4.thumb != null || (photoSize2 = d7aVar2.g) == null || (photoSize2 instanceof TLRPC.TL_photoStrippedSize)) {
                    return;
                }
                String str12 = xb4.z(4) + "/" + d7aVar2.g.location.volume_id + "_" + d7aVar2.g.location.local_id + ".jpg";
                r7aVar.d0(str12, d7aVar2);
                r7aVar.getFileLoader().h0(false, 16777216, str12, true);
                r7aVar.g0(d7aVar2.m);
                return;
            }
            r47 r47Var7 = d7aVar2.m;
            String str13 = r47Var7.k.attachPath;
            TLRPC.Document F06 = r47Var7.F0();
            if (d7aVar2.d != null && F06.dc_id != 0) {
                File file5 = new File(str13);
                if (!file5.exists()) {
                    xb4 fileLoader4 = r7aVar.getFileLoader();
                    TLRPC.Message message5 = d7aVar2.m.k;
                    fileLoader4.getClass();
                    file5 = xb4.M(message5, false, true);
                    if (file5 != null && file5.exists()) {
                        TLRPC.Message message6 = d7aVar2.m.k;
                        String absolutePath4 = file5.getAbsolutePath();
                        message6.attachPath = absolutePath4;
                        d7aVar2.m.y0 = true;
                        str13 = absolutePath4;
                    }
                }
                if (file5 == null || (!file5.exists() && d7aVar2.m.F0() != null)) {
                    xb4 fileLoader5 = r7aVar.getFileLoader();
                    TLRPC.Document F07 = d7aVar2.m.F0();
                    fileLoader5.getClass();
                    file5 = xb4.J(F07, null, false, true);
                    if (file5 != null && file5.exists()) {
                        TLRPC.Message message7 = d7aVar2.m.k;
                        String absolutePath5 = file5.getAbsolutePath();
                        message7.attachPath = absolutePath5;
                        d7aVar2.m.y0 = true;
                        str13 = absolutePath5;
                    }
                }
                if (file5 == null || (!file5.exists() && d7aVar2.m.F0() != null)) {
                    xb4 fileLoader6 = r7aVar.getFileLoader();
                    TLRPC.Document F08 = d7aVar2.m.F0();
                    fileLoader6.getClass();
                    file5 = xb4.J(F08, null, true, true);
                    if (file5 != null && file5.exists()) {
                        TLRPC.Message message8 = d7aVar2.m.k;
                        String absolutePath6 = file5.getAbsolutePath();
                        message8.attachPath = absolutePath6;
                        d7aVar2.m.y0 = true;
                        str13 = absolutePath6;
                    }
                }
                if (file5 == null || !file5.exists()) {
                    r7aVar.d0(xb4.r(null, F06), d7aVar2);
                    r7aVar.getFileLoader().X(F06, d7aVar2.K, 3, 0);
                    return;
                }
            }
            r7aVar.d0(str13, d7aVar2);
            r7aVar.getFileLoader().h0(true, 67108864, str13, false);
            r7aVar.g0(d7aVar2.m);
            return;
        }
        if (b == 3) {
            String str14 = d7aVar2.m.k.attachPath;
            r7aVar.d0(str14, d7aVar2);
            r7aVar.getFileLoader().h0(d7aVar2.c == null, ConnectionsManager.FileTypeAudio, str14, true);
            r7aVar.g0(d7aVar2.m);
            return;
        }
        if (b != 4) {
            if (b == 5) {
                String str15 = "stickerset_" + d7aVar2.m.e1();
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = (TLRPC.InputStickerSet) d7aVar2.K;
                r7aVar.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new qn8((Object) r7aVar, (Object) d7aVar2, (Object) str15, (byte) 8));
                r7aVar.d0(str15, d7aVar2);
                return;
            }
            return;
        }
        boolean z2 = i < 0;
        if (d7aVar2.p || d7aVar2.q) {
            int size = i < 0 ? d7aVar2.x.size() - 1 : i;
            r47 r47Var8 = (r47) d7aVar2.x.get(size);
            TLRPC.Document F09 = r47Var8.F0();
            if (F09 == null && (r47.m1(r47Var8) instanceof TLRPC.TL_messageMediaPaidMedia)) {
                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) r47.m1(r47Var8);
                TLRPC.MessageExtendedMedia messageExtendedMedia = size >= tL_messageMediaPaidMedia.extended_media.size() ? null : tL_messageMediaPaidMedia.extended_media.get(size);
                TLRPC.MessageMedia messageMedia = messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia ? ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media : null;
                F09 = messageMedia == null ? null : messageMedia.document;
            }
            if (F09 == null && (r47.m1(r47Var8) instanceof TLRPC.TL_messageMediaPoll)) {
                TLRPC.MessageMedia f = ih8.f((TLRPC.TL_messageMediaPoll) r47.m1(r47Var8), ((Integer) d7aVar2.C.get(size)).intValue());
                F09 = f == null ? null : f.document;
            }
            if (F09 != null) {
                oec oecVar6 = d7aVar2.o;
                if (oecVar6 != null && oecVar6.b() && d7aVar2.p) {
                    String str16 = r47Var8.k.attachPath;
                    if (str16 == null) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(xb4.z(4));
                        sb4.append("/");
                        str16 = qu6.p(sb4, F09.id, ".mp4");
                    }
                    r7aVar.d0(str16, d7aVar2);
                    d7aVar2.E.put(r47Var8, str16);
                    d7aVar2.E.put(str16.concat("_i"), r47Var8);
                    TLRPC.PhotoSize photoSize4 = d7aVar2.g;
                    if (photoSize4 != null && photoSize4.location != null) {
                        d7aVar2.E.put(str16.concat("_t"), d7aVar2.g);
                    }
                    TLRPC.PhotoSize photoSize5 = d7aVar2.i;
                    if (photoSize5 != null && photoSize5.location != null) {
                        d7aVar2.E.put(str16.concat("_ct"), d7aVar2.i);
                    }
                    d7aVar2.o.getClass();
                    MediaController.z().j0(r47Var8, false, true, false);
                    d7aVar2.m = r47Var8;
                    r7aVar.g0(r47Var8);
                } else {
                    String str17 = r47Var8.k.attachPath;
                    if (str17 == null) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(xb4.z(4));
                        sb5.append("/");
                        str = "_i";
                        str17 = qu6.p(sb5, F09.id, ".mp4");
                    } else {
                        str = "_i";
                    }
                    TLObject tLObject5 = d7aVar2.c;
                    if (tLObject5 != null) {
                        if (tLObject5 instanceof TLRPC.TL_messages_sendMultiMedia) {
                            TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject5;
                            inputPeer = tL_messages_sendMultiMedia.peer;
                            inputMedia = tL_messages_sendMultiMedia.multi_media.get(size).media;
                        } else if (tLObject5 instanceof TLRPC.TL_messages_sendMedia) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject5;
                            inputPeer = tL_messages_sendMedia2.peer;
                            TLRPC.InputMedia inputMedia5 = tL_messages_sendMedia2.media;
                            if (inputMedia5 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                inputMedia = ((TLRPC.TL_inputMediaPaidMedia) inputMedia5).extended_media.get(size);
                            } else {
                                if (inputMedia5 instanceof TLRPC.TL_inputMediaPoll) {
                                    inputMedia = ih8.e((TLRPC.TL_inputMediaPoll) inputMedia5, ((Integer) d7aVar2.C.get(size)).intValue());
                                }
                                inputMedia = null;
                            }
                        } else if (tLObject5 instanceof TL_ephemeral.TL_sendMessage) {
                            TL_ephemeral.TL_sendMessage tL_sendMessage2 = (TL_ephemeral.TL_sendMessage) tLObject5;
                            inputPeer = tL_sendMessage2.peer;
                            TLRPC.InputMedia inputMedia6 = tL_sendMessage2.media;
                            if (inputMedia6 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                inputMedia = ((TLRPC.TL_inputMediaPaidMedia) inputMedia6).extended_media.get(size);
                            } else {
                                if (inputMedia6 instanceof TLRPC.TL_inputMediaPoll) {
                                    inputMedia = ih8.e((TLRPC.TL_inputMediaPoll) inputMedia6, ((Integer) d7aVar2.C.get(size)).intValue());
                                }
                                inputMedia = null;
                            }
                        } else {
                            inputMedia = null;
                            inputPeer = null;
                        }
                        if (inputMedia == null || inputMedia.file != null || (inputMedia instanceof TLRPC.TL_inputMediaDocument) || !d7aVar2.p) {
                            String str18 = str;
                            String str19 = str17;
                            TLRPC.PhotoSize photoSize6 = d7aVar2.i;
                            if (photoSize6 != null) {
                                photoSize = photoSize6;
                                if (d7aVar2.j == null && inputMedia != null && inputMedia.video_cover == null) {
                                    StringBuilder sb6 = new StringBuilder();
                                    sb6.append(xb4.z(4));
                                    sb6.append("/");
                                    TLRPC.InputMedia inputMedia7 = inputMedia;
                                    sb6.append(d7aVar2.i.location.volume_id);
                                    sb6.append("_");
                                    sb6.append(d7aVar2.i.location.local_id);
                                    sb6.append(".jpg");
                                    String sb7 = sb6.toString();
                                    r7aVar.d0(sb7, d7aVar2);
                                    TLRPC.PhotoSize photoSize7 = d7aVar2.i;
                                    if (photoSize7 != null && photoSize7.location != null) {
                                        StringBuilder sb8 = new StringBuilder();
                                        sb8.append(xb4.z(4));
                                        sb8.append("/");
                                        sb8.append(d7aVar2.i.location.volume_id);
                                        sb8.append("_");
                                        String l = uh9.l(sb8, d7aVar2.i.location.local_id, ".jpg");
                                        d7aVar2.E.put(str19.concat("_ct"), d7aVar2.i);
                                        d7aVar2.E.put(l.concat("_doc"), str19);
                                    }
                                    d7aVar2.E.put(sb7.concat("_o"), str19);
                                    d7aVar2.E.put(str19.concat(str18), r47Var8);
                                    d7aVar2.E.put(r47Var8, sb7);
                                    d7aVar2.E.put(sb7, inputMedia7);
                                    r7aVar.getFileLoader().h0(false, 16777216, sb7, true);
                                    r7aVar.g0(r47Var8);
                                } else {
                                    inputMedia2 = inputMedia;
                                    r47Var = r47Var8;
                                }
                            } else {
                                inputMedia2 = inputMedia;
                                r47Var = r47Var8;
                                photoSize = photoSize6;
                            }
                            if (photoSize != null && d7aVar2.j != null && inputMedia2 != null && inputMedia2.video_cover == null && (inputMedia2 instanceof TLRPC.TL_inputMediaUploadedDocument) && inputMedia2.file != null && (d7aVar2.c instanceof TLRPC.TL_messages_sendMultiMedia) && (arrayList = d7aVar2.D) != null && size >= 0 && size < arrayList.size() && Boolean.TRUE.equals(d7aVar2.D.get(size))) {
                                TLRPC.InputFile inputFile4 = d7aVar2.j;
                                inputMedia2.flags &= -65;
                                inputMedia2.video_cover = null;
                                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia3 = new TLRPC.TL_messages_uploadMedia();
                                tL_messages_uploadMedia3.peer = inputPeer;
                                tL_messages_uploadMedia3.media = inputMedia2;
                                d7aVar2 = d7aVar;
                                r7aVar.getConnectionsManager().sendRequest(tL_messages_uploadMedia3, new rt(r7aVar, inputFile4, (TLRPC.TL_inputMediaUploadedDocument) inputMedia2, d7aVar, size, str19));
                                r7aVar = this;
                            } else if (d7aVar2.i == null || d7aVar2.j == null || inputMedia2 == null || inputMedia2.video_cover != null) {
                                r7aVar = this;
                                TLRPC.InputMedia inputMedia8 = inputMedia2;
                                if (d7aVar2.g != null) {
                                    String str20 = xb4.z(4) + "/" + d7aVar2.g.location.volume_id + "_" + d7aVar2.g.location.local_id + ".jpg";
                                    r7aVar.d0(str20, d7aVar2);
                                    d7aVar2.E.put(str20.concat("_o"), str19);
                                    d7aVar2.E.put(r47Var, str20);
                                    d7aVar2.E.put(str20, inputMedia8);
                                    r7aVar.getFileLoader().h0(false, 16777216, str20, true);
                                    r7aVar.g0(r47Var);
                                }
                            } else {
                                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia4 = new TLRPC.TL_messages_uploadMedia();
                                tL_messages_uploadMedia4.peer = inputPeer;
                                TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto2 = new TLRPC.TL_inputMediaUploadedPhoto();
                                tL_inputMediaUploadedPhoto2.file = d7aVar2.j;
                                tL_messages_uploadMedia4.media = tL_inputMediaUploadedPhoto2;
                                r7aVar = this;
                                getConnectionsManager().sendRequest(tL_messages_uploadMedia4, new in0((Object) r7aVar, (Object) inputMedia2, (Object) d7aVar2, (Object) str19, (Object) r47Var, (byte) 16));
                            }
                        } else {
                            r7aVar.d0(str17, d7aVar2);
                            d7aVar2.E.put(r47Var8, str17);
                            d7aVar2.E.put(str17, inputMedia);
                            d7aVar2.E.put(str17.concat(str), r47Var8);
                            TLRPC.PhotoSize photoSize8 = d7aVar2.g;
                            if (photoSize8 != null && photoSize8.location != null) {
                                d7aVar2.E.put(str17.concat("_t"), d7aVar2.g);
                            }
                            TLRPC.PhotoSize photoSize9 = d7aVar2.i;
                            if (photoSize9 != null && photoSize9.location != null) {
                                StringBuilder sb9 = new StringBuilder();
                                sb9.append(xb4.z(4));
                                sb9.append("/");
                                sb9.append(d7aVar2.i.location.volume_id);
                                sb9.append("_");
                                String l2 = uh9.l(sb9, d7aVar2.i.location.local_id, ".jpg");
                                d7aVar2.E.put(str17.concat("_ct"), d7aVar2.i);
                                d7aVar2.E.put(l2.concat("_doc"), str17);
                            }
                            oec oecVar7 = r47Var8.r0;
                            if (oecVar7 == null || !oecVar7.b()) {
                                r7aVar.getFileLoader().h0(false, 33554432, str17, false);
                            } else {
                                r7aVar.getFileLoader().g0(str17, false, false, F09.size, 33554432, false);
                            }
                            r7aVar.g0(r47Var8);
                        }
                    } else {
                        String str21 = str17;
                        TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia = (TLRPC.TL_messages_sendEncryptedMultiMedia) d7aVar2.d;
                        r7aVar.d0(str21, d7aVar2);
                        d7aVar2.E.put(r47Var8, str21);
                        d7aVar2.E.put(str21, tL_messages_sendEncryptedMultiMedia.files.get(size));
                        d7aVar2.E.put(str21.concat(str), r47Var8);
                        TLRPC.PhotoSize photoSize10 = d7aVar2.g;
                        if (photoSize10 != null && photoSize10.location != null) {
                            d7aVar2.E.put(str21.concat("_t"), d7aVar2.g);
                        }
                        oec oecVar8 = r47Var8.r0;
                        if (oecVar8 == null || !oecVar8.b()) {
                            r7aVar.getFileLoader().h0(true, 33554432, str21, false);
                        } else {
                            r7aVar.getFileLoader().g0(str21, true, false, F09.size, 33554432, false);
                        }
                        r7aVar.g0(r47Var8);
                    }
                }
                inputFile = null;
                d7aVar2.o = null;
                d7aVar2.g = null;
                d7aVar2.i = null;
            } else {
                String str22 = d7aVar2.l;
                if (str22 != null) {
                    r7aVar.d0(str22, d7aVar2);
                    d7aVar2.E.put(r47Var8, d7aVar2.l);
                    d7aVar2.E.put(d7aVar2.l, r47Var8);
                    in5.z().H(r7aVar.currentAccount, d7aVar2.l, "file");
                    inputFile = null;
                    d7aVar2.l = null;
                } else {
                    TLObject tLObject6 = d7aVar2.c;
                    if (tLObject6 instanceof TLRPC.TL_messages_sendMultiMedia) {
                        inputEncryptedFile = ((TLRPC.TL_messages_sendMultiMedia) tLObject6).multi_media.get(size).media;
                    } else {
                        if (tLObject6 instanceof TLRPC.TL_messages_sendMedia) {
                            TLRPC.InputMedia inputMedia9 = ((TLRPC.TL_messages_sendMedia) tLObject6).media;
                            if (inputMedia9 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                inputEncryptedFile = ((TLRPC.TL_inputMediaPaidMedia) inputMedia9).extended_media.get(size);
                            } else {
                                TLRPC.InputMedia inputMedia10 = ((TLRPC.TL_messages_sendMedia) tLObject6).media;
                                if (inputMedia10 instanceof TLRPC.TL_inputMediaPoll) {
                                    inputEncryptedFile = ih8.e((TLRPC.TL_inputMediaPoll) inputMedia10, ((Integer) d7aVar2.C.get(size)).intValue());
                                }
                            }
                        }
                        if (tLObject6 instanceof TL_ephemeral.TL_sendMessage) {
                            TLRPC.InputMedia inputMedia11 = ((TL_ephemeral.TL_sendMessage) tLObject6).media;
                            if (inputMedia11 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                inputEncryptedFile = ((TLRPC.TL_inputMediaPaidMedia) inputMedia11).extended_media.get(size);
                            } else {
                                TLRPC.InputMedia inputMedia12 = ((TL_ephemeral.TL_sendMessage) tLObject6).media;
                                if (inputMedia12 instanceof TLRPC.TL_inputMediaPoll) {
                                    inputEncryptedFile = ih8.e((TLRPC.TL_inputMediaPoll) inputMedia12, ((Integer) d7aVar2.C.get(size)).intValue());
                                }
                            }
                        }
                        inputEncryptedFile = ((TLRPC.TL_messages_sendEncryptedMultiMedia) d7aVar2.d).files.get(size);
                    }
                    xb4.G(r7aVar.currentAccount);
                    String file6 = xb4.I(d7aVar2.g).toString();
                    r7aVar.d0(file6, d7aVar2);
                    d7aVar2.E.put(file6, inputEncryptedFile);
                    d7aVar2.E.put(r47Var8, file6);
                    r7aVar.getFileLoader().h0(d7aVar2.d != null, 16777216, file6, true);
                    r7aVar.g0(r47Var8);
                    inputFile = null;
                    d7aVar2.g = null;
                }
            }
            d7aVar2.j = inputFile;
            d7aVar2.p = false;
            d7aVar2.q = false;
        } else if (!d7aVar2.x.isEmpty()) {
            r7aVar.e0(((r47) c00.g(1, d7aVar2.x)).k, d7aVar2.G != 0);
        }
        r7aVar.s0(d7aVar2, z2);
    }

    public final void M(TLObject tLObject, r47 r47Var, String str, d7a d7aVar, Object obj, HashMap hashMap, boolean z) {
        N(tLObject, r47Var, str, null, false, d7aVar, obj, hashMap, z);
    }

    public final void N(TLObject tLObject, final r47 r47Var, final String str, final d7a d7aVar, final boolean z, final d7a d7aVar2, final Object obj, final HashMap hashMap, final boolean z2) {
        d7a x;
        ArrayList arrayList;
        TLObject tLObject2 = tLObject;
        if (tLObject2 instanceof TLRPC.TL_messages_addPollAnswer) {
            TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer = (TLRPC.TL_messages_addPollAnswer) tLObject;
            TLRPC.InputMedia inputMedia = tL_messages_addPollAnswer.answer.input_media;
            if ((inputMedia instanceof TLRPC.TL_inputMediaUploadedDocument) || (inputMedia instanceof TLRPC.TL_inputMediaUploadedPhoto)) {
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia.peer = tL_messages_addPollAnswer.peer;
                tL_messages_uploadMedia.media = tL_messages_addPollAnswer.answer.input_media;
                getConnectionsManager().sendRequest(tL_messages_uploadMedia, new l6a(this, tL_messages_addPollAnswer, tLObject, r47Var, str, d7aVar, z, d7aVar2, obj, hashMap, z2));
                return;
            }
            tLObject2 = tLObject;
        }
        if (!(tLObject2 instanceof TLRPC.TL_messages_editMessage) && z && (x = x(r47Var.e1(), r47.B0(r47Var.k))) != null) {
            boolean z3 = d7aVar != null ? d7aVar.H : false;
            e7a e7aVar = new e7a();
            e7aVar.a = tLObject2;
            e7aVar.b = r47Var;
            e7aVar.d = str;
            e7aVar.g = d7aVar2;
            e7aVar.h = obj;
            e7aVar.i = z3;
            ArrayList arrayList2 = x.b;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                x.b = arrayList2;
            }
            arrayList2.add(e7aVar);
            if (d7aVar == null || (arrayList = d7aVar.b) == null) {
                return;
            }
            x.b.addAll(arrayList);
            return;
        }
        TLRPC.Message message = r47Var.k;
        e0(message, z2);
        jxa v = jxa.v(this.currentAccount, false);
        n5a n5aVar = new n5a(this, tLObject2, r47Var, str, d7aVar, z, d7aVar2, obj, hashMap, z2, (byte) 1);
        if (r47Var.k != null) {
            int e1 = r47Var.e1();
            if (jxa.l(tLObject) > 0 && v.Q.remove(Integer.valueOf(e1))) {
                v.R.put(Integer.valueOf(e1), n5aVar);
                return;
            }
        }
        if (wp0.b(this.currentAccount).a(tLObject, Collections.singletonList(r47Var), new n5a(this, tLObject, r47Var, str, d7aVar, z, d7aVar2, obj, hashMap, z2, (byte) 2))) {
            if (o44.g(this.currentAccount).a(tLObject, Collections.singletonList(r47Var), new pcc() { // from class: m6a
                @Override // pcc
                public final void a(Object obj2) {
                    boolean z4 = z2;
                    r7a.this.N((TLObject) obj2, r47Var, str, d7aVar, z, d7aVar2, obj, hashMap, z4);
                }
            })) {
                message.reqId = getConnectionsManager().sendRequest(tLObject, new l6a(this, tLObject, r47Var, str, d7aVar, z, d7aVar2, obj, hashMap, z2, message), new yw9(this, message, (byte) 4), (tLObject instanceof TLRPC.TL_messages_sendMessage ? 128 : 0) | 68);
                if (d7aVar != null) {
                    d7aVar.d();
                }
            }
        }
    }

    public final void O(final TLObject tLObject, final ArrayList arrayList, final ArrayList arrayList2, final ArrayList arrayList3, final d7a d7aVar, final boolean z) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            e0(((r47) arrayList.get(i)).k, z);
        }
        final byte b = 0;
        if (jxa.v(this.currentAccount, false).a(tLObject, arrayList, new Runnable(this) { // from class: t5a
            public final /* synthetic */ r7a b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (b) {
                    case 0:
                        this.b.O(tLObject, arrayList, arrayList2, arrayList3, d7aVar, z);
                        break;
                    default:
                        this.b.O(tLObject, arrayList, arrayList2, arrayList3, d7aVar, z);
                        break;
                }
            }
        })) {
            final byte b2 = 1;
            if (wp0.b(this.currentAccount).a(tLObject, arrayList, new Runnable(this) { // from class: t5a
                public final /* synthetic */ r7a b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (b2) {
                        case 0:
                            this.b.O(tLObject, arrayList, arrayList2, arrayList3, d7aVar, z);
                            break;
                        default:
                            this.b.O(tLObject, arrayList, arrayList2, arrayList3, d7aVar, z);
                            break;
                    }
                }
            }) && o44.g(this.currentAccount).a(tLObject, arrayList, new cp8(this, arrayList, arrayList2, arrayList3, d7aVar, z))) {
                getConnectionsManager().sendRequest(tLObject, new h17(this, arrayList3, tLObject, arrayList, arrayList2, d7aVar, z), (QuickAckDelegate) null, 68);
            }
        }
    }

    public final void P(long j, Uri uri, ArrayList arrayList, e16 e16Var) {
        if (this.E.f(j) != null) {
            e16Var.run(0L);
            return;
        }
        if (wf3.y(j)) {
            long j2 = -j;
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j2));
            if (M0 != null && !M0.megagroup) {
                getMessagesController().R(null, j2, null, new pt((Object) this, (Object) uri, (Object) arrayList, (Object) e16Var, (byte) 22), null);
                return;
            }
        }
        new Thread(new da7((Object) this, (Object) arrayList, j, (Object) uri, (Object) e16Var, (byte) 14)).start();
    }

    public final void a(TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, long j) {
        if (j != 0) {
            TLRPC.InputPeer j1 = getMessagesController().j1(j);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_forwardMessages.reply_to;
            if (inputReplyTo == null) {
                TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                tL_messages_forwardMessages.reply_to = tL_inputReplyToMonoForum;
                tL_inputReplyToMonoForum.monoforum_peer_id = j1;
            } else if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                inputReplyTo.monoforum_peer_id = j1;
                inputReplyTo.flags |= 32;
            }
        }
    }

    public final void b(TLRPC.TL_messages_sendInlineBotResult tL_messages_sendInlineBotResult, long j) {
        if (j != 0) {
            TLRPC.InputPeer j1 = getMessagesController().j1(j);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_sendInlineBotResult.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = j1;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_sendInlineBotResult.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = j1;
            tL_messages_sendInlineBotResult.flags |= 1;
        }
    }

    public final void b0(r47 r47Var, long j, long j2, long j3, b77 b77Var) {
        if (r47Var != null) {
            TLRPC.Message message = r47Var.k;
            TLRPC.MessageMedia messageMedia = message.media;
            ArrayList arrayList = null;
            r4 = null;
            r4 = null;
            HashMap hashMap = null;
            arrayList = null;
            if (messageMedia == null || (messageMedia instanceof TLRPC.TL_messageMediaEmpty) || (messageMedia instanceof TLRPC.TL_messageMediaWebPage) || (messageMedia instanceof TLRPC.TL_messageMediaGame) || (messageMedia instanceof TLRPC.TL_messageMediaInvoice)) {
                if (message.message == null) {
                    if (wf3.B(j)) {
                        p0(qd4.t(r47Var), j, true, false, true, 0, 0, null, -1, j2, j3, b77Var);
                        return;
                    }
                    return;
                }
                TLRPC.WebPage webPage = messageMedia instanceof TLRPC.TL_messageMediaWebPage ? messageMedia.webpage : null;
                ArrayList<TLRPC.MessageEntity> arrayList2 = message.entities;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList = new ArrayList();
                    for (int i = 0; i < r47Var.k.entities.size(); i++) {
                        TLRPC.MessageEntity messageEntity = r47Var.k.entities.get(i);
                        if ((messageEntity instanceof TLRPC.TL_messageEntityBold) || (messageEntity instanceof TLRPC.TL_messageEntityItalic) || (messageEntity instanceof TLRPC.TL_messageEntityPre) || (messageEntity instanceof TLRPC.TL_messageEntityCode) || (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) || (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) || (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                            arrayList.add(messageEntity);
                        }
                    }
                }
                p7a b = p7a.b(r47Var.k.message, j, r47Var.C, null, webPage, true, arrayList, null, null, true, 0, 0, null, false);
                b.Q = j2;
                b.R = j3;
                b.T = b77Var;
                q0(b);
                return;
            }
            if (wf3.B(j)) {
                TLRPC.Message message2 = r47Var.k;
                if (message2.peer_id != null) {
                    TLRPC.MessageMedia messageMedia2 = message2.media;
                    if ((messageMedia2.photo instanceof TLRPC.TL_photo) || (messageMedia2.document instanceof TLRPC.TL_document)) {
                        hashMap = new HashMap();
                        hashMap.put("parentObject", "sent_" + r47Var.k.peer_id.channel_id + "_" + r47Var.e1() + "_" + r47.B0(r47Var.k) + "_" + r47Var.D + "_" + r47Var.S1());
                    }
                }
            }
            HashMap hashMap2 = hashMap;
            TLRPC.Message message3 = r47Var.k;
            TLRPC.MessageMedia messageMedia3 = message3.media;
            TLRPC.Photo photo = messageMedia3.photo;
            if (photo instanceof TLRPC.TL_photo) {
                p7a c = p7a.c(null, message3.message, null, (TLRPC.TL_photo) photo, null, null, null, null, null, null, j, null, r47Var.C, null, null, true, null, message3.entities, null, hashMap2, true, 0, 0, messageMedia3.ttl_seconds, r47Var, null, false, false);
                c.Q = j2;
                c.R = j3;
                c.T = b77Var;
                q0(c);
                return;
            }
            TLRPC.Document document = messageMedia3.document;
            if (document instanceof TLRPC.TL_document) {
                p7a f = p7a.f((TLRPC.TL_document) document, null, message3.attachPath, j, r47Var.C, null, message3.message, message3.entities, null, hashMap2, true, 0, 0, messageMedia3.ttl_seconds, r47Var, null, false);
                f.Q = j2;
                f.R = j3;
                f.T = b77Var;
                q0(f);
                return;
            }
            if ((messageMedia3 instanceof TLRPC.TL_messageMediaVenue) || (messageMedia3 instanceof TLRPC.TL_messageMediaGeo)) {
                p7a d = p7a.d(messageMedia3, j, r47Var.C, null, null, null, true, 0);
                d.Q = j2;
                d.R = j3;
                d.T = b77Var;
                q0(d);
                return;
            }
            if (messageMedia3.phone_number == null) {
                if (wf3.B(j)) {
                    return;
                }
                p0(qd4.t(r47Var), j, true, false, true, 0, 0, null, -1, j2, j3, b77Var);
                return;
            }
            TLRPC.TL_userContact_old2 tL_userContact_old2 = new TLRPC.TL_userContact_old2();
            TLRPC.MessageMedia messageMedia4 = r47Var.k.media;
            tL_userContact_old2.phone = messageMedia4.phone_number;
            tL_userContact_old2.first_name = messageMedia4.first_name;
            tL_userContact_old2.last_name = messageMedia4.last_name;
            tL_userContact_old2.id = messageMedia4.user_id;
            p7a g = p7a.g(tL_userContact_old2, j, r47Var.C, null, null, null, true, 0, 0);
            g.R = j3;
            g.T = b77Var;
            g.Q = j2;
            q0(g);
        }
    }

    public final void c(TLRPC.TL_messages_sendMedia tL_messages_sendMedia, long j) {
        if (j != 0) {
            TLRPC.InputPeer j1 = getMessagesController().j1(j);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_sendMedia.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = j1;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_sendMedia.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = j1;
            tL_messages_sendMedia.flags |= 1;
        }
    }

    public final void c0(int i) {
        SparseArray sparseArray = this.b;
        int size = sparseArray.size();
        sparseArray.remove(i);
        if (size == 0 || sparseArray.size() != 0) {
            return;
        }
        jf7 messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new be7(messagesStorage, (byte) 22));
    }

    public final void d(TLRPC.TL_messages_sendMessage tL_messages_sendMessage, long j) {
        if (j != 0) {
            TLRPC.InputPeer j1 = getMessagesController().j1(j);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_sendMessage.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = j1;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_sendMessage.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = j1;
            tL_messages_sendMessage.flags |= 1;
        }
    }

    public final void d0(String str, d7a d7aVar) {
        HashMap hashMap = this.a;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(str, arrayList);
        }
        arrayList.add(d7aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:452:0x0a20, code lost:
    
        if (r1.F0() != null) goto L403;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:254:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0a27  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0a64  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0177  */
    @Override // fn7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        r47 r47Var;
        char c;
        ArrayList arrayList;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        k7a k7aVar;
        char c2;
        String str;
        m7a m7aVar;
        ArrayList arrayList2;
        TLRPC.InputMedia inputMedia;
        TLRPC.InputFile inputFile;
        String str2;
        int i8;
        String str3;
        String str4;
        TLRPC.InputEncryptedFile inputEncryptedFile;
        TLObject tLObject;
        int i9;
        TLRPC.TL_decryptedMessage tL_decryptedMessage;
        String str5;
        int i10;
        HashMap hashMap;
        HashMap hashMap2;
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize photoSize2;
        TLRPC.PhotoSize photoSize3;
        TLRPC.PhotoSize photoSize4;
        TLRPC.PhotoSize photoSize5;
        r47 r47Var2;
        oec oecVar;
        r7a r7aVar = this;
        int i11 = 0;
        boolean z = 1;
        if (i == jn7.W1) {
            String str6 = (String) objArr[0];
            i7a i7aVar = (i7a) r7aVar.y.get(str6);
            if (i7aVar != null) {
                i7aVar.a(str6, ((Long) objArr[1]).longValue(), r3.longValue() / ((Long) objArr[2]).longValue());
            }
            m7a m7aVar2 = (m7a) r7aVar.F.get(str6);
            if (m7aVar2 != null) {
                m7aVar2.a(str6, ((Long) objArr[1]).longValue(), r2.longValue() / ((Long) objArr[2]).longValue());
                return;
            }
            return;
        }
        String str7 = "_t";
        int i12 = -1;
        if (i != jn7.U1) {
            boolean z2 = true;
            if (i == jn7.V1) {
                String str8 = (String) objArr[0];
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                i7a i7aVar2 = (i7a) r7aVar.y.get(str8);
                if (i7aVar2 != null) {
                    r7a r7aVar2 = i7aVar2.q;
                    if (str8.equals(i7aVar2.a)) {
                        r7aVar2.E.l(i7aVar2.j);
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.code = 400;
                        tL_error.text = "IMPORT_UPLOAD_FAILED";
                        r7aVar2.getNotificationCenter().k(jn7.v1, Long.valueOf(i7aVar2.j), new TLRPC.TL_messages_initHistoryImport(), tL_error);
                    } else {
                        i7aVar2.c.remove(str8);
                    }
                }
                m7a m7aVar3 = (m7a) r7aVar.F.get(str8);
                if (m7aVar3 != null && (k7aVar = (k7a) m7aVar3.a.remove(str8)) != null) {
                    m7aVar3.d.remove(k7aVar);
                }
                ArrayList arrayList3 = (ArrayList) r7aVar.a.get(str8);
                if (arrayList3 != null) {
                    while (i7 < arrayList3.size()) {
                        d7a d7aVar = (d7a) arrayList3.get(i7);
                        if (booleanValue) {
                            i7 = d7aVar.d == null ? i7 + 1 : 0;
                            d7aVar.c();
                            arrayList3.remove(i7);
                            i7--;
                        } else {
                            if (d7aVar.c == null) {
                            }
                            d7aVar.c();
                            arrayList3.remove(i7);
                            i7--;
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        r7aVar.a.remove(str8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == jn7.a2) {
                r47 r47Var3 = (r47) objArr[0];
                if (r47Var3.e1() != 0) {
                    ArrayList arrayList4 = (ArrayList) r7aVar.a.get(r47Var3.k.attachPath);
                    if (arrayList4 != null) {
                        int i13 = 0;
                        while (true) {
                            if (i13 >= arrayList4.size()) {
                                break;
                            }
                            d7a d7aVar2 = (d7a) arrayList4.get(i13);
                            if (d7aVar2.e == 4) {
                                int indexOf = d7aVar2.x.indexOf(r47Var3);
                                d7aVar2.g = (TLRPC.PhotoSize) d7aVar2.E.get(r47Var3.k.attachPath + "_t");
                                if (d7aVar2.E.containsKey(r47Var3.k.attachPath + "_ct")) {
                                    d7aVar2.i = (TLRPC.PhotoSize) d7aVar2.E.get(r47Var3.k.attachPath + "_ct");
                                }
                                d7aVar2.p = z2;
                                r7aVar.L(d7aVar2, indexOf);
                                arrayList4.remove(i13);
                            } else {
                                if (d7aVar2.m == r47Var3) {
                                    d7aVar2.o = null;
                                    r7aVar.L(d7aVar2, -1);
                                    arrayList4.remove(i13);
                                    break;
                                }
                                i13++;
                                z2 = true;
                            }
                        }
                        if (arrayList4.isEmpty()) {
                            r7aVar.a.remove(r47Var3.k.attachPath);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == jn7.b2) {
                r47 r47Var4 = (r47) objArr[0];
                if (r47Var4.e1() != 0) {
                    String str9 = (String) objArr[1];
                    long longValue = ((Long) objArr[2]).longValue();
                    long longValue2 = ((Long) objArr[3]).longValue();
                    r7aVar.getFileLoader().n(str9, wf3.B(r47.B0(r47Var4.k)), longValue, longValue2, (Float) objArr[4]);
                    if (longValue2 == 0 || (arrayList = (ArrayList) r7aVar.a.get(r47Var4.k.attachPath)) == null) {
                        return;
                    }
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        d7a d7aVar3 = (d7a) arrayList.get(i14);
                        if (d7aVar3.e == 4) {
                            int i15 = 0;
                            while (true) {
                                if (i15 >= d7aVar3.x.size()) {
                                    break;
                                }
                                r47 r47Var5 = (r47) d7aVar3.x.get(i15);
                                if (r47Var5 == r47Var4) {
                                    d7aVar3.m.t0 = true;
                                    r47Var5.k.params.remove("ve");
                                    TLRPC.Document F0 = d7aVar3.m.F0();
                                    if (F0 != null) {
                                        F0.size = longValue2;
                                    }
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.add(r47Var5.k);
                                    if (r47.c5(r47Var5.k)) {
                                        i6 = 9;
                                        i5 = 0;
                                    } else if (r47.a4(r47Var5.k)) {
                                        i5 = r47.I1(r47Var5.k);
                                        i6 = 5;
                                    } else if (r47Var5.r1) {
                                        i5 = 0;
                                        i6 = 1;
                                    } else {
                                        i5 = 0;
                                        i6 = 0;
                                    }
                                    if ((!d7aVar3.I && !d7aVar3.J) || i15 == 0) {
                                        r7aVar.getMessagesStorage().g1(arrayList5, false, true, false, 0, false, i6, i5);
                                    }
                                } else {
                                    i15++;
                                }
                            }
                        } else {
                            r47 r47Var6 = d7aVar3.m;
                            if (r47Var6 == r47Var4) {
                                r47Var6.t0 = true;
                                r47Var6.k.params.remove("ve");
                                TLRPC.Document F02 = d7aVar3.m.F0();
                                if (F02 != null) {
                                    F02.size = longValue2;
                                }
                                ArrayList arrayList6 = new ArrayList();
                                arrayList6.add(d7aVar3.m.k);
                                if (r47.c5(d7aVar3.m.k)) {
                                    i4 = 9;
                                    i3 = 0;
                                } else {
                                    boolean a4 = r47.a4(d7aVar3.m.k);
                                    r47 r47Var7 = d7aVar3.m;
                                    if (a4) {
                                        i3 = r47.I1(r47Var7.k);
                                        i4 = 5;
                                    } else {
                                        i3 = 0;
                                        i4 = r47Var7.r1 ? 1 : 0;
                                    }
                                }
                                r7aVar.getMessagesStorage().g1(arrayList6, false, true, false, 0, false, i4, i3);
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (i == jn7.c2) {
                r47 r47Var8 = (r47) objArr[0];
                if (r47Var8.e1() != 0) {
                    String str10 = (String) objArr[1];
                    ArrayList arrayList7 = (ArrayList) r7aVar.a.get(str10);
                    if (arrayList7 != null) {
                        int i16 = 0;
                        while (i16 < arrayList7.size()) {
                            d7a d7aVar4 = (d7a) arrayList7.get(i16);
                            if (d7aVar4.e == 4) {
                                for (int i17 = 0; i17 < d7aVar4.z.size(); i17++) {
                                    if (d7aVar4.x.get(i17) == r47Var8) {
                                        d7aVar4.c();
                                        arrayList7.remove(i16);
                                        i16--;
                                        break;
                                    }
                                }
                                i16++;
                            } else if (d7aVar4.m == r47Var8) {
                                d7aVar4.c();
                                arrayList7.remove(i16);
                                i16--;
                                break;
                                i16++;
                            } else {
                                i16++;
                            }
                        }
                        if (arrayList7.isEmpty()) {
                            r7aVar.a.remove(str10);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (i != jn7.R1) {
                if (i == jn7.Y1) {
                    ArrayList arrayList8 = (ArrayList) r7aVar.a.remove((String) objArr[0]);
                    if (arrayList8 != null) {
                        for (int i18 = 0; i18 < arrayList8.size(); i18++) {
                            r7aVar.L((d7a) arrayList8.get(i18), -1);
                        }
                        return;
                    }
                    return;
                }
                if (i == jn7.S1 || i == jn7.Z1) {
                    String str11 = (String) objArr[0];
                    ArrayList arrayList9 = (ArrayList) r7aVar.a.get(str11);
                    if (arrayList9 != null) {
                        for (int i19 = 0; i19 < arrayList9.size(); i19++) {
                            ((d7a) arrayList9.get(i19)).c();
                        }
                        r7aVar.a.remove(str11);
                        return;
                    }
                    return;
                }
                return;
            }
            String str12 = (String) objArr[0];
            ArrayList arrayList10 = (ArrayList) r7aVar.a.get(str12);
            if (arrayList10 != null) {
                for (int i20 = 0; i20 < arrayList10.size(); i20++) {
                    d7a d7aVar5 = (d7a) arrayList10.get(i20);
                    byte b = d7aVar5.e;
                    if (b == 0) {
                        r47Var = d7aVar5.m;
                    } else {
                        if (b == 2) {
                            r47Var = d7aVar5.m;
                        } else if (b == 4) {
                            r47 r47Var9 = (r47) d7aVar5.E.get(str12);
                            r47Var = r47Var9;
                        } else {
                            r47Var = null;
                            c = 65535;
                            if (c == 0) {
                                r7aVar = this;
                                Utilities.e.c(new cp7((Object) this, (Object) new File(xb4.z(4), Utilities.a(str12) + "." + in5.x(str12, "file")), (Object) r47Var, (Object) d7aVar5, (Object) str12, (byte) 24));
                            } else if (c == 1) {
                                Utilities.e.c(new vp8(r7aVar, d7aVar5, new File(xb4.z(4), Utilities.a(str12) + ".gif"), r47Var));
                            }
                        }
                        c = 1;
                        if (c == 0) {
                        }
                    }
                    c = 0;
                    if (c == 0) {
                    }
                }
                r7aVar.a.remove(str12);
                return;
            }
            return;
        }
        String str13 = (String) objArr[0];
        TLRPC.InputFile inputFile2 = (TLRPC.InputFile) objArr[1];
        TLRPC.InputEncryptedFile inputEncryptedFile2 = (TLRPC.InputEncryptedFile) objArr[2];
        i7a i7aVar3 = (i7a) r7aVar.y.get(str13);
        if (i7aVar3 != null) {
            if (!str13.equals(i7aVar3.a)) {
                c2 = 5;
                str = "_ct";
                i7aVar3.a(str13, ((Long) objArr[5]).longValue(), 1.0f);
                TLRPC.TL_messages_uploadImportedMedia tL_messages_uploadImportedMedia = new TLRPC.TL_messages_uploadImportedMedia();
                tL_messages_uploadImportedMedia.peer = i7aVar3.g;
                tL_messages_uploadImportedMedia.import_id = i7aVar3.k;
                tL_messages_uploadImportedMedia.file_name = new File(str13).getName();
                MimeTypeMap singleton = MimeTypeMap.getSingleton();
                int lastIndexOf = tL_messages_uploadImportedMedia.file_name.lastIndexOf(46);
                String lowerCase = lastIndexOf != -1 ? tL_messages_uploadImportedMedia.file_name.substring(lastIndexOf + 1).toLowerCase() : "txt";
                String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(lowerCase);
                if (mimeTypeFromExtension == null) {
                    mimeTypeFromExtension = "opus".equals(lowerCase) ? "audio/opus" : "webp".equals(lowerCase) ? "image/webp" : "text/plain";
                }
                if (mimeTypeFromExtension.equals("image/jpg") || mimeTypeFromExtension.equals("image/jpeg")) {
                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                    tL_inputMediaUploadedPhoto.file = inputFile2;
                    tL_messages_uploadImportedMedia.media = tL_inputMediaUploadedPhoto;
                } else {
                    TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                    tL_inputMediaUploadedDocument.file = inputFile2;
                    tL_inputMediaUploadedDocument.mime_type = mimeTypeFromExtension;
                    tL_messages_uploadImportedMedia.media = tL_inputMediaUploadedDocument;
                }
                i7aVar3.q.getConnectionsManager().sendRequest(tL_messages_uploadImportedMedia, new g7a(i7aVar3, str13), 2);
                m7aVar = (m7a) r7aVar.F.get(str13);
                if (m7aVar != null) {
                    m7aVar.a(str13, ((Long) objArr[c2]).longValue(), 1.0f);
                    k7a k7aVar2 = (k7a) m7aVar.a.get(str13);
                    if (k7aVar2 != null) {
                        k7aVar2.a(m7aVar.o.currentAccount, inputFile2, new en9(m7aVar, str13, (byte) 25));
                    }
                }
                arrayList2 = (ArrayList) r7aVar.a.get(str13);
                if (arrayList2 == null) {
                    int i21 = 0;
                    while (i21 < arrayList2.size()) {
                        d7a d7aVar6 = (d7a) arrayList2.get(i21);
                        TLObject tLObject2 = d7aVar6.c;
                        if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                            inputMedia = ((TLRPC.TL_messages_sendMedia) tLObject2).media;
                            if (inputMedia instanceof TLRPC.TL_inputMediaPaidMedia) {
                                HashMap hashMap3 = d7aVar6.E;
                                inputMedia = hashMap3 == null ? ((TLRPC.TL_inputMediaPaidMedia) inputMedia).extended_media.get(i11) : (TLRPC.InputMedia) hashMap3.get(str13);
                            } else if (inputMedia instanceof TLRPC.TL_inputMediaPoll) {
                                HashMap hashMap4 = d7aVar6.E;
                                inputMedia = hashMap4 == null ? ih8.d((TLRPC.TL_inputMediaPoll) inputMedia) : (TLRPC.InputMedia) hashMap4.get(str13);
                            }
                        } else if (tLObject2 instanceof TL_ephemeral.TL_sendMessage) {
                            inputMedia = ((TL_ephemeral.TL_sendMessage) tLObject2).media;
                            if (inputMedia instanceof TLRPC.TL_inputMediaPaidMedia) {
                                HashMap hashMap5 = d7aVar6.E;
                                inputMedia = hashMap5 == null ? ((TLRPC.TL_inputMediaPaidMedia) inputMedia).extended_media.get(i11) : (TLRPC.InputMedia) hashMap5.get(str13);
                            } else if (inputMedia instanceof TLRPC.TL_inputMediaPoll) {
                                HashMap hashMap6 = d7aVar6.E;
                                inputMedia = hashMap6 == null ? ih8.d((TLRPC.TL_inputMediaPoll) inputMedia) : (TLRPC.InputMedia) hashMap6.get(str13);
                            }
                        } else {
                            inputMedia = tLObject2 instanceof TLRPC.TL_messages_editMessage ? ((TLRPC.TL_messages_editMessage) tLObject2).media : tLObject2 instanceof TLRPC.TL_messages_sendMultiMedia ? (TLRPC.InputMedia) d7aVar6.E.get(str13) : tLObject2 instanceof TLRPC.TL_messages_addPollAnswer ? ((TLRPC.TL_messages_addPollAnswer) tLObject2).answer.input_media : null;
                        }
                        if (inputFile2 == null || inputMedia == null) {
                            inputFile = inputFile2;
                            str2 = str7;
                            i8 = i11;
                            str3 = str;
                            str4 = str13;
                            TLRPC.InputEncryptedFile inputEncryptedFile3 = inputEncryptedFile2;
                            if (inputEncryptedFile3 == null || (tLObject = d7aVar6.d) == null) {
                                inputEncryptedFile = inputEncryptedFile3;
                            } else {
                                if (d7aVar6.e == 4) {
                                    TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia = (TLRPC.TL_messages_sendEncryptedMultiMedia) tLObject;
                                    TLRPC.InputEncryptedFile inputEncryptedFile4 = (TLRPC.InputEncryptedFile) d7aVar6.E.get(str4);
                                    int indexOf2 = tL_messages_sendEncryptedMultiMedia.files.indexOf(inputEncryptedFile4);
                                    if (indexOf2 >= 0) {
                                        tL_messages_sendEncryptedMultiMedia.files.set(indexOf2, inputEncryptedFile3);
                                        i9 = z;
                                        if (inputEncryptedFile4.id == 1) {
                                            d7aVar6.g = (TLRPC.PhotoSize) d7aVar6.E.get(str4 + str2);
                                        }
                                        tL_decryptedMessage = tL_messages_sendEncryptedMultiMedia.messages.get(indexOf2);
                                    } else {
                                        i9 = z;
                                        tL_decryptedMessage = null;
                                    }
                                } else {
                                    i9 = z;
                                    tL_decryptedMessage = (TLRPC.TL_decryptedMessage) tLObject;
                                }
                                if (tL_decryptedMessage != null) {
                                    TLRPC.DecryptedMessageMedia decryptedMessageMedia = tL_decryptedMessage.media;
                                    if ((decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaVideo) || (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaPhoto) || (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaDocument)) {
                                        long longValue3 = ((Long) objArr[c2]).longValue();
                                        decryptedMessageMedia = tL_decryptedMessage.media;
                                        decryptedMessageMedia.size = longValue3;
                                    }
                                    decryptedMessageMedia.key = (byte[]) objArr[3];
                                    decryptedMessageMedia.iv = (byte[]) objArr[4];
                                    if (d7aVar6.e == 4) {
                                        r7aVar.z0(d7aVar6, null, inputEncryptedFile3, str4);
                                    } else {
                                        wx9 secretChatHelper = r7aVar.getSecretChatHelper();
                                        r47 r47Var10 = d7aVar6.m;
                                        secretChatHelper.j(tL_decryptedMessage, r47Var10.k, d7aVar6.n, inputEncryptedFile3, d7aVar6.f, r47Var10);
                                        inputEncryptedFile = inputEncryptedFile3;
                                        arrayList2.remove(i21);
                                        i21--;
                                        i21 += i9;
                                        str7 = str2;
                                        z = i9;
                                        str = str3;
                                        inputFile2 = inputFile;
                                        str13 = str4;
                                        i11 = i8;
                                        inputEncryptedFile2 = inputEncryptedFile;
                                        i12 = -1;
                                    }
                                }
                                inputEncryptedFile = inputEncryptedFile3;
                                arrayList2.remove(i21);
                                i21--;
                                i21 += i9;
                                str7 = str2;
                                z = i9;
                                str = str3;
                                inputFile2 = inputFile;
                                str13 = str4;
                                i11 = i8;
                                inputEncryptedFile2 = inputEncryptedFile;
                                i12 = -1;
                            }
                        } else {
                            byte b2 = d7aVar6.e;
                            if (b2 == 0) {
                                inputMedia.file = inputFile2;
                                i8 = i11;
                                str5 = str7;
                                inputFile = inputFile2;
                                inputEncryptedFile = inputEncryptedFile2;
                                str4 = str13;
                                r7aVar.N(d7aVar6.c, d7aVar6.m, d7aVar6.f, d7aVar6, true, null, d7aVar6.K, null, d7aVar6.H);
                            } else {
                                inputFile = inputFile2;
                                str5 = str7;
                                int i22 = i12;
                                i8 = i11;
                                inputEncryptedFile = inputEncryptedFile2;
                                str4 = str13;
                                if (b2 == z) {
                                    if (inputMedia.file == null && ((photoSize4 = d7aVar6.i) == null || d7aVar6.p)) {
                                        inputMedia.file = inputFile;
                                        if (d7aVar6.j == null && photoSize4 != null) {
                                            r7aVar.L(d7aVar6, i22);
                                        } else if (inputMedia.thumb != null || (photoSize5 = d7aVar6.g) == null || photoSize5.location == null || !((r47Var2 = d7aVar6.m) == null || (oecVar = r47Var2.r0) == null || !oecVar.N)) {
                                            r7aVar.M(d7aVar6.c, d7aVar6.m, d7aVar6.f, null, d7aVar6.K, null, d7aVar6.H);
                                        } else {
                                            r7aVar.L(d7aVar6, i22);
                                        }
                                    } else if (d7aVar6.j != null || d7aVar6.i == null) {
                                        inputMedia.thumb = inputFile;
                                        inputMedia.flags |= 4;
                                        r7aVar.M(d7aVar6.c, d7aVar6.m, d7aVar6.f, null, d7aVar6.K, null, d7aVar6.H);
                                    } else {
                                        d7aVar6.j = inputFile;
                                        d7aVar6.q = z;
                                        r7aVar.L(d7aVar6, i22);
                                    }
                                } else if (b2 == 2) {
                                    if (inputMedia.file == null) {
                                        inputMedia.file = inputFile;
                                        if (inputMedia.thumb != null || (photoSize3 = d7aVar6.g) == null || photoSize3.location == null) {
                                            r7aVar.M(d7aVar6.c, d7aVar6.m, d7aVar6.f, null, d7aVar6.K, null, d7aVar6.H);
                                            r7aVar = this;
                                        } else {
                                            r7aVar.L(d7aVar6, i22);
                                        }
                                    } else {
                                        inputMedia.thumb = inputFile;
                                        inputMedia.flags |= 4;
                                        r7aVar = this;
                                        r7aVar.M(d7aVar6.c, d7aVar6.m, d7aVar6.f, null, d7aVar6.K, null, d7aVar6.H);
                                    }
                                } else if (b2 == 3) {
                                    inputMedia.file = inputFile;
                                    r7aVar = this;
                                    r7aVar.M(d7aVar6.c, d7aVar6.m, d7aVar6.f, null, d7aVar6.K, null, d7aVar6.H);
                                } else {
                                    r7aVar = this;
                                    if (b2 == 4) {
                                        if (!(inputMedia instanceof TLRPC.TL_inputMediaUploadedDocument)) {
                                            str3 = str;
                                            str2 = str5;
                                            if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                                                HashMap hashMap7 = d7aVar6.E;
                                                if (hashMap7 != null) {
                                                    if (hashMap7.containsKey(str4 + "_doc")) {
                                                        i10 = z;
                                                        String str14 = i10 == 0 ? (String) d7aVar6.E.get(str4 + "_doc") : str4;
                                                        r47 r47Var11 = (r47) d7aVar6.E.get(str14 + "_i");
                                                        hashMap = d7aVar6.E;
                                                        if (hashMap != null) {
                                                            if (hashMap.containsKey(str14 + str2)) {
                                                                d7aVar6.g = (TLRPC.PhotoSize) d7aVar6.E.get(str14 + str2);
                                                            }
                                                        }
                                                        hashMap2 = d7aVar6.E;
                                                        if (hashMap2 != null) {
                                                            if (hashMap2.containsKey(str14 + str3)) {
                                                                d7aVar6.i = (TLRPC.PhotoSize) d7aVar6.E.get(str14 + str3);
                                                            }
                                                        }
                                                        int indexOf3 = d7aVar6.x.indexOf(r47Var11);
                                                        if (i10 == 0 && d7aVar6.j == null && d7aVar6.i != null) {
                                                            d7aVar6.j = inputFile;
                                                            d7aVar6.q = z;
                                                            r7aVar.L(d7aVar6, indexOf3);
                                                        } else if (d7aVar6.g == null && inputMedia.thumb == null) {
                                                            inputMedia.thumb = inputFile;
                                                            inputMedia.flags |= 4;
                                                            r7aVar.z0(d7aVar6, inputMedia, null, (String) d7aVar6.E.get(str4 + "_o"));
                                                        } else {
                                                            inputMedia.file = inputFile;
                                                            r7aVar.z0(d7aVar6, inputMedia, null, str4);
                                                        }
                                                    }
                                                }
                                                i10 = i8;
                                                if (i10 == 0) {
                                                }
                                                r47 r47Var112 = (r47) d7aVar6.E.get(str14 + "_i");
                                                hashMap = d7aVar6.E;
                                                if (hashMap != null) {
                                                }
                                                hashMap2 = d7aVar6.E;
                                                if (hashMap2 != null) {
                                                }
                                                int indexOf32 = d7aVar6.x.indexOf(r47Var112);
                                                if (i10 == 0) {
                                                }
                                                if (d7aVar6.g == null) {
                                                }
                                                inputMedia.file = inputFile;
                                                r7aVar.z0(d7aVar6, inputMedia, null, str4);
                                            } else {
                                                inputMedia.file = inputFile;
                                                r7aVar.z0(d7aVar6, inputMedia, null, str4);
                                            }
                                        } else if (inputMedia.file == null) {
                                            inputMedia.file = inputFile;
                                            int indexOf4 = d7aVar6.x.indexOf((r47) d7aVar6.E.get(str4 + "_i"));
                                            HashMap hashMap8 = d7aVar6.E;
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(str4);
                                            str2 = str5;
                                            sb.append(str2);
                                            if (hashMap8.containsKey(sb.toString())) {
                                                d7aVar6.g = (TLRPC.PhotoSize) d7aVar6.E.get(str4 + str2);
                                            }
                                            HashMap hashMap9 = d7aVar6.E;
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(str4);
                                            str3 = str;
                                            sb2.append(str3);
                                            if (hashMap9.containsKey(sb2.toString())) {
                                                d7aVar6.i = (TLRPC.PhotoSize) d7aVar6.E.get(str4 + str3);
                                            }
                                            if (inputMedia.video_cover == null && (photoSize2 = d7aVar6.i) != null && photoSize2.location != null) {
                                                d7aVar6.q = z;
                                                r7aVar.L(d7aVar6, indexOf4);
                                            } else if (inputMedia.thumb != null || (photoSize = d7aVar6.g) == null || photoSize.location == null) {
                                                r7aVar.z0(d7aVar6, inputMedia, null, str4);
                                            } else {
                                                d7aVar6.p = z;
                                                r7aVar.L(d7aVar6, indexOf4);
                                            }
                                        } else {
                                            str3 = str;
                                            str2 = str5;
                                            String str15 = (String) d7aVar6.E.get(str4 + "_doc");
                                            r47 r47Var12 = (r47) d7aVar6.E.get(str15 + "_i");
                                            if (d7aVar6.E.containsKey(str15 + str2)) {
                                                d7aVar6.g = (TLRPC.PhotoSize) d7aVar6.E.get(str15 + str2);
                                            }
                                            if (d7aVar6.E.containsKey(str15 + str3)) {
                                                d7aVar6.i = (TLRPC.PhotoSize) d7aVar6.E.get(str15 + str3);
                                            }
                                            int indexOf5 = d7aVar6.x.indexOf(r47Var12);
                                            if (d7aVar6.j != null || d7aVar6.i == null) {
                                                inputMedia.thumb = inputFile;
                                                inputMedia.flags |= 4;
                                                r7aVar.z0(d7aVar6, inputMedia, null, (String) d7aVar6.E.get(str4 + "_o"));
                                            } else {
                                                d7aVar6.j = inputFile;
                                                d7aVar6.q = z;
                                                r7aVar.L(d7aVar6, indexOf5);
                                            }
                                        }
                                        arrayList2.remove(i21);
                                        i21--;
                                    }
                                }
                            }
                            str3 = str;
                            str2 = str5;
                            arrayList2.remove(i21);
                            i21--;
                        }
                        i9 = z;
                        i21 += i9;
                        str7 = str2;
                        z = i9;
                        str = str3;
                        inputFile2 = inputFile;
                        str13 = str4;
                        i11 = i8;
                        inputEncryptedFile2 = inputEncryptedFile;
                        i12 = -1;
                    }
                    String str16 = str13;
                    if (arrayList2.isEmpty()) {
                        r7aVar.a.remove(str16);
                        return;
                    }
                    return;
                }
                return;
            }
            TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport = new TLRPC.TL_messages_initHistoryImport();
            tL_messages_initHistoryImport.file = inputFile2;
            tL_messages_initHistoryImport.media_count = i7aVar3.b.size();
            tL_messages_initHistoryImport.peer = i7aVar3.g;
            i7aVar3.q.getConnectionsManager().sendRequest(tL_messages_initHistoryImport, new f7a(i7aVar3, tL_messages_initHistoryImport), 2);
        }
        c2 = 5;
        str = "_ct";
        m7aVar = (m7a) r7aVar.F.get(str13);
        if (m7aVar != null) {
        }
        arrayList2 = (ArrayList) r7aVar.a.get(str13);
        if (arrayList2 == null) {
        }
    }

    public final void e(TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, long j) {
        if (j != 0) {
            TLRPC.InputPeer j1 = getMessagesController().j1(j);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_sendMultiMedia.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = j1;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_sendMultiMedia.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = j1;
            tL_messages_sendMultiMedia.flags |= 1;
        }
    }

    public final void e0(TLRPC.Message message, boolean z) {
        if (Thread.currentThread() != a.d.getLooper().getThread()) {
            hl.c3(new s5a(this, message, z, (byte) 2));
        } else {
            f0(message, z);
        }
    }

    public final void f(r47 r47Var) {
        int i;
        ArrayList t = qd4.t(r47Var);
        if (r47Var != null && r47Var.D == 29) {
            Iterator it = this.a.entrySet().iterator();
            d7a d7aVar = null;
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) ((Map.Entry) it.next()).getValue();
                for (0; i < arrayList.size(); i + 1) {
                    d7a d7aVar2 = (d7a) arrayList.get(i);
                    if (d7aVar2.e == 4) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= d7aVar2.x.size()) {
                                break;
                            }
                            if (((r47) d7aVar2.x.get(i2)).e1() == r47Var.e1()) {
                                d7aVar = d7aVar2;
                                break;
                            }
                            i2++;
                        }
                    }
                    i = d7aVar == null ? i + 1 : 0;
                }
            }
            if (d7aVar != null) {
                t.clear();
                t.addAll(d7aVar.x);
            }
        }
        g(t);
    }

    public final void f0(TLRPC.Message message, boolean z) {
        if (message != null) {
            int i = message.id;
            if (i > 0) {
                this.d.put(i, message);
                return;
            }
            SparseArray sparseArray = this.c;
            boolean z2 = sparseArray.indexOfKey(i) >= 0;
            i0(message.id, z);
            sparseArray.put(message.id, message);
            if (z || z2 || r47.c3(message)) {
                return;
            }
            long B0 = r47.B0(message);
            zh6 zh6Var = this.f;
            zh6Var.k(B0, Integer.valueOf(((Integer) zh6Var.g(B0, 0)).intValue() + 1));
            getNotificationCenter().k(jn7.n1, new Object[0]);
        }
    }

    public final void g(ArrayList arrayList) {
        HashMap hashMap;
        int i;
        int i2;
        int i3;
        long j;
        r47 r47Var;
        int i4;
        String G;
        TLRPC.Message message;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        long j2 = 0;
        int i7 = 0;
        boolean z2 = false;
        while (true) {
            int size = arrayList.size();
            hashMap = this.a;
            if (i7 >= size) {
                break;
            }
            r47 r47Var2 = (r47) arrayList.get(i7);
            int i8 = r47Var2.r1 ? 1 : i5;
            long B0 = r47.B0(r47Var2.k);
            arrayList4.add(Integer.valueOf(r47Var2.e1()));
            if (r47.a4(r47Var2.k)) {
                i6 = r47.I1(r47Var2.k);
            }
            TLRPC.Message h0 = h0(r47Var2.e1(), r47Var2.r1);
            if (h0 != null) {
                getConnectionsManager().cancelRequest(h0.reqId, true);
            }
            jxa v = jxa.v(this.currentAccount, z);
            exa exaVar = v.N;
            ArrayList arrayList5 = arrayList4;
            if (exaVar == null || exaVar.b != r47.B0(r47Var2.k)) {
                i3 = i7;
                j = B0;
            } else {
                exa exaVar2 = v.N;
                int e1 = r47Var2.e1();
                dxa dxaVar = exaVar2.p;
                p21 p21Var = exaVar2.d;
                i3 = i7;
                HashSet hashSet = exaVar2.k;
                j = B0;
                if (!exaVar2.n && !exaVar2.o) {
                    Iterator it = hashSet.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            r47Var = null;
                            break;
                        }
                        r47Var = (r47) it.next();
                        Iterator it2 = it;
                        if (r47Var.e1() == e1) {
                            hashSet.remove(r47Var);
                            break;
                        }
                        it = it2;
                    }
                    if (hashSet.isEmpty()) {
                        exaVar2.n = true;
                        exaVar2.c.b();
                        v.N = null;
                    } else {
                        exaVar2.g--;
                        if (r47Var != null && (message = r47Var.k) != null) {
                            exaVar2.h -= message.paid_message_stars;
                        }
                        ixa ixaVar = exaVar2.f;
                        if (ixaVar != null) {
                            ixaVar.b = 3000L;
                            hl.r(dxaVar);
                            hl.d3(dxaVar, 3000L);
                        }
                        in inVar = p21Var.b;
                        int i9 = exaVar2.g;
                        if (i9 == 1) {
                            G = ob6.M0(2131747430, null);
                            i4 = 0;
                        } else {
                            i4 = 0;
                            G = ob6.G(i9, "PaidMessageSentTitle", new Object[0]);
                        }
                        inVar.setText(G);
                        p21Var.c.setText(hl.S2(ob6.H(',', "PaidMessageSentSubtitle", Math.max(i4, (int) exaVar2.h))));
                        p21Var.a.d();
                    }
                }
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                ArrayList arrayList6 = (ArrayList) entry.getValue();
                int i10 = 0;
                while (true) {
                    if (i10 < arrayList6.size()) {
                        d7a d7aVar = (d7a) arrayList6.get(i10);
                        if (d7aVar.e == 4) {
                            r47 r47Var3 = null;
                            int i11 = 0;
                            while (true) {
                                if (i11 >= d7aVar.x.size()) {
                                    i11 = -1;
                                    break;
                                }
                                r47Var3 = (r47) d7aVar.x.get(i11);
                                if (r47Var3.e1() == r47Var2.e1()) {
                                    i0(r47Var2.e1(), r47Var2.r1);
                                    break;
                                }
                                i11++;
                            }
                            if (i11 >= 0) {
                                d7aVar.x.remove(i11);
                                d7aVar.z.remove(i11);
                                d7aVar.B.remove(i11);
                                if (!d7aVar.y.isEmpty()) {
                                    d7aVar.y.remove(i11);
                                }
                                TLObject tLObject = d7aVar.c;
                                if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                                    ((TLRPC.TL_messages_sendMultiMedia) tLObject).multi_media.remove(i11);
                                } else {
                                    if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                                        TLRPC.InputMedia inputMedia = ((TLRPC.TL_messages_sendMedia) tLObject).media;
                                        if (inputMedia instanceof TLRPC.TL_inputMediaPaidMedia) {
                                            ((TLRPC.TL_inputMediaPaidMedia) inputMedia).extended_media.remove(i11);
                                        } else {
                                            TLRPC.InputMedia inputMedia2 = ((TLRPC.TL_messages_sendMedia) tLObject).media;
                                            if (inputMedia2 instanceof TLRPC.TL_inputMediaPoll) {
                                                ih8.i((TLRPC.TL_inputMediaPoll) inputMedia2, ((Integer) d7aVar.C.get(i11)).intValue());
                                            }
                                        }
                                    }
                                    if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
                                        TLRPC.InputMedia inputMedia3 = ((TL_ephemeral.TL_sendMessage) tLObject).media;
                                        if (inputMedia3 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                            ((TLRPC.TL_inputMediaPaidMedia) inputMedia3).extended_media.remove(i11);
                                        } else {
                                            TLRPC.InputMedia inputMedia4 = ((TL_ephemeral.TL_sendMessage) tLObject).media;
                                            if (inputMedia4 instanceof TLRPC.TL_inputMediaPoll) {
                                                ih8.i((TLRPC.TL_inputMediaPoll) inputMedia4, ((Integer) d7aVar.C.get(i11)).intValue());
                                            }
                                        }
                                    }
                                    TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia = (TLRPC.TL_messages_sendEncryptedMultiMedia) d7aVar.d;
                                    tL_messages_sendEncryptedMultiMedia.messages.remove(i11);
                                    tL_messages_sendEncryptedMultiMedia.files.remove(i11);
                                }
                                MediaController.z().d(r47Var2);
                                String str = (String) d7aVar.E.get(r47Var3);
                                if (str != null) {
                                    arrayList2.add(str);
                                }
                                if (d7aVar.x.isEmpty()) {
                                    d7aVar.d();
                                } else {
                                    if (d7aVar.G == r47Var2.e1()) {
                                        r47 r47Var4 = (r47) c00.g(1, d7aVar.x);
                                        d7aVar.G = r47Var4.e1();
                                        r47Var4.k.params.put("final", "1");
                                        TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                                        tL_messages_messages.messages.add(r47Var4.k);
                                        getMessagesStorage().e1(-2, 0, i8, d7aVar.a, 0L, tL_messages_messages, false);
                                    }
                                    if (!arrayList3.contains(d7aVar)) {
                                        arrayList3.add(d7aVar);
                                    }
                                }
                            }
                        } else if (d7aVar.m.e1() == r47Var2.e1()) {
                            i0(r47Var2.e1(), r47Var2.r1);
                            arrayList6.remove(i10);
                            d7aVar.d();
                            MediaController.z().d(d7aVar.m);
                            if (arrayList6.size() == 0) {
                                arrayList2.add((String) entry.getKey());
                                if (d7aVar.d != null) {
                                    z2 = true;
                                }
                            }
                        } else {
                            i10++;
                        }
                    }
                }
            }
            i7 = i3 + 1;
            i5 = i8;
            arrayList4 = arrayList5;
            j2 = j;
            z = false;
        }
        ArrayList arrayList7 = arrayList4;
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            String str2 = (String) arrayList2.get(i12);
            if (str2.startsWith("http")) {
                in5.z().c(str2);
            } else {
                getFileLoader().b(str2, z2);
            }
            hashMap.remove(str2);
        }
        int size2 = arrayList3.size();
        for (int i13 = 0; i13 < size2; i13++) {
            s0((d7a) arrayList3.get(i13), false);
        }
        if (arrayList.size() == 1 && ((r47) arrayList.get(0)).Y2() && ((r47) arrayList.get(0)).D1 != null) {
            k0((r47) arrayList.get(0));
            return;
        }
        if (arrayList.size() == 1 && ((r47) arrayList.get(0)).Y2() && ((r47) arrayList.get(0)).S3()) {
            return;
        }
        if (!arrayList.isEmpty() && r47.c5(((r47) arrayList.get(0)).k)) {
            i2 = 9;
        } else {
            if (arrayList.isEmpty() || !r47.a4(((r47) arrayList.get(0)).k)) {
                i = i5 != 0 ? 1 : 0;
                getMessagesController().X(arrayList7, null, null, j2, i6, false, i);
            }
            i2 = 5;
        }
        i = i2;
        getMessagesController().X(arrayList7, null, null, j2, i6, false, i);
    }

    public final void g0(r47 r47Var) {
        if (r47Var == null || r47Var.e1() > 0 || r47Var.r1) {
            return;
        }
        TLRPC.Message message = r47Var.k;
        int i = message.id;
        SparseArray sparseArray = this.e;
        boolean z = sparseArray.indexOfKey(i) >= 0;
        sparseArray.put(message.id, message);
        if (z || r47.c3(message)) {
            return;
        }
        long B0 = r47.B0(message);
        zh6 zh6Var = this.h;
        zh6Var.k(B0, Integer.valueOf(((Integer) zh6Var.g(B0, 0)).intValue() + 1));
        getNotificationCenter().k(jn7.n1, new Object[0]);
    }

    public final TLRPC.Message h0(int i, boolean z) {
        if (i > 0) {
            SparseArray sparseArray = this.d;
            TLRPC.Message message = (TLRPC.Message) sparseArray.get(i);
            if (message != null) {
                sparseArray.remove(i);
            }
            return message;
        }
        SparseArray sparseArray2 = this.c;
        TLRPC.Message message2 = (TLRPC.Message) sparseArray2.get(i);
        if (message2 != null) {
            sparseArray2.remove(i);
            if (!z) {
                long B0 = r47.B0(message2);
                zh6 zh6Var = this.f;
                Integer num = (Integer) zh6Var.f(B0);
                if (num != null) {
                    int intValue = num.intValue() - 1;
                    if (intValue <= 0) {
                        zh6Var.l(B0);
                    } else {
                        zh6Var.k(B0, Integer.valueOf(intValue));
                    }
                    getNotificationCenter().k(jn7.n1, new Object[0]);
                }
            }
        }
        return message2;
    }

    public final void i0(int i, boolean z) {
        if (i > 0 || z) {
            return;
        }
        SparseArray sparseArray = this.e;
        TLRPC.Message message = (TLRPC.Message) sparseArray.get(i);
        if (message != null) {
            sparseArray.remove(i);
            long B0 = r47.B0(message);
            zh6 zh6Var = this.h;
            Integer num = (Integer) zh6Var.f(B0);
            if (num != null) {
                int intValue = num.intValue() - 1;
                if (intValue <= 0) {
                    zh6Var.l(B0);
                } else {
                    zh6Var.k(B0, Integer.valueOf(intValue));
                }
                getNotificationCenter().k(jn7.n1, new Object[0]);
            }
        }
    }

    public final boolean j0(long j, r47 r47Var, boolean z) {
        if (r47Var.e1() < 0) {
            TLRPC.Message message = r47Var.k;
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionGramTransfer)) {
                boolean z2 = messageAction instanceof TLRPC.TL_messageEncryptedAction;
                int i = jn7.r;
                if (z2) {
                    TLRPC.EncryptedChat a1 = getMessagesController().a1(Integer.valueOf((int) (r47.B0(message) & 4294967295L)));
                    if (a1 == null) {
                        getMessagesStorage().K0(r47Var.r1 ? 1 : 0, r47Var.k);
                        r47Var.k.send_state = 2;
                        getNotificationCenter().k(jn7.L, Integer.valueOf(r47Var.e1()));
                        c0(r47Var.e1());
                        return false;
                    }
                    TLRPC.Message message2 = r47Var.k;
                    if (message2.random_id == 0) {
                        message2.random_id = D();
                    }
                    TLRPC.DecryptedMessageAction decryptedMessageAction = r47Var.k.action.encryptedAction;
                    if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) {
                        getSecretChatHelper().z(a1, r47Var.k);
                        return true;
                    }
                    if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionDeleteMessages) {
                        getSecretChatHelper().t(a1, null, r47Var.k);
                        return true;
                    }
                    if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionFlushHistory) {
                        getSecretChatHelper().r(a1, r47Var.k);
                        return true;
                    }
                    if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionNotifyLayer) {
                        getSecretChatHelper().w(a1, r47Var.k);
                        return true;
                    }
                    if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionReadMessages) {
                        getSecretChatHelper().u(a1, null, r47Var.k);
                        return true;
                    }
                    if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) {
                        wx9 secretChatHelper = getSecretChatHelper();
                        TLRPC.Message message3 = r47Var.k;
                        secretChatHelper.getClass();
                        if (a1 instanceof TLRPC.TL_encryptedChat) {
                            TLRPC.DecryptedMessage tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
                            if (message3 != null) {
                                tL_decryptedMessageService.action = message3.action.encryptedAction;
                            } else {
                                TLRPC.DecryptedMessageAction tL_decryptedMessageActionScreenshotMessages = new TLRPC.TL_decryptedMessageActionScreenshotMessages();
                                tL_decryptedMessageService.action = tL_decryptedMessageActionScreenshotMessages;
                                tL_decryptedMessageActionScreenshotMessages.random_ids = null;
                                message3 = secretChatHelper.d(a1, tL_decryptedMessageActionScreenshotMessages);
                                r47 r47Var2 = new r47(secretChatHelper.currentAccount, message3, false, false);
                                r47Var2.k.send_state = 1;
                                r47Var2.X1 = true;
                                secretChatHelper.getMessagesController().z5(0, message3.dialog_id, qd4.t(r47Var2));
                                secretChatHelper.getNotificationCenter().k(i, new Object[0]);
                            }
                            TLRPC.Message message4 = message3;
                            tL_decryptedMessageService.random_id = message4.random_id;
                            secretChatHelper.j(tL_decryptedMessageService, message4, a1, null, null, null);
                            return true;
                        }
                    } else if (!(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionTyping)) {
                        if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionResend) {
                            getSecretChatHelper().y(a1, 0, 0, r47Var.k);
                            return true;
                        }
                        if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionCommitKey) {
                            getSecretChatHelper().s(a1, r47Var.k);
                            return true;
                        }
                        if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionAbortKey) {
                            getSecretChatHelper().p(a1, r47Var.k, 0L);
                            return true;
                        }
                        if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionRequestKey) {
                            getSecretChatHelper().x(a1, r47Var.k);
                            return true;
                        }
                        if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionAcceptKey) {
                            getSecretChatHelper().q(a1, r47Var.k);
                            return true;
                        }
                        if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionNoop) {
                            getSecretChatHelper().v(a1, r47Var.k);
                        }
                    }
                    return true;
                }
                if (messageAction instanceof TLRPC.TL_messageActionScreenshotTaken) {
                    TLRPC.User X1 = getMessagesController().X1(Long.valueOf(r47.B0(r47Var.k)));
                    int N1 = r47Var.N1();
                    TLRPC.Message message5 = r47Var.k;
                    if (X1 != null && N1 != 0 && X1.id != getUserConfig().e()) {
                        TLRPC.TL_messages_sendScreenshotNotification tL_messages_sendScreenshotNotification = new TLRPC.TL_messages_sendScreenshotNotification();
                        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                        tL_messages_sendScreenshotNotification.peer = tL_inputPeerUser;
                        tL_inputPeerUser.access_hash = X1.access_hash;
                        tL_inputPeerUser.user_id = X1.id;
                        if (message5 != null) {
                            TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                            tL_inputReplyToMessage.reply_to_msg_id = N1;
                            tL_messages_sendScreenshotNotification.reply_to = tL_inputReplyToMessage;
                            tL_messages_sendScreenshotNotification.random_id = message5.random_id;
                        } else {
                            message5 = new TLRPC.TL_messageService();
                            message5.random_id = D();
                            message5.dialog_id = X1.id;
                            message5.unread = true;
                            message5.out = true;
                            int i2 = getUserConfig().i();
                            message5.id = i2;
                            message5.local_id = i2;
                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                            message5.from_id = tL_peerUser;
                            tL_peerUser.user_id = getUserConfig().e();
                            message5.flags |= jn7.m4;
                            TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                            message5.reply_to = tL_messageReplyHeader;
                            tL_messageReplyHeader.flags |= 16;
                            tL_messageReplyHeader.reply_to_msg_id = N1;
                            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                            message5.peer_id = tL_peerUser2;
                            tL_peerUser2.user_id = X1.id;
                            message5.date = getConnectionsManager().getCurrentTime();
                            message5.action = new TLRPC.TL_messageActionScreenshotTaken();
                            getUserConfig().u(false);
                        }
                        tL_messages_sendScreenshotNotification.random_id = message5.random_id;
                        r47 r47Var3 = new r47(this.currentAccount, message5, false, true);
                        r47Var3.k.send_state = 1;
                        r47Var3.X1 = true;
                        getMessagesController().z5(0, message5.dialog_id, qd4.t(r47Var3));
                        getNotificationCenter().k(i, new Object[0]);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(message5);
                        getMessagesStorage().g1(arrayList, false, true, false, 0, false, 0, 0L);
                        M(tL_messages_sendScreenshotNotification, r47Var3, null, null, null, null, false);
                    }
                }
                if (z) {
                    this.b.put(r47Var.e1(), r47Var);
                }
                long B0 = r47.B0(r47Var.k);
                TLRPC.Message message6 = r47Var.k;
                p7a c = p7a.c(null, null, null, null, null, null, null, null, null, null, B0, message6.attachPath, null, null, null, true, r47Var, null, message6.reply_markup, message6.params, !message6.silent, r47Var.r1 ? message6.date : 0, 0, 0, null, null, false, false);
                TLRPC.Message message7 = r47Var.k;
                if (message7 != null) {
                    TLRPC.InputQuickReplyShortcut inputQuickReplyShortcut = message7.quick_reply_shortcut;
                    if (inputQuickReplyShortcut instanceof TLRPC.TL_inputQuickReplyShortcut) {
                        c.M = ((TLRPC.TL_inputQuickReplyShortcut) inputQuickReplyShortcut).shortcut;
                    }
                    c.N = r47.I1(message7);
                    message7 = r47Var.k;
                    c.Q = message7.paid_message_stars;
                }
                c.X = message7 != null ? message7.ephemeralReceiverBotId : 0L;
                c.Q = j;
                q0(c);
                return true;
            }
            if (z) {
                k(r47Var, null, false);
            }
        } else if (r47Var.Y2()) {
            s(r47Var, null, null, null, null, null, null, null, true, r47Var.t2(), r47Var);
            return false;
        }
        return false;
    }

    public final void k(r47 r47Var, TLRPC.Updates updates, boolean z) {
        int i;
        TLRPC.Message message;
        TLRPC.Message message2;
        ArrayList<TLRPC.Update> arrayList;
        if (r47Var == null) {
            return;
        }
        long B0 = r47.B0(r47Var.k);
        long j = r47Var.k.random_id;
        byte b = 2;
        if (updates != null) {
            ArrayList<TLRPC.Update> arrayList2 = updates.updates;
            int size = arrayList2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i = 0;
                    break;
                }
                TLRPC.Update update = arrayList2.get(i2);
                i2++;
                TLRPC.Update update2 = update;
                if (update2 instanceof TL_update.TL_updateMessageID) {
                    TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) update2;
                    arrayList = arrayList2;
                    if (tL_updateMessageID.random_id == j) {
                        i = tL_updateMessageID.id;
                        break;
                    }
                } else {
                    arrayList = arrayList2;
                }
                arrayList2 = arrayList;
            }
            for (int i3 = 0; i3 < updates.updates.size(); i3++) {
                TLRPC.Update update3 = updates.updates.get(i3);
                if (update3 instanceof TL_update.TL_updateNewMessage) {
                    TL_update.TL_updateNewMessage tL_updateNewMessage = (TL_update.TL_updateNewMessage) update3;
                    message2 = tL_updateNewMessage.message;
                    if ((message2.action instanceof TLRPC.TL_messageActionGramTransfer) && message2.out && wf3.n(message2.peer_id) == B0 && (i == 0 || message2.id == i)) {
                        updates.updates.remove(i3);
                        Utilities.d.c(new h5a(this, tL_updateNewMessage, b));
                        break;
                    }
                }
            }
            message2 = null;
            if (message2 != null) {
                for (int size2 = updates.updates.size() - 1; size2 >= 0; size2--) {
                    TLRPC.Update update4 = updates.updates.get(size2);
                    if ((update4 instanceof TL_update.TL_updateMessageID) && ((TL_update.TL_updateMessageID) update4).random_id == j) {
                        updates.updates.remove(size2);
                    }
                }
            }
            message = message2;
        } else {
            i = 0;
            message = null;
        }
        int i4 = r47Var.k.local_id;
        if (i4 >= 0) {
            i4 = r47Var.e1();
        }
        int i5 = i4;
        if (message != null) {
            message.dialog_id = B0;
            message.local_id = 0;
            message.send_state = 0;
            Integer num = (Integer) getMessagesController().Q.get(Long.valueOf(B0));
            if (num == null) {
                num = Integer.valueOf(getMessagesStorage().S(B0, true));
                getMessagesController().Q.put(Long.valueOf(B0), num);
            }
            message.unread = num.intValue() < message.id;
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(message);
            getMessagesStorage().a.c(new ga7(this, j, B0, i5, message, arrayList3, r47Var));
            return;
        }
        if (r47Var.e1() > 0) {
            c0(i5);
            h0(i5, false);
            return;
        }
        if (z || i != 0) {
            jf7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new kd7(messagesStorage, j, B0, Integer.valueOf(i5), i5, r47Var.k.date));
            r47Var.k.send_state = 0;
            r47Var.M1 = true;
            getNotificationCenter().k(jn7.I, Integer.valueOf(i5));
        } else {
            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
            tL_messageService.id = i5;
            tL_messageService.dialog_id = B0;
            getMessagesStorage().K0(0, tL_messageService);
            r47Var.k.send_state = 2;
            r47Var.M1 = true;
            getNotificationCenter().k(jn7.L, Integer.valueOf(i5));
        }
        c0(i5);
        h0(i5, false);
    }

    public final void k0(r47 r47Var) {
        r47Var.q1 = true;
        TLRPC.Message message = r47Var.k;
        message.media = r47Var.D1;
        message.message = r47Var.C1;
        ArrayList<TLRPC.MessageEntity> arrayList = r47Var.F1;
        message.entities = arrayList;
        message.attachPath = r47Var.G1;
        message.send_state = 0;
        int i = message.flags;
        if (arrayList != null) {
            message.flags = i | 128;
        } else {
            message.flags = i & (-129);
        }
        r47Var.D1 = null;
        r47Var.C1 = null;
        r47Var.F1 = null;
        r47Var.G1 = null;
        r47Var.r0 = null;
        r47Var.D = -1;
        r47Var.K5();
        r47Var.z = null;
        if (r47Var.D != 0) {
            r47Var.k0();
        } else {
            r47Var.S1 = false;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(r47Var.k);
        getMessagesStorage().g1(arrayList2, false, true, false, 0, false, r47Var.r1 ? 1 : 0, 0L);
        getNotificationCenter().k(jn7.m0, Long.valueOf(r47.B0(r47Var.k)), qd4.t(r47Var));
    }

    public final void m0(boolean z, r47 r47Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, zu1 zu1Var) {
        boolean z2;
        int i;
        if (r47Var == null || keyboardButtonProto == null || zu1Var == null) {
            return;
        }
        if (ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
            i = 3;
            z2 = false;
        } else if (ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class)) {
            z2 = false;
            i = 1;
        } else {
            z2 = z;
            i = ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) ? 2 : 0;
        }
        String str = r47.B0(r47Var.k) + "_" + r47Var.e1() + "_" + Utilities.f(keyboardButtonProto.getData()) + "_" + i;
        this.r.put(str, Boolean.TRUE);
        String str2 = r47.B0(r47Var.k) + "_" + r47Var.e1();
        HashMap hashMap = this.s;
        List list = (List) hashMap.get(str2);
        if (list == null) {
            String str3 = r47.B0(r47Var.k) + "_" + r47Var.e1();
            ArrayList arrayList = new ArrayList();
            hashMap.put(str3, arrayList);
            list = arrayList;
        }
        list.add(str);
        TLObject[] tLObjectArr = new TLObject[1];
        l6a l6aVar = new l6a(this, str, list, z2, r47Var, keyboardButtonProto, zu1Var, twoStepVerificationActivity, tLObjectArr, tL_inputCheckPasswordSRP, z);
        if (z2) {
            getMessagesStorage().L(str, l6aVar);
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrlAuth tL_inlineButtonTypeUrlAuth = (TL_keyboard.TL_inlineButtonTypeUrlAuth) ehb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class);
        if (tL_inlineButtonTypeUrlAuth != null) {
            TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
            tL_messages_requestUrlAuth.peer = getMessagesController().j1(r47.B0(r47Var.k));
            tL_messages_requestUrlAuth.msg_id = r47Var.e1();
            tL_messages_requestUrlAuth.button_id = tL_inlineButtonTypeUrlAuth.button_id;
            tL_messages_requestUrlAuth.flags |= 2;
            tLObjectArr[0] = tL_messages_requestUrlAuth;
            getConnectionsManager().sendRequest(tL_messages_requestUrlAuth, l6aVar, 2);
            return;
        }
        boolean c = ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class);
        TLRPC.Message message = r47Var.k;
        if (c) {
            if ((message.media.flags & 4) != 0) {
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = r47Var.k.media.receipt_msg_id;
                tL_payments_getPaymentReceipt.peer = getMessagesController().m1(r47Var.k.peer_id);
                tLObjectArr[0] = tL_payments_getPaymentReceipt;
                getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, l6aVar, 2);
                return;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.msg_id = r47Var.e1();
            tL_inputInvoiceMessage.peer = getMessagesController().m1(r47Var.k.peer_id);
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
            JSONObject u = xw0.u(null, false);
            if (u != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tLObjectArr[0] = tL_payments_getPaymentForm;
            getConnectionsManager().sendRequest(tL_payments_getPaymentForm, l6aVar, 2);
            return;
        }
        if (r47.c3(message)) {
            TL_ephemeral.TL_getCallbackAnswer tL_getCallbackAnswer = new TL_ephemeral.TL_getCallbackAnswer();
            tL_getCallbackAnswer.peer = getMessagesController().j1(r47.B0(r47Var.k));
            tL_getCallbackAnswer.id = r47Var.P0();
            tL_getCallbackAnswer.data = keyboardButtonProto.getData();
            getConnectionsManager().sendRequest(tL_getCallbackAnswer, l6aVar, 2);
            return;
        }
        TLRPC.TL_messages_getBotCallbackAnswer tL_messages_getBotCallbackAnswer = new TLRPC.TL_messages_getBotCallbackAnswer();
        tL_messages_getBotCallbackAnswer.peer = getMessagesController().j1(r47.B0(r47Var.k));
        tL_messages_getBotCallbackAnswer.msg_id = r47Var.e1();
        tL_messages_getBotCallbackAnswer.game = ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class);
        TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) ehb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class);
        if (tL_inlineButtonTypeCallback != null && tL_inlineButtonTypeCallback.requires_password) {
            tL_messages_getBotCallbackAnswer.password = tL_inputCheckPasswordSRP != null ? tL_inputCheckPasswordSRP : new TLRPC.TL_inputCheckPasswordEmpty();
            tL_messages_getBotCallbackAnswer.flags |= 4;
        }
        if (keyboardButtonProto.getData() != null) {
            tL_messages_getBotCallbackAnswer.flags |= 1;
            tL_messages_getBotCallbackAnswer.data = keyboardButtonProto.getData();
        }
        getConnectionsManager().sendRequest(tL_messages_getBotCallbackAnswer, l6aVar, 2);
    }

    public final void n0(r47 r47Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        if (r47Var == null || keyboardButtonProto == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r47.B0(r47Var.k));
        sb.append("_");
        sb.append(r47Var.e1());
        sb.append("_");
        sb.append(Utilities.f(keyboardButtonProto.getData()));
        sb.append("_");
        sb.append(ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) ? "1" : "0");
        this.n.put(sb.toString(), r47Var);
        this.H.m();
    }

    public final TLRPC.TL_inputReplyToMessage o(TLRPC.TL_messageReplyHeader tL_messageReplyHeader) {
        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
        tL_inputReplyToMessage.reply_to_msg_id = tL_messageReplyHeader.reply_to_msg_id;
        int i = tL_messageReplyHeader.flags;
        if ((i & 2) != 0) {
            tL_inputReplyToMessage.flags |= 1;
            tL_inputReplyToMessage.top_msg_id = tL_messageReplyHeader.reply_to_top_id;
        }
        if ((i & 1) != 0) {
            tL_inputReplyToMessage.flags |= 2;
            tL_inputReplyToMessage.reply_to_peer_id = uc7.s1(this.currentAccount).m1(tL_messageReplyHeader.reply_to_peer_id);
        }
        if (tL_messageReplyHeader.quote) {
            ArrayList<TL_iv.RichText> arrayList = tL_messageReplyHeader.quote_rich;
            if (arrayList != null) {
                tL_inputReplyToMessage.quote_rich = arrayList;
            } else if ((tL_messageReplyHeader.flags & 64) != 0) {
                tL_inputReplyToMessage.flags |= 4;
                tL_inputReplyToMessage.quote_text = tL_messageReplyHeader.quote_text;
            }
            if (arrayList == null && (tL_messageReplyHeader.flags & 128) != 0) {
                tL_inputReplyToMessage.flags |= 8;
                tL_inputReplyToMessage.quote_entities = tL_messageReplyHeader.quote_entities;
            }
            if ((tL_messageReplyHeader.flags & 1024) != 0) {
                tL_inputReplyToMessage.flags |= 16;
                tL_inputReplyToMessage.quote_offset = tL_messageReplyHeader.quote_offset;
            }
        }
        if ((tL_messageReplyHeader.flags & 2048) != 0) {
            tL_inputReplyToMessage.flags |= 64;
            tL_inputReplyToMessage.todo_item_id = tL_messageReplyHeader.todo_item_id;
        }
        byte[] bArr = tL_messageReplyHeader.poll_option;
        if (bArr != null) {
            tL_inputReplyToMessage.poll_option = bArr;
        }
        return tL_inputReplyToMessage;
    }

    public final void o0(TLRPC.InputPeer inputPeer, TLRPC.TL_inputMediaGame tL_inputMediaGame, long j, long j2) {
        NativeByteBuffer nativeByteBuffer;
        if (inputPeer == null || tL_inputMediaGame == null) {
            return;
        }
        TLRPC.TL_messages_sendMedia tL_messages_sendMedia = new TLRPC.TL_messages_sendMedia();
        tL_messages_sendMedia.peer = inputPeer;
        boolean z = inputPeer instanceof TLRPC.TL_inputPeerChannel;
        int i = this.currentAccount;
        if (z) {
            tL_messages_sendMedia.silent = uc7.s1(i).W3.getBoolean("silent_" + (-inputPeer.channel_id), false);
        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
            tL_messages_sendMedia.silent = uc7.s1(i).W3.getBoolean("silent_" + (-inputPeer.chat_id), false);
        } else {
            tL_messages_sendMedia.silent = uc7.s1(i).W3.getBoolean("silent_" + inputPeer.user_id, false);
        }
        tL_messages_sendMedia.random_id = j != 0 ? j : D();
        tL_messages_sendMedia.message = "";
        tL_messages_sendMedia.media = tL_inputMediaGame;
        long M = xc2.M(getMessagesController().M0(Long.valueOf(inputPeer.chat_id)), getMessagesController().N0(inputPeer.chat_id), false);
        if (M != yac.h(this.currentAccount).e()) {
            tL_messages_sendMedia.send_as = getMessagesController().j1(M);
        }
        long M1 = getMessagesController().M1(wf3.m(inputPeer));
        if (M1 <= 0) {
            M1 = wf3.j(getMessagesController().P2(wf3.m(inputPeer)));
        }
        if (M1 > 0) {
            tL_messages_sendMedia.flags |= TLObject.FLAG_21;
            tL_messages_sendMedia.allow_paid_stars = M1;
        }
        if (j2 == 0) {
            NativeByteBuffer nativeByteBuffer2 = null;
            try {
                nativeByteBuffer = new NativeByteBuffer(inputPeer.getObjectSize() + tL_inputMediaGame.getObjectSize() + 12);
            } catch (Exception e) {
                e = e;
            }
            try {
                nativeByteBuffer.writeInt32(3);
                nativeByteBuffer.writeInt64(j);
                inputPeer.serializeToStream(nativeByteBuffer);
                tL_inputMediaGame.serializeToStream(nativeByteBuffer);
            } catch (Exception e2) {
                e = e2;
                nativeByteBuffer2 = nativeByteBuffer;
                cc4.g(e, true);
                nativeByteBuffer = nativeByteBuffer2;
                j2 = getMessagesStorage().y(nativeByteBuffer);
                getConnectionsManager().sendRequest(tL_messages_sendMedia, new yu2(this, j2, (byte) 5));
            }
            j2 = getMessagesStorage().y(nativeByteBuffer);
        }
        getConnectionsManager().sendRequest(tL_messages_sendMedia, new yu2(this, j2, (byte) 5));
    }

    public final TLRPC.TL_inputReplyToStory p(TL_stories.StoryItem storyItem) {
        TLRPC.TL_inputReplyToStory tL_inputReplyToStory = new TLRPC.TL_inputReplyToStory();
        tL_inputReplyToStory.story_id = storyItem.id;
        tL_inputReplyToStory.peer = getMessagesController().j1(storyItem.dialogId);
        return tL_inputReplyToStory;
    }

    /* JADX WARN: Code restructure failed: missing block: B:251:0x084a, code lost:
    
        if (r13.contains(java.lang.Integer.valueOf(r0.reply_to_msg_id)) != false) goto L365;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x086e  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0882  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x089a  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x08c1  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x08f0  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x08fa  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0943  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0958  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x09a5  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x09bb  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x09f7  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0a07  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0a24  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0a84  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0a90  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0aa5  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0ac9  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0b14  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0b1f  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0acc  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0a4e  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x09bf  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x09a8  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0998  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x08f2  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x089c  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int p0(final ArrayList arrayList, long j, final boolean z, final boolean z2, final boolean z3, final int i, final int i2, final r47 r47Var, final int i3, long j2, final long j3, final b77 b77Var) {
        TLRPC.UserFull Y1;
        TLRPC.Chat M0;
        long j4;
        boolean z4;
        boolean z5;
        long j5;
        String str;
        boolean s;
        boolean v;
        boolean o;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        String str2;
        boolean z12;
        boolean z13;
        long j6;
        TLRPC.ChatFull N0;
        ArrayList<Integer> arrayList2;
        long j7;
        TLRPC.Chat chat;
        String str3;
        long j8;
        ArrayList<Long> arrayList3;
        zh6 zh6Var;
        boolean z14;
        ArrayList arrayList4;
        TLRPC.Peer peer;
        ArrayList arrayList5;
        TLRPC.InputPeer inputPeer;
        zh6 zh6Var2;
        int i4;
        int i5;
        int i6;
        TLRPC.TL_message tL_message;
        ArrayList<Long> arrayList6;
        zh6 zh6Var3;
        int i7;
        ArrayList<Integer> arrayList7;
        TLRPC.Chat chat2;
        String str4;
        TLRPC.Message message;
        TLRPC.User X1;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer2;
        TLRPC.MessageMedia messageMedia;
        long j9;
        TL_iv.RichMessage richMessage;
        TLRPC.ReplyMarkup replyMarkup;
        long j10;
        TLRPC.Chat chat3;
        long M;
        String str5;
        long j11;
        ArrayList<Integer> arrayList8;
        boolean z15;
        boolean z16;
        TLRPC.Message message2;
        ArrayList arrayList9;
        ArrayList arrayList10;
        int i8;
        TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages;
        ArrayList arrayList11;
        ArrayList arrayList12;
        ArrayList<Long> arrayList13;
        boolean z17;
        o97 o97Var;
        TLRPC.Message message3;
        TLRPC.MessageReplyHeader messageReplyHeader;
        TLRPC.Peer peer3;
        TLRPC.MessageReplyHeader messageReplyHeader2;
        int i9;
        int i10;
        TL_keyboard.TL_keyboardInlineButtonRow tL_keyboardInlineButtonRow;
        TLRPC.MessageFwdHeader messageFwdHeader2;
        long n;
        int i11;
        int i12;
        int i13;
        final r7a r7aVar = this;
        final long j12 = j;
        if (arrayList == null || arrayList.isEmpty()) {
            return 0;
        }
        long e = r7aVar.getUserConfig().e();
        if (wf3.B(j12)) {
            long j13 = j3;
            b77 b77Var2 = b77Var;
            long j14 = r7aVar.getMessagesController().a1(Integer.valueOf((int) j12)).user_id;
            boolean z18 = (!wf3.D(j14) || r7aVar.getMessagesController().X1(Long.valueOf(j14)) == null || (Y1 = r7aVar.getMessagesController().Y1(j14)) == null) ? true : !Y1.voice_messages_forbidden;
            int i14 = 0;
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                r47 r47Var2 = (r47) arrayList.get(i15);
                if (!z18) {
                    if (r47.Q4(r47Var2.k)) {
                        if (i14 == 0) {
                            i14 = 7;
                        }
                    } else if (r47.i4(r47Var2.k) && i14 == 0) {
                        i14 = 8;
                    }
                }
            }
            if (i14 == 0) {
                int i16 = 0;
                while (i16 < arrayList.size()) {
                    r7aVar.b0((r47) arrayList.get(i16), j12, j2, j13, b77Var2);
                    i16++;
                    r7aVar = this;
                    j12 = j;
                    j13 = j3;
                    b77Var2 = b77Var;
                }
            }
            return i14;
        }
        TLRPC.Peer y1 = r7aVar.getMessagesController().y1(j12);
        long M1 = r7aVar.getMessagesController().M1(j12);
        if (M1 <= 0) {
            M1 = wf3.j(r7aVar.getMessagesController().P2(j12));
        }
        if (M1 != j2) {
            jj.X(r7aVar.currentAccount, j12, Math.max(1, arrayList.size()), new pcc() { // from class: n6a
                @Override // pcc
                public final void a(Object obj) {
                    r7a.this.p0(arrayList, j12, z, z2, z3, i, i2, r47Var, i3, ((Long) obj).longValue(), j3, b77Var);
                }
            });
            return 0;
        }
        ArrayList arrayList14 = arrayList;
        int i17 = 0;
        int i18 = 1;
        if (!wf3.D(j12)) {
            M0 = getMessagesController().M0(Long.valueOf(-j12));
            if (xc2.T(M0)) {
                z4 = M0.signatures;
                boolean z19 = M0.megagroup;
                z5 = !z19;
                j4 = (z19 || !M0.has_link || (N0 = getMessagesController().N0(M0.id)) == null) ? 0L : N0.linked_chat_id;
            } else {
                j4 = 0;
                z4 = false;
                z5 = false;
            }
            if (M0 != null) {
                j5 = j4;
                str = getMessagesController().C0(M0.id, e);
            } else {
                j5 = j4;
                str = null;
            }
            boolean t = xc2.t(M0);
            boolean p = xc2.p(M0);
            boolean u = xc2.u(M0);
            boolean l = xc2.l(M0);
            boolean m = xc2.m(M0);
            boolean r = xc2.r(M0);
            s = xc2.s(M0);
            v = xc2.v(M0);
            o = xc2.o(M0);
            z6 = r;
            z7 = m;
            z8 = l;
            z9 = u;
            z10 = z5;
            z11 = z4;
            str2 = str;
            long j15 = j5;
            z12 = t;
            z13 = p;
            j6 = j15;
        } else {
            if (getMessagesController().X1(Long.valueOf(j12)) == null) {
                return 0;
            }
            boolean z20 = getMessagesController().Y1(j12) != null ? !r6.voice_messages_forbidden : true;
            v = z20;
            s = z20;
            j6 = 0;
            z11 = false;
            z10 = false;
            z12 = true;
            z13 = true;
            z9 = true;
            z8 = true;
            z7 = true;
            z6 = true;
            o = true;
            M0 = null;
            str2 = null;
        }
        zh6 zh6Var4 = new zh6();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        ArrayList<Long> arrayList17 = new ArrayList<>();
        ArrayList<Integer> arrayList18 = new ArrayList<>();
        zh6 zh6Var5 = new zh6();
        TLRPC.InputPeer j1 = getMessagesController().j1(j12);
        boolean z21 = j12 == e;
        int i19 = 0;
        ArrayList arrayList19 = arrayList16;
        ArrayList<Long> arrayList20 = arrayList17;
        ArrayList<Integer> arrayList21 = arrayList18;
        zh6 zh6Var6 = zh6Var5;
        TLRPC.InputPeer inputPeer2 = j1;
        int i20 = 0;
        ArrayList arrayList22 = arrayList15;
        boolean z22 = false;
        while (i19 < arrayList14.size()) {
            r47 r47Var3 = (r47) arrayList14.get(i19);
            if (r47Var3.e1() <= 0 || r47Var3.l5()) {
                arrayList2 = arrayList21;
                j7 = e;
                chat = M0;
                str3 = str2;
                j8 = j6;
                arrayList3 = arrayList20;
                zh6Var = zh6Var6;
                z14 = z21;
                arrayList4 = arrayList19;
                peer = y1;
                arrayList5 = arrayList22;
                inputPeer = inputPeer2;
                zh6Var2 = zh6Var4;
                if (r47Var3.D != 0 || TextUtils.isEmpty(r47Var3.v)) {
                    j12 = j;
                    i4 = i19;
                } else {
                    TLRPC.MessageMedia messageMedia2 = r47Var3.k.media;
                    TLRPC.WebPage webPage = messageMedia2 != null ? messageMedia2.webpage : null;
                    i4 = i19;
                    p7a b = p7a.b(r47Var3.v.toString(), j, null, r47Var, webPage, webPage != null ? i18 : 0, r47Var3.k.entities, null, null, z3, i, i2, null, false);
                    j12 = j;
                    b.T = b77Var;
                    b.R = j3;
                    b.M = r47.J1(r47Var3.k);
                    b.N = r47.I1(r47Var3.k);
                    q0(b);
                }
            } else {
                if (r47Var3.s4() || r47Var3.J2()) {
                    i5 = i19;
                } else {
                    i5 = i19;
                    if (!r47.t3(r47Var3.k) && !(r47.n1(r47Var3.k) instanceof TLRPC.TL_messageMediaGame)) {
                        i6 = i17;
                        if (!z12 || i6 == 0) {
                            if (!z13) {
                                TLRPC.Message message4 = r47Var3.k;
                                if ((message4.media instanceof TLRPC.TL_messageMediaPhoto) && !r47.K4(message4) && i6 == 0) {
                                    if (i20 == 0) {
                                        i12 = xc2.P(16, M0) ? 10 : 12;
                                        j7 = e;
                                        chat = M0;
                                        str3 = str2;
                                        j8 = j6;
                                        i20 = i12;
                                        i4 = i5;
                                        z14 = z21;
                                        arrayList4 = arrayList19;
                                        peer = y1;
                                        arrayList5 = arrayList22;
                                        inputPeer = inputPeer2;
                                        zh6Var2 = zh6Var4;
                                        i19 = i4 + 1;
                                        arrayList14 = arrayList;
                                        zh6Var4 = zh6Var2;
                                        y1 = peer;
                                        e = j7;
                                        j6 = j8;
                                        arrayList19 = arrayList4;
                                        M0 = chat;
                                        str2 = str3;
                                        i17 = 0;
                                        inputPeer2 = inputPeer;
                                        arrayList22 = arrayList5;
                                        z21 = z14;
                                    }
                                    arrayList2 = arrayList21;
                                    j7 = e;
                                    chat = M0;
                                    str3 = str2;
                                    j8 = j6;
                                    zh6Var = zh6Var6;
                                    i4 = i5;
                                    z14 = z21;
                                    arrayList4 = arrayList19;
                                    peer = y1;
                                    arrayList3 = arrayList20;
                                    arrayList5 = arrayList22;
                                    inputPeer = inputPeer2;
                                    zh6Var2 = zh6Var4;
                                }
                            }
                            if (o && r47Var3.I3()) {
                                if (i20 == 0) {
                                    i12 = xc2.P(18, M0) ? 19 : 20;
                                    j7 = e;
                                    chat = M0;
                                    str3 = str2;
                                    j8 = j6;
                                    i20 = i12;
                                    i4 = i5;
                                    z14 = z21;
                                    arrayList4 = arrayList19;
                                    peer = y1;
                                    arrayList5 = arrayList22;
                                    inputPeer = inputPeer2;
                                    zh6Var2 = zh6Var4;
                                    i19 = i4 + 1;
                                    arrayList14 = arrayList;
                                    zh6Var4 = zh6Var2;
                                    y1 = peer;
                                    e = j7;
                                    j6 = j8;
                                    arrayList19 = arrayList4;
                                    M0 = chat;
                                    str2 = str3;
                                    i17 = 0;
                                    inputPeer2 = inputPeer;
                                    arrayList22 = arrayList5;
                                    z21 = z14;
                                }
                                arrayList2 = arrayList21;
                                j7 = e;
                                chat = M0;
                                str3 = str2;
                                j8 = j6;
                                zh6Var = zh6Var6;
                                i4 = i5;
                                z14 = z21;
                                arrayList4 = arrayList19;
                                peer = y1;
                                arrayList3 = arrayList20;
                                arrayList5 = arrayList22;
                                inputPeer = inputPeer2;
                                zh6Var2 = zh6Var4;
                            } else {
                                if (!z9) {
                                    TLRPC.Message message5 = r47Var3.k;
                                    if ((message5.media instanceof TLRPC.TL_messageMediaPhoto) && r47.K4(message5) && i6 == 0) {
                                        if (i20 == 0) {
                                            i11 = xc2.P(17, M0) ? 9 : 11;
                                            j7 = e;
                                            chat = M0;
                                            str3 = str2;
                                            j8 = j6;
                                            i20 = i11;
                                            i4 = i5;
                                            z14 = z21;
                                            arrayList4 = arrayList19;
                                            peer = y1;
                                            arrayList5 = arrayList22;
                                            inputPeer = inputPeer2;
                                            zh6Var2 = zh6Var4;
                                            i19 = i4 + 1;
                                            arrayList14 = arrayList;
                                            zh6Var4 = zh6Var2;
                                            y1 = peer;
                                            e = j7;
                                            j6 = j8;
                                            arrayList19 = arrayList4;
                                            M0 = chat;
                                            str2 = str3;
                                            i17 = 0;
                                            inputPeer2 = inputPeer;
                                            arrayList22 = arrayList5;
                                            z21 = z14;
                                        }
                                        arrayList2 = arrayList21;
                                        j7 = e;
                                        chat = M0;
                                        str3 = str2;
                                        j8 = j6;
                                        zh6Var = zh6Var6;
                                        i4 = i5;
                                        z14 = z21;
                                        arrayList4 = arrayList19;
                                        peer = y1;
                                        arrayList3 = arrayList20;
                                        arrayList5 = arrayList22;
                                        inputPeer = inputPeer2;
                                        zh6Var2 = zh6Var4;
                                    }
                                }
                                if (!z6) {
                                    TLRPC.MessageMedia messageMedia3 = r47Var3.k.media;
                                    if (messageMedia3 instanceof TLRPC.TL_messageMediaPoll) {
                                        if (i20 == 0) {
                                            i13 = xc2.P(10, M0) ? 6 : 3;
                                            i20 = i13;
                                            j7 = e;
                                            chat = M0;
                                            str3 = str2;
                                            j8 = j6;
                                            i4 = i5;
                                            z14 = z21;
                                            arrayList4 = arrayList19;
                                            peer = y1;
                                            arrayList5 = arrayList22;
                                            inputPeer = inputPeer2;
                                            zh6Var2 = zh6Var4;
                                            i19 = i4 + 1;
                                            arrayList14 = arrayList;
                                            zh6Var4 = zh6Var2;
                                            y1 = peer;
                                            e = j7;
                                            j6 = j8;
                                            arrayList19 = arrayList4;
                                            M0 = chat;
                                            str2 = str3;
                                            i17 = 0;
                                            inputPeer2 = inputPeer;
                                            arrayList22 = arrayList5;
                                            z21 = z14;
                                        }
                                    } else if (messageMedia3 instanceof TLRPC.TL_messageMediaToDo) {
                                        if (i20 == 0) {
                                            i11 = xc2.P(10, M0) ? 21 : 22;
                                            j7 = e;
                                            chat = M0;
                                            str3 = str2;
                                            j8 = j6;
                                            i20 = i11;
                                            i4 = i5;
                                            z14 = z21;
                                            arrayList4 = arrayList19;
                                            peer = y1;
                                            arrayList5 = arrayList22;
                                            inputPeer = inputPeer2;
                                            zh6Var2 = zh6Var4;
                                            i19 = i4 + 1;
                                            arrayList14 = arrayList;
                                            zh6Var4 = zh6Var2;
                                            y1 = peer;
                                            e = j7;
                                            j6 = j8;
                                            arrayList19 = arrayList4;
                                            M0 = chat;
                                            str2 = str3;
                                            i17 = 0;
                                            inputPeer2 = inputPeer;
                                            arrayList22 = arrayList5;
                                            z21 = z14;
                                        }
                                    }
                                    arrayList2 = arrayList21;
                                    j7 = e;
                                    chat = M0;
                                    str3 = str2;
                                    j8 = j6;
                                    zh6Var = zh6Var6;
                                    i4 = i5;
                                    z14 = z21;
                                    arrayList4 = arrayList19;
                                    peer = y1;
                                    arrayList3 = arrayList20;
                                    arrayList5 = arrayList22;
                                    inputPeer = inputPeer2;
                                    zh6Var2 = zh6Var4;
                                }
                                if (v && r47.Q4(r47Var3.k)) {
                                    if (M0 != null) {
                                        if (i20 == 0) {
                                            i13 = xc2.P(20, M0) ? 13 : 14;
                                            i20 = i13;
                                            j7 = e;
                                            chat = M0;
                                            str3 = str2;
                                            j8 = j6;
                                            i4 = i5;
                                            z14 = z21;
                                            arrayList4 = arrayList19;
                                            peer = y1;
                                            arrayList5 = arrayList22;
                                            inputPeer = inputPeer2;
                                            zh6Var2 = zh6Var4;
                                            i19 = i4 + 1;
                                            arrayList14 = arrayList;
                                            zh6Var4 = zh6Var2;
                                            y1 = peer;
                                            e = j7;
                                            j6 = j8;
                                            arrayList19 = arrayList4;
                                            M0 = chat;
                                            str2 = str3;
                                            i17 = 0;
                                            inputPeer2 = inputPeer;
                                            arrayList22 = arrayList5;
                                            z21 = z14;
                                        }
                                    } else if (i20 == 0) {
                                        j7 = e;
                                        chat = M0;
                                        str3 = str2;
                                        j8 = j6;
                                        i20 = 7;
                                        i4 = i5;
                                        z14 = z21;
                                        arrayList4 = arrayList19;
                                        peer = y1;
                                        arrayList5 = arrayList22;
                                        inputPeer = inputPeer2;
                                        zh6Var2 = zh6Var4;
                                        i19 = i4 + 1;
                                        arrayList14 = arrayList;
                                        zh6Var4 = zh6Var2;
                                        y1 = peer;
                                        e = j7;
                                        j6 = j8;
                                        arrayList19 = arrayList4;
                                        M0 = chat;
                                        str2 = str3;
                                        i17 = 0;
                                        inputPeer2 = inputPeer;
                                        arrayList22 = arrayList5;
                                        z21 = z14;
                                    }
                                } else if (s && r47.i4(r47Var3.k)) {
                                    if (M0 != null) {
                                        if (i20 == 0) {
                                            i12 = xc2.P(21, M0) ? 15 : 16;
                                            j7 = e;
                                            chat = M0;
                                            str3 = str2;
                                            j8 = j6;
                                            i20 = i12;
                                            i4 = i5;
                                            z14 = z21;
                                            arrayList4 = arrayList19;
                                            peer = y1;
                                            arrayList5 = arrayList22;
                                            inputPeer = inputPeer2;
                                            zh6Var2 = zh6Var4;
                                            i19 = i4 + 1;
                                            arrayList14 = arrayList;
                                            zh6Var4 = zh6Var2;
                                            y1 = peer;
                                            e = j7;
                                            j6 = j8;
                                            arrayList19 = arrayList4;
                                            M0 = chat;
                                            str2 = str3;
                                            i17 = 0;
                                            inputPeer2 = inputPeer;
                                            arrayList22 = arrayList5;
                                            z21 = z14;
                                        }
                                    } else if (i20 == 0) {
                                        j7 = e;
                                        chat = M0;
                                        str3 = str2;
                                        j8 = j6;
                                        i4 = i5;
                                        z14 = z21;
                                        arrayList4 = arrayList19;
                                        i20 = 8;
                                        peer = y1;
                                        arrayList5 = arrayList22;
                                        inputPeer = inputPeer2;
                                        zh6Var2 = zh6Var4;
                                        i19 = i4 + 1;
                                        arrayList14 = arrayList;
                                        zh6Var4 = zh6Var2;
                                        y1 = peer;
                                        e = j7;
                                        j6 = j8;
                                        arrayList19 = arrayList4;
                                        M0 = chat;
                                        str2 = str3;
                                        i17 = 0;
                                        inputPeer2 = inputPeer;
                                        arrayList22 = arrayList5;
                                        z21 = z14;
                                    }
                                } else if (!z8 || !(r47Var3.k.media instanceof TLRPC.TL_messageMediaDocument) || i6 != 0) {
                                    tL_message = new TLRPC.TL_message();
                                    if (z || (r47Var3.k.media instanceof TLRPC.TL_messageMediaWidget)) {
                                        if (r47.B0(r47Var3.k) == e || !r47Var3.p3()) {
                                            arrayList6 = arrayList20;
                                            zh6Var3 = zh6Var6;
                                        } else {
                                            arrayList6 = arrayList20;
                                            zh6Var3 = zh6Var6;
                                            if (r47Var3.k.from_id.user_id == e) {
                                                i7 = i18;
                                                if (r47.l3(r47Var3.k)) {
                                                    TLRPC.TL_messageFwdHeader tL_messageFwdHeader = new TLRPC.TL_messageFwdHeader();
                                                    tL_message.fwd_from = tL_messageFwdHeader;
                                                    TLRPC.Message message6 = r47Var3.k;
                                                    TLRPC.MessageFwdHeader messageFwdHeader3 = message6.fwd_from;
                                                    if ((messageFwdHeader3.flags & 1) != 0) {
                                                        tL_messageFwdHeader.flags |= 1;
                                                        tL_messageFwdHeader.from_id = messageFwdHeader3.from_id;
                                                    }
                                                    if ((messageFwdHeader3.flags & 32) != 0) {
                                                        tL_messageFwdHeader.flags |= 32;
                                                        tL_messageFwdHeader.from_name = messageFwdHeader3.from_name;
                                                    }
                                                    if ((messageFwdHeader3.flags & 4) != 0) {
                                                        tL_messageFwdHeader.flags |= 4;
                                                        tL_messageFwdHeader.channel_post = messageFwdHeader3.channel_post;
                                                    }
                                                    if ((messageFwdHeader3.flags & 8) != 0) {
                                                        tL_messageFwdHeader.flags |= 8;
                                                        tL_messageFwdHeader.post_author = messageFwdHeader3.post_author;
                                                    }
                                                    if ((j12 == e || z10) && (messageFwdHeader3.flags & 16) != 0 && !lbc.A(r47.B0(message6))) {
                                                        TLRPC.MessageFwdHeader messageFwdHeader4 = tL_message.fwd_from;
                                                        messageFwdHeader4.flags |= 16;
                                                        TLRPC.MessageFwdHeader messageFwdHeader5 = r47Var3.k.fwd_from;
                                                        messageFwdHeader4.saved_from_peer = messageFwdHeader5.saved_from_peer;
                                                        messageFwdHeader4.saved_from_msg_id = messageFwdHeader5.saved_from_msg_id;
                                                    }
                                                    tL_message.fwd_from.date = r47Var3.k.fwd_from.date;
                                                    tL_message.flags = 4;
                                                } else if (i7 == 0) {
                                                    long Z0 = r47Var3.Z0();
                                                    TLRPC.TL_messageFwdHeader tL_messageFwdHeader2 = new TLRPC.TL_messageFwdHeader();
                                                    tL_message.fwd_from = tL_messageFwdHeader2;
                                                    tL_messageFwdHeader2.channel_post = r47Var3.e1();
                                                    tL_message.fwd_from.flags |= 4;
                                                    boolean p3 = r47Var3.p3();
                                                    TLRPC.MessageFwdHeader messageFwdHeader6 = tL_message.fwd_from;
                                                    if (p3) {
                                                        message = r47Var3.k;
                                                        messageFwdHeader6.from_id = message.from_id;
                                                        messageFwdHeader6.flags |= 1;
                                                        arrayList7 = arrayList21;
                                                        chat2 = M0;
                                                        str4 = str2;
                                                    } else {
                                                        messageFwdHeader6.from_id = new TLRPC.TL_peerChannel();
                                                        TLRPC.MessageFwdHeader messageFwdHeader7 = tL_message.fwd_from;
                                                        TLRPC.Peer peer4 = messageFwdHeader7.from_id;
                                                        TLRPC.Message message7 = r47Var3.k;
                                                        arrayList7 = arrayList21;
                                                        TLRPC.Peer peer5 = message7.peer_id;
                                                        chat2 = M0;
                                                        str4 = str2;
                                                        peer4.channel_id = peer5.channel_id;
                                                        messageFwdHeader7.flags |= 1;
                                                        if (message7.post && Z0 > 0) {
                                                            TLRPC.Peer peer6 = message7.from_id;
                                                            if (peer6 != null) {
                                                                peer5 = peer6;
                                                            }
                                                            messageFwdHeader7.from_id = peer5;
                                                        }
                                                        message = message7;
                                                    }
                                                    if (message.post_author == null && !r47Var3.O3() && Z0 > 0 && r47Var3.k.post && (X1 = getMessagesController().X1(Long.valueOf(Z0))) != null) {
                                                        tL_message.fwd_from.post_author = lv2.m(i17, X1.first_name, X1.last_name);
                                                        tL_message.fwd_from.flags |= 8;
                                                    }
                                                    tL_message.date = r47Var3.k.date;
                                                    tL_message.flags = 4;
                                                    if (j12 == e && (messageFwdHeader = tL_message.fwd_from) != null) {
                                                        messageFwdHeader.flags |= 16;
                                                        messageFwdHeader.saved_from_msg_id = r47Var3.e1();
                                                        TLRPC.MessageFwdHeader messageFwdHeader8 = tL_message.fwd_from;
                                                        TLRPC.Message message8 = r47Var3.k;
                                                        peer2 = message8.peer_id;
                                                        messageFwdHeader8.saved_from_peer = peer2;
                                                        if (peer2.user_id == e) {
                                                            peer2.user_id = r47.B0(message8);
                                                        }
                                                    }
                                                }
                                                arrayList7 = arrayList21;
                                                chat2 = M0;
                                                str4 = str2;
                                                if (j12 == e) {
                                                    messageFwdHeader.flags |= 16;
                                                    messageFwdHeader.saved_from_msg_id = r47Var3.e1();
                                                    TLRPC.MessageFwdHeader messageFwdHeader82 = tL_message.fwd_from;
                                                    TLRPC.Message message82 = r47Var3.k;
                                                    peer2 = message82.peer_id;
                                                    messageFwdHeader82.saved_from_peer = peer2;
                                                    if (peer2.user_id == e) {
                                                    }
                                                }
                                            }
                                        }
                                        i7 = i17;
                                        if (r47.l3(r47Var3.k)) {
                                        }
                                        arrayList7 = arrayList21;
                                        chat2 = M0;
                                        str4 = str2;
                                        if (j12 == e) {
                                        }
                                    } else {
                                        arrayList7 = arrayList21;
                                        chat2 = M0;
                                        str4 = str2;
                                        arrayList6 = arrayList20;
                                        zh6Var3 = zh6Var6;
                                    }
                                    if (r47Var3.a5() && (messageFwdHeader2 = tL_message.fwd_from) != null && messageFwdHeader2.from_id != null) {
                                        messageFwdHeader2.from_id = (TLRPC.Peer) TLObject.deepCopy(r47Var3.k.peer_id, new hz6((byte) 11));
                                        n = wf3.n(r47Var3.k.from_id);
                                        if (n > 0) {
                                            tL_message.via_bot_id = n;
                                        }
                                    }
                                    HashMap<String, String> hashMap = new HashMap<>();
                                    tL_message.params = hashMap;
                                    hashMap.put("fwd_id", String.valueOf(r47Var3.e1()));
                                    tL_message.params.put("fwd_peer", String.valueOf(r47.B0(r47Var3.k)));
                                    if (!r47Var3.k.restriction_reason.isEmpty()) {
                                        tL_message.restriction_reason = r47Var3.k.restriction_reason;
                                        tL_message.flags |= TLObject.FLAG_22;
                                    }
                                    if (z7 && (r47Var3.k.media instanceof TLRPC.TL_messageMediaWebPage)) {
                                        messageMedia = new TLRPC.TL_messageMediaEmpty();
                                        tL_message.media = messageMedia;
                                    } else {
                                        messageMedia = r47Var3.k.media;
                                        if (messageMedia instanceof TLRPC.TL_messageMediaWidget) {
                                            tL_message.media = messageMedia;
                                        } else {
                                            TLRPC.TL_messageMediaWidget tL_messageMediaWidget = (TLRPC.TL_messageMediaWidget) messageMedia;
                                            TLRPC.TL_messageMediaWidget tL_messageMediaWidget2 = new TLRPC.TL_messageMediaWidget();
                                            tL_messageMediaWidget2.is_copy = i18;
                                            tL_messageMediaWidget2.width = tL_messageMediaWidget.width;
                                            tL_messageMediaWidget2.height = tL_messageMediaWidget.height;
                                            tL_messageMediaWidget2.payload = tL_messageMediaWidget.payload;
                                            tL_messageMediaWidget2.public_data = tL_messageMediaWidget.public_data;
                                            tL_messageMediaWidget2.public_data_hash = tL_messageMediaWidget.public_data_hash;
                                            tL_messageMediaWidget2.widget_id = tL_messageMediaWidget.widget_id;
                                            tL_message.media = tL_messageMediaWidget2;
                                            messageMedia = tL_messageMediaWidget2;
                                        }
                                    }
                                    TLRPC.Message message9 = r47Var3.k;
                                    tL_message.invert_media = message9.invert_media;
                                    if (messageMedia != null) {
                                        tL_message.flags |= 512;
                                    }
                                    j9 = message9.via_bot_id;
                                    if (j9 != 0) {
                                        tL_message.via_bot_id = j9;
                                        tL_message.flags |= 2048;
                                    }
                                    if (j6 != 0) {
                                        TLRPC.TL_messageReplies tL_messageReplies = new TLRPC.TL_messageReplies();
                                        tL_message.replies = tL_messageReplies;
                                        tL_messageReplies.comments = true;
                                        tL_messageReplies.channel_id = j6;
                                        tL_messageReplies.flags |= 1;
                                        tL_message.flags |= TLObject.FLAG_23;
                                    }
                                    if (z2 || tL_message.media == null) {
                                        tL_message.message = r47Var3.k.message;
                                    }
                                    richMessage = r47Var3.k.rich_message;
                                    if (richMessage != null) {
                                        tL_message.flags2 |= TLObject.FLAG_13;
                                        tL_message.rich_message = richMessage;
                                    }
                                    if (tL_message.message == null) {
                                        tL_message.message = "";
                                    }
                                    tL_message.fwd_msg_id = r47Var3.e1();
                                    TLRPC.Message message10 = r47Var3.k;
                                    tL_message.attachPath = message10.attachPath;
                                    tL_message.entities = message10.entities;
                                    replyMarkup = message10.reply_markup;
                                    if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                        j8 = j6;
                                    } else {
                                        TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = (TLRPC.TL_replyInlineMarkup) replyMarkup;
                                        TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup2 = new TLRPC.TL_replyInlineMarkup();
                                        tL_message.reply_markup = tL_replyInlineMarkup2;
                                        int size = tL_replyInlineMarkup.rows.size();
                                        int i21 = 0;
                                        boolean z23 = false;
                                        while (true) {
                                            j8 = j6;
                                            if (i21 >= size) {
                                                break;
                                            }
                                            TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = tL_replyInlineMarkup.rows.get(i21);
                                            int size2 = keyboardInlineButtonRow.buttons.size();
                                            TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup3 = tL_replyInlineMarkup;
                                            int i22 = 0;
                                            TL_keyboard.TL_keyboardInlineButtonRow tL_keyboardInlineButtonRow2 = null;
                                            while (true) {
                                                if (i22 >= size2) {
                                                    break;
                                                }
                                                int i23 = size2;
                                                TL_keyboard.KeyboardInlineButton keyboardInlineButton = keyboardInlineButtonRow.buttons.get(i22);
                                                int i24 = i22;
                                                TL_keyboard.TL_inlineButtonTypeUrlAuth tL_inlineButtonTypeUrlAuth = (TL_keyboard.TL_inlineButtonTypeUrlAuth) ehb.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class);
                                                TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow2 = keyboardInlineButtonRow;
                                                if (tL_inlineButtonTypeUrlAuth == null && !ehb.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) && !ehb.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) && !ehb.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                                                    z23 = true;
                                                    break;
                                                }
                                                if (tL_inlineButtonTypeUrlAuth != null) {
                                                    TL_keyboard.TL_keyboardInlineButton tL_keyboardInlineButton = new TL_keyboard.TL_keyboardInlineButton();
                                                    i9 = size;
                                                    TL_keyboard.TL_inlineButtonTypeUrlAuth tL_inlineButtonTypeUrlAuth2 = new TL_keyboard.TL_inlineButtonTypeUrlAuth();
                                                    tL_keyboardInlineButton.type = tL_inlineButtonTypeUrlAuth2;
                                                    i10 = i21;
                                                    tL_inlineButtonTypeUrlAuth2.flags = tL_inlineButtonTypeUrlAuth.flags;
                                                    tL_keyboardInlineButton.style = keyboardInlineButton.style;
                                                    String str6 = tL_inlineButtonTypeUrlAuth.fwd_text;
                                                    if (str6 != null) {
                                                        tL_inlineButtonTypeUrlAuth2.fwd_text = str6;
                                                        tL_keyboardInlineButton.text = str6;
                                                    } else {
                                                        tL_keyboardInlineButton.text = keyboardInlineButton.text;
                                                    }
                                                    tL_inlineButtonTypeUrlAuth2.url = tL_inlineButtonTypeUrlAuth.url;
                                                    tL_inlineButtonTypeUrlAuth2.button_id = tL_inlineButtonTypeUrlAuth.button_id;
                                                    keyboardInlineButton = tL_keyboardInlineButton;
                                                } else {
                                                    i9 = size;
                                                    i10 = i21;
                                                }
                                                if (tL_keyboardInlineButtonRow2 == null) {
                                                    tL_keyboardInlineButtonRow = new TL_keyboard.TL_keyboardInlineButtonRow();
                                                    tL_replyInlineMarkup2.rows.add(tL_keyboardInlineButtonRow);
                                                } else {
                                                    tL_keyboardInlineButtonRow = tL_keyboardInlineButtonRow2;
                                                }
                                                tL_keyboardInlineButtonRow.buttons.add(keyboardInlineButton);
                                                tL_keyboardInlineButtonRow2 = tL_keyboardInlineButtonRow;
                                                i22 = i24 + 1;
                                                size2 = i23;
                                                keyboardInlineButtonRow = keyboardInlineButtonRow2;
                                                size = i9;
                                                i21 = i10;
                                            }
                                            int i25 = size;
                                            int i26 = i21;
                                            if (z23) {
                                                break;
                                            }
                                            i21 = i26 + 1;
                                            tL_replyInlineMarkup = tL_replyInlineMarkup3;
                                            j6 = j8;
                                            size = i25;
                                        }
                                        if (z23) {
                                            r47Var3.k.reply_markup = null;
                                            tL_message.flags &= -65;
                                        } else {
                                            tL_message.flags |= 64;
                                        }
                                    }
                                    if (!tL_message.entities.isEmpty()) {
                                        tL_message.flags |= 128;
                                    }
                                    if (tL_message.attachPath == null) {
                                        tL_message.attachPath = "";
                                    }
                                    int i27 = getUserConfig().i();
                                    tL_message.id = i27;
                                    tL_message.local_id = i27;
                                    tL_message.out = true;
                                    j10 = r47Var3.k.grouped_id;
                                    if (j10 != 0) {
                                        Long l2 = (Long) zh6Var4.f(j10);
                                        if (l2 == null) {
                                            l2 = Long.valueOf(Utilities.b.nextLong());
                                            zh6Var4.k(r47Var3.k.grouped_id, l2);
                                        }
                                        tL_message.grouped_id = l2.longValue();
                                        tL_message.flags |= 131072;
                                    }
                                    if (y1.channel_id == 0 && z10) {
                                        if (z11) {
                                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                            tL_message.from_id = tL_peerUser;
                                            tL_peerUser.user_id = e;
                                        } else {
                                            tL_message.from_id = y1;
                                        }
                                        tL_message.post = true;
                                        chat3 = chat2;
                                    } else {
                                        chat3 = chat2;
                                        M = xc2.M(chat3, getMessagesController().N0(-j12), true);
                                        if (M != e) {
                                            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                                            tL_message.from_id = tL_peerUser2;
                                            tL_peerUser2.user_id = e;
                                            tL_message.flags |= 256;
                                        } else {
                                            tL_message.from_id = getMessagesController().y1(M);
                                            str5 = str4;
                                            if (str4 != null) {
                                                tL_message.post_author = str5;
                                                tL_message.flags |= 65536;
                                            }
                                            j11 = tL_message.random_id;
                                            if (j11 == 0) {
                                                j11 = D();
                                                tL_message.random_id = j11;
                                            }
                                            Long valueOf = Long.valueOf(j11);
                                            ArrayList<Long> arrayList23 = arrayList6;
                                            arrayList23.add(valueOf);
                                            zh6 zh6Var7 = zh6Var3;
                                            zh6Var7.k(tL_message.random_id, tL_message);
                                            if (r47.c3(r47Var3.k)) {
                                                arrayList8 = arrayList7;
                                                arrayList8.add(Integer.valueOf(tL_message.fwd_msg_id));
                                                z15 = z22;
                                            } else {
                                                arrayList8 = arrayList7;
                                                arrayList8.add(Integer.valueOf(r47Var3.P0()));
                                                z15 = true;
                                            }
                                            tL_message.date = i == 0 ? i : getConnectionsManager().getCurrentTime();
                                            TLRPC.InputPeer inputPeer3 = inputPeer2;
                                            z16 = inputPeer3 instanceof TLRPC.TL_inputPeerChannel;
                                            if (z16 || !z10) {
                                                str3 = str5;
                                                message2 = r47Var3.k;
                                                j7 = e;
                                                if ((message2.flags & 1024) != 0 && i == 0) {
                                                    tL_message.views = message2.views;
                                                    tL_message.flags |= 1024;
                                                }
                                                tL_message.unread = true;
                                            } else {
                                                str3 = str5;
                                                if (i == 0) {
                                                    tL_message.views = 1;
                                                    tL_message.flags |= 1024;
                                                }
                                                j7 = e;
                                            }
                                            tL_message.dialog_id = j12;
                                            tL_message.peer_id = y1;
                                            if (!r47.Q4(tL_message) || r47.i4(tL_message)) {
                                                if (z16 || r47.v0(r47Var3.k) == 0) {
                                                    tL_message.media_unread = true;
                                                } else {
                                                    tL_message.media_unread = r47Var3.k.media_unread;
                                                }
                                            }
                                            if (r47Var == null && b77Var == null && (messageReplyHeader = (message3 = r47Var3.k).reply_to) != null) {
                                                peer3 = messageReplyHeader.reply_to_peer_id;
                                                if (peer3 != null || r47.u5(peer3, message3.peer_id)) {
                                                    messageReplyHeader2 = r47Var3.k.reply_to;
                                                    if ((messageReplyHeader2.flags & 16) != 0) {
                                                    }
                                                }
                                                tL_message.flags |= 8;
                                                tL_message.reply_to = r47Var3.k.reply_to;
                                            }
                                            if (j2 > 0) {
                                                tL_message.flags2 |= 64;
                                                tL_message.paid_message_stars = j2;
                                            }
                                            if (j3 != 0) {
                                                tL_message.saved_peer_id = getMessagesController().y1(j3);
                                                tL_message.flags |= TLObject.FLAG_28;
                                            }
                                            if (b77Var != null) {
                                                tL_message.suggested_post = b77Var.c();
                                            }
                                            zh6Var2 = zh6Var4;
                                            r47 r47Var4 = new r47(this.currentAccount, tL_message, true, true);
                                            r47Var4.r1 = i == 0;
                                            r47Var4.k.send_state = 1;
                                            r47Var4.X1 = true;
                                            ArrayList arrayList24 = arrayList22;
                                            arrayList24.add(r47Var4);
                                            arrayList9 = arrayList19;
                                            arrayList9.add(tL_message);
                                            TLRPC.Peer peer7 = y1;
                                            chat = chat3;
                                            jxa.v(this.currentAccount, false).b(r47Var4);
                                            if (r47Var3.C != null) {
                                                int i28 = 0;
                                                while (i28 < arrayList.size()) {
                                                    arrayList10 = arrayList;
                                                    int i29 = i28;
                                                    if (((r47) arrayList10.get(i28)).e1() == r47Var3.C.e1()) {
                                                        TLRPC.Message message11 = r47Var4.k;
                                                        r47 r47Var5 = r47Var3.C;
                                                        message11.replyMessage = r47Var5.k;
                                                        r47Var4.C = r47Var5;
                                                        break;
                                                    }
                                                    i28 = i29 + 1;
                                                }
                                            }
                                            arrayList10 = arrayList;
                                            e0(tL_message, i == 0);
                                            if (f11.a) {
                                                StringBuilder sb = new StringBuilder("forward message user_id = ");
                                                sb.append(inputPeer3.user_id);
                                                sb.append(" chat_id = ");
                                                sb.append(inputPeer3.chat_id);
                                                sb.append(" channel_id = ");
                                                sb.append(inputPeer3.channel_id);
                                                sb.append(" access_hash = ");
                                                ik8.q(inputPeer3.access_hash, sb);
                                            }
                                            if (r47Var != null && b77Var == null) {
                                                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                                tL_message.reply_to = tL_messageReplyHeader;
                                                tL_messageReplyHeader.flags |= 16;
                                                tL_messageReplyHeader.reply_to_msg_id = r47Var.e1();
                                                if (r47Var.p) {
                                                    TLRPC.MessageReplyHeader messageReplyHeader3 = tL_message.reply_to;
                                                    messageReplyHeader3.forum_topic = true;
                                                    messageReplyHeader3.flags |= 8;
                                                }
                                            }
                                            if (arrayList9.size() == 100) {
                                                i8 = i5;
                                                if (i8 != arrayList10.size() - 1 && (i8 == arrayList10.size() - 1 || r47.B0(((r47) arrayList10.get(i8 + 1)).k) == r47.B0(r47Var3.k))) {
                                                    arrayList4 = arrayList9;
                                                    arrayList3 = arrayList23;
                                                    arrayList2 = arrayList8;
                                                    peer = peer7;
                                                    zh6Var = zh6Var7;
                                                    i18 = 1;
                                                    inputPeer = inputPeer3;
                                                    z14 = z21;
                                                    arrayList5 = arrayList24;
                                                    j12 = j;
                                                    i4 = i8;
                                                    z22 = z15;
                                                }
                                            } else {
                                                i8 = i5;
                                            }
                                            getMessagesStorage().f1(0, i == 0 ? 1 : 0, 0L, new ArrayList(arrayList9), false);
                                            getMessagesController().z5(i == 0 ? 1 : 0, j, arrayList24);
                                            getNotificationCenter().k(jn7.r, new Object[0]);
                                            getUserConfig().u(false);
                                            tL_messages_forwardMessages = new TLRPC.TL_messages_forwardMessages();
                                            tL_messages_forwardMessages.to_peer = inputPeer3;
                                            tL_messages_forwardMessages.silent = z3 || qu6.v("silent_", j, uc7.s1(this.currentAccount).W3, false);
                                            if (r47Var != null) {
                                                tL_messages_forwardMessages.top_msg_id = r47Var.e1();
                                                tL_messages_forwardMessages.flags |= 512;
                                            }
                                            if (i != 0) {
                                                tL_messages_forwardMessages.schedule_date = i;
                                                int i30 = tL_messages_forwardMessages.flags;
                                                tL_messages_forwardMessages.flags = i30 | 1024;
                                                if (i2 != 0) {
                                                    tL_messages_forwardMessages.schedule_repeat_period = i2;
                                                    tL_messages_forwardMessages.flags = i30 | 16778240;
                                                }
                                            }
                                            if (r47Var3.k.peer_id instanceof TLRPC.TL_peerChannel) {
                                                arrayList11 = arrayList9;
                                                tL_messages_forwardMessages.from_peer = new TLRPC.TL_inputPeerEmpty();
                                            } else {
                                                TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(r47Var3.k.peer_id.channel_id));
                                                TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                                                tL_messages_forwardMessages.from_peer = tL_inputPeerChannel;
                                                arrayList11 = arrayList9;
                                                tL_inputPeerChannel.channel_id = r47Var3.k.peer_id.channel_id;
                                                if (M02 != null) {
                                                    tL_inputPeerChannel.access_hash = M02.access_hash;
                                                }
                                            }
                                            tL_messages_forwardMessages.random_id = arrayList23;
                                            tL_messages_forwardMessages.id = arrayList8;
                                            tL_messages_forwardMessages.drop_author = z;
                                            tL_messages_forwardMessages.drop_media_captions = z2;
                                            tL_messages_forwardMessages.with_my_score = arrayList10.size() != 1 && ((r47) arrayList10.get(0)).k.with_my_score;
                                            tL_messages_forwardMessages.from_ephemeral = z15;
                                            if (i3 >= 0) {
                                                tL_messages_forwardMessages.flags |= TLObject.FLAG_20;
                                                tL_messages_forwardMessages.video_timestamp = i3;
                                            }
                                            if (j2 > 0) {
                                                tL_messages_forwardMessages.flags |= TLObject.FLAG_21;
                                                tL_messages_forwardMessages.allow_paid_stars = tL_messages_forwardMessages.id.size() * j2;
                                            }
                                            if (b77Var != null) {
                                                tL_messages_forwardMessages.suggested_post = b77Var.c();
                                                if (r47Var != null) {
                                                    TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                                                    tL_messages_forwardMessages.reply_to = tL_inputReplyToMessage;
                                                    tL_inputReplyToMessage.reply_to_msg_id = r47Var.e1();
                                                }
                                            }
                                            a(tL_messages_forwardMessages, j3);
                                            arrayList12 = new ArrayList(arrayList24);
                                            if (i != 2147483646) {
                                                arrayList13 = arrayList23;
                                                z17 = true;
                                            } else {
                                                arrayList13 = arrayList23;
                                                z17 = false;
                                            }
                                            arrayList2 = arrayList8;
                                            ArrayList arrayList25 = arrayList11;
                                            i18 = 1;
                                            arrayList3 = arrayList13;
                                            inputPeer = inputPeer3;
                                            boolean z24 = z21;
                                            arrayList5 = arrayList24;
                                            zh6Var = zh6Var7;
                                            arrayList4 = arrayList25;
                                            peer = peer7;
                                            z14 = z24;
                                            o97Var = new o97(this, tL_messages_forwardMessages, arrayList12, new o6a(i, j, zh6Var7, r47Var3, this, arrayList25, arrayList12, peer7, tL_messages_forwardMessages, z17, z24), (byte) 4);
                                            if (jxa.v(this.currentAccount, false).a(tL_messages_forwardMessages, arrayList12, o97Var)) {
                                                o97Var.run();
                                            }
                                            if (i8 != arrayList.size() - 1) {
                                                ArrayList arrayList26 = new ArrayList();
                                                ArrayList arrayList27 = new ArrayList();
                                                ArrayList<Long> arrayList28 = new ArrayList<>();
                                                ArrayList<Integer> arrayList29 = new ArrayList<>();
                                                arrayList5 = arrayList26;
                                                arrayList4 = arrayList27;
                                                arrayList20 = arrayList28;
                                                zh6Var6 = new zh6();
                                                i4 = i8;
                                                z22 = z15;
                                                j12 = j;
                                                arrayList21 = arrayList29;
                                                i19 = i4 + 1;
                                                arrayList14 = arrayList;
                                                zh6Var4 = zh6Var2;
                                                y1 = peer;
                                                e = j7;
                                                j6 = j8;
                                                arrayList19 = arrayList4;
                                                M0 = chat;
                                                str2 = str3;
                                                i17 = 0;
                                                inputPeer2 = inputPeer;
                                                arrayList22 = arrayList5;
                                                z21 = z14;
                                            }
                                            j12 = j;
                                            i4 = i8;
                                            z22 = z15;
                                        }
                                    }
                                    str5 = str4;
                                    j11 = tL_message.random_id;
                                    if (j11 == 0) {
                                    }
                                    Long valueOf2 = Long.valueOf(j11);
                                    ArrayList<Long> arrayList232 = arrayList6;
                                    arrayList232.add(valueOf2);
                                    zh6 zh6Var72 = zh6Var3;
                                    zh6Var72.k(tL_message.random_id, tL_message);
                                    if (r47.c3(r47Var3.k)) {
                                    }
                                    tL_message.date = i == 0 ? i : getConnectionsManager().getCurrentTime();
                                    TLRPC.InputPeer inputPeer32 = inputPeer2;
                                    z16 = inputPeer32 instanceof TLRPC.TL_inputPeerChannel;
                                    if (z16) {
                                    }
                                    str3 = str5;
                                    message2 = r47Var3.k;
                                    j7 = e;
                                    if ((message2.flags & 1024) != 0) {
                                        tL_message.views = message2.views;
                                        tL_message.flags |= 1024;
                                    }
                                    tL_message.unread = true;
                                    tL_message.dialog_id = j12;
                                    tL_message.peer_id = y1;
                                    if (!r47.Q4(tL_message)) {
                                    }
                                    if (z16) {
                                    }
                                    tL_message.media_unread = true;
                                    if (r47Var == null) {
                                        peer3 = messageReplyHeader.reply_to_peer_id;
                                        if (peer3 != null) {
                                        }
                                        messageReplyHeader2 = r47Var3.k.reply_to;
                                        if ((messageReplyHeader2.flags & 16) != 0) {
                                        }
                                    }
                                    if (j2 > 0) {
                                    }
                                    if (j3 != 0) {
                                    }
                                    if (b77Var != null) {
                                    }
                                    zh6Var2 = zh6Var4;
                                    r47 r47Var42 = new r47(this.currentAccount, tL_message, true, true);
                                    r47Var42.r1 = i == 0;
                                    r47Var42.k.send_state = 1;
                                    r47Var42.X1 = true;
                                    ArrayList arrayList242 = arrayList22;
                                    arrayList242.add(r47Var42);
                                    arrayList9 = arrayList19;
                                    arrayList9.add(tL_message);
                                    TLRPC.Peer peer72 = y1;
                                    chat = chat3;
                                    jxa.v(this.currentAccount, false).b(r47Var42);
                                    if (r47Var3.C != null) {
                                    }
                                    arrayList10 = arrayList;
                                    e0(tL_message, i == 0);
                                    if (f11.a) {
                                    }
                                    if (r47Var != null) {
                                        TLRPC.TL_messageReplyHeader tL_messageReplyHeader2 = new TLRPC.TL_messageReplyHeader();
                                        tL_message.reply_to = tL_messageReplyHeader2;
                                        tL_messageReplyHeader2.flags |= 16;
                                        tL_messageReplyHeader2.reply_to_msg_id = r47Var.e1();
                                        if (r47Var.p) {
                                        }
                                    }
                                    if (arrayList9.size() == 100) {
                                    }
                                    getMessagesStorage().f1(0, i == 0 ? 1 : 0, 0L, new ArrayList(arrayList9), false);
                                    getMessagesController().z5(i == 0 ? 1 : 0, j, arrayList242);
                                    getNotificationCenter().k(jn7.r, new Object[0]);
                                    getUserConfig().u(false);
                                    tL_messages_forwardMessages = new TLRPC.TL_messages_forwardMessages();
                                    tL_messages_forwardMessages.to_peer = inputPeer32;
                                    tL_messages_forwardMessages.silent = z3 || qu6.v("silent_", j, uc7.s1(this.currentAccount).W3, false);
                                    if (r47Var != null) {
                                    }
                                    if (i != 0) {
                                    }
                                    if (r47Var3.k.peer_id instanceof TLRPC.TL_peerChannel) {
                                    }
                                    tL_messages_forwardMessages.random_id = arrayList232;
                                    tL_messages_forwardMessages.id = arrayList8;
                                    tL_messages_forwardMessages.drop_author = z;
                                    tL_messages_forwardMessages.drop_media_captions = z2;
                                    tL_messages_forwardMessages.with_my_score = arrayList10.size() != 1 && ((r47) arrayList10.get(0)).k.with_my_score;
                                    tL_messages_forwardMessages.from_ephemeral = z15;
                                    if (i3 >= 0) {
                                    }
                                    if (j2 > 0) {
                                    }
                                    if (b77Var != null) {
                                    }
                                    a(tL_messages_forwardMessages, j3);
                                    arrayList12 = new ArrayList(arrayList242);
                                    if (i != 2147483646) {
                                    }
                                    arrayList2 = arrayList8;
                                    ArrayList arrayList252 = arrayList11;
                                    i18 = 1;
                                    arrayList3 = arrayList13;
                                    inputPeer = inputPeer32;
                                    boolean z242 = z21;
                                    arrayList5 = arrayList242;
                                    zh6Var = zh6Var72;
                                    arrayList4 = arrayList252;
                                    peer = peer72;
                                    z14 = z242;
                                    o97Var = new o97(this, tL_messages_forwardMessages, arrayList12, new o6a(i, j, zh6Var72, r47Var3, this, arrayList252, arrayList12, peer72, tL_messages_forwardMessages, z17, z242), (byte) 4);
                                    if (jxa.v(this.currentAccount, false).a(tL_messages_forwardMessages, arrayList12, o97Var)) {
                                    }
                                    if (i8 != arrayList.size() - 1) {
                                    }
                                    j12 = j;
                                    i4 = i8;
                                    z22 = z15;
                                } else if (i20 == 0) {
                                    i11 = xc2.P(19, M0) ? 17 : 18;
                                    j7 = e;
                                    chat = M0;
                                    str3 = str2;
                                    j8 = j6;
                                    i20 = i11;
                                    i4 = i5;
                                    z14 = z21;
                                    arrayList4 = arrayList19;
                                    peer = y1;
                                    arrayList5 = arrayList22;
                                    inputPeer = inputPeer2;
                                    zh6Var2 = zh6Var4;
                                    i19 = i4 + 1;
                                    arrayList14 = arrayList;
                                    zh6Var4 = zh6Var2;
                                    y1 = peer;
                                    e = j7;
                                    j6 = j8;
                                    arrayList19 = arrayList4;
                                    M0 = chat;
                                    str2 = str3;
                                    i17 = 0;
                                    inputPeer2 = inputPeer;
                                    arrayList22 = arrayList5;
                                    z21 = z14;
                                }
                                arrayList2 = arrayList21;
                                j7 = e;
                                chat = M0;
                                str3 = str2;
                                j8 = j6;
                                zh6Var = zh6Var6;
                                i4 = i5;
                                z14 = z21;
                                arrayList4 = arrayList19;
                                peer = y1;
                                arrayList3 = arrayList20;
                                arrayList5 = arrayList22;
                                inputPeer = inputPeer2;
                                zh6Var2 = zh6Var4;
                            }
                        } else {
                            if (i20 == 0) {
                                i12 = xc2.P(8, M0) ? 4 : i18;
                                j7 = e;
                                chat = M0;
                                str3 = str2;
                                j8 = j6;
                                i20 = i12;
                                i4 = i5;
                                z14 = z21;
                                arrayList4 = arrayList19;
                                peer = y1;
                                arrayList5 = arrayList22;
                                inputPeer = inputPeer2;
                                zh6Var2 = zh6Var4;
                                i19 = i4 + 1;
                                arrayList14 = arrayList;
                                zh6Var4 = zh6Var2;
                                y1 = peer;
                                e = j7;
                                j6 = j8;
                                arrayList19 = arrayList4;
                                M0 = chat;
                                str2 = str3;
                                i17 = 0;
                                inputPeer2 = inputPeer;
                                arrayList22 = arrayList5;
                                z21 = z14;
                            }
                            arrayList2 = arrayList21;
                            j7 = e;
                            chat = M0;
                            str3 = str2;
                            j8 = j6;
                            zh6Var = zh6Var6;
                            i4 = i5;
                            z14 = z21;
                            arrayList4 = arrayList19;
                            peer = y1;
                            arrayList3 = arrayList20;
                            arrayList5 = arrayList22;
                            inputPeer = inputPeer2;
                            zh6Var2 = zh6Var4;
                        }
                    }
                }
                i6 = i18;
                if (z12) {
                }
                if (!z13) {
                }
                if (o) {
                }
                if (!z9) {
                }
                if (!z6) {
                }
                if (v) {
                }
                if (s) {
                }
                if (!z8) {
                }
                tL_message = new TLRPC.TL_message();
                if (z) {
                }
                if (r47.B0(r47Var3.k) == e) {
                }
                arrayList6 = arrayList20;
                zh6Var3 = zh6Var6;
                i7 = i17;
                if (r47.l3(r47Var3.k)) {
                }
                arrayList7 = arrayList21;
                chat2 = M0;
                str4 = str2;
                if (j12 == e) {
                }
                if (r47Var3.a5()) {
                    messageFwdHeader2.from_id = (TLRPC.Peer) TLObject.deepCopy(r47Var3.k.peer_id, new hz6((byte) 11));
                    n = wf3.n(r47Var3.k.from_id);
                    if (n > 0) {
                    }
                }
                HashMap<String, String> hashMap2 = new HashMap<>();
                tL_message.params = hashMap2;
                hashMap2.put("fwd_id", String.valueOf(r47Var3.e1()));
                tL_message.params.put("fwd_peer", String.valueOf(r47.B0(r47Var3.k)));
                if (!r47Var3.k.restriction_reason.isEmpty()) {
                }
                if (z7) {
                }
                messageMedia = r47Var3.k.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaWidget) {
                }
                TLRPC.Message message92 = r47Var3.k;
                tL_message.invert_media = message92.invert_media;
                if (messageMedia != null) {
                }
                j9 = message92.via_bot_id;
                if (j9 != 0) {
                }
                if (j6 != 0) {
                }
                if (z2) {
                }
                tL_message.message = r47Var3.k.message;
                richMessage = r47Var3.k.rich_message;
                if (richMessage != null) {
                }
                if (tL_message.message == null) {
                }
                tL_message.fwd_msg_id = r47Var3.e1();
                TLRPC.Message message102 = r47Var3.k;
                tL_message.attachPath = message102.attachPath;
                tL_message.entities = message102.entities;
                replyMarkup = message102.reply_markup;
                if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                }
                if (!tL_message.entities.isEmpty()) {
                }
                if (tL_message.attachPath == null) {
                }
                int i272 = getUserConfig().i();
                tL_message.id = i272;
                tL_message.local_id = i272;
                tL_message.out = true;
                j10 = r47Var3.k.grouped_id;
                if (j10 != 0) {
                }
                if (y1.channel_id == 0) {
                }
                chat3 = chat2;
                M = xc2.M(chat3, getMessagesController().N0(-j12), true);
                if (M != e) {
                }
            }
            arrayList20 = arrayList3;
            zh6Var6 = zh6Var;
            arrayList21 = arrayList2;
            i19 = i4 + 1;
            arrayList14 = arrayList;
            zh6Var4 = zh6Var2;
            y1 = peer;
            e = j7;
            j6 = j8;
            arrayList19 = arrayList4;
            M0 = chat;
            str2 = str3;
            i17 = 0;
            inputPeer2 = inputPeer;
            arrayList22 = arrayList5;
            z21 = z14;
        }
        return i20;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Not initialized variable reg: 76, insn: 0x26df: MOVE (r3 I:??[OBJECT, ARRAY]) = (r76 I:??[OBJECT, ARRAY]), block:B:1510:0x26df */
    public final void q0(p7a r107) {
        /*
            Method dump skipped, instructions count: 11434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r7a.q0(p7a):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r0(r47 r47Var, ArrayList arrayList, w49 w49Var, boolean z, boolean z2, e eVar, yp1 yp1Var) {
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji;
        if (r47Var == null || eVar == null) {
            return;
        }
        TLRPC.TL_messages_sendReaction tL_messages_sendReaction = new TLRPC.TL_messages_sendReaction();
        TLRPC.Message message = r47Var.k;
        if (!message.isThreadMessage || message.fwd_from == null) {
            tL_messages_sendReaction.peer = getMessagesController().j1(r47.B0(r47Var.k));
            tL_messages_sendReaction.msg_id = r47Var.e1();
        } else {
            tL_messages_sendReaction.peer = getMessagesController().j1(r47Var.Z0());
            tL_messages_sendReaction.msg_id = r47Var.k.fwd_from.saved_from_msg_id;
        }
        tL_messages_sendReaction.add_to_recent = z2;
        if (z2 && w49Var != null) {
            ArrayList arrayList2 = ls6.d0(this.currentAccount).F1;
            if (w49Var.f != null) {
                TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                tL_reactionEmoji.emoticon = w49Var.f;
                tL_reactionCustomEmoji = tL_reactionEmoji;
            } else {
                TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji2 = new TLRPC.TL_reactionCustomEmoji();
                tL_reactionCustomEmoji2.document_id = w49Var.g;
                tL_reactionCustomEmoji = tL_reactionCustomEmoji2;
            }
            arrayList2.add(0, tL_reactionCustomEmoji);
        }
        if (!arrayList.isEmpty()) {
            for (int i = 0; i < arrayList.size(); i++) {
                w49 w49Var2 = (w49) arrayList.get(i);
                if (w49Var2.g != 0) {
                    TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji3 = new TLRPC.TL_reactionCustomEmoji();
                    tL_reactionCustomEmoji3.document_id = w49Var2.g;
                    tL_messages_sendReaction.reaction.add(tL_reactionCustomEmoji3);
                    tL_messages_sendReaction.flags |= 1;
                } else if (w49Var2.f != null) {
                    TLRPC.TL_reactionEmoji tL_reactionEmoji2 = new TLRPC.TL_reactionEmoji();
                    tL_reactionEmoji2.emoticon = w49Var2.f;
                    tL_messages_sendReaction.reaction.add(tL_reactionEmoji2);
                    tL_messages_sendReaction.flags |= 1;
                }
            }
        }
        if (z) {
            tL_messages_sendReaction.flags |= 2;
            tL_messages_sendReaction.big = true;
        }
        getConnectionsManager().sendRequest(tL_messages_sendReaction, new ol7(this, yp1Var, (byte) 21));
    }

    /* JADX WARN: Code restructure failed: missing block: B:236:0x0595, code lost:
    
        if (r10.t == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x06ce, code lost:
    
        if (r7 == 19) goto L310;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x06f2 A[Catch: Exception -> 0x08a0, TryCatch #0 {Exception -> 0x08a0, blocks: (B:7:0x0025, B:9:0x002f, B:11:0x0041, B:17:0x0054, B:20:0x005e, B:22:0x0062, B:24:0x0066, B:25:0x0092, B:28:0x0098, B:30:0x009e, B:31:0x00a5, B:32:0x02bc, B:34:0x02c0, B:35:0x02c4, B:40:0x02dc, B:44:0x02e6, B:46:0x02ea, B:49:0x02fe, B:50:0x0313, B:52:0x0317, B:54:0x031d, B:57:0x0371, B:59:0x03a9, B:60:0x03b2, B:62:0x03bb, B:64:0x03c3, B:66:0x03c7, B:67:0x03ce, B:70:0x03d6, B:72:0x0401, B:74:0x0409, B:81:0x042c, B:84:0x06c4, B:86:0x06c8, B:92:0x06d3, B:94:0x06ee, B:103:0x07ca, B:106:0x07e6, B:112:0x07f3, B:114:0x0809, B:118:0x0810, B:124:0x082d, B:126:0x0843, B:132:0x0853, B:134:0x0869, B:138:0x0871, B:141:0x0887, B:143:0x06f2, B:145:0x06f8, B:146:0x071d, B:148:0x0730, B:149:0x0740, B:151:0x0744, B:153:0x0754, B:154:0x075c, B:156:0x0763, B:157:0x076e, B:159:0x0772, B:161:0x078a, B:162:0x07b3, B:163:0x0791, B:165:0x07a5, B:167:0x07ab, B:169:0x07ba, B:170:0x0739, B:172:0x073d, B:173:0x0712, B:176:0x0432, B:178:0x0436, B:180:0x043a, B:183:0x044c, B:185:0x0450, B:188:0x0440, B:190:0x0444, B:193:0x047d, B:195:0x0486, B:197:0x048e, B:200:0x04a1, B:202:0x04b8, B:203:0x04c6, B:206:0x04f4, B:208:0x050a, B:210:0x0510, B:212:0x0518, B:215:0x051b, B:216:0x04d1, B:218:0x04eb, B:219:0x04f0, B:223:0x053d, B:225:0x0546, B:227:0x054e, B:229:0x055f, B:231:0x0574, B:232:0x057f, B:235:0x0591, B:238:0x059c, B:240:0x05ab, B:243:0x05d9, B:245:0x05f1, B:247:0x05fe, B:248:0x0602, B:250:0x060a, B:252:0x0622, B:254:0x0619, B:256:0x061d, B:257:0x05b6, B:259:0x05d0, B:260:0x05d5, B:265:0x0634, B:268:0x0670, B:271:0x0686, B:273:0x068a, B:275:0x0697, B:276:0x069b, B:277:0x064e, B:279:0x0668, B:280:0x066d, B:283:0x06a9, B:285:0x06b3, B:297:0x0307, B:299:0x030d, B:301:0x0327, B:302:0x0368, B:303:0x0334, B:305:0x034b, B:307:0x0351, B:308:0x035a, B:310:0x0362, B:314:0x02d3, B:316:0x02d9, B:318:0x006e, B:320:0x0072, B:324:0x0081, B:326:0x0084, B:331:0x00b7, B:333:0x00cb, B:334:0x00d0, B:337:0x00fc, B:339:0x0122, B:341:0x0135, B:343:0x013b, B:345:0x0141, B:348:0x02ab, B:349:0x0147, B:351:0x017d, B:356:0x019e, B:357:0x01a5, B:359:0x01ae, B:361:0x01c0, B:363:0x01e4, B:369:0x01f7, B:371:0x020a, B:373:0x0210, B:375:0x0216, B:377:0x0219, B:379:0x023d, B:384:0x025c, B:385:0x0263, B:387:0x0269, B:389:0x027b, B:391:0x029f), top: B:6:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:294:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03a9 A[Catch: Exception -> 0x08a0, TryCatch #0 {Exception -> 0x08a0, blocks: (B:7:0x0025, B:9:0x002f, B:11:0x0041, B:17:0x0054, B:20:0x005e, B:22:0x0062, B:24:0x0066, B:25:0x0092, B:28:0x0098, B:30:0x009e, B:31:0x00a5, B:32:0x02bc, B:34:0x02c0, B:35:0x02c4, B:40:0x02dc, B:44:0x02e6, B:46:0x02ea, B:49:0x02fe, B:50:0x0313, B:52:0x0317, B:54:0x031d, B:57:0x0371, B:59:0x03a9, B:60:0x03b2, B:62:0x03bb, B:64:0x03c3, B:66:0x03c7, B:67:0x03ce, B:70:0x03d6, B:72:0x0401, B:74:0x0409, B:81:0x042c, B:84:0x06c4, B:86:0x06c8, B:92:0x06d3, B:94:0x06ee, B:103:0x07ca, B:106:0x07e6, B:112:0x07f3, B:114:0x0809, B:118:0x0810, B:124:0x082d, B:126:0x0843, B:132:0x0853, B:134:0x0869, B:138:0x0871, B:141:0x0887, B:143:0x06f2, B:145:0x06f8, B:146:0x071d, B:148:0x0730, B:149:0x0740, B:151:0x0744, B:153:0x0754, B:154:0x075c, B:156:0x0763, B:157:0x076e, B:159:0x0772, B:161:0x078a, B:162:0x07b3, B:163:0x0791, B:165:0x07a5, B:167:0x07ab, B:169:0x07ba, B:170:0x0739, B:172:0x073d, B:173:0x0712, B:176:0x0432, B:178:0x0436, B:180:0x043a, B:183:0x044c, B:185:0x0450, B:188:0x0440, B:190:0x0444, B:193:0x047d, B:195:0x0486, B:197:0x048e, B:200:0x04a1, B:202:0x04b8, B:203:0x04c6, B:206:0x04f4, B:208:0x050a, B:210:0x0510, B:212:0x0518, B:215:0x051b, B:216:0x04d1, B:218:0x04eb, B:219:0x04f0, B:223:0x053d, B:225:0x0546, B:227:0x054e, B:229:0x055f, B:231:0x0574, B:232:0x057f, B:235:0x0591, B:238:0x059c, B:240:0x05ab, B:243:0x05d9, B:245:0x05f1, B:247:0x05fe, B:248:0x0602, B:250:0x060a, B:252:0x0622, B:254:0x0619, B:256:0x061d, B:257:0x05b6, B:259:0x05d0, B:260:0x05d5, B:265:0x0634, B:268:0x0670, B:271:0x0686, B:273:0x068a, B:275:0x0697, B:276:0x069b, B:277:0x064e, B:279:0x0668, B:280:0x066d, B:283:0x06a9, B:285:0x06b3, B:297:0x0307, B:299:0x030d, B:301:0x0327, B:302:0x0368, B:303:0x0334, B:305:0x034b, B:307:0x0351, B:308:0x035a, B:310:0x0362, B:314:0x02d3, B:316:0x02d9, B:318:0x006e, B:320:0x0072, B:324:0x0081, B:326:0x0084, B:331:0x00b7, B:333:0x00cb, B:334:0x00d0, B:337:0x00fc, B:339:0x0122, B:341:0x0135, B:343:0x013b, B:345:0x0141, B:348:0x02ab, B:349:0x0147, B:351:0x017d, B:356:0x019e, B:357:0x01a5, B:359:0x01ae, B:361:0x01c0, B:363:0x01e4, B:369:0x01f7, B:371:0x020a, B:373:0x0210, B:375:0x0216, B:377:0x0219, B:379:0x023d, B:384:0x025c, B:385:0x0263, B:387:0x0269, B:389:0x027b, B:391:0x029f), top: B:6:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03bb A[Catch: Exception -> 0x08a0, TryCatch #0 {Exception -> 0x08a0, blocks: (B:7:0x0025, B:9:0x002f, B:11:0x0041, B:17:0x0054, B:20:0x005e, B:22:0x0062, B:24:0x0066, B:25:0x0092, B:28:0x0098, B:30:0x009e, B:31:0x00a5, B:32:0x02bc, B:34:0x02c0, B:35:0x02c4, B:40:0x02dc, B:44:0x02e6, B:46:0x02ea, B:49:0x02fe, B:50:0x0313, B:52:0x0317, B:54:0x031d, B:57:0x0371, B:59:0x03a9, B:60:0x03b2, B:62:0x03bb, B:64:0x03c3, B:66:0x03c7, B:67:0x03ce, B:70:0x03d6, B:72:0x0401, B:74:0x0409, B:81:0x042c, B:84:0x06c4, B:86:0x06c8, B:92:0x06d3, B:94:0x06ee, B:103:0x07ca, B:106:0x07e6, B:112:0x07f3, B:114:0x0809, B:118:0x0810, B:124:0x082d, B:126:0x0843, B:132:0x0853, B:134:0x0869, B:138:0x0871, B:141:0x0887, B:143:0x06f2, B:145:0x06f8, B:146:0x071d, B:148:0x0730, B:149:0x0740, B:151:0x0744, B:153:0x0754, B:154:0x075c, B:156:0x0763, B:157:0x076e, B:159:0x0772, B:161:0x078a, B:162:0x07b3, B:163:0x0791, B:165:0x07a5, B:167:0x07ab, B:169:0x07ba, B:170:0x0739, B:172:0x073d, B:173:0x0712, B:176:0x0432, B:178:0x0436, B:180:0x043a, B:183:0x044c, B:185:0x0450, B:188:0x0440, B:190:0x0444, B:193:0x047d, B:195:0x0486, B:197:0x048e, B:200:0x04a1, B:202:0x04b8, B:203:0x04c6, B:206:0x04f4, B:208:0x050a, B:210:0x0510, B:212:0x0518, B:215:0x051b, B:216:0x04d1, B:218:0x04eb, B:219:0x04f0, B:223:0x053d, B:225:0x0546, B:227:0x054e, B:229:0x055f, B:231:0x0574, B:232:0x057f, B:235:0x0591, B:238:0x059c, B:240:0x05ab, B:243:0x05d9, B:245:0x05f1, B:247:0x05fe, B:248:0x0602, B:250:0x060a, B:252:0x0622, B:254:0x0619, B:256:0x061d, B:257:0x05b6, B:259:0x05d0, B:260:0x05d5, B:265:0x0634, B:268:0x0670, B:271:0x0686, B:273:0x068a, B:275:0x0697, B:276:0x069b, B:277:0x064e, B:279:0x0668, B:280:0x066d, B:283:0x06a9, B:285:0x06b3, B:297:0x0307, B:299:0x030d, B:301:0x0327, B:302:0x0368, B:303:0x0334, B:305:0x034b, B:307:0x0351, B:308:0x035a, B:310:0x0362, B:314:0x02d3, B:316:0x02d9, B:318:0x006e, B:320:0x0072, B:324:0x0081, B:326:0x0084, B:331:0x00b7, B:333:0x00cb, B:334:0x00d0, B:337:0x00fc, B:339:0x0122, B:341:0x0135, B:343:0x013b, B:345:0x0141, B:348:0x02ab, B:349:0x0147, B:351:0x017d, B:356:0x019e, B:357:0x01a5, B:359:0x01ae, B:361:0x01c0, B:363:0x01e4, B:369:0x01f7, B:371:0x020a, B:373:0x0210, B:375:0x0216, B:377:0x0219, B:379:0x023d, B:384:0x025c, B:385:0x0263, B:387:0x0269, B:389:0x027b, B:391:0x029f), top: B:6:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x06c8 A[Catch: Exception -> 0x08a0, TryCatch #0 {Exception -> 0x08a0, blocks: (B:7:0x0025, B:9:0x002f, B:11:0x0041, B:17:0x0054, B:20:0x005e, B:22:0x0062, B:24:0x0066, B:25:0x0092, B:28:0x0098, B:30:0x009e, B:31:0x00a5, B:32:0x02bc, B:34:0x02c0, B:35:0x02c4, B:40:0x02dc, B:44:0x02e6, B:46:0x02ea, B:49:0x02fe, B:50:0x0313, B:52:0x0317, B:54:0x031d, B:57:0x0371, B:59:0x03a9, B:60:0x03b2, B:62:0x03bb, B:64:0x03c3, B:66:0x03c7, B:67:0x03ce, B:70:0x03d6, B:72:0x0401, B:74:0x0409, B:81:0x042c, B:84:0x06c4, B:86:0x06c8, B:92:0x06d3, B:94:0x06ee, B:103:0x07ca, B:106:0x07e6, B:112:0x07f3, B:114:0x0809, B:118:0x0810, B:124:0x082d, B:126:0x0843, B:132:0x0853, B:134:0x0869, B:138:0x0871, B:141:0x0887, B:143:0x06f2, B:145:0x06f8, B:146:0x071d, B:148:0x0730, B:149:0x0740, B:151:0x0744, B:153:0x0754, B:154:0x075c, B:156:0x0763, B:157:0x076e, B:159:0x0772, B:161:0x078a, B:162:0x07b3, B:163:0x0791, B:165:0x07a5, B:167:0x07ab, B:169:0x07ba, B:170:0x0739, B:172:0x073d, B:173:0x0712, B:176:0x0432, B:178:0x0436, B:180:0x043a, B:183:0x044c, B:185:0x0450, B:188:0x0440, B:190:0x0444, B:193:0x047d, B:195:0x0486, B:197:0x048e, B:200:0x04a1, B:202:0x04b8, B:203:0x04c6, B:206:0x04f4, B:208:0x050a, B:210:0x0510, B:212:0x0518, B:215:0x051b, B:216:0x04d1, B:218:0x04eb, B:219:0x04f0, B:223:0x053d, B:225:0x0546, B:227:0x054e, B:229:0x055f, B:231:0x0574, B:232:0x057f, B:235:0x0591, B:238:0x059c, B:240:0x05ab, B:243:0x05d9, B:245:0x05f1, B:247:0x05fe, B:248:0x0602, B:250:0x060a, B:252:0x0622, B:254:0x0619, B:256:0x061d, B:257:0x05b6, B:259:0x05d0, B:260:0x05d5, B:265:0x0634, B:268:0x0670, B:271:0x0686, B:273:0x068a, B:275:0x0697, B:276:0x069b, B:277:0x064e, B:279:0x0668, B:280:0x066d, B:283:0x06a9, B:285:0x06b3, B:297:0x0307, B:299:0x030d, B:301:0x0327, B:302:0x0368, B:303:0x0334, B:305:0x034b, B:307:0x0351, B:308:0x035a, B:310:0x0362, B:314:0x02d3, B:316:0x02d9, B:318:0x006e, B:320:0x0072, B:324:0x0081, B:326:0x0084, B:331:0x00b7, B:333:0x00cb, B:334:0x00d0, B:337:0x00fc, B:339:0x0122, B:341:0x0135, B:343:0x013b, B:345:0x0141, B:348:0x02ab, B:349:0x0147, B:351:0x017d, B:356:0x019e, B:357:0x01a5, B:359:0x01ae, B:361:0x01c0, B:363:0x01e4, B:369:0x01f7, B:371:0x020a, B:373:0x0210, B:375:0x0216, B:377:0x0219, B:379:0x023d, B:384:0x025c, B:385:0x0263, B:387:0x0269, B:389:0x027b, B:391:0x029f), top: B:6:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x06d3 A[Catch: Exception -> 0x08a0, TryCatch #0 {Exception -> 0x08a0, blocks: (B:7:0x0025, B:9:0x002f, B:11:0x0041, B:17:0x0054, B:20:0x005e, B:22:0x0062, B:24:0x0066, B:25:0x0092, B:28:0x0098, B:30:0x009e, B:31:0x00a5, B:32:0x02bc, B:34:0x02c0, B:35:0x02c4, B:40:0x02dc, B:44:0x02e6, B:46:0x02ea, B:49:0x02fe, B:50:0x0313, B:52:0x0317, B:54:0x031d, B:57:0x0371, B:59:0x03a9, B:60:0x03b2, B:62:0x03bb, B:64:0x03c3, B:66:0x03c7, B:67:0x03ce, B:70:0x03d6, B:72:0x0401, B:74:0x0409, B:81:0x042c, B:84:0x06c4, B:86:0x06c8, B:92:0x06d3, B:94:0x06ee, B:103:0x07ca, B:106:0x07e6, B:112:0x07f3, B:114:0x0809, B:118:0x0810, B:124:0x082d, B:126:0x0843, B:132:0x0853, B:134:0x0869, B:138:0x0871, B:141:0x0887, B:143:0x06f2, B:145:0x06f8, B:146:0x071d, B:148:0x0730, B:149:0x0740, B:151:0x0744, B:153:0x0754, B:154:0x075c, B:156:0x0763, B:157:0x076e, B:159:0x0772, B:161:0x078a, B:162:0x07b3, B:163:0x0791, B:165:0x07a5, B:167:0x07ab, B:169:0x07ba, B:170:0x0739, B:172:0x073d, B:173:0x0712, B:176:0x0432, B:178:0x0436, B:180:0x043a, B:183:0x044c, B:185:0x0450, B:188:0x0440, B:190:0x0444, B:193:0x047d, B:195:0x0486, B:197:0x048e, B:200:0x04a1, B:202:0x04b8, B:203:0x04c6, B:206:0x04f4, B:208:0x050a, B:210:0x0510, B:212:0x0518, B:215:0x051b, B:216:0x04d1, B:218:0x04eb, B:219:0x04f0, B:223:0x053d, B:225:0x0546, B:227:0x054e, B:229:0x055f, B:231:0x0574, B:232:0x057f, B:235:0x0591, B:238:0x059c, B:240:0x05ab, B:243:0x05d9, B:245:0x05f1, B:247:0x05fe, B:248:0x0602, B:250:0x060a, B:252:0x0622, B:254:0x0619, B:256:0x061d, B:257:0x05b6, B:259:0x05d0, B:260:0x05d5, B:265:0x0634, B:268:0x0670, B:271:0x0686, B:273:0x068a, B:275:0x0697, B:276:0x069b, B:277:0x064e, B:279:0x0668, B:280:0x066d, B:283:0x06a9, B:285:0x06b3, B:297:0x0307, B:299:0x030d, B:301:0x0327, B:302:0x0368, B:303:0x0334, B:305:0x034b, B:307:0x0351, B:308:0x035a, B:310:0x0362, B:314:0x02d3, B:316:0x02d9, B:318:0x006e, B:320:0x0072, B:324:0x0081, B:326:0x0084, B:331:0x00b7, B:333:0x00cb, B:334:0x00d0, B:337:0x00fc, B:339:0x0122, B:341:0x0135, B:343:0x013b, B:345:0x0141, B:348:0x02ab, B:349:0x0147, B:351:0x017d, B:356:0x019e, B:357:0x01a5, B:359:0x01ae, B:361:0x01c0, B:363:0x01e4, B:369:0x01f7, B:371:0x020a, B:373:0x0210, B:375:0x0216, B:377:0x0219, B:379:0x023d, B:384:0x025c, B:385:0x0263, B:387:0x0269, B:389:0x027b, B:391:0x029f), top: B:6:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x07bf  */
    /* JADX WARN: Type inference failed for: r7v13, types: [org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_messages_editMessage] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_messages_addPollAnswer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(r47 r47Var, TLRPC.TL_inputPollAnswer tL_inputPollAnswer, TLRPC.TL_photo tL_photo, oec oecVar, TLRPC.TL_document tL_document, String str, TLRPC.PhotoSize photoSize, HashMap hashMap, boolean z, boolean z2, Object obj) {
        Object obj2;
        boolean z3;
        char c;
        Object obj3;
        HashMap hashMap2;
        oec oecVar2;
        char c2;
        TLRPC.TL_document tL_document2;
        String str2;
        oec oecVar3;
        String str3;
        char c3;
        char c4;
        long j;
        HashMap hashMap3;
        TLRPC.InputMedia inputMedia;
        boolean z4;
        TLRPC.InputMedia inputMedia2;
        d7a d7aVar;
        TLRPC.InputMedia inputMedia3;
        boolean z5;
        oec oecVar4;
        TLRPC.InputMedia inputMedia4;
        boolean z6;
        boolean z7;
        boolean z8;
        TLRPC.InputMedia inputMedia5;
        String str4;
        TLRPC.InputMedia inputMedia6;
        String str5;
        boolean z9;
        TLRPC.TL_messages_editMessage tL_messages_editMessage;
        TLObject tLObject;
        TLRPC.InputMedia inputMedia7;
        boolean z10;
        TLRPC.TL_forumTopic tL_forumTopic;
        char c5;
        TLRPC.EncryptedChat a1;
        TLRPC.TL_photo tL_photo2 = tL_photo;
        TLRPC.TL_document tL_document3 = tL_document;
        String str6 = str;
        if (r47Var == null) {
            return;
        }
        HashMap hashMap4 = hashMap == null ? new HashMap() : hashMap;
        TLRPC.Message message = r47Var.k;
        r47Var.q1 = false;
        try {
            long A0 = r47Var.A0();
            boolean z11 = !wf3.B(A0) || ((a1 = getMessagesController().a1(Integer.valueOf(wf3.h(A0)))) != null && hl.W0(a1.layer) >= 101);
            if (z) {
                TLRPC.MessageMedia messageMedia = r47Var.k.media;
                if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || messageMedia == null || (messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
                    oecVar2 = oecVar;
                    c5 = 1;
                } else if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    tL_photo2 = (TLRPC.TL_photo) messageMedia.photo;
                    oecVar2 = oecVar;
                    c5 = 2;
                } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    tL_document3 = (TLRPC.TL_document) messageMedia.document;
                    c5 = (r47.J4(tL_document3) || oecVar != null) ? (char) 3 : (char) 7;
                    oecVar2 = r47Var.r0;
                } else {
                    oecVar2 = oecVar;
                    c5 = messageMedia instanceof TLRPC.TL_messageMediaToDo ? '\n' : (char) 65535;
                }
                hashMap2 = message.params;
                obj3 = (obj == null && hashMap2 != null && hashMap2.containsKey("parentObject")) ? hashMap2.get("parentObject") : obj;
                r47Var.y1 = message.message;
                r47Var.z1 = message.entities;
                obj2 = "originalPath";
                z3 = z11;
                c = c5;
                str6 = message.attachPath;
            } else {
                TLRPC.MessageMedia messageMedia2 = message.media;
                r47Var.D1 = messageMedia2;
                r47Var.C1 = message.message;
                r47Var.F1 = message.entities;
                r47Var.G1 = message.attachPath;
                if (messageMedia2 == null) {
                    new TLRPC.TL_messageMediaEmpty();
                }
                SerializedData serializedData = new SerializedData(true);
                A0(message, serializedData);
                SerializedData serializedData2 = new SerializedData(serializedData.length());
                A0(message, serializedData2);
                hashMap4.put("prevMedia", Base64.encodeToString(serializedData2.toByteArray(), 0));
                serializedData2.cleanup();
                if (tL_inputPollAnswer != null) {
                    TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) message.media;
                    TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                    obj2 = "originalPath";
                    tL_pollAnswer.text = tL_inputPollAnswer.text;
                    tL_pollAnswer.option = tL_inputPollAnswer.option;
                    int size = tL_messageMediaPoll.poll.answers.size();
                    tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                    r47Var.E1 = tL_document3;
                    if (tL_photo2 != null) {
                        TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
                        tL_pollAnswer.media = tL_messageMediaPhoto;
                        tL_messageMediaPhoto.flags |= 3;
                        tL_messageMediaPhoto.photo = tL_photo2;
                        tL_messageMediaPhoto.spoiler = z2;
                        if (str6 == null || str6.length() <= 0 || !str6.startsWith("http")) {
                            ArrayList<TLRPC.PhotoSize> arrayList = tL_photo2.sizes;
                            TLRPC.FileLocation fileLocation = arrayList.get(arrayList.size() - 1).location;
                            xb4.G(this.currentAccount);
                            message.attachPath = xb4.K(fileLocation, true).toString();
                            xb4.G(this.currentAccount);
                            ih8.j(message, xb4.K(fileLocation, true).toString(), size);
                        } else {
                            message.attachPath = str6;
                            ih8.j(message, str6, size);
                        }
                        z3 = z11;
                        c2 = 2;
                    } else if (tL_document3 != null) {
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                        tL_pollAnswer.media = tL_messageMediaDocument;
                        z3 = z11;
                        tL_messageMediaDocument.flags |= 3;
                        tL_messageMediaDocument.document = tL_document3;
                        tL_messageMediaDocument.spoiler = z2;
                        c2 = (r47.J4(tL_document3) || oecVar != null) ? (char) 3 : (char) 7;
                        if (oecVar != null) {
                            hashMap4.put("ve", oecVar.a());
                        }
                        message.attachPath = str6;
                        ih8.j(message, str6, size);
                        if (photoSize instanceof fn5) {
                            TLRPC.MessageMedia messageMedia3 = tL_pollAnswer.media;
                            messageMedia3.flags |= 512;
                            messageMedia3.video_cover = ((fn5) photoSize).a;
                        } else if (photoSize != null) {
                            TLRPC.TL_photo tL_photo3 = new TLRPC.TL_photo();
                            tL_photo3.date = getConnectionsManager().getCurrentTime();
                            tL_photo3.sizes.add(photoSize);
                            tL_photo3.file_reference = new byte[0];
                            TLRPC.MessageMedia messageMedia4 = tL_pollAnswer.media;
                            messageMedia4.video_cover = tL_photo3;
                            messageMedia4.flags |= 512;
                        }
                    } else {
                        z3 = z11;
                        c2 = tL_inputPollAnswer.input_media != null ? (char) 11 : (char) 1;
                    }
                    c = c2;
                } else {
                    obj2 = "originalPath";
                    z3 = z11;
                    if (tL_photo2 != null) {
                        TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto2 = new TLRPC.TL_messageMediaPhoto();
                        message.media = tL_messageMediaPhoto2;
                        tL_messageMediaPhoto2.flags |= 3;
                        tL_messageMediaPhoto2.photo = tL_photo2;
                        tL_messageMediaPhoto2.spoiler = z2;
                        if (str6 == null || str6.length() <= 0 || !str6.startsWith("http")) {
                            ArrayList<TLRPC.PhotoSize> arrayList2 = tL_photo2.sizes;
                            TLRPC.FileLocation fileLocation2 = arrayList2.get(arrayList2.size() - 1).location;
                            xb4.G(this.currentAccount);
                            message.attachPath = xb4.K(fileLocation2, true).toString();
                        } else {
                            message.attachPath = str6;
                        }
                        c = 2;
                    } else if (tL_document3 != null) {
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument2 = new TLRPC.TL_messageMediaDocument();
                        message.media = tL_messageMediaDocument2;
                        tL_messageMediaDocument2.flags |= 3;
                        tL_messageMediaDocument2.document = tL_document3;
                        tL_messageMediaDocument2.spoiler = z2;
                        c = (r47.J4(tL_document3) || oecVar != null) ? (char) 3 : (char) 7;
                        if (oecVar != null) {
                            hashMap4.put("ve", oecVar.a());
                        }
                        message.attachPath = str6;
                        if (photoSize instanceof fn5) {
                            TLRPC.MessageMedia messageMedia5 = message.media;
                            messageMedia5.flags |= 512;
                            messageMedia5.video_cover = ((fn5) photoSize).a;
                        } else if (photoSize != null) {
                            TLRPC.TL_photo tL_photo4 = new TLRPC.TL_photo();
                            tL_photo4.date = getConnectionsManager().getCurrentTime();
                            tL_photo4.sizes.add(photoSize);
                            tL_photo4.file_reference = new byte[0];
                            TLRPC.MessageMedia messageMedia6 = message.media;
                            messageMedia6.video_cover = tL_photo4;
                            messageMedia6.flags |= 512;
                        }
                    } else {
                        c = r47Var.k.media instanceof TLRPC.TL_messageMediaToDo ? '\n' : (char) 1;
                    }
                }
                message.params = hashMap4;
                message.send_state = 3;
                message.errorNewPriceStars = 0L;
                message.errorAllowedPriceStars = 0L;
                obj3 = obj;
                hashMap2 = hashMap4;
                oecVar2 = oecVar;
            }
            String str7 = message.attachPath;
            if (str7 == null) {
                str7 = "";
                message.attachPath = "";
            }
            message.local_id = 0;
            int i = r47Var.D;
            oec oecVar5 = oecVar2;
            if ((i == 3 || oecVar5 != null || i == 2) && !TextUtils.isEmpty(str7)) {
                r47Var.y0 = true;
            }
            oec oecVar6 = r47Var.r0;
            if (oecVar6 == null || oecVar5 != null) {
                oecVar6 = oecVar5;
            }
            if (z) {
                tL_document2 = tL_document3;
                str2 = str6;
                oecVar3 = oecVar6;
            } else {
                CharSequence charSequence = r47Var.y1;
                if (charSequence != null) {
                    String str8 = message.message;
                    String charSequence2 = charSequence.toString();
                    message.message = charSequence2;
                    r47Var.z = null;
                    ArrayList<TLRPC.MessageEntity> arrayList3 = r47Var.z1;
                    oecVar3 = oecVar6;
                    if (c == 1) {
                        if (arrayList3 != null) {
                            message.entities = arrayList3;
                            message.flags |= 128;
                        } else if (!TextUtils.equals(str8, charSequence2)) {
                            message.flags &= -129;
                        }
                        TLRPC.Message message2 = r47Var.k;
                        if (message2 != null && (message2.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                            r47Var.k0();
                        }
                        tL_document2 = tL_document3;
                    } else {
                        if (arrayList3 != null) {
                            message.entities = arrayList3;
                            message.flags |= 128;
                            tL_document2 = tL_document3;
                            z10 = z3;
                        } else {
                            tL_document2 = tL_document3;
                            z10 = z3;
                            ArrayList<TLRPC.MessageEntity> Y = getMediaDataController().Y(new CharSequence[]{r47Var.y1}, z10, true);
                            if (Y != null && !Y.isEmpty()) {
                                message.entities = Y;
                                message.flags |= 128;
                            } else if (!TextUtils.equals(str8, message.message)) {
                                message.flags &= -129;
                            }
                        }
                        r47Var.k0();
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(message);
                        getMessagesStorage().f1(0, r47Var.r1 ? 1 : 0, 0L, arrayList4, false);
                        qyb qybVar = getMessagesController().g4;
                        z3 = z10;
                        str2 = str6;
                        tL_forumTopic = (TLRPC.TL_forumTopic) qybVar.e.f(qyb.p(message.id, -message.dialog_id));
                        if (tL_forumTopic != null) {
                            tL_forumTopic.topMessage = message;
                            qybVar.y(-message.dialog_id, true);
                        }
                        r47Var.D = -1;
                        r47Var.K5();
                        if (c == 1) {
                            TLRPC.MessageMedia messageMedia7 = r47Var.k.media;
                            if ((messageMedia7 instanceof TLRPC.TL_messageMediaPhoto) || (messageMedia7 instanceof TLRPC.TL_messageMediaDocument)) {
                                r47Var.k0();
                            } else {
                                r47Var.S1 = false;
                                r47Var.I();
                            }
                        }
                        r47Var.P(tL_inputPollAnswer == null);
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.add(r47Var);
                        getNotificationCenter().k(jn7.m0, Long.valueOf(A0), arrayList5);
                    }
                } else {
                    tL_document2 = tL_document3;
                    oecVar3 = oecVar6;
                }
                z10 = z3;
                ArrayList arrayList42 = new ArrayList();
                arrayList42.add(message);
                getMessagesStorage().f1(0, r47Var.r1 ? 1 : 0, 0L, arrayList42, false);
                qyb qybVar2 = getMessagesController().g4;
                z3 = z10;
                str2 = str6;
                tL_forumTopic = (TLRPC.TL_forumTopic) qybVar2.e.f(qyb.p(message.id, -message.dialog_id));
                if (tL_forumTopic != null) {
                }
                r47Var.D = -1;
                r47Var.K5();
                if (c == 1) {
                }
                r47Var.P(tL_inputPollAnswer == null);
                ArrayList arrayList52 = new ArrayList();
                arrayList52.add(r47Var);
                getNotificationCenter().k(jn7.m0, Long.valueOf(A0), arrayList52);
            }
            if (hashMap2 != null) {
                Object obj4 = obj2;
                if (hashMap2.containsKey(obj4)) {
                    str3 = (String) hashMap2.get(obj4);
                    char c6 = '\b';
                    if ((c >= 1 || c > 3) && ((c < 5 || c > '\b') && c != '\n')) {
                        c3 = 11;
                        if (c == 11) {
                            return;
                        }
                    } else {
                        c3 = 11;
                    }
                    if (c != c3) {
                        if (c != 1) {
                            if (c == 2) {
                                TLRPC.InputMedia tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                                tL_inputMediaUploadedPhoto.spoiler = z2;
                                if (hashMap2 == null || (str5 = (String) hashMap2.get("masks")) == null) {
                                    c4 = '\b';
                                } else {
                                    SerializedData serializedData3 = new SerializedData(Utilities.v(str5));
                                    boolean z12 = false;
                                    int readInt32 = serializedData3.readInt32(false);
                                    int i2 = 0;
                                    while (true) {
                                        c4 = c6;
                                        if (i2 >= readInt32) {
                                            break;
                                        }
                                        tL_inputMediaUploadedPhoto.stickers.add(TLRPC.InputDocument.TLdeserialize(serializedData3, serializedData3.readInt32(z12), z12));
                                        i2++;
                                        readInt32 = readInt32;
                                        c6 = c4;
                                        z12 = false;
                                    }
                                    tL_inputMediaUploadedPhoto.flags |= 1;
                                    serializedData3.cleanup();
                                }
                                if (tL_photo2.access_hash == 0) {
                                    inputMedia6 = tL_inputMediaUploadedPhoto;
                                    z5 = true;
                                } else {
                                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
                                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                    tL_inputMediaPhoto.id = tL_inputPhoto;
                                    tL_inputPhoto.id = tL_photo2.id;
                                    tL_inputPhoto.access_hash = tL_photo2.access_hash;
                                    byte[] bArr = tL_photo2.file_reference;
                                    tL_inputPhoto.file_reference = bArr;
                                    if (bArr == null) {
                                        tL_inputPhoto.file_reference = new byte[0];
                                    }
                                    tL_inputMediaPhoto.spoiler = z2;
                                    inputMedia6 = tL_inputMediaPhoto;
                                    z5 = false;
                                }
                                j = A0;
                                d7a d7aVar2 = new d7a(this, j);
                                d7aVar2.e = (byte) 0;
                                d7aVar2.m = r47Var;
                                d7aVar2.f = str3;
                                d7aVar2.K = obj3;
                                d7aVar2.t = tL_inputMediaUploadedPhoto;
                                d7aVar2.p = z5;
                                if (str2 != null && str2.length() > 0) {
                                    String str9 = str2;
                                    if (str9.startsWith("http")) {
                                        d7aVar2.l = str9;
                                        inputMedia3 = inputMedia6;
                                        d7aVar = d7aVar2;
                                        hashMap3 = hashMap2;
                                    }
                                }
                                d7aVar2.g = tL_photo2.sizes.get(r10.size() - 1);
                                d7aVar2.h = tL_photo2;
                                inputMedia3 = inputMedia6;
                                d7aVar = d7aVar2;
                                hashMap3 = hashMap2;
                            } else {
                                c4 = '\b';
                                j = A0;
                                if (c == 3) {
                                    TLRPC.InputMedia tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                                    tL_inputMediaUploadedDocument.spoiler = z2;
                                    if (hashMap2 != null && (str4 = (String) hashMap2.get("masks")) != null) {
                                        SerializedData serializedData4 = new SerializedData(Utilities.v(str4));
                                        boolean z13 = false;
                                        int readInt322 = serializedData4.readInt32(false);
                                        int i3 = 0;
                                        while (i3 < readInt322) {
                                            tL_inputMediaUploadedDocument.stickers.add(TLRPC.InputDocument.TLdeserialize(serializedData4, serializedData4.readInt32(z13), z13));
                                            i3++;
                                            readInt322 = readInt322;
                                            z13 = false;
                                        }
                                        tL_inputMediaUploadedDocument.flags |= 1;
                                        serializedData4.cleanup();
                                    }
                                    TLRPC.TL_document tL_document4 = tL_document2;
                                    tL_inputMediaUploadedDocument.mime_type = tL_document4.mime_type;
                                    tL_inputMediaUploadedDocument.attributes = tL_document4.attributes;
                                    if (r47Var.q3()) {
                                        oecVar4 = oecVar3;
                                    } else {
                                        if (oecVar3 != null) {
                                            oecVar4 = oecVar3;
                                        } else {
                                            oecVar4 = oecVar3;
                                        }
                                        tL_inputMediaUploadedDocument.nosound_video = true;
                                        boolean z14 = f11.a;
                                        cc4.b("nosound_video = true");
                                    }
                                    hashMap3 = hashMap2;
                                    if (tL_document4.access_hash == 0) {
                                        inputMedia4 = tL_inputMediaUploadedDocument;
                                        z6 = true;
                                    } else {
                                        TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                                        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                                        tL_inputMediaDocument.id = tL_inputDocument;
                                        tL_inputDocument.id = tL_document4.id;
                                        tL_inputDocument.access_hash = tL_document4.access_hash;
                                        byte[] bArr2 = tL_document4.file_reference;
                                        tL_inputDocument.file_reference = bArr2;
                                        if (bArr2 == null) {
                                            tL_inputDocument.file_reference = new byte[0];
                                        }
                                        tL_inputMediaDocument.spoiler = z2;
                                        inputMedia4 = tL_inputMediaDocument;
                                        z6 = false;
                                    }
                                    d7aVar = new d7a(this, j);
                                    d7aVar.e = (byte) 1;
                                    d7aVar.m = r47Var;
                                    d7aVar.f = str3;
                                    d7aVar.K = obj3;
                                    d7aVar.t = tL_inputMediaUploadedDocument;
                                    if (!tL_document4.thumbs.isEmpty()) {
                                        TLRPC.PhotoSize photoSize2 = tL_document4.thumbs.get(0);
                                        if (!(photoSize2 instanceof TLRPC.TL_photoStrippedSize)) {
                                            d7aVar.g = photoSize2;
                                            d7aVar.h = tL_document4;
                                        }
                                    }
                                    d7aVar.o = oecVar4;
                                    if (photoSize instanceof fn5) {
                                        tL_inputMediaUploadedDocument.video_cover = ((fn5) photoSize).b;
                                        tL_inputMediaUploadedDocument.flags |= 64;
                                    } else if (photoSize != null && !(photoSize instanceof TLRPC.TL_photoStrippedSize)) {
                                        d7aVar.i = photoSize;
                                        z7 = true;
                                        d7aVar.p = z6;
                                        d7aVar.q = z7;
                                        z5 = z6;
                                        z8 = z7;
                                        inputMedia5 = inputMedia4;
                                        z9 = inputMedia5 instanceof TLRPC.TL_inputMediaEmpty;
                                        TLRPC.InputMedia inputMedia8 = inputMedia5;
                                        if (z9) {
                                            int i4 = r47Var.D;
                                            if (i4 != 0) {
                                                inputMedia8 = inputMedia5;
                                            }
                                            inputMedia8 = null;
                                        }
                                        if (tL_inputPollAnswer == null) {
                                            tLObject = new TLRPC.TL_messages_addPollAnswer();
                                            tL_inputPollAnswer.input_media = inputMedia8;
                                            tLObject.answer = tL_inputPollAnswer;
                                            tLObject.msg_id = r47Var.e1();
                                            tLObject.peer = getMessagesController().j1(j);
                                            if (d7aVar != null) {
                                                d7aVar.c = tLObject;
                                            }
                                        } else {
                                            if (r47Var.b3()) {
                                                TL_ephemeral.TL_editMessage tL_editMessage = new TL_ephemeral.TL_editMessage();
                                                tL_editMessage.id = r47.S(r47Var.e1());
                                                tL_editMessage.receiver_id = new TLRPC.TL_inputUserEmpty();
                                                tL_editMessage.welcome = true;
                                                tL_messages_editMessage = tL_editMessage;
                                            } else {
                                                TLRPC.TL_messages_editMessage tL_messages_editMessage2 = new TLRPC.TL_messages_editMessage();
                                                tL_messages_editMessage2.id = r47Var.e1();
                                                tL_messages_editMessage = tL_messages_editMessage2;
                                            }
                                            tLObject = tL_messages_editMessage;
                                            tLObject.peer = getMessagesController().j1(j);
                                            TLRPC.Message message3 = r47Var.k;
                                            tLObject.invert_media = message3.invert_media;
                                            if (inputMedia8 != null) {
                                                tLObject.flags |= TLObject.FLAG_14;
                                                tLObject.media = inputMedia8;
                                            } else if (!r47Var.A1) {
                                                tLObject.no_webpage = true;
                                            }
                                            if (r47Var.r1) {
                                                tLObject.schedule_date = message3.date;
                                                int i5 = tLObject.flags;
                                                tLObject.flags = 32768 | i5;
                                                int i6 = message3.schedule_repeat_period;
                                                if (i6 != 0) {
                                                    tLObject.schedule_repeat_period = i6;
                                                    tLObject.flags = i5 | 294912;
                                                }
                                            }
                                            if ((message3.flags & TLObject.FLAG_30) != 0) {
                                                tLObject.quick_reply_shortcut_id = message3.quick_reply_shortcut_id;
                                                tLObject.flags |= 131072;
                                            }
                                            CharSequence charSequence3 = r47Var.y1;
                                            if (charSequence3 != null) {
                                                tLObject.message = charSequence3.toString();
                                                int i7 = tLObject.flags;
                                                tLObject.flags = i7 | 2048;
                                                tLObject.no_webpage = !r47Var.A1;
                                                ArrayList<TLRPC.MessageEntity> arrayList6 = r47Var.z1;
                                                if (arrayList6 != null) {
                                                    tLObject.entities = arrayList6;
                                                    tLObject.flags = i7 | 2056;
                                                } else {
                                                    ArrayList<TLRPC.MessageEntity> Y2 = getMediaDataController().Y(new CharSequence[]{r47Var.y1}, z3, true);
                                                    if (Y2 != null && !Y2.isEmpty()) {
                                                        tLObject.entities = Y2;
                                                        tLObject.flags |= 8;
                                                    }
                                                }
                                                r47Var.y1 = null;
                                                r47Var.z1 = null;
                                            }
                                            if (d7aVar != null) {
                                                d7aVar.c = tLObject;
                                            }
                                        }
                                        if (c != 1 || c == 11) {
                                            M(tLObject, r47Var, null, d7aVar, obj3, hashMap3, r47Var.r1);
                                            return;
                                        }
                                        if (c == 2) {
                                            if (z5 || z8) {
                                                K(d7aVar);
                                                return;
                                            } else {
                                                N(tLObject, r47Var, str3, null, true, d7aVar, obj3, hashMap3, r47Var.r1);
                                                return;
                                            }
                                        }
                                        HashMap hashMap5 = hashMap3;
                                        if (c == 3) {
                                            if (z5 || z8) {
                                                K(d7aVar);
                                                return;
                                            } else {
                                                M(tLObject, r47Var, str3, d7aVar, obj3, hashMap5, r47Var.r1);
                                                return;
                                            }
                                        }
                                        if (c == 6) {
                                            M(tLObject, r47Var, str3, d7aVar, obj3, hashMap5, r47Var.r1);
                                            return;
                                        }
                                        if (c == 7) {
                                            if (z5 || z8) {
                                                K(d7aVar);
                                                return;
                                            } else {
                                                M(tLObject, r47Var, str3, d7aVar, obj3, hashMap5, r47Var.r1);
                                                return;
                                            }
                                        }
                                        if (c != c4) {
                                            if (c == '\n') {
                                                M(tLObject, r47Var, str3, d7aVar, obj3, hashMap5, r47Var.r1);
                                                return;
                                            }
                                            return;
                                        } else if (z5 || z8) {
                                            K(d7aVar);
                                            return;
                                        } else {
                                            M(tLObject, r47Var, str3, d7aVar, obj3, hashMap5, r47Var.r1);
                                            return;
                                        }
                                    }
                                    z7 = false;
                                    d7aVar.p = z6;
                                    d7aVar.q = z7;
                                    z5 = z6;
                                    z8 = z7;
                                    inputMedia5 = inputMedia4;
                                    z9 = inputMedia5 instanceof TLRPC.TL_inputMediaEmpty;
                                    TLRPC.InputMedia inputMedia82 = inputMedia5;
                                    if (z9) {
                                    }
                                    if (tL_inputPollAnswer == null) {
                                    }
                                    if (c != 1) {
                                    }
                                    M(tLObject, r47Var, null, d7aVar, obj3, hashMap3, r47Var.r1);
                                    return;
                                }
                                oec oecVar7 = oecVar3;
                                TLRPC.TL_document tL_document5 = tL_document2;
                                hashMap3 = hashMap2;
                                if (c == 7) {
                                    TLRPC.InputMedia tL_inputMediaUploadedDocument2 = new TLRPC.TL_inputMediaUploadedDocument();
                                    tL_inputMediaUploadedDocument2.mime_type = tL_document5.mime_type;
                                    tL_inputMediaUploadedDocument2.attributes = tL_document5.attributes;
                                    tL_inputMediaUploadedDocument2.spoiler = z2;
                                    if (tL_document5.access_hash == 0) {
                                        inputMedia2 = tL_inputMediaUploadedDocument2;
                                        z4 = true;
                                    } else {
                                        TLRPC.TL_inputMediaDocument tL_inputMediaDocument2 = new TLRPC.TL_inputMediaDocument();
                                        TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                        tL_inputMediaDocument2.id = tL_inputDocument2;
                                        tL_inputDocument2.id = tL_document5.id;
                                        tL_inputDocument2.access_hash = tL_document5.access_hash;
                                        byte[] bArr3 = tL_document5.file_reference;
                                        tL_inputDocument2.file_reference = bArr3;
                                        if (bArr3 == null) {
                                            tL_inputDocument2.file_reference = new byte[0];
                                        }
                                        tL_inputMediaDocument2.spoiler = z2;
                                        z4 = false;
                                        inputMedia2 = tL_inputMediaDocument2;
                                    }
                                    d7aVar = new d7a(this, j);
                                    d7aVar.f = str3;
                                    d7aVar.e = (byte) 2;
                                    d7aVar.m = r47Var;
                                    if (!tL_document5.thumbs.isEmpty() && (oecVar7 == null || !oecVar7.N)) {
                                        TLRPC.PhotoSize photoSize3 = tL_document5.thumbs.get(0);
                                        if (!(photoSize3 instanceof TLRPC.TL_photoStrippedSize)) {
                                            d7aVar.g = photoSize3;
                                            d7aVar.h = tL_document5;
                                        }
                                    }
                                    d7aVar.K = obj3;
                                    d7aVar.t = tL_inputMediaUploadedDocument2;
                                    d7aVar.p = z4;
                                    inputMedia3 = inputMedia2;
                                    z5 = z4;
                                } else if (c == '\n') {
                                    TLRPC.MessageMedia n1 = r47.n1(r47Var.k);
                                    if (n1 instanceof TLRPC.TL_messageMediaToDo) {
                                        TLRPC.TL_inputMediaTodo tL_inputMediaTodo = new TLRPC.TL_inputMediaTodo();
                                        tL_inputMediaTodo.todo = ((TLRPC.TL_messageMediaToDo) n1).todo;
                                        inputMedia = tL_inputMediaTodo;
                                        z5 = false;
                                        z8 = false;
                                        d7aVar = null;
                                        inputMedia5 = inputMedia;
                                        z9 = inputMedia5 instanceof TLRPC.TL_inputMediaEmpty;
                                        TLRPC.InputMedia inputMedia822 = inputMedia5;
                                        if (z9) {
                                        }
                                        if (tL_inputPollAnswer == null) {
                                        }
                                        if (c != 1) {
                                        }
                                        M(tLObject, r47Var, null, d7aVar, obj3, hashMap3, r47Var.r1);
                                        return;
                                    }
                                }
                            }
                            z8 = false;
                            inputMedia5 = inputMedia3;
                            z9 = inputMedia5 instanceof TLRPC.TL_inputMediaEmpty;
                            TLRPC.InputMedia inputMedia8222 = inputMedia5;
                            if (z9) {
                            }
                            if (tL_inputPollAnswer == null) {
                            }
                            if (c != 1) {
                            }
                            M(tLObject, r47Var, null, d7aVar, obj3, hashMap3, r47Var.r1);
                            return;
                        }
                        TLRPC.MessageMedia messageMedia8 = message.media;
                        if ((messageMedia8 == null || (messageMedia8 instanceof TLRPC.TL_messageMediaEmpty) || (messageMedia8.webpage instanceof TLRPC.TL_webPageEmpty)) && !r47Var.A1) {
                            inputMedia7 = new TLRPC.TL_inputMediaEmpty();
                        } else if (messageMedia8 == null || messageMedia8.webpage == null) {
                            c4 = '\b';
                            hashMap3 = hashMap2;
                            j = A0;
                        } else {
                            TLRPC.TL_inputMediaWebPage tL_inputMediaWebPage = new TLRPC.TL_inputMediaWebPage();
                            TLRPC.MessageMedia messageMedia9 = message.media;
                            tL_inputMediaWebPage.url = messageMedia9.webpage.url;
                            tL_inputMediaWebPage.force_small_media = messageMedia9.force_small_media;
                            tL_inputMediaWebPage.force_large_media = messageMedia9.force_large_media;
                            inputMedia7 = tL_inputMediaWebPage;
                        }
                        inputMedia = null;
                        z5 = false;
                        z8 = false;
                        d7aVar = null;
                        inputMedia5 = inputMedia;
                        z9 = inputMedia5 instanceof TLRPC.TL_inputMediaEmpty;
                        TLRPC.InputMedia inputMedia82222 = inputMedia5;
                        if (z9) {
                        }
                        if (tL_inputPollAnswer == null) {
                        }
                        if (c != 1) {
                        }
                        M(tLObject, r47Var, null, d7aVar, obj3, hashMap3, r47Var.r1);
                        return;
                    }
                    inputMedia7 = tL_inputPollAnswer.input_media;
                    c4 = '\b';
                    hashMap3 = hashMap2;
                    j = A0;
                    inputMedia = inputMedia7;
                    z5 = false;
                    z8 = false;
                    d7aVar = null;
                    inputMedia5 = inputMedia;
                    z9 = inputMedia5 instanceof TLRPC.TL_inputMediaEmpty;
                    TLRPC.InputMedia inputMedia822222 = inputMedia5;
                    if (z9) {
                    }
                    if (tL_inputPollAnswer == null) {
                    }
                    if (c != 1) {
                    }
                    M(tLObject, r47Var, null, d7aVar, obj3, hashMap3, r47Var.r1);
                    return;
                }
            }
            str3 = null;
            char c62 = '\b';
            if (c >= 1) {
            }
            c3 = 11;
            if (c == 11) {
            }
        } catch (Exception e) {
            cc4.f(e);
            k0(r47Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s0(d7a d7aVar, boolean z) {
        ArrayList arrayList;
        int i;
        ArrayList arrayList2 = d7aVar.x;
        long j = d7aVar.a;
        if (arrayList2.isEmpty()) {
            d7aVar.c();
            return;
        }
        String str = "group_" + d7aVar.F;
        int i2 = 1;
        if (d7aVar.G != ((r47) c00.g(1, d7aVar.x)).e1()) {
            if (!z) {
                boolean z2 = f11.a;
                cc4.b("final message not added");
                return;
            } else {
                boolean z3 = f11.a;
                cc4.b("final message not added, add");
                d0(str, d7aVar);
                return;
            }
        }
        if (z) {
            this.a.remove(str);
            r47 r47Var = d7aVar.m;
            if (r47Var != null && r47.c5(r47Var.k)) {
                i2 = 9;
            } else if (!d7aVar.H) {
                r47 r47Var2 = d7aVar.m;
                if ((r47Var2 == null || !r47.a4(r47Var2.k)) && ((arrayList = d7aVar.x) == null || arrayList.isEmpty() || !r47.a4(((r47) d7aVar.x.get(0)).k))) {
                    i = 0;
                    if (!d7aVar.I || d7aVar.J) {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add((r47) d7aVar.x.get(0));
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add((TLRPC.Message) d7aVar.z.get(0));
                        getMessagesStorage().g1(arrayList4, false, true, false, 0, false, i, 0L);
                        getMessagesController().z5(i, j, arrayList3);
                    } else {
                        getMessagesStorage().g1(d7aVar.z, false, true, false, 0, false, i, 0L);
                        getMessagesController().z5(i, j, d7aVar.x);
                    }
                    if (!d7aVar.H) {
                        getNotificationCenter().k(jn7.r, new Object[0]);
                    }
                    boolean z4 = f11.a;
                    cc4.b("add message");
                } else {
                    i2 = 5;
                }
            }
            i = i2;
            if (d7aVar.I) {
            }
            ArrayList arrayList32 = new ArrayList();
            arrayList32.add((r47) d7aVar.x.get(0));
            ArrayList arrayList42 = new ArrayList();
            arrayList42.add((TLRPC.Message) d7aVar.z.get(0));
            getMessagesStorage().g1(arrayList42, false, true, false, 0, false, i, 0L);
            getMessagesController().z5(i, j, arrayList32);
            if (!d7aVar.H) {
            }
            boolean z42 = f11.a;
            cc4.b("add message");
        }
        TLObject tLObject = d7aVar.c;
        if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
            TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject;
            while (r4 < tL_messages_sendMultiMedia.multi_media.size()) {
                TLRPC.InputMedia inputMedia = tL_messages_sendMultiMedia.multi_media.get(r4).media;
                if ((inputMedia instanceof TLRPC.TL_inputMediaUploadedPhoto) || (inputMedia instanceof TLRPC.TL_inputMediaUploadedDocument)) {
                    boolean z5 = f11.a;
                    cc4.b("multi media not ready");
                    return;
                }
                if ((inputMedia instanceof TLRPC.TL_inputMediaDocument) && r4 < d7aVar.x.size()) {
                    r47 r47Var3 = (r47) d7aVar.x.get(r4);
                    String str2 = r47Var3.k.attachPath;
                    if (str2 == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(xb4.z(4));
                        sb.append("/");
                        str2 = qu6.p(sb, r47Var3.F0().id, ".mp4");
                    }
                    if (d7aVar.E.containsKey(str2.concat("_ct")) && inputMedia.video_cover == null) {
                        boolean z6 = f11.a;
                        cc4.b("cover media not ready");
                        return;
                    }
                }
                r4++;
            }
            d7a x = x(d7aVar.G, j);
            if (x != null) {
                x.a(d7aVar.c, d7aVar.x, d7aVar.B, d7aVar.y, d7aVar, d7aVar.H);
                ArrayList arrayList5 = d7aVar.b;
                if (arrayList5 != null) {
                    x.b.addAll(arrayList5);
                }
                boolean z7 = f11.a;
                cc4.b("has maxDelayedMessage, delay");
                return;
            }
        } else {
            if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                TLRPC.InputMedia inputMedia2 = ((TLRPC.TL_messages_sendMedia) tLObject).media;
                if (inputMedia2 instanceof TLRPC.TL_inputMediaPoll) {
                    TLRPC.TL_inputMediaPoll tL_inputMediaPoll = (TLRPC.TL_inputMediaPoll) inputMedia2;
                    TLRPC.InputMedia inputMedia3 = tL_inputMediaPoll.attached_media;
                    if (!(inputMedia3 instanceof TLRPC.TL_inputMediaUploadedPhoto) && !(inputMedia3 instanceof TLRPC.TL_inputMediaUploadedDocument)) {
                        TLRPC.InputMedia inputMedia4 = tL_inputMediaPoll.solution_media;
                        if (!(inputMedia4 instanceof TLRPC.TL_inputMediaUploadedPhoto) && !(inputMedia4 instanceof TLRPC.TL_inputMediaUploadedDocument)) {
                            int size = tL_inputMediaPoll.poll.answers.size();
                            while (r4 < size) {
                                TLRPC.InputMedia e = ih8.e(tL_inputMediaPoll, r4);
                                r4 = ((e instanceof TLRPC.TL_inputMediaUploadedPhoto) || (e instanceof TLRPC.TL_inputMediaUploadedDocument)) ? 0 : r4 + 1;
                            }
                            d7a x2 = x(d7aVar.G, j);
                            if (x2 != null) {
                                x2.a(d7aVar.c, d7aVar.x, d7aVar.B, d7aVar.y, d7aVar, d7aVar.H);
                                ArrayList arrayList6 = d7aVar.b;
                                if (arrayList6 != null) {
                                    x2.b.addAll(arrayList6);
                                }
                                boolean z8 = f11.a;
                                cc4.b("has maxDelayedMessage, delay");
                                return;
                            }
                        }
                    }
                    boolean z9 = f11.a;
                    cc4.b("multi media not ready");
                    return;
                }
                TLRPC.InputMedia inputMedia5 = ((TLRPC.TL_messages_sendMedia) tLObject).media;
                if (inputMedia5 instanceof TLRPC.TL_inputMediaPaidMedia) {
                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) inputMedia5;
                    while (r4 < tL_inputMediaPaidMedia.extended_media.size()) {
                        TLRPC.InputMedia inputMedia6 = tL_inputMediaPaidMedia.extended_media.get(r4);
                        if ((inputMedia6 instanceof TLRPC.TL_inputMediaUploadedPhoto) || (inputMedia6 instanceof TLRPC.TL_inputMediaUploadedDocument)) {
                            boolean z10 = f11.a;
                            cc4.b("multi media not ready");
                            return;
                        }
                        r4++;
                    }
                    d7a x3 = x(d7aVar.G, j);
                    if (x3 != null) {
                        x3.a(d7aVar.c, d7aVar.x, d7aVar.B, d7aVar.y, d7aVar, d7aVar.H);
                        ArrayList arrayList7 = d7aVar.b;
                        if (arrayList7 != null) {
                            x3.b.addAll(arrayList7);
                        }
                        boolean z11 = f11.a;
                        cc4.b("has maxDelayedMessage, delay");
                        return;
                    }
                }
            }
            TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia = (TLRPC.TL_messages_sendEncryptedMultiMedia) d7aVar.d;
            while (r4 < tL_messages_sendEncryptedMultiMedia.files.size()) {
                if (tL_messages_sendEncryptedMultiMedia.files.get(r4) instanceof TLRPC.TL_inputEncryptedFile) {
                    return;
                } else {
                    r4++;
                }
            }
        }
        TLObject tLObject2 = d7aVar.c;
        if (tLObject2 instanceof TLRPC.TL_messages_sendMultiMedia) {
            O((TLRPC.TL_messages_sendMultiMedia) tLObject2, d7aVar.x, d7aVar.B, d7aVar.y, d7aVar, d7aVar.H);
        } else if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
            O((TLRPC.TL_messages_sendMedia) tLObject2, d7aVar.x, d7aVar.B, d7aVar.y, d7aVar, d7aVar.H);
        } else {
            getSecretChatHelper().k((TLRPC.TL_messages_sendEncryptedMultiMedia) d7aVar.d, d7aVar);
        }
        d7aVar.d();
    }

    public final void t(r47 r47Var, e eVar, int i, int i2) {
        TLRPC.TL_messages_editMessage tL_messages_editMessage;
        if (eVar.getParentActivity() == null) {
            return;
        }
        if (r47.c3(r47Var.k)) {
            TL_ephemeral.TL_editMessage tL_editMessage = new TL_ephemeral.TL_editMessage();
            tL_editMessage.id = r47.S(r47Var.e1());
            tL_editMessage.receiver_id = new TLRPC.TL_inputUserEmpty();
            tL_editMessage.welcome = true;
            tL_messages_editMessage = tL_editMessage;
        } else {
            TLRPC.TL_messages_editMessage tL_messages_editMessage2 = new TLRPC.TL_messages_editMessage();
            tL_messages_editMessage2.id = r47Var.e1();
            tL_messages_editMessage = tL_messages_editMessage2;
        }
        tL_messages_editMessage.peer = getMessagesController().j1(r47.B0(r47Var.k));
        TLRPC.Message message = r47Var.k;
        if (message != null && (message.flags & TLObject.FLAG_30) != 0) {
            tL_messages_editMessage.quick_reply_shortcut_id = message.quick_reply_shortcut_id;
            tL_messages_editMessage.flags |= 131072;
        }
        if (i != 0) {
            tL_messages_editMessage.schedule_date = i;
            int i3 = tL_messages_editMessage.flags;
            tL_messages_editMessage.flags = 32768 | i3;
            if (i2 != 0) {
                tL_messages_editMessage.schedule_repeat_period = i2;
                tL_messages_editMessage.flags = i3 | 294912;
            }
        }
        getConnectionsManager().sendRequest(tL_messages_editMessage, new qn8((Object) this, (Object) eVar, (Object) tL_messages_editMessage, (byte) 9));
    }

    public final void t0(TLRPC.Document document, String str, long j, r47 r47Var, r47 r47Var2, TL_stories.StoryItem storyItem, ou1 ou1Var, n47 n47Var, boolean z, int i, int i2, boolean z2, Object obj, c5a c5aVar, long j2, long j3, b77 b77Var) {
        u0(document, str, j, null, null, r47Var, r47Var2, storyItem, ou1Var, n47Var, z, i, i2, z2, obj, c5aVar, j2, j3, b77Var, false);
    }

    public final void u(r47 r47Var, TL_iv.RichMessage richMessage, ArrayList arrayList, e eVar, boolean z) {
        TLRPC.TL_messages_editMessage tL_messages_editMessage;
        if (r47Var == null || richMessage == null || r47Var.k == null) {
            return;
        }
        if (r47Var.Y2() && r47Var.k.reqId != 0) {
            getConnectionsManager().cancelRequest(r47Var.k.reqId, true);
            r47Var.k.reqId = 0;
        }
        if (r47.c3(r47Var.k)) {
            TL_ephemeral.TL_editMessage tL_editMessage = new TL_ephemeral.TL_editMessage();
            tL_editMessage.id = r47.S(r47Var.e1());
            tL_editMessage.receiver_id = new TLRPC.TL_inputUserEmpty();
            tL_editMessage.welcome = true;
            tL_messages_editMessage = tL_editMessage;
        } else {
            TLRPC.TL_messages_editMessage tL_messages_editMessage2 = new TLRPC.TL_messages_editMessage();
            tL_messages_editMessage2.id = r47Var.e1();
            tL_messages_editMessage = tL_messages_editMessage2;
        }
        TLRPC.TL_messages_editMessage tL_messages_editMessage3 = tL_messages_editMessage;
        tL_messages_editMessage3.peer = getMessagesController().j1(r47.B0(r47Var.k));
        tL_messages_editMessage3.rich_message = l0(arrayList, richMessage);
        int i = tL_messages_editMessage3.flags;
        int i2 = 8388608 | i;
        tL_messages_editMessage3.flags = i2;
        if (r47Var.r1) {
            tL_messages_editMessage3.schedule_date = r47Var.k.date;
            i2 = 8421376 | i;
            tL_messages_editMessage3.flags = i2;
        }
        TLRPC.Message message = r47Var.k;
        if ((message.flags & TLObject.FLAG_30) != 0) {
            tL_messages_editMessage3.quick_reply_shortcut_id = message.quick_reply_shortcut_id;
            tL_messages_editMessage3.flags = i2 | 131072;
        }
        message.rich_message = richMessage;
        message.send_state = 3;
        int sendRequest = getConnectionsManager().sendRequest(tL_messages_editMessage3, new gg2(this, z, r47Var, tL_messages_editMessage3, eVar, (byte) 4));
        TLRPC.Message message2 = r47Var.k;
        if (message2 != null) {
            message2.reqId = sendRequest;
        }
        getNotificationCenter().k(jn7.m0, Long.valueOf(r47.B0(r47Var.k)), qd4.t(r47Var));
    }

    public final void u0(TLRPC.Document document, String str, final long j, final CharSequence charSequence, final oec oecVar, final r47 r47Var, final r47 r47Var2, final TL_stories.StoryItem storyItem, final ou1 ou1Var, final n47 n47Var, final boolean z, final int i, final int i2, boolean z2, final Object obj, final c5a c5aVar, final long j2, final long j3, final b77 b77Var, final boolean z3) {
        final TLRPC.Document document2;
        TLRPC.PhotoSize photoSize;
        byte[] bArr;
        if (document != null) {
            HashMap hashMap = null;
            if (wf3.B(j)) {
                if (getMessagesController().a1(Integer.valueOf((int) (j & 4294967295L))) == null) {
                    return;
                }
                document2 = new TLRPC.TL_document_layer82();
                document2.id = document.id;
                document2.access_hash = document.access_hash;
                document2.date = document.date;
                document2.mime_type = document.mime_type;
                byte[] bArr2 = document.file_reference;
                document2.file_reference = bArr2;
                if (bArr2 == null) {
                    document2.file_reference = new byte[0];
                }
                document2.size = document.size;
                document2.dc_id = document.dc_id;
                document2.attributes = new ArrayList<>();
                for (int i3 = 0; i3 < document.attributes.size(); i3++) {
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        TLRPC.TL_documentAttributeVideo_layer159 tL_documentAttributeVideo_layer159 = new TLRPC.TL_documentAttributeVideo_layer159();
                        tL_documentAttributeVideo_layer159.flags = documentAttribute.flags;
                        tL_documentAttributeVideo_layer159.round_message = documentAttribute.round_message;
                        tL_documentAttributeVideo_layer159.supports_streaming = documentAttribute.supports_streaming;
                        tL_documentAttributeVideo_layer159.duration = documentAttribute.duration;
                        tL_documentAttributeVideo_layer159.w = documentAttribute.w;
                        tL_documentAttributeVideo_layer159.h = documentAttribute.h;
                        document2.attributes.add(tL_documentAttributeVideo_layer159);
                    } else {
                        document2.attributes.add(documentAttribute);
                    }
                }
                if (document2.mime_type == null) {
                    document2.mime_type = "";
                }
                TLRPC.PhotoSize w = xb4.w(document.thumbs, 10, false, null, false);
                if ((w instanceof TLRPC.TL_photoSize) || (w instanceof TLRPC.TL_photoSizeProgressive) || (w instanceof TLRPC.TL_photoStrippedSize)) {
                    xb4.G(this.currentAccount);
                    File J2 = xb4.J(w, null, true, true);
                    if ((w instanceof TLRPC.TL_photoStrippedSize) || J2.exists()) {
                        try {
                            if (w instanceof TLRPC.TL_photoStrippedSize) {
                                photoSize = new TLRPC.TL_photoStrippedSize();
                                bArr = w.bytes;
                            } else {
                                TLRPC.TL_photoCachedSize tL_photoCachedSize = new TLRPC.TL_photoCachedSize();
                                J2.length();
                                byte[] bArr3 = new byte[(int) J2.length()];
                                new RandomAccessFile(J2, "r").readFully(bArr3);
                                photoSize = tL_photoCachedSize;
                                bArr = bArr3;
                            }
                            TLRPC.TL_fileLocation_layer82 tL_fileLocation_layer82 = new TLRPC.TL_fileLocation_layer82();
                            TLRPC.FileLocation fileLocation = w.location;
                            tL_fileLocation_layer82.dc_id = fileLocation.dc_id;
                            tL_fileLocation_layer82.volume_id = fileLocation.volume_id;
                            tL_fileLocation_layer82.local_id = fileLocation.local_id;
                            tL_fileLocation_layer82.secret = fileLocation.secret;
                            photoSize.location = tL_fileLocation_layer82;
                            photoSize.size = w.size;
                            photoSize.w = w.w;
                            photoSize.h = w.h;
                            photoSize.type = w.type;
                            photoSize.bytes = bArr;
                            document2.thumbs.add(photoSize);
                            document2.flags |= 1;
                        } catch (Exception e) {
                            cc4.g(e, true);
                        }
                    }
                }
                if (document2.thumbs.isEmpty()) {
                    TLRPC.TL_photoSizeEmpty tL_photoSizeEmpty = new TLRPC.TL_photoSizeEmpty();
                    tL_photoSizeEmpty.type = "s";
                    document2.thumbs.add(tL_photoSizeEmpty);
                }
            } else {
                document2 = document;
            }
            if (r47.s3(document2, false)) {
                J.c(new Runnable() { // from class: p6a
                    @Override // java.lang.Runnable
                    public final void run() {
                        final Bitmap[] bitmapArr = new Bitmap[1];
                        final TLRPC.Document document3 = document2;
                        String q = jn5.b(document3).q(null, null, false);
                        String str2 = "video/mp4".equals(document3.mime_type) ? ".mp4" : "video/x-matroska".equals(document3.mime_type) ? ".mkv" : "";
                        File file = new File(xb4.z(3), qd4.o(q, str2));
                        if (!file.exists()) {
                            file = new File(xb4.z(2), qd4.o(q, str2));
                        }
                        final r7a r7aVar = r7a.this;
                        r7a.v(r7aVar.getAccountInstance(), false, document3, file.getAbsolutePath(), null, 0L, false);
                        final String[] strArr = {r7a.C(r7aVar.getAccountInstance(), xb4.w(document3.thumbs, jn7.q5, false, null, false), bitmapArr, true, true)};
                        final long j4 = j;
                        final oec oecVar2 = oecVar;
                        final r47 r47Var3 = r47Var;
                        final r47 r47Var4 = r47Var2;
                        final boolean z4 = z;
                        final int i4 = i;
                        final int i5 = i2;
                        final Object obj2 = obj;
                        final n47 n47Var2 = n47Var;
                        final TL_stories.StoryItem storyItem2 = storyItem;
                        final ou1 ou1Var2 = ou1Var;
                        final c5a c5aVar2 = c5aVar;
                        final long j5 = j2;
                        final long j6 = j3;
                        final b77 b77Var2 = b77Var;
                        final CharSequence charSequence2 = charSequence;
                        final boolean z5 = z3;
                        hl.c3(new Runnable() { // from class: g5a
                            @Override // java.lang.Runnable
                            public final void run() {
                                Bitmap[] bitmapArr2 = bitmapArr;
                                if (bitmapArr2[0] != null) {
                                    String[] strArr2 = strArr;
                                    if (strArr2[0] != null) {
                                        in5.z().K(new BitmapDrawable(bitmapArr2[0]), strArr2[0], false);
                                    }
                                }
                                TLRPC.TL_document tL_document = (TLRPC.TL_document) document3;
                                long j7 = j4;
                                p7a f = p7a.f(tL_document, wf3.B(j7) ? null : oecVar2, null, j7, r47Var3, r47Var4, null, null, null, null, z4, i4, i5, 0, obj2, n47Var2, false);
                                f.H = storyItem2;
                                f.J = ou1Var2;
                                f.K = c5aVar2;
                                f.Q = j5;
                                f.R = j6;
                                f.T = b77Var2;
                                CharSequence charSequence3 = charSequence2;
                                f.b = charSequence3 != null ? charSequence3.toString() : null;
                                f.L = z5;
                                r7a.this.q0(f);
                            }
                        });
                    }
                });
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                hashMap = new HashMap();
                hashMap.put("query", str);
            }
            p7a f = p7a.f((TLRPC.TL_document) document2, null, null, j, r47Var, r47Var2, null, null, null, hashMap, z, i, i2, 0, obj, n47Var, z2);
            f.H = storyItem;
            f.J = ou1Var;
            f.K = c5aVar;
            f.Q = j2;
            f.R = j3;
            f.T = b77Var;
            f.L = z3;
            q0(f);
        }
    }

    public final int v0(r47 r47Var, ArrayList arrayList, Runnable runnable) {
        byte[] bArr;
        if (r47Var != null) {
            String str = "poll_" + r47Var.D1();
            if (!this.r.containsKey(str)) {
                TLRPC.TL_messages_sendVote tL_messages_sendVote = new TLRPC.TL_messages_sendVote();
                tL_messages_sendVote.msg_id = r47Var.e1();
                tL_messages_sendVote.peer = getMessagesController().j1(r47.B0(r47Var.k));
                if (arrayList != null) {
                    bArr = new byte[arrayList.size()];
                    for (int i = 0; i < arrayList.size(); i++) {
                        TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) arrayList.get(i);
                        if (pollAnswer != null) {
                            tL_messages_sendVote.options.add(pollAnswer.option);
                            bArr[i] = pollAnswer.option[0];
                        }
                    }
                } else {
                    bArr = new byte[0];
                }
                this.w.put(str, bArr);
                return getConnectionsManager().sendRequest(tL_messages_sendVote, new au0((Object) this, (Object) r47Var, (Object) str, (Object) runnable, (byte) 18));
            }
        }
        return 0;
    }

    public final d7a x(int i, long j) {
        int e1;
        Iterator it = this.a.entrySet().iterator();
        d7a d7aVar = null;
        int i2 = TLObject.FLAG_31;
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) ((Map.Entry) it.next()).getValue();
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                d7a d7aVar2 = (d7a) arrayList.get(i3);
                byte b = d7aVar2.e;
                if ((b == 4 || b == 0) && d7aVar2.a == j) {
                    r47 r47Var = d7aVar2.m;
                    if (r47Var != null) {
                        e1 = r47Var.e1();
                    } else {
                        ArrayList arrayList2 = d7aVar2.x;
                        e1 = (arrayList2 == null || arrayList2.isEmpty()) ? 0 : ((r47) c00.g(1, d7aVar2.x)).e1();
                    }
                    if (e1 != 0 && e1 > i && d7aVar == null && i2 < e1) {
                        d7aVar = d7aVar2;
                        i2 = e1;
                    }
                }
            }
        }
        return d7aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0a77  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0b3b  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0b3e  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0a7a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y0(r47 r47Var, TLRPC.Message message, int i, List list, boolean z, int i2, HashMap hashMap) {
        List list2;
        String str;
        r7a r7aVar;
        r47 r47Var2;
        TLRPC.Message message2;
        boolean z2;
        TLRPC.MessageMedia messageMedia;
        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia;
        TLRPC.PhotoSize photoSize;
        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia2;
        boolean z3;
        String str2;
        String str3;
        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia3;
        String str4;
        TLRPC.FileLocation fileLocation;
        TLRPC.FileLocation fileLocation2;
        byte[] bArr;
        TLRPC.Message message3;
        String str5;
        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia4;
        String str6;
        r47 r47Var3;
        TLRPC.Photo photo;
        boolean z4;
        TLRPC.Photo photo2;
        String str7;
        String str8;
        String str9;
        TLRPC.PhotoSize photoSize2;
        TLRPC.Photo photo3;
        TLRPC.PhotoSize photoSize3;
        int i3;
        boolean z5;
        TLRPC.Photo photo4;
        int i4;
        String str10;
        File file;
        oec oecVar;
        TLRPC.MessageMedia messageMedia2;
        String str11;
        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia5;
        TLRPC.PhotoSize photoSize4;
        int i5;
        TLRPC.Message message4;
        int i6;
        int i7;
        String str12;
        File file2;
        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia6;
        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia7;
        TLRPC.PhotoSize photoSize5;
        TLObject tLObject;
        boolean z6;
        TLRPC.PhotoSize photoSize6;
        TLObject tLObject2;
        TLRPC.PhotoSize photoSize7;
        TLRPC.Document document;
        TLRPC.Photo photo5;
        TLRPC.PhotoSize w;
        TLRPC.MessageMedia messageMedia3;
        TLRPC.WebPage webPage;
        TLRPC.Document document2;
        TLRPC.MessageMedia messageMedia4;
        TLRPC.WebPage webPage2;
        TLRPC.Photo photo6;
        TLRPC.MessageMedia messageMedia5;
        TLRPC.Document document3;
        TLRPC.MessageMedia messageMedia6;
        TLRPC.Photo photo7;
        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia8;
        TLRPC.MessageMedia messageMedia7;
        String sb;
        r7a r7aVar2 = this;
        TLRPC.Message message5 = message;
        TLRPC.Message message6 = r47Var.k;
        if (list.isEmpty() || Math.max(0, i2) >= list.size()) {
            list2 = list;
            str = null;
        } else {
            list2 = list;
            str = (String) list2.get(Math.max(0, i2));
        }
        TLRPC.MessageMedia messageMedia8 = message5 == null ? null : message5.media;
        TLRPC.MessageMedia messageMedia9 = message6 == null ? null : message6.media;
        TLRPC.MessageMedia messageMedia10 = message6.media;
        if (messageMedia10 != null) {
            if (messageMedia10.storyItem != null) {
                message5.media = messageMedia10;
            } else if (!(messageMedia10 instanceof TLRPC.TL_messageMediaWidget)) {
                if (r47Var.C3()) {
                    TLRPC.MessageMedia messageMedia11 = message5.media;
                    if (messageMedia11 instanceof TLRPC.TL_messageMediaGeoLive) {
                        message6.media.period = messageMedia11.period;
                    }
                }
                boolean T2 = r47Var.T2();
                TLRPC.MessageMedia messageMedia12 = message6.media;
                if (T2) {
                    TLRPC.TL_messageMediaDice tL_messageMediaDice = (TLRPC.TL_messageMediaDice) messageMedia12;
                    TLRPC.TL_messageMediaDice tL_messageMediaDice2 = (TLRPC.TL_messageMediaDice) message5.media;
                    tL_messageMediaDice.value = tL_messageMediaDice2.value;
                    tL_messageMediaDice.flags = tL_messageMediaDice2.flags;
                    tL_messageMediaDice.game_outcome = tL_messageMediaDice2.game_outcome;
                    jxa.v(r7aVar2.currentAccount, true).L();
                } else {
                    TLRPC.Photo photo8 = messageMedia12.photo;
                    if (photo8 != null) {
                        photoSize5 = xb4.w(photo8.sizes, 40, false, null, false);
                        w = (message5 == null || (messageMedia6 = message5.media) == null || (photo7 = messageMedia6.photo) == null) ? photoSize5 : xb4.w(photo7.sizes, 40, false, null, false);
                        tLObject = message6.media.photo;
                    } else {
                        TLRPC.Document document4 = messageMedia12.document;
                        if (document4 != null) {
                            photoSize5 = xb4.w(document4.thumbs, 40, false, null, false);
                            w = (message5 == null || (messageMedia5 = message5.media) == null || (document3 = messageMedia5.document) == null) ? photoSize5 : xb4.w(document3.thumbs, 40, false, null, false);
                            tLObject = message6.media.document;
                        } else {
                            TLRPC.WebPage webPage3 = messageMedia12.webpage;
                            if (webPage3 != null) {
                                TLRPC.Photo photo9 = webPage3.photo;
                                if (photo9 != null) {
                                    photoSize5 = xb4.w(photo9.sizes, 40, false, null, false);
                                    w = (message5 == null || (messageMedia4 = message5.media) == null || (webPage2 = messageMedia4.webpage) == null || (photo6 = webPage2.photo) == null) ? photoSize5 : xb4.w(photo6.sizes, 40, false, null, false);
                                    tLObject = message6.media.webpage.photo;
                                } else {
                                    TLRPC.Document document5 = webPage3.document;
                                    if (document5 != null) {
                                        photoSize5 = xb4.w(document5.thumbs, 40, false, null, false);
                                        w = (message5 == null || (messageMedia3 = message5.media) == null || (webPage = messageMedia3.webpage) == null || (document2 = webPage.document) == null) ? photoSize5 : xb4.w(document2.thumbs, 40, false, null, false);
                                        tLObject = message6.media.webpage.document;
                                    }
                                }
                            } else if ((messageMedia12 instanceof TLRPC.TL_messageMediaPaidMedia) && (messageMedia8 instanceof TLRPC.TL_messageMediaPaidMedia)) {
                                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia12;
                                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) messageMedia8;
                                if (tL_messageMediaPaidMedia.extended_media.isEmpty() || tL_messageMediaPaidMedia2.extended_media.isEmpty()) {
                                    return;
                                }
                                if (i2 == -1) {
                                    int i8 = 0;
                                    while (i8 < tL_messageMediaPaidMedia.extended_media.size()) {
                                        r7aVar2.y0(r47Var, message5, i, list2, z, i8, message5.params);
                                        i8++;
                                        r7aVar2 = r7aVar2;
                                        list2 = list;
                                    }
                                    return;
                                }
                                r7aVar = r7aVar2;
                                r47Var2 = r47Var;
                                z2 = z;
                                boolean z7 = tL_messageMediaPaidMedia2.extended_media.size() > 1;
                                if (i2 < 0 || i2 >= tL_messageMediaPaidMedia2.extended_media.size()) {
                                    return;
                                }
                                TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia2.extended_media.get(i2);
                                if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                                    TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia9 = (TLRPC.TL_messageExtendedMedia) messageExtendedMedia;
                                    tL_messageExtendedMedia6 = tL_messageExtendedMedia9;
                                    messageMedia8 = tL_messageExtendedMedia9.media;
                                } else {
                                    tL_messageExtendedMedia6 = null;
                                }
                                TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia.extended_media.get(i2);
                                if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                                    TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia10 = (TLRPC.TL_messageExtendedMedia) messageExtendedMedia2;
                                    messageMedia9 = tL_messageExtendedMedia10.media;
                                    TLRPC.Photo photo10 = messageMedia9.photo;
                                    if (photo10 != null) {
                                        z6 = z7;
                                        TLRPC.PhotoSize w2 = xb4.w(photo10.sizes, 40, false, null, false);
                                        photoSize = (messageMedia8 == null || (photo5 = messageMedia8.photo) == null) ? w2 : xb4.w(photo5.sizes, 40, false, null, false);
                                        tLObject2 = messageMedia9.photo;
                                        photoSize6 = w2;
                                    } else {
                                        z6 = z7;
                                        TLRPC.Document document6 = messageMedia9.document;
                                        if (document6 != null) {
                                            TLRPC.PhotoSize w3 = xb4.w(document6.thumbs, 40, false, null, false);
                                            if (messageMedia8 == null || (document = messageMedia8.document) == null) {
                                                photoSize7 = w3;
                                                photoSize = photoSize7;
                                            } else {
                                                photoSize7 = w3;
                                                photoSize = xb4.w(document.thumbs, 40, false, null, false);
                                            }
                                            tLObject2 = messageMedia9.document;
                                            photoSize6 = photoSize7;
                                        } else {
                                            photoSize6 = null;
                                            photoSize = null;
                                            tLObject2 = null;
                                        }
                                    }
                                    photoSize5 = photoSize6;
                                    tL_messageExtendedMedia7 = tL_messageExtendedMedia10;
                                    TLObject tLObject3 = tLObject2;
                                    tL_messageExtendedMedia2 = tL_messageExtendedMedia6;
                                    tLObject = tLObject3;
                                    z3 = z6;
                                } else {
                                    z3 = z7;
                                    tL_messageExtendedMedia2 = tL_messageExtendedMedia6;
                                    tL_messageExtendedMedia7 = null;
                                    photoSize5 = null;
                                    tLObject = null;
                                    photoSize = null;
                                }
                                if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || !(photoSize5 instanceof TLRPC.TL_photoStrippedSize)) {
                                    tL_messageExtendedMedia8 = tL_messageExtendedMedia7;
                                    messageMedia7 = messageMedia8;
                                    message2 = message6;
                                } else {
                                    StringBuilder sb2 = new StringBuilder("stripped");
                                    tL_messageExtendedMedia8 = tL_messageExtendedMedia7;
                                    sb2.append(xc4.o(r47Var2));
                                    String sb3 = sb2.toString();
                                    if (message5 != null) {
                                        sb = "stripped" + xc4.o(message5);
                                        messageMedia7 = messageMedia8;
                                        message2 = message6;
                                    } else {
                                        StringBuilder m = uh9.m(i, "strippedmessage", "_");
                                        messageMedia7 = messageMedia8;
                                        message2 = message6;
                                        m.append(r47.v0(r47Var2.k));
                                        m.append("_");
                                        m.append(r47Var2.r1);
                                        sb = m.toString();
                                    }
                                    in5.z().N(sb3, sb, jn5.f(photoSize, tLObject), z2);
                                }
                                tL_messageExtendedMedia = tL_messageExtendedMedia8;
                                messageMedia = messageMedia7;
                            }
                        }
                    }
                    z3 = false;
                    photoSize = w;
                    tL_messageExtendedMedia2 = null;
                    r7aVar = r7aVar2;
                    r47Var2 = r47Var;
                    tL_messageExtendedMedia7 = null;
                    z2 = z;
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                    }
                    tL_messageExtendedMedia8 = tL_messageExtendedMedia7;
                    messageMedia7 = messageMedia8;
                    message2 = message6;
                    tL_messageExtendedMedia = tL_messageExtendedMedia8;
                    messageMedia = messageMedia7;
                }
            } else if (messageMedia8 instanceof TLRPC.TL_messageMediaWidget) {
                message6.media = messageMedia8;
            }
            r7aVar = r7aVar2;
            r47Var2 = r47Var;
            z2 = z;
            tL_messageExtendedMedia7 = null;
            photoSize5 = null;
            tLObject = null;
            photoSize = null;
            tL_messageExtendedMedia2 = null;
            z3 = false;
            if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
            }
            tL_messageExtendedMedia8 = tL_messageExtendedMedia7;
            messageMedia7 = messageMedia8;
            message2 = message6;
            tL_messageExtendedMedia = tL_messageExtendedMedia8;
            messageMedia = messageMedia7;
        } else {
            r7aVar = r7aVar2;
            r47Var2 = r47Var;
            message2 = message6;
            z2 = z;
            messageMedia = messageMedia8;
            tL_messageExtendedMedia = null;
            photoSize = null;
            tL_messageExtendedMedia2 = null;
            z3 = false;
        }
        if (message5 == null) {
            return;
        }
        String str13 = "s";
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia11 = tL_messageExtendedMedia2;
            if (messageMedia.photo != null && (messageMedia9 instanceof TLRPC.TL_messageMediaPhoto) && messageMedia9.photo != null) {
                if (messageMedia.ttl_seconds != 0 || r47Var2.r1 || r47.c3(message5)) {
                    str11 = "";
                    tL_messageExtendedMedia5 = tL_messageExtendedMedia;
                    photoSize4 = photoSize;
                } else {
                    boolean z8 = r47Var2.v1;
                    int i9 = messageMedia.document != null ? z8 ? 8 : 2 : z8 ? 6 : 0;
                    str11 = "";
                    jf7 messagesStorage = r7aVar.getMessagesStorage();
                    tL_messageExtendedMedia5 = tL_messageExtendedMedia;
                    TLRPC.Photo photo11 = messageMedia.photo;
                    StringBuilder sb4 = new StringBuilder("sent_");
                    photoSize4 = photoSize;
                    sb4.append(message5.peer_id.channel_id);
                    sb4.append("_");
                    sb4.append(message5.id);
                    sb4.append("_");
                    sb4.append(wf3.n(message5.peer_id));
                    sb4.append("_1_");
                    sb4.append(r47.p1(messageMedia9));
                    messagesStorage.i1(str, photo11, i9, sb4.toString());
                }
                if (messageMedia9.photo.sizes.size() == 1 && (messageMedia9.photo.sizes.get(0).location instanceof TLRPC.TL_fileLocationUnavailable)) {
                    messageMedia9.photo.sizes = messageMedia.photo.sizes;
                } else {
                    int i10 = 0;
                    while (i10 < messageMedia9.photo.sizes.size()) {
                        TLRPC.PhotoSize photoSize8 = messageMedia9.photo.sizes.get(i10);
                        if (photoSize8 == null || photoSize8.location == null || photoSize8.type == null) {
                            i5 = i10;
                            message4 = message5;
                        } else {
                            int i11 = 0;
                            while (i11 < messageMedia.photo.sizes.size()) {
                                TLRPC.PhotoSize photoSize9 = messageMedia.photo.sizes.get(i11);
                                if (photoSize9 == null || photoSize9.location == null || (photoSize9 instanceof TLRPC.TL_photoSizeEmpty) || (str12 = photoSize9.type) == null) {
                                    i7 = i10;
                                } else {
                                    int i12 = i10;
                                    if ((photoSize8.location.volume_id == -2147483648L && str12.equals(photoSize8.type)) || (photoSize9.w == photoSize8.w && photoSize9.h == photoSize8.h)) {
                                        String str14 = photoSize8.location.volume_id + "_" + photoSize8.location.local_id;
                                        String str15 = photoSize9.location.volume_id + "_" + photoSize9.location.local_id;
                                        if (str14.equals(str15)) {
                                            i6 = i12;
                                        } else {
                                            File file3 = new File(xb4.z(4), str14.concat(".jpg"));
                                            if (messageMedia.ttl_seconds != 0 || ((messageMedia.photo.sizes.size() != 1 && photoSize9.w <= 90 && photoSize9.h <= 90) || z3)) {
                                                i6 = i12;
                                                file2 = new File(xb4.z(4), str15.concat(".jpg"));
                                            } else {
                                                xb4.G(r7aVar.currentAccount);
                                                file2 = xb4.I(photoSize9);
                                                i6 = i12;
                                            }
                                            file3.renameTo(file2);
                                            in5.z().N(str14, str15, jn5.i(photoSize9, messageMedia.photo), z2);
                                            photoSize8.location = photoSize9.location;
                                            photoSize8.size = photoSize9.size;
                                        }
                                        message4 = message;
                                        i5 = i6;
                                    } else {
                                        i7 = i12;
                                    }
                                }
                                i11++;
                                i10 = i7;
                            }
                            i6 = i10;
                            String str16 = photoSize8.location.volume_id + "_" + photoSize8.location.local_id;
                            new File(xb4.z(4), str16.concat(".jpg")).delete();
                            if ("s".equals(photoSize8.type) && photoSize4 != null) {
                                i5 = i6;
                                TLRPC.PhotoSize photoSize10 = photoSize4;
                                messageMedia9.photo.sizes.set(i5, photoSize10);
                                jn5 i13 = jn5.i(photoSize10, messageMedia.photo);
                                message4 = message;
                                in5.z().N(str16, i13.q(message4, null, false), i13, z2);
                            }
                            message4 = message;
                            i5 = i6;
                        }
                        i10 = i5 + 1;
                        message5 = message4;
                    }
                }
                TLRPC.Message message7 = message5;
                if (!r47Var2.D3()) {
                    TLRPC.Message message8 = message2;
                    TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia12 = tL_messageExtendedMedia5;
                    if (!z3) {
                        message8.message = message7.message;
                        message7.attachPath = message8.attachPath;
                    } else if (tL_messageExtendedMedia12 != null && tL_messageExtendedMedia11 != null) {
                        tL_messageExtendedMedia12.attachPath = tL_messageExtendedMedia11.attachPath;
                    }
                    TLRPC.Photo photo12 = messageMedia9.photo;
                    TLRPC.Photo photo13 = messageMedia.photo;
                    photo12.id = photo13.id;
                    photo12.dc_id = photo13.dc_id;
                    photo12.access_hash = photo13.access_hash;
                    return;
                }
                String str17 = r47Var2.k.attachPath;
                String str18 = hashMap != null ? (String) Map.-EL.getOrDefault(hashMap, "imagePath", null) : null;
                TLRPC.Photo photo14 = messageMedia9.photo;
                TLRPC.Photo photo15 = messageMedia.photo;
                photo14.id = photo15.id;
                photo14.dc_id = photo15.dc_id;
                photo14.access_hash = photo15.access_hash;
                if (str18 != null && str18.startsWith(xb4.z(4).getAbsolutePath())) {
                    File file4 = new File(str18);
                    xb4.G(r7aVar.currentAccount);
                    if (file4.renameTo(xb4.J(messageMedia.photo, null, messageMedia.ttl_seconds != 0, true))) {
                        r47Var2.z0 = r47Var2.y0;
                        r47Var2.y0 = false;
                    }
                }
                TLRPC.Document document7 = message7.media.document;
                if (document7 != null) {
                    TLRPC.MessageMedia messageMedia13 = r47Var2.k.media;
                    messageMedia13.flags |= 16;
                    messageMedia13.document = document7;
                }
                if (str17 == null || !str17.startsWith(xb4.z(4).getAbsolutePath())) {
                    TLRPC.Message message9 = message2;
                    TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia13 = tL_messageExtendedMedia5;
                    if (tL_messageExtendedMedia13 != null) {
                        tL_messageExtendedMedia13.attachPath = str17;
                        return;
                    } else {
                        message7.attachPath = str17;
                        message7.message = message9.message;
                        return;
                    }
                }
                File file5 = new File(str17);
                xb4.G(r7aVar.currentAccount);
                File J2 = xb4.J(messageMedia.document, null, messageMedia.ttl_seconds != 0, true);
                if (file5.renameTo(J2)) {
                    TLRPC.Message message10 = message2;
                    TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia14 = tL_messageExtendedMedia5;
                    r47Var2.z0 = r47Var2.y0;
                    r47Var2.y0 = false;
                    String str19 = str11;
                    if (tL_messageExtendedMedia14 != null) {
                        tL_messageExtendedMedia14.attachPath = str19;
                        return;
                    } else {
                        message10.attachPath = str19;
                        return;
                    }
                }
                TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia15 = tL_messageExtendedMedia5;
                if (file5.exists()) {
                    if (tL_messageExtendedMedia5 != null) {
                        tL_messageExtendedMedia15.attachPath = str17;
                    } else {
                        message7.attachPath = str17;
                    }
                } else if (tL_messageExtendedMedia15 == null) {
                    r47Var2.y0 = false;
                }
                if (tL_messageExtendedMedia15 == null) {
                    r47Var2.z0 = J2.exists();
                }
                message7.message = message2.message;
                return;
            }
        }
        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia16 = tL_messageExtendedMedia;
        TLRPC.Message message11 = message2;
        if (!(messageMedia instanceof TLRPC.TL_messageMediaDocument) || messageMedia.document == null || !(messageMedia9 instanceof TLRPC.TL_messageMediaDocument) || messageMedia9.document == null) {
            TLRPC.MessageMedia messageMedia14 = message5.media;
            if ((messageMedia14 instanceof TLRPC.TL_messageMediaContact) && (message11.media instanceof TLRPC.TL_messageMediaContact)) {
                message11.media = messageMedia14;
                return;
            }
            if (messageMedia14 instanceof TLRPC.TL_messageMediaWebPage) {
                message11.media = messageMedia14;
                return;
            }
            if (messageMedia14 instanceof TLRPC.TL_messageMediaGeo) {
                TLRPC.GeoPoint geoPoint = messageMedia14.geo;
                TLRPC.GeoPoint geoPoint2 = message11.media.geo;
                geoPoint.lat = geoPoint2.lat;
                geoPoint._long = geoPoint2._long;
                return;
            }
            if (!(messageMedia14 instanceof TLRPC.TL_messageMediaGame) && !(messageMedia14 instanceof TLRPC.TL_messageMediaInvoice)) {
                if (messageMedia14 instanceof TLRPC.TL_messageMediaPoll) {
                    message11.media = messageMedia14;
                    return;
                }
                return;
            }
            message11.media = messageMedia14;
            if (!TextUtils.isEmpty(message5.message)) {
                message11.entities = message5.entities;
                message11.message = message5.message;
            }
            TLRPC.ReplyMarkup replyMarkup = message5.reply_markup;
            if (replyMarkup != null) {
                message11.reply_markup = replyMarkup;
                message11.flags |= 64;
                return;
            }
            return;
        }
        if (messageMedia.ttl_seconds == 0 && ((oecVar = r47Var2.r0) == null || (oecVar.G == null && TextUtils.isEmpty(oecVar.B) && r47Var2.r0.H == null))) {
            boolean K4 = r47.K4(message5);
            if (K4 || r47.t3(message5)) {
                str2 = "";
                if (r47.s3(messageMedia.document, false) == r47.s3(messageMedia9.document, false)) {
                    if (r47Var2.r1 || r47.c3(message5)) {
                        str3 = ".jpg";
                        messageMedia2 = messageMedia;
                        tL_messageExtendedMedia3 = tL_messageExtendedMedia16;
                    } else {
                        r47 r47Var4 = new r47(r7aVar.currentAccount, message5, false, false);
                        jf7 messagesStorage2 = r7aVar.getMessagesStorage();
                        TLRPC.Document document8 = messageMedia.document;
                        tL_messageExtendedMedia3 = tL_messageExtendedMedia16;
                        StringBuilder sb5 = new StringBuilder("sent_");
                        str3 = ".jpg";
                        messageMedia2 = messageMedia;
                        sb5.append(message5.peer_id.channel_id);
                        sb5.append("_");
                        sb5.append(message5.id);
                        sb5.append("_");
                        sb5.append(wf3.n(message5.peer_id));
                        sb5.append("_");
                        sb5.append(r47Var4.D);
                        sb5.append("_");
                        sb5.append(r47Var4.S1());
                        messagesStorage2.i1(str, document8, 2, sb5.toString());
                    }
                    if (K4) {
                        message5.attachPath = message11.attachPath;
                    }
                    messageMedia = messageMedia2;
                }
            } else {
                str2 = "";
            }
            str3 = ".jpg";
            messageMedia2 = messageMedia;
            tL_messageExtendedMedia3 = tL_messageExtendedMedia16;
            if (!r47.Q4(message5) && !r47.i4(message5) && !r47Var2.r1 && !r47.c3(message5)) {
                r47 r47Var5 = new r47(r7aVar.currentAccount, message5, false, false);
                messageMedia = messageMedia2;
                r7aVar.getMessagesStorage().i1(str, messageMedia.document, 1, "sent_" + message5.peer_id.channel_id + "_" + message5.id + "_" + wf3.n(message5.peer_id) + "_" + r47Var5.D + "_" + r47Var5.S1());
            }
            messageMedia = messageMedia2;
        } else {
            str2 = "";
            str3 = ".jpg";
            tL_messageExtendedMedia3 = tL_messageExtendedMedia16;
        }
        TLRPC.Photo photo16 = messageMedia9.video_cover;
        if (photo16 == null || (photo = messageMedia.video_cover) == null) {
            boolean z9 = z2;
            str4 = str;
            String str20 = str3;
            TLRPC.PhotoSize w4 = xb4.w(messageMedia9.document.thumbs, jn7.q5, false, null, false);
            TLRPC.PhotoSize w5 = xb4.w(messageMedia.document.thumbs, jn7.q5, false, null, false);
            if (w4 != null && (fileLocation2 = w4.location) != null && fileLocation2.volume_id == -2147483648L && w5 != null && w5.location != null && !(w5 instanceof TLRPC.TL_photoSizeEmpty) && !(w4 instanceof TLRPC.TL_photoSizeEmpty)) {
                String str21 = w4.location.volume_id + "_" + w4.location.local_id;
                String str22 = w5.location.volume_id + "_" + w5.location.local_id;
                if (!str21.equals(str22)) {
                    new File(xb4.z(4), str21.concat(str20)).renameTo(new File(xb4.z(4), str22.concat(str20)));
                    in5.z().N(str21, str22, jn5.c(w5, messageMedia.document), z9);
                    w4.location = w5.location;
                    w4.size = w5.size;
                }
            } else if (w5 != null && w4 != null && r47.v4(message5) && (fileLocation = w4.location) != null) {
                w5.location = fileLocation;
            } else if (w4 == null || (w4.location instanceof TLRPC.TL_fileLocationUnavailable) || (w4 instanceof TLRPC.TL_photoSizeEmpty)) {
                messageMedia9.document.thumbs = messageMedia.document.thumbs;
            }
        } else {
            xb4.w(photo16.sizes, 40, false, null, false);
            TLRPC.PhotoSize w6 = xb4.w(photo.sizes, 40, false, null, false);
            if (photo16.sizes.size() == 1 && (photo16.sizes.get(0).location instanceof TLRPC.TL_fileLocationUnavailable)) {
                photo16.sizes = photo.sizes;
            } else {
                int i14 = 0;
                while (i14 < photo16.sizes.size()) {
                    TLRPC.PhotoSize photoSize11 = photo16.sizes.get(i14);
                    if (photoSize11 == null || photoSize11.location == null || photoSize11.type == null) {
                        z4 = z2;
                        photo2 = photo16;
                        str7 = str13;
                        str8 = str;
                        str9 = str3;
                        photoSize2 = w6;
                    } else {
                        str8 = str;
                        int i15 = 0;
                        while (i15 < photo.sizes.size()) {
                            TLRPC.PhotoSize photoSize12 = photo.sizes.get(i15);
                            if (photoSize12 != null) {
                                i4 = i15;
                                if (photoSize12.location == null || (photoSize12 instanceof TLRPC.TL_photoSizeEmpty) || (str10 = photoSize12.type) == null) {
                                    z5 = z2;
                                    photo4 = photo16;
                                    photoSize3 = w6;
                                    i3 = i14;
                                } else {
                                    photoSize3 = w6;
                                    i3 = i14;
                                    if ((photoSize11.location.volume_id == -2147483648L && str10.equals(photoSize11.type)) || (photoSize12.w == photoSize11.w && photoSize12.h == photoSize11.h)) {
                                        StringBuilder sb6 = new StringBuilder();
                                        TLRPC.Photo photo17 = photo16;
                                        sb6.append(photoSize11.location.volume_id);
                                        sb6.append("_");
                                        sb6.append(photoSize11.location.local_id);
                                        String sb7 = sb6.toString();
                                        String str23 = photoSize12.location.volume_id + "_" + photoSize12.location.local_id;
                                        if (sb7.equals(str23)) {
                                            z4 = z;
                                            photo3 = photo17;
                                            str9 = str3;
                                        } else {
                                            photo3 = photo17;
                                            str9 = str3;
                                            File file6 = new File(xb4.z(4), sb7.concat(str9));
                                            if (messageMedia.ttl_seconds != 0 || ((photo.sizes.size() != 1 && photoSize12.w <= 90 && photoSize12.h <= 90) || z3)) {
                                                file = new File(xb4.z(4), str23.concat(str9));
                                            } else {
                                                xb4.G(r7aVar.currentAccount);
                                                file = xb4.J(photoSize12, null, true, true);
                                            }
                                            file6.renameTo(file);
                                            z4 = z;
                                            in5.z().N(sb7, str23, jn5.i(photoSize12, photo), z4);
                                            photoSize11.location = photoSize12.location;
                                            photoSize11.size = photoSize12.size;
                                        }
                                        photoSize2 = photoSize3;
                                        i14 = i3;
                                        photo2 = photo3;
                                        str7 = str13;
                                    } else {
                                        z5 = z2;
                                        photo4 = photo16;
                                    }
                                }
                            } else {
                                z5 = z2;
                                photo4 = photo16;
                                photoSize3 = w6;
                                i3 = i14;
                                i4 = i15;
                            }
                            w6 = photoSize3;
                            i14 = i3;
                            photo16 = photo4;
                            str3 = str3;
                            i15 = i4 + 1;
                            z2 = z5;
                            r7aVar = this;
                        }
                        z4 = z2;
                        photo3 = photo16;
                        photoSize3 = w6;
                        i3 = i14;
                        str9 = str3;
                        String str24 = photoSize11.location.volume_id + "_" + photoSize11.location.local_id;
                        new File(xb4.z(4), str24.concat(str9)).delete();
                        if (str13.equals(photoSize11.type) && photoSize3 != null) {
                            photo2 = photo3;
                            i14 = i3;
                            photo2.sizes.set(i14, photoSize3);
                            jn5 i16 = jn5.i(photoSize3, photo);
                            str7 = str13;
                            photoSize2 = photoSize3;
                            in5.z().N(str24, i16.q(message5, null, false), i16, z4);
                        }
                        photoSize2 = photoSize3;
                        i14 = i3;
                        photo2 = photo3;
                        str7 = str13;
                    }
                    i14++;
                    str13 = str7;
                    z2 = z4;
                    photo16 = photo2;
                    str = str8;
                    w6 = photoSize2;
                    r7aVar = this;
                    str3 = str9;
                }
            }
            TLRPC.Photo photo18 = photo16;
            str4 = str;
            photo18.id = photo.id;
            photo18.dc_id = photo.dc_id;
            photo18.access_hash = photo.access_hash;
        }
        TLRPC.Document document9 = messageMedia9.document;
        TLRPC.Document document10 = messageMedia.document;
        document9.dc_id = document10.dc_id;
        document9.id = document10.id;
        document9.access_hash = document10.access_hash;
        int i17 = 0;
        while (true) {
            if (i17 >= messageMedia9.document.attributes.size()) {
                bArr = null;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = messageMedia9.document.attributes.get(i17);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                bArr = documentAttribute.waveform;
                break;
            }
            i17++;
        }
        messageMedia9.document.attributes = messageMedia.document.attributes;
        if (bArr != null) {
            for (int i18 = 0; i18 < messageMedia9.document.attributes.size(); i18++) {
                TLRPC.DocumentAttribute documentAttribute2 = messageMedia9.document.attributes.get(i18);
                if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                    documentAttribute2.waveform = bArr;
                    documentAttribute2.flags |= 4;
                }
            }
        }
        TLRPC.Document document11 = messageMedia9.document;
        TLRPC.Document document12 = messageMedia.document;
        document11.size = document12.size;
        document11.mime_type = document12.mime_type;
        if ((message5.flags & 4) == 0 && ((message5.out || message5.dialog_id == getUserConfig().e()) && !r47.a4(message5))) {
            boolean M3 = r47.M3(messageMedia.document);
            TLRPC.Document document13 = messageMedia.document;
            if (M3) {
                if (r47.V2(document13) ? getMessagesController().k4.S0.f : true) {
                    getMediaDataController().c(messageMedia.document, message5.date, true);
                }
            } else if (r47.t4(document13) || r47.K2(messageMedia.document, true)) {
                ls6 mediaDataController = getMediaDataController();
                TLRPC.Document document14 = messageMedia.document;
                int i19 = message5.date;
                message3 = message5;
                str5 = str2;
                mediaDataController.d(0, message3, document14, i19, false);
                tL_messageExtendedMedia4 = tL_messageExtendedMedia3;
                str6 = tL_messageExtendedMedia3 == null ? tL_messageExtendedMedia4.attachPath : message11.attachPath;
                if (str6 != null || !str6.startsWith(xb4.z(4).getAbsolutePath()) || r47.s3(messageMedia.document, false)) {
                    if (tL_messageExtendedMedia4 == null) {
                        tL_messageExtendedMedia4.attachPath = str6;
                        return;
                    } else {
                        message3.attachPath = str6;
                        message3.message = message11.message;
                        return;
                    }
                }
                File file7 = new File(str6);
                xb4.G(this.currentAccount);
                File J3 = xb4.J(messageMedia.document, null, messageMedia.ttl_seconds != 0, true);
                if (!file7.renameTo(J3)) {
                    if (file7.exists()) {
                        if (tL_messageExtendedMedia4 != null) {
                            tL_messageExtendedMedia4.attachPath = str6;
                        } else {
                            message3.attachPath = str6;
                        }
                        r47Var3 = r47Var;
                    } else {
                        r47Var3 = r47Var;
                        if (tL_messageExtendedMedia4 == null) {
                            r47Var3.y0 = false;
                        }
                    }
                    if (tL_messageExtendedMedia4 == null) {
                        r47Var3.z0 = J3.exists();
                    }
                    message3.message = message11.message;
                    return;
                }
                if (r47.K4(message3)) {
                    r47Var.y0 = true;
                    return;
                }
                r47Var.z0 = r47Var.y0;
                r47Var.y0 = false;
                if (tL_messageExtendedMedia4 != null) {
                    tL_messageExtendedMedia4.attachPath = str5;
                } else {
                    message11.attachPath = str5;
                }
                if (str4 != null) {
                    String str25 = str4;
                    if (str25.startsWith("http")) {
                        jf7 messagesStorage3 = getMessagesStorage();
                        String file8 = J3.toString();
                        TLRPC.Document document15 = messageMedia9.document;
                        messagesStorage3.getClass();
                        if (str25.length() != 0) {
                            if ((file8 == null || file8.length() == 0) && document15 == null) {
                                return;
                            }
                            messagesStorage3.a.c(new oy6(messagesStorage3, document15, str25, file8, (byte) 11));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        message3 = message5;
        str5 = str2;
        tL_messageExtendedMedia4 = tL_messageExtendedMedia3;
        if (tL_messageExtendedMedia3 == null) {
        }
        if (str6 != null) {
        }
        if (tL_messageExtendedMedia4 == null) {
        }
    }

    public final TLRPC.TL_photo z(String str, Uri uri, boolean z) {
        TLRPC.PhotoSize W;
        Bitmap G = in5.G(str, uri, hl.Y0(z), hl.Y0(z), true);
        if (G == null) {
            G = in5.G(str, uri, 800.0f, 800.0f, true);
        }
        Bitmap bitmap = G;
        ArrayList<TLRPC.PhotoSize> arrayList = new ArrayList<>();
        TLRPC.PhotoSize U = in5.U(bitmap, 90.0f, 90.0f, 55, true);
        if (U != null) {
            arrayList.add(U);
        }
        if (z) {
            W = in5.W(null, bitmap, Bitmap.CompressFormat.JPEG, hl.Y0(z), hl.Y0(z), 99, false, 101, 101, false);
        } else {
            W = in5.W(null, bitmap, Bitmap.CompressFormat.JPEG, hl.Y0(z), hl.Y0(z), 80, false, 101, 101, false);
        }
        if (W != null) {
            arrayList.add(W);
        }
        if (bitmap != null) {
            bitmap.recycle();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        getUserConfig().u(false);
        TLRPC.TL_photo tL_photo = new TLRPC.TL_photo();
        tL_photo.date = getConnectionsManager().getCurrentTime();
        tL_photo.sizes = arrayList;
        tL_photo.file_reference = new byte[0];
        return tL_photo;
    }

    public final void z0(d7a d7aVar, TLRPC.InputMedia inputMedia, TLRPC.InputEncryptedFile inputEncryptedFile, String str) {
        int i = jn7.W1;
        byte b = 0;
        if (inputMedia == null) {
            if (inputEncryptedFile != null) {
                TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia = (TLRPC.TL_messages_sendEncryptedMultiMedia) d7aVar.d;
                int i2 = 0;
                while (true) {
                    if (i2 >= tL_messages_sendEncryptedMultiMedia.files.size()) {
                        break;
                    }
                    if (tL_messages_sendEncryptedMultiMedia.files.get(i2) == inputEncryptedFile) {
                        e0((TLRPC.Message) d7aVar.z.get(i2), d7aVar.H);
                        getNotificationCenter().k(i, str, -1L, -1L, Boolean.FALSE);
                        break;
                    }
                    i2++;
                }
                s0(d7aVar, false);
                return;
            }
            return;
        }
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.media = inputMedia;
        TLObject tLObject = d7aVar.c;
        if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
            TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject;
            tL_messages_uploadMedia.peer = tL_messages_sendMultiMedia.peer;
            int i3 = 0;
            while (true) {
                if (i3 >= tL_messages_sendMultiMedia.multi_media.size()) {
                    break;
                }
                if (tL_messages_sendMultiMedia.multi_media.get(i3).media == inputMedia) {
                    e0((TLRPC.Message) d7aVar.z.get(i3), d7aVar.H);
                    getNotificationCenter().k(i, str, -1L, -1L, Boolean.FALSE);
                    break;
                }
                i3++;
            }
        } else {
            if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
                TLRPC.InputMedia inputMedia2 = tL_messages_sendMedia.media;
                if (inputMedia2 instanceof TLRPC.TL_inputMediaPaidMedia) {
                    tL_messages_uploadMedia.peer = tL_messages_sendMedia.peer;
                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) inputMedia2;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= tL_inputMediaPaidMedia.extended_media.size()) {
                            break;
                        }
                        if (tL_inputMediaPaidMedia.extended_media.get(i4) == inputMedia) {
                            e0((TLRPC.Message) d7aVar.z.get(i4), d7aVar.H);
                            getNotificationCenter().k(i, str, -1L, -1L, Boolean.FALSE);
                            break;
                        }
                        i4++;
                    }
                } else {
                    TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject;
                    TLRPC.InputMedia inputMedia3 = tL_messages_sendMedia2.media;
                    if (inputMedia3 instanceof TLRPC.TL_inputMediaPoll) {
                        tL_messages_uploadMedia.peer = tL_messages_sendMedia2.peer;
                        int a = ih8.a((TLRPC.TL_inputMediaPoll) inputMedia3, inputMedia);
                        int i5 = 0;
                        while (true) {
                            if (i5 >= d7aVar.C.size()) {
                                break;
                            }
                            if (((Integer) d7aVar.C.get(i5)).intValue() == a) {
                                e0((TLRPC.Message) d7aVar.z.get(i5), d7aVar.H);
                                getNotificationCenter().k(i, str, -1L, -1L, Boolean.FALSE);
                                break;
                            }
                            i5++;
                        }
                    }
                }
            }
            if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
                TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) tLObject;
                TLRPC.InputMedia inputMedia4 = tL_sendMessage.media;
                if (inputMedia4 instanceof TLRPC.TL_inputMediaPaidMedia) {
                    tL_messages_uploadMedia.peer = tL_sendMessage.peer;
                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia2 = (TLRPC.TL_inputMediaPaidMedia) inputMedia4;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= tL_inputMediaPaidMedia2.extended_media.size()) {
                            break;
                        }
                        if (tL_inputMediaPaidMedia2.extended_media.get(i6) == inputMedia) {
                            e0((TLRPC.Message) d7aVar.z.get(i6), d7aVar.H);
                            getNotificationCenter().k(i, str, -1L, -1L, Boolean.FALSE);
                            break;
                        }
                        i6++;
                    }
                } else {
                    TL_ephemeral.TL_sendMessage tL_sendMessage2 = (TL_ephemeral.TL_sendMessage) tLObject;
                    TLRPC.InputMedia inputMedia5 = tL_sendMessage2.media;
                    if (inputMedia5 instanceof TLRPC.TL_inputMediaPoll) {
                        tL_messages_uploadMedia.peer = tL_sendMessage2.peer;
                        int a2 = ih8.a((TLRPC.TL_inputMediaPoll) inputMedia5, inputMedia);
                        int i7 = 0;
                        while (true) {
                            if (i7 >= d7aVar.C.size()) {
                                break;
                            }
                            if (((Integer) d7aVar.C.get(i7)).intValue() == a2) {
                                e0((TLRPC.Message) d7aVar.z.get(i7), d7aVar.H);
                                getNotificationCenter().k(i, str, -1L, -1L, Boolean.FALSE);
                                break;
                            }
                            i7++;
                        }
                    }
                }
            }
        }
        getConnectionsManager().sendRequest(tL_messages_uploadMedia, new e6a(this, inputMedia, d7aVar, b));
    }
}
