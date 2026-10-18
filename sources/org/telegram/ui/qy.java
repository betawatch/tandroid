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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public class qy implements NotificationCenter.NotificationCenterDelegate {
    public static final HashSet L = new HashSet();
    public static final HashSet M;
    public j9.u E;
    public final FrameLayout G;
    public final org.telegram.ui.Components.im0 H;
    public final long I;
    public final long J;
    public HashMap K;
    public final sn a;
    public int b;
    public TLRPC.TL_messages_stickerSet c;
    public boolean n;
    public String v;
    public vi y;
    public boolean d = false;
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final Random h = new Random();
    public int r = -1;
    public long s = 0;
    public final ArrayList w = new ArrayList();
    public final ArrayList x = new ArrayList();
    public final ArrayList F = new ArrayList();

    static {
        HashSet hashSet = new HashSet();
        M = hashSet;
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

    public qy(int i10, FrameLayout frameLayout) {
        this.G = frameLayout;
        this.b = i10;
    }

    public static boolean a(org.telegram.ui.Cells.u1 u1Var, float f7, int i10) {
        float centerY = u1Var.getPhotoImage().getCenterY() + u1Var.getY();
        return centerY > f7 && centerY < ((float) i10);
    }

    public static int f() {
        float min;
        float f7;
        if (AndroidUtilities.isTablet()) {
            min = AndroidUtilities.getMinTabletSide();
            f7 = 0.4f;
        } else {
            Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
            f7 = 0.5f;
        }
        return (int) ((((int) (min * f7)) * 2.0f) / AndroidUtilities.density);
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
                if (!M.contains(tL_stickerPack.emoticon) && tL_stickerPack.documents.size() > 0) {
                    String str = tL_stickerPack.emoticon;
                    HashSet hashSet = L;
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
            ArrayList arrayList = this.F;
            if (i10 >= arrayList.size()) {
                arrayList.clear();
                return;
            }
            ((py) arrayList.get(i10)).r.onDetachedFromWindow();
            if (((py) arrayList.get(i10)).j != null) {
                ((py) arrayList.get(i10)).j.d(this.G);
            }
            i10++;
        }
    }

    public final boolean d(String str, int i10, TLRPC.Document document, MessageObject messageObject, int i11, boolean z10, boolean z11, float f7, float f10, boolean z12) {
        Random random;
        long j10;
        TLRPC.Document document2;
        int abs;
        TLRPC.VideoSize premiumStickerAnimation;
        boolean z13;
        vi viVar;
        int i12 = i11;
        boolean z14 = messageObject != null && messageObject.isPremiumSticker();
        boolean z15 = (messageObject == null || messageObject.getEffect() == null) ? false : true;
        if (z15 || z14 || L.contains(str)) {
            ArrayList arrayList = (ArrayList) this.e.get(str);
            if (z15 || ((arrayList != null && !arrayList.isEmpty()) || z14)) {
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    ArrayList arrayList2 = this.F;
                    if (i13 >= arrayList2.size()) {
                        if (z10 && z14 && i14 > 0) {
                            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.w;
                            if (qcVar != null && qcVar.b == messageObject.getId()) {
                                return false;
                            }
                            TLRPC.InputStickerSet inputStickerSet = messageObject.getInputStickerSet();
                            TLRPC.TL_messages_stickerSet stickerSetByName = inputStickerSet.short_name != null ? MediaDataController.getInstance(this.b).getStickerSetByName(inputStickerSet.short_name) : null;
                            if (stickerSetByName == null) {
                                stickerSetByName = MediaDataController.getInstance(this.b).getStickerSetById(inputStickerSet.id);
                            }
                            if (stickerSetByName != null) {
                                o(stickerSetByName, messageObject);
                                return false;
                            }
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                            tL_messages_getStickerSet.stickerset = inputStickerSet;
                            ConnectionsManager.getInstance(this.b).sendRequest(tL_messages_getStickerSet, new xc(25, this, messageObject));
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
                                                HashMap hashMap = this.K;
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
                        py pyVar = new py();
                        pyVar.h = z14;
                        pyVar.i = z15;
                        if (!z15) {
                            pyVar.f = ((random.nextInt() % 101) / 100.0f) * (f7 / 4.0f);
                            pyVar.g = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                        }
                        pyVar.p = i10;
                        pyVar.q = document2;
                        pyVar.m = z12;
                        pyVar.r.setAllowStartAnimation(true);
                        pyVar.r.setAllowLottieVibration(z10);
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
                            pyVar.r.setUniqKeyPrefix(intValue + "_" + pyVar.p + "_");
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(f11);
                            sb2.append("_");
                            sb2.append(f11);
                            sb2.append(z17 ? "_pcache" : "");
                            pyVar.r.setImage(forDocument, sb2.toString(), null, "tgs", this.c, 1);
                            pyVar.r.setDelegate(new oy(this, pyVar, z10, messageObject));
                            if (pyVar.r.getLottieAnimation() != null) {
                                pyVar.r.getLottieAnimation().N(0, false, true);
                            }
                        } else {
                            z13 = z14;
                            boolean z18 = z16;
                            int f12 = f();
                            if (i15 > 0) {
                                Integer num2 = (Integer) hashMap2.get(Long.valueOf(document2.id));
                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                hashMap2.put(Long.valueOf(document2.id), Integer.valueOf((intValue2 + 1) % 4));
                                pyVar.r.setUniqKeyPrefix(intValue2 + "_" + pyVar.p + "_");
                            }
                            pyVar.q = document2;
                            ImageLocation forDocument2 = ImageLocation.getForDocument(premiumStickerAnimation, document2);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(f12);
                            sb3.append("_");
                            sb3.append(f12);
                            sb3.append(z18 ? "_pcache" : "");
                            pyVar.r.setImage(forDocument2, sb3.toString(), null, "tgs", this.c, 1);
                        }
                        pyVar.r.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
                        pyVar.r.setAutoRepeat(0);
                        if (pyVar.r.getLottieAnimation() != null) {
                            if (pyVar.h) {
                                pyVar.r.getLottieAnimation().N(0, false, true);
                            }
                            pyVar.r.getLottieAnimation().start();
                        }
                        arrayList2.add(pyVar);
                        pyVar.r.onAttachedToWindow();
                        ImageReceiver imageReceiver = pyVar.r;
                        FrameLayout frameLayout = this.G;
                        imageReceiver.setParentView(frameLayout);
                        frameLayout.invalidate();
                        if (z10 && !z13 && UserConfig.getInstance(this.b).clientUserId != this.I) {
                            int i19 = this.r;
                            if (i19 != 0 && i19 != i10 && (viVar = this.y) != null) {
                                AndroidUtilities.cancelRunOnUIThread(viVar);
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
                            vi viVar2 = this.y;
                            if (viVar2 != null) {
                                AndroidUtilities.cancelRunOnUIThread(viVar2);
                                this.y = null;
                            }
                            vi viVar3 = new vi(this, 28);
                            this.y = viVar3;
                            AndroidUtilities.runOnUIThread(viVar3, 500L);
                        }
                        if (!z11) {
                            return true;
                        }
                        MessagesController.getInstance(this.b).sendTyping(this.I, this.J, 11, str, 0);
                        return true;
                    }
                    if (((py) arrayList2.get(i13)).p == i10) {
                        i14++;
                        if (!z15 && (((py) arrayList2.get(i13)).r.getLottieAnimation() == null || ((py) arrayList2.get(i13)).r.getLottieAnimation().y())) {
                            return false;
                        }
                    }
                    if (((py) arrayList2.get(i13)).q != null && document != null) {
                        if (((py) arrayList2.get(i13)).q.id == document.id) {
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
        long j10 = this.I;
        if (i10 != i12) {
            if (i10 == NotificationCenter.updateInterfaces && (printingStringType = MessagesController.getInstance(this.b).getPrintingStringType(j10, this.J)) != null && printingStringType.intValue() == 5) {
                j9.u uVar = this.E;
                if (uVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(uVar);
                }
                this.E = null;
                return;
            }
            return;
        }
        if (this.a == null) {
            return;
        }
        long longValue = ((Long) objArr[0]).longValue();
        TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = (TLRPC.TL_sendMessageEmojiInteraction) objArr[1];
        if (longValue == j10 && L.contains(tL_sendMessageEmojiInteraction.emoticon)) {
            int i13 = tL_sendMessageEmojiInteraction.msg_id;
            if (tL_sendMessageEmojiInteraction.interaction.data != null) {
                try {
                    JSONArray jSONArray = new JSONObject(tL_sendMessageEmojiInteraction.interaction.data).getJSONArray("a");
                    for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i14);
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.nd0(this, i13, jSONObject.optInt("i", 1) - 1), (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public final void e(Canvas canvas) {
        float f7;
        float f10;
        MessageObject messageObject;
        ImageReceiver imageReceiver;
        if (this.F.isEmpty()) {
            return;
        }
        int i10 = 0;
        while (i10 < this.F.size()) {
            py pyVar = (py) this.F.get(i10);
            float f11 = 3.0f;
            if (this.a != null) {
                pyVar.c = false;
                int i11 = 0;
                while (true) {
                    if (i11 >= this.H.getChildCount()) {
                        f7 = f11;
                        f10 = 0.0f;
                        break;
                    }
                    View childAt = this.H.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                        messageObject = u1Var.getMessageObject();
                        imageReceiver = u1Var.getPhotoImage();
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                        messageObject = w0Var.getMessageObject();
                        imageReceiver = w0Var.getPhotoImage();
                    } else {
                        messageObject = null;
                        imageReceiver = null;
                    }
                    if (messageObject == null || messageObject.getId() != pyVar.p) {
                        i11++;
                        f11 = f11;
                    } else {
                        pyVar.c = true;
                        float x10 = childAt.getX() + this.H.getX();
                        float y3 = childAt.getY() + this.H.getY();
                        f10 = childAt.getY();
                        pyVar.d = imageReceiver.getImageWidth();
                        pyVar.e = imageReceiver.getImageHeight();
                        if (pyVar.i && (childAt instanceof org.telegram.ui.Cells.u1)) {
                            org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                            float f12 = (f() * AndroidUtilities.density) / 1.3f;
                            float f13 = f12 / f11;
                            pyVar.d = f13;
                            pyVar.e = f13;
                            float timeX = u1Var2.getTimeX() + x10;
                            float f14 = f12 / 2.0f;
                            f7 = f11;
                            pyVar.a = Utilities.clamp(timeX - f14, AndroidUtilities.displaySize.x - f12, 0.0f);
                            pyVar.b = (u1Var2.getTimeY() + y3) - f14;
                        } else {
                            f7 = f11;
                            if (pyVar.h) {
                                pyVar.a = imageReceiver.getImageX() + x10;
                                pyVar.b = imageReceiver.getImageY() + y3;
                            } else {
                                float imageX = imageReceiver.getImageX() + x10;
                                float imageY = imageReceiver.getImageY() + y3;
                                float dp = pyVar.m ? ((-imageReceiver.getImageWidth()) * 2.0f) + AndroidUtilities.dp(24.0f) + imageX : (-AndroidUtilities.dp(24.0f)) + imageX;
                                float imageWidth = imageY - imageReceiver.getImageWidth();
                                pyVar.a = dp;
                                pyVar.b = imageWidth;
                            }
                        }
                    }
                }
                if (!pyVar.c || pyVar.e + f10 < this.a.s9 || f10 > this.H.getMeasuredHeight() - this.a.Ba) {
                    pyVar.n = true;
                }
                if (pyVar.h) {
                    float f15 = pyVar.e / 2.0f;
                    boolean z10 = ((float) this.H.getMeasuredHeight()) - f10 <= f15;
                    boolean z11 = (f10 - this.a.s9) + f15 <= 0.0f;
                    if (z10 || z11) {
                        pyVar.n = true;
                    }
                }
                if (pyVar.n) {
                    float f16 = pyVar.o;
                    if (f16 != 1.0f) {
                        float clamp = Utilities.clamp(f16 + 0.10666667f, 1.0f, 0.0f);
                        pyVar.o = clamp;
                        pyVar.r.setAlpha(1.0f - clamp);
                        this.a.X0.invalidate();
                    }
                }
            } else {
                f7 = 3.0f;
                g(pyVar);
            }
            boolean z12 = !pyVar.l && pyVar.n;
            if (!z12) {
                if (!pyVar.h || pyVar.i) {
                    ah.e eVar = pyVar.j;
                    if (eVar != null) {
                        float f17 = pyVar.a + pyVar.f;
                        float f18 = pyVar.b + pyVar.g;
                        float f19 = pyVar.d * f7;
                        eVar.e((int) f17, (int) f18, (int) (f17 + f19), (int) (f18 + f19));
                        pyVar.j.b(canvas);
                    } else {
                        ImageReceiver imageReceiver2 = pyVar.r;
                        float f20 = pyVar.a + pyVar.f;
                        float f21 = pyVar.b + pyVar.g;
                        float f22 = pyVar.d * f7;
                        imageReceiver2.setImageCoords(f20, f21, f22, f22);
                        if (pyVar.m) {
                            pyVar.r.draw(canvas);
                        } else {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, pyVar.r.getCenterX(), pyVar.r.getCenterY());
                            pyVar.r.draw(canvas);
                            canvas.restore();
                        }
                    }
                } else {
                    float f23 = pyVar.e;
                    float f24 = 1.49926f * f23;
                    float f25 = 0.0546875f * f24;
                    float f26 = (((f23 / 2.0f) + pyVar.b) - (f24 / 2.0f)) - (0.00279f * f24);
                    if (pyVar.m) {
                        pyVar.r.setImageCoords(((pyVar.a + pyVar.d) - f24) + f25, f26, f24, f24);
                    } else {
                        pyVar.r.setImageCoords(pyVar.a - f25, f26, f24, f24);
                    }
                    if (pyVar.m) {
                        pyVar.r.draw(canvas);
                    } else {
                        canvas.save();
                        canvas.scale(-1.0f, 1.0f, pyVar.r.getCenterX(), pyVar.r.getCenterY());
                        pyVar.r.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            ah.e eVar2 = pyVar.j;
            boolean c10 = eVar2 != null ? eVar2.c() : pyVar.l && pyVar.r.getLottieAnimation() != null && pyVar.r.getLottieAnimation().a0 >= pyVar.r.getLottieAnimation().e[0] + (-2);
            if (pyVar.o == 1.0f || c10 || z12) {
                py pyVar2 = (py) this.F.remove(i10);
                if (pyVar.h && pyVar.r.getLottieAnimation() != null) {
                    pyVar2.r.getLottieAnimation().N(0, true, true);
                }
                pyVar2.r.onDetachedFromWindow();
                ah.e eVar3 = pyVar2.j;
                if (eVar3 != null) {
                    eVar3.d(this.G);
                }
                i10--;
            } else if (pyVar.r.getLottieAnimation() != null && pyVar.r.getLottieAnimation().k0) {
                pyVar.l = true;
            } else if (pyVar.r.getLottieAnimation() != null && !pyVar.r.getLottieAnimation().k0) {
                pyVar.r.getLottieAnimation().N(0, true, false);
                pyVar.r.getLottieAnimation().start();
            }
            i10++;
        }
        if (this.F.isEmpty()) {
            h();
        }
        this.G.invalidate();
    }

    public final void i() {
        this.n = true;
        b();
        NotificationCenter.getInstance(this.b).addObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.b).addObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.b).addObserver(this, NotificationCenter.updateInterfaces);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((py) arrayList.get(i10)).r.onAttachedToWindow();
            if (((py) arrayList.get(i10)).j != null) {
                ((py) arrayList.get(i10)).j.f(this.G);
            }
            i10++;
        }
    }

    public final void j() {
        int i10 = 0;
        this.n = false;
        NotificationCenter.getInstance(this.b).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.b).removeObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.b).removeObserver(this, NotificationCenter.updateInterfaces);
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 >= arrayList.size()) {
                arrayList.clear();
                return;
            }
            ((py) arrayList.get(i10)).r.onDetachedFromWindow();
            if (((py) arrayList.get(i10)).j != null) {
                ((py) arrayList.get(i10)).j.d(this.G);
            }
            i10++;
        }
    }

    public final void k(org.telegram.ui.Cells.u1 u1Var, sn snVar, boolean z10) {
        if (snVar.x() || u1Var.getMessageObject() == null || u1Var.getMessageObject().getId() < 0) {
            return;
        }
        if (u1Var.getMessageObject().isPremiumSticker() || snVar.f != null) {
            boolean z11 = false;
            boolean n10 = n(u1Var, -1, z10, false);
            if (z10 && n10 && !EmojiData.hasEmojiSupportVibration(u1Var.getMessageObject().getStickerEmoji()) && !u1Var.getMessageObject().isPremiumSticker() && !u1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                try {
                    u1Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            boolean isPremiumSticker = u1Var.getMessageObject().isPremiumSticker();
            long j10 = this.I;
            if (isPremiumSticker || u1Var.getEffect() != null || (!z10 && u1Var.getMessageObject().isAnimatedEmojiStickerSingle())) {
                u1Var.getMessageObject().forcePlayEffect = false;
                u1Var.getMessageObject().messageOwner.premiumEffectWasPlayed = true;
                snVar.getMessagesStorage().updateMessageCustomParams(j10, u1Var.getMessageObject().messageOwner);
                return;
            }
            Integer printingStringType = MessagesController.getInstance(this.b).getPrintingStringType(j10, this.J);
            if ((printingStringType == null || printingStringType.intValue() != 5) && this.E == null && n10) {
                org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.w;
                if ((qcVar == null || !qcVar.l) && SharedConfig.emojiInteractionsHintCount > 0 && UserConfig.getInstance(this.b).getClientUserId() != snVar.f.id) {
                    SharedConfig.updateEmojiInteractionsHintCount(SharedConfig.emojiInteractionsHintCount - 1);
                    org.telegram.ui.Components.tx0 tx0Var = new org.telegram.ui.Components.tx0(snVar.getParentActivity(), null, 1, -1, u1Var.getMessageObject().isAnimatedAnimatedEmoji() ? u1Var.getMessageObject().getDocument() : MediaDataController.getInstance(this.b).getEmojiAnimatedSticker(u1Var.getMessageObject().getStickerEmoji()), snVar.getResourceProvider());
                    tx0Var.c.setVisibility(8);
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("EmojiInteractionTapHint", R.string.EmojiInteractionTapHint, snVar.f.first_name));
                    TextView textView = tx0Var.b;
                    textView.setText(Emoji.replaceEmoji(replaceTags, textView.getPaint().getFontMetricsInt(), false));
                    textView.setTypeface(null);
                    textView.setMaxLines(3);
                    textView.setSingleLine(false);
                    j9.u uVar = new j9.u(this, org.telegram.ui.Components.qc.g(snVar, tx0Var, 2750), z11, 24);
                    this.E = uVar;
                    AndroidUtilities.runOnUIThread(uVar, 1500L);
                }
            }
        }
    }

    public final void l(TLRPC.Document document) {
        if (document == null) {
            return;
        }
        HashMap hashMap = this.K;
        if (hashMap == null || !hashMap.containsKey(Long.valueOf(document.id))) {
            if (this.K == null) {
                this.K = new HashMap();
            }
            this.K.put(Long.valueOf(document.id), Boolean.TRUE);
            MediaDataController.getInstance(this.b).preloadImage(ImageLocation.getForDocument(document), 2);
        }
    }

    public final void m(org.telegram.ui.Cells.u1 u1Var) {
        ArrayList arrayList;
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject.isPremiumSticker()) {
            return;
        }
        String stickerEmoji = messageObject.getStickerEmoji();
        if (stickerEmoji == null) {
            stickerEmoji = messageObject.messageOwner.message;
        }
        String p5 = p(stickerEmoji);
        if (!L.contains(p5) || (arrayList = (ArrayList) this.e.get(p5)) == null || arrayList.isEmpty()) {
            return;
        }
        int min = Math.min(1, arrayList.size());
        for (int i10 = 0; i10 < min; i10++) {
            l((TLRPC.Document) arrayList.get(i10));
        }
    }

    public final boolean n(org.telegram.ui.Cells.u1 u1Var, int i10, boolean z10, boolean z11) {
        if (u1Var == null || this.F.size() > 12) {
            return false;
        }
        MessageObject messageObject = u1Var.getMessageObject();
        if (u1Var.getEffect() == null && !u1Var.getPhotoImage().hasNotThumb()) {
            return false;
        }
        String stickerEmoji = messageObject.getStickerEmoji();
        if (stickerEmoji == null) {
            stickerEmoji = messageObject.messageOwner.message;
        }
        if (u1Var.getEffect() == null && stickerEmoji == null) {
            return false;
        }
        float imageHeight = u1Var.getPhotoImage().getImageHeight();
        float imageWidth = u1Var.getPhotoImage().getImageWidth();
        if (u1Var.getEffect() != null || (imageHeight > 0.0f && imageWidth > 0.0f)) {
            return d(p(stickerEmoji), u1Var.getMessageObject().getId(), u1Var.getMessageObject().getDocument(), messageObject, i10, z10, z11, imageWidth, imageHeight, u1Var.getMessageObject().isOutOwner());
        }
        return false;
    }

    public final void o(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, MessageObject messageObject) {
        sn snVar = this.a;
        if (snVar == null || MessagesController.getInstance(this.b).premiumFeaturesBlocked() || snVar.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.tx0 tx0Var = new org.telegram.ui.Components.tx0(this.G.getContext(), null, 1, -1, messageObject.getDocument(), snVar.getResourceProvider());
        tx0Var.b.setText(tL_messages_stickerSet.set.title);
        tx0Var.c.setText(LocaleController.getString(R.string.PremiumStickerTooltip));
        org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(snVar.getParentActivity(), snVar.getResourceProvider(), true);
        tx0Var.setButton(ocVar);
        ocVar.a = new nt(11, this, messageObject);
        ocVar.e(LocaleController.getString(R.string.ViewAction));
        org.telegram.ui.Components.qc g10 = org.telegram.ui.Components.qc.g(snVar, tx0Var, 2750);
        g10.b = messageObject.getId();
        g10.j();
    }

    public qy(sn snVar, FrameLayout frameLayout, org.telegram.ui.Components.im0 im0Var, int i10, long j10, long j11) {
        this.a = snVar;
        this.G = frameLayout;
        this.H = im0Var;
        this.b = i10;
        this.I = j10;
        this.J = j11;
    }

    public void g(py pyVar) {
    }

    public void h() {
    }
}
