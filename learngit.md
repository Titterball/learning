�ύ��
git add file1 file2����
git commit -m"message of the file"

�����汾�⣺
mkdir learngit�������汾�⣩
cd learngit  ���ǰ����Ŀ¼ת�Ƶ�learngit��
pwd    �������ǰ����Ŀ¼��·����
git init ����ʼ������Ŀ¼��Ϊ�ɹ����Ĳֿ⣩
ls   ��list files�г��ļ����ж�����
cat readme.txt���鿴readme�ı������ݣ�
git status ���鿴��ǰ�汾��״̬��

 �汾���ˣ�
git log  ���鿴��ʷ��¼��־����git log --pretty=oneline�������
git reset --hard HEAD^(HEADΪ��ǰ�汾��HEAD^Ϊ��һ�汾��HEAD^^
        Ϊ�������汾����HEAD~100Ϊ��100���汾��
git reset --hard  1094a(1094aΪ�汾�ţ�
git reflog  (��¼��ÿһ�����
git diff file  (�鿴�ļ��޸���ʲô��

�޸ģ�
git checkout -- file(����file�ڹ��������޸ģ��ص����һ��add��commit״̬��
git reset HEAD file(���԰��ݴ������޸��˻ص���������

ɾ����
rm file(ɾ���������ļ���
git rm file(�Ӱ汾����ɾ���ļ���
git checkout -- file(ɾ���˹������ļ����Ѱ汾����ļ���ԭ����������

Զ�ֿ̲⣺
ssh-keygen -t rsa -C "youremail@example.com"  (����SSH KEY��
git remote add origin git@github.com:MyGitHubName/learngit.git
(�ѱ��زֿ���Զ�ֿ̲������learngitΪ���زֿ����֣�originΪԶ�ֿ̲�Ĭ������
git push -u origin master  (-u�ѵ�ǰ��֧master���͵�Զ�̲���Զ�̵�master      �������Ժ�������ʱ���Լ�������git push origin master)
git clone git@github.com:MyGitHubName/learngit.git  (��Զ�ֿ̲��¡      learngit�ֿ⵽���أ�

��֧��
git branch dev(�½���֧dev��
git checkout dev (�л�����֧dev)
git checkout -b dev (�½����л�����֧dev,�൱��������������ϲ���
git branch (�鿴��ǰ��֧,���г����з�֧��
git merge dev���ϲ�dev��֧����ǰ��֧��ͨ��Ϊ��fast forwardģʽ����
git merge --no-ff -m"message" dev����ʹ��"ffģʽ"�ϲ���
git branch -d dev(ɾ��dev��֧��
git branch -D dev(ǿ��ɾ��dev��֧��
git stash �����ص�ǰ��������
git stash list ���鿴stash���ݣ�
git stash apply (��stash���ݻָ���
git stash drop (��stash����ɾ����
git stash pop (��stash���ݻָ�ͬʱɾ��stash���ݣ�����������������ϲ���
git pull����Զ�̷�֧ץȡ�����ϲ���
git branch --set-upstream-to=origin/<branch-name> <branch-name>
   (��Զ�̷�֧�ͱ��ط�֧�������ӣ�
git rebase ���ֲ��ֱ�ߡ�����

��ǩ��
git tag <name>(����ǰ��֧�������ύ��commit���ϱ�ǩ��
git tag ���鿴���б�ǩ��
git tag <name> f52c623(��ָ������f52c623commit���ϱ�ǩ��
git show <tagname> (�鿴��ǩ��Ϣ��
git push origin <tagname>(����һ�����ر�ǩ��
git push origin --tags���������б��ر�ǩ��
git tag -d <tagname> (ɾ��һ�����ر�ǩ��
git push origin :refs/tags/<tagname> (ɾ��һ��Զ�̱�ǩ��

