package zg;

import ai.l4;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import j$.util.Objects;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.o5;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class g0 {
    public final ImageReceiver a;
    public o5 b;
    public p0 e;
    public View f;
    public boolean g;
    public boolean i;
    public int j;
    public PorterDuffColorFilter k;
    public final Rect c = new Rect();
    public final int d = UserConfig.selectedAccount;
    public float h = 1.0f;

    public g0(View view) {
        this.f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
    }

    public final void a(Canvas canvas) {
        o5 o5Var = this.b;
        Rect rect = this.c;
        if (o5Var != null) {
            l4 l4Var = o5Var.k;
            if (l4Var != null) {
                l4Var.setRoundRadius((int) (rect.width() * 0.1f));
            }
            this.b.setColorFilter(this.k);
            this.b.setBounds(rect);
            this.b.setAlpha((int) (this.h * 255.0f));
            this.b.draw(canvas);
            return;
        }
        float f7 = rect.left;
        float f10 = rect.top;
        float width = rect.width();
        float height = rect.height();
        ImageReceiver imageReceiver = this.a;
        imageReceiver.setImageCoords(f7, f10, width, height);
        imageReceiver.setAlpha(this.h);
        imageReceiver.draw(canvas);
    }

    public final void b(boolean z10) {
        this.g = z10;
        ImageReceiver imageReceiver = this.a;
        if (z10) {
            imageReceiver.onAttachedToWindow();
            o5 o5Var = this.b;
            if (o5Var != null) {
                o5Var.a(this.f);
                return;
            }
            return;
        }
        imageReceiver.onDetachedFromWindow();
        o5 o5Var2 = this.b;
        if (o5Var2 != null) {
            o5Var2.o(this.f);
        }
    }

    public final void c(Rect rect) {
        this.c.set(rect);
    }

    public final void d(int i10) {
        if (this.j != i10) {
            this.j = i10;
            this.k = new PorterDuffColorFilter(this.j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(p0 p0Var) {
        if (Objects.equals(this.e, p0Var)) {
            return;
        }
        ImageReceiver imageReceiver = this.a;
        imageReceiver.clearImage();
        o5 o5Var = this.b;
        if (o5Var != null) {
            o5Var.o(this.f);
            this.b = null;
        }
        this.e = p0Var;
        boolean z10 = this.i;
        String str = z10 ? "60_60_firstframe" : "60_60";
        if (p0Var.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.d).getReactionsMap().get(p0Var.f);
            if (tL_availableReaction != null) {
                imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), str, null, null, DocumentObject.getSvgThumb(tL_availableReaction.select_animation, j6.m6, 0.2f), 0L, "tgs", p0Var, 0);
                return;
            }
            return;
        }
        o5 o5Var2 = new o5(z10 ? 13 : 1, UserConfig.selectedAccount, p0Var.g);
        this.b = o5Var2;
        if (this.g) {
            o5Var2.a(this.f);
        }
        o5 o5Var3 = this.b;
        this.j = -16777216;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
        this.k = porterDuffColorFilter;
        o5Var3.setColorFilter(porterDuffColorFilter);
    }
}
