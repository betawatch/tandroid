// default package

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class yl {
    public static int m;
    public wl a;
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

    public static yl a(wl wlVar, boolean z, boolean z2) {
        int i = yac.t0;
        yl ylVar = new yl();
        ylVar.b = new Rect();
        ylVar.c = new ArrayList();
        ylVar.g = true;
        ylVar.k = -1;
        ylVar.a = wlVar;
        ylVar.f = z;
        ylVar.h = i;
        ylVar.i = z2;
        ylVar.e = System.currentTimeMillis();
        if (z2 && i86.e(4112)) {
            ImageReceiver imageReceiver = new ImageReceiver(null);
            ylVar.j = imageReceiver;
            if (z) {
                imageReceiver.b = true;
            }
        }
        return ylVar;
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
                    xl xlVar = new xl(this);
                    xlVar.a();
                    arrayList.add(xlVar);
                    this.l = currentTimeMillis;
                }
            }
        } else if (this.g) {
            for (int i = 0; i < 7; i++) {
                xl xlVar2 = new xl(this);
                xlVar2.a();
                arrayList.add(xlVar2);
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
            xl xlVar3 = (xl) arrayList.get(i2);
            float min = (Math.min(40.0f, 1000.0f / hl.r) / xlVar3.i) + xlVar3.h;
            xlVar3.h = min;
            float i3 = Utilities.i(min, 1.0f, 0.0f);
            xlVar3.h = i3;
            k43 k43Var = k43.g;
            float interpolation = k43Var.getInterpolation(i3);
            float R1 = hl.R1(xlVar3.a, xlVar3.c, interpolation);
            yl ylVar = xlVar3.l;
            wl wlVar = ylVar.a;
            float f2 = xlVar3.h;
            float R12 = f2 < 0.3f ? hl.R1(xlVar3.b, xlVar3.d, k43Var.getInterpolation(f2 / 0.3f)) : hl.R1(xlVar3.d, xlVar3.e, k43.i.getInterpolation((f2 - 0.3f) / 0.7f));
            float R13 = hl.R1(xlVar3.f, xlVar3.g, interpolation);
            if (!ylVar.f) {
                float height = ylVar.b.height() * 0.8f;
                if (R12 > height) {
                    f = 1.0f - Utilities.i((R12 - height) / hl.L(16.0f), 1.0f, 0.0f);
                    float f3 = (R13 / 2.0f) * f;
                    canvas.save();
                    if (xlVar3.j) {
                        canvas.scale(-1.0f, 1.0f, R1, R12);
                    }
                    canvas.rotate(xlVar3.k, R1, R12);
                    wlVar.setAlpha((int) (Utilities.i(xlVar3.h / 0.2f, 1.0f, 0.0f) * f * 255.0f));
                    wlVar.setBounds((int) (R1 - f3), (int) (R12 - f3), (int) (R1 + f3), (int) (R12 + f3));
                    wlVar.draw(canvas);
                    wlVar.setAlpha(jn7.d4);
                    canvas.restore();
                    if (((xl) arrayList.get(i2)).h < 1.0f) {
                        arrayList.remove(i2);
                        i2--;
                    }
                    i2++;
                }
            }
            f = 1.0f;
            float f32 = (R13 / 2.0f) * f;
            canvas.save();
            if (xlVar3.j) {
            }
            canvas.rotate(xlVar3.k, R1, R12);
            wlVar.setAlpha((int) (Utilities.i(xlVar3.h / 0.2f, 1.0f, 0.0f) * f * 255.0f));
            wlVar.setBounds((int) (R1 - f32), (int) (R12 - f32), (int) (R1 + f32), (int) (R12 + f32));
            wlVar.draw(canvas);
            wlVar.setAlpha(jn7.d4);
            canvas.restore();
            if (((xl) arrayList.get(i2)).h < 1.0f) {
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
        wl wlVar = this.a;
        wlVar.b(view);
        this.d = view;
        ImageReceiver imageReceiver = this.j;
        if (imageReceiver == null || !this.i) {
            return;
        }
        imageReceiver.I();
        TLRPC.Document document2 = wlVar.e;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        String V = r47.V(document2, null, null);
        if (V == null || (tL_availableReaction = (TLRPC.TL_availableReaction) ls6.d0(i).r.get(V)) == null || (document = tL_availableReaction.around_animation) == null) {
            z = true;
            z2 = false;
        } else {
            if (z3) {
                StringBuilder sb = new StringBuilder();
                int i2 = m;
                m = i2 + 1;
                imageReceiver.w1 = uh9.l(sb, i2, " ");
                int f = tv3.f();
                TLRPC.Document document3 = tL_availableReaction.around_animation;
                z = true;
                imageReceiver.d0(jn5.b(tL_availableReaction.around_animation), f + "_" + f + "_pcache_compress", null, null, document3, 0);
            } else {
                jn5 b = jn5.b(document);
                String a = s49.a();
                TLRPC.Document document4 = tL_availableReaction.around_animation;
                z = true;
                imageReceiver.d0(b, a, null, null, document4, 0);
            }
            z2 = z;
        }
        if (!z2) {
            String str = yac.h(i).e0;
            if (str != null && (tL_messages_stickerSet = ls6.d0(i).q0(str)) == null) {
                tL_messages_stickerSet = ls6.d0(i).o0(str);
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
                    imageReceiver.w1 = uh9.l(sb2, i4, " ");
                    int f2 = tv3.f();
                    imageReceiver.d0(jn5.b(tL_messages_stickerSet.documents.get(this.k)), f2 + "_" + f2 + "_pcache_compress", null, null, tL_messages_stickerSet.documents.get(this.k), 0);
                } else {
                    imageReceiver.d0(jn5.b(tL_messages_stickerSet.documents.get(i3)), "60_60", null, null, tL_messages_stickerSet.documents.get(this.k), 0);
                }
                z2 = z;
            }
        }
        if (!z2) {
            imageReceiver.g0(new b29(R.raw.custom_emoji_reaction, hl.L(60.0f), hl.L(60.0f), false, null));
            return;
        }
        if (imageReceiver.y() != null) {
            imageReceiver.y().I(0, false, z);
        }
        imageReceiver.M(0);
    }
}
