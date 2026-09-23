package zg;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.dz;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class d {
    public static int m;
    public q5 a;
    public Rect b;
    public ArrayList c;
    public View d;
    public long e;
    public boolean f;
    public boolean g;
    public int h;
    public boolean i;
    public ImageReceiver j;
    public int k;
    public long l;

    public static d a(q5 q5Var, boolean z10, boolean z11) {
        int i10 = UserConfig.selectedAccount;
        d dVar = new d();
        dVar.b = new Rect();
        dVar.c = new ArrayList();
        dVar.g = true;
        dVar.k = -1;
        dVar.a = q5Var;
        dVar.f = z10;
        dVar.h = i10;
        dVar.i = z11;
        dVar.e = System.currentTimeMillis();
        if (z11 && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_CHAT)) {
            ImageReceiver imageReceiver = new ImageReceiver();
            dVar.j = imageReceiver;
            if (z10) {
                imageReceiver.setAllowDrawWhileCacheGenerating(true);
            }
        }
        return dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0190 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas) {
        float f7;
        Rect rect = this.b;
        ImageReceiver imageReceiver = this.j;
        ArrayList arrayList = this.c;
        boolean z10 = this.f;
        if (z10) {
            long currentTimeMillis = System.currentTimeMillis();
            if (arrayList.size() < 12) {
                long j3 = currentTimeMillis - this.e;
                if (j3 < 1500 && j3 > 200 && currentTimeMillis - this.l > 50 && Utilities.fastRandom.nextInt() % 6 == 0) {
                    c cVar = new c(this);
                    cVar.a();
                    arrayList.add(cVar);
                    this.l = currentTimeMillis;
                }
            }
        } else if (this.g) {
            for (int i10 = 0; i10 < 7; i10++) {
                c cVar2 = new c(this);
                cVar2.a();
                arrayList.add(cVar2);
            }
        }
        if (imageReceiver != null && this.i && (imageReceiver.getLottieAnimation() == null || !imageReceiver.getLottieAnimation().A())) {
            if (z10) {
                canvas.save();
                canvas.translate(rect.width() / 3.0f, 0.0f);
                imageReceiver.draw(canvas);
                canvas.restore();
            } else {
                imageReceiver.draw(canvas);
            }
        }
        canvas.save();
        canvas.translate(rect.left, rect.top);
        int i11 = 0;
        while (i11 < arrayList.size()) {
            c cVar3 = (c) arrayList.get(i11);
            float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / cVar3.i) + cVar3.h;
            cVar3.h = min;
            float clamp = Utilities.clamp(min, 1.0f, 0.0f);
            cVar3.h = clamp;
            rr rrVar = rr.g;
            float interpolation = rrVar.getInterpolation(clamp);
            float lerp = AndroidUtilities.lerp(cVar3.a, cVar3.c, interpolation);
            d dVar = cVar3.l;
            q5 q5Var = dVar.a;
            float f10 = cVar3.h;
            float lerp2 = f10 < 0.3f ? AndroidUtilities.lerp(cVar3.b, cVar3.d, rrVar.getInterpolation(f10 / 0.3f)) : AndroidUtilities.lerp(cVar3.d, cVar3.e, rr.i.getInterpolation((f10 - 0.3f) / 0.7f));
            float lerp3 = AndroidUtilities.lerp(cVar3.f, cVar3.g, interpolation);
            if (!dVar.f) {
                float height = dVar.b.height() * 0.8f;
                if (lerp2 > height) {
                    f7 = 1.0f - Utilities.clamp((lerp2 - height) / AndroidUtilities.dp(16.0f), 1.0f, 0.0f);
                    float f11 = (lerp3 / 2.0f) * f7;
                    canvas.save();
                    if (cVar3.j) {
                        canvas.scale(-1.0f, 1.0f, lerp, lerp2);
                    }
                    canvas.rotate(cVar3.k, lerp, lerp2);
                    q5Var.setAlpha((int) (Utilities.clamp(cVar3.h / 0.2f, 1.0f, 0.0f) * f7 * 255.0f));
                    q5Var.setBounds((int) (lerp - f11), (int) (lerp2 - f11), (int) (lerp + f11), (int) (lerp2 + f11));
                    q5Var.draw(canvas);
                    q5Var.setAlpha(255);
                    canvas.restore();
                    if (((c) arrayList.get(i11)).h < 1.0f) {
                        arrayList.remove(i11);
                        i11--;
                    }
                    i11++;
                }
            }
            f7 = 1.0f;
            float f112 = (lerp3 / 2.0f) * f7;
            canvas.save();
            if (cVar3.j) {
            }
            canvas.rotate(cVar3.k, lerp, lerp2);
            q5Var.setAlpha((int) (Utilities.clamp(cVar3.h / 0.2f, 1.0f, 0.0f) * f7 * 255.0f));
            q5Var.setBounds((int) (lerp - f112), (int) (lerp2 - f112), (int) (lerp + f112), (int) (lerp2 + f112));
            q5Var.draw(canvas);
            q5Var.setAlpha(255);
            canvas.restore();
            if (((c) arrayList.get(i11)).h < 1.0f) {
            }
            i11++;
        }
        canvas.restore();
        View view = this.d;
        if (view != null) {
            view.invalidate();
        }
        this.g = false;
    }

    public final boolean c() {
        return System.currentTimeMillis() - this.e > 2500;
    }

    public final void d(View view) {
        this.a.o(view);
        ImageReceiver imageReceiver = this.j;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
            imageReceiver.clearImage();
        }
    }

    public final void e(int i10, int i11, int i12, int i13) {
        Rect rect = this.b;
        rect.set(i10, i11, i12, i13);
        ImageReceiver imageReceiver = this.j;
        if (imageReceiver != null) {
            imageReceiver.setImageCoords(rect);
        }
    }

    public final void f(View view) {
        boolean z10;
        boolean z11;
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.Document document;
        boolean z12 = this.f;
        int i10 = this.h;
        q5 q5Var = this.a;
        q5Var.a(view);
        this.d = view;
        ImageReceiver imageReceiver = this.j;
        if (imageReceiver == null || !this.i) {
            return;
        }
        imageReceiver.onAttachedToWindow();
        TLRPC.Document document2 = q5Var.e;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document2, null);
        if (findAnimatedEmojiEmoticon == null || (tL_availableReaction = MediaDataController.getInstance(i10).getReactionsMap().get(findAnimatedEmojiEmoticon)) == null || (document = tL_availableReaction.around_animation) == null) {
            z10 = true;
            z11 = false;
        } else {
            if (z12) {
                StringBuilder sb2 = new StringBuilder();
                int i11 = m;
                m = i11 + 1;
                sb2.append(i11);
                sb2.append(" ");
                imageReceiver.setUniqKeyPrefix(sb2.toString());
                int f7 = dz.f();
                TLRPC.Document document3 = tL_availableReaction.around_animation;
                z10 = true;
                imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.around_animation), f7 + "_" + f7 + "_pcache_compress", null, null, document3, 0);
            } else {
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                String a2 = l0.a();
                TLRPC.Document document4 = tL_availableReaction.around_animation;
                z10 = true;
                imageReceiver.setImage(forDocument, a2, null, null, document4, 0);
            }
            z11 = true;
        }
        if (!z11) {
            String str = UserConfig.getInstance(i10).genericAnimationsStickerPack;
            if (str != null && (tL_messages_stickerSet = MediaDataController.getInstance(i10).getStickerSetByName(str)) == null) {
                tL_messages_stickerSet = MediaDataController.getInstance(i10).getStickerSetByEmojiOrName(str);
            }
            if (tL_messages_stickerSet != null) {
                if (this.k < 0) {
                    this.k = Math.abs(Utilities.fastRandom.nextInt() % tL_messages_stickerSet.documents.size());
                }
                if (z12) {
                    StringBuilder sb3 = new StringBuilder();
                    int i12 = m;
                    m = i12 + 1;
                    sb3.append(i12);
                    sb3.append(" ");
                    imageReceiver.setUniqKeyPrefix(sb3.toString());
                    int f10 = dz.f();
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_messages_stickerSet.documents.get(this.k)), f10 + "_" + f10 + "_pcache_compress", null, null, tL_messages_stickerSet.documents.get(this.k), 0);
                } else {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_messages_stickerSet.documents.get(this.k)), "60_60", null, null, tL_messages_stickerSet.documents.get(this.k), 0);
                }
                z11 = true;
            }
        }
        if (!z11) {
            imageReceiver.setImageBitmap(new yi0(R.raw.custom_emoji_reaction, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null));
            return;
        }
        if (imageReceiver.getLottieAnimation() != null) {
            imageReceiver.getLottieAnimation().N(0, false, z10);
        }
        imageReceiver.setAutoRepeat(0);
    }
}
