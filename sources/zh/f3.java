package zh;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.uw0;
import org.telegram.ui.Components.x20;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class f3 {
    public final ImageReceiver a;
    public int b;
    public StaticLayout c;
    public final TextPaint d;
    public f4 e;
    public final /* synthetic */ g3 f;

    public f3(g3 g3Var) {
        this.f = g3Var;
        ImageReceiver imageReceiver = new ImageReceiver(g3Var);
        this.a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(int i10) {
        g3 g3Var = this.f;
        ArrayList arrayList = g3Var.E;
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        this.e = (f4) arrayList.get(i10);
        boolean z10 = g3Var.v;
        ImageReceiver imageReceiver = this.a;
        if (z10) {
            imageReceiver.onAttachedToWindow();
        }
        f4 f4Var = this.e;
        TL_stories.StoryItem storyItem = f4Var.a;
        if (storyItem != null) {
            a6.x(imageReceiver, storyItem);
        } else {
            h5 h5Var = f4Var.b;
            x20[] x20VarArr = a6.a;
            if (h5Var.c.K) {
                imageReceiver.setImage(ImageLocation.getForPath(h5Var.f), "320_180", null, null, null, 0L, null, null, 0);
            } else {
                imageReceiver.setImage(ImageLocation.getForPath(h5Var.e), "320_180", null, null, null, 0L, null, null, 0);
            }
        }
        b();
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.e.a;
        g3 g3Var = this.f;
        if (storyItem != null) {
            g3.a(g3Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.c = null;
            return;
        }
        int i10 = (int) (g3Var.J + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c10 = uw0.c(spannableStringBuilder, textPaint, i10, alignment, 0.0f, false, null, ConnectionsManager.DEFAULT_DATACENTER_ID, 1, true);
        this.c = c10;
        if (c10.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            g3.a(g3Var, spannableStringBuilder2, this.e.a.views, true);
            this.c = uw0.c(spannableStringBuilder2, textPaint, (int) (g3Var.J + 1.0f), alignment, 0.0f, false, null, ConnectionsManager.DEFAULT_DATACENTER_ID, 2, true);
        }
    }
}
