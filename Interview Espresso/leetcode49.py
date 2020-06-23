def groupAnagram(strs): 
	ht = {}
	for string in strs:
		# ss = sorted(string)
		# ''.join()
		ss = ''.join(sorted(string))
		if ss in ht:
			ht[ss].append(string)
		else:
			ht[ss] = [string]
	return ht.values()