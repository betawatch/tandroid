package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ti0 extends org.telegram.ui.Components.yk0 {
    public final Context c;
    public final /* synthetic */ vi0 d;

    public ti0(vi0 vi0Var, Context context) {
        this.d = vi0Var;
        this.c = context;
    }

    @Override // f2.q0
    public final void A(f2.o1 o1Var) {
        View view = o1Var.a;
        if (view instanceof org.telegram.ui.Cells.y4) {
            ((org.telegram.ui.Cells.y4) view).a();
        }
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        if (o1Var.f == 0) {
            return ((org.telegram.ui.Cells.y4) o1Var.a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override // f2.q0
    public final int h() {
        return this.d.M;
    }

    @Override // f2.q0
    public final int j(int i10) {
        vi0 vi0Var = this.d;
        if (vi0Var.N.contains(Integer.valueOf(i10))) {
            return 1;
        }
        if (i10 == vi0Var.D || i10 == vi0Var.K) {
            return 2;
        }
        if (i10 == vi0Var.G) {
            return 3;
        }
        if (i10 == vi0Var.H) {
            return 4;
        }
        if (i10 == vi0Var.J) {
            return 5;
        }
        if (i10 == vi0Var.L) {
            return 6;
        }
        return i10 == vi0Var.I ? 7 : 0;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        String str;
        String format;
        TLRPC.User user;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = o1Var.f;
        View view = o1Var.a;
        vi0 vi0Var = this.d;
        if (i15 == 0) {
            org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
            int i16 = vi0Var.E;
            MessageObject messageObject = (i10 < i16 || i10 >= vi0Var.F) ? null : (MessageObject) vi0Var.x.get(i10 - i16);
            long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
            if (messageObject.isStory()) {
                TLObject user2 = DialogObject.isUserDialog(dialogId) ? vi0Var.getMessagesController().getUser(Long.valueOf(dialogId)) : vi0Var.getMessagesController().getChat(Long.valueOf(-dialogId));
                TL_stories.StoryViews storyViews = messageObject.storyItem.views;
                y4Var.b(user2, null, (storyViews == null || (i11 = storyViews.views_count) == 0) ? LocaleController.getString(R.string.NoViews) : LocaleController.formatPluralString("Views", i11, new Object[0]), i10 != vi0Var.F - 1);
                TL_stories.StoryItem storyItem = messageObject.storyItem;
                u70 u70Var = new u70(10, this, messageObject);
                y4Var.r = storyItem;
                y4Var.a.setOnClickListener(u70Var);
                return;
            }
            y4Var.r = null;
            y4Var.a.setOnClickListener(null);
            if (DialogObject.isUserDialog(dialogId)) {
                user = vi0Var.getMessagesController().getUser(Long.valueOf(dialogId));
                str = null;
            } else {
                TLRPC.Chat chat = vi0Var.getMessagesController().getChat(Long.valueOf(-dialogId));
                if (!ChatObject.isChannel(chat) || chat.megagroup) {
                    int i17 = chat.participants_count;
                    if (i17 != 0) {
                        format = String.format("%1$s, %2$s", LocaleController.formatPluralString("Members", i17, new Object[0]), LocaleController.formatPluralString("Views", messageObject.messageOwner.views, new Object[0]));
                    } else {
                        str = null;
                        user = chat;
                    }
                } else {
                    format = LocaleController.formatPluralString("Views", messageObject.messageOwner.views, new Object[0]);
                }
                str = format;
                user = chat;
            }
            if (user != null) {
                y4Var.b(user, null, str, i10 != vi0Var.F - 1);
                return;
            }
            return;
        }
        if (i15 == 1) {
            view.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(this.c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
            return;
        }
        if (i15 == 2) {
            org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
            if (i10 == vi0Var.K) {
                j4Var.setTopMargin(9);
                j4Var.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                j4Var.setText(LocaleController.formatString("StatisticOverview", R.string.StatisticOverview, new Object[0]));
                return;
            } else {
                j4Var.setTopMargin(11);
                j4Var.setPadding(0, 0, 0, 0);
                j4Var.setText(LocaleController.formatString("PublicShares", R.string.PublicShares, new Object[0]));
                return;
            }
        }
        if (i15 == 4) {
            a91 a91Var = (a91) view;
            a91Var.e(vi0Var.r, false);
            a91Var.setLayoutParams(new f2.y0(-1, -2));
            return;
        }
        if (i15 != 5) {
            if (i15 != 7) {
                return;
            }
            a91 a91Var2 = (a91) view;
            a91Var2.e(vi0Var.s, false);
            a91Var2.setLayoutParams(new f2.y0(-1, -2));
            return;
        }
        ui0 ui0Var = (ui0) view;
        TextView[] textViewArr = ui0Var.a;
        TextView[] textViewArr2 = ui0Var.b;
        vi0 vi0Var2 = ui0Var.c;
        n91 n91Var = vi0Var2.a0;
        MessageObject messageObject2 = vi0Var2.n;
        if (n91Var != null) {
            i13 = n91Var.d();
            i12 = n91Var.a();
            i14 = n91Var.c();
        } else {
            int i18 = messageObject2.isStory() ? messageObject2.storyItem.views.views_count : messageObject2.messageOwner.views;
            i12 = messageObject2.isStory() ? messageObject2.storyItem.views.forwards_count : messageObject2.messageOwner.forwards;
            if (messageObject2.isStory()) {
                int i19 = messageObject2.storyItem.views.reactions_count;
                i13 = i18;
                i14 = i19;
            } else if (messageObject2.messageOwner.reactions != null) {
                int i20 = 0;
                for (int i21 = 0; i21 < messageObject2.messageOwner.reactions.results.size(); i21++) {
                    i20 += messageObject2.messageOwner.reactions.results.get(i21).count;
                }
                i13 = i18;
                i14 = i20;
            } else {
                i13 = i18;
                i14 = 0;
            }
        }
        textViewArr[0].setText(AndroidUtilities.formatWholeNumber(i13, 0));
        textViewArr2[0].setText(LocaleController.getString(R.string.StatisticViews));
        textViewArr[1].setText(AndroidUtilities.formatWholeNumber(vi0Var2.Q, 0));
        textViewArr2[1].setText(LocaleController.formatString("PublicShares", R.string.PublicShares, new Object[0]));
        textViewArr[2].setText(AndroidUtilities.formatWholeNumber(i14, 0));
        textViewArr2[2].setText(LocaleController.formatString("Reactions", R.string.Reactions, new Object[0]));
        TLRPC.ChatFull chatFull = vi0Var2.a;
        if (chatFull != null && (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && i14 == 0) {
            ((ViewGroup) textViewArr2[2].getParent()).setVisibility(8);
        }
        textViewArr[3].setText(AndroidUtilities.formatWholeNumber(Math.max(0, i12 - vi0Var2.Q), 0));
        textViewArr2[3].setText(LocaleController.formatString("PrivateShares", R.string.PrivateShares, new Object[0]));
        ui0Var.a();
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    @Override // f2.q0
    public final f2.o1 x(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r12v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */
}
