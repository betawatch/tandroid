package sg;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.d20;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.sc;
import org.telegram.messenger.ui;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.gr;
import org.telegram.ui.ly;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d {
    public static int m;
    public f5 a;
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

    public static d a(f5 f5Var, boolean z10, boolean z11) {
        int i10 = d20.s0;
        d dVar = new d();
        dVar.b = new Rect();
        dVar.c = new ArrayList();
        dVar.g = true;
        dVar.k = -1;
        dVar.a = f5Var;
        dVar.f = z10;
        dVar.h = i10;
        dVar.i = z11;
        dVar.e = System.currentTimeMillis();
        if (z11 && sc.e(4112)) {
            ImageReceiver imageReceiver = new ImageReceiver(null);
            dVar.j = imageReceiver;
            if (z10) {
                imageReceiver.b = true;
            }
        }
        return dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018b A[SYNTHETIC] */
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
                long j10 = currentTimeMillis - this.e;
                if (j10 < 1500 && j10 > 200 && currentTimeMillis - this.l > 50 && ((int) Utilities.c.nextLong()) % 6 == 0) {
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
        if (imageReceiver != null && this.i && (imageReceiver.B() == null || !imageReceiver.B().A())) {
            if (z10) {
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
        int i11 = 0;
        while (i11 < arrayList.size()) {
            c cVar3 = (c) arrayList.get(i11);
            float min = (Math.min(40.0f, 1000.0f / org.telegram.messenger.i0.r) / cVar3.i) + cVar3.h;
            cVar3.h = min;
            float i12 = Utilities.i(min, 1.0f, 0.0f);
            cVar3.h = i12;
            gr grVar = gr.g;
            float interpolation = grVar.getInterpolation(i12);
            float T1 = org.telegram.messenger.i0.T1(cVar3.a, cVar3.c, interpolation);
            d dVar = cVar3.l;
            f5 f5Var = dVar.a;
            float f10 = cVar3.h;
            float T12 = f10 < 0.3f ? org.telegram.messenger.i0.T1(cVar3.b, cVar3.d, grVar.getInterpolation(f10 / 0.3f)) : org.telegram.messenger.i0.T1(cVar3.d, cVar3.e, gr.i.getInterpolation((f10 - 0.3f) / 0.7f));
            float T13 = org.telegram.messenger.i0.T1(cVar3.f, cVar3.g, interpolation);
            if (!dVar.f) {
                float height = dVar.b.height() * 0.8f;
                if (T12 > height) {
                    f7 = 1.0f - Utilities.i((T12 - height) / org.telegram.messenger.i0.L(16.0f), 1.0f, 0.0f);
                    float f11 = (T13 / 2.0f) * f7;
                    canvas.save();
                    if (cVar3.j) {
                        canvas.scale(-1.0f, 1.0f, T1, T12);
                    }
                    canvas.rotate(cVar3.k, T1, T12);
                    f5Var.setAlpha((int) (Utilities.i(cVar3.h / 0.2f, 1.0f, 0.0f) * f7 * 255.0f));
                    f5Var.setBounds((int) (T1 - f11), (int) (T12 - f11), (int) (T1 + f11), (int) (T12 + f11));
                    f5Var.draw(canvas);
                    f5Var.setAlpha(zs.e4);
                    canvas.restore();
                    if (((c) arrayList.get(i11)).h < 1.0f) {
                        arrayList.remove(i11);
                        i11--;
                    }
                    i11++;
                }
            }
            f7 = 1.0f;
            float f112 = (T13 / 2.0f) * f7;
            canvas.save();
            if (cVar3.j) {
            }
            canvas.rotate(cVar3.k, T1, T12);
            f5Var.setAlpha((int) (Utilities.i(cVar3.h / 0.2f, 1.0f, 0.0f) * f7 * 255.0f));
            f5Var.setBounds((int) (T1 - f112), (int) (T12 - f112), (int) (T1 + f112), (int) (T12 + f112));
            f5Var.draw(canvas);
            f5Var.setAlpha(zs.e4);
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
        this.a.n(view);
        ImageReceiver imageReceiver = this.j;
        if (imageReceiver != null) {
            imageReceiver.R();
            imageReceiver.f();
        }
    }

    public final void e(int i10, int i11, int i12, int i13) {
        Rect rect = this.b;
        rect.set(i10, i11, i12, i13);
        ImageReceiver imageReceiver = this.j;
        if (imageReceiver != null) {
            imageReceiver.z0(rect);
        }
    }

    public final void f(View view) {
        boolean z10;
        boolean z11;
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.Document document;
        boolean z12 = this.f;
        int i10 = this.h;
        f5 f5Var = this.a;
        f5Var.a(view);
        this.d = view;
        ImageReceiver imageReceiver = this.j;
        if (imageReceiver == null || !this.i) {
            return;
        }
        imageReceiver.P();
        TLRPC.Document document2 = f5Var.e;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        String V = jj.V(document2, null, null);
        if (V == null || (tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(i10).r.get(V)) == null || (document = tL_availableReaction.around_animation) == null) {
            z10 = true;
            z11 = false;
        } else {
            if (z12) {
                StringBuilder sb2 = new StringBuilder();
                int i11 = m;
                m = i11 + 1;
                imageReceiver.v1 = a1.g.p(sb2, i11, " ");
                int f7 = ly.f();
                TLRPC.Document document3 = tL_availableReaction.around_animation;
                z10 = true;
                imageReceiver.q0(ic.b(tL_availableReaction.around_animation), f7 + "_" + f7 + "_pcache_compress", null, null, document3, 0);
            } else {
                ic b10 = ic.b(document);
                String a2 = k0.a();
                TLRPC.Document document4 = tL_availableReaction.around_animation;
                z10 = true;
                imageReceiver.q0(b10, a2, null, null, document4, 0);
            }
            z11 = z10;
        }
        if (!z11) {
            String str = d20.i(i10).d0;
            if (str != null && (tL_messages_stickerSet = ui.b0(i10).p0(str)) == null) {
                tL_messages_stickerSet = ui.b0(i10).n0(str);
            }
            if (tL_messages_stickerSet != null) {
                if (this.k < 0) {
                    this.k = Math.abs(((int) Utilities.c.nextLong()) % tL_messages_stickerSet.documents.size());
                }
                if (z12) {
                    StringBuilder sb3 = new StringBuilder();
                    int i12 = m;
                    m = i12 + 1;
                    imageReceiver.v1 = a1.g.p(sb3, i12, " ");
                    int f10 = ly.f();
                    imageReceiver.q0(ic.b(tL_messages_stickerSet.documents.get(this.k)), f10 + "_" + f10 + "_pcache_compress", null, null, tL_messages_stickerSet.documents.get(this.k), 0);
                } else {
                    imageReceiver.q0(ic.b(tL_messages_stickerSet.documents.get(this.k)), "60_60", null, null, tL_messages_stickerSet.documents.get(this.k), 0);
                }
                z11 = z10;
            }
        }
        if (!z11) {
            imageReceiver.w0(new bi0(R.raw.custom_emoji_reaction, org.telegram.messenger.i0.L(60.0f), org.telegram.messenger.i0.L(60.0f), false, null));
            return;
        }
        if (imageReceiver.B() != null) {
            imageReceiver.B().N(0, false, z10);
        }
        imageReceiver.W(0);
    }
}
