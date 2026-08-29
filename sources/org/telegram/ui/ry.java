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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class ry implements NotificationCenter.NotificationCenterDelegate {
    public static final HashSet H = new HashSet();
    public static final HashSet I;
    public od.i A;
    public final FrameLayout C;
    public final org.telegram.ui.Components.jl0 D;
    public final long E;
    public final long F;
    public HashMap G;
    public final tn a;
    public int b;
    public TLRPC.TL_messages_stickerSet c;
    public boolean n;
    public String v;
    public ui y;
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

    public ry(int i10, FrameLayout frameLayout) {
        this.C = frameLayout;
        this.b = i10;
    }

    public static boolean a(org.telegram.ui.Cells.s1 s1Var, float f9, int i10) {
        float centerY = s1Var.getPhotoImage().getCenterY() + s1Var.getY();
        return centerY > f9 && centerY < ((float) i10);
    }

    public static int f() {
        float min;
        float f9;
        if (AndroidUtilities.isTablet()) {
            min = AndroidUtilities.getMinTabletSide();
            f9 = 0.4f;
        } else {
            Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
            f9 = 0.5f;
        }
        return (int) ((((int) (min * f9)) * 2.0f) / AndroidUtilities.density);
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
            ((qy) arrayList.get(i10)).r.onDetachedFromWindow();
            if (((qy) arrayList.get(i10)).j != null) {
                ((qy) arrayList.get(i10)).j.d(this.C);
            }
            i10++;
        }
    }

    public final boolean d(String str, int i10, TLRPC.Document document, MessageObject messageObject, int i11, boolean z10, boolean z11, float f9, float f10, boolean z12) {
        Random random;
        long j10;
        TLRPC.Document document2;
        int abs;
        TLRPC.VideoSize premiumStickerAnimation;
        boolean z13;
        ui uiVar;
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
                            org.telegram.ui.Components.mc mcVar = org.telegram.ui.Components.mc.w;
                            if (mcVar != null && mcVar.b == messageObject.getId()) {
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
                            ConnectionsManager.getInstance(this.b).sendRequest(tL_messages_getStickerSet, new zg(21, this, messageObject));
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
                        qy qyVar = new qy();
                        qyVar.h = z14;
                        qyVar.i = z15;
                        if (!z15) {
                            qyVar.f = ((random.nextInt() % 101) / 100.0f) * (f9 / 4.0f);
                            qyVar.g = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                        }
                        qyVar.p = i10;
                        qyVar.q = document2;
                        qyVar.m = z12;
                        qyVar.r.setAllowStartAnimation(true);
                        qyVar.r.setAllowLottieVibration(z10);
                        boolean z16 = SharedConfig.getDevicePerformanceClass() <= 1 || !BuildVars.DEBUG_VERSION;
                        HashMap hashMap2 = this.f;
                        int i18 = i12;
                        if (premiumStickerAnimation == null) {
                            int f11 = f();
                            z13 = z14;
                            boolean z17 = z16;
                            Integer num = (Integer) hashMap2.get(Long.valueOf(document2.id));
                            int intValue = (num == null ? 0 : num.intValue()) + 1;
                            hashMap2.put(Long.valueOf(document2.id), Integer.valueOf(intValue));
                            ImageLocation forDocument = ImageLocation.getForDocument(document2);
                            qyVar.r.setUniqKeyPrefix(intValue + "_" + qyVar.p + "_");
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(f11);
                            sb2.append("_");
                            sb2.append(f11);
                            sb2.append(z17 ? "_pcache" : "");
                            qyVar.r.setImage(forDocument, sb2.toString(), null, "tgs", this.c, 1);
                            qyVar.r.setDelegate(new py(this, qyVar, z10, messageObject));
                            if (qyVar.r.getLottieAnimation() != null) {
                                qyVar.r.getLottieAnimation().L(0, false, true);
                            }
                        } else {
                            z13 = z14;
                            boolean z18 = z16;
                            int f12 = f();
                            if (i15 > 0) {
                                Integer num2 = (Integer) hashMap2.get(Long.valueOf(document2.id));
                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                hashMap2.put(Long.valueOf(document2.id), Integer.valueOf((intValue2 + 1) % 4));
                                qyVar.r.setUniqKeyPrefix(intValue2 + "_" + qyVar.p + "_");
                            }
                            qyVar.q = document2;
                            ImageLocation forDocument2 = ImageLocation.getForDocument(premiumStickerAnimation, document2);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(f12);
                            sb3.append("_");
                            sb3.append(f12);
                            sb3.append(z18 ? "_pcache" : "");
                            qyVar.r.setImage(forDocument2, sb3.toString(), null, "tgs", this.c, 1);
                        }
                        qyVar.r.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
                        qyVar.r.setAutoRepeat(0);
                        if (qyVar.r.getLottieAnimation() != null) {
                            if (qyVar.h) {
                                qyVar.r.getLottieAnimation().L(0, false, true);
                            }
                            qyVar.r.getLottieAnimation().start();
                        }
                        arrayList2.add(qyVar);
                        qyVar.r.onAttachedToWindow();
                        ImageReceiver imageReceiver = qyVar.r;
                        FrameLayout frameLayout = this.C;
                        imageReceiver.setParentView(frameLayout);
                        frameLayout.invalidate();
                        if (z10 && !z13 && UserConfig.getInstance(this.b).clientUserId != this.E) {
                            int i19 = this.r;
                            if (i19 != 0 && i19 != i10 && (uiVar = this.y) != null) {
                                AndroidUtilities.cancelRunOnUIThread(uiVar);
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
                            ui uiVar2 = this.y;
                            if (uiVar2 != null) {
                                AndroidUtilities.cancelRunOnUIThread(uiVar2);
                                this.y = null;
                            }
                            ui uiVar3 = new ui(this, 27);
                            this.y = uiVar3;
                            AndroidUtilities.runOnUIThread(uiVar3, 500L);
                        }
                        if (!z11) {
                            return true;
                        }
                        MessagesController.getInstance(this.b).sendTyping(this.E, this.F, 11, str, 0);
                        return true;
                    }
                    if (((qy) arrayList2.get(i13)).p == i10) {
                        i14++;
                        if (!z15 && (((qy) arrayList2.get(i13)).r.getLottieAnimation() == null || ((qy) arrayList2.get(i13)).r.getLottieAnimation().w())) {
                            return false;
                        }
                    }
                    if (((qy) arrayList2.get(i13)).q != null && document != null) {
                        if (((qy) arrayList2.get(i13)).q.id == document.id) {
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
                od.i iVar = this.A;
                if (iVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(iVar);
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
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.pc0(this, i13, jSONObject.optInt("i", 1) - 1), (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
                    }
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public final void e(Canvas canvas) {
        float f9;
        float f10;
        MessageObject messageObject;
        ImageReceiver imageReceiver;
        if (this.B.isEmpty()) {
            return;
        }
        int i10 = 0;
        while (i10 < this.B.size()) {
            qy qyVar = (qy) this.B.get(i10);
            float f11 = 3.0f;
            if (this.a != null) {
                qyVar.c = false;
                int i11 = 0;
                while (true) {
                    if (i11 >= this.D.getChildCount()) {
                        f9 = 3.0f;
                        f10 = 0.0f;
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
                    if (messageObject == null || messageObject.getId() != qyVar.p) {
                        i11++;
                        f11 = 3.0f;
                    } else {
                        qyVar.c = true;
                        float x4 = childAt.getX() + this.D.getX();
                        float y8 = childAt.getY() + this.D.getY();
                        f10 = childAt.getY();
                        qyVar.d = imageReceiver.getImageWidth();
                        qyVar.e = imageReceiver.getImageHeight();
                        if (qyVar.i && (childAt instanceof org.telegram.ui.Cells.s1)) {
                            org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                            float f12 = (f() * AndroidUtilities.density) / 1.3f;
                            float f13 = f12 / f11;
                            qyVar.d = f13;
                            qyVar.e = f13;
                            float timeX = s1Var2.getTimeX() + x4;
                            float f14 = f12 / 2.0f;
                            f9 = 3.0f;
                            qyVar.a = Utilities.clamp(timeX - f14, AndroidUtilities.displaySize.x - f12, 0.0f);
                            qyVar.b = (s1Var2.getTimeY() + y8) - f14;
                        } else {
                            f9 = 3.0f;
                            if (qyVar.h) {
                                qyVar.a = imageReceiver.getImageX() + x4;
                                qyVar.b = imageReceiver.getImageY() + y8;
                            } else {
                                float imageX = imageReceiver.getImageX() + x4;
                                float imageY = imageReceiver.getImageY() + y8;
                                float dp = qyVar.m ? ((-imageReceiver.getImageWidth()) * 2.0f) + AndroidUtilities.dp(24.0f) + imageX : (-AndroidUtilities.dp(24.0f)) + imageX;
                                float imageWidth = imageY - imageReceiver.getImageWidth();
                                qyVar.a = dp;
                                qyVar.b = imageWidth;
                            }
                        }
                    }
                }
                if (!qyVar.c || qyVar.e + f10 < this.a.o9 || f10 > this.D.getMeasuredHeight() - this.a.wa) {
                    qyVar.n = true;
                }
                if (qyVar.h) {
                    float f15 = qyVar.e / 2.0f;
                    boolean z10 = ((float) this.D.getMeasuredHeight()) - f10 <= f15;
                    boolean z11 = (f10 - this.a.o9) + f15 <= 0.0f;
                    if (z10 || z11) {
                        qyVar.n = true;
                    }
                }
                if (qyVar.n) {
                    float f16 = qyVar.o;
                    if (f16 != 1.0f) {
                        float clamp = Utilities.clamp(f16 + 0.10666667f, 1.0f, 0.0f);
                        qyVar.o = clamp;
                        qyVar.r.setAlpha(1.0f - clamp);
                        this.a.T0.invalidate();
                    }
                }
            } else {
                f9 = 3.0f;
                h(qyVar);
            }
            boolean z12 = !qyVar.l && qyVar.n;
            if (!z12) {
                if (!qyVar.h || qyVar.i) {
                    kg.d dVar = qyVar.j;
                    if (dVar != null) {
                        float f17 = qyVar.a + qyVar.f;
                        float f18 = qyVar.b + qyVar.g;
                        float f19 = qyVar.d * f9;
                        dVar.e((int) f17, (int) f18, (int) (f17 + f19), (int) (f18 + f19));
                        qyVar.j.b(canvas);
                    } else {
                        ImageReceiver imageReceiver2 = qyVar.r;
                        float f20 = qyVar.a + qyVar.f;
                        float f21 = qyVar.b + qyVar.g;
                        float f22 = qyVar.d * f9;
                        imageReceiver2.setImageCoords(f20, f21, f22, f22);
                        if (qyVar.m) {
                            qyVar.r.draw(canvas);
                        } else {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, qyVar.r.getCenterX(), qyVar.r.getCenterY());
                            qyVar.r.draw(canvas);
                            canvas.restore();
                        }
                    }
                } else {
                    float f23 = qyVar.e;
                    float f24 = 1.49926f * f23;
                    float f25 = 0.0546875f * f24;
                    float f26 = (((f23 / 2.0f) + qyVar.b) - (f24 / 2.0f)) - (0.00279f * f24);
                    if (qyVar.m) {
                        qyVar.r.setImageCoords(((qyVar.a + qyVar.d) - f24) + f25, f26, f24, f24);
                    } else {
                        qyVar.r.setImageCoords(qyVar.a - f25, f26, f24, f24);
                    }
                    if (qyVar.m) {
                        qyVar.r.draw(canvas);
                    } else {
                        canvas.save();
                        canvas.scale(-1.0f, 1.0f, qyVar.r.getCenterX(), qyVar.r.getCenterY());
                        qyVar.r.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            kg.d dVar2 = qyVar.j;
            boolean c3 = dVar2 != null ? dVar2.c() : qyVar.l && qyVar.r.getLottieAnimation() != null && qyVar.r.getLottieAnimation().X >= qyVar.r.getLottieAnimation().e[0] + (-2);
            if (qyVar.o == 1.0f || c3 || z12) {
                qy qyVar2 = (qy) this.B.remove(i10);
                if (qyVar.h && qyVar.r.getLottieAnimation() != null) {
                    qyVar2.r.getLottieAnimation().L(0, true, true);
                }
                qyVar2.r.onDetachedFromWindow();
                kg.d dVar3 = qyVar2.j;
                if (dVar3 != null) {
                    dVar3.d(this.C);
                }
                i10--;
            } else if (qyVar.r.getLottieAnimation() != null && qyVar.r.getLottieAnimation().h0) {
                qyVar.l = true;
            } else if (qyVar.r.getLottieAnimation() != null && !qyVar.r.getLottieAnimation().h0) {
                qyVar.r.getLottieAnimation().L(0, true, false);
                qyVar.r.getLottieAnimation().start();
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
            ((qy) arrayList.get(i10)).r.onAttachedToWindow();
            if (((qy) arrayList.get(i10)).j != null) {
                ((qy) arrayList.get(i10)).j.f(this.C);
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
            ((qy) arrayList.get(i10)).r.onDetachedFromWindow();
            if (((qy) arrayList.get(i10)).j != null) {
                ((qy) arrayList.get(i10)).j.d(this.C);
            }
            i10++;
        }
    }

    public final void l(org.telegram.ui.Cells.s1 s1Var, tn tnVar, boolean z10) {
        if (tnVar.w() || s1Var.getMessageObject() == null || s1Var.getMessageObject().getId() < 0) {
            return;
        }
        if (s1Var.getMessageObject().isPremiumSticker() || tnVar.f != null) {
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
                tnVar.getMessagesStorage().updateMessageCustomParams(j10, s1Var.getMessageObject().messageOwner);
                return;
            }
            Integer printingStringType = MessagesController.getInstance(this.b).getPrintingStringType(j10, this.F);
            if ((printingStringType == null || printingStringType.intValue() != 5) && this.A == null && o10) {
                org.telegram.ui.Components.mc mcVar = org.telegram.ui.Components.mc.w;
                if ((mcVar == null || !mcVar.l) && SharedConfig.emojiInteractionsHintCount > 0 && UserConfig.getInstance(this.b).getClientUserId() != tnVar.f.id) {
                    SharedConfig.updateEmojiInteractionsHintCount(SharedConfig.emojiInteractionsHintCount - 1);
                    org.telegram.ui.Components.sw0 sw0Var = new org.telegram.ui.Components.sw0(tnVar.getParentActivity(), null, 1, -1, s1Var.getMessageObject().isAnimatedAnimatedEmoji() ? s1Var.getMessageObject().getDocument() : MediaDataController.getInstance(this.b).getEmojiAnimatedSticker(s1Var.getMessageObject().getStickerEmoji()), tnVar.getResourceProvider());
                    sw0Var.c.setVisibility(8);
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("EmojiInteractionTapHint", R.string.EmojiInteractionTapHint, tnVar.f.first_name));
                    TextView textView = sw0Var.b;
                    textView.setText(Emoji.replaceEmoji(replaceTags, textView.getPaint().getFontMetricsInt(), false));
                    textView.setTypeface(null);
                    textView.setMaxLines(3);
                    textView.setSingleLine(false);
                    od.i iVar = new od.i(i10, this, org.telegram.ui.Components.mc.g(tnVar, sw0Var, 2750));
                    this.A = iVar;
                    AndroidUtilities.runOnUIThread(iVar, 1500L);
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
        tn tnVar = this.a;
        if (tnVar == null || MessagesController.getInstance(this.b).premiumFeaturesBlocked() || tnVar.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.sw0 sw0Var = new org.telegram.ui.Components.sw0(this.C.getContext(), null, 1, -1, messageObject.getDocument(), tnVar.getResourceProvider());
        sw0Var.b.setText(tL_messages_stickerSet.set.title);
        sw0Var.c.setText(LocaleController.getString(R.string.PremiumStickerTooltip));
        org.telegram.ui.Components.kc kcVar = new org.telegram.ui.Components.kc(tnVar.getParentActivity(), tnVar.getResourceProvider(), true);
        sw0Var.setButton(kcVar);
        kcVar.a = new org.telegram.ui.Components.voip.o(15, this, messageObject);
        kcVar.e(LocaleController.getString(R.string.ViewAction));
        org.telegram.ui.Components.mc g10 = org.telegram.ui.Components.mc.g(tnVar, sw0Var, 2750);
        g10.b = messageObject.getId();
        g10.j();
    }

    public ry(tn tnVar, FrameLayout frameLayout, org.telegram.ui.Components.jl0 jl0Var, int i10, long j10, long j11) {
        this.a = tnVar;
        this.C = frameLayout;
        this.D = jl0Var;
        this.b = i10;
        this.E = j10;
        this.F = j11;
    }

    public void h(qy qyVar) {
    }

    public void i() {
    }
}
