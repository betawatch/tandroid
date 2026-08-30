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
import org.telegram.ui.Components.o70;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v5 b;

    public /* synthetic */ n5(v5 v5Var, int i10) {
        this.a = i10;
        this.b = v5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Set<String> languages;
        switch (this.a) {
            case 0:
                v5 v5Var = this.b;
                a aVar = v5Var.x;
                if (aVar != null && aVar.e) {
                    boolean z4 = !aVar.f;
                    aVar.f = z4;
                    ((CheckBoxBase) v5Var.e.b).f(-1, z4, true);
                    s5 s5Var = v5Var.y;
                    if (s5Var != null) {
                        a aVar2 = v5Var.x;
                        boolean z10 = aVar2.f;
                        r3 r3Var = ((a3) s5Var).a;
                        aVar2.f = z10;
                        c2 c2Var = r3Var.G3;
                        if (c2Var != null) {
                            c2Var.d();
                            r3Var.G3.h();
                            break;
                        }
                    }
                }
                break;
            default:
                v5 v5Var2 = this.b;
                s5 s5Var2 = v5Var2.y;
                if (s5Var2 != null) {
                    a aVar3 = v5Var2.x;
                    r3 r3Var2 = ((a3) s5Var2).a;
                    if (aVar3 != null && (aVar3.b instanceof TL_iv.pageBlockPreformatted) && (languages = CodeHighlighting.getLanguages()) != null) {
                        ArrayList arrayList = new ArrayList(languages);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.b;
                        o70 C = r3Var2.e3.C(view);
                        C.W(j6.b0(AndroidUtilities.dp(3.0f), j6.v0(j6.d6, r3Var2.d3)));
                        C.Z = true;
                        C.X = AndroidUtilities.dp(350.0f);
                        C.i(new j2(r3Var2, aVar3, 25), LocaleController.getString(R.string.ArticleNone), TextUtils.isEmpty(pageblockpreformatted.language));
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
                            C.i(new tf.h1(r3Var2, aVar3, str, 12), MessageObject.TextLayoutBlock.capitalizeLanguage(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        C.Z();
                        break;
                    }
                }
                break;
        }
    }
}
