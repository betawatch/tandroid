package th;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ic;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.u10;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e3 {
    public final ImageReceiver a;
    public int b;
    public StaticLayout c;
    public final TextPaint d;
    public e4 e;
    public final /* synthetic */ f3 f;

    public e3(f3 f3Var) {
        this.f = f3Var;
        ImageReceiver imageReceiver = new ImageReceiver(f3Var);
        this.a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.z1 = true;
        imageReceiver.J0(org.telegram.messenger.i0.L(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
    }

    public final void a(int i10) {
        f3 f3Var = this.f;
        ArrayList arrayList = f3Var.E;
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        this.e = (e4) arrayList.get(i10);
        boolean z10 = f3Var.w;
        ImageReceiver imageReceiver = this.a;
        if (z10) {
            imageReceiver.P();
        }
        e4 e4Var = this.e;
        TL_stories.StoryItem storyItem = e4Var.a;
        if (storyItem != null) {
            w5.x(imageReceiver, storyItem);
        } else {
            d5 d5Var = e4Var.b;
            u10[] u10VarArr = w5.a;
            if (d5Var.c.K) {
                imageReceiver.r0(ic.g(d5Var.f), "320_180", null, null, null, 0L, null, null, 0);
            } else {
                imageReceiver.r0(ic.g(d5Var.e), "320_180", null, null, null, 0L, null, null, 0);
            }
        }
        b();
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.e.a;
        f3 f3Var = this.f;
        if (storyItem != null) {
            f3.a(f3Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.c = null;
            return;
        }
        int i10 = (int) (f3Var.J + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c10 = ov0.c(spannableStringBuilder, textPaint, i10, alignment, 0.0f, null, ConnectionsManager.DEFAULT_DATACENTER_ID, 1, true);
        this.c = c10;
        if (c10.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            f3.a(f3Var, spannableStringBuilder2, this.e.a.views, true);
            this.c = ov0.c(spannableStringBuilder2, textPaint, (int) (f3Var.J + 1.0f), alignment, 0.0f, null, ConnectionsManager.DEFAULT_DATACENTER_ID, 2, true);
        }
    }
}
