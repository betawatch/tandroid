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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class r21 extends ClickableSpan {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r21(Object obj, byte b) {
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
                ((u21) obj).a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
            case 1:
                ke1 ke1Var = (ke1) obj;
                d01.t(ke1Var.getContext(), "https://fragment.com/username/" + ((le1) ke1Var.N).e.r);
                break;
            case 2:
                ((nf1) obj).finishFragment();
                break;
            case 3:
                ((fv0) obj).run();
                break;
            case 4:
                r32 r32Var = (r32) obj;
                hmc.L0(r32Var.n, r32Var.a, r32Var.getContext());
                break;
            case 5:
                t75 t75Var = (t75) obj;
                q75 q75Var = t75Var.J;
                if (q75Var != null && (groupCallMessage = t75Var.I) != null) {
                    ((m55) q75Var).a(groupCallMessage);
                    break;
                }
                break;
            case 6:
                ((ActionBarLayout) ((LaunchActivity) obj).N()).S(new PremiumPreviewFragment(0, "gift"));
                break;
            case 7:
                h26 h26Var = ((z16) obj).c;
                dn0.D0(h26Var.r1, h26Var.J0, h26Var.V1, null);
                break;
            case 8:
                ((ae6) obj).p(false);
                break;
            case 9:
                break;
            case 10:
                ((j7b) obj).S1.S();
                break;
            default:
                qpc qpcVar = (qpc) obj;
                Activity parentActivity = qpcVar.getParentActivity();
                i = ((d) qpcVar).currentAccount;
                hmc.L0(i, qpcVar.getResourceProvider(), parentActivity);
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
                textPaint.setColor(bkb.v0(bkb.Ei, ((r32) obj).a));
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
                int i = bkb.Wc;
                h26 h26Var = ((z16) obj).c;
                int i2 = h26.R2;
                textPaint.setColor(bkb.v0(i, h26Var.J0));
                break;
            case 8:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 9:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((xh8) obj).p2;
                if (num != null) {
                    textPaint.setColor(num.intValue());
                    break;
                }
                break;
            case 10:
                textPaint.setUnderlineText(false);
                break;
            default:
                textPaint.setColor(((qpc) obj).getThemedColor(bkb.Ei));
                textPaint.setUnderlineText(false);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(TextPaint textPaint) {
    }
}
