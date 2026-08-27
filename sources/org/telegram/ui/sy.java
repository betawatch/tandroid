package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class sy implements NotificationCenter.NotificationCenterDelegate {
    public static final HashSet H = new HashSet();
    public static final HashSet I;
    public o0.m A;
    public final FrameLayout C;
    public final org.telegram.ui.Components.zk0 D;
    public final long E;
    public final long F;
    public HashMap G;
    public final rn a;
    public int b;
    public TLRPC.TL_messages_stickerSet c;
    public boolean n;
    public String v;
    public ti y;
    public boolean d = false;
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final Random h = new Random();
    public int r = -1;
    public long s = 0;
    public final ArrayList w = new ArrayList();
    public final ArrayList x = new ArrayList();
    public final ArrayList B = new ArrayList();

    static {
        HashSet hashSet = new HashSet();
        I = hashSet;
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

    public sy(int i10, FrameLayout frameLayout) {
        this.C = frameLayout;
        this.b = i10;
    }

    public static boolean a(org.telegram.ui.Cells.s1 s1Var, float f10, int i10) {
        float centerY = s1Var.getPhotoImage().getCenterY() + s1Var.getY();
        return centerY > f10 && centerY < ((float) i10);
    }

    public static int f() {
        float min;
        float f10;
        if (AndroidUtilities.isTablet()) {
            min = AndroidUtilities.getMinTabletSide();
            f10 = 0.4f;
        } else {
            Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
            f10 = 0.5f;
        }
        return (int) ((((int) (min * f10)) * 2.0f) / AndroidUtilities.density);
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
    public static String q(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        int i10 = 0;
        String str2 = str;
        while (i10 < length) {
            if (i10 < length - 1) {
                if (str2.charAt(i10) == 55356) {
                    int i11 = i10 + 1;
                    if (str2.charAt(i11) >= 57339) {
                    }
                }
                if (str2.charAt(i10) == 8205) {
                    int i12 = i10 + 1;
                    if (str2.charAt(i12) != 9792) {
                    }
                    length -= 2;
                    str2 = TextUtils.concat(str2.subSequence(0, i10), str2.subSequence(i10 + 2, str2.length()));
                    i10--;
                    i10++;
                    str2 = str2;
                }
            }
            if (str2.charAt(i10) == 65039) {
                length--;
                str2 = TextUtils.concat(str2.subSequence(0, i10), str2.subSequence(i10 + 1, str2.length()));
                i10--;
                i10++;
                str2 = str2;
            } else {
                i10++;
                str2 = str2;
            }
        }
        return str2.toString();
    }

    public final void b() {
        if (this.d) {
            return;
        }
        TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(this.b).getStickerSetByName("EmojiAnimations");
        this.c = stickerSetByName;
        if (stickerSetByName == null) {
            this.c = MediaDataController.getInstance(this.b).getStickerSetByEmojiOrName("EmojiAnimations");
        }
        if (this.c == null) {
            MediaDataController.getInstance(this.b).loadStickersByEmojiOrName("EmojiAnimations", false, true);
        }
        if (this.c != null) {
            HashMap hashMap = new HashMap();
            for (int i10 = 0; i10 < this.c.documents.size(); i10++) {
                hashMap.put(Long.valueOf(this.c.documents.get(i10).id), this.c.documents.get(i10));
            }
            for (int i11 = 0; i11 < this.c.packs.size(); i11++) {
                TLRPC.TL_stickerPack tL_stickerPack = this.c.packs.get(i11);
                if (!I.contains(tL_stickerPack.emoticon) && tL_stickerPack.documents.size() > 0) {
                    String str = tL_stickerPack.emoticon;
                    HashSet hashSet = H;
                    hashSet.add(str);
                    ArrayList arrayList = new ArrayList();
                    String str2 = tL_stickerPack.emoticon;
                    HashMap hashMap2 = this.e;
                    hashMap2.put(str2, arrayList);
                    for (int i12 = 0; i12 < tL_stickerPack.documents.size(); i12++) {
                        arrayList.add((TLRPC.Document) hashMap.get(tL_stickerPack.documents.get(i12)));
                    }
                    if (tL_stickerPack.emoticon.equals("❤")) {
                        String[] strArr = {"🧡", "💛", "💚", "💙", "💜", "🖤", "🤍", "🤎"};
                        for (int i13 = 0; i13 < 8; i13++) {
                            String str3 = strArr[i13];
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
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.B;
            if (i10 >= arrayList.size()) {
                arrayList.clear();
                return;
            }
            ((ry) arrayList.get(i10)).r.onDetachedFromWindow();
            if (((ry) arrayList.get(i10)).j != null) {
                ((ry) arrayList.get(i10)).j.d(this.C);
            }
            i10++;
        }
    }

    public final boolean d(String str, int i10, TLRPC.Document document, MessageObject messageObject, int i11, boolean z10, boolean z11, float f10, float f11, boolean z12) {
        Random random;
        long j10;
        TLRPC.Document document2;
        int abs;
        TLRPC.VideoSize premiumStickerAnimation;
        boolean z13;
        ti tiVar;
        int i12 = i11;
        boolean z14 = messageObject != null && messageObject.isPremiumSticker();
        boolean z15 = (messageObject == null || messageObject.getEffect() == null) ? false : true;
        if (z15 || z14 || H.contains(str)) {
            ArrayList arrayList = (ArrayList) this.e.get(str);
            if (z15 || ((arrayList != null && !arrayList.isEmpty()) || z14)) {
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    ArrayList arrayList2 = this.B;
                    if (i13 >= arrayList2.size()) {
                        if (z10 && z14 && i14 > 0) {
                            org.telegram.ui.Components.ec ecVar = org.telegram.ui.Components.ec.w;
                            if (ecVar != null && ecVar.b == messageObject.getId()) {
                                return false;
                            }
                            TLRPC.InputStickerSet inputStickerSet = messageObject.getInputStickerSet();
                            TLRPC.TL_messages_stickerSet stickerSetByName = inputStickerSet.short_name != null ? MediaDataController.getInstance(this.b).getStickerSetByName(inputStickerSet.short_name) : null;
                            if (stickerSetByName == null) {
                                stickerSetByName = MediaDataController.getInstance(this.b).getStickerSetById(inputStickerSet.id);
                            }
                            if (stickerSetByName != null) {
                                p(stickerSetByName, messageObject);
                                return false;
                            }
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                            tL_messages_getStickerSet.stickerset = inputStickerSet;
                            ConnectionsManager.getInstance(this.b).sendRequest(tL_messages_getStickerSet, new gg(22, this, messageObject));
                            return false;
                        }
                        if (i14 >= 4) {
                            return false;
                        }
                        Random random2 = this.h;
                        if (z15) {
                            TLRPC.TL_availableEffect effect = messageObject.getEffect();
                            TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(this.b).getAvailableEffects();
                            if (availableEffects == null) {
                                return false;
                            }
                            j10 = 0;
                            long j11 = effect.effect_animation_id;
                            if (j11 == 0) {
                                j11 = effect.effect_sticker_id;
                            }
                            random = random2;
                            int i16 = 0;
                            while (true) {
                                if (i16 >= availableEffects.documents.size()) {
                                    document2 = null;
                                    break;
                                }
                                document2 = availableEffects.documents.get(i16);
                                long j12 = j11;
                                if (document2 != null && document2.id == j12) {
                                    break;
                                }
                                i16++;
                                j11 = j12;
                            }
                            if (document2 == null) {
                                return false;
                            }
                            if (effect.effect_sticker_id != 0) {
                                premiumStickerAnimation = MessageObject.getPremiumStickerAnimation(document2);
                                z14 = premiumStickerAnimation != null;
                            }
                            premiumStickerAnimation = null;
                        } else {
                            random = random2;
                            j10 = 0;
                            if (z14) {
                                document2 = messageObject.getDocument();
                                premiumStickerAnimation = messageObject.getPremiumStickerAnimation();
                            } else {
                                if (messageObject == null || !messageObject.isAnimatedAnimatedEmoji()) {
                                    if (i12 < 0 || i12 > arrayList.size() - 1) {
                                        i12 = Math.abs(random.nextInt()) % arrayList.size();
                                    }
                                    document2 = (TLRPC.Document) arrayList.get(i12);
                                } else {
                                    if (i12 < 0 || i12 > arrayList.size() - 1) {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                            TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i17);
                                            if (document3 != null) {
                                                HashMap hashMap = this.G;
                                                Boolean bool = hashMap != null ? (Boolean) hashMap.get(Long.valueOf(document3.id)) : null;
                                                if (bool != null && bool.booleanValue()) {
                                                    arrayList3.add(Integer.valueOf(i17));
                                                }
                                            }
                                        }
                                        abs = arrayList3.isEmpty() ? Math.abs(random.nextInt()) % arrayList.size() : ((Integer) arrayList3.get(Math.abs(random.nextInt()) % arrayList3.size())).intValue();
                                    } else {
                                        abs = i12;
                                    }
                                    document2 = (TLRPC.Document) arrayList.get(abs);
                                    i12 = abs;
                                }
                                premiumStickerAnimation = null;
                            }
                        }
                        if (document2 == null && premiumStickerAnimation == null) {
                            return false;
                        }
                        ry ryVar = new ry();
                        ryVar.h = z14;
                        ryVar.i = z15;
                        if (!z15) {
                            ryVar.f = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                            ryVar.g = ((random.nextInt() % 101) / 100.0f) * (f11 / 4.0f);
                        }
                        ryVar.p = i10;
                        ryVar.q = document2;
                        ryVar.m = z12;
                        ryVar.r.setAllowStartAnimation(true);
                        ryVar.r.setAllowLottieVibration(z10);
                        boolean z16 = SharedConfig.getDevicePerformanceClass() <= 1 || !BuildVars.DEBUG_VERSION;
                        HashMap hashMap2 = this.f;
                        int i18 = i12;
                        if (premiumStickerAnimation == null) {
                            int f12 = f();
                            z13 = z14;
                            boolean z17 = z16;
                            Integer num = (Integer) hashMap2.get(Long.valueOf(document2.id));
                            int intValue = (num == null ? 0 : num.intValue()) + 1;
                            hashMap2.put(Long.valueOf(document2.id), Integer.valueOf(intValue));
                            ImageLocation forDocument = ImageLocation.getForDocument(document2);
                            ryVar.r.setUniqKeyPrefix(intValue + "_" + ryVar.p + "_");
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(f12);
                            sb2.append("_");
                            sb2.append(f12);
                            sb2.append(z17 ? "_pcache" : "");
                            ryVar.r.setImage(forDocument, sb2.toString(), null, "tgs", this.c, 1);
                            ryVar.r.setDelegate(new qy(this, ryVar, z10, messageObject));
                            if (ryVar.r.getLottieAnimation() != null) {
                                ryVar.r.getLottieAnimation().L(0, false, true);
                            }
                        } else {
                            z13 = z14;
                            boolean z18 = z16;
                            int f13 = f();
                            if (i15 > 0) {
                                Integer num2 = (Integer) hashMap2.get(Long.valueOf(document2.id));
                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                hashMap2.put(Long.valueOf(document2.id), Integer.valueOf((intValue2 + 1) % 4));
                                ryVar.r.setUniqKeyPrefix(intValue2 + "_" + ryVar.p + "_");
                            }
                            ryVar.q = document2;
                            ImageLocation forDocument2 = ImageLocation.getForDocument(premiumStickerAnimation, document2);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(f13);
                            sb3.append("_");
                            sb3.append(f13);
                            sb3.append(z18 ? "_pcache" : "");
                            ryVar.r.setImage(forDocument2, sb3.toString(), null, "tgs", this.c, 1);
                        }
                        ryVar.r.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
                        ryVar.r.setAutoRepeat(0);
                        if (ryVar.r.getLottieAnimation() != null) {
                            if (ryVar.h) {
                                ryVar.r.getLottieAnimation().L(0, false, true);
                            }
                            ryVar.r.getLottieAnimation().start();
                        }
                        arrayList2.add(ryVar);
                        ryVar.r.onAttachedToWindow();
                        ImageReceiver imageReceiver = ryVar.r;
                        FrameLayout frameLayout = this.C;
                        imageReceiver.setParentView(frameLayout);
                        frameLayout.invalidate();
                        if (z10 && !z13 && UserConfig.getInstance(this.b).clientUserId != this.E) {
                            int i19 = this.r;
                            if (i19 != 0 && i19 != i10 && (tiVar = this.y) != null) {
                                AndroidUtilities.cancelRunOnUIThread(tiVar);
                                this.y.run();
                            }
                            this.r = i10;
                            this.v = str;
                            long j13 = this.s;
                            ArrayList arrayList4 = this.x;
                            ArrayList arrayList5 = this.w;
                            if (j13 == j10) {
                                this.s = System.currentTimeMillis();
                                arrayList5.clear();
                                arrayList4.clear();
                                arrayList5.add(Long.valueOf(j10));
                                arrayList4.add(Integer.valueOf(i18));
                            } else {
                                arrayList5.add(Long.valueOf(System.currentTimeMillis() - this.s));
                                arrayList4.add(Integer.valueOf(i18));
                            }
                            ti tiVar2 = this.y;
                            if (tiVar2 != null) {
                                AndroidUtilities.cancelRunOnUIThread(tiVar2);
                                this.y = null;
                            }
                            ti tiVar3 = new ti(this, 27);
                            this.y = tiVar3;
                            AndroidUtilities.runOnUIThread(tiVar3, 500L);
                        }
                        if (!z11) {
                            return true;
                        }
                        MessagesController.getInstance(this.b).sendTyping(this.E, this.F, 11, str, 0);
                        return true;
                    }
                    if (((ry) arrayList2.get(i13)).p == i10) {
                        i14++;
                        if (!z15 && (((ry) arrayList2.get(i13)).r.getLottieAnimation() == null || ((ry) arrayList2.get(i13)).r.getLottieAnimation().w())) {
                            return false;
                        }
                    }
                    if (((ry) arrayList2.get(i13)).q != null && document != null) {
                        if (((ry) arrayList2.get(i13)).q.id == document.id) {
                            i15++;
                        }
                    }
                    i13++;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Integer printingStringType;
        if (i10 == NotificationCenter.diceStickersDidLoad) {
            if ("EmojiAnimations".equals((String) objArr[0])) {
                b();
                return;
            }
            return;
        }
        int i12 = NotificationCenter.onEmojiInteractionsReceived;
        long j10 = this.E;
        if (i10 != i12) {
            if (i10 == NotificationCenter.updateInterfaces && (printingStringType = MessagesController.getInstance(this.b).getPrintingStringType(j10, this.F)) != null && printingStringType.intValue() == 5) {
                o0.m mVar = this.A;
                if (mVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(mVar);
                }
                this.A = null;
                return;
            }
            return;
        }
        if (this.a == null) {
            return;
        }
        long longValue = ((Long) objArr[0]).longValue();
        TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = (TLRPC.TL_sendMessageEmojiInteraction) objArr[1];
        if (longValue == j10 && H.contains(tL_sendMessageEmojiInteraction.emoticon)) {
            int i13 = tL_sendMessageEmojiInteraction.msg_id;
            if (tL_sendMessageEmojiInteraction.interaction.data != null) {
                try {
                    JSONArray jSONArray = new JSONObject(tL_sendMessageEmojiInteraction.interaction.data).getJSONArray("a");
                    for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i14);
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ec0(this, i13, jSONObject.optInt("i", 1) - 1), (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
                    }
                } catch (JSONException e9) {
                    e9.printStackTrace();
                }
            }
        }
    }

    public final void e(Canvas canvas) {
        float f10;
        float f11;
        MessageObject messageObject;
        ImageReceiver imageReceiver;
        if (this.B.isEmpty()) {
            return;
        }
        int i10 = 0;
        while (i10 < this.B.size()) {
            ry ryVar = (ry) this.B.get(i10);
            float f12 = 3.0f;
            if (this.a != null) {
                ryVar.c = false;
                int i11 = 0;
                while (true) {
                    if (i11 >= this.D.getChildCount()) {
                        f10 = 3.0f;
                        f11 = 0.0f;
                        break;
                    }
                    View childAt = this.D.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                        messageObject = s1Var.getMessageObject();
                        imageReceiver = s1Var.getPhotoImage();
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                        org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                        messageObject = v0Var.getMessageObject();
                        imageReceiver = v0Var.getPhotoImage();
                    } else {
                        messageObject = null;
                        imageReceiver = null;
                    }
                    if (messageObject == null || messageObject.getId() != ryVar.p) {
                        i11++;
                        f12 = 3.0f;
                    } else {
                        ryVar.c = true;
                        float x8 = childAt.getX() + this.D.getX();
                        float y10 = childAt.getY() + this.D.getY();
                        f11 = childAt.getY();
                        ryVar.d = imageReceiver.getImageWidth();
                        ryVar.e = imageReceiver.getImageHeight();
                        if (ryVar.i && (childAt instanceof org.telegram.ui.Cells.s1)) {
                            org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                            float f13 = (f() * AndroidUtilities.density) / 1.3f;
                            float f14 = f13 / f12;
                            ryVar.d = f14;
                            ryVar.e = f14;
                            float timeX = s1Var2.getTimeX() + x8;
                            float f15 = f13 / 2.0f;
                            f10 = 3.0f;
                            ryVar.a = Utilities.clamp(timeX - f15, AndroidUtilities.displaySize.x - f13, 0.0f);
                            ryVar.b = (s1Var2.getTimeY() + y10) - f15;
                        } else {
                            f10 = 3.0f;
                            if (ryVar.h) {
                                ryVar.a = imageReceiver.getImageX() + x8;
                                ryVar.b = imageReceiver.getImageY() + y10;
                            } else {
                                float imageX = imageReceiver.getImageX() + x8;
                                float imageY = imageReceiver.getImageY() + y10;
                                float dp = ryVar.m ? ((-imageReceiver.getImageWidth()) * 2.0f) + AndroidUtilities.dp(24.0f) + imageX : (-AndroidUtilities.dp(24.0f)) + imageX;
                                float imageWidth = imageY - imageReceiver.getImageWidth();
                                ryVar.a = dp;
                                ryVar.b = imageWidth;
                            }
                        }
                    }
                }
                if (!ryVar.c || ryVar.e + f11 < this.a.o9 || f11 > this.D.getMeasuredHeight() - this.a.wa) {
                    ryVar.n = true;
                }
                if (ryVar.h) {
                    float f16 = ryVar.e / 2.0f;
                    boolean z10 = ((float) this.D.getMeasuredHeight()) - f11 <= f16;
                    boolean z11 = (f11 - this.a.o9) + f16 <= 0.0f;
                    if (z10 || z11) {
                        ryVar.n = true;
                    }
                }
                if (ryVar.n) {
                    float f17 = ryVar.o;
                    if (f17 != 1.0f) {
                        float clamp = Utilities.clamp(f17 + 0.10666667f, 1.0f, 0.0f);
                        ryVar.o = clamp;
                        ryVar.r.setAlpha(1.0f - clamp);
                        this.a.T0.invalidate();
                    }
                }
            } else {
                f10 = 3.0f;
                h(ryVar);
            }
            boolean z12 = !ryVar.l && ryVar.n;
            if (!z12) {
                if (!ryVar.h || ryVar.i) {
                    ig.d dVar = ryVar.j;
                    if (dVar != null) {
                        float f18 = ryVar.a + ryVar.f;
                        float f19 = ryVar.b + ryVar.g;
                        float f20 = ryVar.d * f10;
                        dVar.e((int) f18, (int) f19, (int) (f18 + f20), (int) (f19 + f20));
                        ryVar.j.b(canvas);
                    } else {
                        ImageReceiver imageReceiver2 = ryVar.r;
                        float f21 = ryVar.a + ryVar.f;
                        float f22 = ryVar.b + ryVar.g;
                        float f23 = ryVar.d * f10;
                        imageReceiver2.setImageCoords(f21, f22, f23, f23);
                        if (ryVar.m) {
                            ryVar.r.draw(canvas);
                        } else {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, ryVar.r.getCenterX(), ryVar.r.getCenterY());
                            ryVar.r.draw(canvas);
                            canvas.restore();
                        }
                    }
                } else {
                    float f24 = ryVar.e;
                    float f25 = 1.49926f * f24;
                    float f26 = 0.0546875f * f25;
                    float f27 = (((f24 / 2.0f) + ryVar.b) - (f25 / 2.0f)) - (0.00279f * f25);
                    if (ryVar.m) {
                        ryVar.r.setImageCoords(((ryVar.a + ryVar.d) - f25) + f26, f27, f25, f25);
                    } else {
                        ryVar.r.setImageCoords(ryVar.a - f26, f27, f25, f25);
                    }
                    if (ryVar.m) {
                        ryVar.r.draw(canvas);
                    } else {
                        canvas.save();
                        canvas.scale(-1.0f, 1.0f, ryVar.r.getCenterX(), ryVar.r.getCenterY());
                        ryVar.r.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            ig.d dVar2 = ryVar.j;
            boolean c10 = dVar2 != null ? dVar2.c() : ryVar.l && ryVar.r.getLottieAnimation() != null && ryVar.r.getLottieAnimation().X >= ryVar.r.getLottieAnimation().e[0] + (-2);
            if (ryVar.o == 1.0f || c10 || z12) {
                ry ryVar2 = (ry) this.B.remove(i10);
                if (ryVar.h && ryVar.r.getLottieAnimation() != null) {
                    ryVar2.r.getLottieAnimation().L(0, true, true);
                }
                ryVar2.r.onDetachedFromWindow();
                ig.d dVar3 = ryVar2.j;
                if (dVar3 != null) {
                    dVar3.d(this.C);
                }
                i10--;
            } else if (ryVar.r.getLottieAnimation() != null && ryVar.r.getLottieAnimation().h0) {
                ryVar.l = true;
            } else if (ryVar.r.getLottieAnimation() != null && !ryVar.r.getLottieAnimation().h0) {
                ryVar.r.getLottieAnimation().L(0, true, false);
                ryVar.r.getLottieAnimation().start();
            }
            i10++;
        }
        if (this.B.isEmpty()) {
            i();
        }
        this.C.invalidate();
    }

    public final boolean g() {
        return this.B.isEmpty();
    }

    public final void j() {
        this.n = true;
        b();
        NotificationCenter.getInstance(this.b).addObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.b).addObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.b).addObserver(this, NotificationCenter.updateInterfaces);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.B;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((ry) arrayList.get(i10)).r.onAttachedToWindow();
            if (((ry) arrayList.get(i10)).j != null) {
                ((ry) arrayList.get(i10)).j.f(this.C);
            }
            i10++;
        }
    }

    public final void k() {
        int i10 = 0;
        this.n = false;
        NotificationCenter.getInstance(this.b).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.b).removeObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.b).removeObserver(this, NotificationCenter.updateInterfaces);
        while (true) {
            ArrayList arrayList = this.B;
            if (i10 >= arrayList.size()) {
                arrayList.clear();
                return;
            }
            ((ry) arrayList.get(i10)).r.onDetachedFromWindow();
            if (((ry) arrayList.get(i10)).j != null) {
                ((ry) arrayList.get(i10)).j.d(this.C);
            }
            i10++;
        }
    }

    public final void l(org.telegram.ui.Cells.s1 s1Var, rn rnVar, boolean z10) {
        if (rnVar.x() || s1Var.getMessageObject() == null || s1Var.getMessageObject().getId() < 0) {
            return;
        }
        if (s1Var.getMessageObject().isPremiumSticker() || rnVar.f != null) {
            boolean z11 = false;
            boolean o10 = o(s1Var, -1, z10, false);
            int i10 = 3;
            if (z10 && o10 && !EmojiData.hasEmojiSupportVibration(s1Var.getMessageObject().getStickerEmoji()) && !s1Var.getMessageObject().isPremiumSticker() && !s1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                try {
                    s1Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            boolean isPremiumSticker = s1Var.getMessageObject().isPremiumSticker();
            long j10 = this.E;
            if (isPremiumSticker || s1Var.getEffect() != null || (!z10 && s1Var.getMessageObject().isAnimatedEmojiStickerSingle())) {
                s1Var.getMessageObject().forcePlayEffect = false;
                s1Var.getMessageObject().messageOwner.premiumEffectWasPlayed = true;
                rnVar.getMessagesStorage().updateMessageCustomParams(j10, s1Var.getMessageObject().messageOwner);
                return;
            }
            Integer printingStringType = MessagesController.getInstance(this.b).getPrintingStringType(j10, this.F);
            if ((printingStringType == null || printingStringType.intValue() != 5) && this.A == null && o10) {
                org.telegram.ui.Components.ec ecVar = org.telegram.ui.Components.ec.w;
                if ((ecVar == null || !ecVar.l) && SharedConfig.emojiInteractionsHintCount > 0 && UserConfig.getInstance(this.b).getClientUserId() != rnVar.f.id) {
                    SharedConfig.updateEmojiInteractionsHintCount(SharedConfig.emojiInteractionsHintCount - 1);
                    org.telegram.ui.Components.kw0 kw0Var = new org.telegram.ui.Components.kw0(rnVar.getParentActivity(), null, 1, -1, s1Var.getMessageObject().isAnimatedAnimatedEmoji() ? s1Var.getMessageObject().getDocument() : MediaDataController.getInstance(this.b).getEmojiAnimatedSticker(s1Var.getMessageObject().getStickerEmoji()), rnVar.getResourceProvider());
                    kw0Var.c.setVisibility(8);
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("EmojiInteractionTapHint", R.string.EmojiInteractionTapHint, rnVar.f.first_name));
                    TextView textView = kw0Var.b;
                    textView.setText(Emoji.replaceEmoji(replaceTags, textView.getPaint().getFontMetricsInt(), false));
                    textView.setTypeface(null);
                    textView.setMaxLines(3);
                    textView.setSingleLine(false);
                    o0.m mVar = new o0.m(this, org.telegram.ui.Components.ec.g(rnVar, kw0Var, 2750), z11, i10);
                    this.A = mVar;
                    AndroidUtilities.runOnUIThread(mVar, 1500L);
                }
            }
        }
    }

    public final void m(TLRPC.Document document) {
        if (document == null) {
            return;
        }
        HashMap hashMap = this.G;
        if (hashMap == null || !hashMap.containsKey(Long.valueOf(document.id))) {
            if (this.G == null) {
                this.G = new HashMap();
            }
            this.G.put(Long.valueOf(document.id), Boolean.TRUE);
            MediaDataController.getInstance(this.b).preloadImage(ImageLocation.getForDocument(document), 2);
        }
    }

    public final void n(org.telegram.ui.Cells.s1 s1Var) {
        ArrayList arrayList;
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject.isPremiumSticker()) {
            return;
        }
        String stickerEmoji = messageObject.getStickerEmoji();
        if (stickerEmoji == null) {
            stickerEmoji = messageObject.messageOwner.message;
        }
        String q6 = q(stickerEmoji);
        if (!H.contains(q6) || (arrayList = (ArrayList) this.e.get(q6)) == null || arrayList.isEmpty()) {
            return;
        }
        int min = Math.min(1, arrayList.size());
        for (int i10 = 0; i10 < min; i10++) {
            m((TLRPC.Document) arrayList.get(i10));
        }
    }

    public final boolean o(org.telegram.ui.Cells.s1 s1Var, int i10, boolean z10, boolean z11) {
        if (s1Var == null || this.B.size() > 12) {
            return false;
        }
        MessageObject messageObject = s1Var.getMessageObject();
        if (s1Var.getEffect() == null && !s1Var.getPhotoImage().hasNotThumb()) {
            return false;
        }
        String stickerEmoji = messageObject.getStickerEmoji();
        if (stickerEmoji == null) {
            stickerEmoji = messageObject.messageOwner.message;
        }
        if (s1Var.getEffect() == null && stickerEmoji == null) {
            return false;
        }
        float imageHeight = s1Var.getPhotoImage().getImageHeight();
        float imageWidth = s1Var.getPhotoImage().getImageWidth();
        if (s1Var.getEffect() != null || (imageHeight > 0.0f && imageWidth > 0.0f)) {
            return d(q(stickerEmoji), s1Var.getMessageObject().getId(), s1Var.getMessageObject().getDocument(), messageObject, i10, z10, z11, imageWidth, imageHeight, s1Var.getMessageObject().isOutOwner());
        }
        return false;
    }

    public final void p(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, MessageObject messageObject) {
        rn rnVar = this.a;
        if (rnVar == null || MessagesController.getInstance(this.b).premiumFeaturesBlocked() || rnVar.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.kw0 kw0Var = new org.telegram.ui.Components.kw0(this.C.getContext(), null, 1, -1, messageObject.getDocument(), rnVar.getResourceProvider());
        kw0Var.b.setText(tL_messages_stickerSet.set.title);
        kw0Var.c.setText(LocaleController.getString(R.string.PremiumStickerTooltip));
        org.telegram.ui.Components.cc ccVar = new org.telegram.ui.Components.cc(rnVar.getParentActivity(), rnVar.getResourceProvider(), true);
        kw0Var.setButton(ccVar);
        ccVar.a = new org.telegram.ui.Components.r61(18, this, messageObject);
        ccVar.e(LocaleController.getString(R.string.ViewAction));
        org.telegram.ui.Components.ec g10 = org.telegram.ui.Components.ec.g(rnVar, kw0Var, 2750);
        g10.b = messageObject.getId();
        g10.j();
    }

    public sy(rn rnVar, FrameLayout frameLayout, org.telegram.ui.Components.zk0 zk0Var, int i10, long j10, long j11) {
        this.a = rnVar;
        this.C = frameLayout;
        this.D = zk0Var;
        this.b = i10;
        this.E = j10;
        this.F = j11;
    }

    public void h(ry ryVar) {
    }

    public void i() {
    }
}
