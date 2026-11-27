// default package

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class xb4 extends rf0 {
    public static Pattern J;
    public static volatile to3 K = new to3("fileUploadQueue");
    public static SparseArray L = null;
    public static final xb4[] M = new xb4[4];
    public static final pb4 N = new pb4();
    public final HashMap E;
    public sm5 F;
    public int G;
    public final ConcurrentHashMap H;
    public final qb4 I;
    public int a;
    public final zb4[] b;
    public final zb4[] c;
    public final ic4 d;
    public final LinkedList e;
    public final LinkedList f;
    public final ConcurrentHashMap h;
    public final ConcurrentHashMap n;
    public int r;
    public int s;
    public final ConcurrentHashMap w;
    public final ConcurrentHashMap x;
    public final HashMap y;

    public xb4(int i) {
        super(i);
        this.b = new zb4[5];
        this.c = new zb4[5];
        this.e = new LinkedList();
        this.f = new LinkedList();
        this.h = new ConcurrentHashMap();
        this.n = new ConcurrentHashMap();
        this.r = 0;
        this.s = 0;
        this.w = new ConcurrentHashMap();
        this.x = new ConcurrentHashMap(10, 1.0f, 2);
        this.y = new HashMap();
        this.E = new HashMap();
        this.F = null;
        this.H = new ConcurrentHashMap();
        this.I = new qb4(this, (byte) 0);
        this.d = new ic4(i);
        int i2 = 0;
        while (true) {
            zb4[] zb4VarArr = this.b;
            if (i2 >= zb4VarArr.length) {
                break;
            }
            zb4VarArr[i2] = new zb4(i, 0, K);
            this.c[i2] = new zb4(i, 1, K);
            i2++;
        }
        if (f11.a) {
            K.a(this.I);
            K.d(this.I, 10000L);
        }
    }

    public static String A(TLRPC.Document document) {
        String B = B(document);
        int lastIndexOf = B.lastIndexOf(46);
        String substring = lastIndexOf != -1 ? B.substring(lastIndexOf + 1) : null;
        if (substring == null || substring.length() == 0) {
            substring = document.mime_type;
        }
        if (substring == null) {
            substring = "";
        }
        return substring.toUpperCase();
    }

    public static String B(TLRPC.Document document) {
        String str = null;
        if (document == null) {
            return null;
        }
        String str2 = document.file_name_fixed;
        if (str2 != null) {
            return str2;
        }
        String str3 = document.file_name;
        if (str3 == null) {
            for (int i = 0; i < document.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeFilename) {
                    str = documentAttribute.file_name;
                }
            }
            str3 = str;
        }
        String q = q(str3);
        return q != null ? q : "";
    }

    public static String C(String str) {
        if (str == null) {
            return "";
        }
        switch (str) {
            case "audio/ogg":
                return ".ogg";
            case "video/mp4":
                return ".mp4";
            case "video/x-matroska":
                return ".mkv";
            default:
                return "";
        }
    }

    public static String D(File file) {
        String name = file.getName();
        try {
            return name.substring(name.lastIndexOf(46) + 1);
        } catch (Exception unused) {
            return "";
        }
    }

    public static hc4 E(Object obj) {
        if (!(obj instanceof String)) {
            if (!(obj instanceof r47)) {
                if (!(obj instanceof TL_stories.StoryItem)) {
                    return null;
                }
                hc4 hc4Var = new hc4();
                hc4Var.a = ((TL_stories.StoryItem) obj).dialogId;
                hc4Var.c = 23;
                return hc4Var;
            }
            r47 r47Var = (r47) obj;
            hc4 hc4Var2 = new hc4();
            hc4Var2.b = r47Var.e1();
            hc4Var2.a = r47.B0(r47Var.k);
            hc4Var2.c = r47Var.D;
            hc4Var2.d = r47Var.S1();
            return hc4Var2;
        }
        String str = (String) obj;
        if (!str.startsWith("sent_")) {
            return null;
        }
        Pattern pattern = J;
        if (pattern == null) {
            pattern = Pattern.compile("sent_.*_([0-9]+)_([0-9]+)_([0-9]+)_([0-9]+)");
            J = pattern;
        }
        try {
            Matcher matcher = pattern.matcher(str);
            if (!matcher.matches()) {
                return null;
            }
            hc4 hc4Var3 = new hc4();
            hc4Var3.b = Integer.parseInt(matcher.group(1));
            hc4Var3.a = Long.parseLong(matcher.group(2));
            hc4Var3.c = Integer.parseInt(matcher.group(3));
            hc4Var3.d = Long.parseLong(matcher.group(4));
            return hc4Var3;
        } catch (Exception e) {
            cc4.g(e, true);
            return null;
        }
    }

    public static xb4 G(int i) {
        xb4 xb4Var;
        xb4[] xb4VarArr = M;
        xb4 xb4Var2 = xb4VarArr[i];
        if (xb4Var2 != null) {
            return xb4Var2;
        }
        synchronized (xb4.class) {
            xb4Var = xb4VarArr[i];
            if (xb4Var == null) {
                xb4Var = new xb4(i);
                xb4VarArr[i] = xb4Var;
            }
        }
        return xb4Var;
    }

    public static String H(String str) {
        int lastIndexOf = str.lastIndexOf(47);
        return lastIndexOf != -1 ? str.substring(lastIndexOf + 1) : "";
    }

    public static File I(TLObject tLObject) {
        return J(tLObject, null, false, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static File J(TLObject tLObject, String str, boolean z, boolean z2) {
        File z3;
        int i;
        int i2;
        long j;
        long j2;
        int i3;
        File z4;
        long j3;
        int i4;
        int i5;
        String f;
        int i6 = 0;
        if (!z) {
            if (tLObject instanceof TLRPC.Document) {
                TLRPC.Document document = (TLRPC.Document) tLObject;
                if (!TextUtils.isEmpty(document.localPath)) {
                    return new File(document.localPath);
                }
                int i7 = document.key == null ? r47.P4(document) ? 1 : r47.J4(document) ? 2 : 3 : 4;
                j = document.id;
                i = document.dc_id;
                z3 = z(i7);
                i2 = i7;
            } else {
                if (tLObject instanceof TLRPC.Photo) {
                    return J(w(((TLRPC.Photo) tLObject).sizes, hl.Y0(true), false, null, false), str, false, z2);
                }
                if (tLObject instanceof TLRPC.PhotoSize) {
                    TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) tLObject;
                    if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
                        z4 = null;
                    } else {
                        TLRPC.FileLocation fileLocation = photoSize.location;
                        if (fileLocation == null || fileLocation.key != null || ((fileLocation.volume_id == -2147483648L && fileLocation.local_id < 0) || photoSize.size < 0)) {
                            i6 = 4;
                            z4 = z(4);
                        } else {
                            z4 = z(0);
                        }
                    }
                    TLRPC.FileLocation fileLocation2 = photoSize.location;
                    j3 = fileLocation2.volume_id;
                    i4 = fileLocation2.dc_id;
                    i5 = fileLocation2.local_id;
                } else if (tLObject instanceof TLRPC.TL_videoSize) {
                    TLRPC.TL_videoSize tL_videoSize = (TLRPC.TL_videoSize) tLObject;
                    TLRPC.FileLocation fileLocation3 = tL_videoSize.location;
                    if (fileLocation3 == null || fileLocation3.key != null || ((fileLocation3.volume_id == -2147483648L && fileLocation3.local_id < 0) || tL_videoSize.size < 0)) {
                        i6 = 4;
                        z4 = z(4);
                    } else {
                        z4 = z(0);
                    }
                    TLRPC.FileLocation fileLocation4 = tL_videoSize.location;
                    j3 = fileLocation4.volume_id;
                    i4 = fileLocation4.dc_id;
                    i5 = fileLocation4.local_id;
                } else if (tLObject instanceof TLRPC.FileLocation) {
                    TLRPC.FileLocation fileLocation5 = (TLRPC.FileLocation) tLObject;
                    if (fileLocation5.key == null) {
                        j2 = fileLocation5.volume_id;
                        if (j2 != -2147483648L || fileLocation5.local_id >= 0) {
                            i3 = fileLocation5.dc_id + (fileLocation5.local_id << 16);
                            z3 = z(0);
                            j = j2;
                            i = i3;
                            i2 = i6;
                        }
                    }
                    z3 = z(4);
                    j2 = 0;
                    i3 = 0;
                    j = j2;
                    i = i3;
                    i2 = i6;
                } else if ((tLObject instanceof TLRPC.UserProfilePhoto) || (tLObject instanceof TLRPC.ChatPhoto)) {
                    z3 = "s".equals("s") ? z(4) : z(0);
                } else if (tLObject instanceof jxc) {
                    jxc jxcVar = (jxc) tLObject;
                    z3 = jxcVar.e.startsWith("image/") ? z(0) : jxcVar.e.startsWith("audio/") ? z(1) : jxcVar.e.startsWith("video/") ? z(2) : z(3);
                } else if ((tLObject instanceof TLRPC.TL_secureFile) || (tLObject instanceof oy9)) {
                    z3 = z(4);
                } else {
                    i = 0;
                    i2 = 0;
                    z3 = null;
                    j = 0;
                }
                int i8 = (i5 << 16) + i4;
                j = j3;
                i = i8;
                z3 = z4;
                i2 = i6;
            }
            return z3 != null ? new File("") : (j == 0 || (f = G(yac.t0).d.f(i, i2, j, z2)) == null) ? new File(z3, r(str, tLObject)) : new File(f);
        }
        z3 = z(4);
        j = 0;
        i = 0;
        i2 = 0;
        if (z3 != null) {
        }
    }

    public static File K(TLObject tLObject, boolean z) {
        return J(tLObject, null, z, true);
    }

    public static File L(TLRPC.Message message) {
        return M(message, false, true);
    }

    public static File M(TLRPC.Message message, boolean z, boolean z2) {
        TLRPC.PhotoSize w;
        TLRPC.PhotoSize w2;
        TLRPC.PhotoSize w3;
        if (message == null) {
            return new File("");
        }
        if (message instanceof TLRPC.TL_messageService) {
            TLRPC.Photo photo = message.action.photo;
            if (photo != null) {
                ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
                if (arrayList.size() > 0 && (w3 = w(arrayList, hl.Y0(false), false, null, false)) != null) {
                    return J(w3, null, z, z2);
                }
            }
        } else {
            if (r47.n1(message) instanceof TLRPC.TL_messageMediaDocument) {
                return J(r47.n1(message).document, null, z || r47.n1(message).ttl_seconds != 0, z2);
            }
            if (r47.n1(message) instanceof TLRPC.TL_messageMediaPhoto) {
                ArrayList<TLRPC.PhotoSize> arrayList2 = r47.n1(message).photo.sizes;
                if (arrayList2.size() > 0 && (w2 = w(arrayList2, hl.Y0(true), false, null, true)) != null) {
                    return J(w2, null, z || r47.n1(message).ttl_seconds != 0, z2);
                }
            } else if (r47.n1(message) instanceof TLRPC.TL_messageMediaWebPage) {
                if (r47.n1(message).webpage.document != null) {
                    return J(r47.n1(message).webpage.document, null, z, z2);
                }
                if (r47.n1(message).webpage.photo != null) {
                    ArrayList<TLRPC.PhotoSize> arrayList3 = r47.n1(message).webpage.photo.sizes;
                    if (arrayList3.size() > 0 && (w = w(arrayList3, hl.Y0(false), false, null, false)) != null) {
                        return J(w, null, z, z2);
                    }
                }
            } else if (r47.n1(message) instanceof TLRPC.TL_messageMediaInvoice) {
                return J(((TLRPC.TL_messageMediaInvoice) r47.n1(message)).photo, null, true, z2);
            }
        }
        return new File("");
    }

    public static File N(TLRPC.Message message) {
        return M(message, false, true);
    }

    public static TLRPC.TL_photoStrippedSize Q(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) arrayList.get(i);
            if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                return (TLRPC.TL_photoStrippedSize) photoSize;
            }
        }
        return null;
    }

    public static TLRPC.VideoSize R(TLRPC.Photo photo) {
        if (photo != null && photo.video_sizes != null) {
            for (int i = 0; i < photo.video_sizes.size(); i++) {
                TLRPC.VideoSize videoSize = photo.video_sizes.get(i);
                if ((videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) || (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup)) {
                    return videoSize;
                }
            }
        }
        return null;
    }

    public static boolean U(TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, TLRPC.Photo photo) {
        if (tL_fileLocationToBeDeprecated != null && (photo instanceof TLRPC.TL_photo)) {
            int size = photo.sizes.size();
            for (int i = 0; i < size; i++) {
                TLRPC.FileLocation fileLocation = photo.sizes.get(i).location;
                if (fileLocation != null && fileLocation.local_id == tL_fileLocationToBeDeprecated.local_id && fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                    return true;
                }
            }
            if ((-tL_fileLocationToBeDeprecated.volume_id) == photo.id) {
                return true;
            }
        }
        return false;
    }

    public static void a(CountDownLatch countDownLatch, boolean z) {
        try {
            countDownLatch.await();
        } catch (Exception e) {
            cc4.g(e, false);
            if (z) {
                a(countDownLatch, false);
            }
        }
    }

    public static File j(int i) {
        return (File) L.get(i);
    }

    public static boolean m(int i, long j) {
        boolean p = yac.h(k5.a(i).a).p();
        if (j >= 2097152000) {
            return j < 4194304000L && p;
        }
        return true;
    }

    public static void o(GZIPInputStream gZIPInputStream, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] bArr = new byte[TLObject.FLAG_12];
        int i = 0;
        do {
            int read = gZIPInputStream.read(bArr);
            if (read <= 0) {
                break;
            }
            Thread.yield();
            fileOutputStream.write(bArr, 0, read);
            i += read;
        } while (i < 2097152);
        fileOutputStream.getFD().sync();
        fileOutputStream.close();
    }

    public static void p(int i, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        K.c(new mb4(arrayList, i));
    }

    public static String q(String str) {
        return str != null ? str.replaceAll("[\u0001-\u001f<>\u202e:\"/\\\\|?*\u007f]+", "").trim() : str;
    }

    public static String r(String str, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            String B = B(document);
            int lastIndexOf = B.lastIndexOf(46);
            String substring = lastIndexOf != -1 ? B.substring(lastIndexOf) : "";
            if (substring.length() <= 1) {
                substring = C(document.mime_type);
            }
            int length = substring.length();
            int i = document.dc_id;
            if (length > 1) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append("_");
                return qu6.p(sb, document.id, substring);
            }
            return i + "_" + document.id;
        }
        if (tLObject instanceof oy9) {
            TLRPC.TL_secureFile tL_secureFile = ((oy9) tLObject).b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_secureFile.dc_id);
            sb2.append("_");
            return qu6.p(sb2, tL_secureFile.id, ".jpg");
        }
        if (tLObject instanceof TLRPC.TL_secureFile) {
            TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) tLObject;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(tL_secureFile2.dc_id);
            sb3.append("_");
            return qu6.p(sb3, tL_secureFile2.id, ".jpg");
        }
        if (tLObject instanceof jxc) {
            jxc jxcVar = (jxc) tLObject;
            return Utilities.a(jxcVar.a) + "." + in5.x(jxcVar.a, H(jxcVar.e));
        }
        if (tLObject instanceof TLRPC.PhotoSize) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) tLObject;
            TLRPC.FileLocation fileLocation = photoSize.location;
            if (fileLocation != null && !(fileLocation instanceof TLRPC.TL_fileLocationUnavailable)) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(photoSize.location.volume_id);
                sb4.append("_");
                sb4.append(photoSize.location.local_id);
                sb4.append(".");
                if (str == null) {
                    str = "jpg";
                }
                sb4.append(str);
                return sb4.toString();
            }
        } else if (tLObject instanceof TLRPC.TL_videoSize) {
            TLRPC.TL_videoSize tL_videoSize = (TLRPC.TL_videoSize) tLObject;
            TLRPC.FileLocation fileLocation2 = tL_videoSize.location;
            if (fileLocation2 != null && !(fileLocation2 instanceof TLRPC.TL_fileLocationUnavailable)) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(tL_videoSize.location.volume_id);
                sb5.append("_");
                sb5.append(tL_videoSize.location.local_id);
                sb5.append(".");
                if (str == null) {
                    str = "mp4";
                }
                sb5.append(str);
                return sb5.toString();
            }
        } else if (tLObject instanceof TLRPC.FileLocation) {
            if (!(tLObject instanceof TLRPC.TL_fileLocationUnavailable)) {
                TLRPC.FileLocation fileLocation3 = (TLRPC.FileLocation) tLObject;
                StringBuilder sb6 = new StringBuilder();
                sb6.append(fileLocation3.volume_id);
                sb6.append("_");
                sb6.append(fileLocation3.local_id);
                sb6.append(".");
                if (str == null) {
                    str = "jpg";
                }
                sb6.append(str);
                return sb6.toString();
            }
        } else {
            if (tLObject instanceof TLRPC.UserProfilePhoto) {
                TLRPC.UserProfilePhoto userProfilePhoto = (TLRPC.UserProfilePhoto) tLObject;
                if (userProfilePhoto.photo_small != null) {
                    return "s".equals("s") ? r(str, userProfilePhoto.photo_small) : r(str, userProfilePhoto.photo_big);
                }
                StringBuilder sb7 = new StringBuilder();
                sb7.append(userProfilePhoto.photo_id);
                sb7.append("_s.");
                if (str == null) {
                    str = "jpg";
                }
                sb7.append(str);
                return sb7.toString();
            }
            if (tLObject instanceof TLRPC.ChatPhoto) {
                TLRPC.ChatPhoto chatPhoto = (TLRPC.ChatPhoto) tLObject;
                if (chatPhoto.photo_small != null) {
                    return "s".equals(null) ? r(str, chatPhoto.photo_small) : r(str, chatPhoto.photo_big);
                }
                StringBuilder sb8 = new StringBuilder();
                sb8.append(chatPhoto.photo_id);
                sb8.append("_null.");
                if (str == null) {
                    str = "jpg";
                }
                sb8.append(str);
                return sb8.toString();
            }
        }
        return "";
    }

    public static String s(TLObject tLObject) {
        return r(null, tLObject);
    }

    public static TLRPC.PhotoSize u(int i, ArrayList arrayList) {
        return w(arrayList, i, false, null, false);
    }

    public static TLRPC.PhotoSize v(int i, ArrayList arrayList, boolean z) {
        return w(arrayList, i, z, null, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
    
        if (r5.dc_id != Integer.MIN_VALUE) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x005e, code lost:
    
        if (r5.dc_id != Integer.MIN_VALUE) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TLRPC.PhotoSize w(ArrayList arrayList, int i, boolean z, TLRPC.PhotoSize photoSize, boolean z2) {
        int max;
        TLRPC.PhotoSize photoSize2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i2 = 0;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                TLRPC.PhotoSize photoSize3 = (TLRPC.PhotoSize) arrayList.get(i3);
                if (photoSize3 != null && photoSize3 != photoSize && !(photoSize3 instanceof TLRPC.TL_photoSizeEmpty) && !(photoSize3 instanceof TLRPC.TL_photoPathSize) && (!z2 || !(photoSize3 instanceof TLRPC.TL_photoStrippedSize))) {
                    if (z) {
                        max = Math.min(photoSize3.h, photoSize3.w);
                        if (photoSize2 != null) {
                            if (i > 100) {
                                TLRPC.FileLocation fileLocation = photoSize2.location;
                                if (fileLocation != null) {
                                }
                            }
                            if (!(photoSize3 instanceof TLRPC.TL_photoCachedSize)) {
                                if (i > i2) {
                                    if (i2 >= max) {
                                    }
                                }
                            }
                        }
                        photoSize2 = photoSize3;
                        i2 = max;
                    } else {
                        max = Math.max(photoSize3.w, photoSize3.h);
                        if (photoSize2 != null) {
                            if (i > 100) {
                                TLRPC.FileLocation fileLocation2 = photoSize2.location;
                                if (fileLocation2 != null) {
                                }
                            }
                            if (!(photoSize3 instanceof TLRPC.TL_photoCachedSize)) {
                                if (max <= i) {
                                    if (i2 >= max) {
                                    }
                                }
                            }
                        }
                        photoSize2 = photoSize3;
                        i2 = max;
                    }
                }
            }
        }
        return photoSize2;
    }

    public static TLRPC.VideoSize x(int i, ArrayList arrayList) {
        TLRPC.FileLocation fileLocation;
        TLRPC.VideoSize videoSize = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i2 = 0;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                TLRPC.VideoSize videoSize2 = (TLRPC.VideoSize) arrayList.get(i3);
                if (videoSize2 != null && !(videoSize2 instanceof TLRPC.TL_videoSizeEmojiMarkup) && !(videoSize2 instanceof TLRPC.TL_videoSizeStickerMarkup)) {
                    int max = Math.max(videoSize2.w, videoSize2.h);
                    if (videoSize == null || ((i > 100 && (fileLocation = videoSize.location) != null && fileLocation.dc_id == Integer.MIN_VALUE) || (max <= i && i2 < max))) {
                        videoSize = videoSize2;
                        i2 = max;
                    }
                }
            }
        }
        return videoSize;
    }

    public static File z(int i) {
        File file = (File) L.get(i);
        if (file == null && i != 4) {
            file = (File) L.get(4);
        }
        if (f11.b && file != null) {
            try {
                if (!file.isDirectory()) {
                    file.mkdirs();
                }
            } catch (Exception unused) {
            }
        }
        return file;
    }

    public final int F(Object obj) {
        int i = this.G;
        this.G = i + 1;
        this.H.put(Integer.valueOf(i), obj);
        return i;
    }

    public final int O(int i) {
        int i2;
        int i3;
        if (i == 4) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        if (i == 3) {
            i2 = this.a;
            this.a = i2 + 1;
            i3 = 1048577;
        } else {
            if (i != 2) {
                return i == 1 ? 65536 : 0;
            }
            i2 = this.a;
            this.a = i2 + 1;
            i3 = 65537;
        }
        return i2 + i3;
    }

    public final void P(ArrayList arrayList) {
        arrayList.clear();
        arrayList.addAll(getDownloadController().I);
        for (int i = 0; i < arrayList.size(); i++) {
            ((r47) arrayList.get(i)).Q = true;
        }
    }

    public final boolean S(String str) {
        return str != null && this.x.containsKey(str);
    }

    public final boolean T(TLRPC.Document document, boolean z) {
        if (document == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r(null, document));
        sb.append(z ? "p" : "");
        return this.E.containsKey(sb.toString());
    }

    public final void V(jn5 jn5Var, Object obj, String str, int i, int i2) {
        if (jn5Var == null) {
            return;
        }
        W(jn5Var.i, jn5Var.h, jn5Var.v, jn5Var.f, jn5Var, obj, str, jn5Var.r(), i, (i2 != 0 || (jn5Var.c == null && (jn5Var.k == null || jn5Var.r() != 0))) ? i2 : 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Runnable, ob4] */
    public final void W(final TLRPC.Document document, final oy9 oy9Var, final jxc jxcVar, final TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, final jn5 jn5Var, final Object obj, final String str, final long j, final int i, final int i2) {
        String str2;
        if (tL_fileLocationToBeDeprecated != null) {
            str2 = r(str, tL_fileLocationToBeDeprecated);
        } else {
            str2 = null;
            if (document != null) {
                str2 = r(null, document);
            } else if (jxcVar != null) {
                str2 = r(null, jxcVar);
            }
        }
        String str3 = str2;
        ?? r0 = new Runnable() { // from class: ob4
            @Override // java.lang.Runnable
            public final void run() {
                xb4.this.Y(document, oy9Var, jxcVar, tL_fileLocationToBeDeprecated, jn5Var, obj, str, j, i, null, 0L, false, i2);
            }
        };
        if (i2 != 10 && !TextUtils.isEmpty(str3) && !str3.contains("-2147483648")) {
            wb4 wb4Var = new wb4();
            wb4Var.a = r0;
            this.x.put(str3, wb4Var);
        }
        K.c(r0);
    }

    public final void X(TLRPC.Document document, Object obj, int i, int i2) {
        if (document == null) {
            return;
        }
        W(document, null, null, null, null, obj, null, 0L, i, (i2 != 0 || document.key == null) ? i2 : 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0254  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hb4 Y(TLRPC.Document document, oy9 oy9Var, jxc jxcVar, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, jn5 jn5Var, Object obj, String str, long j, int i, ib4 ib4Var, long j2, boolean z, int i2) {
        int i3;
        Object obj2;
        int i4;
        int i5;
        String str2;
        File file;
        hb4 hb4Var;
        int i6;
        hb4 hb4Var2;
        long j3;
        int i7;
        long j4;
        int i8;
        long j5;
        File z2;
        String str3;
        File file2;
        boolean z3;
        hc4 E;
        File file3;
        r47 r47Var;
        String str4;
        boolean z4;
        r47 r47Var2;
        File z5;
        boolean z6;
        ConcurrentHashMap concurrentHashMap = this.w;
        String r = tL_fileLocationToBeDeprecated != null ? r(str, tL_fileLocationToBeDeprecated) : oy9Var != null ? r(null, oy9Var) : document != null ? r(null, document) : jxcVar != null ? r(null, jxcVar) : null;
        if (r == null || r.contains("-2147483648")) {
            return null;
        }
        if (r.startsWith("0_0")) {
            cc4.g(new RuntimeException("cant get hash from " + document), true);
            return null;
        }
        if (i2 == 10 || TextUtils.isEmpty(r) || r.contains("-2147483648")) {
            i3 = 1;
        } else {
            i3 = 1;
            this.x.put(r, new wb4());
        }
        if (document != null && (obj instanceof r47)) {
            r47 r47Var3 = (r47) obj;
            if (r47Var3.P && !r47Var3.M2()) {
                lq3 downloadController = getDownloadController();
                downloadController.getClass();
                TLRPC.Document F0 = r47Var3.F0();
                if (F0 != null) {
                    hl.c3(new iq3(downloadController, F0, r47Var3, (byte) 0));
                }
            }
        }
        hb4 hb4Var3 = (hb4) concurrentHashMap.get(r);
        int O = O(i);
        if (hb4Var3 != null) {
            if (i2 != 10 && hb4Var3.y) {
                hb4Var3.o(false);
            }
            hb4Var3.V0 = O > 0 ? i3 : 0;
            hb4Var3.b = ib4Var;
            hb4Var3.d = j2;
            hb4Var3.c = z;
            Utilities.d.c(new ya4(hb4Var3, ib4Var, (byte) 0));
            if (hb4Var3.W0 != O) {
                hb4Var3.W0 = O;
            } else {
                i3 = 0;
            }
            hb4Var3.e1.a(hb4Var3);
            vb4 vb4Var = hb4Var3.g0;
            if (vb4Var != null) {
                long j6 = hb4Var3.a0;
                long j7 = hb4Var3.b0;
                if (j6 != j7 && j7 > 0) {
                    vb4Var.a(hb4Var3, j6, j7);
                }
            }
            if (i3 != 0) {
                hb4Var3.e1.b(false);
            }
            return hb4Var3;
        }
        File z7 = z(4);
        int i9 = 3;
        if (oy9Var != null) {
            obj2 = obj;
            i4 = O;
            i5 = 4;
            str2 = r;
            file = z7;
            i6 = 3;
            j3 = 0;
            i7 = 0;
            hb4Var = new hb4(oy9Var);
        } else if (tL_fileLocationToBeDeprecated != null) {
            long j8 = tL_fileLocationToBeDeprecated.volume_id;
            obj2 = obj;
            i4 = O;
            i5 = 4;
            str2 = r;
            file = z7;
            i7 = tL_fileLocationToBeDeprecated.dc_id + (tL_fileLocationToBeDeprecated.local_id << 16);
            j3 = j8;
            hb4Var = new hb4(jn5Var, obj2, str, j);
            i6 = 0;
        } else {
            obj2 = obj;
            i4 = O;
            i5 = 4;
            str2 = r;
            file = z7;
            if (document != null) {
                hb4Var2 = new hb4(obj2, document);
                if (r47.P4(document)) {
                    i9 = i3;
                    j4 = 0;
                    i8 = 0;
                } else {
                    boolean J4 = r47.J4(document);
                    j4 = document.id;
                    i8 = document.dc_id;
                    if (J4) {
                        i9 = 2;
                    }
                }
                if (!r47.h4(document)) {
                    i7 = i8;
                    j3 = j4;
                    i6 = i9;
                    hb4Var = hb4Var2;
                }
            } else {
                if (jxcVar != null) {
                    hb4Var2 = new hb4(this.currentAccount, jxcVar);
                    if (jxcVar.b != null) {
                        i6 = 4;
                        hb4Var = hb4Var2;
                    } else if (jxcVar.e.equals("audio/ogg")) {
                        hb4Var = hb4Var2;
                        i6 = i3;
                    } else {
                        if (jxcVar.e.startsWith("video/")) {
                            hb4Var = hb4Var2;
                            j3 = 0;
                            i6 = 2;
                        } else if (!r47.r3(jxcVar) && jxcVar.e.startsWith("image/")) {
                            hb4Var = hb4Var2;
                            j3 = 0;
                            i6 = 0;
                        }
                        i7 = 0;
                    }
                } else {
                    hb4Var = hb4Var3;
                    i6 = 4;
                }
                j3 = 0;
                i7 = 0;
            }
            hb4Var = hb4Var2;
            i6 = i9;
            j3 = 0;
            i7 = 0;
        }
        int j9 = Utilities.j(hb4Var.U - 1, i5, 0);
        boolean z8 = obj2 instanceof TL_stories.StoryItem;
        zb4 zb4Var = (hb4Var.b0 > 20971520 || z8) ? this.c[j9] : this.b[j9];
        if (i2 != 0 && i2 != 10 && !z8) {
            if (i2 == 2) {
                hb4Var.n0 = i3;
                hb4Var.o0 = false;
            }
            str3 = str2;
            z2 = file;
            j5 = j3;
        } else if (j3 != 0) {
            String f = this.d.f(i7, i6, j3, true);
            int i10 = i7;
            j5 = j3;
            if (f != null) {
                File file4 = new File(f);
                if (file4.exists()) {
                    String name = file4.getName();
                    file2 = file4.getParentFile();
                    str3 = name;
                    z3 = true;
                    if (z3) {
                        z2 = z(i6);
                        if (z8) {
                            File z9 = z(6);
                            if (z9 != null) {
                                z2 = z9;
                                z4 = true;
                            }
                            z4 = false;
                        } else {
                            if ((i6 == 0 || i6 == 2) && !f11.b && (E = E(obj2)) != null) {
                                long j10 = E.a;
                                if (!getMessagesController().E2(j10) && !wf3.B(j10)) {
                                    if (obj2 instanceof r47) {
                                        r47 r47Var4 = (r47) obj2;
                                        if (!r47Var4.g4()) {
                                            file3 = z2;
                                            if (!r47.Q4(r47Var4.k) && !r47Var4.M2() && !r47Var4.k.noforwards) {
                                                r47Var = r47Var4;
                                                if (eye.d(j10 < 0 ? 1 : xc2.V(getMessagesController().M0(Long.valueOf(-j10))) ? 4 : 2, E, r47Var, this.currentAccount)) {
                                                    z2 = i6 == 0 ? z(100) : z(101);
                                                    if (z2 == null) {
                                                        z2 = file3;
                                                        z4 = false;
                                                    }
                                                    z4 = true;
                                                }
                                            }
                                            if (!TextUtils.isEmpty(B(document)) && (obj2 instanceof r47)) {
                                                r47Var2 = (r47) obj2;
                                                if (r47Var2.U2() && !r47Var2.g4() && !r47.Q4(r47Var2.k)) {
                                                    String B = B(document);
                                                    z5 = z(5);
                                                    str4 = B;
                                                    if (z5 == null) {
                                                        z2 = z5;
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                        z2 = file3;
                                                    }
                                                    if (z4) {
                                                        hb4Var.c1 = new xx(j5, i10, i6);
                                                    }
                                                    str3 = str4;
                                                }
                                            }
                                            z2 = file3;
                                            str4 = str2;
                                            z4 = false;
                                            if (z4) {
                                            }
                                            str3 = str4;
                                        }
                                    } else {
                                        file3 = z2;
                                        int i11 = E.c;
                                        if (i11 != 5 && i11 != 13 && i11 != 2) {
                                            r47Var = null;
                                            if (eye.d(j10 < 0 ? 1 : xc2.V(getMessagesController().M0(Long.valueOf(-j10))) ? 4 : 2, E, r47Var, this.currentAccount)) {
                                            }
                                        }
                                        if (!TextUtils.isEmpty(B(document))) {
                                            r47Var2 = (r47) obj2;
                                            if (r47Var2.U2()) {
                                                String B2 = B(document);
                                                z5 = z(5);
                                                str4 = B2;
                                                if (z5 == null) {
                                                }
                                                if (z4) {
                                                }
                                                str3 = str4;
                                            }
                                        }
                                        z2 = file3;
                                        str4 = str2;
                                        z4 = false;
                                        if (z4) {
                                        }
                                        str3 = str4;
                                    }
                                }
                            }
                            file3 = z2;
                            if (!TextUtils.isEmpty(B(document))) {
                            }
                            z2 = file3;
                            str4 = str2;
                            z4 = false;
                            if (z4) {
                            }
                            str3 = str4;
                        }
                        str4 = str2;
                        if (z4) {
                        }
                        str3 = str4;
                    } else {
                        z2 = file2;
                    }
                }
            }
            str3 = str2;
            file2 = file;
            z3 = false;
            if (z3) {
            }
        } else {
            j5 = j3;
            z2 = z(i6);
            str3 = str2;
        }
        int i12 = this.currentAccount;
        hb4Var.T0 = z2;
        hb4Var.U0 = file;
        hb4Var.R = i12;
        String str5 = str2;
        hb4Var.r = str5;
        hb4Var.s = str3;
        hb4Var.e1 = zb4Var;
        if (i2 == 10) {
            hb4Var.o(true);
            z6 = true;
        } else {
            z6 = true;
        }
        Object obj3 = obj2;
        byte b = 0;
        hb4Var.g0 = new vb4(this, obj3, document, str5, i6);
        concurrentHashMap.put(str5, hb4Var);
        int i13 = i4;
        hb4Var.W0 = i13;
        ib4 ib4Var2 = ib4Var == null ? (ib4) hd4.I.get(Long.valueOf(j5)) : ib4Var;
        if (ib4Var2 != null) {
            hb4Var.b = ib4Var2;
            hb4Var.d = j2;
            hb4Var.c = z;
            Utilities.d.c(new ya4(hb4Var, ib4Var2, b));
        }
        zb4Var.a(hb4Var);
        zb4Var.b((!hb4Var.j || i13 < 1048576) ? false : z6);
        if (f11.a) {
            StringBuilder p = ik8.p("create load operation fileName=", str5, " documentName=");
            p.append(B(document));
            p.append(" size=");
            p.append(hl.i0(hb4Var.b0, false, false));
            p.append(" position in queue ");
            p.append(((ArrayList) hb4Var.e1.d).indexOf(hb4Var));
            p.append(" account=");
            bs2.w(p, this.currentAccount, " cacheType=", i2, " priority=");
            p.append(hb4Var.W0);
            p.append(" stream=");
            p.append(ib4Var2);
            cc4.b(p.toString());
        }
        return hb4Var;
    }

    public final void Z(TLRPC.Document document, boolean z, boolean z2) {
        if (document == null) {
            return;
        }
        if (z2) {
            hl.c3(new rb4(this, document, z, (byte) 1));
        } else {
            a0(document, z);
        }
    }

    public final void a0(TLRPC.Document document, boolean z) {
        String r = r(null, document);
        StringBuilder r2 = qd4.r(r);
        r2.append(z ? "p" : "");
        if (this.E.remove(r2.toString()) != null) {
            getNotificationCenter().k(jn7.h1, r);
        }
    }

    public final void b(String str, boolean z) {
        if (str == null) {
            return;
        }
        K.c(new ds6((Object) this, z, (Object) str, (byte) 19));
    }

    public final void b0(TLRPC.Document document, boolean z, boolean z2) {
        if (document == null) {
            return;
        }
        if (z2) {
            hl.c3(new rb4(this, document, z, (byte) 0));
        } else {
            d0(document, z);
        }
    }

    public final void c() {
        for (String str : this.x.keySet()) {
            wb4 wb4Var = (wb4) this.x.get(str);
            ob4 ob4Var = wb4Var != null ? wb4Var.a : null;
            if (ob4Var != null) {
                K.a(ob4Var);
            }
            K.c(new nb4(this, str, (byte) 0));
        }
    }

    public final void c0(TLRPC.Document document, boolean z) {
        if (document != null) {
            String r = r(null, document);
            StringBuilder r2 = qd4.r(r);
            r2.append(z ? "" : "p");
            String sb = r2.toString();
            HashMap hashMap = this.E;
            if (hashMap.containsKey(sb)) {
                StringBuilder r3 = qd4.r(r);
                r3.append(z ? "p" : "");
                hashMap.put(r3.toString(), Boolean.TRUE);
                getNotificationCenter().k(jn7.h1, r);
            }
        }
    }

    public final void d(TLRPC.Document document) {
        f(document);
    }

    public final void d0(TLRPC.Document document, boolean z) {
        String r = r(null, document);
        StringBuilder r2 = qd4.r(r);
        r2.append(z ? "p" : "");
        this.E.put(r2.toString(), Boolean.TRUE);
        getNotificationCenter().k(jn7.h1, r);
    }

    public final void e(TLRPC.Document document, oy9 oy9Var, jxc jxcVar, TLRPC.FileLocation fileLocation, String str, String str2) {
        boolean z;
        if (fileLocation == null && document == null && jxcVar == null && oy9Var == null && TextUtils.isEmpty(str2)) {
            return;
        }
        ob4 ob4Var = null;
        if (fileLocation != null) {
            str2 = r(str, fileLocation);
        } else if (document != null) {
            str2 = r(null, document);
        } else if (oy9Var != null) {
            str2 = r(null, oy9Var);
        } else if (jxcVar != null) {
            str2 = r(null, jxcVar);
        }
        wb4 wb4Var = (wb4) this.x.remove(str2);
        byte b = 1;
        if (wb4Var != null) {
            ob4Var = wb4Var.a;
            z = true;
        } else {
            z = false;
        }
        if (ob4Var != null) {
            K.a(ob4Var);
        }
        K.c(new nb4(this, str2, b));
        if (!z || document == null) {
            return;
        }
        hl.c3(new qb4(this, b));
    }

    public final void e0(String str, TLObject tLObject) {
        boolean z = tLObject instanceof TLRPC.Document;
        ic4 ic4Var = this.d;
        if (z) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            int i = document.key == null ? r47.P4(document) ? 1 : r47.J4(document) ? 2 : 3 : 4;
            long j = document.id;
            int i2 = document.dc_id;
            ic4Var.getClass();
            ic4Var.h(new gc4(ic4Var, j, i2, i, str, 1));
            return;
        }
        if (tLObject instanceof TLRPC.PhotoSize) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) tLObject;
            if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
                return;
            }
            TLRPC.FileLocation fileLocation = photoSize.location;
            if (fileLocation != null && fileLocation.key == null && ((fileLocation.volume_id != -2147483648L || fileLocation.local_id >= 0) && photoSize.size >= 0)) {
                r9 = 0;
            }
            long j2 = fileLocation.volume_id;
            int i3 = fileLocation.dc_id + (fileLocation.local_id << 16);
            ic4Var.getClass();
            ic4Var.h(new gc4(ic4Var, j2, i3, r9, str, 1));
        }
    }

    public final void f(TLRPC.Document document) {
        e(document, null, null, null, null, null);
    }

    public final void f0(final pcc pccVar, final String str) {
        final vx3 vx3Var = new vx3(this, r0, (byte) 17);
        fn7[] fn7VarArr = {new fn7() { // from class: lb4
            @Override // fn7
            public final void didReceivedNotification(int i, int i2, Object[] objArr) {
                int i3 = jn7.U1;
                String str2 = str;
                pcc pccVar2 = pccVar;
                vx3 vx3Var2 = vx3Var;
                if (i == i3) {
                    if (objArr[0] == str2) {
                        pccVar2.a((TLRPC.InputFile) objArr[1]);
                        vx3Var2.run();
                        return;
                    }
                    return;
                }
                if (i == jn7.V1 && objArr[0] == str2) {
                    pccVar2.a(null);
                    vx3Var2.run();
                }
            }
        }};
        getNotificationCenter().a(fn7VarArr[0], jn7.U1);
        getNotificationCenter().a(fn7VarArr[0], jn7.V1);
        h0(false, 67108864, str, false);
    }

    public final void g(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            e(null, null, null, null, null, (String) arrayList.get(i));
        }
    }

    public final void g0(final String str, final boolean z, final boolean z2, final long j, final int i, final boolean z3) {
        if (str == null) {
            return;
        }
        K.c(new Runnable() { // from class: tb4
            @Override // java.lang.Runnable
            public final void run() {
                long j2;
                xb4 xb4Var = xb4.this;
                HashMap hashMap = xb4Var.y;
                ConcurrentHashMap concurrentHashMap = xb4Var.h;
                ConcurrentHashMap concurrentHashMap2 = xb4Var.n;
                boolean z4 = z;
                String str2 = str;
                if (z4) {
                    if (concurrentHashMap2.containsKey(str2)) {
                        return;
                    }
                } else if (concurrentHashMap.containsKey(str2)) {
                    return;
                }
                long j3 = j;
                if (j3 == 0 || ((Long) hashMap.get(str2)) == null) {
                    j2 = j3;
                } else {
                    hashMap.remove(str2);
                    j2 = 0;
                }
                String str3 = str2;
                nd4 nd4Var = new nd4(xb4Var.currentAccount, i, j2, str3, z4);
                sm5 sm5Var = xb4Var.F;
                if (sm5Var != null && j3 != 0) {
                    sm5Var.a(nd4Var, str3, 0L, j3, z4);
                    nd4Var = nd4Var;
                    str3 = str3;
                    z4 = z4;
                }
                if (z4) {
                    concurrentHashMap2.put(str3, nd4Var);
                } else {
                    concurrentHashMap.put(str3, nd4Var);
                }
                if (z3) {
                    nd4Var.E = true;
                }
                boolean z5 = z2;
                nd4Var.o = new ub4(xb4Var, z4, str3, z5);
                if (z5) {
                    int i2 = xb4Var.s;
                    if (i2 >= 1) {
                        xb4Var.f.add(nd4Var);
                        return;
                    } else {
                        xb4Var.s = i2 + 1;
                        nd4Var.c();
                        return;
                    }
                }
                int i3 = xb4Var.r;
                if (i3 >= 1) {
                    xb4Var.e.add(nd4Var);
                } else {
                    xb4Var.r = i3 + 1;
                    nd4Var.c();
                }
            }
        });
    }

    public final void h(int i, TLRPC.Document document, oy9 oy9Var, jxc jxcVar, TLRPC.FileLocation fileLocation, String str) {
        if (fileLocation == null && document == null && jxcVar == null && oy9Var == null) {
            return;
        }
        K.c(new sb4((Object) this, (Object) (fileLocation != null ? r(str, fileLocation) : document != null ? r(null, document) : oy9Var != null ? r(null, oy9Var) : jxcVar != null ? r(null, jxcVar) : null), i, (byte) 0));
    }

    public final void h0(boolean z, int i, String str, boolean z2) {
        g0(str, z, z2, 0L, i, false);
    }

    public final void i() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(getDownloadController().I);
        for (int i = 0; i < arrayList2.size(); i++) {
            ((r47) arrayList2.get(i)).K(true);
            if (((r47) arrayList2.get(i)).z0) {
                arrayList.add((r47) arrayList2.get(i));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        hl.c3(new vx3(this, arrayList, (byte) 19));
    }

    public final boolean k(String str) {
        hb4 hb4Var;
        if (str == null || (hb4Var = (hb4) this.w.get(str)) == null || !hb4Var.l) {
            return false;
        }
        hb4Var.l = false;
        return true;
    }

    public final void l(ArrayList arrayList) {
        ic4 ic4Var = this.d;
        ic4Var.getClass();
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        long currentTimeMillis = System.currentTimeMillis();
        long[] jArr = new long[1];
        ao1 ao1Var = new ao1(ic4Var, arrayList2, jArr, countDownLatch, (byte) 17);
        ic4Var.d();
        to3 to3Var = ic4Var.a;
        Handler handler = to3Var.a;
        if (handler != null) {
            handler.postAtFrontOfQueue(ao1Var);
        } else {
            synchronized (to3Var.b) {
                ArrayList arrayList3 = to3Var.c;
                if (arrayList3 != null) {
                    arrayList3.add(new so3(1, 0L, ao1Var));
                } else {
                    to3Var.a.postAtFrontOfQueue(ao1Var);
                }
            }
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            cc4.g(e, true);
        }
        StringBuilder sb = new StringBuilder("checkMediaExistance size=");
        sb.append(arrayList.size());
        sb.append(" time=");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        sb.append(" thread_time=");
        ik8.q(jArr[0], sb);
        boolean z = f11.a;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            cc4.g(new Exception("warning, not allowed in main thread"), true);
        }
    }

    public final void n(String str, boolean z, long j, long j2, Float f) {
        K.c(new kb4(this, z, str, j, j2, f));
    }

    public final float t(String str, float f) {
        hb4 hb4Var;
        if (!TextUtils.isEmpty(str) && (hb4Var = (hb4) this.w.get(str)) != null) {
            ArrayList arrayList = hb4Var.N;
            if (hb4Var.b0 != 0 && arrayList != null) {
                return (hb4Var.f((int) (r5 * f), r5, arrayList) / hb4Var.b0) + f;
            }
        }
        return 0.0f;
    }

    public final void y(ArrayList arrayList) {
        arrayList.clear();
        arrayList.addAll(getDownloadController().H);
        for (int i = 0; i < arrayList.size(); i++) {
            ((r47) arrayList.get(i)).Q = true;
        }
    }
}
