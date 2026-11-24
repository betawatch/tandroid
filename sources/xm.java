// default package

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xm {
    public static int m;
    public vm a;
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

    public static xm a(vm vmVar, boolean z, boolean z2) {
        int i = z8c.t0;
        xm xmVar = new xm();
        xmVar.b = new Rect();
        xmVar.c = new ArrayList();
        xmVar.g = true;
        xmVar.k = -1;
        xmVar.a = vmVar;
        xmVar.f = z;
        xmVar.h = i;
        xmVar.i = z2;
        xmVar.e = System.currentTimeMillis();
        if (z2 && e86.e(4112)) {
            ImageReceiver imageReceiver = new ImageReceiver(null);
            xmVar.j = imageReceiver;
            if (z) {
                imageReceiver.b = true;
            }
        }
        return xmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas) {
        float f;
        Rect rect = this.b;
        ImageReceiver imageReceiver = this.j;
        ArrayList arrayList = this.c;
        boolean z = this.f;
        if (z) {
            long currentTimeMillis = System.currentTimeMillis();
            if (arrayList.size() < 12) {
                long j = currentTimeMillis - this.e;
                if (j < 1500 && j > 200 && currentTimeMillis - this.l > 50 && ((int) Utilities.c.nextLong()) % 6 == 0) {
                    wm wmVar = new wm(this);
                    wmVar.a();
                    arrayList.add(wmVar);
                    this.l = currentTimeMillis;
                }
            }
        } else if (this.g) {
            for (int i = 0; i < 7; i++) {
                wm wmVar2 = new wm(this);
                wmVar2.a();
                arrayList.add(wmVar2);
            }
        }
        if (imageReceiver != null && this.i && (imageReceiver.y() == null || !imageReceiver.y().v())) {
            if (z) {
                canvas.save();
                canvas.translate(rect.width() / 3.0f, 0.0f);
                imageReceiver.h(canvas, null);
                canvas.restore();
            } else {
                imageReceiver.h(canvas, null);
            }
        }
        canvas.save();
        canvas.translate(rect.left, rect.top);
        int i2 = 0;
        while (i2 < arrayList.size()) {
            wm wmVar3 = (wm) arrayList.get(i2);
            float min = (Math.min(40.0f, 1000.0f / gm.r) / wmVar3.i) + wmVar3.h;
            wmVar3.h = min;
            float i3 = Utilities.i(min, 1.0f, 0.0f);
            wmVar3.h = i3;
            d53 d53Var = d53.g;
            float interpolation = d53Var.getInterpolation(i3);
            float R1 = gm.R1(wmVar3.a, wmVar3.c, interpolation);
            xm xmVar = wmVar3.l;
            vm vmVar = xmVar.a;
            float f2 = wmVar3.h;
            float R12 = f2 < 0.3f ? gm.R1(wmVar3.b, wmVar3.d, d53Var.getInterpolation(f2 / 0.3f)) : gm.R1(wmVar3.d, wmVar3.e, d53.i.getInterpolation((f2 - 0.3f) / 0.7f));
            float R13 = gm.R1(wmVar3.f, wmVar3.g, interpolation);
            if (!xmVar.f) {
                float height = xmVar.b.height() * 0.8f;
                if (R12 > height) {
                    f = 1.0f - Utilities.i((R12 - height) / gm.L(16.0f), 1.0f, 0.0f);
                    float f3 = (R13 / 2.0f) * f;
                    canvas.save();
                    if (wmVar3.j) {
                        canvas.scale(-1.0f, 1.0f, R1, R12);
                    }
                    canvas.rotate(wmVar3.k, R1, R12);
                    vmVar.setAlpha((int) (Utilities.i(wmVar3.h / 0.2f, 1.0f, 0.0f) * f * 255.0f));
                    vmVar.setBounds((int) (R1 - f3), (int) (R12 - f3), (int) (R1 + f3), (int) (R12 + f3));
                    vmVar.draw(canvas);
                    vmVar.setAlpha(nm7.d4);
                    canvas.restore();
                    if (((wm) arrayList.get(i2)).h < 1.0f) {
                        arrayList.remove(i2);
                        i2--;
                    }
                    i2++;
                }
            }
            f = 1.0f;
            float f32 = (R13 / 2.0f) * f;
            canvas.save();
            if (wmVar3.j) {
            }
            canvas.rotate(wmVar3.k, R1, R12);
            vmVar.setAlpha((int) (Utilities.i(wmVar3.h / 0.2f, 1.0f, 0.0f) * f * 255.0f));
            vmVar.setBounds((int) (R1 - f32), (int) (R12 - f32), (int) (R1 + f32), (int) (R12 + f32));
            vmVar.draw(canvas);
            vmVar.setAlpha(nm7.d4);
            canvas.restore();
            if (((wm) arrayList.get(i2)).h < 1.0f) {
            }
            i2++;
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
            imageReceiver.K();
            imageReceiver.f();
        }
    }

    public final void e(int i, int i2, int i3, int i4) {
        Rect rect = this.b;
        rect.set(i, i2, i3, i4);
        ImageReceiver imageReceiver = this.j;
        if (imageReceiver != null) {
            imageReceiver.j0(rect);
        }
    }

    public final void f(View view) {
        boolean z;
        boolean z2;
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.Document document;
        boolean z3 = this.f;
        int i = this.h;
        vm vmVar = this.a;
        vmVar.b(view);
        this.d = view;
        ImageReceiver imageReceiver = this.j;
        if (imageReceiver == null || !this.i) {
            return;
        }
        imageReceiver.I();
        TLRPC.Document document2 = vmVar.e;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        String V = k47.V(document2, null, null);
        if (V == null || (tL_availableReaction = (TLRPC.TL_availableReaction) hs6.d0(i).r.get(V)) == null || (document = tL_availableReaction.around_animation) == null) {
            z = true;
            z2 = false;
        } else {
            if (z3) {
                StringBuilder sb = new StringBuilder();
                int i2 = m;
                m = i2 + 1;
                imageReceiver.w1 = hg9.k(sb, i2, " ");
                int f = kw3.f();
                TLRPC.Document document3 = tL_availableReaction.around_animation;
                z = true;
                imageReceiver.d0(gn5.b(tL_availableReaction.around_animation), f + "_" + f + "_pcache_compress", null, null, document3, 0);
            } else {
                gn5 b = gn5.b(document);
                String a = g39.a();
                TLRPC.Document document4 = tL_availableReaction.around_animation;
                z = true;
                imageReceiver.d0(b, a, null, null, document4, 0);
            }
            z2 = z;
        }
        if (!z2) {
            String str = z8c.h(i).e0;
            if (str != null && (tL_messages_stickerSet = hs6.d0(i).q0(str)) == null) {
                tL_messages_stickerSet = hs6.d0(i).o0(str);
            }
            if (tL_messages_stickerSet != null) {
                int i3 = this.k;
                if (i3 < 0) {
                    i3 = Math.abs(((int) Utilities.c.nextLong()) % tL_messages_stickerSet.documents.size());
                    this.k = i3;
                }
                if (z3) {
                    StringBuilder sb2 = new StringBuilder();
                    int i4 = m;
                    m = i4 + 1;
                    imageReceiver.w1 = hg9.k(sb2, i4, " ");
                    int f2 = kw3.f();
                    imageReceiver.d0(gn5.b(tL_messages_stickerSet.documents.get(this.k)), f2 + "_" + f2 + "_pcache_compress", null, null, tL_messages_stickerSet.documents.get(this.k), 0);
                } else {
                    imageReceiver.d0(gn5.b(tL_messages_stickerSet.documents.get(i3)), "60_60", null, null, tL_messages_stickerSet.documents.get(this.k), 0);
                }
                z2 = z;
            }
        }
        if (!z2) {
            imageReceiver.g0(new p09(R.raw.custom_emoji_reaction, gm.L(60.0f), gm.L(60.0f), false, null));
            return;
        }
        if (imageReceiver.y() != null) {
            imageReceiver.y().I(0, false, z);
        }
        imageReceiver.M(0);
    }
}
