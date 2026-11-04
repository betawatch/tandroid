package pi;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import cg.n0;
import org.telegram.messenger.g0;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class b {
    public final RenderNode e;
    public final RenderNode f;
    public final RenderNode g;
    public final RenderNode h;
    public final RenderNode i;
    public ColorFilter j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public float s;
    public float t;
    public int u;
    public int v;
    public int w;
    public int x;
    public final RectF a = new RectF();
    public final Rect b = new Rect();
    public final RectF c = new RectF();
    public final RectF d = new RectF();
    public int q = 1;
    public final RectF r = new RectF();

    public b(int i3) {
        RenderNode renderNode = new RenderNode("cap-" + i3);
        this.e = renderNode;
        renderNode.setUseCompositingLayer(true, null);
        RenderNode renderNode2 = new RenderNode("glass-" + i3);
        this.f = renderNode2;
        renderNode2.setRenderEffect(n0.d());
        this.g = new RenderNode("glass-frosted-" + i3);
        RenderNode renderNode3 = new RenderNode("filtered-" + i3);
        this.h = renderNode3;
        renderNode3.setRenderEffect(RenderEffect.createColorFilterEffect(d.v));
        this.i = new RenderNode("frosted-filtered-" + i3);
    }

    public final RenderNode a(int i3) {
        int c2 = o1.g.c(i3);
        if (c2 == 0) {
            return this.e;
        }
        if (c2 == 1) {
            return this.f;
        }
        if (c2 == 2) {
            return this.g;
        }
        if (c2 == 3) {
            return this.i;
        }
        throw new IllegalArgumentException("Unknown source index: ".concat(f1.F(i3)));
    }

    public final void b(int i3, int i10, int i11) {
        if (this.o != i3) {
            this.o = i3;
            float N = g0.N(7.0f);
            float max = N <= 0.0f ? 0.0f : Math.max(0.0f, ((((N * 0.57735f) + 0.5f) / i3) - 0.5f) / 0.57735f);
            this.s = max;
            this.e.setRenderEffect(RenderEffect.createBlurEffect(max, max, Shader.TileMode.CLAMP));
        }
        if (this.p != i10) {
            this.p = i10;
            float N2 = g0.N(36.0f);
            float max2 = N2 > 0.0f ? Math.max(0.0f, ((((N2 * 0.57735f) + 0.5f) / i10) - 0.5f) / 0.57735f) : 0.0f;
            this.t = max2;
            RenderNode renderNode = this.g;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(max2, max2, tileMode));
            RenderNode renderNode2 = this.i;
            float f10 = this.t;
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(f10, f10, tileMode));
        }
        this.q = i11;
    }

    public final void c(ColorMatrixColorFilter colorMatrixColorFilter) {
        if (this.j != colorMatrixColorFilter) {
            this.j = colorMatrixColorFilter;
            RenderNode renderNode = this.h;
            if (colorMatrixColorFilter == null) {
                colorMatrixColorFilter = d.v;
            }
            renderNode.setRenderEffect(RenderEffect.createColorFilterEffect(colorMatrixColorFilter));
        }
    }
}
