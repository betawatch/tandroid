package ph;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.m71;
import org.telegram.ui.wx0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class u6 {
    public String A;
    public int A0;
    public String B;
    public int B0;
    public long C;
    public CharSequence C0;
    public long D;
    public float E;
    public d8 E0;
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
    public MediaController.SavedFilterState a1;
    public long b;
    public boolean b0;
    public Bitmap b1;
    public boolean c;
    public TLRPC.Document c0;
    public boolean c1;
    public long d;
    public kh.h d0;
    public t6 d1;
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
    public MediaController.CropState m0;
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
    public final int a = UserConfig.selectedAccount;
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
    public boolean y0 = org.telegram.ui.ActionBar.j6.I.q();
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
        if (i11 * i12 * 8 > maxMemory || Math.max(i11, i12) > 4200 || SharedConfig.getDevicePerformanceClass() <= 0) {
            options.inScaled = true;
            options.inDensity = options.outWidth;
            options.inTargetDensity = i10;
        }
    }

    public static Boolean D(MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.Peer peer;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return null;
        }
        TLRPC.Chat chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(message.peer_id)));
        if ((chat == null || !chat.noforwards) && ChatObject.isChannelAndNotMegaGroup(chat)) {
            return Boolean.FALSE;
        }
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
        if (messageFwdHeader != null && (peer = messageFwdHeader.from_id) != null && (messageFwdHeader.flags & 4) != 0) {
            long peerDialogId = DialogObject.getPeerDialogId(peer);
            TLRPC.Chat chat2 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-peerDialogId));
            if (peerDialogId < 0 && ((chat2 == null || !chat2.noforwards) && ChatObject.isChannelAndNotMegaGroup(chat2))) {
                return Boolean.TRUE;
            }
        }
        return null;
    }

    public static u6 a(r rVar, ArrayList arrayList) {
        u6 u6Var = new u6();
        u6Var.S = rVar;
        u6Var.T = arrayList;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u6 u6Var2 = (u6) obj;
            if (u6Var2.K) {
                u6Var.K = true;
                u6Var2.V = 0.0f;
                u6Var2.W = Math.min(1.0f, 59000.0f / u6Var2.h0);
            }
        }
        if (u6Var.K) {
            u6Var.k0 = 720;
            u6Var.l0 = 1280;
            u6Var.i0 = 720;
            u6Var.j0 = 1280;
        } else {
            u6Var.k0 = 1080;
            u6Var.l0 = 1920;
            u6Var.i0 = 1080;
            u6Var.j0 = 1920;
        }
        u6Var.A();
        return u6Var;
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

    public static u6 l(MediaController.PhotoEntry photoEntry) {
        int i10;
        u6 u6Var = new u6();
        u6Var.L = new File(photoEntry.path);
        u6Var.Q = photoEntry.orientation;
        u6Var.R = photoEntry.invert;
        u6Var.K = !photoEntry.isLivePhoto() && photoEntry.isVideo;
        u6Var.N = photoEntry.thumbPath;
        long j10 = photoEntry.duration * 1000;
        u6Var.h0 = j10;
        u6Var.Z = 0.0f;
        u6Var.a0 = Math.min(1.0f, 59000.0f / j10);
        if (u6Var.K && u6Var.N == null) {
            u6Var.N = "vthumb://" + photoEntry.imageId;
        }
        u6Var.A0 = photoEntry.gradientTopColor;
        u6Var.B0 = photoEntry.gradientBottomColor;
        u6Var.h(u6Var.L.getAbsolutePath());
        int i11 = photoEntry.width;
        if (i11 > 0 && (i10 = photoEntry.height) > 0) {
            u6Var.k0 = i11;
            u6Var.l0 = i10;
        }
        u6Var.A();
        return u6Var;
    }

    public static u6 m(int i10, File file) {
        u6 u6Var = new u6();
        u6Var.L = file;
        u6Var.M = true;
        u6Var.Q = i10;
        u6Var.R = 0;
        u6Var.K = false;
        if (file != null) {
            u6Var.h(file.getAbsolutePath());
        }
        u6Var.A();
        return u6Var;
    }

    public static u6 n(File file, TL_stories.StoryItem storyItem) {
        u6 u6Var = new u6();
        u6Var.g = true;
        u6Var.f = storyItem.id;
        u6Var.L = file;
        u6Var.M = false;
        u6Var.k0 = 720;
        u6Var.l0 = 1280;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        boolean z4 = messageMedia instanceof TLRPC.TL_messageMediaPhoto;
        int i10 = u6Var.a;
        if (z4) {
            u6Var.K = false;
            if (file != null) {
                u6Var.h(file.getAbsolutePath());
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            u6Var.K = true;
            TLRPC.Document document = messageMedia.document;
            if (document != null && document.attributes != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= storyItem.media.document.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i11);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        u6Var.k0 = documentAttribute.w;
                        u6Var.l0 = documentAttribute.h;
                        u6Var.i = documentAttribute.duration;
                        break;
                    }
                    i11++;
                }
            }
            TLRPC.Document document2 = storyItem.media.document;
            if (document2 != null) {
                String str = storyItem.firstFramePath;
                if (str != null) {
                    u6Var.N = str;
                } else if (document2.thumbs != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= storyItem.media.document.thumbs.size()) {
                            break;
                        }
                        TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i12);
                        if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                            u6Var.O = ImageLoader.getStrippedPhotoBitmap(photoSize.bytes, null);
                            break;
                        }
                        File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(photoSize, true);
                        if (pathToAttach != null && pathToAttach.exists()) {
                            u6Var.N = pathToAttach.getAbsolutePath();
                            break;
                        }
                        i12++;
                    }
                }
            }
        }
        ArrayList arrayList = u6Var.F0;
        arrayList.clear();
        ArrayList<TLRPC.PrivacyRule> arrayList2 = storyItem.privacy;
        MessagesController messagesController = MessagesController.getInstance(i10);
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
                        TLRPC.InputUser inputUser = messagesController.getInputUser(tL_privacyValueDisallowUsers.users.get(i14).longValue());
                        if (!(inputUser instanceof TLRPC.TL_inputUserEmpty)) {
                            tL_inputPrivacyValueDisallowUsers.users.add(inputUser);
                        }
                    }
                    arrayList3.add(tL_inputPrivacyValueDisallowUsers);
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                    TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = (TLRPC.TL_privacyValueAllowUsers) privacyRule;
                    TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
                    for (int i15 = 0; i15 < tL_privacyValueAllowUsers.users.size(); i15++) {
                        TLRPC.InputUser inputUser2 = messagesController.getInputUser(tL_privacyValueAllowUsers.users.get(i15).longValue());
                        if (!(inputUser2 instanceof TLRPC.TL_inputUserEmpty)) {
                            tL_inputPrivacyValueAllowUsers.users.add(inputUser2);
                        }
                    }
                    arrayList3.add(tL_inputPrivacyValueAllowUsers);
                }
            }
        }
        arrayList.addAll(arrayList3);
        u6Var.I0 = storyItem.expire_date - storyItem.date;
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(new SpannableString(storyItem.caption), org.telegram.ui.ActionBar.j6.o2.getFontMetricsInt(), true);
            MessageObject.addEntitiesToText(replaceEmoji, storyItem.entities, true, false, true, false);
            u6Var.C0 = MessageObject.replaceAnimatedEmoji(replaceEmoji, storyItem.entities, org.telegram.ui.ActionBar.j6.o2.getFontMetricsInt());
        } catch (Exception unused) {
        }
        u6Var.A();
        u6Var.e(storyItem);
        u6Var.m = storyItem.media_areas;
        u6Var.v0 = MessagesController.getInstance(i10).getInputPeer(storyItem.dialogId);
        return u6Var;
    }

    public static u6 o(File file, String str, long j10) {
        u6 u6Var = new u6();
        u6Var.c1 = true;
        u6Var.L = file;
        u6Var.M = true;
        u6Var.Q = 0;
        u6Var.R = 0;
        u6Var.K = true;
        u6Var.h0 = j10;
        u6Var.N = str;
        u6Var.Z = 0.0f;
        u6Var.a0 = Math.min(1.0f, 59500.0f / j10);
        return u6Var;
    }

    public static long p(MessageObject messageObject) {
        Boolean D = D(messageObject);
        if (D == null) {
            return 0L;
        }
        return D.booleanValue() ? DialogObject.getPeerDialogId(messageObject.messageOwner.fwd_from.from_id) : messageObject.getDialogId();
    }

    public static Bitmap q(s6 s6Var, int i10, int i11, int i12, boolean z4) {
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
        s6Var.c(options);
        options.inJustDecodeBounds = false;
        options.inScaled = false;
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        int i15 = options.outWidth;
        int i16 = options.outHeight;
        boolean z10 = ((double) ((((long) (i14 * i13)) * 4) + (((long) (i15 * i16)) * 4))) * 1.1d <= ((double) maxMemory);
        if (i15 <= i14 && i16 <= i13) {
            return s6Var.c(options);
        }
        if (z4 && z10 && SharedConfig.getDevicePerformanceClass() >= 1) {
            Bitmap c3 = s6Var.c(options);
            float max = Math.max(i14 / c3.getWidth(), i13 / c3.getHeight());
            Bitmap createBitmap = Bitmap.createBitmap((int) (c3.getWidth() * max), (int) (c3.getHeight() * max), Bitmap.Config.ARGB_8888);
            Utilities.libyuvARGBSaleBitmap(c3, createBitmap, Utilities.libyuv_ScaleFilter.Box);
            Utilities.clamp(Math.round(1.0f / max), 8, 0);
            return createBitmap;
        }
        options.inScaled = true;
        int i17 = options.outWidth;
        float f10 = i14 / i17;
        int i18 = options.outHeight;
        if (f10 > i13 / i18) {
            options.inDensity = i17;
            options.inTargetDensity = i14;
        } else {
            options.inDensity = i18;
            options.inTargetDensity = i13;
        }
        return s6Var.c(options);
    }

    public static boolean u(TLRPC.Document document, String str) {
        long j10;
        if (document != null) {
            if (!"video/webm".equals(document.mime_type) && !"video/mp4".equals(document.mime_type)) {
                if (MessageObject.isAnimatedStickerDocument(document, true)) {
                    RLottieNative a2 = RLottieNative.a(str, null, 0, 0, null, false, null, false, 0, null);
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
        tL_fileLocationToBeDeprecated.local_id = SharedConfig.getLastLocalId();
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
        return FileLoader.getInstance(i10).getPathToAttach(tL_videoSize_layer127, str, true);
    }

    public static File x(int i10, boolean z4) {
        return w(i10, z4 ? "mp4" : "jpg");
    }

    public static u6 y(ArrayList arrayList) {
        MessageObject messageObject;
        int i10;
        u6 u6Var = new u6();
        u6Var.u = true;
        u6Var.v = arrayList;
        u6Var.i0 = 1080;
        u6Var.j0 = 1920;
        u6Var.z0 = p((MessageObject) arrayList.get(0));
        VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
        mediaEntity.type = (byte) 6;
        mediaEntity.x = 0.5f;
        mediaEntity.y = 0.5f;
        ArrayList arrayList2 = new ArrayList();
        u6Var.T0 = arrayList2;
        arrayList2.add(mediaEntity);
        if (arrayList.size() == 1 && (messageObject = (MessageObject) arrayList.get(0)) != null && ((i10 = messageObject.type) == 8 || i10 == 3 || i10 == 5)) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null && message.attachPath != null) {
                u6Var.L = new File(messageObject.messageOwner.attachPath);
            }
            File file = u6Var.L;
            if (file == null || !file.exists()) {
                u6Var.L = FileLoader.getInstance(u6Var.a).getPathToMessage(messageObject.messageOwner);
            }
            File file2 = u6Var.L;
            if (file2 != null && file2.exists()) {
                u6Var.K = true;
                u6Var.M = false;
                long duration = (long) (messageObject.getDuration() * 1000.0d);
                u6Var.h0 = duration;
                u6Var.Z = 0.0f;
                u6Var.a0 = Math.min(1.0f, 59500.0f / duration);
                return u6Var;
            }
            u6Var.L = null;
        }
        return u6Var;
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
        float f10 = i10;
        float f11 = this.i0 / f10;
        if (this.J0 != 0) {
            f11 = Math.min(f11, this.j0 / i11);
        } else {
            float f12 = i11;
            if (f12 / f10 > 1.29f) {
                f11 = Math.max(f11, this.j0 / f12);
            }
        }
        matrix.postScale(f11, f11);
        matrix.postTranslate(e2.c.d(f10, f11, this.i0, 2.0f), e2.c.d(i11, f11, this.j0, 2.0f));
    }

    public final void B() {
        if (!this.K || v() || this.g || this.n || this.h0 <= 69000 || !UserConfig.getInstance(this.a).isPremium()) {
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
        ArrayList<VideoEditedInfo.EmojiEntity> arrayList2;
        MessageObject messageObject;
        TLRPC.Message message;
        ArrayList arrayList3 = this.T0;
        if (!this.K && this.y == null && this.o0 == null && ((arrayList = this.v) == null || arrayList.size() != 1 || (messageObject = (MessageObject) this.v.get(0)) == null || (message = messageObject.messageOwner) == null || !(message.action instanceof TLRPC.TL_messageActionStarGiftUnique))) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                    VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList3.get(i10);
                    byte b10 = mediaEntity.type;
                    if (b10 != 0) {
                        if (b10 == 1 && (arrayList2 = mediaEntity.entities) != null && !arrayList2.isEmpty()) {
                            for (int i11 = 0; i11 < mediaEntity.entities.size(); i11++) {
                                VideoEditedInfo.EmojiEntity emojiEntity = mediaEntity.entities.get(i11);
                                if (!u(emojiEntity.document, emojiEntity.documentAbsolutePath)) {
                                }
                            }
                        }
                    } else if (!u(mediaEntity.document, mediaEntity.text)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x027c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap b(Bitmap bitmap, float f10) {
        final int i10;
        Bitmap bitmap2;
        float f11;
        Paint paint;
        Bitmap q10;
        Paint paint2;
        Bitmap bitmap3;
        int i11;
        Matrix matrix = new Matrix();
        Paint paint3 = new Paint(7);
        int i12 = (int) (this.i0 * f10);
        int i13 = (int) (this.j0 * f10);
        Bitmap createBitmap = Bitmap.createBitmap(i12, i13, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        final int i14 = 0;
        if (this.Y0 != null) {
            try {
                Bitmap q11 = q(new s6() { // from class: ph.q6
                    @Override // ph.s6
                    public final Bitmap c(BitmapFactory.Options options) {
                        switch (i14) {
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
                }, i12, i13, 0, true);
                canvas.save();
                float width = this.i0 / q11.getWidth();
                canvas.scale(width, width);
                matrix.postScale(f10, f10);
                canvas.drawBitmap(q11, 0.0f, 0.0f, paint3);
                canvas.restore();
                q11.recycle();
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else {
            long j10 = this.z0;
            if (j10 == Long.MIN_VALUE) {
                Paint paint4 = new Paint(1);
                paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, canvas.getHeight(), new int[]{this.A0, this.B0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                i10 = 0;
                canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), paint4);
                matrix.set(this.n0);
                if (bitmap == null) {
                    float width2 = this.k0 / bitmap.getWidth();
                    matrix.preScale(width2, width2);
                    matrix.postScale(f10, f10);
                    canvas.drawBitmap(bitmap, matrix, paint3);
                    return createBitmap;
                }
                if (v()) {
                    int i15 = 0;
                    while (i15 < this.T.size()) {
                        u6 u6Var = (u6) this.T.get(i15);
                        final File file = u6Var.Z0;
                        if (file == null) {
                            file = u6Var.L;
                        }
                        if (file != null) {
                            try {
                                Bitmap q12 = q(new s6() { // from class: ph.r6
                                    @Override // ph.s6
                                    public final Bitmap c(BitmapFactory.Options options) {
                                        switch (i10) {
                                        }
                                        return BitmapFactory.decodeFile(file.getPath(), options);
                                    }
                                }, i12, i13, i10, true);
                                canvas.save();
                                RectF rectF = new RectF();
                                int width3 = q12.getWidth();
                                int height = q12.getHeight();
                                if ((((Integer) AndroidUtilities.getImageOrientation(file).first).intValue() / 90) % 2 == 1) {
                                    width3 = q12.getHeight();
                                    height = q12.getWidth();
                                }
                                q qVar = (q) this.S.e.get(i15);
                                float f12 = i12;
                                bitmap3 = createBitmap;
                                float f13 = i13;
                                try {
                                    i11 = i15;
                                    try {
                                        paint2 = paint3;
                                        try {
                                            rectF.set(qVar.a(f12), qVar.c * (f13 / qVar.a.c), qVar.b(f12), (f13 / qVar.a.c) * (qVar.c + 1));
                                            canvas.translate(rectF.centerX(), rectF.centerY());
                                            canvas.clipRect((-rectF.width()) / 2.0f, (-rectF.height()) / 2.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
                                            float max = Math.max(rectF.width() / width3, rectF.height() / height);
                                            canvas.scale(max, max);
                                            canvas.rotate(((Integer) r2.first).intValue());
                                            canvas.translate((-q12.getWidth()) / 2.0f, (-q12.getHeight()) / 2.0f);
                                        } catch (Exception e6) {
                                            e = e6;
                                            FileLog.e(e);
                                            i15 = i11 + 1;
                                            createBitmap = bitmap3;
                                            paint3 = paint2;
                                            i10 = 0;
                                        }
                                        try {
                                            canvas.drawBitmap(q12, 0.0f, 0.0f, (Paint) null);
                                            canvas.restore();
                                        } catch (Exception e10) {
                                            e = e10;
                                            FileLog.e(e);
                                            i15 = i11 + 1;
                                            createBitmap = bitmap3;
                                            paint3 = paint2;
                                            i10 = 0;
                                        }
                                    } catch (Exception e11) {
                                        e = e11;
                                        paint2 = paint3;
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                    paint2 = paint3;
                                    i11 = i15;
                                }
                            } catch (Exception e13) {
                                e = e13;
                                paint2 = paint3;
                                bitmap3 = createBitmap;
                                i11 = i15;
                            }
                        } else {
                            paint2 = paint3;
                            bitmap3 = createBitmap;
                            i11 = i15;
                        }
                        i15 = i11 + 1;
                        createBitmap = bitmap3;
                        paint3 = paint2;
                        i10 = 0;
                    }
                    bitmap2 = createBitmap;
                    f11 = 0.0f;
                    paint = paint3;
                } else {
                    bitmap2 = createBitmap;
                    f11 = 0.0f;
                    final File file2 = this.Z0;
                    if (file2 == null) {
                        file2 = this.L;
                    }
                    if (file2 != null) {
                        try {
                            final int i16 = 1;
                            q10 = q(new s6() { // from class: ph.r6
                                @Override // ph.s6
                                public final Bitmap c(BitmapFactory.Options options) {
                                    switch (i16) {
                                    }
                                    return BitmapFactory.decodeFile(file2.getPath(), options);
                                }
                            }, i12, i13, this.Q, true);
                            float width4 = this.k0 / q10.getWidth();
                            matrix.preScale(width4, width4);
                            matrix.postScale(f10, f10);
                            paint = paint3;
                        } catch (Exception e14) {
                            e = e14;
                            paint = paint3;
                        }
                        try {
                            canvas.drawBitmap(q10, matrix, paint);
                            q10.recycle();
                        } catch (Exception e15) {
                            e = e15;
                            FileLog.e(e);
                            if (this.P0 != null) {
                            }
                            if (this.W0 != null) {
                            }
                            if (this.R0 != null) {
                            }
                        }
                    } else {
                        paint = paint3;
                    }
                }
                if (this.P0 != null) {
                    try {
                        final int i17 = 1;
                        Bitmap q13 = q(new s6() { // from class: ph.q6
                            @Override // ph.s6
                            public final Bitmap c(BitmapFactory.Options options) {
                                switch (i17) {
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
                        }, i12, i13, 0, true);
                        canvas.save();
                        float width5 = this.i0 / q13.getWidth();
                        canvas.scale(width5, width5);
                        matrix.postScale(f10, f10);
                        canvas.drawBitmap(q13, f11, f11, paint);
                        canvas.restore();
                        q13.recycle();
                    } catch (Exception e16) {
                        FileLog.e(e16);
                    }
                }
                if (this.W0 != null) {
                    try {
                        final int i18 = 2;
                        Bitmap q14 = q(new s6() { // from class: ph.q6
                            @Override // ph.s6
                            public final Bitmap c(BitmapFactory.Options options) {
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
                        }, i12, i13, 0, true);
                        canvas.save();
                        float width6 = this.i0 / q14.getWidth();
                        canvas.scale(width6, width6);
                        matrix.postScale(f10, f10);
                        canvas.drawBitmap(q14, f11, f11, paint);
                        canvas.restore();
                        q14.recycle();
                    } catch (Exception e17) {
                        FileLog.e(e17);
                    }
                }
                if (this.R0 != null) {
                    return bitmap2;
                }
                try {
                    final int i19 = 3;
                    Bitmap q15 = q(new s6() { // from class: ph.q6
                        @Override // ph.s6
                        public final Bitmap c(BitmapFactory.Options options) {
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
                    }, i12, i13, 0, true);
                    canvas.save();
                    float width7 = this.i0 / q15.getWidth();
                    canvas.scale(width7, width7);
                    matrix.postScale(f10, f10);
                    canvas.drawBitmap(q15, f11, f11, paint);
                    canvas.restore();
                    q15.recycle();
                    return bitmap2;
                } catch (Exception e18) {
                    FileLog.e(e18);
                    return bitmap2;
                }
            }
            Drawable drawable = this.x0;
            if (drawable == null) {
                drawable = l5.e(null, this.a, j10, this.y0);
            }
            j(canvas, drawable, canvas.getWidth(), canvas.getHeight());
        }
        i10 = 0;
        matrix.set(this.n0);
        if (bitmap == null) {
        }
    }

    public final void c(File file) {
        Bitmap b10 = b(null, 1.0f);
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
            FileLog.e(e);
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
                if (document != null && MessageObject.isDocumentHasAttachedStickers(document)) {
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
                    this.e1 = ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getAttachedStickers, new kh.b1(this, storyItem, tL_messages_getAttachedStickers, new gf.a(this, 17), 17));
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
                this.e1 = ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getAttachedStickers, new kh.b1(this, storyItem, tL_messages_getAttachedStickers, new gf.a(this, 17), 17));
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

    public final u6 g() {
        u6 u6Var = new u6();
        u6Var.b = this.b;
        u6Var.c = this.c;
        u6Var.d = this.d;
        u6Var.e = this.e;
        u6Var.f = this.f;
        u6Var.g = this.g;
        u6Var.h = this.h;
        u6Var.i = this.i;
        u6Var.j = this.j;
        u6Var.k = this.k;
        u6Var.l = this.l;
        u6Var.m = this.m;
        u6Var.w = this.w;
        u6Var.x = this.x;
        u6Var.y = this.y;
        u6Var.z = this.z;
        u6Var.A = this.A;
        u6Var.B = this.B;
        u6Var.C = this.C;
        u6Var.D = this.D;
        u6Var.E = this.E;
        u6Var.F = this.F;
        u6Var.G = this.G;
        u6Var.H = this.H;
        u6Var.I = this.I;
        u6Var.J = this.J;
        u6Var.K = this.K;
        u6Var.L = this.L;
        u6Var.M = this.M;
        boolean z4 = this.M;
        int i10 = this.a;
        if (z4) {
            File w10 = w(i10, k(this.L));
            u6Var.L = w10;
            AndroidUtilities.copyFileSafe(this.L, w10);
        }
        u6Var.N = this.N;
        u6Var.Y = this.Y;
        u6Var.Z = this.Z;
        u6Var.a0 = this.a0;
        u6Var.h0 = this.h0;
        u6Var.k0 = this.k0;
        u6Var.l0 = this.l0;
        u6Var.i0 = this.i0;
        u6Var.j0 = this.j0;
        u6Var.v0 = this.v0;
        u6Var.R = this.R;
        u6Var.n0.set(this.n0);
        u6Var.A0 = this.A0;
        u6Var.B0 = this.B0;
        u6Var.C0 = this.C0;
        u6Var.D0 = this.D0;
        u6Var.E0 = this.E0;
        ArrayList arrayList = u6Var.F0;
        arrayList.clear();
        arrayList.addAll(this.F0);
        u6Var.G0 = this.G0;
        u6Var.H0 = this.H0;
        u6Var.I0 = this.I0;
        u6Var.M0 = this.M0;
        u6Var.N0 = this.N0;
        u6Var.w0 = this.w0;
        File file = this.N0;
        if (file != null && file.exists()) {
            File w11 = w(i10, k(this.N0));
            u6Var.N0 = w11;
            AndroidUtilities.copyFileSafe(this.N0, w11);
        }
        u6Var.O0 = this.O0;
        File file2 = this.O0;
        if (file2 != null && file2.exists()) {
            File w12 = w(i10, k(this.O0));
            u6Var.O0 = w12;
            AndroidUtilities.copyFileSafe(this.O0, w12);
        }
        u6Var.P0 = this.P0;
        File file3 = this.P0;
        if (file3 != null && file3.exists()) {
            File w13 = w(i10, k(this.P0));
            u6Var.P0 = w13;
            AndroidUtilities.copyFileSafe(this.P0, w13);
        }
        u6Var.W0 = this.W0;
        File file4 = this.W0;
        if (file4 != null && file4.exists()) {
            File w14 = w(i10, k(this.W0));
            u6Var.W0 = w14;
            AndroidUtilities.copyFileSafe(this.W0, w14);
        }
        u6Var.Y0 = this.Y0;
        File file5 = this.Y0;
        if (file5 != null && file5.exists()) {
            File w15 = w(i10, k(this.Y0));
            u6Var.Y0 = w15;
            AndroidUtilities.copyFileSafe(this.Y0, w15);
        }
        u6Var.Q0 = this.Q0;
        File file6 = this.Q0;
        if (file6 != null && file6.exists()) {
            File w16 = w(i10, k(this.Q0));
            u6Var.Q0 = w16;
            AndroidUtilities.copyFileSafe(this.Q0, w16);
        }
        u6Var.R0 = this.R0;
        File file7 = this.R0;
        if (file7 != null && file7.exists()) {
            File w17 = w(i10, k(this.R0));
            u6Var.R0 = w17;
            AndroidUtilities.copyFileSafe(this.R0, w17);
        }
        u6Var.S0 = this.S0;
        u6Var.T0 = new ArrayList();
        if (this.T0 != null) {
            for (int i11 = 0; i11 < this.T0.size(); i11++) {
                u6Var.T0.add(((VideoEditedInfo.MediaEntity) this.T0.get(i11)).copy());
            }
        }
        u6Var.U0 = this.U0;
        u6Var.V0 = this.V0;
        u6Var.Z0 = this.Z0;
        File file8 = this.Z0;
        if (file8 != null && file8.exists()) {
            File w18 = w(i10, k(this.Z0));
            u6Var.Z0 = w18;
            AndroidUtilities.copyFileSafe(this.Z0, w18);
        }
        u6Var.a1 = this.a1;
        u6Var.b1 = this.b1;
        u6Var.c1 = this.c1;
        u6Var.O = this.O;
        u6Var.n = this.n;
        u6Var.o = this.o;
        u6Var.o0 = this.o0;
        u6Var.s0 = this.s0;
        u6Var.t0 = this.t0;
        u6Var.q0 = this.q0;
        u6Var.p0 = this.p0;
        u6Var.r0 = this.r0;
        u6Var.u0 = this.u0;
        u6Var.b0 = this.b0;
        u6Var.J0 = this.J0;
        u6Var.K0 = this.K0;
        u6Var.L0 = this.L0;
        u6Var.e0 = this.e0;
        u6Var.T = this.T;
        u6Var.S = this.S;
        u6Var.U = this.U;
        u6Var.X = this.X;
        u6Var.P = this.P;
        return u6Var;
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

    public final void i(boolean z4) {
        if (this.M0 != null) {
            this.M0 = null;
        }
        File file = this.N0;
        if (file != null) {
            file.delete();
            this.N0 = null;
        }
        if (!z4) {
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
                    VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) obj;
                    if (mediaEntity.type == 2 && !TextUtils.isEmpty(mediaEntity.segmentedPath)) {
                        try {
                            new File(mediaEntity.segmentedPath).delete();
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        mediaEntity.segmentedPath = "";
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
                ((u6) this.T.get(i11)).i(z4);
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

    public final void s(Utilities.Callback callback) {
        int i10;
        if (!E()) {
            callback.run(null);
            return;
        }
        if (!this.K && ((i10 = this.i0) > 720 || this.j0 > 1280)) {
            float f10 = 720.0f / i10;
            this.n0.postScale(f10, f10, 0.0f, 0.0f);
            this.i0 = 720;
            this.j0 = 1280;
        }
        File file = this.L;
        String absolutePath = file == null ? null : file.getAbsolutePath();
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, Math.max(1, v() ? this.T.size() : 0), 11);
        iArr[0] = new int[11];
        wx0 wx0Var = new wx0(this, absolutePath, iArr, callback);
        if (!v()) {
            if (this.L == null) {
                wx0Var.run();
                return;
            } else {
                Utilities.globalQueue.postRunnable(new m71(absolutePath, iArr, wx0Var, 17));
                return;
            }
        }
        String[] strArr = new String[this.T.size()];
        for (int i11 = 0; i11 < this.T.size(); i11++) {
            strArr[i11] = ((u6) this.T.get(i11)).L == null ? null : ((u6) this.T.get(i11)).L.getAbsolutePath();
            iArr[i11] = new int[11];
        }
        Utilities.globalQueue.postRunnable(new m71(strArr, iArr, wx0Var, 16));
    }

    public final boolean t() {
        if (v()) {
            for (int i10 = 0; i10 < this.T.size(); i10++) {
                if (((u6) this.T.get(i10)).K) {
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
                    int[] b10 = g0.b(bitmap2, true);
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
                    MediaStore.Video.Thumbnails.getThumbnail(ApplicationLoader.applicationContext.getContentResolver(), parseInt, 1, options);
                    options.inSampleSize = d(options, 240, 240);
                    options.inJustDecodeBounds = false;
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                    options.inDither = true;
                    bitmap = MediaStore.Video.Thumbnails.getThumbnail(ApplicationLoader.applicationContext.getContentResolver(), parseInt, 1, options);
                } else {
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(this.N);
                    options.inSampleSize = d(options, 240, 240);
                    options.inJustDecodeBounds = false;
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                    options.inDither = true;
                    bitmap = BitmapFactory.decodeFile(this.N);
                }
            } catch (Exception unused) {
                bitmap = null;
            }
            if (bitmap != null) {
                int[] b11 = g0.b(bitmap, true);
                this.A0 = b11[0];
                this.B0 = b11[1];
                bitmap.recycle();
                runnable.run();
            }
        }
    }
}
