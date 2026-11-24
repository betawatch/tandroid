// default package

import android.app.Activity;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class z31 extends ClickableSpan {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z31(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        int i;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((c41) obj).a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
            case 1:
                sf1 sf1Var = (sf1) obj;
                l11.u(sf1Var.getContext(), "https://fragment.com/username/" + ((tf1) sf1Var.N).e.r);
                break;
            case 2:
                ((vg1) obj).finishFragment();
                break;
            case 3:
                ((tv0) obj).run();
                break;
            case 4:
                c52 c52Var = (c52) obj;
                goc.M0(c52Var.n, c52Var.a, c52Var.getContext());
                break;
            case 5:
                s95 s95Var = (s95) obj;
                p95 p95Var = s95Var.J;
                if (p95Var != null && (groupCallMessage = s95Var.I) != null) {
                    ((k75) p95Var).a(groupCallMessage);
                    break;
                }
                break;
            case 6:
                ((ActionBarLayout) ((LaunchActivity) obj).N()).S(new PremiumPreviewFragment(0, "gift"));
                break;
            case 7:
                i46 i46Var = ((a46) obj).c;
                do0.D0(i46Var.r1, i46Var.J0, i46Var.V1, null);
                break;
            case 8:
                ((zf6) obj).p(false);
                break;
            case 9:
                break;
            case 10:
                ((l9b) obj).S1.S();
                break;
            default:
                rrc rrcVar = (rrc) obj;
                Activity parentActivity = rrcVar.getParentActivity();
                i = ((d) rrcVar).currentAccount;
                goc.M0(i, rrcVar.getResourceProvider(), parentActivity);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 1:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 2:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 3:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 4:
                textPaint.setColor(cmb.v0(cmb.Ei, ((c52) obj).a));
                textPaint.setUnderlineText(false);
                break;
            case 5:
                break;
            case 6:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 7:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                int i = cmb.Wc;
                i46 i46Var = ((a46) obj).c;
                int i2 = i46.R2;
                textPaint.setColor(cmb.v0(i, i46Var.J0));
                break;
            case 8:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 9:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((yj8) obj).p2;
                if (num != null) {
                    textPaint.setColor(num.intValue());
                    break;
                }
                break;
            case 10:
                textPaint.setUnderlineText(false);
                break;
            default:
                textPaint.setColor(((rrc) obj).getThemedColor(cmb.Ei));
                textPaint.setUnderlineText(false);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(TextPaint textPaint) {
    }
}
