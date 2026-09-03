package vh;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.p70;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w5 b;

    public /* synthetic */ o5(w5 w5Var, int i10) {
        this.a = i10;
        this.b = w5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Set<String> languages;
        switch (this.a) {
            case 0:
                w5 w5Var = this.b;
                a aVar = w5Var.x;
                if (aVar != null && aVar.e) {
                    boolean z4 = !aVar.f;
                    aVar.f = z4;
                    ((CheckBoxBase) w5Var.e.b).f(-1, z4, true);
                    t5 t5Var = w5Var.y;
                    if (t5Var != null) {
                        a aVar2 = w5Var.x;
                        boolean z10 = aVar2.f;
                        s3 s3Var = ((b3) t5Var).a;
                        aVar2.f = z10;
                        d2 d2Var = s3Var.G3;
                        if (d2Var != null) {
                            d2Var.d();
                            s3Var.G3.h();
                            break;
                        }
                    }
                }
                break;
            default:
                w5 w5Var2 = this.b;
                t5 t5Var2 = w5Var2.y;
                if (t5Var2 != null) {
                    a aVar3 = w5Var2.x;
                    s3 s3Var2 = ((b3) t5Var2).a;
                    if (aVar3 != null && (aVar3.b instanceof TL_iv.pageBlockPreformatted) && (languages = CodeHighlighting.getLanguages()) != null) {
                        ArrayList arrayList = new ArrayList(languages);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.b;
                        p70 C = s3Var2.e3.C(view);
                        C.W(j6.b0(AndroidUtilities.dp(3.0f), j6.v0(j6.d6, s3Var2.d3)));
                        C.Z = true;
                        C.X = AndroidUtilities.dp(350.0f);
                        C.i(new k2(s3Var2, aVar3, 25), LocaleController.getString(R.string.ArticleNone), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            C.i(null, MessageObject.TextLayoutBlock.capitalizeLanguage(pageblockpreformatted.language), true);
                        }
                        C.k();
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            String str = (String) obj;
                            C.i(new tf.k1(s3Var2, aVar3, str, 11), MessageObject.TextLayoutBlock.capitalizeLanguage(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        C.Z();
                        break;
                    }
                }
                break;
        }
    }
}
